package a1;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
public class x extends f0 {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f105f = true;

    @SuppressLint({"NewApi"})
    public float n(View view) {
        float transitionAlpha;
        if (f105f) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f105f = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void o(View view, float f6) {
        if (f105f) {
            try {
                view.setTransitionAlpha(f6);
                return;
            } catch (NoSuchMethodError unused) {
                f105f = false;
            }
        }
        view.setAlpha(f6);
    }
}
