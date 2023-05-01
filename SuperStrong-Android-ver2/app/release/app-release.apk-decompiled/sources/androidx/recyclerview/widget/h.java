package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f2065a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2066b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2067c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2068d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2069e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2070f;

    public h(k kVar, RecyclerView.a0 a0Var, int i6, View view, int i7, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2070f = kVar;
        this.f2065a = a0Var;
        this.f2066b = i6;
        this.f2067c = view;
        this.f2068d = i7;
        this.f2069e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i6 = this.f2066b;
        View view = this.f2067c;
        if (i6 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2068d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2069e.setListener(null);
        k kVar = this.f2070f;
        RecyclerView.a0 a0Var = this.f2065a;
        kVar.c(a0Var);
        kVar.f2087p.remove(a0Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2070f.getClass();
    }
}
