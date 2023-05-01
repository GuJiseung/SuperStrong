package k1;

import f2.a;
import f2.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k1.j;
import k1.q;
/* loaded from: classes.dex */
public final class n<R> implements j.a<R>, a.d {
    public static final c A = new c();

    /* renamed from: b  reason: collision with root package name */
    public final e f4853b;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f4854c;

    /* renamed from: d  reason: collision with root package name */
    public final q.a f4855d;

    /* renamed from: e  reason: collision with root package name */
    public final e0.d<n<?>> f4856e;

    /* renamed from: f  reason: collision with root package name */
    public final c f4857f;

    /* renamed from: g  reason: collision with root package name */
    public final o f4858g;

    /* renamed from: h  reason: collision with root package name */
    public final n1.a f4859h;

    /* renamed from: i  reason: collision with root package name */
    public final n1.a f4860i;

    /* renamed from: j  reason: collision with root package name */
    public final n1.a f4861j;

    /* renamed from: k  reason: collision with root package name */
    public final n1.a f4862k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f4863l;

    /* renamed from: m  reason: collision with root package name */
    public i1.f f4864m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4865n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4866o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4867p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4868q;

    /* renamed from: r  reason: collision with root package name */
    public w<?> f4869r;
    public i1.a s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4870t;
    public r u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4871v;

    /* renamed from: w  reason: collision with root package name */
    public q<?> f4872w;

    /* renamed from: x  reason: collision with root package name */
    public j<R> f4873x;

    /* renamed from: y  reason: collision with root package name */
    public volatile boolean f4874y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4875z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final a2.h f4876b;

        public a(a2.h hVar) {
            this.f4876b = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a2.i iVar = (a2.i) this.f4876b;
            iVar.f136b.a();
            synchronized (iVar.f137c) {
                synchronized (n.this) {
                    e eVar = n.this.f4853b;
                    a2.h hVar = this.f4876b;
                    eVar.getClass();
                    if (eVar.f4882b.contains(new d(hVar, e2.e.f3820b))) {
                        n nVar = n.this;
                        a2.h hVar2 = this.f4876b;
                        nVar.getClass();
                        ((a2.i) hVar2).m(nVar.u, 5);
                    }
                    n.this.d();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final a2.h f4878b;

        public b(a2.h hVar) {
            this.f4878b = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a2.i iVar = (a2.i) this.f4878b;
            iVar.f136b.a();
            synchronized (iVar.f137c) {
                synchronized (n.this) {
                    e eVar = n.this.f4853b;
                    a2.h hVar = this.f4878b;
                    eVar.getClass();
                    if (eVar.f4882b.contains(new d(hVar, e2.e.f3820b))) {
                        n.this.f4872w.a();
                        n nVar = n.this;
                        a2.h hVar2 = this.f4878b;
                        nVar.getClass();
                        ((a2.i) hVar2).n(nVar.f4872w, nVar.s, nVar.f4875z);
                        n.this.h(this.f4878b);
                    }
                    n.this.d();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final a2.h f4880a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f4881b;

        public d(a2.h hVar, Executor executor) {
            this.f4880a = hVar;
            this.f4881b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f4880a.equals(((d) obj).f4880a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f4880a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: b  reason: collision with root package name */
        public final List<d> f4882b;

        public e(ArrayList arrayList) {
            this.f4882b = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.f4882b.iterator();
        }
    }

    public n() {
        throw null;
    }

    public n(n1.a aVar, n1.a aVar2, n1.a aVar3, n1.a aVar4, o oVar, q.a aVar5, a.c cVar) {
        c cVar2 = A;
        this.f4853b = new e(new ArrayList(2));
        this.f4854c = new d.a();
        this.f4863l = new AtomicInteger();
        this.f4859h = aVar;
        this.f4860i = aVar2;
        this.f4861j = aVar3;
        this.f4862k = aVar4;
        this.f4858g = oVar;
        this.f4855d = aVar5;
        this.f4856e = cVar;
        this.f4857f = cVar2;
    }

    public final synchronized void a(a2.h hVar, Executor executor) {
        Runnable aVar;
        this.f4854c.a();
        e eVar = this.f4853b;
        eVar.getClass();
        eVar.f4882b.add(new d(hVar, executor));
        boolean z5 = true;
        if (this.f4870t) {
            e(1);
            aVar = new b(hVar);
        } else if (this.f4871v) {
            e(1);
            aVar = new a(hVar);
        } else {
            if (this.f4874y) {
                z5 = false;
            }
            androidx.activity.k.g("Cannot add callbacks to a cancelled EngineJob", z5);
        }
        executor.execute(aVar);
    }

    @Override // f2.a.d
    public final d.a b() {
        return this.f4854c;
    }

    public final void c() {
        Map map;
        if (f()) {
            return;
        }
        this.f4874y = true;
        j<R> jVar = this.f4873x;
        jVar.F = true;
        h hVar = jVar.D;
        if (hVar != null) {
            hVar.cancel();
        }
        o oVar = this.f4858g;
        i1.f fVar = this.f4864m;
        m mVar = (m) oVar;
        synchronized (mVar) {
            t tVar = mVar.f4829a;
            tVar.getClass();
            if (this.f4868q) {
                map = tVar.f4908b;
            } else {
                map = (Map) tVar.f4907a;
            }
            if (equals(map.get(fVar))) {
                map.remove(fVar);
            }
        }
    }

    public final void d() {
        q<?> qVar;
        synchronized (this) {
            this.f4854c.a();
            androidx.activity.k.g("Not yet complete!", f());
            int decrementAndGet = this.f4863l.decrementAndGet();
            androidx.activity.k.g("Can't decrement below 0", decrementAndGet >= 0);
            if (decrementAndGet == 0) {
                qVar = this.f4872w;
                g();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.b();
        }
    }

    public final synchronized void e(int i6) {
        q<?> qVar;
        androidx.activity.k.g("Not yet complete!", f());
        if (this.f4863l.getAndAdd(i6) == 0 && (qVar = this.f4872w) != null) {
            qVar.a();
        }
    }

    public final boolean f() {
        return this.f4871v || this.f4870t || this.f4874y;
    }

    public final synchronized void g() {
        boolean a6;
        if (this.f4864m != null) {
            this.f4853b.f4882b.clear();
            this.f4864m = null;
            this.f4872w = null;
            this.f4869r = null;
            this.f4871v = false;
            this.f4874y = false;
            this.f4870t = false;
            this.f4875z = false;
            j<R> jVar = this.f4873x;
            j.e eVar = jVar.f4795h;
            synchronized (eVar) {
                eVar.f4817a = true;
                a6 = eVar.a();
            }
            if (a6) {
                jVar.l();
            }
            this.f4873x = null;
            this.u = null;
            this.s = null;
            this.f4856e.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void h(a2.h hVar) {
        boolean z5;
        this.f4854c.a();
        e eVar = this.f4853b;
        eVar.f4882b.remove(new d(hVar, e2.e.f3820b));
        if (this.f4853b.f4882b.isEmpty()) {
            c();
            if (!this.f4870t && !this.f4871v) {
                z5 = false;
                if (z5 && this.f4863l.get() == 0) {
                    g();
                }
            }
            z5 = true;
            if (z5) {
                g();
            }
        }
    }
}
