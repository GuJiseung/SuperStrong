package r1;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class q extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5930b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(i1.f.f4585a);

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f5930b);
    }

    @Override // r1.f
    public final Bitmap c(l1.d dVar, Bitmap bitmap, int i6, int i7) {
        return z.b(dVar, bitmap, i6, i7);
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // i1.f
    public final int hashCode() {
        return 1572326941;
    }
}
