package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l2.c;
import l2.d;
import l2.e;
import l2.f;
import z.a;
import z2.q;
/* loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ int f2940h0 = 0;
    public Integer S;
    public Animator T;
    public Animator U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public int f2941a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f2942b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f2943c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2944d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2945e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f2946f0;

    /* renamed from: g0  reason: collision with root package name */
    public Behavior f2947g0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: j  reason: collision with root package name */
        public final Rect f2948j;

        /* renamed from: k  reason: collision with root package name */
        public WeakReference<BottomAppBar> f2949k;

        /* renamed from: l  reason: collision with root package name */
        public int f2950l;

        /* renamed from: m  reason: collision with root package name */
        public final a f2951m;

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f2949k.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (!(view instanceof FloatingActionButton)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (behavior.f2950l == 0) {
                        int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                        int i14 = bottomAppBar.f2941a0;
                        if (i14 == 1) {
                            ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight);
                        } else if (i14 == 0) {
                            ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = ((bottomAppBar.getBottomInset() + bottomAppBar.getMeasuredHeight()) - view.getMeasuredHeight()) / 2;
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (q.c(view)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += 0;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += 0;
                            return;
                        }
                    }
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                behavior.f2948j.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
            this.f2951m = new a();
            this.f2948j = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2951m = new a();
            this.f2948j = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f2949k = new WeakReference<>(bottomAppBar);
            int i7 = BottomAppBar.f2940h0;
            View y5 = bottomAppBar.y();
            if (y5 != null) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                if (!g0.g.c(y5)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) y5.getLayoutParams();
                    fVar.f1232d = 17;
                    int i8 = bottomAppBar.f2941a0;
                    if (i8 == 1) {
                        fVar.f1232d = 49;
                    }
                    if (i8 == 0) {
                        fVar.f1232d |= 80;
                    }
                    this.f2950l = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) y5.getLayoutParams())).bottomMargin;
                    if (y5 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) y5;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.c();
                        floatingActionButton.d(new e(bottomAppBar));
                        floatingActionButton.e();
                    }
                    y5.addOnLayoutChangeListener(this.f2951m);
                    bottomAppBar.C();
                    throw null;
                }
            }
            coordinatorLayout.q(bottomAppBar, i6);
            super.h(coordinatorLayout, bottomAppBar, i6);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i7) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i6, i7)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f2953b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2954c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f2955d;

        public a(ActionMenuView actionMenuView, int i6, boolean z5) {
            this.f2953b = actionMenuView;
            this.f2954c = i6;
            this.f2955d = z5;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i6 = this.f2954c;
            boolean z5 = this.f2955d;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f2953b;
            actionMenuView.setTranslationX(bottomAppBar.z(actionMenuView, i6, z5));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public int f2957d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2958e;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new b[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2957d = parcel.readInt();
            this.f2958e = parcel.readInt() != 0;
        }

        public b(Toolbar.i iVar) {
            super(iVar);
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeInt(this.f2957d);
            parcel.writeInt(this.f2958e ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return a3.a.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return A(this.V);
    }

    private float getFabTranslationY() {
        if (this.f2941a0 == 1) {
            return -getTopEdgeTreatment().f5125d;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private f getTopEdgeTreatment() {
        throw null;
    }

    public final float A(int i6) {
        boolean c6 = q.c(this);
        if (i6 == 1) {
            View y5 = y();
            int i7 = 0;
            if (this.f2942b0 != -1 && y5 != null) {
                i7 = 0 + (y5.getMeasuredWidth() / 2) + this.f2942b0;
            }
            return ((getMeasuredWidth() / 2) - i7) * (c6 ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean B() {
        FloatingActionButton floatingActionButton;
        View y5 = y();
        if (y5 instanceof FloatingActionButton) {
            floatingActionButton = (FloatingActionButton) y5;
        } else {
            floatingActionButton = null;
        }
        if (floatingActionButton != null && floatingActionButton.i()) {
            return true;
        }
        return false;
    }

    public final void C() {
        f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.f2946f0) {
            B();
        }
        throw null;
    }

    public final void D(ActionMenuView actionMenuView, int i6, boolean z5, boolean z6) {
        a aVar = new a(actionMenuView, i6, z5);
        if (z6) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f2947g0 == null) {
            this.f2947g0 = new Behavior();
        }
        return this.f2947g0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f5125d;
    }

    public int getFabAlignmentMode() {
        return this.V;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f2942b0;
    }

    public int getFabAnchorMode() {
        return this.f2941a0;
    }

    public int getFabAnimationMode() {
        return this.W;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f5124c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f5123b;
    }

    public boolean getHideOnScroll() {
        return this.f2944d0;
    }

    public int getMenuAlignmentMode() {
        return this.f2943c0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.p(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        if (z5) {
            Animator animator = this.U;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.T;
            if (animator2 != null) {
                animator2.cancel();
            }
            C();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.U == null) {
            actionMenuView.setAlpha(1.0f);
            if (!B()) {
                D(actionMenuView, 0, false, false);
            } else {
                D(actionMenuView, this.V, this.f2946f0, false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f5073b);
        this.V = bVar.f2957d;
        this.f2946f0 = bVar.f2958e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b((Toolbar.i) super.onSaveInstanceState());
        bVar.f2957d = this.V;
        bVar.f2958e = this.f2946f0;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f6) {
        if (f6 != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (f6 >= 0.0f) {
                topEdgeTreatment.f5125d = f6;
                throw null;
            } else {
                topEdgeTreatment.getClass();
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        throw null;
    }

    public void setFabAlignmentMode(int i6) {
        int i7;
        this.f2945e0 = 0;
        boolean z5 = this.f2946f0;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (!g0.g.c(this)) {
            int i8 = this.f2945e0;
            if (i8 != 0) {
                this.f2945e0 = 0;
                getMenu().clear();
                m(i8);
            }
        } else {
            Animator animator = this.U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!B()) {
                z5 = false;
                i7 = 0;
            } else {
                i7 = i6;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                ofFloat.setDuration(0.8f * fabAlignmentAnimationDuration);
                if (Math.abs(actionMenuView.getTranslationX() - z(actionMenuView, i7, z5)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.setDuration(fabAlignmentAnimationDuration * 0.2f);
                    ofFloat2.addListener(new d(this, actionMenuView, i7, z5));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.U = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.U.start();
        }
        if (this.V != i6 && g0.g.c(this)) {
            Animator animator2 = this.T;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            FloatingActionButton floatingActionButton = null;
            if (this.W == 1) {
                View y5 = y();
                if (y5 instanceof FloatingActionButton) {
                    floatingActionButton = (FloatingActionButton) y5;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, "translationX", A(i6));
                ofFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(ofFloat3);
            } else {
                View y6 = y();
                if (y6 instanceof FloatingActionButton) {
                    floatingActionButton = (FloatingActionButton) y6;
                }
                if (floatingActionButton != null && !floatingActionButton.h()) {
                    floatingActionButton.g(new l2.b(this, i6), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            animatorSet3.setInterpolator(a3.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, h2.a.f4422a));
            this.T = animatorSet3;
            animatorSet3.addListener(new l2.a(this));
            this.T.start();
        }
        this.V = i6;
    }

    public void setFabAlignmentModeEndMargin(int i6) {
        if (this.f2942b0 == i6) {
            return;
        }
        this.f2942b0 = i6;
        C();
        throw null;
    }

    public void setFabAnchorMode(int i6) {
        this.f2941a0 = i6;
        C();
        throw null;
    }

    public void setFabAnimationMode(int i6) {
        this.W = i6;
    }

    public void setFabCornerSize(float f6) {
        if (f6 == getTopEdgeTreatment().f5126e) {
            return;
        }
        getTopEdgeTreatment().f5126e = f6;
        throw null;
    }

    public void setFabCradleMargin(float f6) {
        if (f6 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f5124c = f6;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f6) {
        if (f6 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f5123b = f6;
        throw null;
    }

    public void setHideOnScroll(boolean z5) {
        this.f2944d0 = z5;
    }

    public void setMenuAlignmentMode(int i6) {
        if (this.f2943c0 != i6) {
            this.f2943c0 = i6;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                D(actionMenuView, this.V, B(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.S != null) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.S.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i6) {
        this.S = Integer.valueOf(i6);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View y() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            m.c r2 = r0.f1210c
            java.lang.Object r2 = r2.f5160b
            l.h r2 = (l.h) r2
            java.lang.Object r2 = r2.getOrDefault(r4, r1)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r0 = r0.f1212e
            r0.clear()
            if (r2 == 0) goto L26
            r0.addAll(r2)
        L26:
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L3e
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L2a
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.y():android.view.View");
    }

    public final int z(ActionMenuView actionMenuView, int i6, boolean z5) {
        int i7;
        if (this.f2943c0 == 1 || (i6 == 1 && z5)) {
            boolean c6 = q.c(this);
            int measuredWidth = c6 ? getMeasuredWidth() : 0;
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f3568a & 8388615) == 8388611) {
                    measuredWidth = c6 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
                }
            }
            int right = c6 ? actionMenuView.getRight() : actionMenuView.getLeft();
            if (getNavigationIcon() == null) {
                i7 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
                if (!c6) {
                    i7 = -i7;
                }
            } else {
                i7 = 0;
            }
            return measuredWidth - ((right + 0) + i7);
        }
        return 0;
    }
}
