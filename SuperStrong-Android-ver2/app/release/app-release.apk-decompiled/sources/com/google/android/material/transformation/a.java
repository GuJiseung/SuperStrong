package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;
/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3526a;

    public a(View view) {
        this.f3526a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3526a.invalidate();
    }
}
