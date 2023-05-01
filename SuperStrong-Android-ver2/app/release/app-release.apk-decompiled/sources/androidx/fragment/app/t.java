package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
/* loaded from: classes.dex */
public final class t extends AnimationSet implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f1641b;

    /* renamed from: c  reason: collision with root package name */
    public final View f1642c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1643d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1644e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1645f;

    public t(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1645f = true;
        this.f1641b = viewGroup;
        this.f1642c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j5, Transformation transformation) {
        this.f1645f = true;
        if (this.f1643d) {
            return !this.f1644e;
        }
        if (!super.getTransformation(j5, transformation)) {
            this.f1643d = true;
            f0.a0.a(this.f1641b, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j5, Transformation transformation, float f6) {
        this.f1645f = true;
        if (this.f1643d) {
            return !this.f1644e;
        }
        if (!super.getTransformation(j5, transformation, f6)) {
            this.f1643d = true;
            f0.a0.a(this.f1641b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5 = this.f1643d;
        ViewGroup viewGroup = this.f1641b;
        if (z5 || !this.f1645f) {
            viewGroup.endViewTransition(this.f1642c);
            this.f1644e = true;
            return;
        }
        this.f1645f = false;
        viewGroup.post(this);
    }
}
