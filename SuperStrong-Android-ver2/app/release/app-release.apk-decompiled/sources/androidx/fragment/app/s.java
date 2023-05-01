package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Animation f1637a;

    /* renamed from: b  reason: collision with root package name */
    public final Animator f1638b;

    public s(Animator animator) {
        this.f1637a = null;
        this.f1638b = animator;
    }

    public s(Animation animation) {
        this.f1637a = animation;
        this.f1638b = null;
    }
}
