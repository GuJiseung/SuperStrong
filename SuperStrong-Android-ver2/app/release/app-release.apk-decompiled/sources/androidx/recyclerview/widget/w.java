package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class w implements a.InterfaceC0014a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2170a;

    public w(RecyclerView recyclerView) {
        this.f2170a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i6 = bVar.f2025a;
        RecyclerView recyclerView = this.f2170a;
        if (i6 == 1) {
            recyclerView.f1853m.X(bVar.f2026b, bVar.f2028d);
        } else if (i6 == 2) {
            recyclerView.f1853m.a0(bVar.f2026b, bVar.f2028d);
        } else if (i6 == 4) {
            recyclerView.f1853m.b0(bVar.f2026b, bVar.f2028d);
        } else if (i6 != 8) {
        } else {
            recyclerView.f1853m.Z(bVar.f2026b, bVar.f2028d);
        }
    }

    public final RecyclerView.a0 b(int i6) {
        RecyclerView recyclerView = this.f2170a;
        int h6 = recyclerView.f1839f.h();
        int i7 = 0;
        RecyclerView.a0 a0Var = null;
        while (true) {
            if (i7 >= h6) {
                break;
            }
            RecyclerView.a0 J = RecyclerView.J(recyclerView.f1839f.g(i7));
            if (J != null && !J.i() && J.f1875c == i6) {
                if (recyclerView.f1839f.j(J.f1873a)) {
                    a0Var = J;
                } else {
                    a0Var = J;
                    break;
                }
            }
            i7++;
        }
        if (a0Var == null || recyclerView.f1839f.j(a0Var.f1873a)) {
            return null;
        }
        return a0Var;
    }

    public final void c(int i6, int i7, Object obj) {
        int i8;
        int i9;
        RecyclerView recyclerView = this.f2170a;
        int h6 = recyclerView.f1839f.h();
        int i10 = i7 + i6;
        for (int i11 = 0; i11 < h6; i11++) {
            View g2 = recyclerView.f1839f.g(i11);
            RecyclerView.a0 J = RecyclerView.J(g2);
            if (J != null && !J.o() && (i9 = J.f1875c) >= i6 && i9 < i10) {
                J.b(2);
                J.a(obj);
                ((RecyclerView.m) g2.getLayoutParams()).f1926c = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f1833c;
        ArrayList<RecyclerView.a0> arrayList = sVar.f1936c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.a0 a0Var = arrayList.get(size);
                if (a0Var != null && (i8 = a0Var.f1875c) >= i6 && i8 < i10) {
                    a0Var.b(2);
                    sVar.e(size);
                }
            } else {
                recyclerView.f1846i0 = true;
                return;
            }
        }
    }

    public final void d(int i6, int i7) {
        RecyclerView recyclerView = this.f2170a;
        int h6 = recyclerView.f1839f.h();
        for (int i8 = 0; i8 < h6; i8++) {
            RecyclerView.a0 J = RecyclerView.J(recyclerView.f1839f.g(i8));
            if (J != null && !J.o() && J.f1875c >= i6) {
                J.l(i7, false);
                recyclerView.f1838e0.f1964f = true;
            }
        }
        ArrayList<RecyclerView.a0> arrayList = recyclerView.f1833c.f1936c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView.a0 a0Var = arrayList.get(i9);
            if (a0Var != null && a0Var.f1875c >= i6) {
                a0Var.l(i7, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1844h0 = true;
    }

    public final void e(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.f2170a;
        int h6 = recyclerView.f1839f.h();
        int i15 = -1;
        if (i6 < i7) {
            i9 = i6;
            i8 = i7;
            i10 = -1;
        } else {
            i8 = i6;
            i9 = i7;
            i10 = 1;
        }
        for (int i16 = 0; i16 < h6; i16++) {
            RecyclerView.a0 J = RecyclerView.J(recyclerView.f1839f.g(i16));
            if (J != null && (i14 = J.f1875c) >= i9 && i14 <= i8) {
                if (i14 == i6) {
                    J.l(i7 - i6, false);
                } else {
                    J.l(i10, false);
                }
                recyclerView.f1838e0.f1964f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f1833c;
        sVar.getClass();
        if (i6 < i7) {
            i12 = i6;
            i11 = i7;
        } else {
            i11 = i6;
            i12 = i7;
            i15 = 1;
        }
        ArrayList<RecyclerView.a0> arrayList = sVar.f1936c;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            RecyclerView.a0 a0Var = arrayList.get(i17);
            if (a0Var != null && (i13 = a0Var.f1875c) >= i12 && i13 <= i11) {
                if (i13 == i6) {
                    a0Var.l(i7 - i6, false);
                } else {
                    a0Var.l(i15, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1844h0 = true;
    }
}
