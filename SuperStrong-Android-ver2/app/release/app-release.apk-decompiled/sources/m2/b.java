package m2;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import b3.d;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class b extends d {
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public boolean K;
    public final ArrayList L;

    public b(Context context) {
        super(context);
        this.L = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.G = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.H = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.I = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.J = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // b3.d
    public final a e(Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int childCount = getChildCount();
        int i10 = i8 - i6;
        int i11 = i9 - i7;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                if (g0.e.d(this) == 1) {
                    int i14 = i10 - i12;
                    childAt.layout(i14 - childAt.getMeasuredWidth(), 0, i14, i11);
                } else {
                    childAt.layout(i12, 0, childAt.getMeasuredWidth() + i12, i11);
                }
                i12 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        boolean z5;
        int i8;
        int i9;
        int i10;
        f menu = getMenu();
        int size = View.MeasureSpec.getSize(i6);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.L;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i7);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i11 = 1;
        if (labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i12 = this.I;
        if (z5 && this.K) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i13 = this.J;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), makeMeasureSpec);
                i13 = Math.max(i13, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            int i14 = size2 - i9;
            int min = Math.min(size - (this.H * i14), Math.min(i13, i12));
            int i15 = size - min;
            if (i14 != 0) {
                i11 = i14;
            }
            int min2 = Math.min(i15 / i11, this.G);
            int i16 = i15 - (i14 * min2);
            for (int i17 = 0; i17 < childCount; i17++) {
                if (getChildAt(i17).getVisibility() != 8) {
                    if (i17 == getSelectedItemPosition()) {
                        i10 = min;
                    } else {
                        i10 = min2;
                    }
                    if (i16 > 0) {
                        i10++;
                        i16--;
                    }
                } else {
                    i10 = 0;
                }
                arrayList.add(Integer.valueOf(i10));
            }
        } else {
            if (size2 != 0) {
                i11 = size2;
            }
            int min3 = Math.min(size / i11, i12);
            int i18 = size - (size2 * min3);
            for (int i19 = 0; i19 < childCount; i19++) {
                if (getChildAt(i19).getVisibility() != 8) {
                    if (i18 > 0) {
                        i8 = min3 + 1;
                        i18--;
                    } else {
                        i8 = min3;
                    }
                } else {
                    i8 = 0;
                }
                arrayList.add(Integer.valueOf(i8));
            }
        }
        int i20 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i21)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i20 = childAt2.getMeasuredWidth() + i20;
            }
        }
        setMeasuredDimension(i20, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z5) {
        this.K = z5;
    }
}
