package f0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* loaded from: classes.dex */
public final class g1 extends androidx.fragment.app.r0 {

    /* renamed from: o  reason: collision with root package name */
    public final WindowInsetsController f3897o;

    /* renamed from: p  reason: collision with root package name */
    public final Window f3898p;

    public g1(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        new l.h();
        this.f3897o = insetsController;
        this.f3898p = window;
    }

    @Override // androidx.fragment.app.r0
    public final void f(boolean z5) {
        WindowInsetsController windowInsetsController = this.f3897o;
        Window window = this.f3898p;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // androidx.fragment.app.r0
    public final void g(boolean z5) {
        WindowInsetsController windowInsetsController = this.f3897o;
        Window window = this.f3898p;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }
}
