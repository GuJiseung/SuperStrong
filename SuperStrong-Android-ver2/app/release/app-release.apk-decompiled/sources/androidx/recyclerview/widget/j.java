package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f2075a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2076b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2077c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2078d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2078d = kVar;
        this.f2075a = aVar;
        this.f2076b = viewPropertyAnimator;
        this.f2077c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2076b.setListener(null);
        View view = this.f2077c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k.a aVar = this.f2075a;
        RecyclerView.a0 a0Var = aVar.f2091b;
        k kVar = this.f2078d;
        kVar.c(a0Var);
        kVar.f2089r.remove(aVar.f2091b);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.a0 a0Var = this.f2075a.f2091b;
        this.f2078d.getClass();
    }
}
