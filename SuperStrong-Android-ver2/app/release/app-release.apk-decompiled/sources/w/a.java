package w;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.WeakHashMap;
import x.f;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f6573a = new Object();

    /* renamed from: w.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0098a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i6) {
            return context.getDrawable(i6);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Context context, int i6) {
            return context.getColor(i6);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    public static ColorStateList a(Context context, int i6) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.d dVar = new f.d(resources, theme);
        synchronized (f.f6629c) {
            SparseArray<f.c> sparseArray = f.f6628b.get(dVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i6)) != null) {
                if (cVar.f6631b.equals(resources.getConfiguration()) && ((theme == null && cVar.f6632c == 0) || (theme != null && cVar.f6632c == theme.hashCode()))) {
                    colorStateList2 = cVar.f6630a;
                } else {
                    sparseArray.remove(i6);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal<TypedValue> threadLocal = f.f6627a;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z5 = true;
            resources.getValue(i6, typedValue, true);
            int i7 = typedValue.type;
            if (!((i7 < 28 || i7 > 31) ? false : false)) {
                try {
                    colorStateList = x.b.a(resources, resources.getXml(i6), theme);
                } catch (Exception e6) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e6);
                }
            }
            if (colorStateList != null) {
                synchronized (f.f6629c) {
                    WeakHashMap<f.d, SparseArray<f.c>> weakHashMap = f.f6628b;
                    SparseArray<f.c> sparseArray2 = weakHashMap.get(dVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray<>();
                        weakHashMap.put(dVar, sparseArray2);
                    }
                    sparseArray2.append(i6, new f.c(colorStateList, dVar.f6633a.getConfiguration(), theme));
                }
                return colorStateList;
            }
            return f.b.b(resources, i6, theme);
        }
        return colorStateList2;
    }
}
