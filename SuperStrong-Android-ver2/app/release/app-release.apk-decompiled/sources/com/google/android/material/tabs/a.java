package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import z2.q;
/* loaded from: classes.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.F && (view instanceof TabLayout.h)) {
            TabLayout.h hVar = (TabLayout.h) view;
            int contentWidth = hVar.getContentWidth();
            int contentHeight = hVar.getContentHeight();
            int b6 = (int) q.b(hVar.getContext(), 24);
            if (contentWidth < b6) {
                contentWidth = b6;
            }
            int right = (hVar.getRight() + hVar.getLeft()) / 2;
            int bottom = (hVar.getBottom() + hVar.getTop()) / 2;
            int i6 = contentWidth / 2;
            return new RectF(right - i6, bottom - (contentHeight / 2), i6 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void b(TabLayout tabLayout, View view, View view2, float f6, Drawable drawable) {
        RectF a6 = a(tabLayout, view);
        RectF a7 = a(tabLayout, view2);
        drawable.setBounds(h2.a.b(f6, (int) a6.left, (int) a7.left), drawable.getBounds().top, h2.a.b(f6, (int) a6.right, (int) a7.right), drawable.getBounds().bottom);
    }
}
