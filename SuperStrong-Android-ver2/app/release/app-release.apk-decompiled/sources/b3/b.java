package b3;

import android.animation.ValueAnimator;
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f2391a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f2392b;

    public b(a aVar, float f6) {
        this.f2392b = aVar;
        this.f2391a = f6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2392b.b(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f2391a);
    }
}
