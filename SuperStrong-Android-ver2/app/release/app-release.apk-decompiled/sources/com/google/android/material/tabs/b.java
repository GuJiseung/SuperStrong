package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3375a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3376b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TabLayout.e f3377c;

    public b(TabLayout.e eVar, View view, View view2) {
        this.f3377c = eVar;
        this.f3375a = view;
        this.f3376b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3377c.c(this.f3375a, this.f3376b, valueAnimator.getAnimatedFraction());
    }
}
