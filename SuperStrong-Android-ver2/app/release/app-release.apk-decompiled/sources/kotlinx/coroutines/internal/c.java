package kotlinx.coroutines.internal;

import androidx.fragment.app.r0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.q;
import s4.c1;
import s4.g0;
import s4.i0;
import s4.j1;
import s4.l0;
import s4.y;
/* loaded from: classes.dex */
public final class c<T> extends g0<T> implements g4.d, e4.d<T> {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4944i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: e  reason: collision with root package name */
    public final s4.t f4945e;

    /* renamed from: f  reason: collision with root package name */
    public final e4.d<T> f4946f;

    /* renamed from: g  reason: collision with root package name */
    public Object f4947g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f4948h;

    public c(s4.t tVar, g4.c cVar) {
        super(-1);
        this.f4945e = tVar;
        this.f4946f = cVar;
        this.f4947g = r0.f1624b;
        Object fold = b().fold(0, q.a.f4974c);
        l4.f.c(fold);
        this.f4948h = fold;
        this._reusableCancellableContinuation = null;
    }

    @Override // g4.d
    public final g4.d a() {
        e4.d<T> dVar = this.f4946f;
        if (dVar instanceof g4.d) {
            return (g4.d) dVar;
        }
        return null;
    }

    @Override // e4.d
    public final e4.f b() {
        return this.f4946f.b();
    }

    @Override // s4.g0
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof s4.o) {
            ((s4.o) obj).f6095b.f(cancellationException);
        }
    }

    @Override // e4.d
    public final void d(Object obj) {
        Object nVar;
        boolean z5;
        e4.d<T> dVar = this.f4946f;
        e4.f b6 = dVar.b();
        Throwable a6 = c4.d.a(obj);
        if (a6 == null) {
            nVar = obj;
        } else {
            nVar = new s4.n(a6, false);
        }
        s4.t tVar = this.f4945e;
        if (tVar.G()) {
            this.f4947g = nVar;
            this.f6065d = 0;
            tVar.h(b6, this);
            return;
        }
        l0 a7 = j1.a();
        if (a7.f6075c >= 4294967296L) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            this.f4947g = nVar;
            this.f6065d = 0;
            a7.I(this);
            return;
        }
        a7.J(true);
        try {
            e4.f b7 = b();
            Object b8 = q.b(b7, this.f4948h);
            dVar.d(obj);
            c4.h hVar = c4.h.f2763a;
            q.a(b7, b8);
            do {
            } while (a7.K());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // s4.g0
    public final e4.d<T> e() {
        return this;
    }

    @Override // s4.g0
    public final Object i() {
        Object obj = this.f4947g;
        this.f4947g = r0.f1624b;
        return obj;
    }

    public final boolean j() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean k(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            a1.r rVar = r0.f1625c;
            boolean z5 = false;
            boolean z6 = true;
            if (l4.f.a(obj, rVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4944i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, th)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            break;
                        }
                    } else {
                        z5 = true;
                        break;
                    }
                }
                if (z5) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4944i;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z6 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z6) {
                    return false;
                }
            }
        }
    }

    public final void l() {
        s4.g gVar;
        i0 i0Var;
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof s4.g) {
            gVar = (s4.g) obj;
        } else {
            gVar = null;
        }
        if (gVar != null && (i0Var = gVar.f6064g) != null) {
            i0Var.a();
            gVar.f6064g = c1.f6056b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Throwable m(s4.f<?> r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6._reusableCancellableContinuation
            a1.r r1 = androidx.fragment.app.r0.f1625c
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.c.f4944i
        Lb:
            boolean r0 = r5.compareAndSet(r6, r1, r7)
            if (r0 == 0) goto L13
            r3 = r4
            goto L19
        L13:
            java.lang.Object r0 = r5.get(r6)
            if (r0 == r1) goto Lb
        L19:
            if (r3 == 0) goto L0
            return r2
        L1c:
            boolean r7 = r0 instanceof java.lang.Throwable
            if (r7 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.c.f4944i
        L22:
            boolean r1 = r7.compareAndSet(r6, r0, r2)
            if (r1 == 0) goto L2a
            r3 = r4
            goto L30
        L2a:
            java.lang.Object r1 = r7.get(r6)
            if (r1 == r0) goto L22
        L30:
            if (r3 == 0) goto L35
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L35:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L41:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r1 = "Inconsistent state "
            java.lang.String r0 = l4.f.j(r0, r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.c.m(s4.f):java.lang.Throwable");
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f4945e + ", " + y.c(this.f4946f) + ']';
    }
}
