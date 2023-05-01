package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3214a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3215b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.g f3216c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f3217d;

    public b(d dVar, boolean z5, a aVar) {
        this.f3217d = dVar;
        this.f3215b = z5;
        this.f3216c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3214a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i6;
        d dVar = this.f3217d;
        dVar.f3236m = 0;
        dVar.f3230g = null;
        if (!this.f3214a) {
            boolean z5 = this.f3215b;
            if (z5) {
                i6 = 8;
            } else {
                i6 = 4;
            }
            dVar.f3240q.b(i6, z5);
            d.g gVar = this.f3216c;
            if (gVar != null) {
                a aVar = (a) gVar;
                aVar.f3212a.a(aVar.f3213b);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f3217d;
        dVar.f3240q.b(0, this.f3215b);
        dVar.f3236m = 1;
        dVar.f3230g = animator;
        this.f3214a = false;
    }
}
