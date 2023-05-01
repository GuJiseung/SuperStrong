package h2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f4436a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4437b;

    /* renamed from: c  reason: collision with root package name */
    public final TimeInterpolator f4438c;

    /* renamed from: d  reason: collision with root package name */
    public int f4439d;

    /* renamed from: e  reason: collision with root package name */
    public int f4440e;

    public h(long j5) {
        this.f4436a = 0L;
        this.f4437b = 300L;
        this.f4438c = null;
        this.f4439d = 0;
        this.f4440e = 1;
        this.f4436a = j5;
        this.f4437b = 150L;
    }

    public h(long j5, long j6, TimeInterpolator timeInterpolator) {
        this.f4436a = 0L;
        this.f4437b = 300L;
        this.f4438c = null;
        this.f4439d = 0;
        this.f4440e = 1;
        this.f4436a = j5;
        this.f4437b = j6;
        this.f4438c = timeInterpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f4436a);
        animator.setDuration(this.f4437b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f4439d);
            valueAnimator.setRepeatMode(this.f4440e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f4438c;
        return timeInterpolator != null ? timeInterpolator : a.f4423b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4436a != hVar.f4436a || this.f4437b != hVar.f4437b || this.f4439d != hVar.f4439d || this.f4440e != hVar.f4440e) {
            return false;
        }
        return b().getClass().equals(hVar.b().getClass());
    }

    public final int hashCode() {
        long j5 = this.f4436a;
        long j6 = this.f4437b;
        return ((((b().getClass().hashCode() + (((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31)) * 31) + this.f4439d) * 31) + this.f4440e;
    }

    public final String toString() {
        return "\n" + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4436a + " duration: " + this.f4437b + " interpolator: " + b().getClass() + " repeatCount: " + this.f4439d + " repeatMode: " + this.f4440e + "}\n";
    }
}
