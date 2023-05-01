package d1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import w.a;
/* loaded from: classes.dex */
public final class b extends ViewGroup {

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f3747v = {16842931};

    /* renamed from: b  reason: collision with root package name */
    public Parcelable f3748b;

    /* renamed from: c  reason: collision with root package name */
    public int f3749c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f3750d;

    /* renamed from: e  reason: collision with root package name */
    public int f3751e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3752f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3753g;

    /* renamed from: h  reason: collision with root package name */
    public int f3754h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3755i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3756j;

    /* renamed from: k  reason: collision with root package name */
    public int f3757k;

    /* renamed from: l  reason: collision with root package name */
    public float f3758l;

    /* renamed from: m  reason: collision with root package name */
    public float f3759m;

    /* renamed from: n  reason: collision with root package name */
    public float f3760n;

    /* renamed from: o  reason: collision with root package name */
    public int f3761o;

    /* renamed from: p  reason: collision with root package name */
    public VelocityTracker f3762p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3763q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f3764r;
    public f s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f3765t;
    public int u;

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            cVar.getClass();
            cVar2.getClass();
            return 0;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: d1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0033b {
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static class d extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3766a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3767b;

        public d() {
            super(-1, -1);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f3747v);
            this.f3767b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(b bVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(int i6);
    }

    /* loaded from: classes.dex */
    public static class g extends l0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public int f3768d;

        /* renamed from: e  reason: collision with root package name */
        public Parcelable f3769e;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new g[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? g.class.getClassLoader() : classLoader;
            this.f3768d = parcel.readInt();
            this.f3769e = parcel.readParcelable(classLoader);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f3768d + "}";
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeInt(this.f3768d);
            parcel.writeParcelable(this.f3769e, i6);
        }
    }

    static {
        new a();
    }

