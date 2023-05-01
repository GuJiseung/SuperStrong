package r1;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public abstract class f implements i1.l<Bitmap> {
    @Override // i1.l
    public final k1.w a(com.bumptech.glide.g gVar, k1.w wVar, int i6, int i7) {
        if (e2.j.g(i6, i7)) {
            l1.d dVar = com.bumptech.glide.b.b(gVar).f2791b;
            Bitmap bitmap = (Bitmap) wVar.get();
            if (i6 == Integer.MIN_VALUE) {
                i6 = bitmap.getWidth();
            }
            if (i7 == Integer.MIN_VALUE) {
                i7 = bitmap.getHeight();
            }
            Bitmap c6 = c(dVar, bitmap, i6, i7);
            if (!bitmap.equals(c6)) {
                return e.b(c6, dVar);
            }
            return wVar;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i6 + " or height: " + i7 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(l1.d dVar, Bitmap bitmap, int i6, int i7);
}
