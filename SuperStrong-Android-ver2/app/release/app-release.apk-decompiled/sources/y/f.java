package y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import x.d;
/* loaded from: classes.dex */
public class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f6733a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor<?> f6734b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Method f6735c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f6736d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f6737e = false;

    public static boolean g(Object obj, String str, int i6, boolean z5) {
        h();
        try {
            return ((Boolean) f6735c.invoke(obj, str, Integer.valueOf(i6), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f6737e) {
            return;
        }
        f6737e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f6734b = constructor;
        f6733a = cls;
        f6735c = method2;
        f6736d = method;
    }

    @Override // y.l
    public Typeface a(Context context, d.c cVar, Resources resources, int i6) {
        d.C0099d[] c0099dArr;
        h();
        try {
            Object newInstance = f6734b.newInstance(new Object[0]);
            for (d.C0099d c0099d : cVar.f6614a) {
                File d6 = m.d(context);
                if (d6 == null) {
                    return null;
                }
                try {
                    if (!m.b(d6, resources, c0099d.f6620f)) {
                        return null;
                    }
                    if (!g(newInstance, d6.getPath(), c0099d.f6616b, c0099d.f6617c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d6.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f6733a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f6736d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // y.l
    public Typeface b(Context context, c0.m[] mVarArr, int i6) {
        File file;
        String readlink;
        if (mVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(i6, mVarArr).f2723a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface c6 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c6;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c62 = c(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return c62;
        } catch (IOException unused2) {
            return null;
        }
    }
}
