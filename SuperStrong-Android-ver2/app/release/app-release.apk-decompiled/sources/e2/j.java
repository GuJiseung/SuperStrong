package e2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f3832a = "0123456789abcdef".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f3833b = new char[64];

    /* renamed from: c  reason: collision with root package name */
    public static volatile Handler f3834c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3835a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f3835a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3835a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3835a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f3835a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3835a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(int i6, int i7, Bitmap.Config config) {
        int i8 = i6 * i7;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i9 = a.f3835a[config.ordinal()];
        int i10 = 1;
        if (i9 != 1) {
            i10 = 2;
            if (i9 != 2 && i9 != 3) {
                i10 = 4;
                if (i9 == 4) {
                    i10 = 8;
                }
            }
        }
        return i8 * i10;
    }

    @TargetApi(19)
    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static ArrayList d(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler e() {
        if (f3834c == null) {
            synchronized (j.class) {
                if (f3834c == null) {
                    f3834c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f3834c;
    }

    public static int f(int i6, Object obj) {
        return (i6 * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static boolean g(int i6, int i7) {
        if (i6 > 0 || i6 == Integer.MIN_VALUE) {
            return i7 > 0 || i7 == Integer.MIN_VALUE;
        }
        return false;
    }
}
