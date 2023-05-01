package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f3509b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void s(View view, View view2, boolean z5, boolean z6) {
        AnimatorSet animatorSet = this.f3509b;
        boolean z7 = animatorSet != null;
        if (z7) {
            animatorSet.cancel();
        }
        AnimatorSet t5 = t(view, view2, z5, z7);
        this.f3509b = t5;
        t5.addListener(new p3.a(this));
        this.f3509b.start();
        if (z6) {
            return;
        }
        this.f3509b.end();
    }

    public abstract AnimatorSet t(View view, View view2, boolean z5, boolean z6);
}
