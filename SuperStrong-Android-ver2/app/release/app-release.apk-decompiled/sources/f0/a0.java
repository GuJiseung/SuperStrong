package f0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class a0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final View f3859b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver f3860c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f3861d;

    public a0(ViewGroup viewGroup, Runnable runnable) {
        this.f3859b = viewGroup;
        this.f3860c = viewGroup.getViewTreeObserver();
        this.f3861d = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        a0 a0Var = new a0(viewGroup, runnable);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(a0Var);
        viewGroup.addOnAttachStateChangeListener(a0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.f3860c.isAlive();
        View view = this.f3859b;
        if (isAlive) {
            viewTreeObserver = this.f3860c;
        } else {
            viewTreeObserver = view.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f3861d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f3860c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f3860c.isAlive();
        View view2 = this.f3859b;
        (isAlive ? this.f3860c : view2.getViewTreeObserver()).removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}
