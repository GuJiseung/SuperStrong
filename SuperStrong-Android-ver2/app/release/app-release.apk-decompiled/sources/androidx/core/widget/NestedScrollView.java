package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import f0.s;
import f0.t;
import f0.v;
import f0.w;
import g0.f;
import g0.h;
import j0.d;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements v, s {
    public static final float B = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a C = new a();
    public static final int[] D = {16843130};
    public float A;

    /* renamed from: b  reason: collision with root package name */
    public final float f1265b;

    /* renamed from: c  reason: collision with root package name */
    public long f1266c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f1267d;

    /* renamed from: e  reason: collision with root package name */
    public OverScroller f1268e;

    /* renamed from: f  reason: collision with root package name */
    public final EdgeEffect f1269f;

    /* renamed from: g  reason: collision with root package name */
    public final EdgeEffect f1270g;

    /* renamed from: h  reason: collision with root package name */
    public int f1271h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1272i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1273j;

    /* renamed from: k  reason: collision with root package name */
    public View f1274k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1275l;

    /* renamed from: m  reason: collision with root package name */
    public VelocityTracker f1276m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1277n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1278o;

    /* renamed from: p  reason: collision with root package name */
    public int f1279p;

    /* renamed from: q  reason: collision with root package name */
    public int f1280q;

    /* renamed from: r  reason: collision with root package name */
    public int f1281r;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f1282t;
    public final int[] u;

    /* renamed from: v  reason: collision with root package name */
    public int f1283v;

    /* renamed from: w  reason: collision with root package name */
    public int f1284w;

    /* renamed from: x  reason: collision with root package name */
    public d f1285x;

    /* renamed from: y  reason: collision with root package name */
    public final w f1286y;

    /* renamed from: z  reason: collision with root package name */
    public final t f1287z;

    /* loaded from: classes.dex */
    public static class a extends f0.a {
        @Override // f0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z5;
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            accessibilityEvent.setScrollable(z5);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            h.c(accessibilityEvent, nestedScrollView.getScrollX());
            h.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // f0.a
        public final void d(View view, f fVar) {
            int scrollRange;
            View.AccessibilityDelegate accessibilityDelegate = this.f3856a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfo.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                fVar.i(true);
                if (nestedScrollView.getScrollY() > 0) {
                    fVar.b(f.a.f4100g);
                    fVar.b(f.a.f4104k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    fVar.b(f.a.f4099f);
                    fVar.b(f.a.f4105l);
                }
            }
        }

        @Override // f0.a
        public final boolean g(View view, int i6, Bundle bundle) {
            if (super.g(view, i6, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i6 != 4096) {
                if (i6 != 8192 && i6 != 16908344) {
                    if (i6 != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f1288b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i6) {
                return new d[i6];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f1288b = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1288b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f1288b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f1267d = new Rect();
        this.f1272i = true;
        this.f1273j = false;
        this.f1274k = null;
        this.f1275l = false;
        this.f1278o = true;
        this.s = -1;
        this.f1282t = new int[2];
        this.u = new int[2];
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            edgeEffect = d.b.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1269f = edgeEffect;
        if (i6 >= 31) {
            edgeEffect2 = d.b.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1270g = edgeEffect2;
        this.f1265b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1268e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1279p = viewConfiguration.getScaledTouchSlop();
        this.f1280q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1281r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1286y = new w();
        this.f1287z = new t(this);
        setNestedScrollingEnabled(true);
        g0.l(this, C);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.A;
    }

    public static boolean k(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, view2);
    }

    public final boolean a(int i6) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i6);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && l(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f1267d;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            d(c(rect));
            findNextFocus.requestFocus(i6);
        } else {
            if (i6 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i6 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i6 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            d(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && (!l(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i6, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // f0.u
    public final void b(View view, View view2, int i6, int i7) {
        w wVar = this.f1286y;
        if (i7 == 1) {
            wVar.f3919b = i6;
        } else {
            wVar.f3918a = i6;
        }
        this.f1287z.g(2, i7);
    }

    public final int c(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i7 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i6 - verticalFadingEdgeLength : i6;
        int i8 = rect.bottom;
        if (i8 > i7 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i7) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i6);
        } else if (rect.top >= scrollY || i8 >= i7) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i7 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final void d(int i6) {
        if (i6 != 0) {
            if (this.f1278o) {
                u(0, i6, false);
            } else {
                scrollBy(0, i6);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || f(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return this.f1287z.a(f6, f7, z5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return this.f1287z.b(f6, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return this.f1287z.c(i6, i7, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return this.f1287z.e(i6, i7, i8, i9, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i6;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1269f;
        int i7 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i6 = getPaddingLeft() + 0;
            } else {
                i6 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i6, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1270g;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i7 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i7 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                g0.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e() {
        this.f1275l = false;
        VelocityTracker velocityTracker = this.f1276m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1276m = null;
        }
        w(0);
        this.f1269f.onRelease();
        this.f1270g.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.view.KeyEvent r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.f(android.view.KeyEvent):boolean");
    }

    public final void g(int i6) {
        if (getChildCount() > 0) {
            this.f1268e.fling(getScrollX(), getScrollY(), 0, i6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1287z.g(2, 1);
            this.f1284w = getScrollY();
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.k(this);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        w wVar = this.f1286y;
        return wVar.f3919b | wVar.f3918a;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final boolean h(int i6) {
        int childCount;
        boolean z5 = i6 == 130;
        int height = getHeight();
        Rect rect = this.f1267d;
        rect.top = 0;
        rect.bottom = height;
        if (z5 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return s(i6, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1287z.f(0) != null;
    }

    @Override // f0.u
    public final void i(View view, int i6) {
        w wVar = this.f1286y;
        if (i6 == 1) {
            wVar.f3919b = 0;
        } else {
            wVar.f3918a = 0;
        }
        w(i6);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1287z.f3916d;
    }

    @Override // f0.u
    public final void j(View view, int i6, int i7, int[] iArr, int i8) {
        this.f1287z.c(i6, i7, iArr, null, i8);
    }

    public final boolean l(View view, int i6, int i7) {
        Rect rect = this.f1267d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i6 >= getScrollY() && rect.top - i6 <= getScrollY() + i7;
    }

    @Override // f0.v
    public final void m(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        p(i9, i10, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i6, int i7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // f0.u
    public final void n(View view, int i6, int i7, int i8, int i9, int i10) {
        p(i9, i10, null);
    }

    @Override // f0.u
    public final boolean o(View view, View view2, int i6, int i7) {
        return (i6 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1273j = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto Lbe
            boolean r0 = r8.f1275l
            if (r0 != 0) goto Lbe
            r0 = 2
            boolean r0 = c.a.o(r9, r0)
            r1 = 0
            if (r0 == 0) goto L18
            r0 = 9
            goto L22
        L18:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = c.a.o(r9, r0)
            if (r0 == 0) goto L27
            r0 = 26
        L22:
            float r0 = r9.getAxisValue(r0)
            goto L28
        L27:
            r0 = r1
        L28:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto Lbe
            float r1 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r0 >= 0) goto L79
            int r1 = r8.getOverScrollMode()
            if (r1 == 0) goto L54
            if (r1 != r4) goto L52
            int r1 = r8.getScrollRange()
            if (r1 <= 0) goto L52
            goto L54
        L52:
            r1 = r2
            goto L55
        L54:
            r1 = r4
        L55:
            if (r1 == 0) goto L5f
            boolean r9 = c.a.o(r9, r6)
            if (r9 != 0) goto L5f
            r9 = r4
            goto L60
        L5f:
            r9 = r2
        L60:
            if (r9 == 0) goto L77
            float r9 = (float) r0
            float r9 = -r9
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.widget.EdgeEffect r0 = r8.f1269f
            j0.d.b(r0, r9, r5)
            r0.onRelease()
            r8.invalidate()
            r9 = r4
            goto Lb3
        L77:
            r9 = r2
            goto Lb3
        L79:
            if (r0 <= r1) goto Lb1
            int r7 = r8.getOverScrollMode()
            if (r7 == 0) goto L8c
            if (r7 != r4) goto L8a
            int r7 = r8.getScrollRange()
            if (r7 <= 0) goto L8a
            goto L8c
        L8a:
            r7 = r2
            goto L8d
        L8c:
            r7 = r4
        L8d:
            if (r7 == 0) goto L97
            boolean r9 = c.a.o(r9, r6)
            if (r9 != 0) goto L97
            r9 = r4
            goto L98
        L97:
            r9 = r2
        L98:
            if (r9 == 0) goto Lae
            int r0 = r0 - r1
            float r9 = (float) r0
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.widget.EdgeEffect r0 = r8.f1270g
            j0.d.b(r0, r9, r5)
            r0.onRelease()
            r8.invalidate()
            r2 = r4
        Lae:
            r9 = r2
            r2 = r1
            goto Lb3
        Lb1:
            r9 = r2
            r2 = r0
        Lb3:
            if (r2 == r3) goto Lbd
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r2)
            return r4
        Lbd:
            return r9
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int i10;
        super.onLayout(z5, i6, i7, i8, i9);
        int i11 = 0;
        this.f1272i = false;
        View view = this.f1274k;
        if (view != null && k(view, this)) {
            View view2 = this.f1274k;
            Rect rect = this.f1267d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c6 = c(rect);
            if (c6 != 0) {
                scrollBy(0, c6);
            }
        }
        this.f1274k = null;
        if (!this.f1273j) {
            if (this.f1285x != null) {
                scrollTo(getScrollX(), this.f1285x.f1288b);
                this.f1285x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i10 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i10 = 0;
            }
            int paddingTop = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i10 && scrollY >= 0) {
                i11 = paddingTop + scrollY > i10 ? i10 - paddingTop : scrollY;
            }
            if (i11 != scrollY) {
                scrollTo(getScrollX(), i11);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1273j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.f1277n && View.MeasureSpec.getMode(i7) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        if (z5) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        g((int) f7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return dispatchNestedPreFling(f6, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        j(view, i6, i7, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        p(i9, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        b(view, view2, i6, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i6, int i7, boolean z5, boolean z6) {
        super.scrollTo(i6, i7);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        View findNextFocusFromRect;
        if (i6 == 2) {
            i6 = 130;
        } else if (i6 == 1) {
            i6 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = focusFinder.findNextFocus(this, null, i6);
        } else {
            findNextFocusFromRect = focusFinder.findNextFocusFromRect(this, rect, i6);
        }
        if (findNextFocusFromRect == null || (true ^ l(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i6, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f1285x = dVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1288b = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i6, int i7, int i8, int i9) {
        super.onScrollChanged(i6, i7, i8, i9);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i9)) {
            return;
        }
        Rect rect = this.f1267d;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        d(c(rect));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        return o(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x024e, code lost:
        if (t(r10, r2) != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i6, int i7, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i6);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1287z.d(scrollY2, i6 - scrollY2, i7, iArr);
    }

    public final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.s) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.f1271h = (int) motionEvent.getY(i6);
            this.s = motionEvent.getPointerId(i6);
            VelocityTracker velocityTracker = this.f1276m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L1a
        L17:
            r11 = r0
            r10 = r1
            goto L1e
        L1a:
            if (r11 >= 0) goto L1d
            goto L17
        L1d:
            r10 = r0
        L1e:
            if (r12 <= r13) goto L23
            r12 = r13
        L21:
            r13 = r1
            goto L28
        L23:
            if (r12 >= 0) goto L27
            r12 = r0
            goto L21
        L27:
            r13 = r0
        L28:
            if (r13 == 0) goto L45
            f0.t r2 = r9.f1287z
            android.view.ViewParent r2 = r2.f(r1)
            if (r2 == 0) goto L34
            r2 = r1
            goto L35
        L34:
            r2 = r0
        L35:
            if (r2 != 0) goto L45
            android.widget.OverScroller r2 = r9.f1268e
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L45:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L4e
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r0
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(int, int, int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f1272i) {
            Rect rect = this.f1267d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c6 = c(rect);
            if (c6 != 0) {
                scrollBy(0, c6);
            }
        } else {
            this.f1274k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        boolean z6;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int c6 = c(rect);
        if (c6 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            if (z5) {
                scrollBy(0, c6);
            } else {
                u(0, c6, false);
            }
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        VelocityTracker velocityTracker;
        if (z5 && (velocityTracker = this.f1276m) != null) {
            velocityTracker.recycle();
            this.f1276m = null;
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1272i = true;
        super.requestLayout();
    }

    public final boolean s(int i6, int i7, int i8) {
        boolean z5;
        int i9;
        boolean z6;
        boolean z7;
        boolean z8;
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        if (i6 == 33) {
            z5 = true;
        } else {
            z5 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z9 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = focusables.get(i11);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                if (i7 < top && bottom < i8) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (view == null) {
                    view = view2;
                    z9 = z7;
                } else {
                    if ((z5 && top < view.getTop()) || (!z5 && bottom > view.getBottom())) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z9) {
                        if (z7) {
                            if (!z8) {
                            }
                            view = view2;
                        }
                    } else if (z7) {
                        view = view2;
                        z9 = true;
                    } else {
                        if (!z8) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i7 >= scrollY && i8 <= i10) {
            z6 = false;
        } else {
            if (z5) {
                i9 = i7 - scrollY;
            } else {
                i9 = i8 - i10;
            }
            d(i9);
            z6 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i6);
        }
        return z6;
    }

    @Override // android.view.View
    public final void scrollTo(int i6, int i7) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i6 < 0) {
                i6 = 0;
            } else if (width + i6 > width2) {
                i6 = width2 - width;
            }
            if (height >= height2 || i7 < 0) {
                i7 = 0;
            } else if (height + i7 > height2) {
                i7 = height2 - height;
            }
            if (i6 == getScrollX() && i7 == getScrollY()) {
                return;
            }
            super.scrollTo(i6, i7);
        }
    }

    public void setFillViewport(boolean z5) {
        if (z5 != this.f1277n) {
            this.f1277n = z5;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        t tVar = this.f1287z;
        if (tVar.f3916d) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.i.z(tVar.f3915c);
        }
        tVar.f3916d = z5;
    }

    public void setOnScrollChangeListener(c cVar) {
    }

    public void setSmoothScrollingEnabled(boolean z5) {
        this.f1278o = z5;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i6) {
        return this.f1287z.g(i6, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i6) {
        if (i6 > 0) {
            return true;
        }
        float a6 = j0.d.a(edgeEffect) * getHeight();
        float f6 = this.f1265b * 0.015f;
        double log = Math.log((Math.abs(-i6) * 0.35f) / f6);
        double d6 = B;
        if (((float) (Math.exp((d6 / (d6 - 1.0d)) * log) * f6)) < a6) {
            return true;
        }
        return false;
    }

    public final void u(int i6, int i7, boolean z5) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1266c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f1268e;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i7 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z5) {
                this.f1287z.g(2, 1);
            } else {
                w(1);
            }
            this.f1284w = getScrollY();
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.k(this);
        } else {
            if (!this.f1268e.isFinished()) {
                this.f1268e.abortAnimation();
                w(1);
            }
            scrollBy(i6, i7);
        }
        this.f1266c = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z5;
        EdgeEffect edgeEffect = this.f1269f;
        if (j0.d.a(edgeEffect) != 0.0f) {
            j0.d.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z5 = true;
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.f1270g;
        if (j0.d.a(edgeEffect2) != 0.0f) {
            j0.d.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z5;
    }

    public final void w(int i6) {
        this.f1287z.h(i6);
    }
}
