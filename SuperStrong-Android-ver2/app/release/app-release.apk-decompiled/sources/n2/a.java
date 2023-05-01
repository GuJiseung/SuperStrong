package n2;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h3.f;
/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f5377a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f5377a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f fVar = this.f5377a.f2971i;
        if (fVar != null) {
            f.b bVar = fVar.f4446b;
            if (bVar.f4476j != floatValue) {
                bVar.f4476j = floatValue;
                fVar.f4450f = true;
                fVar.invalidateSelf();
            }
        }
    }
}
