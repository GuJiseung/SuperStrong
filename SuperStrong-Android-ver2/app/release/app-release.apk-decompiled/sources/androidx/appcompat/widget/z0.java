package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.j;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: g  reason: collision with root package name */
    public static z0 f1016g;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, l.i<ColorStateList>> f1018a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap<Context, l.e<WeakReference<Drawable.ConstantState>>> f1019b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1020c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1021d;

    /* renamed from: e  reason: collision with root package name */
    public b f1022e;

    /* renamed from: f  reason: collision with root package name */
    public static final PorterDuff.Mode f1015f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h  reason: collision with root package name */
    public static final a f1017h = new a();

    /* loaded from: classes.dex */
    public static class a extends l.f<Integer, PorterDuffColorFilter> {
        public a() {
            super(6);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public static synchronized z0 c() {
        z0 z0Var;
        synchronized (z0.class) {
            if (f1016g == null) {
                f1016g = new z0();
            }
            z0Var = f1016g;
        }
        return z0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter a6;
        synchronized (z0.class) {
            a aVar = f1017h;
            aVar.getClass();
            int i7 = (i6 + 31) * 31;
            a6 = aVar.a(Integer.valueOf(mode.hashCode() + i7));
            if (a6 == null) {
                a6 = new PorterDuffColorFilter(i6, mode);
                aVar.getClass();
                aVar.b(Integer.valueOf(mode.hashCode() + i7), a6);
            }
        }
        return a6;
    }

    public final synchronized void a(Context context, long j5, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            l.e<WeakReference<Drawable.ConstantState>> eVar = this.f1019b.get(context);
            if (eVar == null) {
                eVar = new l.e<>();
                this.f1019b.put(context, eVar);
            }
            eVar.f(j5, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(android.content.Context r12, int r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z0.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable d(Context context, long j5) {
        l.e<WeakReference<Drawable.ConstantState>> eVar = this.f1019b.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.d(j5, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.g(j5);
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i6) {
        return f(context, i6, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        z.a.b.i(r12, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z0.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList h(Context context, int i6) {
        ColorStateList colorStateList;
        l.i<ColorStateList> iVar;
        try {
            WeakHashMap<Context, l.i<ColorStateList>> weakHashMap = this.f1018a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (iVar = weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) iVar.c(i6, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                b bVar = this.f1022e;
                if (bVar != null) {
                    colorStateList2 = ((j.a) bVar).c(context, i6);
                }
                if (colorStateList2 != null) {
                    if (this.f1018a == null) {
                        this.f1018a = new WeakHashMap<>();
                    }
                    l.i<ColorStateList> iVar2 = this.f1018a.get(context);
                    if (iVar2 == null) {
                        iVar2 = new l.i<>();
                        this.f1018a.put(context, iVar2);
                    }
                    iVar2.a(i6, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.z0$b r0 = r6.f1022e
            r1 = 0
            if (r0 == 0) goto L70
            androidx.appcompat.widget.j$a r0 = (androidx.appcompat.widget.j.a) r0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.j.f796b
            int[] r3 = r0.f799a
            boolean r3 = androidx.appcompat.widget.j.a.a(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L17
            r8 = 2130968810(0x7f0400ea, float:1.7546284E38)
            goto L4a
        L17:
            int[] r3 = r0.f801c
            boolean r3 = androidx.appcompat.widget.j.a.a(r3, r8)
            if (r3 == 0) goto L23
            r8 = 2130968808(0x7f0400e8, float:1.754628E38)
            goto L4a
        L23:
            int[] r0 = r0.f802d
            boolean r0 = androidx.appcompat.widget.j.a.a(r0, r8)
            if (r0 == 0) goto L2e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L47
        L2e:
            r0 = 2131230798(0x7f08004e, float:1.8077659E38)
            if (r8 != r0) goto L42
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L52
        L42:
            r0 = 2131230780(0x7f08003c, float:1.8077622E38)
            if (r8 != r0) goto L4d
        L47:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L4a:
            r0 = r8
            r8 = r4
            goto L4f
        L4d:
            r8 = r1
            r0 = r8
        L4f:
            r3 = r2
            r2 = r0
            r0 = r5
        L52:
            if (r8 == 0) goto L6c
            int[] r8 = androidx.appcompat.widget.p0.f875a
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = androidx.appcompat.widget.e1.c(r7, r2)
            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.c(r7, r3)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L6a
            r8.setAlpha(r0)
        L6a:
            r7 = r4
            goto L6d
        L6c:
            r7 = r1
        L6d:
            if (r7 == 0) goto L70
            r1 = r4
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z0.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
