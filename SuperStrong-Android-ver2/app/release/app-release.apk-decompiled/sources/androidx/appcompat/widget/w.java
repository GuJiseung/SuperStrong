package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.superstrong.android.R;
import f0.g0;
import z.a;
/* loaded from: classes.dex */
public final class w extends r {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f982d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f983e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f984f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f985g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f986h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f987i;

    public w(SeekBar seekBar) {
        super(seekBar);
        this.f984f = null;
        this.f985g = null;
        this.f986h = false;
        this.f987i = false;
        this.f982d = seekBar;
    }

    @Override // androidx.appcompat.widget.r
    public final void a(AttributeSet attributeSet, int i6) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f982d;
        Context context = seekBar.getContext();
        int[] iArr = c.b.f2664h;
        j1 m5 = j1.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        f0.g0.k(seekBar, seekBar.getContext(), iArr, attributeSet, m5.f815b, R.attr.seekBarStyle);
        Drawable f6 = m5.f(0);
        if (f6 != null) {
            seekBar.setThumb(f6);
        }
        Drawable e6 = m5.e(1);
        Drawable drawable = this.f983e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f983e = e6;
        if (e6 != null) {
            e6.setCallback(seekBar);
            a.c.b(e6, g0.e.d(seekBar));
            if (e6.isStateful()) {
                e6.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m5.l(3)) {
            this.f985g = p0.b(m5.h(3, -1), this.f985g);
            this.f987i = true;
        }
        if (m5.l(2)) {
            this.f984f = m5.b(2);
            this.f986h = true;
        }
        m5.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f983e;
        if (drawable != null) {
            if (this.f986h || this.f987i) {
                Drawable mutate = drawable.mutate();
                this.f983e = mutate;
                if (this.f986h) {
                    a.b.h(mutate, this.f984f);
                }
                if (this.f987i) {
                    a.b.i(this.f983e, this.f985g);
                }
                if (this.f983e.isStateful()) {
                    this.f983e.setState(this.f982d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f983e != null) {
            SeekBar seekBar = this.f982d;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f983e.getIntrinsicWidth();
                int intrinsicHeight = this.f983e.getIntrinsicHeight();
                int i6 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i7 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f983e.setBounds(-i6, -i7, i6, i7);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i8 = 0; i8 <= max; i8++) {
                    this.f983e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
