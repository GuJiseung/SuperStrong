package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
/* loaded from: classes.dex */
public class t0 extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public boolean f937b;

    /* renamed from: c  reason: collision with root package name */
    public int f938c;

    /* renamed from: d  reason: collision with root package name */
    public int f939d;

    /* renamed from: e  reason: collision with root package name */
    public int f940e;

    /* renamed from: f  reason: collision with root package name */
    public int f941f;

    /* renamed from: g  reason: collision with root package name */
    public int f942g;

    /* renamed from: h  reason: collision with root package name */
    public float f943h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f944i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f945j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f946k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f947l;

    /* renamed from: m  reason: collision with root package name */
    public int f948m;

    /* renamed from: n  reason: collision with root package name */
    public int f949n;

    /* renamed from: o  reason: collision with root package name */
    public int f950o;

    /* renamed from: p  reason: collision with root package name */
    public int f951p;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i6, int i7) {
            super(i6, i7);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public t0(Context context) {
        this(context, null);
    }

    public t0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public t0(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Drawable drawable;
        int resourceId;
        this.f937b = true;
        this.f938c = -1;
        this.f939d = 0;
        this.f941f = 8388659;
        int[] iArr = c.b.f2678o;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        f0.g0.k(this, context, iArr, attributeSet, obtainStyledAttributes, i6);
        int i7 = obtainStyledAttributes.getInt(1, -1);
        if (i7 >= 0) {
            setOrientation(i7);
        }
        int i8 = obtainStyledAttributes.getInt(0, -1);
        if (i8 >= 0) {
            setGravity(i8);
        }
        boolean z5 = obtainStyledAttributes.getBoolean(2, true);
        if (!z5) {
            setBaselineAligned(z5);
        }
        this.f943h = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f938c = obtainStyledAttributes.getInt(3, -1);
        this.f944i = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = e.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.f950o = obtainStyledAttributes.getInt(8, 0);
        this.f951p = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i6) {
        this.f947l.setBounds(getPaddingLeft() + this.f951p, i6, (getWidth() - getPaddingRight()) - this.f951p, this.f949n + i6);
        this.f947l.draw(canvas);
    }

    public final void e(Canvas canvas, int i6) {
        this.f947l.setBounds(i6, getPaddingTop() + this.f951p, this.f948m + i6, (getHeight() - getPaddingBottom()) - this.f951p);
        this.f947l.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public a generateDefaultLayoutParams() {
        int i6 = this.f940e;
        if (i6 == 0) {
            return new a(-2, -2);
        }
        if (i6 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i6;
        if (this.f938c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i7 = this.f938c;
        if (childCount > i7) {
            View childAt = getChildAt(i7);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f938c == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i8 = this.f939d;
            if (this.f940e == 1 && (i6 = this.f941f & 112) != 48) {
                if (i6 == 16) {
                    i8 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f942g) / 2;
                } else if (i6 == 80) {
                    i8 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f942g;
                }
            }
            return i8 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f938c;
    }

    public Drawable getDividerDrawable() {
        return this.f947l;
    }

    public int getDividerPadding() {
        return this.f951p;
    }

    public int getDividerWidth() {
        return this.f948m;
    }

    public int getGravity() {
        return this.f941f;
    }

    public int getOrientation() {
        return this.f940e;
    }

    public int getShowDividers() {
        return this.f950o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f943h;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean i(int i6) {
        if (i6 == 0) {
            return (this.f950o & 1) != 0;
        } else if (i6 == getChildCount()) {
            return (this.f950o & 4) != 0;
        } else if ((this.f950o & 2) != 0) {
            for (int i7 = i6 - 1; i7 >= 0; i7--) {
                if (getChildAt(i7).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i6;
        int left2;
        int bottom;
        if (this.f947l == null) {
            return;
        }
        int i7 = 0;
        if (this.f940e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i7 < virtualChildCount) {
                View childAt = getChildAt(i7);
                if (childAt != null && childAt.getVisibility() != 8 && i(i7)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f949n);
                }
                i7++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f949n;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a6 = s1.a(this);
        while (i7 < virtualChildCount2) {
            View childAt3 = getChildAt(i7);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i7)) {
                a aVar = (a) childAt3.getLayoutParams();
                if (a6) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f948m;
                }
                e(canvas, left2);
            }
            i7++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a6) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth();
                    i6 = getPaddingRight();
                    right = (left - i6) - this.f948m;
                }
            } else {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (a6) {
                    left = childAt4.getLeft();
                    i6 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - i6) - this.f948m;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b0, code lost:
        if (r13 < 0) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z5) {
        this.f937b = z5;
    }

    public void setBaselineAlignedChildIndex(int i6) {
        if (i6 >= 0 && i6 < getChildCount()) {
            this.f938c = i6;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f947l) {
            return;
        }
        this.f947l = drawable;
        if (drawable != null) {
            this.f948m = drawable.getIntrinsicWidth();
            this.f949n = drawable.getIntrinsicHeight();
        } else {
            this.f948m = 0;
            this.f949n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i6) {
        this.f951p = i6;
    }

    public void setGravity(int i6) {
        if (this.f941f != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.f941f = i6;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i6) {
        int i7 = i6 & 8388615;
        int i8 = this.f941f;
        if ((8388615 & i8) != i7) {
            this.f941f = i7 | ((-8388616) & i8);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z5) {
        this.f944i = z5;
    }

    public void setOrientation(int i6) {
        if (this.f940e != i6) {
            this.f940e = i6;
            requestLayout();
        }
    }

    public void setShowDividers(int i6) {
        if (i6 != this.f950o) {
            requestLayout();
        }
        this.f950o = i6;
    }

    public void setVerticalGravity(int i6) {
        int i7 = i6 & 112;
        int i8 = this.f941f;
        if ((i8 & 112) != i7) {
            this.f941f = i7 | (i8 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f943h = Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
