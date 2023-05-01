package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import f0.g0;
import f0.r0;
import h2.g;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* loaded from: classes.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3196a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3197b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3198c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f3197b = false;
            this.f3198c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.J);
            this.f3197b = obtainStyledAttributes.getBoolean(0, false);
            this.f3198c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean a(View view) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
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
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z5 = ((CoordinatorLayout.f) layoutParams).f1229a instanceof BottomSheetBehavior;
                } else {
                    z5 = false;
                }
                if (z5) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
            boolean z5;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList e6 = coordinatorLayout.e(extendedFloatingActionButton);
            int size = e6.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view2 = (View) e6.get(i7);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z5 = ((CoordinatorLayout.f) layoutParams).f1229a instanceof BottomSheetBehavior;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.q(extendedFloatingActionButton, i6);
            return true;
        }

        public final void s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z5;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z6 = this.f3197b;
            int i6 = 1;
            int i7 = 0;
            boolean z7 = this.f3198c;
            if ((!z6 && !z7) || fVar.f1234f != appBarLayout.getId()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                return;
            }
            if (this.f3196a == null) {
                this.f3196a = new Rect();
            }
            Rect rect = this.f3196a;
            z2.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (z7) {
                    i6 = 2;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i6);
                throw null;
            }
            if (z7) {
                i7 = 3;
            }
            ExtendedFloatingActionButton.e(extendedFloatingActionButton, i7);
            throw null;
        }

        public final void t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z5;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z6 = this.f3197b;
            int i6 = 1;
            int i7 = 0;
            boolean z7 = this.f3198c;
            if ((!z6 && !z7) || fVar.f1234f != view.getId()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                return;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (z7) {
                    i6 = 2;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i6);
                throw null;
            }
            if (z7) {
                i7 = 3;
            }
            ExtendedFloatingActionButton.e(extendedFloatingActionButton, i7);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "width");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            View view2 = view;
            view2.getLayoutParams().width = f6.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<View, Float> {
        public b() {
            super(Float.class, "height");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            View view2 = view;
            view2.getLayoutParams().height = f6.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c extends Property<View, Float> {
        public c() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            return Float.valueOf(g0.e.f(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            View view2 = view;
            int intValue = f6.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.e.k(view2, intValue, paddingTop, g0.e.e(view2), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes.dex */
    public class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            return Float.valueOf(g0.e.e(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            View view2 = view;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.e.k(view2, g0.e.f(view2), view2.getPaddingTop(), f6.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a();
        new b();
        new c();
        new d();
    }

    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i6) {
        if (i6 != 0 && i6 != 1 && i6 != 2 && i6 != 3) {
            throw new IllegalStateException(j.a("Unknown strategy type: ", i6));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z5) {
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i6) {
        setExtendMotionSpec(g.a(getContext(), i6));
    }

    public void setExtended(boolean z5) {
        if (z5) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i6) {
        setHideMotionSpec(g.a(getContext(), i6));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i6, int i7, int i8, int i9) {
        super.setPadding(i6, i7, i8, i9);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i6, int i7, int i8, int i9) {
        super.setPaddingRelative(i6, i7, i8, i9);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i6) {
        setShowMotionSpec(g.a(getContext(), i6));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i6) {
        setShrinkMotionSpec(g.a(getContext(), i6));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i6) {
        super.setTextColor(i6);
        getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
