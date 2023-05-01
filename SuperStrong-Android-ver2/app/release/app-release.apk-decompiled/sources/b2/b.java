package b2;

import android.graphics.Bitmap;
import android.widget.ImageView;
/* loaded from: classes.dex */
public final class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    @Override // b2.e
    public final void l(Bitmap bitmap) {
        ((ImageView) this.f2358b).setImageBitmap(bitmap);
    }
}
