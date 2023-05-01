package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.j;
import j.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class p extends j {

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<o> f1761c;

    /* renamed from: a  reason: collision with root package name */
    public j.a<n, a> f1759a = new j.a<>();

    /* renamed from: d  reason: collision with root package name */
    public int f1762d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1763e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1764f = false;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<j.c> f1765g = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public j.c f1760b = j.c.INITIALIZED;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1766h = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public j.c f1767a;

        /* renamed from: b  reason: collision with root package name */
        public final m f1768b;

        public a(n nVar, j.c cVar) {
            m reflectiveGenericLifecycleObserver;
            HashMap hashMap = r.f1769a;
            boolean z5 = nVar instanceof m;
            boolean z6 = nVar instanceof f;
            if (z5 && z6) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((f) nVar, (m) nVar);
            } else if (z6) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((f) nVar, null);
            } else if (z5) {
                reflectiveGenericLifecycleObserver = (m) nVar;
            } else {
                Class<?> cls = nVar.getClass();
                if (r.c(cls) == 2) {
                    List list = (List) r.f1770b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(r.a((Constructor) list.get(0), nVar));
                    } else {
                        g[] gVarArr = new g[list.size()];
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            gVarArr[i6] = r.a((Constructor) list.get(i6), nVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(nVar);
                }
            }
            this.f1768b = reflectiveGenericLifecycleObserver;
            this.f1767a = cVar;
        }

        public final void a(o oVar, j.b bVar) {
            j.c a6 = bVar.a();
            j.c cVar = this.f1767a;
            if (a6.compareTo(cVar) < 0) {
                cVar = a6;
            }
            this.f1767a = cVar;
            this.f1768b.f(oVar, bVar);
            this.f1767a = a6;
        }
    }

    public p(o oVar) {
        this.f1761c = new WeakReference<>(oVar);
    }

    @Override // androidx.lifecycle.j
    public final void a(n nVar) {
        o oVar;
        boolean z5;
        j.b bVar;
        e("addObserver");
        j.c cVar = this.f1760b;
        j.c cVar2 = j.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = j.c.INITIALIZED;
        }
        a aVar = new a(nVar, cVar2);
        if (this.f1759a.c(nVar, aVar) != null || (oVar = this.f1761c.get()) == null) {
            return;
        }
        if (this.f1762d == 0 && !this.f1763e) {
            z5 = false;
        } else {
            z5 = true;
        }
        j.c d6 = d(nVar);
        this.f1762d++;
        while (aVar.f1767a.compareTo(d6) < 0 && this.f1759a.f4627f.containsKey(nVar)) {
            j.c cVar3 = aVar.f1767a;
            ArrayList<j.c> arrayList = this.f1765g;
            arrayList.add(cVar3);
            int ordinal = aVar.f1767a.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        bVar = null;
                    } else {
                        bVar = j.b.ON_RESUME;
                    }
                } else {
                    bVar = j.b.ON_START;
                }
            } else {
                bVar = j.b.ON_CREATE;
            }
            if (bVar != null) {
                aVar.a(oVar, bVar);
                arrayList.remove(arrayList.size() - 1);
                d6 = d(nVar);
            } else {
                throw new IllegalStateException("no event up from " + aVar.f1767a);
            }
        }
        if (!z5) {
            h();
        }
        this.f1762d--;
    }

    @Override // androidx.lifecycle.j
    public final j.c b() {
        return this.f1760b;
    }

    @Override // androidx.lifecycle.j
    public final void c(n nVar) {
        e("removeObserver");
        this.f1759a.b(nVar);
    }

    public final j.c d(n nVar) {
        b.c<n, a> cVar;
        j.c cVar2;
        j.a<n, a> aVar = this.f1759a;
        j.c cVar3 = null;
        if (aVar.f4627f.containsKey(nVar)) {
            cVar = aVar.f4627f.get(nVar).f4635e;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar2 = cVar.f4633c.f1767a;
        } else {
            cVar2 = null;
        }
        ArrayList<j.c> arrayList = this.f1765g;
        if (!arrayList.isEmpty()) {
            cVar3 = arrayList.get(arrayList.size() - 1);
        }
        j.c cVar4 = this.f1760b;
        if (cVar2 == null || cVar2.compareTo(cVar4) >= 0) {
            cVar2 = cVar4;
        }
        if (cVar3 == null || cVar3.compareTo(cVar2) >= 0) {
            return cVar2;
        }
        return cVar3;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        if (this.f1766h && !i.a.A().B()) {
            throw new IllegalStateException(b5.b.b("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(j.b bVar) {
        e("handleLifecycleEvent");
        g(bVar.a());
    }

    public final void g(j.c cVar) {
        j.c cVar2 = this.f1760b;
        if (cVar2 == cVar) {
            return;
        }
        j.c cVar3 = j.c.INITIALIZED;
        j.c cVar4 = j.c.DESTROYED;
        if (cVar2 == cVar3 && cVar == cVar4) {
            throw new IllegalStateException("no event down from " + this.f1760b);
        }
        this.f1760b = cVar;
        if (this.f1763e || this.f1762d != 0) {
            this.f1764f = true;
            return;
        }
        this.f1763e = true;
        h();
        this.f1763e = false;
        if (this.f1760b == cVar4) {
            this.f1759a = new j.a<>();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0057, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f7, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.p.h():void");
    }
}
