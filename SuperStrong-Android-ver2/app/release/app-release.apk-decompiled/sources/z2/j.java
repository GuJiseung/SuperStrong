package z2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f6978a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f6979b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6980c;

    /* renamed from: d  reason: collision with root package name */
    public int f6981d;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6988k;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f6982e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f6983f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f6984g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f6985h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f6986i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6987j = true;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f6989l = null;

    /* loaded from: classes.dex */
    public static class a extends Exception {
    }

    public j(CharSequence charSequence, TextPaint textPaint, int i6) {
        this.f6978a = charSequence;
        this.f6979b = textPaint;
        this.f6980c = i6;
        this.f6981d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f6978a == null) {
            this.f6978a = "";
        }
        int max = Math.max(0, this.f6980c);
        CharSequence charSequence = this.f6978a;
        int i6 = this.f6983f;
        TextPaint textPaint = this.f6979b;
        if (i6 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f6989l);
        }
        int min = Math.min(charSequence.length(), this.f6981d);
        this.f6981d = min;
        if (this.f6988k && this.f6983f == 1) {
            this.f6982e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f6982e);
        obtain.setIncludePad(this.f6987j);
        obtain.setTextDirection(this.f6988k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f6989l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f6983f);
        float f6 = this.f6984g;
        if (f6 != 0.0f || this.f6985h != 1.0f) {
            obtain.setLineSpacing(f6, this.f6985h);
        }
        if (this.f6983f > 1) {
            obtain.setHyphenationFrequency(this.f6986i);
        }
        return obtain.build();
    }
}
