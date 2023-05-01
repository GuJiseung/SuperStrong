package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
/* loaded from: classes.dex */
public final class o1 {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        p1 p1Var = p1.f877l;
        if (p1Var != null && p1Var.f879b == view) {
            p1.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            p1 p1Var2 = p1.f878m;
            if (p1Var2 != null && p1Var2.f879b == view) {
                p1Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new p1(view, charSequence);
    }
}
