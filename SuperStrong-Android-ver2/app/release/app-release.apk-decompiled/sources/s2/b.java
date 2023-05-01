package s2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import s2.d;
/* loaded from: classes.dex */
public final class b {
    public static AnimatorSet a(d dVar, float f6, float f7, float f8) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, d.b.f5989a, d.a.f5987b, new d.C0088d(f6, f7, f8));
        d.C0088d revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f6, (int) f7, revealInfo.f5993c, f8);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
