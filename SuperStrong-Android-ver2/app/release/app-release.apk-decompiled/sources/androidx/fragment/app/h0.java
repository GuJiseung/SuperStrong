package androidx.fragment.app;

import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1492a;

    /* renamed from: b  reason: collision with root package name */
    public final Cloneable f1493b;

    /* renamed from: c  reason: collision with root package name */
    public final Cloneable f1494c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1495d;

    public h0(int i6) {
        if (i6 != 1) {
            this.f1492a = new ArrayList();
            this.f1493b = new HashMap();
            this.f1494c = new HashMap();
            return;
        }
        this.f1492a = new l.b();
        this.f1493b = new SparseArray();
        this.f1494c = new l.e();
        this.f1495d = new l.b();
    }

    public final void a(o oVar) {
        if (((ArrayList) this.f1492a).contains(oVar)) {
            throw new IllegalStateException("Fragment already added: " + oVar);
        }
        synchronized (((ArrayList) this.f1492a)) {
            ((ArrayList) this.f1492a).add(oVar);
        }
        oVar.f1577l = true;
    }

    public final void b() {
        ((HashMap) this.f1493b).values().removeAll(Collections.singleton(null));
    }

    public final o c(String str) {
        g0 g0Var = (g0) ((HashMap) this.f1493b).get(str);
        if (g0Var != null) {
            return g0Var.f1484c;
        }
        return null;
    }

    public final o d(String str) {
        for (g0 g0Var : ((HashMap) this.f1493b).values()) {
            if (g0Var != null) {
                o oVar = g0Var.f1484c;
                if (!str.equals(oVar.f1571f)) {
                    oVar = oVar.u.f1388c.d(str);
                }
                if (oVar != null) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (g0 g0Var : ((HashMap) this.f1493b).values()) {
            if (g0Var != null) {
                arrayList.add(g0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (g0 g0Var : ((HashMap) this.f1493b).values()) {
            arrayList.add(g0Var != null ? g0Var.f1484c : null);
        }
        return arrayList;
    }

    public final List g() {
        ArrayList arrayList;
        if (((ArrayList) this.f1492a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1492a)) {
            arrayList = new ArrayList((ArrayList) this.f1492a);
        }
        return arrayList;
    }

    public final void h(g0 g0Var) {
        boolean z5;
        o oVar = g0Var.f1484c;
        String str = oVar.f1571f;
        Cloneable cloneable = this.f1493b;
        if (((HashMap) cloneable).get(str) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return;
        }
        ((HashMap) cloneable).put(oVar.f1571f, g0Var);
        if (a0.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + oVar);
        }
    }

    public final void i(g0 g0Var) {
        o oVar = g0Var.f1484c;
        if (oVar.B) {
            ((d0) this.f1495d).f(oVar);
        }
        if (((g0) ((HashMap) this.f1493b).put(oVar.f1571f, null)) != null && a0.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + oVar);
        }
    }

    public final f0 j(String str, f0 f0Var) {
        HashMap hashMap = (HashMap) this.f1494c;
        return (f0) (f0Var != null ? hashMap.put(str, f0Var) : hashMap.remove(str));
    }
}
