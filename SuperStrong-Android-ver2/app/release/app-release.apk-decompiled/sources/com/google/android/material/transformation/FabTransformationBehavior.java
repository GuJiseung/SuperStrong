package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import h2.g;
import h2.h;
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3510c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f3511d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f3512e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f3513f;

    /* renamed from: g  reason: collision with root package name */
    public float f3514g;

    /* renamed from: h  reason: collision with root package name */
    public float f3515h;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3516a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3517b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f3518c;

        public a(boolean z5, View view, View view2) {
            this.f3516a = z5;
            this.f3517b = view;
            this.f3518c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f3516a) {
                return;
            }
            this.f3517b.setVisibility(4);
            View view = this.f3518c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f3516a) {
                this.f3517b.setVisibility(0);
                View view = this.f3518c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f3519a;

        /* renamed from: b  reason: collision with root package name */
        public c.b f3520b;
    }

    public FabTransformationBehavior() {
        this.f3510c = new Rect();
        this.f3511d = new RectF();
        this.f3512e = new RectF();
        this.f3513f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3510c = new Rect();
        this.f3511d = new RectF();
        this.f3512e = new RectF();
        this.f3513f = new int[2];
    }

    public static Pair u(float f6, float f7, boolean z5, b bVar) {
        h c6;
        g gVar;
        String str;
        int i6;
        if (f6 == 0.0f || f7 == 0.0f) {
            c6 = bVar.f3519a.c("translationXLinear");
            gVar = bVar.f3519a;
            str = "translationYLinear";
        } else if ((!z5 || f7 >= 0.0f) && (z5 || i6 <= 0)) {
            c6 = bVar.f3519a.c("translationXCurveDownwards");
            gVar = bVar.f3519a;
            str = "translationYCurveDownwards";
        } else {
            c6 = bVar.f3519a.c("translationXCurveUpwards");
            gVar = bVar.f3519a;
            str = "translationYCurveUpwards";
        }
        return new Pair(c6, gVar.c(str));
    }

    public static float x(b bVar, h hVar, float f6) {
        long j5 = hVar.f4436a;
        h c6 = bVar.f3519a.c("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((c6.f4436a + c6.f4437b) + 17) - j5)) / ((float) hVar.f4437b));
        LinearInterpolator linearInterpolator = h2.a.f4422a;
        return ((0.0f - f6) * interpolation) + f6;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f1236h == 0) {
            fVar.f1236h = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ee A[LOOP:0: B:122:0x03ec->B:123:0x03ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x036e  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet t(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float v(View view, View view2, c.b bVar) {
        RectF rectF = this.f3511d;
        RectF rectF2 = this.f3512e;
        y(view, rectF);
        rectF.offset(this.f3514g, this.f3515h);
        y(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, c.b bVar) {
        RectF rectF = this.f3511d;
        RectF rectF2 = this.f3512e;
        y(view, rectF);
        rectF.offset(this.f3514g, this.f3515h);
        y(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f3513f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b z(Context context, boolean z5);
}
