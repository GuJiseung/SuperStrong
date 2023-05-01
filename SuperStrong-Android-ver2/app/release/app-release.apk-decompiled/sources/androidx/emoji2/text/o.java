package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class o extends SpannableStringBuilder {

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f1372b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1373c;

    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: b  reason: collision with root package name */
        public final Object f1374b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicInteger f1375c = new AtomicInteger(0);

        public a(Object obj) {
            this.f1374b = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1374b).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            ((TextWatcher) this.f1374b).beforeTextChanged(charSequence, i6, i7, i8);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i6, int i7) {
            if (this.f1375c.get() > 0 && (obj instanceof k)) {
                return;
            }
            ((SpanWatcher) this.f1374b).onSpanAdded(spannable, obj, i6, i7);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i6, int i7, int i8, int i9) {
            int i10;
            int i11;
            if (this.f1375c.get() > 0 && (obj instanceof k)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (i6 > i7) {
                    i6 = 0;
                }
                if (i8 > i9) {
                    i10 = i6;
                    i11 = 0;
                    ((SpanWatcher) this.f1374b).onSpanChanged(spannable, obj, i10, i7, i11, i9);
                }
            }
            i10 = i6;
            i11 = i8;
            ((SpanWatcher) this.f1374b).onSpanChanged(spannable, obj, i10, i7, i11, i9);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i6, int i7) {
            if (this.f1375c.get() > 0 && (obj instanceof k)) {
                return;
            }
            ((SpanWatcher) this.f1374b).onSpanRemoved(spannable, obj, i6, i7);
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            ((TextWatcher) this.f1374b).onTextChanged(charSequence, i6, i7, i8);
        }
    }

    public o(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f1373c = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f1372b = cls;
    }

    public final void a() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f1373c;
            if (i6 < arrayList.size()) {
                ((a) arrayList.get(i6)).f1375c.incrementAndGet();
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i6, int i7) {
        super.append(charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i6) {
        super.append(charSequence, obj, i6);
        return this;
    }

    public final void b() {
        e();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f1373c;
            if (i6 < arrayList.size()) {
                ((a) arrayList.get(i6)).onTextChanged(this, 0, length(), length());
                i6++;
            } else {
                return;
            }
        }
    }

    public final a c(Object obj) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f1373c;
            if (i6 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i6);
            if (aVar.f1374b == obj) {
                return aVar;
            }
            i6++;
        }
    }

    public final boolean d(Object obj) {
        boolean z5;
        if (obj == null) {
            return false;
        }
        if (this.f1372b == obj.getClass()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        return true;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i6, int i7) {
        super.delete(i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i6, int i7) {
        super.delete(i6, i7);
        return this;
    }

    public final void e() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f1373c;
            if (i6 < arrayList.size()) {
                ((a) arrayList.get(i6)).f1375c.decrementAndGet();
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        a c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        a c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        a c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i6, int i7, Class<T> cls) {
        boolean z5;
        if (this.f1372b == cls) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            a[] aVarArr = (a[]) super.getSpans(i6, i7, a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
            for (int i8 = 0; i8 < aVarArr.length; i8++) {
                tArr[i8] = aVarArr[i8].f1374b;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i6, i7, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i6, CharSequence charSequence, int i7, int i8) {
        super.insert(i6, charSequence, i7, i8);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0009, code lost:
        if (r0 != false) goto L10;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto Lb
            java.lang.Class<?> r0 = r1.f1372b
            if (r0 != r4) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
        Lb:
            java.lang.Class<androidx.emoji2.text.o$a> r4 = androidx.emoji2.text.o.a.class
        Ld:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.o.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        a aVar;
        if (d(obj)) {
            aVar = c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f1373c.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i6, int i7, CharSequence charSequence) {
        replace(i6, i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i6, int i7, CharSequence charSequence, int i8, int i9) {
        replace(i6, i7, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i6, int i7, CharSequence charSequence) {
        a();
        super.replace(i6, i7, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i6, int i7, CharSequence charSequence, int i8, int i9) {
        a();
        super.replace(i6, i7, charSequence, i8, i9);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i6, int i7, int i8) {
        if (d(obj)) {
            a aVar = new a(obj);
            this.f1373c.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i6, i7, i8);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i6, int i7) {
        return new o(this.f1372b, this, i6, i7);
    }

    public o(Class<?> cls, CharSequence charSequence, int i6, int i7) {
        super(charSequence, i6, i7);
        this.f1373c = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f1372b = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i6, CharSequence charSequence, int i7, int i8) {
        super.insert(i6, charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i6, int i7) {
        super.append(charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i6, int i7) {
        super.append(charSequence, i6, i7);
        return this;
    }
}
