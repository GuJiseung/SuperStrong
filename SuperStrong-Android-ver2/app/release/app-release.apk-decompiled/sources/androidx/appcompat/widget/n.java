package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f846a;

    /* renamed from: b  reason: collision with root package name */
    public h1 f847b;

    /* renamed from: c  reason: collision with root package name */
    public int f848c = 0;

    public n(ImageView imageView) {
        this.f846a = imageView;
    }

    public final void a() {
        h1 h1Var;
        ImageView imageView = this.f846a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            p0.a(drawable);
        }
        if (drawable == null || (h1Var = this.f847b) == null) {
            return;
        }
        j.e(drawable, h1Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i6) {
        int i7;
        ImageView imageView = this.f846a;
        Context context = imageView.getContext();
        int[] iArr = c.b.f2662g;
        j1 m5 = j1.m(context, attributeSet, iArr, i6);
        f0.g0.k(imageView, imageView.getContext(), iArr, attributeSet, m5.f815b, i6);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (i7 = m5.i(1, -1)) != -1 && (drawable = e.a.a(imageView.getContext(), i7)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                p0.a(drawable);
            }
            if (m5.l(2)) {
                j0.f.c(imageView, m5.b(2));
            }
            if (m5.l(3)) {
                j0.f.d(imageView, p0.b(m5.h(3, -1), null));
            }
        } finally {
            m5.n();
        }
    }
}
