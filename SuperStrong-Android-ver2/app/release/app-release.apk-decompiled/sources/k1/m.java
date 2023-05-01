package k1;

import android.os.SystemClock;
import android.util.Log;
import e2.g;
import f2.a;
import java.io.File;
import java.util.concurrent.Executor;
import k1.c;
import k1.j;
import k1.q;
import m1.a;
import m1.h;
/* loaded from: classes.dex */
public final class m implements o, h.a, q.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f4828h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final t f4829a;

    /* renamed from: b  reason: collision with root package name */
    public final s4.y f4830b;

    /* renamed from: c  reason: collision with root package name */
    public final m1.h f4831c;

    /* renamed from: d  reason: collision with root package name */
    public final b f4832d;

    /* renamed from: e  reason: collision with root package name */
    public final z f4833e;

    /* renamed from: f  reason: collision with root package name */
    public final a f4834f;

    /* renamed from: g  reason: collision with root package name */
    public final k1.c f4835g;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.d f4836a;

        /* renamed from: b  reason: collision with root package name */
        public final a.c f4837b = f2.a.a(150, new C0057a());

        /* renamed from: c  reason: collision with root package name */
        public int f4838c;

        /* renamed from: k1.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0057a implements a.b<j<?>> {
            public C0057a() {
            }

            @Override // f2.a.b
            public final j<?> a() {
                a aVar = a.this;
                return new j<>(aVar.f4836a, aVar.f4837b);
            }
        }

        public a(c cVar) {
            this.f4836a = cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final n1.a f4840a;

        /* renamed from: b  reason: collision with root package name */
        public final n1.a f4841b;

        /* renamed from: c  reason: collision with root package name */
        public final n1.a f4842c;

        /* renamed from: d  reason: collision with root package name */
        public final n1.a f4843d;

        /* renamed from: e  reason: collision with root package name */
        public final o f4844e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f4845f;

        /* renamed from: g  reason: collision with root package name */
        public final a.c f4846g = f2.a.a(150, new a());

        /* loaded from: classes.dex */
        public class a implements a.b<n<?>> {
            public a() {
            }

            @Override // f2.a.b
            public final n<?> a() {
                b bVar = b.this;
                return new n<>(bVar.f4840a, bVar.f4841b, bVar.f4842c, bVar.f4843d, bVar.f4844e, bVar.f4845f, bVar.f4846g);
            }
        }

        public b(n1.a aVar, n1.a aVar2, n1.a aVar3, n1.a aVar4, o oVar, q.a aVar5) {
            this.f4840a = aVar;
            this.f4841b = aVar2;
            this.f4842c = aVar3;
            this.f4843d = aVar4;
            this.f4844e = oVar;
            this.f4845f = aVar5;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final a.InterfaceC0064a f4848a;

        /* renamed from: b  reason: collision with root package name */
        public volatile m1.a f4849b;

        public c(a.InterfaceC0064a interfaceC0064a) {
            this.f4848a = interfaceC0064a;
        }

        public final m1.a a() {
            if (this.f4849b == null) {
                synchronized (this) {
                    if (this.f4849b == null) {
                        m1.c cVar = (m1.c) this.f4848a;
                        m1.e eVar = (m1.e) cVar.f5246b;
                        File cacheDir = eVar.f5252a.getCacheDir();
                        m1.d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = eVar.f5253b;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            dVar = new m1.d(cacheDir, cVar.f5245a);
                        }
                        this.f4849b = dVar;
                    }
                    if (this.f4849b == null) {
                        this.f4849b = new c0.n();
                    }
                }
            }
            return this.f4849b;
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final n<?> f4850a;

        /* renamed from: b  reason: collision with root package name */
        public final a2.h f4851b;

        public d(a2.h hVar, n<?> nVar) {
            this.f4851b = hVar;
            this.f4850a = nVar;
        }
    }

    public m(m1.h hVar, a.InterfaceC0064a interfaceC0064a, n1.a aVar, n1.a aVar2, n1.a aVar3, n1.a aVar4) {
        this.f4831c = hVar;
        c cVar = new c(interfaceC0064a);
        k1.c cVar2 = new k1.c();
        this.f4835g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f4753d = this;
            }
        }
        this.f4830b = new s4.y();
        this.f4829a = new t(0);
        this.f4832d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f4834f = new a(cVar);
        this.f4833e = new z();
        ((m1.g) hVar).f5254d = this;
    }

    public static void d(String str, long j5, i1.f fVar) {
        Log.v("Engine", str + " in " + e2.f.a(j5) + "ms, key: " + fVar);
    }

    public static void e(w wVar) {
        if (!(wVar instanceof q)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((q) wVar).b();
    }

    @Override // k1.q.a
    public final void a(i1.f fVar, q<?> qVar) {
        k1.c cVar = this.f4835g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f4751b.remove(fVar);
            if (aVar != null) {
                aVar.f4756c = null;
                aVar.clear();
            }
        }
        if (qVar.f4892b) {
            ((m1.g) this.f4831c).d(fVar, qVar);
        } else {
            this.f4833e.a(qVar, false);
        }
    }

    public final d b(com.bumptech.glide.g gVar, Object obj, i1.f fVar, int i6, int i7, Class cls, Class cls2, com.bumptech.glide.i iVar, l lVar, e2.b bVar, boolean z5, boolean z6, i1.h hVar, boolean z7, boolean z8, boolean z9, boolean z10, a2.h hVar2, Executor executor) {
        long j5;
        if (f4828h) {
            int i8 = e2.f.f3822b;
            j5 = SystemClock.elapsedRealtimeNanos();
        } else {
            j5 = 0;
        }
        long j6 = j5;
        this.f4830b.getClass();
        p pVar = new p(obj, fVar, i6, i7, bVar, cls, cls2, hVar);
        synchronized (this) {
            try {
                q<?> c6 = c(pVar, z7, j6);
                if (c6 == null) {
                    return f(gVar, obj, fVar, i6, i7, cls, cls2, iVar, lVar, bVar, z5, z6, hVar, z7, z8, z9, z10, hVar2, executor, pVar, j6);
                }
                ((a2.i) hVar2).n(c6, i1.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q<?> c(p pVar, boolean z5, long j5) {
        q<?> qVar;
        w wVar;
        q<?> qVar2;
        if (!z5) {
            return null;
        }
        k1.c cVar = this.f4835g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f4751b.get(pVar);
            if (aVar == null) {
                qVar = null;
            } else {
                qVar = aVar.get();
                if (qVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (qVar != null) {
            qVar.a();
        }
        if (qVar != null) {
            if (f4828h) {
                d("Loaded resource from active resources", j5, pVar);
            }
            return qVar;
        }
        m1.g gVar = (m1.g) this.f4831c;
        synchronized (gVar) {
            g.a aVar2 = (g.a) gVar.f3823a.remove(pVar);
            if (aVar2 == null) {
                wVar = null;
            } else {
                gVar.f3825c -= aVar2.f3827b;
                wVar = aVar2.f3826a;
            }
        }
        w wVar2 = wVar;
        if (wVar2 == null) {
            qVar2 = null;
        } else if (wVar2 instanceof q) {
            qVar2 = (q) wVar2;
        } else {
            qVar2 = new q<>(wVar2, true, true, pVar, this);
        }
        if (qVar2 != null) {
            qVar2.a();
            this.f4835g.a(pVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f4828h) {
            d("Loaded resource from cache", j5, pVar);
        }
        return qVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
        r0 = r15.f4859h;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [n1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k1.m.d f(com.bumptech.glide.g r17, java.lang.Object r18, i1.f r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, com.bumptech.glide.i r24, k1.l r25, e2.b r26, boolean r27, boolean r28, i1.h r29, boolean r30, boolean r31, boolean r32, boolean r33, a2.h r34, java.util.concurrent.Executor r35, k1.p r36, long r37) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.m.f(com.bumptech.glide.g, java.lang.Object, i1.f, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.i, k1.l, e2.b, boolean, boolean, i1.h, boolean, boolean, boolean, boolean, a2.h, java.util.concurrent.Executor, k1.p, long):k1.m$d");
    }
}
