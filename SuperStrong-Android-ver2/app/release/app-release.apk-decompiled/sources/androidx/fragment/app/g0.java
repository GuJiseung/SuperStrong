package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.v0;
import androidx.lifecycle.j;
import com.superstrong.android.R;
import f0.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import s0.b;
import v0.a;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final y f1482a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f1483b;

    /* renamed from: c  reason: collision with root package name */
    public final o f1484c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1485d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1486e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1487b;

        public a(View view) {
            this.f1487b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f1487b;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
            g0.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public g0(y yVar, h0 h0Var, o oVar) {
        this.f1482a = yVar;
        this.f1483b = h0Var;
        this.f1484c = oVar;
    }

    public g0(y yVar, h0 h0Var, o oVar, f0 f0Var) {
        this.f1482a = yVar;
        this.f1483b = h0Var;
        this.f1484c = oVar;
        oVar.f1569d = null;
        oVar.f1570e = null;
        oVar.f1583r = 0;
        oVar.f1580o = false;
        oVar.f1577l = false;
        o oVar2 = oVar.f1573h;
        oVar.f1574i = oVar2 != null ? oVar2.f1571f : null;
        oVar.f1573h = null;
        Bundle bundle = f0Var.f1476n;
        oVar.f1568c = bundle == null ? new Bundle() : bundle;
    }

    public g0(y yVar, h0 h0Var, ClassLoader classLoader, v vVar, f0 f0Var) {
        this.f1482a = yVar;
        this.f1483b = h0Var;
        o a6 = vVar.a(f0Var.f1464b);
        Bundle bundle = f0Var.f1473k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a6.O(bundle);
        a6.f1571f = f0Var.f1465c;
        a6.f1579n = f0Var.f1466d;
        a6.f1581p = true;
        a6.f1586w = f0Var.f1467e;
        a6.f1587x = f0Var.f1468f;
        a6.f1588y = f0Var.f1469g;
        a6.B = f0Var.f1470h;
        a6.f1578m = f0Var.f1471i;
        a6.A = f0Var.f1472j;
        a6.f1589z = f0Var.f1474l;
        a6.M = j.c.values()[f0Var.f1475m];
        Bundle bundle2 = f0Var.f1476n;
        a6.f1568c = bundle2 == null ? new Bundle() : bundle2;
        this.f1484c = a6;
        if (a0.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a6);
        }
    }

    public final void a() {
        boolean J = a0.J(3);
        o oVar = this.f1484c;
        if (J) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + oVar);
        }
        Bundle bundle = oVar.f1568c;
        oVar.u.Q();
        oVar.f1567b = 3;
        oVar.D = false;
        oVar.u();
        if (oVar.D) {
            if (a0.J(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + oVar);
            }
            View view = oVar.F;
            if (view != null) {
                Bundle bundle2 = oVar.f1568c;
                SparseArray<Parcelable> sparseArray = oVar.f1569d;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    oVar.f1569d = null;
                }
                if (oVar.F != null) {
                    q0 q0Var = oVar.O;
                    q0Var.f1618f.b(oVar.f1570e);
                    oVar.f1570e = null;
                }
                oVar.D = false;
                oVar.I(bundle2);
                if (oVar.D) {
                    if (oVar.F != null) {
                        oVar.O.c(j.b.ON_CREATE);
                    }
                } else {
                    throw new z0("Fragment " + oVar + " did not call through to super.onViewStateRestored()");
                }
            }
            oVar.f1568c = null;
            b0 b0Var = oVar.u;
            b0Var.E = false;
            b0Var.F = false;
            b0Var.L.f1456i = false;
            b0Var.u(4);
            this.f1482a.a(false);
            return;
        }
        throw new z0("Fragment " + oVar + " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        View view;
        View view2;
        h0 h0Var = this.f1483b;
        h0Var.getClass();
        o oVar = this.f1484c;
        ViewGroup viewGroup = oVar.E;
        int i6 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) h0Var.f1492a;
            int indexOf = arrayList.indexOf(oVar);
            int i7 = indexOf - 1;
            while (true) {
                if (i7 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        o oVar2 = (o) arrayList.get(indexOf);
                        if (oVar2.E == viewGroup && (view = oVar2.F) != null) {
                            i6 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    o oVar3 = (o) arrayList.get(i7);
                    if (oVar3.E == viewGroup && (view2 = oVar3.F) != null) {
                        i6 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i7--;
                }
            }
        }
        oVar.E.addView(oVar.F, i6);
    }

    public final void c() {
        boolean J = a0.J(3);
        o oVar = this.f1484c;
        if (J) {
            Log.d("FragmentManager", "moveto ATTACHED: " + oVar);
        }
        o oVar2 = oVar.f1573h;
        g0 g0Var = null;
        h0 h0Var = this.f1483b;
        if (oVar2 != null) {
            g0 g0Var2 = (g0) ((HashMap) h0Var.f1493b).get(oVar2.f1571f);
            if (g0Var2 != null) {
                oVar.f1574i = oVar.f1573h.f1571f;
                oVar.f1573h = null;
                g0Var = g0Var2;
            } else {
                throw new IllegalStateException("Fragment " + oVar + " declared target fragment " + oVar.f1573h + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = oVar.f1574i;
            if (str != null && (g0Var = (g0) ((HashMap) h0Var.f1493b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + oVar + " declared target fragment " + oVar.f1574i + " that does not belong to this FragmentManager!");
            }
        }
        if (g0Var != null) {
            g0Var.k();
        }
        a0 a0Var = oVar.s;
        oVar.f1584t = a0Var.f1404t;
        oVar.f1585v = a0Var.f1405v;
        y yVar = this.f1482a;
        yVar.g(false);
        ArrayList<o.e> arrayList = oVar.S;
        Iterator<o.e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        arrayList.clear();
        oVar.u.c(oVar.f1584t, oVar.c(), oVar);
        oVar.f1567b = 0;
        oVar.D = false;
        oVar.x(oVar.f1584t.f1666d);
        if (oVar.D) {
            Iterator<e0> it2 = oVar.s.f1398m.iterator();
            while (it2.hasNext()) {
                it2.next().e();
            }
            b0 b0Var = oVar.u;
            b0Var.E = false;
            b0Var.F = false;
            b0Var.L.f1456i = false;
            b0Var.u(0);
            yVar.b(false);
            return;
        }
        throw new z0("Fragment " + oVar + " did not call through to super.onAttach()");
    }

    public final int d() {
        v0.b bVar;
        o oVar = this.f1484c;
        if (oVar.s == null) {
            return oVar.f1567b;
        }
        int i6 = this.f1486e;
        int ordinal = oVar.M.ordinal();
        int i7 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i6 = Math.min(i6, -1);
                    }
                } else {
                    i6 = Math.min(i6, 5);
                }
            } else {
                i6 = Math.min(i6, 1);
            }
        } else {
            i6 = Math.min(i6, 0);
        }
        if (oVar.f1579n) {
            if (oVar.f1580o) {
                i6 = Math.max(this.f1486e, 2);
                View view = oVar.F;
                if (view != null && view.getParent() == null) {
                    i6 = Math.min(i6, 2);
                }
            } else {
                i6 = this.f1486e < 4 ? Math.min(i6, oVar.f1567b) : Math.min(i6, 1);
            }
        }
        if (!oVar.f1577l) {
            i6 = Math.min(i6, 1);
        }
        ViewGroup viewGroup = oVar.E;
        if (viewGroup != null) {
            v0 f6 = v0.f(viewGroup, oVar.l().H());
            f6.getClass();
            v0.b d6 = f6.d(oVar);
            if (d6 != null) {
                i7 = d6.f1659b;
            }
            Iterator<v0.b> it = f6.f1654c.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar = it.next();
                    if (bVar.f1660c.equals(oVar) && !bVar.f1663f) {
                        break;
                    }
                } else {
                    bVar = null;
                    break;
                }
            }
            if (bVar != null && (i7 == 0 || i7 == 1)) {
                i7 = bVar.f1659b;
            }
        }
        if (i7 == 2) {
            i6 = Math.min(i6, 6);
        } else if (i7 == 3) {
            i6 = Math.max(i6, 3);
        } else if (oVar.f1578m) {
            if (oVar.s()) {
                i6 = Math.min(i6, 1);
            } else {
                i6 = Math.min(i6, -1);
            }
        }
        if (oVar.G && oVar.f1567b < 5) {
            i6 = Math.min(i6, 4);
        }
        if (a0.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i6 + " for " + oVar);
        }
        return i6;
    }

    public final void e() {
        Parcelable parcelable;
        boolean J = a0.J(3);
        final o oVar = this.f1484c;
        if (J) {
            Log.d("FragmentManager", "moveto CREATED: " + oVar);
        }
        if (!oVar.K) {
            y yVar = this.f1482a;
            yVar.h(false);
            Bundle bundle = oVar.f1568c;
            oVar.u.Q();
            oVar.f1567b = 1;
            oVar.D = false;
            oVar.N.a(new androidx.lifecycle.m() { // from class: androidx.fragment.app.Fragment$6
                @Override // androidx.lifecycle.m
                public final void f(androidx.lifecycle.o oVar2, j.b bVar) {
                    View view;
                    if (bVar == j.b.ON_STOP && (view = o.this.F) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
            oVar.R.b(bundle);
            oVar.y(bundle);
            oVar.K = true;
            if (oVar.D) {
                oVar.N.f(j.b.ON_CREATE);
                yVar.c(false);
                return;
            }
            throw new z0("Fragment " + oVar + " did not call through to super.onCreate()");
        }
        Bundle bundle2 = oVar.f1568c;
        if (bundle2 != null && (parcelable = bundle2.getParcelable("android:support:fragments")) != null) {
            oVar.u.W(parcelable);
            b0 b0Var = oVar.u;
            b0Var.E = false;
            b0Var.F = false;
            b0Var.L.f1456i = false;
            b0Var.u(1);
        }
        oVar.f1567b = 1;
    }

    public final void f() {
        String str;
        o oVar = this.f1484c;
        if (oVar.f1579n) {
            return;
        }
        if (a0.J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + oVar);
        }
        LayoutInflater D = oVar.D(oVar.f1568c);
        ViewGroup viewGroup = oVar.E;
        if (viewGroup == null) {
            int i6 = oVar.f1587x;
            if (i6 != 0) {
                if (i6 != -1) {
                    viewGroup = (ViewGroup) oVar.s.u.u(i6);
                    if (viewGroup == null) {
                        if (!oVar.f1581p) {
                            try {
                                str = oVar.L().getResources().getResourceName(oVar.f1587x);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(oVar.f1587x) + " (" + str + ") for fragment " + oVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        b.C0086b c0086b = s0.b.f5973a;
                        s0.d dVar = new s0.d(oVar, viewGroup);
                        s0.b.c(dVar);
                        b.C0086b a6 = s0.b.a(oVar);
                        if (a6.f5981a.contains(b.a.DETECT_WRONG_FRAGMENT_CONTAINER) && s0.b.e(a6, oVar.getClass(), s0.d.class)) {
                            s0.b.b(a6, dVar);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + oVar + " for a container view with no id");
                }
            } else {
                viewGroup = null;
            }
        }
        oVar.E = viewGroup;
        oVar.J(D, viewGroup, oVar.f1568c);
        View view = oVar.F;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            oVar.F.setTag(R.id.fragment_container_view_tag, oVar);
            if (viewGroup != null) {
                b();
            }
            if (oVar.f1589z) {
                oVar.F.setVisibility(8);
            }
            View view2 = oVar.F;
            WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
            if (g0.g.b(view2)) {
                g0.h.c(oVar.F);
            } else {
                View view3 = oVar.F;
                view3.addOnAttachStateChangeListener(new a(view3));
            }
            oVar.H(oVar.F);
            oVar.u.u(2);
            this.f1482a.m(oVar, oVar.F, false);
            int visibility = oVar.F.getVisibility();
            oVar.e().f1603l = oVar.F.getAlpha();
            if (oVar.E != null && visibility == 0) {
                View findFocus = oVar.F.findFocus();
                if (findFocus != null) {
                    oVar.e().f1604m = findFocus;
                    if (a0.J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar);
                    }
                }
                oVar.F.setAlpha(0.0f);
            }
        }
        oVar.f1567b = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g0.g():void");
    }

    public final void h() {
        View view;
        boolean J = a0.J(3);
        o oVar = this.f1484c;
        if (J) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + oVar);
        }
        ViewGroup viewGroup = oVar.E;
        if (viewGroup != null && (view = oVar.F) != null) {
            viewGroup.removeView(view);
        }
        oVar.u.u(1);
        if (oVar.F != null) {
            q0 q0Var = oVar.O;
            q0Var.e();
            if (q0Var.f1617e.f1760b.a(j.c.CREATED)) {
                oVar.O.c(j.b.ON_DESTROY);
            }
        }
        oVar.f1567b = 1;
        oVar.D = false;
        oVar.B();
        if (oVar.D) {
            l.i<a.C0095a> iVar = ((a.b) new androidx.lifecycle.i0(oVar.t(), a.b.f6269e).a(a.b.class)).f6270d;
            int i6 = iVar.f5071d;
            for (int i7 = 0; i7 < i6; i7++) {
                ((a.C0095a) iVar.f5070c[i7]).getClass();
            }
            oVar.f1582q = false;
            this.f1482a.n(false);
            oVar.E = null;
            oVar.F = null;
            oVar.O = null;
            oVar.P.j(null);
            oVar.f1580o = false;
            return;
        }
        throw new z0("Fragment " + oVar + " did not call through to super.onDestroyView()");
    }

    public final void i() {
        boolean J = a0.J(3);
        o oVar = this.f1484c;
        if (J) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + oVar);
        }
        oVar.f1567b = -1;
        boolean z5 = false;
        oVar.D = false;
        oVar.C();
        if (oVar.D) {
            b0 b0Var = oVar.u;
            if (!b0Var.G) {
                b0Var.l();
                oVar.u = new b0();
            }
            this.f1482a.e(false);
            oVar.f1567b = -1;
            oVar.f1584t = null;
            oVar.f1585v = null;
            oVar.s = null;
            boolean z6 = true;
            if (oVar.f1578m && !oVar.s()) {
                z5 = true;
            }
            if (!z5) {
                d0 d0Var = (d0) this.f1483b.f1495d;
                if (d0Var.f1451d.containsKey(oVar.f1571f) && d0Var.f1454g) {
                    z6 = d0Var.f1455h;
                }
                if (!z6) {
                    return;
                }
            }
            if (a0.J(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + oVar);
            }
            oVar.p();
            return;
        }
        throw new z0("Fragment " + oVar + " did not call through to super.onDetach()");
    }

    public final void j() {
        o oVar = this.f1484c;
        if (oVar.f1579n && oVar.f1580o && !oVar.f1582q) {
            if (a0.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + oVar);
            }
            oVar.J(oVar.D(oVar.f1568c), null, oVar.f1568c);
            View view = oVar.F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                oVar.F.setTag(R.id.fragment_container_view_tag, oVar);
                if (oVar.f1589z) {
                    oVar.F.setVisibility(8);
                }
                oVar.H(oVar.F);
                oVar.u.u(2);
                this.f1482a.m(oVar, oVar.F, false);
                oVar.f1567b = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        h0 h0Var = this.f1483b;
        boolean z5 = this.f1485d;
        o oVar = this.f1484c;
        if (z5) {
            if (a0.J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + oVar);
                return;
            }
            return;
        }
        try {
            this.f1485d = true;
            boolean z6 = false;
            while (true) {
                int d6 = d();
                int i6 = oVar.f1567b;
                if (d6 != i6) {
                    if (d6 > i6) {
                        switch (i6 + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
                                e();
                                continue;
                            case 2:
                                j();
                                f();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                if (oVar.F != null && (viewGroup3 = oVar.E) != null) {
                                    v0 f6 = v0.f(viewGroup3, oVar.l().H());
                                    int b6 = x0.b(oVar.F.getVisibility());
                                    f6.getClass();
                                    if (a0.J(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + oVar);
                                    }
                                    f6.a(b6, 2, this);
                                }
                                oVar.f1567b = 4;
                                continue;
                            case 5:
                                r();
                                continue;
                            case 6:
                                oVar.f1567b = 6;
                                continue;
                            case 7:
                                n();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i6 - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                g();
                                continue;
                            case 1:
                                h();
                                oVar.f1567b = 1;
                                continue;
                            case 2:
                                oVar.f1580o = false;
                                oVar.f1567b = 2;
                                continue;
                            case 3:
                                if (a0.J(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + oVar);
                                }
                                if (oVar.F != null && oVar.f1569d == null) {
                                    q();
                                }
                                if (oVar.F != null && (viewGroup2 = oVar.E) != null) {
                                    v0 f7 = v0.f(viewGroup2, oVar.l().H());
                                    f7.getClass();
                                    if (a0.J(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + oVar);
                                    }
                                    f7.a(1, 3, this);
                                }
                                oVar.f1567b = 3;
                                continue;
                            case 4:
                                s();
                                continue;
                            case 5:
                                oVar.f1567b = 5;
                                continue;
                            case 6:
                                l();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z6 = true;
                } else {
                    if (!z6 && i6 == -1 && oVar.f1578m && !oVar.s()) {
                        if (a0.J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + oVar);
                        }
                        ((d0) h0Var.f1495d).d(oVar);
                        h0Var.i(this);
                        if (a0.J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + oVar);
                        }
                        oVar.p();
                    }
                    if (oVar.J) {
                        if (oVar.F != null && (viewGroup = oVar.E) != null) {
                            v0 f8 = v0.f(viewGroup, oVar.l().H());
                            if (oVar.f1589z) {
                                f8.getClass();
                                if (a0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + oVar);
                                }
                                f8.a(3, 1, this);
                            } else {
                                f8.getClass();
                                if (a0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + oVar);
                                }
                                f8.a(2, 1, this);
                            }
                        }
                        a0 a0Var = oVar.s;
                        if (a0Var != null && oVar.f1577l && a0.K(oVar)) {
                            a0Var.D = true;
                        }
                        oVar.J = false;
                        oVar.u.o();
                    }
                    return;
                }
            }
        } finally {
            this.f1485d = false;
        }
    }

    public final void l() {
        boolean J = a0.J(3);
        o oVar = this.f1484c;
        if (J) {
            Log.d("FragmentManager", "movefrom RESUMED: " + oVar);
        }
        oVar.u.u(5);
        if (oVar.F != null) {
            oVar.O.c(j.b.ON_PAUSE);
        }
        oVar.N.f(j.b.ON_PAUSE);
        oVar.f1567b = 6;
        oVar.D = true;
        this.f1482a.f(false);
    }

    public final void m(ClassLoader classLoader) {
        o oVar = this.f1484c;
        Bundle bundle = oVar.f1568c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        oVar.f1569d = oVar.f1568c.getSparseParcelableArray("android:view_state");
        oVar.f1570e = oVar.f1568c.getBundle("android:view_registry_state");
        String string = oVar.f1568c.getString("android:target_state");
        oVar.f1574i = string;
        if (string != null) {
            oVar.f1575j = oVar.f1568c.getInt("android:target_req_state", 0);
        }
        boolean z5 = oVar.f1568c.getBoolean("android:user_visible_hint", true);
        oVar.H = z5;
        if (z5) {
            return;
        }
        oVar.G = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r9 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.a0.J(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.o r2 = r9.f1484c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            androidx.fragment.app.o$c r0 = r2.I
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f1604m
        L25:
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L83
            android.view.View r6 = r2.F
            if (r0 != r6) goto L2e
            goto L38
        L2e:
            android.view.ViewParent r6 = r0.getParent()
        L32:
            if (r6 == 0) goto L3f
            android.view.View r7 = r2.F
            if (r6 != r7) goto L3a
        L38:
            r6 = r5
            goto L40
        L3a:
            android.view.ViewParent r6 = r6.getParent()
            goto L32
        L3f:
            r6 = r4
        L40:
            if (r6 == 0) goto L83
            boolean r6 = r0.requestFocus()
            r7 = 2
            boolean r7 = androidx.fragment.app.a0.J(r7)
            if (r7 == 0) goto L83
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "requestFocus: Restoring focused view "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = " "
            r7.append(r0)
            if (r6 == 0) goto L61
            java.lang.String r0 = "succeeded"
            goto L63
        L61:
            java.lang.String r0 = "failed"
        L63:
            r7.append(r0)
            java.lang.String r0 = " on Fragment "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r7.append(r0)
            android.view.View r0 = r2.F
            android.view.View r0 = r0.findFocus()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.v(r1, r0)
        L83:
            androidx.fragment.app.o$c r0 = r2.e()
            r0.f1604m = r3
            androidx.fragment.app.b0 r0 = r2.u
            r0.Q()
            androidx.fragment.app.b0 r0 = r2.u
            r0.z(r5)
            r0 = 7
            r2.f1567b = r0
            r2.D = r5
            androidx.lifecycle.p r1 = r2.N
            androidx.lifecycle.j$b r5 = androidx.lifecycle.j.b.ON_RESUME
            r1.f(r5)
            android.view.View r1 = r2.F
            if (r1 == 0) goto La8
            androidx.fragment.app.q0 r1 = r2.O
            r1.c(r5)
        La8:
            androidx.fragment.app.b0 r1 = r2.u
            r1.E = r4
            r1.F = r4
            androidx.fragment.app.d0 r5 = r1.L
            r5.f1456i = r4
            r1.u(r0)
            androidx.fragment.app.y r0 = r9.f1482a
            r0.i(r4)
            r2.f1568c = r3
            r2.f1569d = r3
            r2.f1570e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g0.n():void");
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        o oVar = this.f1484c;
        oVar.E(bundle);
        oVar.R.c(bundle);
        bundle.putParcelable("android:support:fragments", oVar.u.X());
        this.f1482a.j(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (oVar.F != null) {
            q();
        }
        if (oVar.f1569d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", oVar.f1569d);
        }
        if (oVar.f1570e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", oVar.f1570e);
        }
        if (!oVar.H) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", oVar.H);
        }
        return bundle;
    }

    public final void p() {
        o oVar = this.f1484c;
        f0 f0Var = new f0(oVar);
        if (oVar.f1567b <= -1 || f0Var.f1476n != null) {
            f0Var.f1476n = oVar.f1568c;
        } else {
            Bundle o5 = o();
            f0Var.f1476n = o5;
            if (oVar.f1574i != null) {
                if (o5 == null) {
                    f0Var.f1476n = new Bundle();
                }
                f0Var.f1476n.putString("android:target_state", oVar.f1574i);
                int i6 = oVar.f1575j;
                if (i6 != 0) {
                    f0Var.f1476n.putInt("android:target_req_state", i6);
                }
            }
        }
        this.f1483b.j(oVar.f1571f, f0Var);
    }

    public final void q() {
        o oVar = this.f1484c;
        if (oVar.F == null) {
            return;
        }
        if (a0.J(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + oVar + " with view " + oVar.F);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        oVar.F.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            oVar.f1569d = sparseArray;
        }
        Bundle bundle = new Bundle();
        oVar.O.f1618f.c(bundle);
        if (!bundle.isEmpty()) {
            oVar.f1570e = bundle;
        }
    }

    public final void r() {
        boolean J = a0.J(3);
        o oVar = this.f1484c;
        if (J) {
            Log.d("FragmentManager", "moveto STARTED: " + oVar);
        }
        oVar.u.Q();
        oVar.u.z(true);
        oVar.f1567b = 5;
        oVar.D = false;
        oVar.F();
        if (oVar.D) {
            androidx.lifecycle.p pVar = oVar.N;
            j.b bVar = j.b.ON_START;
            pVar.f(bVar);
            if (oVar.F != null) {
                oVar.O.c(bVar);
            }
            b0 b0Var = oVar.u;
            b0Var.E = false;
            b0Var.F = false;
            b0Var.L.f1456i = false;
            b0Var.u(5);
            this.f1482a.k(false);
            return;
        }
        throw new z0("Fragment " + oVar + " did not call through to super.onStart()");
    }

    public final void s() {
        boolean J = a0.J(3);
        o oVar = this.f1484c;
        if (J) {
            Log.d("FragmentManager", "movefrom STARTED: " + oVar);
        }
        b0 b0Var = oVar.u;
        b0Var.F = true;
        b0Var.L.f1456i = true;
        b0Var.u(4);
        if (oVar.F != null) {
            oVar.O.c(j.b.ON_STOP);
        }
        oVar.N.f(j.b.ON_STOP);
        oVar.f1567b = 4;
        oVar.D = false;
        oVar.G();
        if (oVar.D) {
            this.f1482a.l(false);
            return;
        }
        throw new z0("Fragment " + oVar + " did not call through to super.onStop()");
    }
}
