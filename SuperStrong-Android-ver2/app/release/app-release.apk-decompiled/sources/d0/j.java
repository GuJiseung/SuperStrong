package d0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public final class j implements Spannable {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f3735a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f3736b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3737c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3738d;

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f3735a = textPaint;
            textDirection = params.getTextDirection();
            this.f3736b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f3737c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f3738d = hyphenationFrequency;
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i6, int i7) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i6).setHyphenationFrequency(i7).setTextDirection(textDirectionHeuristic).build();
            }
            this.f3735a = textPaint;
            this.f3736b = textDirectionHeuristic;
            this.f3737c = i6;
            this.f3738d = i7;
        }

        public final boolean a(a aVar) {
            if (this.f3737c != aVar.f3737c || this.f3738d != aVar.f3738d) {
                return false;
            }
            TextPaint textPaint = this.f3735a;
            if (textPaint.getTextSize() != aVar.f3735a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = aVar.f3735a;
            if (textScaleX != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return false;
            }
            if (textPaint.getTypeface() == null) {
                if (textPaint2.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a(aVar) && this.f3736b == aVar.f3736b;
            }
            return false;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f3735a;
            return e0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f3736b, Integer.valueOf(this.f3737c), Integer.valueOf(this.f3738d));
        }

        public final String toString() {
            String fontVariationSettings;
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f3735a;
            sb2.append(textPaint.getTextSize());
            sb.append(sb2.toString());
            sb.append(", textScaleX=" + textPaint.getTextScaleX());
            sb.append(", textSkewX=" + textPaint.getTextSkewX());
            int i6 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb.append(", textLocale=" + textPaint.getTextLocales());
            sb.append(", typeface=" + textPaint.getTypeface());
            if (i6 >= 26) {
                StringBuilder sb3 = new StringBuilder(", variationSettings=");
                fontVariationSettings = textPaint.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb.append(sb3.toString());
            }
            sb.append(", textDir=" + this.f3736b);
            sb.append(", breakStrategy=" + this.f3737c);
            sb.append(", hyphenationFrequency=" + this.f3738d);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i6, int i7, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.a(i6, i7, cls);
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i6, int i7, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        c.a(obj);
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i6, int i7, int i8) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        b5.b.d(obj, i6, i7, i8);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i7) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }
}
