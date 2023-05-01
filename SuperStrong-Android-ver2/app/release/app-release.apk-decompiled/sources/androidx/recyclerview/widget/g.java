package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f2061a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2062b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2063c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2064d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.a0 a0Var) {
        this.f2064d = kVar;
        this.f2061a = a0Var;
        this.f2062b = view;
        this.f2063c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2062b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2063c.setListener(null);
        k kVar = this.f2064d;
        RecyclerView.a0 a0Var = this.f2061a;
        kVar.c(a0Var);
        kVar.f2086o.remove(a0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2064d.getClass();
    }
}
