package r1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5902b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(i1.f.f4585a);

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f5902b);
    }

    @Override // r1.f
    public final Bitmap c(l1.d dVar, Bitmap bitmap, int i6, int i7) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = z.f5964a;
        if (bitmap.getWidth() != i6 || bitmap.getHeight() != i7) {
            Matrix matrix = new Matrix();
            float f6 = 0.0f;
            if (bitmap.getWidth() * i7 > bitmap.getHeight() * i6) {
                width = i7 / bitmap.getHeight();
                f6 = (i6 - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i6 / bitmap.getWidth();
                height = (i7 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f6 + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap d6 = dVar.d(i6, i7, config);
            d6.setHasAlpha(bitmap.hasAlpha());
            z.a(bitmap, d6, matrix);
            return d6;
        }
        return bitmap;
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // i1.f
    public final int hashCode() {
        return -599754482;
    }
}
