package f0;

import android.view.View;
import android.view.Window;
/* loaded from: classes.dex */
public class e1 extends d1 {
    public e1(Window window) {
        super(window);
    }

    @Override // androidx.fragment.app.r0
    public final void g(boolean z5) {
        Window window = this.f3864o;
        if (z5) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
    }
}
