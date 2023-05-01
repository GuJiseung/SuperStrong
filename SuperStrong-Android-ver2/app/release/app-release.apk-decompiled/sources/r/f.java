package r;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import o.j;
/* loaded from: classes.dex */
public abstract class f extends androidx.constraintlayout.widget.a {

    /* renamed from: j  reason: collision with root package name */
    public boolean f5877j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5878k;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.a
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.a.f2640c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 6) {
                    this.f5877j = true;
                } else if (index == 22) {
                    this.f5878k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void l(j jVar, int i6, int i7) {
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5877j || this.f5878k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i6 = 0; i6 < this.f1094c; i6++) {
                    View view = constraintLayout.f1028b.get(this.f1093b[i6]);
                    if (view != null) {
                        if (this.f5877j) {
                            view.setVisibility(visibility);
                        }
                        if (this.f5878k && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }
}
