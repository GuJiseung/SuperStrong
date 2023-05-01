package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class k extends z {
    public static TimeInterpolator s;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f2079h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f2080i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<b> f2081j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<a> f2082k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.a0>> f2083l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<ArrayList<b>> f2084m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<ArrayList<a>> f2085n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f2086o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f2087p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f2088q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f2089r = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.a0 f2090a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.a0 f2091b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2092c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2093d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2094e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2095f;

        public a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i6, int i7, int i8, int i9) {
            this.f2090a = a0Var;
            this.f2091b = a0Var2;
            this.f2092c = i6;
            this.f2093d = i7;
            this.f2094e = i8;
            this.f2095f = i9;
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f2090a + ", newHolder=" + this.f2091b + ", fromX=" + this.f2092c + ", fromY=" + this.f2093d + ", toX=" + this.f2094e + ", toY=" + this.f2095f + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.a0 f2096a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2097b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2098c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2099d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2100e;

        public b(RecyclerView.a0 a0Var, int i6, int i7, int i8, int i9) {
            this.f2096a = a0Var;
            this.f2097b = i6;
            this.f2098c = i7;
            this.f2099d = i8;
            this.f2100e = i9;
        }
    }

    public static void h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((RecyclerView.a0) arrayList.get(size)).f1873a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void d(RecyclerView.a0 a0Var) {
        View view = a0Var.f1873a;
        view.animate().cancel();
        ArrayList<b> arrayList = this.f2081j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size).f2096a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(a0Var);
                arrayList.remove(size);
            }
        }
        j(a0Var, this.f2082k);
        if (this.f2079h.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        if (this.f2080i.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.f2085n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList3 = arrayList2.get(size2);
            j(a0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.f2084m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList5.get(size4).f2096a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(a0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.a0>> arrayList6 = this.f2083l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.a0> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(a0Var)) {
                    view.setAlpha(1.0f);
                    c(a0Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f2088q.remove(a0Var);
                this.f2086o.remove(a0Var);
                this.f2089r.remove(a0Var);
                this.f2087p.remove(a0Var);
                i();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e() {
        ArrayList<b> arrayList = this.f2081j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList.get(size);
            View view = bVar.f2096a.f1873a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f2096a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.a0> arrayList2 = this.f2079h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.a0> arrayList3 = this.f2080i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.a0 a0Var = arrayList3.get(size3);
            a0Var.f1873a.setAlpha(1.0f);
            c(a0Var);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.f2082k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = arrayList4.get(size4);
            RecyclerView.a0 a0Var2 = aVar.f2090a;
            if (a0Var2 != null) {
                k(aVar, a0Var2);
            }
            RecyclerView.a0 a0Var3 = aVar.f2091b;
            if (a0Var3 != null) {
                k(aVar, a0Var3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList<ArrayList<b>> arrayList5 = this.f2084m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<b> arrayList6 = arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    b bVar2 = arrayList6.get(size6);
                    View view2 = bVar2.f2096a.f1873a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.f2096a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.a0>> arrayList7 = this.f2083l;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.a0> arrayList8 = arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.a0 a0Var4 = arrayList8.get(size8);
                    a0Var4.f1873a.setAlpha(1.0f);
                    c(a0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList<ArrayList<a>> arrayList9 = this.f2085n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList<a> arrayList10 = arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.a0 a0Var5 = aVar2.f2090a;
                    if (a0Var5 != null) {
                        k(aVar2, a0Var5);
                    }
                    RecyclerView.a0 a0Var6 = aVar2.f2091b;
                    if (a0Var6 != null) {
                        k(aVar2, a0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        h(this.f2088q);
        h(this.f2087p);
        h(this.f2086o);
        h(this.f2089r);
        ArrayList<RecyclerView.i.a> arrayList11 = this.f1895b;
        int size11 = arrayList11.size();
        for (int i6 = 0; i6 < size11; i6++) {
            arrayList11.get(i6).a();
        }
        arrayList11.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean f() {
        return (this.f2080i.isEmpty() && this.f2082k.isEmpty() && this.f2081j.isEmpty() && this.f2079h.isEmpty() && this.f2087p.isEmpty() && this.f2088q.isEmpty() && this.f2086o.isEmpty() && this.f2089r.isEmpty() && this.f2084m.isEmpty() && this.f2083l.isEmpty() && this.f2085n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.z
    public final boolean g(RecyclerView.a0 a0Var, int i6, int i7, int i8, int i9) {
        View view = a0Var.f1873a;
        int translationX = i6 + ((int) view.getTranslationX());
        int translationY = i7 + ((int) a0Var.f1873a.getTranslationY());
        l(a0Var);
        int i10 = i8 - translationX;
        int i11 = i9 - translationY;
        if (i10 == 0 && i11 == 0) {
            c(a0Var);
            return false;
        }
        if (i10 != 0) {
            view.setTranslationX(-i10);
        }
        if (i11 != 0) {
            view.setTranslationY(-i11);
        }
        this.f2081j.add(new b(a0Var, translationX, translationY, i8, i9));
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList<RecyclerView.i.a> arrayList = this.f1895b;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).a();
            }
            arrayList.clear();
        }
    }

    public final void j(RecyclerView.a0 a0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            a aVar = (a) arrayList.get(size);
            if (k(aVar, a0Var) && aVar.f2090a == null && aVar.f2091b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    public final boolean k(a aVar, RecyclerView.a0 a0Var) {
        if (aVar.f2091b == a0Var) {
            aVar.f2091b = null;
        } else if (aVar.f2090a == a0Var) {
            aVar.f2090a = null;
        } else {
            return false;
        }
        a0Var.f1873a.setAlpha(1.0f);
        View view = a0Var.f1873a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(a0Var);
        return true;
    }

    public final void l(RecyclerView.a0 a0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        a0Var.f1873a.animate().setInterpolator(s);
        d(a0Var);
    }
}
