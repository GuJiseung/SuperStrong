package y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import x.d;
/* loaded from: classes.dex */
public class l {

    /* loaded from: classes.dex */
    public interface a<T> {
        int a(T t5);

        boolean b(T t5);
    }

    public l() {
        new ConcurrentHashMap();
    }

    public static <T> T e(T[] tArr, int i6, a<T> aVar) {
        int i7 = (i6 & 1) == 0 ? 400 : 700;
        boolean z5 = (i6 & 2) != 0;
        T t5 = null;
        int i8 = Integer.MAX_VALUE;
        for (T t6 : tArr) {
            int abs = (Math.abs(aVar.a(t6) - i7) * 2) + (aVar.b(t6) == z5 ? 0 : 1);
            if (t5 == null || i8 > abs) {
                t5 = t6;
                i8 = abs;
            }
        }
        return t5;
    }

    public Typeface a(Context context, d.c cVar, Resources resources, int i6) {
        throw null;
    }

    public Typeface b(Context context, c0.m[] mVarArr, int i6) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d6 = m.d(context);
        if (d6 == null) {
            return null;
        }
        try {
            if (m.c(d6, inputStream)) {
                return Typeface.createFromFile(d6.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d6.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i6, String str, int i7) {
        File d6 = m.d(context);
        if (d6 == null) {
            return null;
        }
        try {
            if (m.b(d6, resources, i6)) {
                return Typeface.createFromFile(d6.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d6.delete();
        }
    }

    public c0.m f(int i6, c0.m[] mVarArr) {
        return (c0.m) e(mVarArr, i6, new k());
    }
}
