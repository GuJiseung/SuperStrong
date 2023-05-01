package a1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public class a0 extends x {

    /* renamed from: g  reason: collision with root package name */
    public static boolean f2g = true;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f3h = true;

    @SuppressLint({"NewApi"})
    public void p(View view, Matrix matrix) {
        if (f2g) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2g = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void q(View view, Matrix matrix) {
        if (f3h) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f3h = false;
            }
        }
    }
}
