package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.superstrong.android.R;
import d3.d;
import h2.g;
import h3.f;
import h3.j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import z.a;
import z.b;
import z2.k;
import z2.q;
/* loaded from: classes.dex */
public final class a extends f implements Drawable.Callback, k.b {
    public static final int[] H0 = {16842910};
    public static final ShapeDrawable I0 = new ShapeDrawable(new OvalShape());
    public float A;
    public boolean A0;
    public float B;
    public ColorStateList B0;
    public ColorStateList C;
    public WeakReference<InterfaceC0022a> C0;
    public float D;
    public TextUtils.TruncateAt D0;
    public ColorStateList E;
    public boolean E0;
    public CharSequence F;
    public int F0;
    public boolean G;
    public boolean G0;
    public Drawable H;
    public ColorStateList I;
    public float J;
    public boolean K;
    public boolean L;
    public Drawable M;
    public RippleDrawable N;
    public ColorStateList O;
    public float P;
    public SpannableStringBuilder Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public g V;
    public g W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f3056a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f3057b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f3058c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f3059d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f3060e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Context f3061f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Paint f3062g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Paint.FontMetrics f3063h0;

    /* renamed from: i0  reason: collision with root package name */
    public final RectF f3064i0;

    /* renamed from: j0  reason: collision with root package name */
    public final PointF f3065j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Path f3066k0;

    /* renamed from: l0  reason: collision with root package name */
    public final k f3067l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f3068m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f3069n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f3070o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f3071p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f3072q0;
    public int r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f3073s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f3074t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f3075u0;

    /* renamed from: v0  reason: collision with root package name */
    public ColorFilter f3076v0;
    public PorterDuffColorFilter w0;

    /* renamed from: x0  reason: collision with root package name */
    public ColorStateList f3077x0;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f3078y;

    /* renamed from: y0  reason: collision with root package name */
    public PorterDuff.Mode f3079y0;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f3080z;

