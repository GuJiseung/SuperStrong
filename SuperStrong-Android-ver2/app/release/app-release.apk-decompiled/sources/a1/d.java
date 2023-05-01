package a1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class d extends h0 {

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f18a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f19b = false;

        public a(View view) {
            this.f18a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            d0 d0Var = u.f103a;
            View view = this.f18a;
            d0Var.o(view, 1.0f);
            if (this.f19b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, r0> weakHashMap = f0.g0.f3878a;
            View view = this.f18a;
            if (g0.d.h(view) && view.getLayerType() == 0) {
                this.f19b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public d() {
    }

    public d(int i6) {
        if ((i6 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f40y = i6;
    }

    public final ObjectAnimator M(View view, float f6, float f7) {
        if (f6 == f7) {
            return null;
        }
        u.f103a.o(view, f6);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, u.f104b, f7);
        ofFloat.addListener(new a(view));
        a(new c(view));
        return ofFloat;
    }

    @Override // a1.i
    public final void g(q qVar) {
        K(qVar);
        qVar.f97a.put("android:fade:transitionAlpha", Float.valueOf(u.f103a.n(qVar.f98b)));
    }
}
