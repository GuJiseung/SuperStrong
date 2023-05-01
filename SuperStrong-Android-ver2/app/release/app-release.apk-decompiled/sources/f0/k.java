package f0;

import android.graphics.Rect;
import android.view.Gravity;
/* loaded from: classes.dex */
public final class k {
    public static void a(int i6, int i7, int i8, Rect rect, int i9, int i10, Rect rect2, int i11) {
        Gravity.apply(i6, i7, i8, rect, i9, i10, rect2, i11);
    }

    public static void b(int i6, int i7, int i8, Rect rect, Rect rect2, int i9) {
        Gravity.apply(i6, i7, i8, rect, rect2, i9);
    }

    public static void c(int i6, Rect rect, Rect rect2, int i7) {
        Gravity.applyDisplay(i6, rect, rect2, i7);
    }
}
