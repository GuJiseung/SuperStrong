package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public final class d extends View {

    /* renamed from: b  reason: collision with root package name */
    public boolean f1201b;

    public d(Context context) {
        super(context);
        this.f1201b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z5) {
        this.f1201b = z5;
    }

    public void setGuidelineBegin(int i6) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f1201b && aVar.f1043a == i6) {
            return;
        }
        aVar.f1043a = i6;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i6) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f1201b && aVar.f1045b == i6) {
            return;
        }
        aVar.f1045b = i6;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f6) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f1201b && aVar.f1047c == f6) {
            return;
        }
        aVar.f1047c = f6;
        setLayoutParams(aVar);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
    }
}
