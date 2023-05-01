package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements m {

    /* renamed from: b  reason: collision with root package name */
    public static int f253b;

    public ImmLeaksCleaner() {
        throw null;
    }

    @Override // androidx.lifecycle.m
    public final void f(o oVar, j.b bVar) {
        if (bVar != j.b.ON_DESTROY) {
            return;
        }
        if (f253b == 0) {
            try {
                f253b = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f253b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f253b != 1) {
            return;
        }
        throw null;
    }
}
