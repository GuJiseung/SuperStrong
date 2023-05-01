package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* loaded from: classes.dex */
public abstract class k extends ReplacementSpan {

    /* renamed from: c  reason: collision with root package name */
    public final i f1354c;

    /* renamed from: b  reason: collision with root package name */
    public final Paint.FontMetricsInt f1353b = new Paint.FontMetricsInt();

    /* renamed from: d  reason: collision with root package name */
    public float f1355d = 1.0f;

    public k(i iVar) {
        if (iVar != null) {
            this.f1354c = iVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.f1353b;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        i iVar = this.f1354c;
        o0.a c6 = iVar.c();
        int a6 = c6.a(14);
        short s5 = 0;
        if (a6 != 0) {
            s = c6.f5503b.getShort(a6 + c6.f5502a);
        } else {
            s = 0;
        }
        this.f1355d = abs / s;
        o0.a c7 = iVar.c();
        int a7 = c7.a(14);
        if (a7 != 0) {
            c7.f5503b.getShort(a7 + c7.f5502a);
        }
        o0.a c8 = iVar.c();
        int a8 = c8.a(12);
        if (a8 != 0) {
            s5 = c8.f5503b.getShort(a8 + c8.f5502a);
        }
        short s6 = (short) (s5 * this.f1355d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s6;
    }
}
