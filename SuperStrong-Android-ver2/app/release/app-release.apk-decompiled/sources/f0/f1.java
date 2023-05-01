package f0;

import android.view.View;
import android.view.Window;
/* loaded from: classes.dex */
public final class f1 extends e1 {
    public f1(Window window) {
        super(window);
    }

    @Override // androidx.fragment.app.r0
    public final void f(boolean z5) {
        Window window = this.f3864o;
        if (z5) {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
    }
}
