package f0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f3912a;

    /* loaded from: classes.dex */
    public static class a {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public r0(View view) {
        this.f3912a = new WeakReference<>(view);
    }

    public final void a(float f6) {
        View view = this.f3912a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
    }

    public final void b() {
        View view = this.f3912a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j5) {
        View view = this.f3912a.get();
        if (view != null) {
            view.animate().setDuration(j5);
        }
    }

    public final void d(s0 s0Var) {
        View view = this.f3912a.get();
        if (view != null) {
            if (s0Var != null) {
                view.animate().setListener(new q0(s0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f6) {
        View view = this.f3912a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
    }
}
