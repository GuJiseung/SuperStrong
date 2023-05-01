package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.m;
import androidx.fragment.app.v0;
/* loaded from: classes.dex */
public final class g implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v0.b f1477a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1478b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1479c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m.a f1480d;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            gVar.f1478b.endViewTransition(gVar.f1479c);
            gVar.f1480d.a();
        }
    }

    public g(View view, ViewGroup viewGroup, m.a aVar, v0.b bVar) {
        this.f1477a = bVar;
        this.f1478b = viewGroup;
        this.f1479c = view;
        this.f1480d = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1478b.post(new a());
        if (a0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1477a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (a0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1477a + " has reached onAnimationStart.");
        }
    }
}
