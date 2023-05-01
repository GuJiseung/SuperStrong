package j0;

import android.widget.PopupWindow;
/* loaded from: classes.dex */
public final class j {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z5) {
        popupWindow.setOverlapAnchor(z5);
    }

    public static void d(PopupWindow popupWindow, int i6) {
        popupWindow.setWindowLayoutType(i6);
    }
}
