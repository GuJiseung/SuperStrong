package l3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* loaded from: classes.dex */
public final class b extends com.google.android.material.tabs.a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f6, Drawable drawable) {
        int i6 = (f6 > 0.5f ? 1 : (f6 == 0.5f ? 0 : -1));
        if (i6 >= 0) {
            view = view2;
        }
        RectF a6 = com.google.android.material.tabs.a.a(tabLayout, view);
        float a7 = i6 < 0 ? h2.a.a(1.0f, 0.0f, 0.0f, 0.5f, f6) : h2.a.a(0.0f, 1.0f, 0.5f, 1.0f, f6);
        drawable.setBounds((int) a6.left, drawable.getBounds().top, (int) a6.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (a7 * 255.0f));
    }
}
