package r1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5903b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(i1.f.f4585a);

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f5903b);
    }

    @Override // r1.f
    public final Bitmap c(l1.d dVar, Bitmap bitmap, int i6, int i7) {
        Paint paint = z.f5964a;
        if (bitmap.getWidth() <= i6 && bitmap.getHeight() <= i7) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                return bitmap;
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return z.b(dVar, bitmap, i6, i7);
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // i1.f
    public final int hashCode() {
        return -670243078;
    }
}
