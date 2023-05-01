package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import h3.f;
import h3.i;
import java.util.WeakHashMap;
import z.a;
import z2.q;
/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3305a = 0;

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i  reason: collision with root package name */
        public final b f3306i = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f3306i.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (j3.a.a().f4721a) {
                    }
                }
            } else if (coordinatorLayout.l(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                synchronized (j3.a.a().f4721a) {
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean s(View view) {
            this.f3306i.getClass();
            return view instanceof c;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i6 = message.what;
            if (i6 != 0) {
                if (i6 != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
            ((BaseTransientBottomBar) message.obj).getClass();
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f2932f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f2933g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f2930d = 0;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends FrameLayout {

        /* renamed from: k  reason: collision with root package name */
        public static final a f3307k = new a();

        /* renamed from: b  reason: collision with root package name */
        public BaseTransientBottomBar<?> f3308b;

        /* renamed from: c  reason: collision with root package name */
        public final i f3309c;

        /* renamed from: d  reason: collision with root package name */
        public int f3310d;

        /* renamed from: e  reason: collision with root package name */
        public final float f3311e;

        /* renamed from: f  reason: collision with root package name */
        public final float f3312f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3313g;

        /* renamed from: h  reason: collision with root package name */
        public final int f3314h;

        /* renamed from: i  reason: collision with root package name */
        public ColorStateList f3315i;

        /* renamed from: j  reason: collision with root package name */
        public PorterDuff.Mode f3316j;

        /* loaded from: classes.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Context context, AttributeSet attributeSet) {
            super(o3.a.a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, c.b.f2657d0);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.i.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f3310d = obtainStyledAttributes.getInt(2, 0);
            if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
                this.f3309c = new i(i.b(context2, attributeSet, 0, 0));
            }
            this.f3311e = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(d3.c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(q.d(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f3312f = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f3313g = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f3314h = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f3307k);
            setFocusable(true);
            if (getBackground() == null) {
                int p5 = c.a.p(getBackgroundOverlayColorAlpha(), c.a.m(this, R.attr.colorSurface), c.a.m(this, R.attr.colorOnSurface));
                i iVar = this.f3309c;
                if (iVar != null) {
                    int i6 = BaseTransientBottomBar.f3305a;
                    f fVar = new f(iVar);
                    fVar.k(ColorStateList.valueOf(p5));
                    gradientDrawable = fVar;
                } else {
                    Resources resources = getResources();
                    int i7 = BaseTransientBottomBar.f3305a;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(p5);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.f3315i;
                if (colorStateList != null) {
                    a.b.h(gradientDrawable, colorStateList);
                }
                WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                g0.d.q(this, gradientDrawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f3308b = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f3312f;
        }

        public int getAnimationMode() {
            return this.f3310d;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f3311e;
        }

        public int getMaxInlineActionWidth() {
            return this.f3314h;
        }

        public int getMaxWidth() {
            return this.f3313g;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f3308b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.h.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f3308b != null) {
                synchronized (j3.a.a().f4721a) {
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
            super.onLayout(z5, i6, i7, i8, i9);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i6, int i7) {
            super.onMeasure(i6, i7);
            int i8 = this.f3313g;
            if (i8 <= 0 || getMeasuredWidth() <= i8) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), i7);
        }

        public void setAnimationMode(int i6) {
            this.f3310d = i6;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f3315i != null) {
                drawable = drawable.mutate();
                a.b.h(drawable, this.f3315i);
                a.b.i(drawable, this.f3316j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f3315i = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.h(mutate, colorStateList);
                a.b.i(mutate, this.f3316j);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f3316j = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.i(mutate, mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                if (this.f3308b != null) {
                    int i6 = BaseTransientBottomBar.f3305a;
                    throw null;
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f3307k);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        LinearInterpolator linearInterpolator = h2.a.f4422a;
        new Handler(Looper.getMainLooper(), new a());
    }
}
