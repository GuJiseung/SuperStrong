package a1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
public class d0 extends c0 {

    /* renamed from: j  reason: collision with root package name */
    public static boolean f20j = true;

    @Override // a1.f0
    @SuppressLint({"NewApi"})
    public void k(View view, int i6) {
        if (Build.VERSION.SDK_INT == 28) {
            super.k(view, i6);
        } else if (f20j) {
            try {
                view.setTransitionVisibility(i6);
            } catch (NoSuchMethodError unused) {
                f20j = false;
            }
        }
    }
}
