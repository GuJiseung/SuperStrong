package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: b  reason: collision with root package name */
    public int f1202b;

    /* renamed from: c  reason: collision with root package name */
    public View f1203c;

    /* renamed from: d  reason: collision with root package name */
    public int f1204d;

    public View getContent() {
        return this.f1203c;
    }

    public int getEmptyVisibility() {
        return this.f1204d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i6) {
        View findViewById;
        if (this.f1202b == i6) {
            return;
        }
        View view = this.f1203c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f1203c.getLayoutParams()).f1054f0 = false;
            this.f1203c = null;
        }
        this.f1202b = i6;
        if (i6 == -1 || (findViewById = ((View) getParent()).findViewById(i6)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i6) {
        this.f1204d = i6;
    }
}
