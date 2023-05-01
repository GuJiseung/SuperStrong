package l3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* loaded from: classes.dex */
public final class a extends com.google.android.material.tabs.a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f6, Drawable drawable) {
        boolean z5;
        float cos;
        float sin;
        RectF a6 = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF a7 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (a6.left < a7.left) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            double d6 = (f6 * 3.141592653589793d) / 2.0d;
            sin = (float) (1.0d - Math.cos(d6));
            cos = (float) Math.sin(d6);
        } else {
            double d7 = (f6 * 3.141592653589793d) / 2.0d;
            cos = (float) (1.0d - Math.cos(d7));
            sin = (float) Math.sin(d7);
        }
        drawable.setBounds(h2.a.b(sin, (int) a6.left, (int) a7.left), drawable.getBounds().top, h2.a.b(cos, (int) a6.right, (int) a7.right), drawable.getBounds().bottom);
    }
}
