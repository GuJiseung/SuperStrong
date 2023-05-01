package r1;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public final class a0 implements i1.j<Bitmap, Bitmap> {

    /* loaded from: classes.dex */
    public static final class a implements k1.w<Bitmap> {

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f5881b;

        public a(Bitmap bitmap) {
            this.f5881b = bitmap;
        }

        @Override // k1.w
        public final int c() {
            return e2.j.c(this.f5881b);
        }

        @Override // k1.w
        public final Class<Bitmap> d() {
            return Bitmap.class;
        }

        @Override // k1.w
        public final void e() {
        }

        @Override // k1.w
        public final Bitmap get() {
            return this.f5881b;
        }
    }

    @Override // i1.j
    public final k1.w<Bitmap> a(Bitmap bitmap, int i6, int i7, i1.h hVar) {
        return new a(bitmap);
    }

    @Override // i1.j
    public final /* bridge */ /* synthetic */ boolean b(Bitmap bitmap, i1.h hVar) {
        return true;
    }
}
