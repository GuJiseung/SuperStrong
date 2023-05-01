package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f834a;

    /* renamed from: b  reason: collision with root package name */
    public final p0.f f835b;

    public l(TextView textView) {
        this.f834a = textView;
        this.f835b = new p0.f(textView);
    }

    public final void a(AttributeSet attributeSet, int i6) {
        TypedArray obtainStyledAttributes = this.f834a.getContext().obtainStyledAttributes(attributeSet, c.b.f2668j, i6, 0);
        try {
            boolean z5 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z5);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z5) {
        this.f835b.f5697a.b(z5);
    }

    public final void c(boolean z5) {
        this.f835b.f5697a.c(z5);
    }
}
