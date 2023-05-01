package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.i0;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class d0 extends androidx.lifecycle.f0 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f1450j = new a();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1454g;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, o> f1451d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, d0> f1452e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, androidx.lifecycle.k0> f1453f = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f1455h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1456i = false;

    /* loaded from: classes.dex */
    public class a implements i0.b {
        @Override // androidx.lifecycle.i0.b
        public final <T extends androidx.lifecycle.f0> T a(Class<T> cls) {
            return new d0(true);
        }
    }

    public d0(boolean z5) {
        this.f1454g = z5;
    }

    @Override // androidx.lifecycle.f0
    public final void b() {
        if (a0.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1455h = true;
    }

    public final void d(o oVar) {
        if (a0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + oVar);
        }
        e(oVar.f1571f);
    }

    public final void e(String str) {
        HashMap<String, d0> hashMap = this.f1452e;
        d0 d0Var = hashMap.get(str);
        if (d0Var != null) {
            d0Var.b();
            hashMap.remove(str);
        }
        HashMap<String, androidx.lifecycle.k0> hashMap2 = this.f1453f;
        androidx.lifecycle.k0 k0Var = hashMap2.get(str);
        if (k0Var != null) {
            k0Var.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f1451d.equals(d0Var.f1451d) && this.f1452e.equals(d0Var.f1452e) && this.f1453f.equals(d0Var.f1453f);
    }

    public final void f(o oVar) {
        if (this.f1456i) {
            if (a0.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f1451d.remove(oVar.f1571f) != null) && a0.J(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + oVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f1452e.hashCode();
        return this.f1453f.hashCode() + ((hashCode + (this.f1451d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<o> it = this.f1451d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1452e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1453f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
