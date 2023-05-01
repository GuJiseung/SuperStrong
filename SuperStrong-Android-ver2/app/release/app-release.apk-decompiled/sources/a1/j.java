package a1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l.b f80a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f81b;

    public j(i iVar, l.b bVar) {
        this.f81b = iVar;
        this.f80a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f80a.remove(animator);
        this.f81b.f68n.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f81b.f68n.add(animator);
    }
}
