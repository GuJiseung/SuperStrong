package a1;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public final class e0 extends d0 {
    @Override // a1.d0, a1.f0
    public final void k(View view, int i6) {
        view.setTransitionVisibility(i6);
    }

    @Override // a1.x
    public final float n(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // a1.x
    public final void o(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // a1.a0
    public final void p(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // a1.a0
    public final void q(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // a1.c0
    public final void r(View view, int i6, int i7, int i8, int i9) {
        view.setLeftTopRightBottom(i6, i7, i8, i9);
    }
}