    /* renamed from: z0  reason: collision with root package name */
    public int[] f3081z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0022a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2131952618);
        this.B = -1.0f;
        this.f3062g0 = new Paint(1);
        this.f3063h0 = new Paint.FontMetrics();
        this.f3064i0 = new RectF();
        this.f3065j0 = new PointF();
        this.f3066k0 = new Path();
        this.f3075u0 = 255;
        this.f3079y0 = PorterDuff.Mode.SRC_IN;
        this.C0 = new WeakReference<>(null);
        i(context);
        this.f3061f0 = context;
        k kVar = new k(this);
        this.f3067l0 = kVar;
        this.F = "";
        kVar.f6990a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = H0;
        setState(iArr);
        if (!Arrays.equals(this.f3081z0, iArr)) {
            this.f3081z0 = iArr;
            if (T()) {
                w(getState(), iArr);
            }
        }
        this.E0 = true;
        int[] iArr2 = e3.a.f3836a;
        I0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z5) {
        if (this.S != z5) {
            boolean R = R();
            this.S = z5;
            boolean R2 = R();
            if (R != R2) {
                if (R2) {
                    o(this.T);
                } else {
                    U(this.T);
                }
                invalidateSelf();
                v();
            }
        }
    }

    @Deprecated
    public final void B(float f6) {
        if (this.B != f6) {
            this.B = f6;
            setShapeAppearanceModel(this.f4446b.f4467a.e(f6));
        }
    }

    public final void C(Drawable drawable) {
        Drawable drawable2 = this.H;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof b) {
                drawable2 = ((b) drawable2).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q5 = q();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.H = drawable3;
            float q6 = q();
            U(drawable2);
            if (S()) {
                o(this.H);
            }
            invalidateSelf();
            if (q5 != q6) {
                v();
            }
        }
    }

    public final void D(float f6) {
        if (this.J != f6) {
            float q5 = q();
            this.J = f6;
            float q6 = q();
            invalidateSelf();
            if (q5 != q6) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.K = true;
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (S()) {
                a.b.h(this.H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z5) {
        if (this.G != z5) {
            boolean S = S();
            this.G = z5;
            boolean S2 = S();
            if (S != S2) {
                if (S2) {
                    o(this.H);
                } else {
                    U(this.H);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.G0) {
                f.b bVar = this.f4446b;
                if (bVar.f4470d != colorStateList) {
                    bVar.f4470d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f6) {
        if (this.D != f6) {
            this.D = f6;
            this.f3062g0.setStrokeWidth(f6);
            if (this.G0) {
                this.f4446b.f4477k = f6;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void I(Drawable drawable) {
        Drawable drawable2 = this.M;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof b) {
                drawable2 = ((b) drawable2).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float r5 = r();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.M = drawable3;
            int[] iArr = e3.a.f3836a;
            this.N = new RippleDrawable(e3.a.c(this.E), this.M, I0);
            float r6 = r();
            U(drawable2);
            if (T()) {
                o(this.M);
            }
            invalidateSelf();
            if (r5 != r6) {
                v();
            }
        }
    }

    public final void J(float f6) {
        if (this.f3059d0 != f6) {
            this.f3059d0 = f6;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void K(float f6) {
        if (this.P != f6) {
            this.P = f6;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void L(float f6) {
        if (this.f3058c0 != f6) {
            this.f3058c0 = f6;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (T()) {
                a.b.h(this.M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z5) {
        if (this.L != z5) {
            boolean T = T();
            this.L = z5;
            boolean T2 = T();
            if (T != T2) {
                if (T2) {
                    o(this.M);
                } else {
                    U(this.M);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f6) {
        if (this.Z != f6) {
            float q5 = q();
            this.Z = f6;
            float q6 = q();
            invalidateSelf();
            if (q5 != q6) {
                v();
            }
        }
    }

    public final void P(float f6) {
        if (this.Y != f6) {
            float q5 = q();
            this.Y = f6;
            float q6 = q();
            invalidateSelf();
            if (q5 != q6) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (this.A0) {
                colorStateList2 = e3.a.c(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.B0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final boolean R() {
        return this.S && this.T != null && this.f3073s0;
    }

    public final boolean S() {
        return this.G && this.H != null;
    }

    public final boolean T() {
        return this.L && this.M != null;
    }

    @Override // z2.k.b
    public final void a() {
        v();
        invalidateSelf();
    }

    @Override // h3.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i6;
        int i7;
        RectF rectF;
        int i8;
        int i9;
        int i10;
        RectF rectF2;
        boolean z5;
        int i11;
        float f6;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i6 = this.f3075u0) != 0) {
            if (i6 < 255) {
                i7 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i6);
            } else {
                i7 = 0;
            }
            boolean z6 = this.G0;
            Paint paint = this.f3062g0;
            RectF rectF3 = this.f3064i0;
            if (!z6) {
                paint.setColor(this.f3068m0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            }
            if (!this.G0) {
                paint.setColor(this.f3069n0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f3076v0;
                if (colorFilter == null) {
                    colorFilter = this.w0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            }
            if (this.G0) {
                super.draw(canvas);
            }
            if (this.D > 0.0f && !this.G0) {
                paint.setColor(this.f3071p0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.G0) {
                    ColorFilter colorFilter2 = this.f3076v0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.w0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f7 = this.D / 2.0f;
                rectF3.set(bounds.left + f7, bounds.top + f7, bounds.right - f7, bounds.bottom - f7);
                float f8 = this.B - (this.D / 2.0f);
                canvas.drawRoundRect(rectF3, f8, f8, paint);
            }
            paint.setColor(this.f3072q0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.G0) {
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.f3066k0;
                j jVar = this.s;
                f.b bVar = this.f4446b;
                jVar.a(bVar.f4467a, bVar.f4476j, rectF4, this.f4462r, path);
                f(canvas, paint, path, this.f4446b.f4467a, h());
            }
            if (S()) {
                p(bounds, rectF3);
                float f9 = rectF3.left;
                float f10 = rectF3.top;
                canvas.translate(f9, f10);
                this.H.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.H.draw(canvas);
                canvas.translate(-f9, -f10);
            }
            if (R()) {
                p(bounds, rectF3);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                canvas.translate(f11, f12);
                this.T.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.T.draw(canvas);
                canvas.translate(-f11, -f12);
            }
            if (this.E0 && this.F != null) {
                PointF pointF = this.f3065j0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.F;
                k kVar = this.f3067l0;
                if (charSequence != null) {
                    float q5 = q() + this.X + this.f3056a0;
                    if (a.c.a(this) == 0) {
                        pointF.x = bounds.left + q5;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - q5;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = kVar.f6990a;
                    Paint.FontMetrics fontMetrics = this.f3063h0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.F != null) {
                    float q6 = q() + this.X + this.f3056a0;
                    float r5 = r() + this.f3060e0 + this.f3057b0;
                    if (a.c.a(this) == 0) {
                        rectF3.left = bounds.left + q6;
                        f6 = bounds.right - r5;
                    } else {
                        rectF3.left = bounds.left + r5;
                        f6 = bounds.right - q6;
                    }
                    rectF3.right = f6;
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                d dVar = kVar.f6995f;
                TextPaint textPaint2 = kVar.f6990a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    kVar.f6995f.e(this.f3061f0, textPaint2, kVar.f6991b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(kVar.a(this.F.toString())) > Math.round(rectF3.width())) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    i11 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i11 = 0;
                }
                CharSequence charSequence2 = this.F;
                if (z5 && this.D0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.D0);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                float f13 = pointF.x;
                float f14 = pointF.y;
                rectF = rectF3;
                i8 = i7;
                i9 = 0;
                i10 = 255;
                canvas.drawText(charSequence3, 0, length, f13, f14, textPaint2);
                if (z5) {
                    canvas.restoreToCount(i11);
                }
            } else {
                rectF = rectF3;
                i8 = i7;
                i9 = 0;
                i10 = 255;
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f15 = this.f3060e0 + this.f3059d0;
                    if (a.c.a(this) == 0) {
                        float f16 = bounds.right - f15;
                        rectF2 = rectF;
                        rectF2.right = f16;
                        rectF2.left = f16 - this.P;
                    } else {
                        rectF2 = rectF;
                        float f17 = bounds.left + f15;
                        rectF2.left = f17;
                        rectF2.right = f17 + this.P;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f18 = this.P;
                    float f19 = exactCenterY - (f18 / 2.0f);
                    rectF2.top = f19;
                    rectF2.bottom = f19 + f18;
                } else {
                    rectF2 = rectF;
                }
                float f20 = rectF2.left;
                float f21 = rectF2.top;
                canvas.translate(f20, f21);
                this.M.setBounds(i9, i9, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = e3.a.f3836a;
                this.N.setBounds(this.M.getBounds());
                this.N.jumpToCurrentState();
                this.N.draw(canvas);
                canvas.translate(-f20, -f21);
            }
            if (this.f3075u0 < i10) {
                canvas.restoreToCount(i8);
            }
        }
    }

    @Override // h3.f, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3075u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f3076v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.f3067l0.a(this.F.toString()) + q() + this.X + this.f3056a0 + this.f3057b0 + this.f3060e0), this.F0);
    }

    @Override // h3.f, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // h3.f, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.G0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.B);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A, this.B);
        }
        outline.setAlpha(this.f3075u0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // h3.f, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z5;
        boolean z6;
        ColorStateList colorStateList;
        if (t(this.f3078y) || t(this.f3080z) || t(this.C)) {
            return true;
        }
        if (this.A0 && t(this.B0)) {
            return true;
        }
        d dVar = this.f3067l0.f6995f;
        if (dVar != null && (colorStateList = dVar.f3787j) != null && colorStateList.isStateful()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return true;
        }
        if (this.S && this.T != null && this.R) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 || u(this.H) || u(this.T) || t(this.f3077x0)) {
            return true;
        }
        return false;
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        a.c.b(drawable, a.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f3081z0);
            }
            a.b.h(drawable, this.O);
            return;
        }
        Drawable drawable2 = this.H;
        if (drawable == drawable2 && this.K) {
            a.b.h(drawable2, this.I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i6) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i6);
        if (S()) {
            onLayoutDirectionChanged |= a.c.b(this.H, i6);
        }
        if (R()) {
            onLayoutDirectionChanged |= a.c.b(this.T, i6);
        }
        if (T()) {
            onLayoutDirectionChanged |= a.c.b(this.M, i6);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        boolean onLevelChange = super.onLevelChange(i6);
        if (S()) {
            onLevelChange |= this.H.setLevel(i6);
        }
        if (R()) {
            onLevelChange |= this.T.setLevel(i6);
        }
        if (T()) {
            onLevelChange |= this.M.setLevel(i6);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // h3.f, android.graphics.drawable.Drawable, z2.k.b
    public final boolean onStateChange(int[] iArr) {
        if (this.G0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.f3081z0);
    }

    public final void p(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f6;
        rectF.setEmpty();
        if (S() || R()) {
            float f7 = this.X + this.Y;
            if (this.f3073s0) {
                drawable = this.T;
            } else {
                drawable = this.H;
            }
            float f8 = this.J;
            if (f8 <= 0.0f && drawable != null) {
                f8 = drawable.getIntrinsicWidth();
            }
            if (a.c.a(this) == 0) {
                float f9 = rect.left + f7;
                rectF.left = f9;
                rectF.right = f9 + f8;
            } else {
                float f10 = rect.right - f7;
                rectF.right = f10;
                rectF.left = f10 - f8;
            }
            if (this.f3073s0) {
                drawable2 = this.T;
            } else {
                drawable2 = this.H;
            }
            float f11 = this.J;
            if (f11 <= 0.0f && drawable2 != null) {
                f11 = (float) Math.ceil(q.b(this.f3061f0, 24));
                if (drawable2.getIntrinsicHeight() <= f11) {
                    f6 = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f6 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f6;
                }
            }
            f6 = f11;
            float exactCenterY2 = rect.exactCenterY() - (f6 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f6;
        }
    }

    public final float q() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f6 = this.Y;
        if (this.f3073s0) {
            drawable = this.T;
        } else {
            drawable = this.H;
        }
        float f7 = this.J;
        if (f7 <= 0.0f && drawable != null) {
            f7 = drawable.getIntrinsicWidth();
        }
        return f7 + f6 + this.Z;
    }

    public final float r() {
        if (T()) {
            return this.f3058c0 + this.P + this.f3059d0;
        }
        return 0.0f;
    }

    public final float s() {
        if (this.G0) {
            return this.f4446b.f4467a.f4492e.a(h());
        }
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j5);
        }
    }

    @Override // h3.f, android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (this.f3075u0 != i6) {
            this.f3075u0 = i6;
            invalidateSelf();
        }
    }

    @Override // h3.f, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f3076v0 != colorFilter) {
            this.f3076v0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // h3.f, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f3077x0 != colorStateList) {
            this.f3077x0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // h3.f, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f3079y0 != mode) {
            this.f3079y0 = mode;
            ColorStateList colorStateList = this.f3077x0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.w0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        if (S()) {
            visible |= this.H.setVisible(z5, z6);
        }
        if (R()) {
            visible |= this.T.setVisible(z5, z6);
        }
        if (T()) {
            visible |= this.M.setVisible(z5, z6);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        InterfaceC0022a interfaceC0022a = this.C0.get();
        if (interfaceC0022a != null) {
            interfaceC0022a.a();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        int i8;
        int i9;
        int i10;
        boolean z7;
        boolean z8;
        boolean z9;
        int i11;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f3078y;
        if (colorStateList2 != null) {
            i6 = colorStateList2.getColorForState(iArr, this.f3068m0);
        } else {
            i6 = 0;
        }
        int d6 = d(i6);
        boolean z10 = true;
        if (this.f3068m0 != d6) {
            this.f3068m0 = d6;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f3080z;
        if (colorStateList3 != null) {
            i7 = colorStateList3.getColorForState(iArr, this.f3069n0);
        } else {
            i7 = 0;
        }
        int d7 = d(i7);
        if (this.f3069n0 != d7) {
            this.f3069n0 = d7;
            onStateChange = true;
        }
        int b6 = y.a.b(d7, d6);
        if (this.f3070o0 != b6) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f4446b.f4469c == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 | z6) {
            this.f3070o0 = b6;
            k(ColorStateList.valueOf(b6));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.C;
        if (colorStateList4 != null) {
            i8 = colorStateList4.getColorForState(iArr, this.f3071p0);
        } else {
            i8 = 0;
        }
        if (this.f3071p0 != i8) {
            this.f3071p0 = i8;
            onStateChange = true;
        }
        if (this.B0 != null && e3.a.d(iArr)) {
            i9 = this.B0.getColorForState(iArr, this.f3072q0);
        } else {
            i9 = 0;
        }
        if (this.f3072q0 != i9) {
            this.f3072q0 = i9;
            if (this.A0) {
                onStateChange = true;
            }
        }
        d dVar = this.f3067l0.f6995f;
        if (dVar != null && (colorStateList = dVar.f3787j) != null) {
            i10 = colorStateList.getColorForState(iArr, this.r0);
        } else {
            i10 = 0;
        }
        if (this.r0 != i10) {
            this.r0 = i10;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i12 : state) {
                if (i12 == 16842912) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        if (z7 && this.R) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f3073s0 != z8 && this.T != null) {
            float q5 = q();
            this.f3073s0 = z8;
            if (q5 != q()) {
                onStateChange = true;
                z9 = true;
            } else {
                z9 = false;
                onStateChange = true;
            }
        } else {
            z9 = false;
        }
        ColorStateList colorStateList5 = this.f3077x0;
        if (colorStateList5 != null) {
            i11 = colorStateList5.getColorForState(iArr, this.f3074t0);
        } else {
            i11 = 0;
        }
        if (this.f3074t0 != i11) {
            this.f3074t0 = i11;
            ColorStateList colorStateList6 = this.f3077x0;
            PorterDuff.Mode mode = this.f3079y0;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.w0 = porterDuffColorFilter;
        } else {
            z10 = onStateChange;
        }
        if (u(this.H)) {
            z10 |= this.H.setState(iArr);
        }
        if (u(this.T)) {
            z10 |= this.T.setState(iArr);
        }
        if (u(this.M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z10 |= this.M.setState(iArr3);
        }
        int[] iArr4 = e3.a.f3836a;
        if (u(this.N)) {
            z10 |= this.N.setState(iArr2);
        }
        if (z10) {
            invalidateSelf();
        }
        if (z9) {
            v();
        }
        return z10;
    }

    public final void x(boolean z5) {
        if (this.R != z5) {
            this.R = z5;
            float q5 = q();
            if (!z5 && this.f3073s0) {
                this.f3073s0 = false;
            }
            float q6 = q();
            invalidateSelf();
            if (q5 != q6) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.T != drawable) {
            float q5 = q();
            this.T = drawable;
            float q6 = q();
            U(this.T);
            o(this.T);
            invalidateSelf();
            if (q5 != q6) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        boolean z5;
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (this.S && this.T != null && this.R) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                a.b.h(this.T, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
