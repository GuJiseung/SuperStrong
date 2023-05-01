package androidx.lifecycle;

import androidx.fragment.app.n;
import androidx.lifecycle.j;
import j.b;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1685j = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1686a;

    /* renamed from: b  reason: collision with root package name */
    public final j.b<t<? super T>, LiveData<T>.b> f1687b;

    /* renamed from: c  reason: collision with root package name */
    public int f1688c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1689d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f1690e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f1691f;

    /* renamed from: g  reason: collision with root package name */
    public int f1692g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1693h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1694i;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.b implements m {

        /* renamed from: f  reason: collision with root package name */
        public final o f1695f;

        public LifecycleBoundObserver(o oVar, t<? super T> tVar) {
            super(tVar);
            this.f1695f = oVar;
        }

        @Override // androidx.lifecycle.m
        public final void f(o oVar, j.b bVar) {
            o oVar2 = this.f1695f;
            j.c cVar = oVar2.v().f1760b;
            if (cVar == j.c.DESTROYED) {
                LiveData.this.i(this.f1697b);
                return;
            }
            j.c cVar2 = null;
            while (cVar2 != cVar) {
                h(k());
                cVar2 = cVar;
                cVar = oVar2.v().f1760b;
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        public final void i() {
            this.f1695f.v().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        public final boolean j(o oVar) {
            return this.f1695f == oVar;
        }

        @Override // androidx.lifecycle.LiveData.b
        public final boolean k() {
            return this.f1695f.v().f1760b.a(j.c.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a extends LiveData<T>.b {
        public a(LiveData liveData, n.d dVar) {
            super(dVar);
        }

        @Override // androidx.lifecycle.LiveData.b
        public final boolean k() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {

        /* renamed from: b  reason: collision with root package name */
        public final t<? super T> f1697b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1698c;

        /* renamed from: d  reason: collision with root package name */
        public int f1699d = -1;

        public b(t<? super T> tVar) {
            this.f1697b = tVar;
        }

        public final void h(boolean z5) {
            int i6;
            boolean z6;
            boolean z7;
            if (z5 == this.f1698c) {
                return;
            }
            this.f1698c = z5;
            if (z5) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            LiveData liveData = LiveData.this;
            int i7 = liveData.f1688c;
            liveData.f1688c = i6 + i7;
            if (!liveData.f1689d) {
                liveData.f1689d = true;
                while (true) {
                    try {
                        int i8 = liveData.f1688c;
                        if (i7 == i8) {
                            break;
                        }
                        if (i7 == 0 && i8 > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i7 > 0 && i8 == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z6) {
                            liveData.g();
                        } else if (z7) {
                            liveData.h();
                        }
                        i7 = i8;
                    } finally {
                        liveData.f1689d = false;
                    }
                }
            }
            if (this.f1698c) {
                liveData.c(this);
            }
        }

        public void i() {
        }

        public boolean j(o oVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        this.f1686a = new Object();
        this.f1687b = new j.b<>();
        this.f1688c = 0;
        Object obj = f1685j;
        this.f1691f = obj;
        this.f1690e = obj;
        this.f1692g = -1;
    }

    public LiveData(T t5) {
        this.f1686a = new Object();
        this.f1687b = new j.b<>();
        this.f1688c = 0;
        this.f1691f = f1685j;
        this.f1690e = t5;
        this.f1692g = 0;
    }

    public static void a(String str) {
        if (i.a.A().B()) {
            return;
        }
        throw new IllegalStateException(b5.b.b("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(LiveData<T>.b bVar) {
        if (bVar.f1698c) {
            if (!bVar.k()) {
                bVar.h(false);
                return;
            }
            int i6 = bVar.f1699d;
            int i7 = this.f1692g;
            if (i6 >= i7) {
                return;
            }
            bVar.f1699d = i7;
            bVar.f1697b.a((Object) this.f1690e);
        }
    }

    public final void c(LiveData<T>.b bVar) {
        if (this.f1693h) {
            this.f1694i = true;
            return;
        }
        this.f1693h = true;
        do {
            this.f1694i = false;
            if (bVar != null) {
                b(bVar);
                bVar = null;
            } else {
                j.b<t<? super T>, LiveData<T>.b> bVar2 = this.f1687b;
                bVar2.getClass();
                b.d dVar = new b.d();
                bVar2.f4630d.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((b) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1694i) {
                        break;
                    }
                }
            }
        } while (this.f1694i);
        this.f1693h = false;
    }

    public final T d() {
        T t5 = (T) this.f1690e;
        if (t5 != f1685j) {
            return t5;
        }
        return null;
    }

    public final void e(o oVar, t<? super T> tVar) {
        LiveData<T>.b bVar;
        a("observe");
        if (oVar.v().f1760b == j.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(oVar, tVar);
        j.b<t<? super T>, LiveData<T>.b> bVar2 = this.f1687b;
        b.c<t<? super T>, LiveData<T>.b> a6 = bVar2.a(tVar);
        if (a6 != null) {
            bVar = a6.f4633c;
        } else {
            b.c<K, V> cVar = new b.c<>(tVar, lifecycleBoundObserver);
            bVar2.f4631e++;
            b.c cVar2 = (b.c<t<? super T>, LiveData<T>.b>) bVar2.f4629c;
            if (cVar2 == null) {
                bVar2.f4628b = cVar;
            } else {
                cVar2.f4634d = cVar;
                cVar.f4635e = cVar2;
            }
            bVar2.f4629c = cVar;
            bVar = null;
        }
        LiveData<T>.b bVar3 = bVar;
        if (bVar3 != null && !bVar3.j(oVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (bVar3 != null) {
            return;
        }
        oVar.v().a(lifecycleBoundObserver);
    }

    public final void f(n.d dVar) {
        LiveData<T>.b bVar;
        a("observeForever");
        a aVar = new a(this, dVar);
        j.b<t<? super T>, LiveData<T>.b> bVar2 = this.f1687b;
        b.c<t<? super T>, LiveData<T>.b> a6 = bVar2.a(dVar);
        if (a6 != null) {
            bVar = a6.f4633c;
        } else {
            b.c<K, V> cVar = new b.c<>(dVar, aVar);
            bVar2.f4631e++;
            b.c cVar2 = (b.c<t<? super T>, LiveData<T>.b>) bVar2.f4629c;
            if (cVar2 == null) {
                bVar2.f4628b = cVar;
            } else {
                cVar2.f4634d = cVar;
                cVar.f4635e = cVar2;
            }
            bVar2.f4629c = cVar;
            bVar = null;
        }
        LiveData<T>.b bVar3 = bVar;
        if (!(bVar3 instanceof LifecycleBoundObserver)) {
            if (bVar3 != null) {
                return;
            }
            aVar.h(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void g() {
    }

    public void h() {
    }

    public void i(t<? super T> tVar) {
        a("removeObserver");
        LiveData<T>.b b6 = this.f1687b.b(tVar);
        if (b6 == null) {
            return;
        }
        b6.i();
        b6.h(false);
    }
}
