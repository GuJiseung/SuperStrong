package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
/* loaded from: classes.dex */
public final class p extends k {
    public p(i iVar) {
        super(iVar);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i6, int i7, float f6, int i8, int i9, int i10, Paint paint) {
        f.a().getClass();
        i iVar = this.f1354c;
        n nVar = iVar.f1342b;
        Typeface typeface = nVar.f1369d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i11 = iVar.f1341a * 2;
        canvas.drawText(nVar.f1367b, i11, 2, f6, i9, paint);
        paint.setTypeface(typeface2);
    }
}
