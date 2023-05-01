package f0;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import f0.g0;
import f0.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: b  reason: collision with root package name */
    public static final x0 f3920b;

    /* renamed from: a  reason: collision with root package name */
    public final k f3921a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f3922a;

        /* renamed from: b  reason: collision with root package name */
        public static final Field f3923b;

        /* renamed from: c  reason: collision with root package name */
        public static final Field f3924c;

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f3925d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3922a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3923b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3924c = declaredField3;
                declaredField3.setAccessible(true);
                f3925d = true;
            } catch (ReflectiveOperationException e6) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e6.getMessage(), e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: c  reason: collision with root package name */
        public static Field f3926c = null;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f3927d = false;

        /* renamed from: e  reason: collision with root package name */
        public static Constructor<WindowInsets> f3928e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f3929f = false;

        /* renamed from: a  reason: collision with root package name */
        public WindowInsets f3930a;

        /* renamed from: b  reason: collision with root package name */
        public y.b f3931b;

        public b() {
            this.f3930a = e();
        }

        public b(x0 x0Var) {
            super(x0Var);
            this.f3930a = x0Var.f();
        }

        private static WindowInsets e() {
            if (!f3927d) {
                try {
                    f3926c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
                }
                f3927d = true;
            }
            Field field = f3926c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
                }
            }
            if (!f3929f) {
                try {
                    f3928e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e8);
                }
                f3929f = true;
            }
            Constructor<WindowInsets> constructor = f3928e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e9);
                }
            }
            return null;
        }

        @Override // f0.x0.e
        public x0 b() {
            a();
            x0 g2 = x0.g(this.f3930a, null);
            k kVar = g2.f3921a;
            kVar.o(null);
            kVar.q(this.f3931b);
            return g2;
        }

        @Override // f0.x0.e
        public void c(y.b bVar) {
            this.f3931b = bVar;
        }

        @Override // f0.x0.e
        public void d(y.b bVar) {
            WindowInsets windowInsets = this.f3930a;
            if (windowInsets != null) {
                this.f3930a = windowInsets.replaceSystemWindowInsets(bVar.f6723a, bVar.f6724b, bVar.f6725c, bVar.f6726d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsets.Builder f3932a;

        public c() {
            this.f3932a = new WindowInsets.Builder();
        }

        public c(x0 x0Var) {
            super(x0Var);
            WindowInsets f6 = x0Var.f();
            this.f3932a = f6 != null ? new WindowInsets.Builder(f6) : new WindowInsets.Builder();
        }

        @Override // f0.x0.e
        public x0 b() {
            WindowInsets build;
            a();
            build = this.f3932a.build();
            x0 g2 = x0.g(build, null);
            g2.f3921a.o(null);
            return g2;
        }

        @Override // f0.x0.e
        public void c(y.b bVar) {
            this.f3932a.setStableInsets(bVar.c());
        }

        @Override // f0.x0.e
        public void d(y.b bVar) {
            this.f3932a.setSystemWindowInsets(bVar.c());
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        public d(x0 x0Var) {
            super(x0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public e() {
            this(new x0());
        }

        public e(x0 x0Var) {
        }

        public final void a() {
        }

        public x0 b() {
            throw null;
        }

        public void c(y.b bVar) {
            throw null;
        }

        public void d(y.b bVar) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f3933h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f3934i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f3935j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f3936k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f3937l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f3938c;

        /* renamed from: d  reason: collision with root package name */
        public y.b[] f3939d;

        /* renamed from: e  reason: collision with root package name */
        public y.b f3940e;

        /* renamed from: f  reason: collision with root package name */
        public x0 f3941f;

        /* renamed from: g  reason: collision with root package name */
        public y.b f3942g;

        public f(x0 x0Var, WindowInsets windowInsets) {
            super(x0Var);
            this.f3940e = null;
            this.f3938c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private y.b r(int i6, boolean z5) {
            y.b bVar = y.b.f6722e;
            for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                if ((i6 & i7) != 0) {
                    y.b s = s(i7, z5);
                    bVar = y.b.a(Math.max(bVar.f6723a, s.f6723a), Math.max(bVar.f6724b, s.f6724b), Math.max(bVar.f6725c, s.f6725c), Math.max(bVar.f6726d, s.f6726d));
                }
            }
            return bVar;
        }

        private y.b t() {
            x0 x0Var = this.f3941f;
            if (x0Var != null) {
                return x0Var.f3921a.h();
            }
            return y.b.f6722e;
        }

        private y.b u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3933h) {
                    v();
                }
                Method method = f3934i;
                if (method != null && f3935j != null && f3936k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3936k.get(f3937l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return y.b.a(rect.left, rect.top, rect.right, rect.bottom);
                    } catch (ReflectiveOperationException e6) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void v() {
            try {
                f3934i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3935j = cls;
                f3936k = cls.getDeclaredField("mVisibleInsets");
                f3937l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3936k.setAccessible(true);
                f3937l.setAccessible(true);
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
            }
            f3933h = true;
        }

        @Override // f0.x0.k
        public void d(View view) {
            y.b u = u(view);
            if (u == null) {
                u = y.b.f6722e;
            }
            w(u);
        }

        @Override // f0.x0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3942g, ((f) obj).f3942g);
            }
            return false;
        }

        @Override // f0.x0.k
        public y.b f(int i6) {
            return r(i6, false);
        }

        @Override // f0.x0.k
        public final y.b j() {
            if (this.f3940e == null) {
                WindowInsets windowInsets = this.f3938c;
                this.f3940e = y.b.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f3940e;
        }

        @Override // f0.x0.k
        public x0 l(int i6, int i7, int i8, int i9) {
            e bVar;
            x0 g2 = x0.g(this.f3938c, null);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                bVar = new d(g2);
            } else if (i10 >= 29) {
                bVar = new c(g2);
            } else {
                bVar = new b(g2);
            }
            bVar.d(x0.e(j(), i6, i7, i8, i9));
            bVar.c(x0.e(h(), i6, i7, i8, i9));
            return bVar.b();
        }

        @Override // f0.x0.k
        public boolean n() {
            return this.f3938c.isRound();
        }

        @Override // f0.x0.k
        public void o(y.b[] bVarArr) {
            this.f3939d = bVarArr;
        }

        @Override // f0.x0.k
        public void p(x0 x0Var) {
            this.f3941f = x0Var;
        }

        public y.b s(int i6, boolean z5) {
            int i7;
            f0.j e6;
            int i8;
            int i9;
            int i10;
            int i11 = 0;
            if (i6 != 1) {
                y.b bVar = null;
                if (i6 != 2) {
                    y.b bVar2 = y.b.f6722e;
                    if (i6 != 8) {
                        if (i6 != 16) {
                            if (i6 != 32) {
                                if (i6 != 64) {
                                    if (i6 != 128) {
                                        return bVar2;
                                    }
                                    x0 x0Var = this.f3941f;
                                    if (x0Var != null) {
                                        e6 = x0Var.f3921a.e();
                                    } else {
                                        e6 = e();
                                    }
                                    if (e6 != null) {
                                        int i12 = Build.VERSION.SDK_INT;
                                        DisplayCutout displayCutout = e6.f3899a;
                                        if (i12 >= 28) {
                                            i8 = j.a.d(displayCutout);
                                        } else {
                                            i8 = 0;
                                        }
                                        if (i12 >= 28) {
                                            i9 = j.a.f(displayCutout);
                                        } else {
                                            i9 = 0;
                                        }
                                        if (i12 >= 28) {
                                            i10 = j.a.e(displayCutout);
                                        } else {
                                            i10 = 0;
                                        }
                                        if (i12 >= 28) {
                                            i11 = j.a.c(displayCutout);
                                        }
                                        return y.b.a(i8, i9, i10, i11);
                                    }
                                    return bVar2;
                                }
                                return k();
                            }
                            return g();
                        }
                        return i();
                    }
                    y.b[] bVarArr = this.f3939d;
                    if (bVarArr != null) {
                        bVar = bVarArr[3];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    y.b j5 = j();
                    y.b t5 = t();
                    int i13 = j5.f6726d;
                    if (i13 > t5.f6726d) {
                        return y.b.a(0, 0, 0, i13);
                    }
                    y.b bVar3 = this.f3942g;
                    if (bVar3 != null && !bVar3.equals(bVar2) && (i7 = this.f3942g.f6726d) > t5.f6726d) {
                        return y.b.a(0, 0, 0, i7);
                    }
                    return bVar2;
                } else if (z5) {
                    y.b t6 = t();
                    y.b h6 = h();
                    return y.b.a(Math.max(t6.f6723a, h6.f6723a), 0, Math.max(t6.f6725c, h6.f6725c), Math.max(t6.f6726d, h6.f6726d));
                } else {
                    y.b j6 = j();
                    x0 x0Var2 = this.f3941f;
                    if (x0Var2 != null) {
                        bVar = x0Var2.f3921a.h();
                    }
                    int i14 = j6.f6726d;
                    if (bVar != null) {
                        i14 = Math.min(i14, bVar.f6726d);
                    }
                    return y.b.a(j6.f6723a, 0, j6.f6725c, i14);
                }
            } else if (z5) {
                return y.b.a(0, Math.max(t().f6724b, j().f6724b), 0, 0);
            } else {
                return y.b.a(0, j().f6724b, 0, 0);
            }
        }

        public void w(y.b bVar) {
            this.f3942g = bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public y.b f3943m;

        public g(x0 x0Var, WindowInsets windowInsets) {
            super(x0Var, windowInsets);
            this.f3943m = null;
        }

        @Override // f0.x0.k
        public x0 b() {
            return x0.g(this.f3938c.consumeStableInsets(), null);
        }

        @Override // f0.x0.k
        public x0 c() {
            return x0.g(this.f3938c.consumeSystemWindowInsets(), null);
        }

        @Override // f0.x0.k
        public final y.b h() {
            if (this.f3943m == null) {
                WindowInsets windowInsets = this.f3938c;
                this.f3943m = y.b.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f3943m;
        }

        @Override // f0.x0.k
        public boolean m() {
            return this.f3938c.isConsumed();
        }

        @Override // f0.x0.k
        public void q(y.b bVar) {
            this.f3943m = bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(x0 x0Var, WindowInsets windowInsets) {
            super(x0Var, windowInsets);
        }

        @Override // f0.x0.k
        public x0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f3938c.consumeDisplayCutout();
            return x0.g(consumeDisplayCutout, null);
        }

        @Override // f0.x0.k
        public f0.j e() {
            DisplayCutout displayCutout;
            displayCutout = this.f3938c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new f0.j(displayCutout);
        }

        @Override // f0.x0.f, f0.x0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return Objects.equals(this.f3938c, hVar.f3938c) && Objects.equals(this.f3942g, hVar.f3942g);
            }
            return false;
        }

        @Override // f0.x0.k
        public int hashCode() {
            return this.f3938c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        public y.b f3944n;

        /* renamed from: o  reason: collision with root package name */
        public y.b f3945o;

        /* renamed from: p  reason: collision with root package name */
        public y.b f3946p;

        public i(x0 x0Var, WindowInsets windowInsets) {
            super(x0Var, windowInsets);
            this.f3944n = null;
            this.f3945o = null;
            this.f3946p = null;
        }

        @Override // f0.x0.k
        public y.b g() {
            Insets mandatorySystemGestureInsets;
            if (this.f3945o == null) {
                mandatorySystemGestureInsets = this.f3938c.getMandatorySystemGestureInsets();
                this.f3945o = y.b.b(mandatorySystemGestureInsets);
            }
            return this.f3945o;
        }

        @Override // f0.x0.k
        public y.b i() {
            Insets systemGestureInsets;
            if (this.f3944n == null) {
                systemGestureInsets = this.f3938c.getSystemGestureInsets();
                this.f3944n = y.b.b(systemGestureInsets);
            }
            return this.f3944n;
        }

        @Override // f0.x0.k
        public y.b k() {
            Insets tappableElementInsets;
            if (this.f3946p == null) {
                tappableElementInsets = this.f3938c.getTappableElementInsets();
                this.f3946p = y.b.b(tappableElementInsets);
            }
            return this.f3946p;
        }

        @Override // f0.x0.f, f0.x0.k
        public x0 l(int i6, int i7, int i8, int i9) {
            WindowInsets inset;
            inset = this.f3938c.inset(i6, i7, i8, i9);
            return x0.g(inset, null);
        }

        @Override // f0.x0.g, f0.x0.k
        public void q(y.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final x0 f3947q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f3947q = x0.g(windowInsets, null);
        }

        public j(x0 x0Var, WindowInsets windowInsets) {
            super(x0Var, windowInsets);
        }

        @Override // f0.x0.f, f0.x0.k
        public final void d(View view) {
        }

        @Override // f0.x0.f, f0.x0.k
        public y.b f(int i6) {
            Insets insets;
            insets = this.f3938c.getInsets(l.a(i6));
            return y.b.b(insets);
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final x0 f3948b;

        /* renamed from: a  reason: collision with root package name */
        public final x0 f3949a;

        static {
            e bVar;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                bVar = new d();
            } else if (i6 >= 29) {
                bVar = new c();
            } else {
                bVar = new b();
            }
            f3948b = bVar.b().f3921a.a().f3921a.b().f3921a.c();
        }

        public k(x0 x0Var) {
            this.f3949a = x0Var;
        }

        public x0 a() {
            return this.f3949a;
        }

        public x0 b() {
            return this.f3949a;
        }

        public x0 c() {
            return this.f3949a;
        }

        public void d(View view) {
        }

        public f0.j e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (n() == kVar.n() && m() == kVar.m() && e0.b.a(j(), kVar.j()) && e0.b.a(h(), kVar.h()) && e0.b.a(e(), kVar.e())) {
                return true;
            }
            return false;
        }

        public y.b f(int i6) {
            return y.b.f6722e;
        }

        public y.b g() {
            return j();
        }

        public y.b h() {
            return y.b.f6722e;
        }

        public int hashCode() {
            return e0.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public y.b i() {
            return j();
        }

        public y.b j() {
            return y.b.f6722e;
        }

        public y.b k() {
            return j();
        }

        public x0 l(int i6, int i7, int i8, int i9) {
            return f3948b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(y.b[] bVarArr) {
        }

        public void p(x0 x0Var) {
        }

        public void q(y.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class l {
        public static int a(int i6) {
            int statusBars;
            int i7 = 0;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i6 & i8) != 0) {
                    if (i8 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i8 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i8 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i8 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i8 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i8 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i8 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i8 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i7 |= statusBars;
                }
            }
            return i7;
        }
    }

    static {
        f3920b = Build.VERSION.SDK_INT >= 30 ? j.f3947q : k.f3948b;
    }

    public x0() {
        this.f3921a = new k(this);
    }

    public x0(WindowInsets windowInsets) {
        int i6 = Build.VERSION.SDK_INT;
        this.f3921a = i6 >= 30 ? new j(this, windowInsets) : i6 >= 29 ? new i(this, windowInsets) : i6 >= 28 ? new h(this, windowInsets) : new g(this, windowInsets);
    }

    public static y.b e(y.b bVar, int i6, int i7, int i8, int i9) {
        int max = Math.max(0, bVar.f6723a - i6);
        int max2 = Math.max(0, bVar.f6724b - i7);
        int max3 = Math.max(0, bVar.f6725c - i8);
        int max4 = Math.max(0, bVar.f6726d - i9);
        return (max == i6 && max2 == i7 && max3 == i8 && max4 == i9) ? bVar : y.b.a(max, max2, max3, max4);
    }

    public static x0 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        x0 x0Var = new x0(windowInsets);
        if (view != null) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            if (g0.g.b(view)) {
                x0 a6 = g0.j.a(view);
                k kVar = x0Var.f3921a;
                kVar.p(a6);
                kVar.d(view.getRootView());
            }
        }
        return x0Var;
    }

    @Deprecated
    public final int a() {
        return this.f3921a.j().f6726d;
    }

    @Deprecated
    public final int b() {
        return this.f3921a.j().f6723a;
    }

    @Deprecated
    public final int c() {
        return this.f3921a.j().f6725c;
    }

    @Deprecated
    public final int d() {
        return this.f3921a.j().f6724b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        return e0.b.a(this.f3921a, ((x0) obj).f3921a);
    }

    public final WindowInsets f() {
        k kVar = this.f3921a;
        if (kVar instanceof f) {
            return ((f) kVar).f3938c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f3921a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
