package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import h2.g;
import h3.i;
import h3.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.h;
import l2.b;
import l2.e;
import z2.s;
/* loaded from: classes.dex */
public final class FloatingActionButton extends s implements x2.a, m, CoordinatorLayout.b {

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f3199c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f3200d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f3201e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f3202f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f3203g;

    /* renamed from: h  reason: collision with root package name */
    public int f3204h;

    /* renamed from: i  reason: collision with root package name */
    public int f3205i;

    /* renamed from: j  reason: collision with root package name */
    public int f3206j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3207k;

    /* renamed from: l  reason: collision with root package name */
    public y2.c f3208l;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3209a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3210b;

        public BaseBehavior() {
            this.f3210b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.K);
            this.f3210b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1236h == 0) {
                fVar.f1236h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z5;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z5 = ((CoordinatorLayout.f) layoutParams).f1229a instanceof BottomSheetBehavior;
                } else {
                    z5 = false;
                }
                if (z5) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
            boolean z5;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList e6 = coordinatorLayout.e(floatingActionButton);
            int size = e6.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view2 = (View) e6.get(i7);
                if (view2 instanceof AppBarLayout) {
                    if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z5 = ((CoordinatorLayout.f) layoutParams).f1229a instanceof BottomSheetBehavior;
                    } else {
                        z5 = false;
                    }
                    if (z5 && u(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.q(floatingActionButton, i6);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.f3210b || fVar.f1234f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (s(appBarLayout, floatingActionButton)) {
                if (this.f3209a == null) {
                    this.f3209a = new Rect();
                }
                Rect rect = this.f3209a;
                z2.d.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.g(null, false);
                    return true;
                }
                floatingActionButton.k(null, false);
                return true;
            }
            return false;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (s(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.g(null, false);
                    return true;
                }
                floatingActionButton.k(null, false);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements g3.b {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c<T extends FloatingActionButton> implements d.f {
        public c(FloatingActionButton floatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                ((c) obj).getClass();
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private d getImpl() {
        if (this.f3208l == null) {
            this.f3208l = new y2.c(this, new b());
        }
        return this.f3208l;
    }

    @Override // x2.a
    public final boolean a() {
        throw null;
    }

    public final void c() {
        d impl = getImpl();
        if (impl.f3238o == null) {
            impl.f3238o = new ArrayList<>();
        }
        impl.f3238o.add(null);
    }

    public final void d(e eVar) {
        d impl = getImpl();
        if (impl.f3237n == null) {
            impl.f3237n = new ArrayList<>();
        }
        impl.f3237n.add(eVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().i(getDrawableState());
    }

    public final void e() {
        d impl = getImpl();
        c cVar = new c(this);
        if (impl.f3239p == null) {
            impl.f3239p = new ArrayList<>();
        }
        impl.f3239p.add(cVar);
    }

    public final int f(int i6) {
        int i7 = this.f3205i;
        if (i7 != 0) {
            return i7;
        }
        Resources resources = getResources();
        if (i6 != -1) {
            return resources.getDimensionPixelSize(i6 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public final void g(l2.b bVar, boolean z5) {
        com.google.android.material.floatingactionbutton.a aVar;
        boolean z6;
        int i6;
        AnimatorSet c6;
        d impl = getImpl();
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = new com.google.android.material.floatingactionbutton.a(this, bVar);
        }
        boolean z7 = true;
        if (impl.f3240q.getVisibility() != 0 ? impl.f3236m != 2 : impl.f3236m == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            Animator animator = impl.f3230g;
            if (animator != null) {
                animator.cancel();
            }
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            FloatingActionButton floatingActionButton = impl.f3240q;
            if (!g0.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z7 = false;
            }
            if (z7) {
                g gVar = impl.f3232i;
                if (gVar != null) {
                    c6 = impl.b(gVar, 0.0f, 0.0f, 0.0f);
                } else {
                    c6 = impl.c(0.0f, 0.4f, 0.4f, d.A, d.B);
                }
                c6.addListener(new com.google.android.material.floatingactionbutton.b(impl, z5, aVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f3238o;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c6.addListener(it.next());
                    }
                }
                c6.start();
                return;
            }
            if (z5) {
                i6 = 8;
            } else {
                i6 = 4;
            }
            floatingActionButton.b(i6, z5);
            if (aVar != null) {
                aVar.f3212a.a(aVar.f3213b);
            }
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f3199c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f3200d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f3228e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f3229f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.f3205i;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().f3232i;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f3203g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f3203g;
    }

    public i getShapeAppearanceModel() {
        i iVar = getImpl().f3224a;
        iVar.getClass();
        return iVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f3231h;
    }

    public int getSize() {
        return this.f3204h;
    }

    public int getSizeDimension() {
        return f(this.f3204h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f3201e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f3202f;
    }

    public boolean getUseCompatPadding() {
        return this.f3207k;
    }

    public final boolean h() {
        d impl = getImpl();
        int visibility = impl.f3240q.getVisibility();
        int i6 = impl.f3236m;
        if (visibility == 0) {
            if (i6 != 1) {
                return false;
            }
        } else if (i6 == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        d impl = getImpl();
        int visibility = impl.f3240q.getVisibility();
        int i6 = impl.f3236m;
        if (visibility != 0) {
            if (i6 != 2) {
                return false;
            }
        } else if (i6 == 1) {
            return false;
        }
        return true;
    }

    public final void j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f3201e;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f3202f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(j.c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().g();
    }

    public final void k(b.a aVar, boolean z5) {
        com.google.android.material.floatingactionbutton.a aVar2;
        boolean z6;
        boolean z7;
        AnimatorSet c6;
        float f6;
        float f7;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new com.google.android.material.floatingactionbutton.a(this, aVar);
        }
        boolean z8 = true;
        if (impl.f3240q.getVisibility() == 0 ? impl.f3236m != 1 : impl.f3236m == 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            Animator animator = impl.f3230g;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.f3231h == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            FloatingActionButton floatingActionButton = impl.f3240q;
            if (!g0.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z8 = false;
            }
            Matrix matrix = impl.f3243v;
            if (z8) {
                if (floatingActionButton.getVisibility() != 0) {
                    float f8 = 0.0f;
                    floatingActionButton.setAlpha(0.0f);
                    if (z7) {
                        f6 = 0.4f;
                    } else {
                        f6 = 0.0f;
                    }
                    floatingActionButton.setScaleY(f6);
                    if (z7) {
                        f7 = 0.4f;
                    } else {
                        f7 = 0.0f;
                    }
                    floatingActionButton.setScaleX(f7);
                    if (z7) {
                        f8 = 0.4f;
                    }
                    impl.f3234k = f8;
                    impl.a(f8, matrix);
                    floatingActionButton.setImageMatrix(matrix);
                }
                g gVar = impl.f3231h;
                if (gVar != null) {
                    c6 = impl.b(gVar, 1.0f, 1.0f, 1.0f);
                } else {
                    c6 = impl.c(1.0f, 1.0f, 1.0f, d.f3222y, d.f3223z);
                }
                c6.addListener(new com.google.android.material.floatingactionbutton.c(impl, z5, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f3237n;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c6.addListener(it.next());
                    }
                }
                c6.start();
                return;
            }
            floatingActionButton.b(0, z5);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f3234k = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.f3212a.b();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        impl.getClass();
        if (!(impl instanceof y2.c)) {
            ViewTreeObserver viewTreeObserver = impl.f3240q.getViewTreeObserver();
            if (impl.f3244w == null) {
                impl.f3244w = new y2.b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f3244w);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f3240q.getViewTreeObserver();
        y2.b bVar = impl.f3244w;
        if (bVar != null) {
            viewTreeObserver.removeOnPreDrawListener(bVar);
            impl.f3244w = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i6, int i7) {
        int sizeDimension = (getSizeDimension() - this.f3206j) / 2;
        getImpl().n();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k3.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k3.a aVar = (k3.a) parcelable;
        super.onRestoreInstanceState(aVar.f5073b);
        aVar.f4939d.getOrDefault("expandableWidgetHelper", null).getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        new h();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            if (g0.g.c(this)) {
                getWidth();
                getHeight();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3199c != colorStateList) {
            this.f3199c = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3200d != mode) {
            this.f3200d = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f6) {
        d impl = getImpl();
        if (impl.f3227d != f6) {
            impl.f3227d = f6;
            impl.j(f6, impl.f3228e, impl.f3229f);
        }
    }

    public void setCompatElevationResource(int i6) {
        setCompatElevation(getResources().getDimension(i6));
    }

    public void setCompatHoveredFocusedTranslationZ(float f6) {
        d impl = getImpl();
        if (impl.f3228e != f6) {
            impl.f3228e = f6;
            impl.j(impl.f3227d, f6, impl.f3229f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i6) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i6));
    }

    public void setCompatPressedTranslationZ(float f6) {
        d impl = getImpl();
        if (impl.f3229f != f6) {
            impl.f3229f = f6;
            impl.j(impl.f3227d, impl.f3228e, f6);
        }
    }

    public void setCompatPressedTranslationZResource(int i6) {
        setCompatPressedTranslationZ(getResources().getDimension(i6));
    }

    public void setCustomSize(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i6 != this.f3205i) {
            this.f3205i = i6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z5) {
        if (z5 != getImpl().f3225b) {
            getImpl().f3225b = z5;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i6) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f3232i = gVar;
    }

    public void setHideMotionSpecResource(int i6) {
        setHideMotionSpec(g.a(getContext(), i6));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f6 = impl.f3234k;
            impl.f3234k = f6;
            Matrix matrix = impl.f3243v;
            impl.a(f6, matrix);
            impl.f3240q.setImageMatrix(matrix);
            if (this.f3201e != null) {
                j();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        throw null;
    }

    public void setMaxImageSize(int i6) {
        this.f3206j = i6;
        d impl = getImpl();
        if (impl.f3235l != i6) {
            impl.f3235l = i6;
            float f6 = impl.f3234k;
            impl.f3234k = f6;
            Matrix matrix = impl.f3243v;
            impl.a(f6, matrix);
            impl.f3240q.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i6) {
        setRippleColor(ColorStateList.valueOf(i6));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f3203g != colorStateList) {
            this.f3203g = colorStateList;
            getImpl().l();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f6) {
        super.setScaleX(f6);
        ArrayList<d.f> arrayList = getImpl().f3239p;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f6) {
        super.setScaleY(f6);
        ArrayList<d.f> arrayList = getImpl().f3239p;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z5) {
        d impl = getImpl();
        impl.f3226c = z5;
        impl.n();
        throw null;
    }

    @Override // h3.m
    public void setShapeAppearanceModel(i iVar) {
        getImpl().f3224a = iVar;
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f3231h = gVar;
    }

    public void setShowMotionSpecResource(int i6) {
        setShowMotionSpec(g.a(getContext(), i6));
    }

    public void setSize(int i6) {
        this.f3205i = 0;
        if (i6 != this.f3204h) {
            this.f3204h = i6;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3201e != colorStateList) {
            this.f3201e = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3202f != mode) {
            this.f3202f = mode;
            j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f6) {
        super.setTranslationX(f6);
        getImpl().k();
    }

    @Override // android.view.View
    public void setTranslationY(float f6) {
        super.setTranslationY(f6);
        getImpl().k();
    }

    @Override // android.view.View
    public void setTranslationZ(float f6) {
        super.setTranslationZ(f6);
        getImpl().k();
    }

    public void setUseCompatPadding(boolean z5) {
        if (this.f3207k != z5) {
            this.f3207k = z5;
            getImpl().h();
        }
    }

    @Override // z2.s, android.widget.ImageView, android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
    }
}
