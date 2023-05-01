package f0;

import android.view.View;
import android.view.Window;
/* loaded from: classes.dex */
public final class u0 {
    public static void a(Window window, boolean z5) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
