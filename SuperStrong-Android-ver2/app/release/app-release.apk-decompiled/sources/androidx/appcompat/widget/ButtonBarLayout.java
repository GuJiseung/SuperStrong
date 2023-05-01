package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.superstrong.android.R;
import f0.g0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f584b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f585c;

    /* renamed from: d  reason: collision with root package name */
    public int f586d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f586d = -1;
        int[] iArr = c.b.f2672l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        f0.g0.k(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f584b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f584b);
        }
    }

    private void setStacked(boolean z5) {
        if (this.f585c != z5) {
            if (!z5 || this.f584b) {
                this.f585c = z5;
                setOrientation(z5 ? 1 : 0);
                setGravity(z5 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z5 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        boolean z5;
        int i9;
        int paddingBottom;
        boolean z6;
        int size = View.MeasureSpec.getSize(i6);
        int i10 = 0;
        if (this.f584b) {
            if (size > this.f586d && this.f585c) {
                setStacked(false);
            }
            this.f586d = size;
        }
        if (!this.f585c && View.MeasureSpec.getMode(i6) == 1073741824) {
            i8 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z5 = true;
        } else {
            i8 = i6;
            z5 = false;
        }
        super.onMeasure(i8, i7);
        if (this.f584b && !this.f585c) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                setStacked(true);
                z5 = true;
            }
        }
        if (z5) {
            super.onMeasure(i6, i7);
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            i9 = -1;
            if (i11 < childCount) {
                if (getChildAt(i11).getVisibility() == 0) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            View childAt = getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i10 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f585c) {
                int i12 = i11 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i12 >= childCount2) {
                        break;
                    } else if (getChildAt(i12).getVisibility() == 0) {
                        i9 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i9 >= 0) {
                    paddingBottom = getChildAt(i9).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i10 += paddingBottom;
        }
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        if (g0.d.d(this) != i10) {
            setMinimumHeight(i10);
            if (i7 == 0) {
                super.onMeasure(i6, i7);
            }
        }
    }

    public void setAllowStacking(boolean z5) {
        if (this.f584b != z5) {
            this.f584b = z5;
            if (!z5 && this.f585c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
