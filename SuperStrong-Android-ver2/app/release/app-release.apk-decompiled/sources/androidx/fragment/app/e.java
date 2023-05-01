package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m;
import androidx.fragment.app.v0;
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1457a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1458b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1459c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v0.b f1460d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m.a f1461e;

    public e(ViewGroup viewGroup, View view, boolean z5, v0.b bVar, m.a aVar) {
        this.f1457a = viewGroup;
        this.f1458b = view;
        this.f1459c = z5;
        this.f1460d = bVar;
        this.f1461e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1457a;
        View view = this.f1458b;
        viewGroup.endViewTransition(view);
        boolean z5 = this.f1459c;
        v0.b bVar = this.f1460d;
        if (z5) {
            x0.a(bVar.f1658a, view);
        }
        this.f1461e.a();
        if (a0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + bVar + " has ended.");
        }
    }
}
