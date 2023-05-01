package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import z2.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: b  reason: collision with root package name */
    public final ValueAnimator f3482b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3483c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f3484d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3485e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3486f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f3487g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f3488h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3489i;

    /* renamed from: j  reason: collision with root package name */
    public float f3490j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3491k;

    /* renamed from: l  reason: collision with root package name */
    public double f3492l;

    /* renamed from: m  reason: collision with root package name */
    public int f3493m;

    /* renamed from: n  reason: collision with root package name */
    public int f3494n;

    /* loaded from: classes.dex */
    public interface a {
        void a(float f6);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f3482b = new ValueAnimator();
        this.f3484d = new ArrayList();
        Paint paint = new Paint();
        this.f3487g = paint;
        this.f3488h = new RectF();
        this.f3494n = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.I, R.attr.materialClockStyle, 2131952696);
        a3.a.c(context, R.attr.motionDurationLong2, 200);
        a3.a.d(context, R.attr.motionEasingEmphasizedInterpolator, h2.a.f4423b);
        this.f3493m = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3485e = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f3489i = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3486f = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i6) {
        return i6 == 2 ? Math.round(this.f3493m * 0.66f) : this.f3493m;
    }

    public final void b(float f6) {
        ValueAnimator valueAnimator = this.f3482b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f6, false);
    }

    public final void c(float f6, boolean z5) {
        float f7 = f6 % 360.0f;
        this.f3490j = f7;
        this.f3492l = Math.toRadians(f7 - 90.0f);
        float a6 = a(this.f3494n);
        float cos = (((float) Math.cos(this.f3492l)) * a6) + (getWidth() / 2);
        float sin = (a6 * ((float) Math.sin(this.f3492l))) + (getHeight() / 2);
        float f8 = this.f3485e;
        this.f3488h.set(cos - f8, sin - f8, cos + f8, sin + f8);
        Iterator it = this.f3484d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f7);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a6;
        int i6;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f6 = width;
        float a7 = a(this.f3494n);
        float f7 = height;
        Paint paint = this.f3487g;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f3492l)) * a7) + f6, (a7 * ((float) Math.sin(this.f3492l))) + f7, this.f3485e, paint);
        double sin = Math.sin(this.f3492l);
        paint.setStrokeWidth(this.f3489i);
        canvas.drawLine(f6, f7, width + ((int) (Math.cos(this.f3492l) * r12)), height + ((int) (r12 * sin)), paint);
        canvas.drawCircle(f6, f7, this.f3486f, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        if (!this.f3482b.isRunning()) {
            b(this.f3490j);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        boolean z7;
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        boolean z8 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z6 = false;
                z5 = false;
            } else {
                z6 = this.f3491k;
                if (this.f3483c) {
                    if (((float) Math.hypot(x5 - (getWidth() / 2), y5 - (getHeight() / 2))) <= a(2) + q.b(getContext(), 12)) {
                        i6 = 2;
                    } else {
                        i6 = 1;
                    }
                    this.f3494n = i6;
                }
                z5 = false;
            }
        } else {
            this.f3491k = false;
            z5 = true;
            z6 = false;
        }
        boolean z9 = this.f3491k;
        int degrees = ((int) Math.toDegrees(Math.atan2(y5 - (getHeight() / 2), x5 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f6 = degrees;
        if (this.f3490j != f6) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z5 || !z7) {
            if (z7 || z6) {
                b(f6);
            }
            this.f3491k = z9 | z8;
            return true;
        }
        z8 = true;
        this.f3491k = z9 | z8;
        return true;
    }
}
