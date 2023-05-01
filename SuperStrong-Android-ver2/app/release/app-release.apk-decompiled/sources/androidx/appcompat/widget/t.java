package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class t extends RatingBar {

    /* renamed from: b  reason: collision with root package name */
    public final r f936b;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        e1.a(this, getContext());
        r rVar = new r(this);
        this.f936b = rVar;
        rVar.a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        Bitmap bitmap = this.f936b.f917b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i6, 0), getMeasuredHeight());
        }
    }
}
