package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class y {
    public static int a(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.l lVar, boolean z5) {
        if (lVar.w() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z5) {
            return Math.min(sVar.l(), sVar.b(view2) - sVar.e(view));
        }
        return Math.abs(RecyclerView.l.G(view) - RecyclerView.l.G(view2)) + 1;
    }

    public static int b(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.l lVar, boolean z5, boolean z6) {
        if (lVar.w() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z6 ? Math.max(0, (xVar.b() - Math.max(RecyclerView.l.G(view), RecyclerView.l.G(view2))) - 1) : Math.max(0, Math.min(RecyclerView.l.G(view), RecyclerView.l.G(view2)));
        if (z5) {
            return Math.round((max * (Math.abs(sVar.b(view2) - sVar.e(view)) / (Math.abs(RecyclerView.l.G(view) - RecyclerView.l.G(view2)) + 1))) + (sVar.k() - sVar.e(view)));
        }
        return max;
    }

    public static int c(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.l lVar, boolean z5) {
        if (lVar.w() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z5) {
            return (int) (((sVar.b(view2) - sVar.e(view)) / (Math.abs(RecyclerView.l.G(view) - RecyclerView.l.G(view2)) + 1)) * xVar.b());
        }
        return xVar.b();
    }
}
