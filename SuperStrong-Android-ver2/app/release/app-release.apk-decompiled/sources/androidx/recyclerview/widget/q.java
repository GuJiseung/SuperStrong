package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class q extends s {
    public q(RecyclerView.l lVar) {
        super(lVar);
    }

    @Override // androidx.recyclerview.widget.s
    public final int b(View view) {
        this.f2163a.getClass();
        return RecyclerView.l.I(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f2163a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f1925b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f2163a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f1925b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(View view) {
        this.f2163a.getClass();
        return (view.getLeft() - RecyclerView.l.B(view)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
        return this.f2163a.f1916n;
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
        RecyclerView.l lVar = this.f2163a;
        return lVar.f1916n - lVar.E();
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
        return this.f2163a.E();
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
        return this.f2163a.f1914l;
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
        return this.f2163a.f1915m;
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
        return this.f2163a.D();
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
        RecyclerView.l lVar = this.f2163a;
        return (lVar.f1916n - lVar.D()) - lVar.E();
    }

    @Override // androidx.recyclerview.widget.s
    public final int m(View view) {
        RecyclerView.l lVar = this.f2163a;
        Rect rect = this.f2165c;
        lVar.L(view, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(View view) {
        RecyclerView.l lVar = this.f2163a;
        Rect rect = this.f2165c;
        lVar.L(view, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.s
    public final void o(int i6) {
        this.f2163a.P(i6);
    }
}
