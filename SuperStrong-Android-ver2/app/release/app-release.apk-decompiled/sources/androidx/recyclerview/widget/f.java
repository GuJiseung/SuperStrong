package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f2057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2058b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2059c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2060d;

    public f(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.a0 a0Var) {
        this.f2060d = kVar;
        this.f2057a = a0Var;
        this.f2058b = viewPropertyAnimator;
        this.f2059c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2058b.setListener(null);
        this.f2059c.setAlpha(1.0f);
        k kVar = this.f2060d;
        RecyclerView.a0 a0Var = this.f2057a;
        kVar.c(a0Var);
        kVar.f2088q.remove(a0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2060d.getClass();
    }
}
