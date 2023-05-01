package l1;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class e implements d {
    @Override // l1.d
    public final void a(int i6) {
    }

    @Override // l1.d
    public final void b() {
    }

    @Override // l1.d
    public final Bitmap c(int i6, int i7, Bitmap.Config config) {
        return Bitmap.createBitmap(i6, i7, config);
    }

    @Override // l1.d
    public final Bitmap d(int i6, int i7, Bitmap.Config config) {
        return Bitmap.createBitmap(i6, i7, config);
    }

    @Override // l1.d
    public void e(Bitmap bitmap) {
        bitmap.recycle();
    }
}
