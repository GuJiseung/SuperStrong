package g0;

import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public final class b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i6) {
        accessibilityEvent.setContentChangeTypes(i6);
    }
}
