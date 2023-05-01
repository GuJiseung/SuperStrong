package f0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final PointerIcon f3863a;

    /* loaded from: classes.dex */
    public static class a {
        public static PointerIcon a(Bitmap bitmap, float f6, float f7) {
            return PointerIcon.create(bitmap, f6, f7);
        }

        public static PointerIcon b(Context context, int i6) {
            return PointerIcon.getSystemIcon(context, i6);
        }

        public static PointerIcon c(Resources resources, int i6) {
            return PointerIcon.load(resources, i6);
        }
    }

    public b0(PointerIcon pointerIcon) {
        this.f3863a = pointerIcon;
    }
}
