package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import s2.d;
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f3529a;

    public c(d dVar) {
        this.f3529a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3529a;
        d.C0088d revealInfo = dVar.getRevealInfo();
        revealInfo.f5993c = Float.MAX_VALUE;
        dVar.setRevealInfo(revealInfo);
    }
}
