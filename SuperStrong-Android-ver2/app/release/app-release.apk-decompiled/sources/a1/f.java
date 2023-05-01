package a1;

import a1.i;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p0;
import java.util.ArrayList;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class f extends p0 {

    /* loaded from: classes.dex */
    public class a implements i.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f21a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f22b;

        public a(View view, ArrayList arrayList) {
            this.f21a = view;
            this.f22b = arrayList;
        }

        @Override // a1.i.d
        public final void a() {
        }

        @Override // a1.i.d
        public final void b() {
        }

        @Override // a1.i.d
        public final void c() {
        }

        @Override // a1.i.d
        public final void d() {
        }

        @Override // a1.i.d
        public final void e(i iVar) {
            iVar.y(this);
            this.f21a.setVisibility(8);
            ArrayList arrayList = this.f22b;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((View) arrayList.get(i6)).setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends i.c {
    }

    @Override // androidx.fragment.app.p0
    public final void a(View view, Object obj) {
        ((i) obj).b(view);
    }

    @Override // androidx.fragment.app.p0
    public final void b(Object obj, ArrayList<View> arrayList) {
        boolean z5;
        i iVar;
        i iVar2 = (i) obj;
        if (iVar2 == null) {
            return;
        }
        int i6 = 0;
        if (iVar2 instanceof n) {
            n nVar = (n) iVar2;
            int size = nVar.f90y.size();
            while (i6 < size) {
                if (i6 >= 0 && i6 < nVar.f90y.size()) {
                    iVar = nVar.f90y.get(i6);
                } else {
                    iVar = null;
                }
                b(iVar, arrayList);
                i6++;
            }
            return;
        }
        if (p0.h(iVar2.f60f) && p0.h(null) && p0.h(null)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5 && p0.h(iVar2.f61g)) {
            int size2 = arrayList.size();
            while (i6 < size2) {
                iVar2.b(arrayList.get(i6));
                i6++;
            }
        }
    }

    @Override // androidx.fragment.app.p0
    public final void c(ViewGroup viewGroup, Object obj) {
        m.a(viewGroup, (i) obj);
    }

    @Override // androidx.fragment.app.p0
    public final boolean e(Object obj) {
        return obj instanceof i;
    }

    @Override // androidx.fragment.app.p0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((i) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.p0
    public final Object i(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        i iVar3 = (i) obj3;
        if (iVar != null && iVar2 != null) {
            n nVar = new n();
            nVar.K(iVar);
            nVar.K(iVar2);
            nVar.N(1);
            iVar = nVar;
        } else if (iVar == null) {
            iVar = iVar2 != null ? iVar2 : null;
        }
        if (iVar3 != null) {
            n nVar2 = new n();
            if (iVar != null) {
                nVar2.K(iVar);
            }
            nVar2.K(iVar3);
            return nVar2;
        }
        return iVar;
    }

    @Override // androidx.fragment.app.p0
    public final Object j(Object obj, Object obj2) {
        n nVar = new n();
        if (obj != null) {
            nVar.K((i) obj);
        }
        nVar.K((i) obj2);
        return nVar;
    }

    @Override // androidx.fragment.app.p0
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((i) obj).a(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.p0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((i) obj).a(new g(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.p0
    public final void m(View view, Object obj) {
        if (view != null) {
            p0.g(view, new Rect());
            ((i) obj).D(new e());
        }
    }

    @Override // androidx.fragment.app.p0
    public final void n(Object obj, Rect rect) {
        ((i) obj).D(new b());
    }

    @Override // androidx.fragment.app.p0
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        n nVar = (n) obj;
        ArrayList<View> arrayList2 = nVar.f61g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            p0.d(arrayList.get(i6), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(nVar, arrayList);
    }

    @Override // androidx.fragment.app.p0
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        n nVar = (n) obj;
        if (nVar != null) {
            ArrayList<View> arrayList3 = nVar.f61g;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(nVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.p0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        n nVar = new n();
        nVar.K((i) obj);
        return nVar;
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        boolean z5;
        int size;
        i iVar;
        i iVar2 = (i) obj;
        int i6 = 0;
        if (iVar2 instanceof n) {
            n nVar = (n) iVar2;
            int size2 = nVar.f90y.size();
            while (i6 < size2) {
                if (i6 >= 0 && i6 < nVar.f90y.size()) {
                    iVar = nVar.f90y.get(i6);
                } else {
                    iVar = null;
                }
                s(iVar, arrayList, arrayList2);
                i6++;
            }
            return;
        }
        if (p0.h(iVar2.f60f) && p0.h(null) && p0.h(null)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5) {
            ArrayList<View> arrayList3 = iVar2.f61g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i6 < size) {
                    iVar2.b(arrayList2.get(i6));
                    i6++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        iVar2.z(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
