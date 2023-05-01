package t1;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class c extends b<Drawable> {
    public c(Drawable drawable) {
        super(drawable);
    }

    @Override // k1.w
    public final int c() {
        T t5 = this.f6132b;
        return Math.max(1, t5.getIntrinsicHeight() * t5.getIntrinsicWidth() * 4);
    }

    @Override // k1.w
    public final Class<Drawable> d() {
        return this.f6132b.getClass();
    }

    @Override // k1.w
    public final void e() {
    }
}
