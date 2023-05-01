package s4;

import e4.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.g;
import s4.u0;
/* loaded from: classes.dex */
public class z0 implements u0, l, e1 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6115b = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* loaded from: classes.dex */
    public static final class a<T> extends g<T> {

        /* renamed from: j  reason: collision with root package name */
        public final z0 f6116j;

        public a(e4.d<? super T> dVar, z0 z0Var) {
            super(dVar);
            this.f6116j = z0Var;
        }

        @Override // s4.g
        public final Throwable m(z0 z0Var) {
            Throwable b6;
            Object D = this.f6116j.D();
            return (!(D instanceof c) || (b6 = ((c) D).b()) == null) ? D instanceof n ? ((n) D).f6092a : z0Var.s() : b6;
        }

        @Override // s4.g
        public final String t() {
            return "AwaitContinuation";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends y0 {

        /* renamed from: f  reason: collision with root package name */
        public final z0 f6117f;

        /* renamed from: g  reason: collision with root package name */
        public final c f6118g;

        /* renamed from: h  reason: collision with root package name */
        public final k f6119h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f6120i;

        public b(z0 z0Var, c cVar, k kVar, Object obj) {
            this.f6117f = z0Var;
            this.f6118g = cVar;
            this.f6119h = kVar;
            this.f6120i = obj;
        }

        @Override // k4.l
        public final /* bridge */ /* synthetic */ c4.h f(Throwable th) {
            m(th);
            return c4.h.f2763a;
        }

        @Override // s4.p
        public final void m(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0.f6115b;
            z0 z0Var = this.f6117f;
            z0Var.getClass();
            k M = z0.M(this.f6119h);
            c cVar = this.f6118g;
            Object obj = this.f6120i;
            if (M == null || !z0Var.U(cVar, M, obj)) {
                z0Var.g(z0Var.y(cVar, obj));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements q0 {
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: b  reason: collision with root package name */
        public final b1 f6121b;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        public c(b1 b1Var, Throwable th) {
            this.f6121b = b1Var;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th == th2) {
            } else {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th == obj) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    this._exceptionsHolder = arrayList;
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(l4.f.j(obj, "State is ").toString());
                }
            }
        }

        public final Throwable b() {
            return (Throwable) this._rootCause;
        }

        @Override // s4.q0
        public final boolean c() {
            return ((Throwable) this._rootCause) == null;
        }

        public final boolean d() {
            return ((Throwable) this._rootCause) != null;
        }

        @Override // s4.q0
        public final b1 e() {
            return this.f6121b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean f() {
            return this._isCompleting;
        }

        public final boolean g() {
            if (this._exceptionsHolder == androidx.fragment.app.r0.f1633k) {
                return true;
            }
            return false;
        }

        public final ArrayList h(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(l4.f.j(obj, "State is ").toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !l4.f.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = androidx.fragment.app.r0.f1633k;
            return arrayList;
        }

        public final void i() {
            this._isCompleting = 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f6121b + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends g.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ z0 f6122d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f6123e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.g gVar, z0 z0Var, Object obj) {
            super(gVar);
            this.f6122d = z0Var;
            this.f6123e = obj;
        }

        @Override // kotlinx.coroutines.internal.b
        public final a1.r c(Object obj) {
            boolean z5;
            kotlinx.coroutines.internal.g gVar = (kotlinx.coroutines.internal.g) obj;
            if (this.f6122d.D() == this.f6123e) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return null;
            }
            return kotlinx.coroutines.internal.f.f4954b;
        }
    }

    public z0(boolean z5) {
        this._state = z5 ? androidx.fragment.app.r0.f1635m : androidx.fragment.app.r0.f1634l;
        this._parentHandle = null;
    }

    public static k M(kotlinx.coroutines.internal.g gVar) {
        while (gVar.k()) {
            gVar = gVar.j();
        }
        while (true) {
            gVar = gVar.i();
            if (!gVar.k()) {
                if (gVar instanceof k) {
                    return (k) gVar;
                }
                if (gVar instanceof b1) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.d()) {
                return "Cancelling";
            }
            if (cVar.f()) {
                return "Completing";
            }
        } else if (!(obj instanceof q0)) {
            return obj instanceof n ? "Cancelled" : "Completed";
        } else if (!((q0) obj).c()) {
            return "New";
        }
        return "Active";
    }

    public boolean A() {
        return false;
    }

    public final b1 B(q0 q0Var) {
        b1 e6 = q0Var.e();
        if (e6 == null) {
            if (q0Var instanceof k0) {
                return new b1();
            }
            if (q0Var instanceof y0) {
                Q((y0) q0Var);
                return null;
            }
            throw new IllegalStateException(l4.f.j(q0Var, "State should have list: ").toString());
        }
        return e6;
    }

    public final j C() {
        return (j) this._parentHandle;
    }

    public final Object D() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.l)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.l) obj).a(this);
        }
    }

    @Override // s4.u0
    public final j F(z0 z0Var) {
        return (j) u0.a.a(this, true, new k(z0Var), 2);
    }

    public boolean G(Throwable th) {
        return false;
    }

    public void H(q3.r rVar) {
        throw rVar;
    }

    public final void I(u0 u0Var) {
        c1 c1Var = c1.f6056b;
        if (u0Var == null) {
            this._parentHandle = c1Var;
            return;
        }
        u0Var.start();
        j F = u0Var.F(this);
        this._parentHandle = F;
        if (!(D() instanceof q0)) {
            F.a();
            this._parentHandle = c1Var;
        }
    }

    public boolean J() {
        return false;
    }

    public final Object K(Object obj) {
        Object T;
        n nVar;
        do {
            T = T(D(), obj);
            if (T == androidx.fragment.app.r0.f1629g) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof n) {
                    nVar = (n) obj;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    th = nVar.f6092a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (T == androidx.fragment.app.r0.f1631i);
        return T;
    }

    public String L() {
        return getClass().getSimpleName();
    }

    public final void N(b1 b1Var, Throwable th) {
        q3.r rVar;
        q3.r rVar2 = null;
        for (kotlinx.coroutines.internal.g gVar = (kotlinx.coroutines.internal.g) b1Var.h(); !l4.f.a(gVar, b1Var); gVar = gVar.i()) {
            if (gVar instanceof w0) {
                y0 y0Var = (y0) gVar;
                try {
                    y0Var.m(th);
                } catch (Throwable th2) {
                    if (rVar2 == null) {
                        rVar = null;
                    } else {
                        androidx.activity.k.f(rVar2, th2);
                        rVar = rVar2;
                    }
                    if (rVar == null) {
                        rVar2 = new q3.r("Exception in completion handler " + y0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (rVar2 != null) {
            H(rVar2);
        }
        l(th);
    }

    public void O(Object obj) {
    }

    public void P() {
    }

    public final void Q(y0 y0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z5;
        b1 b1Var = new b1();
        y0Var.getClass();
        kotlinx.coroutines.internal.g.f4956c.lazySet(b1Var, y0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.g.f4955b;
        atomicReferenceFieldUpdater2.lazySet(b1Var, y0Var);
        while (true) {
            if (y0Var.h() == y0Var) {
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(y0Var, y0Var, b1Var)) {
                        z5 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(y0Var) != y0Var) {
                        z5 = false;
                        continue;
                        break;
                    }
                }
                if (z5) {
                    b1Var.g(y0Var);
                    break;
                }
            } else {
                break;
            }
        }
        kotlinx.coroutines.internal.g i6 = y0Var.i();
        do {
            atomicReferenceFieldUpdater = f6115b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, y0Var, i6)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == y0Var);
    }

    public final int R(Object obj) {
        boolean z5 = obj instanceof k0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6115b;
        boolean z6 = false;
        if (z5) {
            if (((k0) obj).f6073b) {
                return 0;
            }
            k0 k0Var = androidx.fragment.app.r0.f1635m;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                    z6 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z6) {
                return -1;
            }
            P();
            return 1;
        } else if (!(obj instanceof p0)) {
            return 0;
        } else {
            b1 b1Var = ((p0) obj).f6096b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, b1Var)) {
                    z6 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z6) {
                return -1;
            }
            P();
            return 1;
        }
    }

    public final Object T(Object obj, Object obj2) {
        r0 r0Var;
        boolean z5;
        c cVar;
        n nVar;
        k kVar;
        a1.r rVar;
        if (!(obj instanceof q0)) {
            return androidx.fragment.app.r0.f1629g;
        }
        boolean z6 = true;
        boolean z7 = false;
        if (((obj instanceof k0) || (obj instanceof y0)) && !(obj instanceof k) && !(obj2 instanceof n)) {
            q0 q0Var = (q0) obj;
            if (obj2 instanceof q0) {
                r0Var = new r0((q0) obj2);
            } else {
                r0Var = obj2;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6115b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, q0Var, r0Var)) {
                    z5 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != q0Var) {
                    z5 = false;
                    break;
                }
            }
            if (!z5) {
                z6 = false;
            } else {
                O(obj2);
                u(q0Var, obj2);
            }
            if (z6) {
                return obj2;
            }
            return androidx.fragment.app.r0.f1631i;
        }
        q0 q0Var2 = (q0) obj;
        b1 B = B(q0Var2);
        if (B == null) {
            return androidx.fragment.app.r0.f1631i;
        }
        k kVar2 = null;
        if (q0Var2 instanceof c) {
            cVar = (c) q0Var2;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(B, null);
        }
        synchronized (cVar) {
            if (cVar.f()) {
                rVar = androidx.fragment.app.r0.f1629g;
            } else {
                cVar.i();
                if (cVar != q0Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6115b;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, q0Var2, cVar)) {
                            z7 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != q0Var2) {
                            break;
                        }
                    }
                    if (!z7) {
                        rVar = androidx.fragment.app.r0.f1631i;
                    }
                }
                boolean d6 = cVar.d();
                if (obj2 instanceof n) {
                    nVar = (n) obj2;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    cVar.a(nVar.f6092a);
                }
                Throwable b6 = cVar.b();
                if (!(true ^ d6)) {
                    b6 = null;
                }
                c4.h hVar = c4.h.f2763a;
                if (b6 != null) {
                    N(B, b6);
                }
                if (q0Var2 instanceof k) {
                    kVar = (k) q0Var2;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    b1 e6 = q0Var2.e();
                    if (e6 != null) {
                        kVar2 = M(e6);
                    }
                } else {
                    kVar2 = kVar;
                }
                if (kVar2 != null && U(cVar, kVar2, obj2)) {
                    return androidx.fragment.app.r0.f1630h;
                }
                return y(cVar, obj2);
            }
            return rVar;
        }
    }

    public final boolean U(c cVar, k kVar, Object obj) {
        while (u0.a.a(kVar.f6072f, false, new b(this, cVar, kVar, obj), 1) == c1.f6056b) {
            kVar = M(kVar);
            if (kVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // s4.u0
    public boolean c() {
        Object D = D();
        return (D instanceof q0) && ((q0) D).c();
    }

    public final boolean e(Object obj, b1 b1Var, y0 y0Var) {
        boolean z5;
        boolean z6;
        d dVar = new d(y0Var, this, obj);
        do {
            kotlinx.coroutines.internal.g j5 = b1Var.j();
            kotlinx.coroutines.internal.g.f4956c.lazySet(y0Var, j5);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.g.f4955b;
            atomicReferenceFieldUpdater.lazySet(y0Var, b1Var);
            dVar.f4959c = b1Var;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(j5, b1Var, dVar)) {
                    z5 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(j5) != b1Var) {
                    z5 = false;
                    break;
                }
            }
            if (!z5) {
                z6 = false;
            } else if (dVar.a(j5) == null) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (z6) {
                return true;
            }
        } while (!z6);
        return false;
    }

    @Override // e4.f
    public final <R> R fold(R r5, k4.p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.e(r5, this);
    }

    public void g(Object obj) {
    }

    @Override // e4.f.b, e4.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // e4.f.b
    public final f.c<?> getKey() {
        return u0.b.f6108b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c2, code lost:
        r10 = androidx.fragment.app.r0.f1629g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ec, code lost:
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c2 A[EDGE_INSN: B:93:0x00c2->B:66:0x00c2 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.z0.i(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [s4.p0] */
    @Override // s4.u0
    public final i0 k(boolean z5, boolean z6, y0 y0Var) {
        y0 y0Var2;
        boolean z7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n nVar;
        Throwable th;
        Throwable th2 = null;
        if (z5) {
            if (y0Var instanceof w0) {
                y0Var2 = (w0) y0Var;
            } else {
                y0Var2 = null;
            }
            if (y0Var2 == null) {
                y0Var2 = new t0(y0Var);
            }
        } else {
            y0Var2 = y0Var;
        }
        y0Var2.f6112e = this;
        while (true) {
            Object D = D();
            if (D instanceof k0) {
                k0 k0Var = (k0) D;
                if (k0Var.f6073b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6115b;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, D, y0Var2)) {
                            z7 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != D) {
                            z7 = false;
                            break;
                        }
                    }
                    if (z7) {
                        return y0Var2;
                    }
                } else {
                    b1 b1Var = new b1();
                    if (!k0Var.f6073b) {
                        b1Var = new p0(b1Var);
                    }
                    do {
                        atomicReferenceFieldUpdater = f6115b;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k0Var, b1Var)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k0Var);
                }
            } else if (D instanceof q0) {
                b1 e6 = ((q0) D).e();
                if (e6 == null) {
                    if (D != null) {
                        Q((y0) D);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    i0 i0Var = c1.f6056b;
                    if (z5 && (D instanceof c)) {
                        synchronized (D) {
                            th = ((c) D).b();
                            if (th == null || ((y0Var instanceof k) && !((c) D).f())) {
                                if (e(D, e6, y0Var2)) {
                                    if (th == null) {
                                        return y0Var2;
                                    }
                                    i0Var = y0Var2;
                                }
                            }
                            c4.h hVar = c4.h.f2763a;
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z6) {
                            y0Var.f(th);
                        }
                        return i0Var;
                    } else if (e(D, e6, y0Var2)) {
                        return y0Var2;
                    }
                }
            } else {
                if (z6) {
                    if (D instanceof n) {
                        nVar = (n) D;
                    } else {
                        nVar = null;
                    }
                    if (nVar != null) {
                        th2 = nVar.f6092a;
                    }
                    y0Var.f(th2);
                }
                return c1.f6056b;
            }
        }
    }

    public final boolean l(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z5 = th instanceof CancellationException;
        j jVar = (j) this._parentHandle;
        if (jVar != null && jVar != c1.f6056b) {
            if (jVar.d(th) || z5) {
                return true;
            }
            return false;
        }
        return z5;
    }

    public String m() {
        return "Job was cancelled";
    }

    @Override // e4.f
    public final e4.f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // e4.f
    public final e4.f plus(e4.f fVar) {
        l4.f.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    @Override // s4.l
    public final void q(z0 z0Var) {
        i(z0Var);
    }

    @Override // s4.e1
    public final CancellationException r() {
        Throwable th;
        Object D = D();
        if (D instanceof c) {
            th = ((c) D).b();
        } else if (D instanceof n) {
            th = ((n) D).f6092a;
        } else if (D instanceof q0) {
            throw new IllegalStateException(l4.f.j(D, "Cannot be cancelling child in this state: ").toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new v0(l4.f.j(S(D), "Parent job is "), th, this) : cancellationException;
    }

    @Override // s4.u0
    public final CancellationException s() {
        Object D = D();
        CancellationException cancellationException = null;
        if (D instanceof c) {
            Throwable b6 = ((c) D).b();
            if (b6 != null) {
                String j5 = l4.f.j(" is cancelling", getClass().getSimpleName());
                if (b6 instanceof CancellationException) {
                    cancellationException = (CancellationException) b6;
                }
                if (cancellationException == null) {
                    if (j5 == null) {
                        j5 = m();
                    }
                    cancellationException = new v0(j5, b6, this);
                }
            }
            if (cancellationException == null) {
                throw new IllegalStateException(l4.f.j(this, "Job is still new or active: ").toString());
            }
            return cancellationException;
        } else if (!(D instanceof q0)) {
            if (D instanceof n) {
                Throwable th = ((n) D).f6092a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new v0(m(), th, this);
                }
                return cancellationException;
            }
            return new v0(l4.f.j(" has completed normally", getClass().getSimpleName()), null, this);
        } else {
            throw new IllegalStateException(l4.f.j(this, "Job is still new or active: ").toString());
        }
    }

    @Override // s4.u0
    public final boolean start() {
        int R;
        do {
            R = R(D());
            if (R == 0) {
                return false;
            }
        } while (R != 1);
        return true;
    }

    public boolean t(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return i(th) && z();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(L() + '{' + S(D()) + '}');
        sb.append('@');
        sb.append(y.a(this));
        return sb.toString();
    }

    public final void u(q0 q0Var, Object obj) {
        n nVar;
        Throwable th;
        q3.r rVar;
        j jVar = (j) this._parentHandle;
        if (jVar != null) {
            jVar.a();
            this._parentHandle = c1.f6056b;
        }
        if (obj instanceof n) {
            nVar = (n) obj;
        } else {
            nVar = null;
        }
        if (nVar == null) {
            th = null;
        } else {
            th = nVar.f6092a;
        }
        if (q0Var instanceof y0) {
            try {
                ((y0) q0Var).m(th);
                return;
            } catch (Throwable th2) {
                H(new q3.r("Exception in completion handler " + q0Var + " for " + this, th2));
                return;
            }
        }
        b1 e6 = q0Var.e();
        if (e6 != null) {
            q3.r rVar2 = null;
            for (kotlinx.coroutines.internal.g gVar = (kotlinx.coroutines.internal.g) e6.h(); !l4.f.a(gVar, e6); gVar = gVar.i()) {
                if (gVar instanceof y0) {
                    y0 y0Var = (y0) gVar;
                    try {
                        y0Var.m(th);
                    } catch (Throwable th3) {
                        if (rVar2 == null) {
                            rVar = null;
                        } else {
                            androidx.activity.k.f(rVar2, th3);
                            rVar = rVar2;
                        }
                        if (rVar == null) {
                            rVar2 = new q3.r("Exception in completion handler " + y0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (rVar2 != null) {
                H(rVar2);
            }
        }
    }

    public final Throwable v(Object obj) {
        boolean z5;
        if (obj == null) {
            z5 = true;
        } else {
            z5 = obj instanceof Throwable;
        }
        if (z5) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new v0(m(), null, this);
            }
            return th;
        } else if (obj != null) {
            return ((e1) obj).r();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    @Override // s4.u0
    public final void w(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new v0(m(), null, this);
        }
        i(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object y(c cVar, Object obj) {
        n nVar;
        Throwable th;
        Object obj2;
        boolean z5;
        Throwable th2 = null;
        if (obj instanceof n) {
            nVar = (n) obj;
        } else {
            nVar = null;
        }
        if (nVar == null) {
            th = null;
        } else {
            th = nVar.f6092a;
        }
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> h6 = cVar.h(th);
            if (h6.isEmpty()) {
                if (cVar.d()) {
                    th2 = new v0(m(), null, this);
                }
            } else {
                Iterator it = h6.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th2 = next;
                        break;
                    }
                }
                th2 = th2;
                if (th2 == null) {
                    th2 = (Throwable) h6.get(0);
                }
            }
            if (th2 != null && h6.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(h6.size()));
                for (Throwable th3 : h6) {
                    if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        androidx.activity.k.f(th2, th3);
                    }
                }
            }
        }
        if (th2 != null && th2 != th) {
            obj = new n(th2, false);
        }
        if (th2 != null) {
            if (!l(th2) && !G(th2)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                if (obj != null) {
                    n.f6091b.compareAndSet((n) obj, 0, 1);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6115b;
        if (obj instanceof q0) {
            obj2 = new r0((q0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, obj2) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        u(cVar, obj);
        return obj;
    }

    public boolean z() {
        return true;
    }
}
