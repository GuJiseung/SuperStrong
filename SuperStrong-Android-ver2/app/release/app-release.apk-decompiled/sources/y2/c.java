package y2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c extends d {
    public StateListAnimator I;

    public c(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final float e() {
        return this.f3240q.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void f(Rect rect) {
        boolean z5;
        if (FloatingActionButton.this.f3207k) {
            super.f(rect);
            return;
        }
        boolean z6 = this.f3225b;
        int i6 = 0;
        FloatingActionButton floatingActionButton = this.f3240q;
        if (z6 && floatingActionButton.getSizeDimension() < 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5) {
            i6 = (0 - floatingActionButton.getSizeDimension()) / 2;
        }
        rect.set(i6, i6, i6, i6);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void g() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void h() {
        n();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void i(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void j(float f6, float f7, float f8) {
        int i6 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f3240q;
        if (floatingActionButton.getStateListAnimator() == this.I) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.C, o(f6, f8));
            stateListAnimator.addState(d.D, o(f6, f7));
            stateListAnimator.addState(d.E, o(f6, f7));
            stateListAnimator.addState(d.F, o(f6, f7));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f6).setDuration(0L));
            if (i6 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.f3221x);
            stateListAnimator.addState(d.G, animatorSet);
            stateListAnimator.addState(d.H, o(0.0f, 0.0f));
            this.I = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (!p()) {
            return;
        }
        n();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void l() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void m() {
    }

    public final AnimatorSet o(float f6, float f7) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f3240q;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f6).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, f7).setDuration(100L));
        animatorSet.setInterpolator(d.f3221x);
        return animatorSet;
    }

    public final boolean p() {
        boolean z5;
        if (FloatingActionButton.this.f3207k) {
            return true;
        }
        if (this.f3225b && this.f3240q.getSizeDimension() < 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5) {
            return true;
        }
        return false;
    }
}
