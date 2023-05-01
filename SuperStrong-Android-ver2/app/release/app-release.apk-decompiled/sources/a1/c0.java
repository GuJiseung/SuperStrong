package a1;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
public class c0 extends a0 {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f17i = true;

    @SuppressLint({"NewApi"})
    public void r(View view, int i6, int i7, int i8, int i9) {
        if (f17i) {
            try {
                view.setLeftTopRightBottom(i6, i7, i8, i9);
            } catch (NoSuchMethodError unused) {
                f17i = false;
            }
        }
    }
}
