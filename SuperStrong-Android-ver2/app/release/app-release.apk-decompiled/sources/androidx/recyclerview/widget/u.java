package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class u extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public r f2167c;

    /* renamed from: d  reason: collision with root package name */
    public q f2168d;

    public static int e(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public static View f(RecyclerView.l lVar, s sVar) {
        int w5 = lVar.w();
        View view = null;
        if (w5 == 0) {
            return null;
        }
        int l5 = (sVar.l() / 2) + sVar.k();
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < w5; i7++) {
            View v2 = lVar.v(i7);
            int abs = Math.abs(((sVar.c(v2) / 2) + sVar.e(v2)) - l5);
            if (abs < i6) {
                view = v2;
                i6 = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int[] b(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.d()) {
            iArr[0] = e(view, g(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.e()) {
            iArr[1] = e(view, h(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.a0
    public View c(RecyclerView.l lVar) {
        s g2;
        if (lVar.e()) {
            g2 = h(lVar);
        } else if (!lVar.d()) {
            return null;
        } else {
            g2 = g(lVar);
        }
        return f(lVar, g2);
    }

    public final s g(RecyclerView.l lVar) {
        q qVar = this.f2168d;
        if (qVar == null || qVar.f2163a != lVar) {
            this.f2168d = new q(lVar);
        }
        return this.f2168d;
    }

    public final s h(RecyclerView.l lVar) {
        r rVar = this.f2167c;
        if (rVar == null || rVar.f2163a != lVar) {
            this.f2167c = new r(lVar);
        }
        return this.f2167c;
    }
}
