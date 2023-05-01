package x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import x.f;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f6627a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f6628b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f6629c = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i6, Resources.Theme theme) {
            return resources.getDrawable(i6, theme);
        }

        public static Drawable b(Resources resources, int i6, int i7, Resources.Theme theme) {
            return resources.getDrawableForDensity(i6, i7, theme);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static int a(Resources resources, int i6, Resources.Theme theme) {
            return resources.getColor(i6, theme);
        }

        public static ColorStateList b(Resources resources, int i6, Resources.Theme theme) {
            return resources.getColorStateList(i6, theme);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f6630a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f6631b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6632c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f6630a = colorStateList;
            this.f6631b = configuration;
            this.f6632c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f6633a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f6634b;

        public d(Resources resources, Resources.Theme theme) {
            this.f6633a = resources;
            this.f6634b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f6633a.equals(dVar.f6633a) && e0.b.a(this.f6634b, dVar.f6634b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return e0.b.b(this.f6633a, this.f6634b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public final void a(final int i6) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: x.h
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.c(i6);
                }
            });
        }

        public final void b(final Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: x.g
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.d(typeface);
                }
            });
        }

        public abstract void c(int i6);

        public abstract void d(Typeface typeface);
    }

    public static Typeface a(Context context, int i6) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i6, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
        if (r19 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r19 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        r19.a(-3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, x.f.e r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.f.b(android.content.Context, int, android.util.TypedValue, int, x.f$e, boolean, boolean):android.graphics.Typeface");
    }
}
