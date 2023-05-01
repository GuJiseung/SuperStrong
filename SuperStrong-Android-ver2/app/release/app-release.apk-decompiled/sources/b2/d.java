package b2;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes.dex */
public final class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Override // b2.e
    public final void l(Drawable drawable) {
        ((ImageView) this.f2358b).setImageDrawable(drawable);
    }
}
