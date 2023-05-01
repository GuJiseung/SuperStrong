package z2;

import android.view.View;
import android.view.ViewGroup;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class e extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public int f6966b;

    /* renamed from: c  reason: collision with root package name */
    public int f6967c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6968d;

    /* renamed from: e  reason: collision with root package name */
    public int f6969e;

    public boolean a() {
        return this.f6968d;
    }

    public int getItemSpacing() {
        return this.f6967c;
    }

    public int getLineSpacing() {
        return this.f6966b;
    }

    public int getRowCount() {
        return this.f6969e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        boolean z6;
        int paddingLeft;
        int paddingRight;
        int i10;
        int i11;
        if (getChildCount() == 0) {
            this.f6969e = 0;
            return;
        }
        this.f6969e = 1;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.e.d(this) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z6) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i12 = (i8 - i6) - paddingRight;
        int i13 = paddingLeft;
        int i14 = paddingTop;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i11 = f0.m.c(marginLayoutParams);
                    i10 = f0.m.b(marginLayoutParams);
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i13 + i11;
                if (!this.f6968d && measuredWidth > i12) {
                    i14 = this.f6966b + paddingTop;
                    this.f6969e++;
                    i13 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f6969e - 1));
                int i16 = i13 + i11;
                int measuredWidth2 = childAt.getMeasuredWidth() + i16;
                int measuredHeight = childAt.getMeasuredHeight() + i14;
                if (z6) {
                    i16 = i12 - measuredWidth2;
                    measuredWidth2 = (i12 - i13) - i11;
                }
                childAt.layout(i16, i14, measuredWidth2, measuredHeight);
                i13 += childAt.getMeasuredWidth() + i11 + i10 + this.f6967c;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int size = View.MeasureSpec.getSize(i6);
        int mode = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i7);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i8 - getPaddingRight();
        int i11 = paddingTop;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i6, i7);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i10 = marginLayoutParams.leftMargin + 0;
                    i9 = marginLayoutParams.rightMargin + 0;
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i10 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i11 = this.f6966b + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i10;
                int measuredHeight = childAt.getMeasuredHeight() + i11;
                if (measuredWidth > i12) {
                    i12 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i10 + i9 + this.f6967c + paddingLeft;
                if (i13 == getChildCount() - 1) {
                    i12 += i9;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i12;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i6) {
        this.f6967c = i6;
    }

    public void setLineSpacing(int i6) {
        this.f6966b = i6;
    }

    public void setSingleLine(boolean z5) {
        this.f6968d = z5;
    }
}
