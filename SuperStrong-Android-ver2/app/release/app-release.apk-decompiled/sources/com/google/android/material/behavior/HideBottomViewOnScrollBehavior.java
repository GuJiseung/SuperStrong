package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.superstrong.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<b> f2917a;

    /* renamed from: b  reason: collision with root package name */
    public int f2918b;

    /* renamed from: c  reason: collision with root package name */
    public int f2919c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f2920d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f2921e;

    /* renamed from: f  reason: collision with root package name */
    public int f2922f;

    /* renamed from: g  reason: collision with root package name */
    public int f2923g;

    /* renamed from: h  reason: collision with root package name */
    public int f2924h;

    /* renamed from: i  reason: collision with root package name */
    public ViewPropertyAnimator f2925i;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f2925i = null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f2917a = new LinkedHashSet<>();
        this.f2922f = 0;
        this.f2923g = 2;
        this.f2924h = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2917a = new LinkedHashSet<>();
        this.f2922f = 0;
        this.f2923g = 2;
        this.f2924h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i6) {
        this.f2922f = v2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v2.getLayoutParams()).bottomMargin;
        this.f2918b = a3.a.c(v2.getContext(), R.attr.motionDurationLong2, 225);
        this.f2919c = a3.a.c(v2.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2920d = a3.a.d(v2.getContext(), R.attr.motionEasingEmphasizedInterpolator, h2.a.f4425d);
        this.f2921e = a3.a.d(v2.getContext(), R.attr.motionEasingEmphasizedInterpolator, h2.a.f4424c);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
        LinkedHashSet<b> linkedHashSet = this.f2917a;
        boolean z5 = false;
        if (i6 > 0) {
            if (this.f2923g == 1) {
                z5 = true;
            }
            if (!z5) {
                ViewPropertyAnimator viewPropertyAnimator = this.f2925i;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f2923g = 1;
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                s(view, this.f2922f + this.f2924h, this.f2919c, this.f2921e);
            }
        } else if (i6 < 0) {
            if (this.f2923g == 2) {
                z5 = true;
            }
            if (!z5) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f2925i;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f2923g = 2;
                Iterator<b> it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
                s(view, 0, this.f2918b, this.f2920d);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i6, int i7) {
        return i6 == 2;
    }

    public final void s(V v2, int i6, long j5, TimeInterpolator timeInterpolator) {
        this.f2925i = v2.animate().translationY(i6).setInterpolator(timeInterpolator).setDuration(j5).setListener(new a());
    }
}
