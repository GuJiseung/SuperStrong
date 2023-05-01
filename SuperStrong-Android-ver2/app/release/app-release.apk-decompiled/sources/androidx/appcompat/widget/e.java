package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import f0.g0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f759a;

    /* renamed from: d  reason: collision with root package name */
    public h1 f762d;

    /* renamed from: e  reason: collision with root package name */
    public h1 f763e;

    /* renamed from: f  reason: collision with root package name */
    public h1 f764f;

    /* renamed from: c  reason: collision with root package name */
    public int f761c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final j f760b = j.a();

    public e(View view) {
        this.f759a = view;
    }

    public final void a() {
        boolean z5;
        View view = this.f759a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z6 = false;
            if (this.f762d != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (this.f764f == null) {
                    this.f764f = new h1();
                }
                h1 h1Var = this.f764f;
                h1Var.f786a = null;
                h1Var.f789d = false;
                h1Var.f787b = null;
                h1Var.f788c = false;
                WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
                ColorStateList g2 = g0.i.g(view);
                if (g2 != null) {
                    h1Var.f789d = true;
                    h1Var.f786a = g2;
                }
                PorterDuff.Mode h6 = g0.i.h(view);
                if (h6 != null) {
                    h1Var.f788c = true;
                    h1Var.f787b = h6;
                }
                if (h1Var.f789d || h1Var.f788c) {
                    j.e(background, h1Var, view.getDrawableState());
                    z6 = true;
                }
                if (z6) {
                    return;
                }
            }
            h1 h1Var2 = this.f763e;
            if (h1Var2 != null) {
                j.e(background, h1Var2, view.getDrawableState());
                return;
            }
            h1 h1Var3 = this.f762d;
            if (h1Var3 != null) {
                j.e(background, h1Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        h1 h1Var = this.f763e;
        if (h1Var != null) {
            return h1Var.f786a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        h1 h1Var = this.f763e;
        if (h1Var != null) {
            return h1Var.f787b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i6) {
        ColorStateList h6;
        View view = this.f759a;
        Context context = view.getContext();
        int[] iArr = c.b.A;
        j1 m5 = j1.m(context, attributeSet, iArr, i6);
        View view2 = this.f759a;
        f0.g0.k(view2, view2.getContext(), iArr, attributeSet, m5.f815b, i6);
        try {
            if (m5.l(0)) {
                this.f761c = m5.i(0, -1);
                j jVar = this.f760b;
                Context context2 = view.getContext();
                int i7 = this.f761c;
                synchronized (jVar) {
                    h6 = jVar.f798a.h(context2, i7);
                }
                if (h6 != null) {
                    g(h6);
                }
            }
            if (m5.l(1)) {
                g0.i.q(view, m5.b(1));
            }
            if (m5.l(2)) {
                g0.i.r(view, p0.b(m5.h(2, -1), null));
            }
        } finally {
            m5.n();
        }
    }

    public final void e() {
        this.f761c = -1;
        g(null);
        a();
    }

    public final void f(int i6) {
        ColorStateList colorStateList;
        this.f761c = i6;
        j jVar = this.f760b;
        if (jVar != null) {
            Context context = this.f759a.getContext();
            synchronized (jVar) {
                colorStateList = jVar.f798a.h(context, i6);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f762d == null) {
                this.f762d = new h1();
            }
            h1 h1Var = this.f762d;
            h1Var.f786a = colorStateList;
            h1Var.f789d = true;
        } else {
            this.f762d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f763e == null) {
            this.f763e = new h1();
        }
        h1 h1Var = this.f763e;
        h1Var.f786a = colorStateList;
        h1Var.f789d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f763e == null) {
            this.f763e = new h1();
        }
        h1 h1Var = this.f763e;
        h1Var.f787b = mode;
        h1Var.f788c = true;
        a();
    }
}
