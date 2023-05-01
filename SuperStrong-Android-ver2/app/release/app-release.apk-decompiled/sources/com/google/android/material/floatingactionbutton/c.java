package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f3218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.g f3219b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f3220c;

    public c(d dVar, boolean z5, a aVar) {
        this.f3220c = dVar;
        this.f3218a = z5;
        this.f3219b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3220c;
        dVar.f3236m = 0;
        dVar.f3230g = null;
        d.g gVar = this.f3219b;
        if (gVar != null) {
            ((a) gVar).f3212a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f3220c;
        dVar.f3240q.b(0, this.f3218a);
        dVar.f3236m = 2;
        dVar.f3230g = animator;
    }
}
