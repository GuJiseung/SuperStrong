package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.superstrong.android.R;
import f0.g0;
import g0.f;
import java.util.Arrays;
/* loaded from: classes.dex */
class ClockFaceView extends c implements ClockHandView.a {
    public final int[] A;
    public final float[] B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public String[] G;
    public float H;
    public final ColorStateList I;
    public final ClockHandView u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f3477v;

    /* renamed from: w  reason: collision with root package name */
    public final RectF f3478w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f3479x;

    /* renamed from: y  reason: collision with root package name */
    public final SparseArray<TextView> f3480y;

    /* renamed from: z  reason: collision with root package name */
    public final b f3481z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f3477v = new Rect();
        this.f3478w = new RectF();
        this.f3479x = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f3480y = sparseArray;
        this.B = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.H, R.attr.materialClockStyle, 2131952696);
        Resources resources = getResources();
        ColorStateList a6 = d3.c.a(context, obtainStyledAttributes, 1);
        this.I = a6;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.u = clockHandView;
        this.C = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a6.getColorForState(new int[]{16842913}, a6.getDefaultColor());
        this.A = new int[]{colorForState, colorForState, a6.getDefaultColor()};
        clockHandView.f3484d.add(this);
        int defaultColor = w.a.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a7 = d3.c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a7 != null ? a7.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f3481z = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.G = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z5 = false;
        for (int i6 = 0; i6 < Math.max(this.G.length, size); i6++) {
            TextView textView = sparseArray.get(i6);
            if (i6 >= this.G.length) {
                removeView(textView);
                sparseArray.remove(i6);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i6, textView);
                    addView(textView);
                }
                textView.setText(this.G[i6]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i6));
                int i7 = (i6 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i7));
                z5 = i7 > 1 ? true : z5;
                g0.l(textView, this.f3481z);
                textView.setTextColor(this.I);
            }
        }
        ClockHandView clockHandView2 = this.u;
        if (clockHandView2.f3483c && !z5) {
            clockHandView2.f3494n = 1;
        }
        clockHandView2.f3483c = z5;
        clockHandView2.invalidate();
        this.D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.F = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f6) {
        if (Math.abs(this.H - f6) > 0.001f) {
            this.H = f6;
            l();
        }
    }

    @Override // com.google.android.material.timepicker.c
    public final void k() {
        super.k();
        int i6 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f3480y;
            if (i6 >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i6).setVisibility(0);
            i6++;
        }
    }

    public final void l() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        boolean z5;
        Rect rect2;
        RadialGradient radialGradient;
        RectF rectF2 = this.u.f3488h;
        float f6 = Float.MAX_VALUE;
        TextView textView = null;
        int i6 = 0;
        while (true) {
            sparseArray = this.f3480y;
            int size = sparseArray.size();
            rectF = this.f3478w;
            rect = this.f3477v;
            if (i6 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i6);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f6) {
                    textView = textView2;
                    f6 = height;
                }
            }
            i6++;
        }
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            TextView textView3 = sparseArray.get(i7);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                textView3.setSelected(z5);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f3479x);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.A, this.B, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(1, this.G.length, 1).f4110a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        l();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.F / Math.max(Math.max(this.D / displayMetrics.heightPixels, this.E / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
