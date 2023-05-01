package z2;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import d0.l;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class c {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f6934a;

    /* renamed from: a0  reason: collision with root package name */
    public float f6935a0;

    /* renamed from: b  reason: collision with root package name */
    public float f6936b;

    /* renamed from: b0  reason: collision with root package name */
    public float f6937b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f6938c;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f6939c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f6940d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f6942e;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f6949j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f6950k;

    /* renamed from: l  reason: collision with root package name */
    public float f6951l;

    /* renamed from: m  reason: collision with root package name */
    public float f6952m;

    /* renamed from: n  reason: collision with root package name */
    public float f6953n;

    /* renamed from: o  reason: collision with root package name */
    public float f6954o;

    /* renamed from: p  reason: collision with root package name */
    public float f6955p;

    /* renamed from: q  reason: collision with root package name */
    public float f6956q;

    /* renamed from: r  reason: collision with root package name */
    public Typeface f6957r;
    public Typeface s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f6958t;
    public Typeface u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f6959v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f6960w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f6961x;

    /* renamed from: y  reason: collision with root package name */
    public d3.a f6962y;

    /* renamed from: f  reason: collision with root package name */
    public int f6944f = 16;

    /* renamed from: g  reason: collision with root package name */
    public int f6946g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f6947h = 15.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f6948i = 15.0f;

    /* renamed from: z  reason: collision with root package name */
    public final TextUtils.TruncateAt f6963z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* renamed from: d0  reason: collision with root package name */
    public final int f6941d0 = 1;

    /* renamed from: e0  reason: collision with root package name */
    public final float f6943e0 = 1.0f;

    /* renamed from: f0  reason: collision with root package name */
    public final int f6945f0 = 1;

    public c(View view) {
        this.f6934a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f6940d = new Rect();
        this.f6938c = new Rect();
        this.f6942e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f6, int i6, int i7) {
        float f7 = 1.0f - f6;
        return Color.argb(Math.round((Color.alpha(i7) * f6) + (Color.alpha(i6) * f7)), Math.round((Color.red(i7) * f6) + (Color.red(i6) * f7)), Math.round((Color.green(i7) * f6) + (Color.green(i6) * f7)), Math.round((Color.blue(i7) * f6) + (Color.blue(i6) * f7)));
    }

    public static float f(float f6, float f7, float f8, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f8 = timeInterpolator.getInterpolation(f8);
        }
        LinearInterpolator linearInterpolator = h2.a.f4422a;
        return ((f7 - f6) * f8) + f6;
    }

    public final boolean b(CharSequence charSequence) {
        l.d dVar;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        boolean z5 = true;
        if (g0.e.d(this.f6934a) != 1) {
            z5 = false;
        }
        if (this.D) {
            if (z5) {
                dVar = d0.l.f3742d;
            } else {
                dVar = d0.l.f3741c;
            }
            return dVar.b(charSequence, charSequence.length());
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x010c, code lost:
        if (r12.C != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(float r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.c(float, boolean):void");
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f6948i);
        textPaint.setTypeface(this.f6957r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f6958t;
            if (typeface != null) {
                this.s = d3.g.a(configuration, typeface);
            }
            Typeface typeface2 = this.f6960w;
            if (typeface2 != null) {
                this.f6959v = d3.g.a(configuration, typeface2);
            }
            Typeface typeface3 = this.s;
            if (typeface3 == null) {
                typeface3 = this.f6958t;
            }
            this.f6957r = typeface3;
            Typeface typeface4 = this.f6959v;
            if (typeface4 == null) {
                typeface4 = this.f6960w;
            }
            this.u = typeface4;
            h(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(boolean r17) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.h(boolean):void");
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f6950k != colorStateList || this.f6949j != colorStateList) {
            this.f6950k = colorStateList;
            this.f6949j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        d3.a aVar = this.f6962y;
        if (aVar != null) {
            aVar.f3777e = true;
        }
        if (this.f6958t != typeface) {
            this.f6958t = typeface;
            Typeface a6 = d3.g.a(this.f6934a.getContext().getResources().getConfiguration(), typeface);
            this.s = a6;
            if (a6 == null) {
                a6 = this.f6958t;
            }
            this.f6957r = a6;
            return true;
        }
        return false;
    }

    public final void k(float f6) {
        int e6;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f6 != this.f6936b) {
            this.f6936b = f6;
            Rect rect = this.f6938c;
            Rect rect2 = this.f6940d;
            float f7 = f(rect.left, rect2.left, f6, this.P);
            RectF rectF = this.f6942e;
            rectF.left = f7;
            rectF.top = f(this.f6951l, this.f6952m, f6, this.P);
            rectF.right = f(rect.right, rect2.right, f6, this.P);
            rectF.bottom = f(rect.bottom, rect2.bottom, f6, this.P);
            this.f6955p = f(this.f6953n, this.f6954o, f6, this.P);
            this.f6956q = f(this.f6951l, this.f6952m, f6, this.P);
            l(f6);
            t0.b bVar = h2.a.f4423b;
            this.f6935a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f6, bVar);
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            View view = this.f6934a;
            g0.d.k(view);
            this.f6937b0 = f(1.0f, 0.0f, f6, bVar);
            g0.d.k(view);
            ColorStateList colorStateList = this.f6950k;
            ColorStateList colorStateList2 = this.f6949j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                e6 = a(f6, e(colorStateList2), e(this.f6950k));
            } else {
                e6 = e(colorStateList);
            }
            textPaint.setColor(e6);
            float f8 = this.V;
            float f9 = this.W;
            if (f8 != f9) {
                f8 = f(f9, f8, f6, bVar);
            }
            textPaint.setLetterSpacing(f8);
            this.H = f(0.0f, this.R, f6, null);
            this.I = f(0.0f, this.S, f6, null);
            this.J = f(0.0f, this.T, f6, null);
            int a6 = a(f6, e(null), e(this.U));
            this.K = a6;
            textPaint.setShadowLayer(this.H, this.I, this.J, a6);
            g0.d.k(view);
        }
    }

    public final void l(float f6) {
        c(f6, false);
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.k(this.f6934a);
    }

    public final void m(Typeface typeface) {
        boolean z5;
        boolean j5 = j(typeface);
        if (this.f6960w != typeface) {
            this.f6960w = typeface;
            Typeface a6 = d3.g.a(this.f6934a.getContext().getResources().getConfiguration(), typeface);
            this.f6959v = a6;
            if (a6 == null) {
                a6 = this.f6960w;
            }
            this.u = a6;
            z5 = true;
        } else {
            z5 = false;
        }
        if (j5 || z5) {
            h(false);
        }
    }
}
