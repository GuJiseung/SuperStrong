package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class r extends s {
    public r(RecyclerView.l lVar) {
        super(lVar);
    }

    @Override // androidx.recyclerview.widget.s
    public final int b(View view) {
        this.f2163a.getClass();
        return RecyclerView.l.u(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f2163a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f1925b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f2163a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f1925b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(View view) {
        this.f2163a.getClass();
        return (view.getTop() - RecyclerView.l.K(view)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
        return this.f2163a.f1917o;
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
        RecyclerView.l lVar = this.f2163a;
        return lVar.f1917o - lVar.C();
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
        return this.f2163a.C();
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
        return this.f2163a.f1915m;
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
        return this.f2163a.f1914l;
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
        return this.f2163a.F();
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
        RecyclerView.l lVar = this.f2163a;
        return (lVar.f1917o - lVar.F()) - lVar.C();
    }

    @Override // androidx.recyclerview.widget.s
    public final int m(View view) {
        RecyclerView.l lVar = this.f2163a;
        Rect rect = this.f2165c;
        lVar.L(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(View view) {
        RecyclerView.l lVar = this.f2163a;
        Rect rect = this.f2165c;
        lVar.L(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.s
    public final void o(int i6) {
        this.f2163a.Q(i6);
    }
}
