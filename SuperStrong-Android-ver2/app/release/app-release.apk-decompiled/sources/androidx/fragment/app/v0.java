package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a0;
import androidx.fragment.app.o;
import b0.d;
import com.superstrong.android.R;
import f0.g0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1652a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f1653b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f1654c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1655d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1656e = false;

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: h  reason: collision with root package name */
        public final g0 f1657h;

        public a(int i6, int i7, g0 g0Var, b0.d dVar) {
            super(i6, i7, g0Var.f1484c, dVar);
            this.f1657h = g0Var;
        }

        @Override // androidx.fragment.app.v0.b
        public final void b() {
            super.b();
            this.f1657h.k();
        }

        @Override // androidx.fragment.app.v0.b
        public final void d() {
            float f6;
            int i6 = this.f1659b;
            g0 g0Var = this.f1657h;
            if (i6 == 2) {
                o oVar = g0Var.f1484c;
                View findFocus = oVar.F.findFocus();
                if (findFocus != null) {
                    oVar.e().f1604m = findFocus;
                    if (a0.J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar);
                    }
                }
                View M = this.f1660c.M();
                if (M.getParent() == null) {
                    g0Var.b();
                    M.setAlpha(0.0f);
                }
                if (M.getAlpha() == 0.0f && M.getVisibility() == 0) {
                    M.setVisibility(4);
                }
                o.c cVar = oVar.I;
                if (cVar == null) {
                    f6 = 1.0f;
                } else {
                    f6 = cVar.f1603l;
                }
                M.setAlpha(f6);
            } else if (i6 == 3) {
                o oVar2 = g0Var.f1484c;
                View M2 = oVar2.M();
                if (a0.J(2)) {
                    Log.v("FragmentManager", "Clearing focus " + M2.findFocus() + " on view " + M2 + " for Fragment " + oVar2);
                }
                M2.clearFocus();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1658a;

        /* renamed from: b  reason: collision with root package name */
        public int f1659b;

        /* renamed from: c  reason: collision with root package name */
        public final o f1660c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f1661d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<b0.d> f1662e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f1663f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1664g = false;

        public b(int i6, int i7, o oVar, b0.d dVar) {
            this.f1658a = i6;
            this.f1659b = i7;
            this.f1660c = oVar;
            dVar.a(new w0(this));
        }

        public final void a() {
            if (this.f1663f) {
                return;
            }
            this.f1663f = true;
            if (this.f1662e.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(this.f1662e).iterator();
            while (it.hasNext()) {
                b0.d dVar = (b0.d) it.next();
                synchronized (dVar) {
                    if (!dVar.f2260a) {
                        dVar.f2260a = true;
                        dVar.f2262c = true;
                        d.a aVar = dVar.f2261b;
                        if (aVar != null) {
                            try {
                                aVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (dVar) {
                                    dVar.f2262c = false;
                                    dVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (dVar) {
                            dVar.f2262c = false;
                            dVar.notifyAll();
                        }
                    }
                }
            }
        }

        public void b() {
            if (this.f1664g) {
                return;
            }
            if (a0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1664g = true;
            Iterator it = this.f1661d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(int i6, int i7) {
            if (i7 == 0) {
                throw null;
            }
            int i8 = i7 - 1;
            o oVar = this.f1660c;
            if (i8 == 0) {
                if (this.f1658a != 1) {
                    if (a0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = " + x0.e(this.f1658a) + " -> " + x0.e(i6) + ". ");
                    }
                    this.f1658a = i6;
                }
            } else if (i8 == 1) {
                if (this.f1658a == 1) {
                    if (a0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + androidx.activity.j.b(this.f1659b) + " to ADDING.");
                    }
                    this.f1658a = 2;
                    this.f1659b = 2;
                }
            } else if (i8 != 2) {
            } else {
                if (a0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = " + x0.e(this.f1658a) + " -> REMOVED. mLifecycleImpact  = " + androidx.activity.j.b(this.f1659b) + " to REMOVING.");
                }
                this.f1658a = 1;
                this.f1659b = 3;
            }
        }

        public void d() {
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + x0.e(this.f1658a) + "} {mLifecycleImpact = " + androidx.activity.j.b(this.f1659b) + "} {mFragment = " + this.f1660c + "}";
        }
    }

    public v0(ViewGroup viewGroup) {
        this.f1652a = viewGroup;
    }

    public static v0 f(ViewGroup viewGroup, y0 y0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof v0) {
            return (v0) tag;
        }
        ((a0.e) y0Var).getClass();
        m mVar = new m(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, mVar);
        return mVar;
    }

    public final void a(int i6, int i7, g0 g0Var) {
        synchronized (this.f1653b) {
            b0.d dVar = new b0.d();
            b d6 = d(g0Var.f1484c);
            if (d6 != null) {
                d6.c(i6, i7);
                return;
            }
            a aVar = new a(i6, i7, g0Var, dVar);
            this.f1653b.add(aVar);
            aVar.f1661d.add(new t0(this, aVar));
            aVar.f1661d.add(new u0(this, aVar));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z5);

    public final void c() {
        if (this.f1656e) {
            return;
        }
        ViewGroup viewGroup = this.f1652a;
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        if (!g0.g.b(viewGroup)) {
            e();
            this.f1655d = false;
            return;
        }
        synchronized (this.f1653b) {
            if (!this.f1653b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f1654c);
                this.f1654c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (a0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bVar);
                    }
                    bVar.a();
                    if (!bVar.f1664g) {
                        this.f1654c.add(bVar);
                    }
                }
                h();
                ArrayList arrayList2 = new ArrayList(this.f1653b);
                this.f1653b.clear();
                this.f1654c.addAll(arrayList2);
                if (a0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).d();
                }
                b(arrayList2, this.f1655d);
                this.f1655d = false;
                if (a0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    public final b d(o oVar) {
        Iterator<b> it = this.f1653b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1660c.equals(oVar) && !next.f1663f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (a0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1652a;
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        boolean b6 = g0.g.b(viewGroup);
        synchronized (this.f1653b) {
            h();
            Iterator<b> it = this.f1653b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f1654c).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (a0.J(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b6) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1652a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(bVar);
                    Log.v("FragmentManager", sb.toString());
                }
                bVar.a();
            }
            Iterator it3 = new ArrayList(this.f1653b).iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                if (a0.J(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b6) {
                        str = "";
                    } else {
                        str = "Container " + this.f1652a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(bVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                bVar2.a();
            }
        }
    }

    public final void g() {
        synchronized (this.f1653b) {
            h();
            this.f1656e = false;
            int size = this.f1653b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                b bVar = this.f1653b.get(size);
                int c6 = x0.c(bVar.f1660c.F);
                if (bVar.f1658a == 2 && c6 != 2) {
                    o.c cVar = bVar.f1660c.I;
                    this.f1656e = false;
                    break;
                }
            }
        }
    }

    public final void h() {
        Iterator<b> it = this.f1653b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1659b == 2) {
                next.c(x0.b(next.f1660c.M().getVisibility()), 1);
            }
        }
    }
}
