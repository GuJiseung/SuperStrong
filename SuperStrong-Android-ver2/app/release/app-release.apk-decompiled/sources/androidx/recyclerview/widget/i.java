package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f2071a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2072b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2073c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2074d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2074d = kVar;
        this.f2071a = aVar;
        this.f2072b = viewPropertyAnimator;
        this.f2073c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2072b.setListener(null);
        View view = this.f2073c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k.a aVar = this.f2071a;
        RecyclerView.a0 a0Var = aVar.f2090a;
        k kVar = this.f2074d;
        kVar.c(a0Var);
        kVar.f2089r.remove(aVar.f2090a);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.a0 a0Var = this.f2071a.f2090a;
        this.f2074d.getClass();
    }
}
