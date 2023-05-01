package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.j1;
import b3.g;
import com.superstrong.android.R;
import m2.c;
import z2.n;
import z2.q;
/* loaded from: classes.dex */
public class BottomNavigationView extends g {

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends g.a {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends g.b {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j1 e6 = n.e(getContext(), attributeSet, c.b.E, R.attr.bottomNavigationStyle, 2131952414, new int[0]);
        setItemHorizontalTranslationEnabled(e6.a(2, true));
        if (e6.l(0)) {
            setMinimumHeight(e6.d(0, 0));
        }
        e6.a(1, true);
        e6.n();
        q.a(this, new c());
    }

    @Override // b3.g
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i7) != 1073741824 && suggestedMinimumHeight > 0) {
            int paddingTop = getPaddingTop();
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i6, i7);
    }

    public void setItemHorizontalTranslationEnabled(boolean z5) {
        m2.b bVar = (m2.b) getMenuView();
        if (bVar.K != z5) {
            bVar.setItemHorizontalTranslationEnabled(z5);
            getPresenter().i(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
