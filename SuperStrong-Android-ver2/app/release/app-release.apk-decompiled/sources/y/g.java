package y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import x.d;
/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f6738a;

    /* renamed from: b  reason: collision with root package name */
    public static final Constructor<?> f6739b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f6740c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f6741d;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi24Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f6739b = constructor;
        f6738a = cls;
        f6740c = method2;
        f6741d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i6, int i7, boolean z5) {
        try {
            return ((Boolean) f6740c.invoke(obj, byteBuffer, Integer.valueOf(i6), null, Integer.valueOf(i7), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // y.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i6) {
        Object obj;
        d.C0099d[] c0099dArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f6739b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0099d c0099d : cVar.f6614a) {
            int i7 = c0099d.f6620f;
            File d6 = m.d(context);
            if (d6 != null) {
                try {
                    if (m.b(d6, resources, i7)) {
                        try {
                            fileInputStream = new FileInputStream(d6);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !g(obj, mappedByteBuffer, c0099d.f6619e, c0099d.f6616b, c0099d.f6617c)) {
                                return null;
                            }
                        } finally {
                            break;
                        }
                    }
                } finally {
                    d6.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f6738a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f6741d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // y.l
    public final Typeface b(Context context, c0.m[] mVarArr, int i6) {
        Object obj;
        Typeface typeface;
        try {
            obj = f6739b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        l.h hVar = new l.h();
        for (c0.m mVar : mVarArr) {
            Uri uri = mVar.f2723a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = m.e(context, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !g(obj, byteBuffer, mVar.f2724b, mVar.f2725c, mVar.f2726d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f6738a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f6741d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i6);
    }
}
