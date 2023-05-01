package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
/* loaded from: classes.dex */
public final class q implements Spannable {

    /* renamed from: b  reason: collision with root package name */
    public boolean f1376b = false;

    /* renamed from: c  reason: collision with root package name */
    public Spannable f1377c;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof d0.j;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // androidx.emoji2.text.q.a
        public final boolean a(Spannable spannable) {
            return (spannable instanceof PrecomputedText) || (spannable instanceof d0.j);
        }
    }

    public q(Spannable spannable) {
        this.f1377c = spannable;
    }

    public q(CharSequence charSequence) {
        this.f1377c = new SpannableString(charSequence);
    }

    public final void a() {
        a bVar;
        Spannable spannable = this.f1377c;
        if (!this.f1376b) {
            if (Build.VERSION.SDK_INT < 28) {
                bVar = new a();
            } else {
                bVar = new b();
            }
            if (bVar.a(spannable)) {
                this.f1377c = new SpannableString(spannable);
            }
        }
        this.f1376b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
        return this.f1377c.charAt(i6);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1377c.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1377c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1377c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1377c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1377c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i6, int i7, Class<T> cls) {
        return (T[]) this.f1377c.getSpans(i6, i7, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1377c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i6, int i7, Class cls) {
        return this.f1377c.nextSpanTransition(i6, i7, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1377c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i6, int i7, int i8) {
        a();
        this.f1377c.setSpan(obj, i6, i7, i8);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i7) {
        return this.f1377c.subSequence(i6, i7);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1377c.toString();
    }
}
