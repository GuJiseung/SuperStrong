package y;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import x.d;
/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f6742f;

    /* renamed from: g  reason: collision with root package name */
    public final Constructor<?> f6743g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f6744h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f6745i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f6746j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f6747k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f6748l;

    public h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = m(cls);
            method3 = n(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = o(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f6742f = cls;
        this.f6743g = constructor;
        this.f6744h = method2;
        this.f6745i = method3;
        this.f6746j = method4;
        this.f6747k = method;
        this.f6748l = method5;
    }

    public static Method m(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method n(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // y.f, y.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i6) {
        Object obj;
        d.C0099d[] c0099dArr;
        FontVariationAxis[] fromFontVariationSettings;
        if (!l()) {
            return super.a(context, cVar, resources, i6);
        }
        try {
            obj = this.f6743g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0099d c0099d : cVar.f6614a) {
            String str = c0099d.f6615a;
            int i7 = c0099d.f6619e;
            int i8 = c0099d.f6616b;
            boolean z5 = c0099d.f6617c;
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0099d.f6618d);
            if (!i(context, obj, str, i7, i8, z5 ? 1 : 0, fromFontVariationSettings)) {
                try {
                    this.f6747k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!k(obj)) {
            return null;
        }
        return j(obj);
    }

    @Override // y.f, y.l
    public final Typeface b(Context context, c0.m[] mVarArr, int i6) {
        Object obj;
        Typeface j5;
        boolean z5;
        if (mVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            c0.m f6 = f(i6, mVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f6.f2723a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f6.f2725c).setItalic(f6.f2726d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (c0.m mVar : mVarArr) {
            if (mVar.f2727e == 0) {
                Uri uri = mVar.f2723a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, m.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f6743g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = mVarArr.length;
        int i7 = 0;
        boolean z6 = false;
        while (true) {
            Method method = this.f6747k;
            if (i7 < length) {
                c0.m mVar2 = mVarArr[i7];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mVar2.f2723a);
                if (byteBuffer != null) {
                    try {
                        z5 = ((Boolean) this.f6745i.invoke(obj, byteBuffer, Integer.valueOf(mVar2.f2724b), null, Integer.valueOf(mVar2.f2725c), Integer.valueOf(mVar2.f2726d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z5 = false;
                    }
                    if (!z5) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                            return null;
                        }
                    }
                    z6 = true;
                }
                i7++;
                z6 = z6;
            } else if (!z6) {
                try {
                    method.invoke(obj, new Object[0]);
                    return null;
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                    return null;
                }
            } else if (!k(obj) || (j5 = j(obj)) == null) {
                return null;
            } else {
                return Typeface.create(j5, i6);
            }
        }
    }

    @Override // y.l
    public final Typeface d(Context context, Resources resources, int i6, String str, int i7) {
        Object obj;
        if (!l()) {
            return super.d(context, resources, i6, str, i7);
        }
        try {
            obj = this.f6743g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f6747k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!k(obj)) {
            return null;
        } else {
            return j(obj);
        }
    }

    public final boolean i(Context context, Object obj, String str, int i6, int i7, int i8, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f6744h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f6742f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f6748l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f6746j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        Method method = this.f6744h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public Method o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
