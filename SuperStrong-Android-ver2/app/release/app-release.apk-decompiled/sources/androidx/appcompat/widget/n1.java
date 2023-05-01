package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import com.superstrong.android.R;
import d.g;
/* loaded from: classes.dex */
public final class n1 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    public final Toolbar f849a;

    /* renamed from: b  reason: collision with root package name */
    public int f850b;

    /* renamed from: c  reason: collision with root package name */
    public c1 f851c;

    /* renamed from: d  reason: collision with root package name */
    public View f852d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f853e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f854f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f855g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f856h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f857i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f858j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f859k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f860l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f861m;

    /* renamed from: n  reason: collision with root package name */
    public c f862n;

    /* renamed from: o  reason: collision with root package name */
    public int f863o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f864p;

    /* loaded from: classes.dex */
    public class a extends c.a {

        /* renamed from: n  reason: collision with root package name */
        public boolean f865n = false;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ int f866o;

        public a(int i6) {
            this.f866o = i6;
        }

        @Override // f0.s0
        public final void a() {
            if (this.f865n) {
                return;
            }
            n1.this.f849a.setVisibility(this.f866o);
        }

        @Override // c.a, f0.s0
        public final void b(View view) {
            this.f865n = true;
        }

        @Override // c.a, f0.s0
        public final void c() {
            n1.this.f849a.setVisibility(0);
        }
    }

    public n1(Toolbar toolbar) {
        boolean z5;
        Drawable drawable;
        this.f863o = 0;
        this.f849a = toolbar;
        this.f857i = toolbar.getTitle();
        this.f858j = toolbar.getSubtitle();
        if (this.f857i != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f856h = z5;
        this.f855g = toolbar.getNavigationIcon();
        j1 m5 = j1.m(toolbar.getContext(), null, c.b.f2652b, R.attr.actionBarStyle);
        this.f864p = m5.e(15);
        CharSequence k5 = m5.k(27);
        if (!TextUtils.isEmpty(k5)) {
            this.f856h = true;
            this.f857i = k5;
            if ((this.f850b & 8) != 0) {
                toolbar.setTitle(k5);
                if (this.f856h) {
                    f0.g0.m(toolbar.getRootView(), k5);
                }
            }
        }
        CharSequence k6 = m5.k(25);
        if (!TextUtils.isEmpty(k6)) {
            this.f858j = k6;
            if ((this.f850b & 8) != 0) {
                toolbar.setSubtitle(k6);
            }
        }
        Drawable e6 = m5.e(20);
        if (e6 != null) {
            this.f854f = e6;
            v();
        }
        Drawable e7 = m5.e(17);
        if (e7 != null) {
            setIcon(e7);
        }
        if (this.f855g == null && (drawable = this.f864p) != null) {
            this.f855g = drawable;
            toolbar.setNavigationIcon((this.f850b & 4) == 0 ? null : drawable);
        }
        m(m5.h(10, 0));
        int i6 = m5.i(9, 0);
        if (i6 != 0) {
            View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i6, (ViewGroup) toolbar, false);
            View view = this.f852d;
            if (view != null && (this.f850b & 16) != 0) {
                toolbar.removeView(view);
            }
            this.f852d = inflate;
            if (inflate != null && (this.f850b & 16) != 0) {
                toolbar.addView(inflate);
            }
            m(this.f850b | 16);
        }
        int layoutDimension = m5.f815b.getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int c6 = m5.c(7, -1);
        int c7 = m5.c(3, -1);
        if (c6 >= 0 || c7 >= 0) {
            int max = Math.max(c6, 0);
            int max2 = Math.max(c7, 0);
            if (toolbar.u == null) {
                toolbar.u = new b1();
            }
            toolbar.u.a(max, max2);
        }
        int i7 = m5.i(28, 0);
        if (i7 != 0) {
            Context context = toolbar.getContext();
            toolbar.f647m = i7;
            j0 j0Var = toolbar.f637c;
            if (j0Var != null) {
                j0Var.setTextAppearance(context, i7);
            }
        }
        int i8 = m5.i(26, 0);
        if (i8 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.f648n = i8;
            j0 j0Var2 = toolbar.f638d;
            if (j0Var2 != null) {
                j0Var2.setTextAppearance(context2, i8);
            }
        }
        int i9 = m5.i(22, 0);
        if (i9 != 0) {
            toolbar.setPopupTheme(i9);
        }
        m5.n();
        if (R.string.abc_action_bar_up_description != this.f863o) {
            this.f863o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i10 = this.f863o;
                String string = i10 != 0 ? b().getString(i10) : null;
                this.f859k = string;
                if ((this.f850b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f863o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f859k);
                    }
                }
            }
        }
        this.f859k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new m1(this));
    }

    @Override // androidx.appcompat.widget.o0
    public final boolean a() {
        boolean z5;
        ActionMenuView actionMenuView = this.f849a.f636b;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.u;
        if (cVar != null && cVar.g()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.o0
    public final Context b() {
        return this.f849a.getContext();
    }

    @Override // androidx.appcompat.widget.o0
    public final void c() {
        this.f861m = true;
    }

    @Override // androidx.appcompat.widget.o0
    public final void collapseActionView() {
        androidx.appcompat.view.menu.h hVar;
        Toolbar.f fVar = this.f849a.M;
        if (fVar == null) {
            hVar = null;
        } else {
            hVar = fVar.f664c;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f849a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f636b
            r1 = 0
            if (r0 == 0) goto L22
            androidx.appcompat.widget.c r0 = r0.u
            r2 = 1
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.c$c r3 = r0.f705w
            if (r3 != 0) goto L19
            boolean r0 = r0.g()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L1e
            r0 = r2
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L22
            r1 = r2
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n1.d():boolean");
    }

    @Override // androidx.appcompat.widget.o0
    public final boolean e() {
        boolean z5;
        ActionMenuView actionMenuView = this.f849a.f636b;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.u;
        if (cVar != null && cVar.d()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.o0
    public final boolean f() {
        boolean z5;
        ActionMenuView actionMenuView = this.f849a.f636b;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.u;
        if (cVar != null && cVar.n()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.o0
    public final void g(androidx.appcompat.view.menu.f fVar, g.b bVar) {
        c cVar = this.f862n;
        Toolbar toolbar = this.f849a;
        if (cVar == null) {
            c cVar2 = new c(toolbar.getContext());
            this.f862n = cVar2;
            cVar2.f378j = R.id.action_menu_presenter;
        }
        c cVar3 = this.f862n;
        cVar3.f374f = bVar;
        if (fVar != null || toolbar.f636b != null) {
            toolbar.f();
            androidx.appcompat.view.menu.f fVar2 = toolbar.f636b.f557q;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    fVar2.r(toolbar.L);
                    fVar2.r(toolbar.M);
                }
                if (toolbar.M == null) {
                    toolbar.M = new Toolbar.f();
                }
                cVar3.s = true;
                if (fVar != null) {
                    fVar.b(cVar3, toolbar.f645k);
                    fVar.b(toolbar.M, toolbar.f645k);
                } else {
                    cVar3.e(toolbar.f645k, null);
                    toolbar.M.e(toolbar.f645k, null);
                    cVar3.i(true);
                    toolbar.M.i(true);
                }
                toolbar.f636b.setPopupTheme(toolbar.f646l);
                toolbar.f636b.setPresenter(cVar3);
                toolbar.L = cVar3;
                toolbar.u();
            }
        }
    }

    @Override // androidx.appcompat.widget.o0
    public final CharSequence getTitle() {
        return this.f849a.getTitle();
    }

    @Override // androidx.appcompat.widget.o0
    public final boolean h() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f849a;
        if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f636b) != null && actionMenuView.f559t) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.o0
    public final void i() {
        c cVar;
        ActionMenuView actionMenuView = this.f849a.f636b;
        if (actionMenuView != null && (cVar = actionMenuView.u) != null) {
            cVar.d();
            c.a aVar = cVar.f704v;
            if (aVar != null && aVar.b()) {
                aVar.f485j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.o0
    public final void j(int i6) {
        this.f849a.setVisibility(i6);
    }

    @Override // androidx.appcompat.widget.o0
    public final void k() {
    }

    @Override // androidx.appcompat.widget.o0
    public final boolean l() {
        Toolbar.f fVar = this.f849a.M;
        if (fVar != null && fVar.f664c != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.o0
    public final void m(int i6) {
        View view;
        Drawable drawable;
        int i7 = this.f850b ^ i6;
        this.f850b = i6;
        if (i7 != 0) {
            int i8 = i7 & 4;
            CharSequence charSequence = null;
            Toolbar toolbar = this.f849a;
            if (i8 != 0) {
                if ((i6 & 4) != 0 && (i6 & 4) != 0) {
                    if (TextUtils.isEmpty(this.f859k)) {
                        toolbar.setNavigationContentDescription(this.f863o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f859k);
                    }
                }
                if ((this.f850b & 4) != 0) {
                    drawable = this.f855g;
                    if (drawable == null) {
                        drawable = this.f864p;
                    }
                } else {
                    drawable = null;
                }
                toolbar.setNavigationIcon(drawable);
            }
            if ((i7 & 3) != 0) {
                v();
            }
            if ((i7 & 8) != 0) {
                if ((i6 & 8) != 0) {
                    toolbar.setTitle(this.f857i);
                    charSequence = this.f858j;
                } else {
                    toolbar.setTitle((CharSequence) null);
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i7 & 16) != 0 && (view = this.f852d) != null) {
                if ((i6 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.o0
    public final void n() {
        c1 c1Var = this.f851c;
        if (c1Var != null) {
            ViewParent parent = c1Var.getParent();
            Toolbar toolbar = this.f849a;
            if (parent == toolbar) {
                toolbar.removeView(this.f851c);
            }
        }
        this.f851c = null;
    }

    @Override // androidx.appcompat.widget.o0
    public final int o() {
        return this.f850b;
    }

    @Override // androidx.appcompat.widget.o0
    public final void p(int i6) {
        Drawable drawable;
        if (i6 != 0) {
            drawable = e.a.a(b(), i6);
        } else {
            drawable = null;
        }
        this.f854f = drawable;
        v();
    }

    @Override // androidx.appcompat.widget.o0
    public final void q() {
    }

    @Override // androidx.appcompat.widget.o0
    public final f0.r0 r(int i6, long j5) {
        f0.r0 a6 = f0.g0.a(this.f849a);
        a6.a(i6 == 0 ? 1.0f : 0.0f);
        a6.c(j5);
        a6.d(new a(i6));
        return a6;
    }

    @Override // androidx.appcompat.widget.o0
    public final void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.o0
    public final void setIcon(int i6) {
        setIcon(i6 != 0 ? e.a.a(b(), i6) : null);
    }

    @Override // androidx.appcompat.widget.o0
    public final void setIcon(Drawable drawable) {
        this.f853e = drawable;
        v();
    }

    @Override // androidx.appcompat.widget.o0
    public final void setWindowCallback(Window.Callback callback) {
        this.f860l = callback;
    }

    @Override // androidx.appcompat.widget.o0
    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f856h) {
            this.f857i = charSequence;
            if ((this.f850b & 8) != 0) {
                Toolbar toolbar = this.f849a;
                toolbar.setTitle(charSequence);
                if (this.f856h) {
                    f0.g0.m(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.o0
    public final void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.o0
    public final void u(boolean z5) {
        this.f849a.setCollapsible(z5);
    }

    public final void v() {
        Drawable drawable;
        int i6 = this.f850b;
        if ((i6 & 2) == 0) {
            drawable = null;
        } else if ((i6 & 1) == 0 || (drawable = this.f854f) == null) {
            drawable = this.f853e;
        }
        this.f849a.setLogo(drawable);
    }
}
