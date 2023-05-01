package r1;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public final class e implements k1.w<Bitmap>, k1.s {

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap f5897b;

    /* renamed from: c  reason: collision with root package name */
    public final l1.d f5898c;

    public e(Bitmap bitmap, l1.d dVar) {
        if (bitmap != null) {
            this.f5897b = bitmap;
            if (dVar != null) {
                this.f5898c = dVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static e b(Bitmap bitmap, l1.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // k1.s
    public final void a() {
        this.f5897b.prepareToDraw();
    }

    @Override // k1.w
    public final int c() {
        return e2.j.c(this.f5897b);
    }

    @Override // k1.w
    public final Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // k1.w
    public final void e() {
        this.f5898c.e(this.f5897b);
    }

    @Override // k1.w
    public final Bitmap get() {
        return this.f5897b;
    }
}