    public static boolean b(int i6, int i7, int i8, View view, boolean z5) {
        int i9;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i10 = i7 + scrollX;
                if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && (i9 = i8 + scrollY) >= childAt.getTop() && i9 < childAt.getBottom() && b(i6, i10 - childAt.getLeft(), i9 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z5 && view.canScrollHorizontally(-i6);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z5) {
        if (this.f3753g != z5) {
            this.f3753g = z5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r3 >= r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r3 <= r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L8
            goto L62
        L8:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Le:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r5) goto L16
            r2 = 1
            goto L1c
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Le
        L1b:
            r2 = r1
        L1c:
            if (r2 != 0) goto L63
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L32:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L4b
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L32
        L4b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
        L62:
            r0 = 0
        L63:
            android.view.FocusFinder r2 = android.view.FocusFinder.getInstance()
            android.view.View r2 = r2.findNextFocus(r5, r0, r6)
            r3 = 17
            if (r2 == 0) goto L9e
            if (r2 == r0) goto L9e
            if (r6 != r3) goto L84
            android.graphics.Rect r3 = r5.c(r2)
            int r3 = r3.left
            android.graphics.Rect r4 = r5.c(r0)
            int r4 = r4.left
            if (r0 == 0) goto L99
            if (r3 < r4) goto L99
            goto L9e
        L84:
            r3 = 66
            if (r6 != r3) goto L9e
            android.graphics.Rect r3 = r5.c(r2)
            int r3 = r3.left
            android.graphics.Rect r4 = r5.c(r0)
            int r4 = r4.left
            if (r0 == 0) goto L99
            if (r3 > r4) goto L99
            goto L9e
        L99:
            boolean r0 = r2.requestFocus()
            r1 = r0
        L9e:
            if (r1 == 0) goto La7
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.a(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i6, int i7) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                if (getChildAt(i8).getVisibility() == 0) {
                    throw null;
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i7 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6).getVisibility() == 0) {
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        boolean z5;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new d();
        }
        d dVar = (d) layoutParams;
        boolean z6 = dVar.f3766a;
        if (view.getClass().getAnnotation(InterfaceC0033b.class) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        dVar.f3766a = z7;
        if (this.f3752f) {
            if (!z7) {
                addViewInLayout(view, i6, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i6, layoutParams);
    }

    public final Rect c(View view) {
        Rect rect = new Rect();
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
        }
        return rect;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i6) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L53
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L4e
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L40
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L4e
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.a(r4)
            goto L4f
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L4e
            boolean r6 = r5.a(r1)
            goto L4f
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L3d
            goto L4e
        L3d:
            r6 = 66
            goto L49
        L40:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L47
            goto L4e
        L47:
            r6 = 17
        L49:
            boolean r6 = r5.a(r6)
            goto L4f
        L4e:
            r6 = r2
        L4f:
            if (r6 == 0) goto L52
            goto L53
        L52:
            r1 = r2
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (getChildAt(i6).getVisibility() == 0) {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (getOverScrollMode() == 0) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3750d;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d();
    }

    public d1.a getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i7) {
        throw null;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.f3754h;
    }

    public int getPageMargin() {
        return this.f3749c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3763q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3749c > 0 && this.f3750d != null) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f6;
        boolean z5;
        int action = motionEvent.getAction() & 255;
        int i6 = 0;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f3755i) {
                    return true;
                }
                if (this.f3756j) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f3761o) {
                            if (actionIndex == 0) {
                                i6 = 1;
                            }
                            this.f3758l = motionEvent.getX(i6);
                            this.f3761o = motionEvent.getPointerId(i6);
                            VelocityTracker velocityTracker = this.f3762p;
                            if (velocityTracker != null) {
                                velocityTracker.clear();
                            }
                        }
                    }
                } else {
                    int i7 = this.f3761o;
                    if (i7 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        float x5 = motionEvent.getX(findPointerIndex);
                        float f7 = x5 - this.f3758l;
                        float abs = Math.abs(f7);
                        float y5 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y5 - this.f3760n);
                        int i8 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                        if (i8 != 0) {
                            float f8 = this.f3758l;
                            if ((f8 < this.f3757k && i8 > 0) || (f8 > getWidth() - this.f3757k && f7 < 0.0f)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (!z5 && b((int) f7, (int) x5, (int) y5, this, false)) {
                                this.f3758l = x5;
                                this.f3756j = true;
                                return false;
                            }
                        }
                        float f9 = 0;
                        if (abs > f9 && abs * 0.5f > abs2) {
                            this.f3755i = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f10 = this.f3759m;
                            if (i8 > 0) {
                                f6 = f10 + f9;
                            } else {
                                f6 = f10 - f9;
                            }
                            this.f3758l = f6;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f9) {
                            this.f3756j = true;
                        }
                        if (this.f3755i) {
                            this.f3758l = x5;
                            getScrollX();
                            getClientWidth();
                            throw null;
                        }
                    }
                }
                if (this.f3762p == null) {
                    this.f3762p = VelocityTracker.obtain();
                }
                this.f3762p.addMovement(motionEvent);
                return this.f3755i;
            }
            float x6 = motionEvent.getX();
            this.f3759m = x6;
            this.f3758l = x6;
            this.f3760n = motionEvent.getY();
            this.f3761o = motionEvent.getPointerId(0);
            this.f3756j = false;
            throw null;
        }
        this.f3761o = -1;
        this.f3755i = false;
        this.f3756j = false;
        VelocityTracker velocityTracker2 = this.f3762p;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f3762p = null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r17.getChildCount()
            int r2 = r21 - r19
            int r3 = r22 - r20
            int r4 = r17.getPaddingLeft()
            int r5 = r17.getPaddingTop()
            int r6 = r17.getPaddingRight()
            int r7 = r17.getPaddingBottom()
            int r8 = r17.getScrollX()
            r9 = 0
            r10 = r9
        L20:
            r11 = 8
            if (r10 >= r1) goto Lb3
            android.view.View r12 = r0.getChildAt(r10)
            int r13 = r12.getVisibility()
            if (r13 == r11) goto Laf
            android.view.ViewGroup$LayoutParams r11 = r12.getLayoutParams()
            d1.b$d r11 = (d1.b.d) r11
            boolean r13 = r11.f3766a
            if (r13 == 0) goto Laf
            int r11 = r11.f3767b
            r13 = r11 & 7
            r11 = r11 & 112(0x70, float:1.57E-43)
            r14 = 1
            if (r13 == r14) goto L5c
            r14 = 3
            if (r13 == r14) goto L56
            r14 = 5
            if (r13 == r14) goto L49
            r13 = r4
            goto L6d
        L49:
            int r13 = r2 - r6
            int r14 = r12.getMeasuredWidth()
            int r13 = r13 - r14
            int r14 = r12.getMeasuredWidth()
            int r6 = r6 + r14
            goto L68
        L56:
            int r13 = r12.getMeasuredWidth()
            int r13 = r13 + r4
            goto L6d
        L5c:
            int r13 = r12.getMeasuredWidth()
            int r13 = r2 - r13
            int r13 = r13 / 2
            int r13 = java.lang.Math.max(r13, r4)
        L68:
            r16 = r13
            r13 = r4
            r4 = r16
        L6d:
            r14 = 16
            if (r11 == r14) goto L8e
            r14 = 48
            if (r11 == r14) goto L88
            r14 = 80
            if (r11 == r14) goto L7b
            r11 = r5
            goto L9f
        L7b:
            int r11 = r3 - r7
            int r14 = r12.getMeasuredHeight()
            int r11 = r11 - r14
            int r14 = r12.getMeasuredHeight()
            int r7 = r7 + r14
            goto L9a
        L88:
            int r11 = r12.getMeasuredHeight()
            int r11 = r11 + r5
            goto L9f
        L8e:
            int r11 = r12.getMeasuredHeight()
            int r11 = r3 - r11
            int r11 = r11 / 2
            int r11 = java.lang.Math.max(r11, r5)
        L9a:
            r16 = r11
            r11 = r5
            r5 = r16
        L9f:
            int r4 = r4 + r8
            int r14 = r12.getMeasuredWidth()
            int r14 = r14 + r4
            int r15 = r12.getMeasuredHeight()
            int r15 = r15 + r5
            r12.layout(r4, r5, r14, r15)
            r5 = r11
            r4 = r13
        Laf:
            int r10 = r10 + 1
            goto L20
        Lb3:
            r2 = r9
        Lb4:
            r3 = 0
            if (r2 >= r1) goto Ld0
            android.view.View r4 = r0.getChildAt(r2)
            int r5 = r4.getVisibility()
            if (r5 == r11) goto Lcd
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            d1.b$d r4 = (d1.b.d) r4
            boolean r4 = r4.f3766a
            if (r4 == 0) goto Lcc
            goto Lcd
        Lcc:
            throw r3
        Lcd:
            int r2 = r2 + 1
            goto Lb4
        Ld0:
            boolean r1 = r0.f3763q
            if (r1 != 0) goto Ld7
            r0.f3763q = r9
            return
        Ld7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        d dVar;
        d dVar2;
        int i8;
        setMeasuredDimension(View.getDefaultSize(0, i6), View.getDefaultSize(0, i7));
        int measuredWidth = getMeasuredWidth();
        this.f3757k = Math.min(measuredWidth / 10, 0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i9 = 0;
        while (true) {
            int i10 = 1073741824;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.f3766a) {
                int i11 = dVar2.f3767b;
                int i12 = i11 & 7;
                int i13 = i11 & 112;
                boolean z5 = true;
                boolean z6 = i13 == 48 || i13 == 80;
                if (i12 != 3 && i12 != 5) {
                    z5 = false;
                }
                int i14 = Integer.MIN_VALUE;
                if (z6) {
                    i8 = 1073741824;
                } else {
                    i8 = Integer.MIN_VALUE;
                    if (z5) {
                        i14 = 1073741824;
                    }
                }
                int i15 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i15 != -2) {
                    if (i15 == -1) {
                        i15 = paddingLeft;
                    }
                    i8 = 1073741824;
                } else {
                    i15 = paddingLeft;
                }
                int i16 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i16 == -2) {
                    i16 = measuredHeight;
                    i10 = i14;
                } else if (i16 == -1) {
                    i16 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, i8), View.MeasureSpec.makeMeasureSpec(i16, i10));
                if (z6) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z5) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i9++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f3751e = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f3752f = false;
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.f3766a)) {
                dVar.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), 1073741824), this.f3751e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        int i7;
        int i8;
        int i9;
        int childCount = getChildCount();
        if ((i6 & 2) != 0) {
            i8 = 1;
            i9 = childCount;
            i7 = 0;
        } else {
            i7 = childCount - 1;
            i8 = -1;
            i9 = -1;
        }
        while (i7 != i9) {
            if (getChildAt(i7).getVisibility() != 0) {
                i7 += i8;
            } else {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f5073b);
        this.f3748b = gVar.f3769e;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f3768d = 0;
        return gVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        if (i6 != i8) {
            if (i8 > 0) {
                throw null;
            }
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f3752f) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(d1.a aVar) {
        ArrayList arrayList = this.f3765t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3765t.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((e) this.f3765t.get(i6)).a(this);
        }
    }

    public void setCurrentItem(int i6) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i6) {
        if (i6 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i6 + " too small; defaulting to 1");
            i6 = 1;
        }
        if (i6 != this.f3754h) {
            this.f3754h = i6;
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.s = fVar;
    }

    public void setPageMargin(int i6) {
        this.f3749c = i6;
        if (getWidth() > 0) {
            throw null;
        }
        throw null;
    }

    public void setPageMarginDrawable(int i6) {
        Context context = getContext();
        Object obj = w.a.f6573a;
        setPageMarginDrawable(a.b.b(context, i6));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3750d = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i6) {
        if (this.u == i6) {
            return;
        }
        this.u = i6;
        f fVar = this.s;
        if (fVar != null) {
            fVar.a(i6);
        }
        ArrayList arrayList = this.f3764r;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                f fVar2 = (f) this.f3764r.get(i7);
                if (fVar2 != null) {
                    fVar2.a(i6);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3750d;
    }
}
