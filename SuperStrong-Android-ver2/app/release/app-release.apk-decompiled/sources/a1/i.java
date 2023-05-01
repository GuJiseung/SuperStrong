package a1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import f0.g0;
import f0.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class i implements Cloneable {

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f53v = {2, 1, 3, 4};

    /* renamed from: w  reason: collision with root package name */
    public static final a f54w = new a();

    /* renamed from: x  reason: collision with root package name */
    public static final ThreadLocal<l.b<Animator, b>> f55x = new ThreadLocal<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<q> f66l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<q> f67m;

    /* renamed from: t  reason: collision with root package name */
    public c f73t;

    /* renamed from: b  reason: collision with root package name */
    public final String f56b = getClass().getName();

    /* renamed from: c  reason: collision with root package name */
    public long f57c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f58d = -1;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f59e = null;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<Integer> f60f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<View> f61g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public androidx.fragment.app.h0 f62h = new androidx.fragment.app.h0(1);

    /* renamed from: i  reason: collision with root package name */
    public androidx.fragment.app.h0 f63i = new androidx.fragment.app.h0(1);

    /* renamed from: j  reason: collision with root package name */
    public n f64j = null;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f65k = f53v;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<Animator> f68n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public int f69o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f70p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f71q = false;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<d> f72r = null;
    public ArrayList<Animator> s = new ArrayList<>();
    public androidx.activity.result.c u = f54w;

    /* loaded from: classes.dex */
    public static class a extends androidx.activity.result.c {
        @Override // androidx.activity.result.c
        public final Path k(float f6, float f7, float f8, float f9) {
            Path path = new Path();
            path.moveTo(f6, f7);
            path.lineTo(f8, f9);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final View f74a;

        /* renamed from: b  reason: collision with root package name */
        public final String f75b;

        /* renamed from: c  reason: collision with root package name */
        public final q f76c;

        /* renamed from: d  reason: collision with root package name */
        public final j0 f77d;

        /* renamed from: e  reason: collision with root package name */
        public final i f78e;

        public b(View view, String str, i iVar, i0 i0Var, q qVar) {
            this.f74a = view;
            this.f75b = str;
            this.f76c = qVar;
            this.f77d = i0Var;
            this.f78e = iVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c();

        void d();

        void e(i iVar);
    }

    public static void c(androidx.fragment.app.h0 h0Var, View view, q qVar) {
        ((l.b) h0Var.f1492a).put(view, qVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) h0Var.f1493b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, r0> weakHashMap = f0.g0.f3878a;
        String k5 = g0.i.k(view);
        if (k5 != null) {
            if (((l.b) h0Var.f1495d).containsKey(k5)) {
                ((l.b) h0Var.f1495d).put(k5, null);
            } else {
                ((l.b) h0Var.f1495d).put(k5, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                l.e eVar = (l.e) h0Var.f1494c;
                if (eVar.f5037b) {
                    eVar.c();
                }
                if (f0.d(eVar.f5038c, eVar.f5040e, itemIdAtPosition) >= 0) {
                    View view2 = (View) eVar.d(itemIdAtPosition, null);
                    if (view2 != null) {
                        g0.d.r(view2, false);
                        eVar.f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                g0.d.r(view, true);
                eVar.f(itemIdAtPosition, view);
            }
        }
    }

    public static l.b<Animator, b> r() {
        ThreadLocal<l.b<Animator, b>> threadLocal = f55x;
        l.b<Animator, b> bVar = threadLocal.get();
        if (bVar == null) {
            l.b<Animator, b> bVar2 = new l.b<>();
            threadLocal.set(bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static boolean w(q qVar, q qVar2, String str) {
        Object obj = qVar.f97a.get(str);
        Object obj2 = qVar2.f97a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(ViewGroup viewGroup) {
        boolean z5;
        if (this.f70p) {
            if (!this.f71q) {
                l.b<Animator, b> r5 = r();
                int i6 = r5.f5067d;
                d0 d0Var = u.f103a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i7 = i6 - 1; i7 >= 0; i7--) {
                    b l5 = r5.l(i7);
                    if (l5.f74a != null) {
                        j0 j0Var = l5.f77d;
                        if ((j0Var instanceof i0) && ((i0) j0Var).f79a.equals(windowId)) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            r5.h(i7).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.f72r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f72r.clone();
                    int size = arrayList2.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ((d) arrayList2.get(i8)).c();
                    }
                }
            }
            this.f70p = false;
        }
    }

    public void B() {
        I();
        l.b<Animator, b> r5 = r();
        Iterator<Animator> it = this.s.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (r5.containsKey(next)) {
                I();
                if (next != null) {
                    next.addListener(new j(this, r5));
                    long j5 = this.f58d;
                    if (j5 >= 0) {
                        next.setDuration(j5);
                    }
                    long j6 = this.f57c;
                    if (j6 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j6);
                    }
                    TimeInterpolator timeInterpolator = this.f59e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new k(this));
                    next.start();
                }
            }
        }
        this.s.clear();
        p();
    }

    public void C(long j5) {
        this.f58d = j5;
    }

    public void D(c cVar) {
        this.f73t = cVar;
    }

    public void E(TimeInterpolator timeInterpolator) {
        this.f59e = timeInterpolator;
    }

    public void F(androidx.activity.result.c cVar) {
        if (cVar == null) {
            cVar = f54w;
        }
        this.u = cVar;
    }

    public void G() {
    }

    public void H(long j5) {
        this.f57c = j5;
    }

    public final void I() {
        if (this.f69o == 0) {
            ArrayList<d> arrayList = this.f72r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f72r.clone();
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((d) arrayList2.get(i6)).a();
                }
            }
            this.f71q = false;
        }
        this.f69o++;
    }

    public String J(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f58d != -1) {
            str2 = str2 + "dur(" + this.f58d + ") ";
        }
        if (this.f57c != -1) {
            str2 = str2 + "dly(" + this.f57c + ") ";
        }
        if (this.f59e != null) {
            str2 = str2 + "interp(" + this.f59e + ") ";
        }
        ArrayList<Integer> arrayList = this.f60f;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f61g;
        if (size > 0 || arrayList2.size() > 0) {
            String str3 = str2 + "tgts(";
            if (arrayList.size() > 0) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    if (i6 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + arrayList.get(i6);
                }
            }
            if (arrayList2.size() > 0) {
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    if (i7 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + arrayList2.get(i7);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    public void a(d dVar) {
        if (this.f72r == null) {
            this.f72r = new ArrayList<>();
        }
        this.f72r.add(dVar);
    }

    public void b(View view) {
        this.f61g.add(view);
    }

    public abstract void d(q qVar);

    public final void e(View view, boolean z5) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            q qVar = new q(view);
            if (z5) {
                g(qVar);
            } else {
                d(qVar);
            }
            qVar.f99c.add(this);
            f(qVar);
            c(z5 ? this.f62h : this.f63i, view, qVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                e(viewGroup.getChildAt(i6), z5);
            }
        }
    }

    public void f(q qVar) {
    }

    public abstract void g(q qVar);

    public final void h(ViewGroup viewGroup, boolean z5) {
        i(z5);
        ArrayList<Integer> arrayList = this.f60f;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f61g;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z5);
            return;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            View findViewById = viewGroup.findViewById(arrayList.get(i6).intValue());
            if (findViewById != null) {
                q qVar = new q(findViewById);
                if (z5) {
                    g(qVar);
                } else {
                    d(qVar);
                }
                qVar.f99c.add(this);
                f(qVar);
                c(z5 ? this.f62h : this.f63i, findViewById, qVar);
            }
        }
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            View view = arrayList2.get(i7);
            q qVar2 = new q(view);
            if (z5) {
                g(qVar2);
            } else {
                d(qVar2);
            }
            qVar2.f99c.add(this);
            f(qVar2);
            c(z5 ? this.f62h : this.f63i, view, qVar2);
        }
    }

    public final void i(boolean z5) {
        androidx.fragment.app.h0 h0Var;
        if (z5) {
            ((l.b) this.f62h.f1492a).clear();
            ((SparseArray) this.f62h.f1493b).clear();
            h0Var = this.f62h;
        } else {
            ((l.b) this.f63i.f1492a).clear();
            ((SparseArray) this.f63i.f1493b).clear();
            h0Var = this.f63i;
        }
        ((l.e) h0Var.f1494c).a();
    }

    @Override // 
    /* renamed from: j */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.s = new ArrayList<>();
            iVar.f62h = new androidx.fragment.app.h0(1);
            iVar.f63i = new androidx.fragment.app.h0(1);
            iVar.f66l = null;
            iVar.f67m = null;
            return iVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, q qVar, q qVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, androidx.fragment.app.h0 h0Var, androidx.fragment.app.h0 h0Var2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        boolean z5;
        Animator l5;
        View view;
        Animator animator;
        q qVar;
        Animator animator2;
        q qVar2;
        ViewGroup viewGroup2 = viewGroup;
        l.b<Animator, b> r5 = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            q qVar3 = arrayList.get(i6);
            q qVar4 = arrayList2.get(i6);
            if (qVar3 != null && !qVar3.f99c.contains(this)) {
                qVar3 = null;
            }
            if (qVar4 != null && !qVar4.f99c.contains(this)) {
                qVar4 = null;
            }
            if (qVar3 != null || qVar4 != null) {
                if (qVar3 != null && qVar4 != null && !u(qVar3, qVar4)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z5 && (l5 = l(viewGroup2, qVar3, qVar4)) != null) {
                    if (qVar4 != null) {
                        String[] s = s();
                        view = qVar4.f98b;
                        if (s != null && s.length > 0) {
                            qVar2 = new q(view);
                            q qVar5 = (q) ((l.b) h0Var2.f1492a).getOrDefault(view, null);
                            if (qVar5 != null) {
                                int i7 = 0;
                                while (i7 < s.length) {
                                    HashMap hashMap = qVar2.f97a;
                                    Animator animator3 = l5;
                                    String str = s[i7];
                                    hashMap.put(str, qVar5.f97a.get(str));
                                    i7++;
                                    l5 = animator3;
                                    s = s;
                                }
                            }
                            Animator animator4 = l5;
                            int i8 = r5.f5067d;
                            int i9 = 0;
                            while (true) {
                                if (i9 < i8) {
                                    b orDefault = r5.getOrDefault(r5.h(i9), null);
                                    if (orDefault.f76c != null && orDefault.f74a == view && orDefault.f75b.equals(this.f56b) && orDefault.f76c.equals(qVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i9++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = l5;
                            qVar2 = null;
                        }
                        animator = animator2;
                        qVar = qVar2;
                    } else {
                        view = qVar3.f98b;
                        animator = l5;
                        qVar = null;
                    }
                    if (animator != null) {
                        String str2 = this.f56b;
                        d0 d0Var = u.f103a;
                        r5.put(animator, new b(view, str2, this, new i0(viewGroup2), qVar));
                        this.s.add(animator);
                    }
                    i6++;
                    viewGroup2 = viewGroup;
                }
            }
            i6++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                Animator animator5 = this.s.get(sparseIntArray.keyAt(i10));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i10) - Long.MAX_VALUE));
            }
        }
    }

    public final void p() {
        int i6 = this.f69o - 1;
        this.f69o = i6;
        if (i6 == 0) {
            ArrayList<d> arrayList = this.f72r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f72r.clone();
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((d) arrayList2.get(i7)).e(this);
                }
            }
            for (int i8 = 0; i8 < ((l.e) this.f62h.f1494c).h(); i8++) {
                View view = (View) ((l.e) this.f62h.f1494c).i(i8);
                if (view != null) {
                    WeakHashMap<View, r0> weakHashMap = f0.g0.f3878a;
                    g0.d.r(view, false);
                }
            }
            for (int i9 = 0; i9 < ((l.e) this.f63i.f1494c).h(); i9++) {
                View view2 = (View) ((l.e) this.f63i.f1494c).i(i9);
                if (view2 != null) {
                    WeakHashMap<View, r0> weakHashMap2 = f0.g0.f3878a;
                    g0.d.r(view2, false);
                }
            }
            this.f71q = true;
        }
    }

    public final q q(View view, boolean z5) {
        n nVar = this.f64j;
        if (nVar != null) {
            return nVar.q(view, z5);
        }
        ArrayList<q> arrayList = z5 ? this.f66l : this.f67m;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            }
            q qVar = arrayList.get(i6);
            if (qVar == null) {
                return null;
            }
            if (qVar.f98b == view) {
                break;
            }
            i6++;
        }
        if (i6 >= 0) {
            return (z5 ? this.f67m : this.f66l).get(i6);
        }
        return null;
    }

    public String[] s() {
        return null;
    }

    public final q t(View view, boolean z5) {
        androidx.fragment.app.h0 h0Var;
        n nVar = this.f64j;
        if (nVar != null) {
            return nVar.t(view, z5);
        }
        if (z5) {
            h0Var = this.f62h;
        } else {
            h0Var = this.f63i;
        }
        return (q) ((l.b) h0Var.f1492a).getOrDefault(view, null);
    }

    public final String toString() {
        return J("");
    }

    public boolean u(q qVar, q qVar2) {
        if (qVar == null || qVar2 == null) {
            return false;
        }
        String[] s = s();
        if (s == null) {
            for (String str : qVar.f97a.keySet()) {
                if (w(qVar, qVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : s) {
            if (!w(qVar, qVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public final boolean v(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f60f;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f61g;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void x(View view) {
        int i6;
        if (!this.f71q) {
            l.b<Animator, b> r5 = r();
            int i7 = r5.f5067d;
            d0 d0Var = u.f103a;
            WindowId windowId = view.getWindowId();
            int i8 = i7 - 1;
            while (true) {
                i6 = 0;
                if (i8 < 0) {
                    break;
                }
                b l5 = r5.l(i8);
                if (l5.f74a != null) {
                    j0 j0Var = l5.f77d;
                    if ((j0Var instanceof i0) && ((i0) j0Var).f79a.equals(windowId)) {
                        i6 = 1;
                    }
                    if (i6 != 0) {
                        r5.h(i8).pause();
                    }
                }
                i8--;
            }
            ArrayList<d> arrayList = this.f72r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f72r.clone();
                int size = arrayList2.size();
                while (i6 < size) {
                    ((d) arrayList2.get(i6)).b();
                    i6++;
                }
            }
            this.f70p = true;
        }
    }

    public void y(d dVar) {
        ArrayList<d> arrayList = this.f72r;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(dVar);
        if (this.f72r.size() == 0) {
            this.f72r = null;
        }
    }

    public void z(View view) {
        this.f61g.remove(view);
    }
}
