package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import h2.g;
import java.util.HashMap;
import java.util.WeakHashMap;
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public HashMap f3525i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void s(View view, View view2, boolean z5, boolean z6) {
        boolean z7;
        int i6;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z5) {
                this.f3525i = new HashMap(childCount);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if ((childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f1229a instanceof FabTransformationScrimBehavior)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (childAt != view2 && !z7) {
                    HashMap hashMap = this.f3525i;
                    if (!z5) {
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            i6 = ((Integer) this.f3525i.get(childAt)).intValue();
                            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                        }
                    } else {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                        i6 = 4;
                    }
                    g0.d.s(childAt, i6);
                }
            }
            if (!z5) {
                this.f3525i = null;
            }
        }
        super.s(view, view2, z5, z6);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final FabTransformationBehavior.b z(Context context, boolean z5) {
        int i6 = z5 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f3519a = g.a(context, i6);
        bVar.f3520b = new c.b();
        return bVar;
    }
}
