package k1;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.fragment.app.x0;
import com.bumptech.glide.load.data.e;
import f2.a;
import f2.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import k1.h;
import k1.m;
import k1.n;
import k1.q;
/* loaded from: classes.dex */
public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public Object A;
    public i1.a B;
    public com.bumptech.glide.load.data.d<?> C;
    public volatile h D;
    public volatile boolean E;
    public volatile boolean F;
    public boolean G;

    /* renamed from: e  reason: collision with root package name */
    public final d f4792e;

    /* renamed from: f  reason: collision with root package name */
    public final e0.d<j<?>> f4793f;

    /* renamed from: i  reason: collision with root package name */
    public com.bumptech.glide.g f4796i;

    /* renamed from: j  reason: collision with root package name */
    public i1.f f4797j;

    /* renamed from: k  reason: collision with root package name */
    public com.bumptech.glide.i f4798k;

    /* renamed from: l  reason: collision with root package name */
    public p f4799l;

    /* renamed from: m  reason: collision with root package name */
    public int f4800m;

    /* renamed from: n  reason: collision with root package name */
    public int f4801n;

    /* renamed from: o  reason: collision with root package name */
    public l f4802o;

    /* renamed from: p  reason: collision with root package name */
    public i1.h f4803p;

    /* renamed from: q  reason: collision with root package name */
    public a<R> f4804q;

    /* renamed from: r  reason: collision with root package name */
    public int f4805r;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public int f4806t;
    public long u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4807v;

    /* renamed from: w  reason: collision with root package name */
    public Object f4808w;

    /* renamed from: x  reason: collision with root package name */
    public Thread f4809x;

    /* renamed from: y  reason: collision with root package name */
    public i1.f f4810y;

    /* renamed from: z  reason: collision with root package name */
    public i1.f f4811z;

    /* renamed from: b  reason: collision with root package name */
    public final i<R> f4789b = new i<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4790c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final d.a f4791d = new d.a();

    /* renamed from: g  reason: collision with root package name */
    public final c<?> f4794g = new c<>();

    /* renamed from: h  reason: collision with root package name */
    public final e f4795h = new e();

    /* loaded from: classes.dex */
    public interface a<R> {
    }

    /* loaded from: classes.dex */
    public final class b<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final i1.a f4812a;

        public b(i1.a aVar) {
            this.f4812a = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        public i1.f f4814a;

        /* renamed from: b  reason: collision with root package name */
        public i1.k<Z> f4815b;

        /* renamed from: c  reason: collision with root package name */
        public v<Z> f4816c;
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4817a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4818b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4819c;

        public final boolean a() {
            return (this.f4819c || this.f4818b) && this.f4817a;
        }
    }

    public j(d dVar, a.c cVar) {
        this.f4792e = dVar;
        this.f4793f = cVar;
    }

    @Override // k1.h.a
    public final void a() {
        n1.a aVar;
        this.f4806t = 2;
        n nVar = (n) this.f4804q;
        if (nVar.f4866o) {
            aVar = nVar.f4861j;
        } else if (nVar.f4867p) {
            aVar = nVar.f4862k;
        } else {
            aVar = nVar.f4860i;
        }
        aVar.execute(this);
    }

    @Override // f2.a.d
    public final d.a b() {
        return this.f4791d;
    }

    @Override // k1.h.a
    public final void c(i1.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, i1.a aVar, i1.f fVar2) {
        n1.a aVar2;
        this.f4810y = fVar;
        this.A = obj;
        this.C = dVar;
        this.B = aVar;
        this.f4811z = fVar2;
        boolean z5 = false;
        if (fVar != this.f4789b.a().get(0)) {
            z5 = true;
        }
        this.G = z5;
        if (Thread.currentThread() != this.f4809x) {
            this.f4806t = 3;
            n nVar = (n) this.f4804q;
            if (nVar.f4866o) {
                aVar2 = nVar.f4861j;
            } else if (nVar.f4867p) {
                aVar2 = nVar.f4862k;
            } else {
                aVar2 = nVar.f4860i;
            }
            aVar2.execute(this);
            return;
        }
        g();
    }

    @Override // java.lang.Comparable
    public final int compareTo(j<?> jVar) {
        j<?> jVar2 = jVar;
        int ordinal = this.f4798k.ordinal() - jVar2.f4798k.ordinal();
        if (ordinal == 0) {
            return this.f4805r - jVar2.f4805r;
        }
        return ordinal;
    }

    @Override // k1.h.a
    public final void d(i1.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, i1.a aVar) {
        n1.a aVar2;
        dVar.b();
        r rVar = new r("Fetching data failed", Collections.singletonList(exc));
        Class<?> a6 = dVar.a();
        rVar.f4901c = fVar;
        rVar.f4902d = aVar;
        rVar.f4903e = a6;
        this.f4790c.add(rVar);
        if (Thread.currentThread() != this.f4809x) {
            this.f4806t = 2;
            n nVar = (n) this.f4804q;
            if (nVar.f4866o) {
                aVar2 = nVar.f4861j;
            } else if (nVar.f4867p) {
                aVar2 = nVar.f4862k;
            } else {
                aVar2 = nVar.f4860i;
            }
            aVar2.execute(this);
            return;
        }
        m();
    }

    public final <Data> w<R> e(com.bumptech.glide.load.data.d<?> dVar, Data data, i1.a aVar) {
        if (data == null) {
            return null;
        }
        try {
            int i6 = e2.f.f3822b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w<R> f6 = f(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded result " + f6, elapsedRealtimeNanos, null);
            }
            return f6;
        } finally {
            dVar.b();
        }
    }

    public final <Data> w<R> f(Data data, i1.a aVar) {
        com.bumptech.glide.load.data.e b6;
        boolean z5;
        u<Data, ?, R> c6 = this.f4789b.c(data.getClass());
        i1.h hVar = this.f4803p;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar != i1.a.RESOURCE_DISK_CACHE && !this.f4789b.f4788r) {
                z5 = false;
            } else {
                z5 = true;
            }
            i1.g<Boolean> gVar = r1.m.f5919i;
            Boolean bool = (Boolean) hVar.c(gVar);
            if (bool == null || (bool.booleanValue() && !z5)) {
                hVar = new i1.h();
                hVar.f4591b.i(this.f4803p.f4591b);
                hVar.f4591b.put(gVar, Boolean.valueOf(z5));
            }
        }
        i1.h hVar2 = hVar;
        com.bumptech.glide.load.data.f fVar = this.f4796i.f2801b.f2821e;
        synchronized (fVar) {
            e.a aVar2 = (e.a) fVar.f2855a.get(data.getClass());
            if (aVar2 == null) {
                Iterator it = fVar.f2855a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar3 = (e.a) it.next();
                    if (aVar3.a().isAssignableFrom(data.getClass())) {
                        aVar2 = aVar3;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = com.bumptech.glide.load.data.f.f2854b;
            }
            b6 = aVar2.b(data);
        }
        try {
            return c6.a(this.f4800m, this.f4801n, hVar2, b6, new b(aVar));
        } finally {
            b6.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        w wVar;
        boolean z5;
        Map map;
        boolean a6;
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Retrieved data", this.u, "data: " + this.A + ", cache key: " + this.f4810y + ", fetcher: " + this.C);
        }
        v vVar = null;
        try {
            wVar = (w<R>) e(this.C, this.A, this.B);
        } catch (r e6) {
            i1.f fVar = this.f4811z;
            i1.a aVar = this.B;
            e6.f4901c = fVar;
            e6.f4902d = aVar;
            e6.f4903e = null;
            this.f4790c.add(e6);
            wVar = (w<R>) null;
        }
        if (wVar != null) {
            i1.a aVar2 = this.B;
            boolean z6 = this.G;
            if (wVar instanceof s) {
                ((s) wVar).a();
            }
            boolean z7 = false;
            if (this.f4794g.f4816c != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                vVar = (v) v.f4912f.b();
                androidx.activity.k.h(vVar);
                vVar.f4916e = false;
                vVar.f4915d = true;
                vVar.f4914c = wVar;
                wVar = vVar;
            }
            o();
            n nVar = (n) this.f4804q;
            synchronized (nVar) {
                nVar.f4869r = wVar;
                nVar.s = aVar2;
                nVar.f4875z = z6;
            }
            synchronized (nVar) {
                nVar.f4854c.a();
                if (nVar.f4874y) {
                    nVar.f4869r.e();
                    nVar.g();
                } else if (!nVar.f4853b.f4882b.isEmpty()) {
                    if (!nVar.f4870t) {
                        n.c cVar = nVar.f4857f;
                        w<?> wVar2 = nVar.f4869r;
                        boolean z8 = nVar.f4865n;
                        i1.f fVar2 = nVar.f4864m;
                        q.a aVar3 = nVar.f4855d;
                        cVar.getClass();
                        nVar.f4872w = new q<>(wVar2, z8, true, fVar2, aVar3);
                        nVar.f4870t = true;
                        n.e eVar = nVar.f4853b;
                        eVar.getClass();
                        ArrayList<n.d> arrayList = new ArrayList(eVar.f4882b);
                        nVar.e(arrayList.size() + 1);
                        i1.f fVar3 = nVar.f4864m;
                        q<?> qVar = nVar.f4872w;
                        m mVar = (m) nVar.f4858g;
                        synchronized (mVar) {
                            if (qVar != null) {
                                if (qVar.f4892b) {
                                    mVar.f4835g.a(fVar3, qVar);
                                }
                            }
                            t tVar = mVar.f4829a;
                            tVar.getClass();
                            if (nVar.f4868q) {
                                map = tVar.f4908b;
                            } else {
                                map = (Map) tVar.f4907a;
                            }
                            if (nVar.equals(map.get(fVar3))) {
                                map.remove(fVar3);
                            }
                        }
                        for (n.d dVar : arrayList) {
                            dVar.f4881b.execute(new n.b(dVar.f4880a));
                        }
                        nVar.d();
                    } else {
                        throw new IllegalStateException("Already have resource");
                    }
                } else {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
            }
            this.s = 5;
            try {
                c<?> cVar2 = this.f4794g;
                if (cVar2.f4816c != null) {
                    z7 = true;
                }
                if (z7) {
                    d dVar2 = this.f4792e;
                    i1.h hVar = this.f4803p;
                    cVar2.getClass();
                    ((m.c) dVar2).a().b(cVar2.f4814a, new g(cVar2.f4815b, cVar2.f4816c, hVar));
                    cVar2.f4816c.a();
                }
                e eVar2 = this.f4795h;
                synchronized (eVar2) {
                    eVar2.f4818b = true;
                    a6 = eVar2.a();
                }
                if (a6) {
                    l();
                    return;
                }
                return;
            } finally {
                if (vVar != null) {
                    vVar.a();
                }
            }
        }
        m();
    }

    public final h h() {
        int a6 = m.g.a(this.s);
        i<R> iVar = this.f4789b;
        if (a6 != 1) {
            if (a6 != 2) {
                if (a6 != 3) {
                    if (a6 == 5) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: ".concat(a2.d.b(this.s)));
                }
                return new b0(iVar, this);
            }
            return new k1.e(iVar.a(), iVar, this);
        }
        return new x(iVar, this);
    }

    public final int i(int i6) {
        if (i6 != 0) {
            int i7 = i6 - 1;
            if (i7 == 0) {
                if (this.f4802o.b()) {
                    return 2;
                }
                return i(2);
            } else if (i7 == 1) {
                if (this.f4802o.a()) {
                    return 3;
                }
                return i(3);
            } else if (i7 == 2) {
                return this.f4807v ? 6 : 4;
            } else if (i7 == 3 || i7 == 5) {
                return 6;
            } else {
                throw new IllegalArgumentException("Unrecognized stage: ".concat(a2.d.b(i6)));
            }
        }
        throw null;
    }

    public final void j(String str, long j5, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(e2.f.a(j5));
        sb.append(", load key: ");
        sb.append(this.f4799l);
        sb.append(str2 != null ? ", ".concat(str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    public final void k() {
        Map map;
        boolean a6;
        o();
        r rVar = new r("Failed to load resource", new ArrayList(this.f4790c));
        n nVar = (n) this.f4804q;
        synchronized (nVar) {
            nVar.u = rVar;
        }
        synchronized (nVar) {
            nVar.f4854c.a();
            if (nVar.f4874y) {
                nVar.g();
            } else if (!nVar.f4853b.f4882b.isEmpty()) {
                if (!nVar.f4871v) {
                    nVar.f4871v = true;
                    i1.f fVar = nVar.f4864m;
                    n.e eVar = nVar.f4853b;
                    eVar.getClass();
                    ArrayList<n.d> arrayList = new ArrayList(eVar.f4882b);
                    nVar.e(arrayList.size() + 1);
                    m mVar = (m) nVar.f4858g;
                    synchronized (mVar) {
                        t tVar = mVar.f4829a;
                        tVar.getClass();
                        if (nVar.f4868q) {
                            map = tVar.f4908b;
                        } else {
                            map = (Map) tVar.f4907a;
                        }
                        if (nVar.equals(map.get(fVar))) {
                            map.remove(fVar);
                        }
                    }
                    for (n.d dVar : arrayList) {
                        dVar.f4881b.execute(new n.a(dVar.f4880a));
                    }
                    nVar.d();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        e eVar2 = this.f4795h;
        synchronized (eVar2) {
            eVar2.f4819c = true;
            a6 = eVar2.a();
        }
        if (a6) {
            l();
        }
    }

    public final void l() {
        e eVar = this.f4795h;
        synchronized (eVar) {
            eVar.f4818b = false;
            eVar.f4817a = false;
            eVar.f4819c = false;
        }
        c<?> cVar = this.f4794g;
        cVar.f4814a = null;
        cVar.f4815b = null;
        cVar.f4816c = null;
        i<R> iVar = this.f4789b;
        iVar.f4773c = null;
        iVar.f4774d = null;
        iVar.f4784n = null;
        iVar.f4777g = null;
        iVar.f4781k = null;
        iVar.f4779i = null;
        iVar.f4785o = null;
        iVar.f4780j = null;
        iVar.f4786p = null;
        iVar.f4771a.clear();
        iVar.f4782l = false;
        iVar.f4772b.clear();
        iVar.f4783m = false;
        this.E = false;
        this.f4796i = null;
        this.f4797j = null;
        this.f4803p = null;
        this.f4798k = null;
        this.f4799l = null;
        this.f4804q = null;
        this.s = 0;
        this.D = null;
        this.f4809x = null;
        this.f4810y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.u = 0L;
        this.F = false;
        this.f4808w = null;
        this.f4790c.clear();
        this.f4793f.a(this);
    }

    public final void m() {
        this.f4809x = Thread.currentThread();
        int i6 = e2.f.f3822b;
        this.u = SystemClock.elapsedRealtimeNanos();
        boolean z5 = false;
        while (!this.F && this.D != null && !(z5 = this.D.b())) {
            this.s = i(this.s);
            this.D = h();
            if (this.s == 4) {
                a();
                return;
            }
        }
        if ((this.s == 6 || this.F) && !z5) {
            k();
        }
    }

    public final void n() {
        int a6 = m.g.a(this.f4806t);
        if (a6 == 0) {
            this.s = i(1);
            this.D = h();
        } else if (a6 != 1) {
            if (a6 != 2) {
                throw new IllegalStateException("Unrecognized run reason: ".concat(x0.f(this.f4806t)));
            }
            g();
            return;
        }
        m();
    }

    public final void o() {
        Throwable th;
        this.f4791d.a();
        if (!this.E) {
            this.E = true;
            return;
        }
        if (this.f4790c.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f4790c;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.C;
        try {
            try {
                if (this.F) {
                    k();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                n();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th;
            }
        } catch (k1.d e6) {
            throw e6;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.F + ", stage: " + a2.d.b(this.s), th2);
            }
            if (this.s != 5) {
                this.f4790c.add(th2);
                k();
            }
            if (!this.F) {
                throw th2;
            }
            throw th2;
        }
    }
}
