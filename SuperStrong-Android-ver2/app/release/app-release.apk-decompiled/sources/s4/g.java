package s4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.u0;
/* loaded from: classes.dex */
public class g<T> extends g0<T> implements f<T>, g4.d {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6060h = AtomicIntegerFieldUpdater.newUpdater(g.class, "_decision");

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6061i = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: e  reason: collision with root package name */
    public final e4.d<T> f6062e;

    /* renamed from: f  reason: collision with root package name */
    public final e4.f f6063f;

    /* renamed from: g  reason: collision with root package name */
    public i0 f6064g;

    public g(e4.d dVar) {
        super(1);
        this.f6062e = dVar;
        this.f6063f = dVar.b();
        this._decision = 0;
        this._state = b.f6054b;
    }

    public static void s(Object obj, k4.l lVar) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    @Override // g4.d
    public final g4.d a() {
        e4.d<T> dVar = this.f6062e;
        if (dVar instanceof g4.d) {
            return (g4.d) dVar;
        }
        return null;
    }

    @Override // e4.d
    public final e4.f b() {
        return this.f6063f;
    }

    @Override // s4.g0
    public final void c(Object obj, CancellationException cancellationException) {
        boolean z5;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof d1)) {
                if (obj2 instanceof n) {
                    return;
                }
                boolean z6 = true;
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    if (mVar.f6083e != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        m a6 = m.a(mVar, null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6061i;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a6)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z6 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z6) {
                            d dVar = mVar.f6080b;
                            if (dVar != null) {
                                j(dVar, cancellationException);
                            }
                            k4.l<Throwable, c4.h> lVar = mVar.f6081c;
                            if (lVar != null) {
                                try {
                                    lVar.f(cancellationException);
                                    return;
                                } catch (Throwable th) {
                                    c0.n.f(this.f6063f, new q3.r(l4.f.j(this, "Exception in resume onCancellation handler for "), th));
                                    return;
                                }
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6061i;
                    m mVar2 = new m(obj2, (d) null, (k4.l) null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, mVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z6 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z6) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004b  */
    @Override // e4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Throwable r0 = c4.d.a(r12)
            r1 = 0
            if (r0 != 0) goto L8
            goto Ld
        L8:
            s4.n r12 = new s4.n
            r12.<init>(r0, r1)
        Ld:
            int r0 = r11.f6065d
        Lf:
            r5 = 0
            java.lang.Object r8 = r11._state
            boolean r2 = r8 instanceof s4.d1
            r9 = 1
            if (r2 == 0) goto L6b
            r2 = r8
            s4.d1 r2 = (s4.d1) r2
            boolean r3 = r12 instanceof s4.n
            if (r3 == 0) goto L1f
            goto L41
        L1f:
            if (r0 == r9) goto L27
            r3 = 2
            if (r0 != r3) goto L25
            goto L27
        L25:
            r3 = r1
            goto L28
        L27:
            r3 = r9
        L28:
            if (r3 != 0) goto L2b
            goto L41
        L2b:
            boolean r3 = r2 instanceof s4.d
            if (r3 == 0) goto L41
            s4.m r10 = new s4.m
            if (r3 == 0) goto L36
            s4.d r2 = (s4.d) r2
            goto L37
        L36:
            r2 = 0
        L37:
            r4 = r2
            r6 = 0
            r7 = 16
            r2 = r10
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            goto L42
        L41:
            r10 = r12
        L42:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = s4.g.f6061i
        L44:
            boolean r3 = r2.compareAndSet(r11, r8, r10)
            if (r3 == 0) goto L4b
            goto L52
        L4b:
            java.lang.Object r3 = r2.get(r11)
            if (r3 == r8) goto L44
            r9 = r1
        L52:
            if (r9 != 0) goto L55
            goto Lf
        L55:
            boolean r12 = r11.r()
            if (r12 != 0) goto L67
            s4.i0 r12 = r11.f6064g
            if (r12 != 0) goto L60
            goto L67
        L60:
            r12.a()
            s4.c1 r12 = s4.c1.f6056b
            r11.f6064g = r12
        L67:
            r11.l(r0)
            goto L7c
        L6b:
            boolean r0 = r8 instanceof s4.h
            if (r0 == 0) goto L7d
            s4.h r8 = (s4.h) r8
            r8.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = s4.h.f6066c
            boolean r0 = r0.compareAndSet(r8, r1, r9)
            if (r0 == 0) goto L7d
        L7c:
            return
        L7d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed, but proposed with update "
            java.lang.String r12 = l4.f.j(r12, r1)
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.g.d(java.lang.Object):void");
    }

    @Override // s4.g0
    public final e4.d<T> e() {
        return this.f6062e;
    }

    @Override // s4.g0
    public final Throwable f(Object obj) {
        Throwable f6 = super.f(obj);
        if (f6 == null) {
            return null;
        }
        return f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final <T> T g(Object obj) {
        return obj instanceof m ? (T) ((m) obj).f6079a : obj;
    }

    @Override // s4.g0
    public final Object i() {
        return this._state;
    }

    public final void j(d dVar, Throwable th) {
        try {
            dVar.a(th);
        } catch (Throwable th2) {
            c0.n.f(this.f6063f, new q3.r(l4.f.j(this, "Exception in invokeOnCancellation handler for "), th2));
        }
    }

    public final void k(Throwable th) {
        Object obj;
        boolean z5;
        boolean z6;
        d dVar;
        i0 i0Var;
        do {
            obj = this._state;
            if (!(obj instanceof d1)) {
                return;
            }
            z5 = obj instanceof d;
            h hVar = new h(this, th, z5);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6061i;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, hVar)) {
                    z6 = true;
                    continue;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z6 = false;
                    continue;
                    break;
                }
            }
        } while (!z6);
        if (z5) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            j(dVar, th);
        }
        if (!r() && (i0Var = this.f6064g) != null) {
            i0Var.a();
            this.f6064g = c1.f6056b;
        }
        l(this.f6065d);
    }

    /* JADX WARN: Finally extract failed */
    public final void l(int i6) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        while (true) {
            int i7 = this._decision;
            z5 = false;
            if (i7 != 0) {
                if (i7 == 1) {
                    z6 = false;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f6060h.compareAndSet(this, 0, 2)) {
                z6 = true;
                break;
            }
        }
        if (z6) {
            return;
        }
        e4.d<T> dVar = this.f6062e;
        if (i6 == 4) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 && (dVar instanceof kotlinx.coroutines.internal.c)) {
            if (i6 != 1 && i6 != 2) {
                z8 = false;
            } else {
                z8 = true;
            }
            int i8 = this.f6065d;
            if (i8 != 1 && i8 != 2) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z8 == z9) {
                t tVar = ((kotlinx.coroutines.internal.c) dVar).f4945e;
                e4.f b6 = dVar.b();
                if (tVar.G()) {
                    tVar.h(b6, this);
                    return;
                }
                l0 a6 = j1.a();
                if (a6.f6075c >= 4294967296L) {
                    z5 = true;
                }
                if (z5) {
                    a6.I(this);
                    return;
                }
                a6.J(true);
                try {
                    kotlinx.coroutines.internal.f.f(this, this.f6062e, true);
                    do {
                    } while (a6.K());
                } catch (Throwable th) {
                    try {
                        h(th, null);
                    } finally {
                        a6.H();
                    }
                }
                return;
            }
        }
        kotlinx.coroutines.internal.f.f(this, dVar, z7);
    }

    public Throwable m(z0 z0Var) {
        return z0Var.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        r5 = s4.c1.f6056b;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r7.f6064g != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        r0 = r7.f6062e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if ((r0 instanceof kotlinx.coroutines.internal.c) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        r0 = (kotlinx.coroutines.internal.c) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        r6 = r0.m(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r6 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        r0 = r7.f6064g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
        r0.a();
        r7.f6064g = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
        k(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
        return f4.a.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
        if (r0 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        r0 = r7.f6062e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
        if ((r0 instanceof kotlinx.coroutines.internal.c) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
        r0 = (kotlinx.coroutines.internal.c) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0065, code lost:
        r6 = r0.m(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0069, code lost:
        if (r6 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
        r0 = r7.f6064g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0071, code lost:
        r0.a();
        r7.f6064g = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0076, code lost:
        k(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0079, code lost:
        r0 = r7._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
        if ((r0 instanceof s4.n) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
        r1 = r7.f6065d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
        if (r1 == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
        if (r1 != 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0086, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0087, code lost:
        if (r3 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0089, code lost:
        r1 = (s4.u0) r7.f6063f.get(s4.u0.b.f6108b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0093, code lost:
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
        if (r1.c() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009c, code lost:
        r1 = r1.s();
        c(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a3, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a8, code lost:
        return g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ad, code lost:
        throw ((s4.n) r0).f6092a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n() {
        /*
            r7 = this;
            boolean r0 = r7.r()
        L4:
            int r1 = r7._decision
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1b
            if (r1 != r2) goto Lf
            r1 = r4
            goto L24
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = s4.g.f6060h
            boolean r1 = r1.compareAndSet(r7, r4, r3)
            if (r1 == 0) goto L4
            r1 = r3
        L24:
            s4.c1 r5 = s4.c1.f6056b
            r6 = 0
            if (r1 == 0) goto L56
            s4.i0 r1 = r7.f6064g
            if (r1 != 0) goto L30
            r7.p()
        L30:
            if (r0 == 0) goto L53
            e4.d<T> r0 = r7.f6062e
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.c
            if (r1 == 0) goto L3b
            kotlinx.coroutines.internal.c r0 = (kotlinx.coroutines.internal.c) r0
            goto L3c
        L3b:
            r0 = r6
        L3c:
            if (r0 != 0) goto L3f
            goto L43
        L3f:
            java.lang.Throwable r6 = r0.m(r7)
        L43:
            if (r6 != 0) goto L46
            goto L53
        L46:
            s4.i0 r0 = r7.f6064g
            if (r0 != 0) goto L4b
            goto L50
        L4b:
            r0.a()
            r7.f6064g = r5
        L50:
            r7.k(r6)
        L53:
            f4.a r0 = f4.a.COROUTINE_SUSPENDED
            return r0
        L56:
            if (r0 == 0) goto L79
            e4.d<T> r0 = r7.f6062e
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.c
            if (r1 == 0) goto L61
            kotlinx.coroutines.internal.c r0 = (kotlinx.coroutines.internal.c) r0
            goto L62
        L61:
            r0 = r6
        L62:
            if (r0 != 0) goto L65
            goto L69
        L65:
            java.lang.Throwable r6 = r0.m(r7)
        L69:
            if (r6 != 0) goto L6c
            goto L79
        L6c:
            s4.i0 r0 = r7.f6064g
            if (r0 != 0) goto L71
            goto L76
        L71:
            r0.a()
            r7.f6064g = r5
        L76:
            r7.k(r6)
        L79:
            java.lang.Object r0 = r7._state
            boolean r1 = r0 instanceof s4.n
            if (r1 != 0) goto La9
            int r1 = r7.f6065d
            if (r1 == r3) goto L87
            if (r1 != r2) goto L86
            goto L87
        L86:
            r3 = r4
        L87:
            if (r3 == 0) goto La4
            e4.f r1 = r7.f6063f
            s4.u0$b r2 = s4.u0.b.f6108b
            e4.f$b r1 = r1.get(r2)
            s4.u0 r1 = (s4.u0) r1
            if (r1 == 0) goto La4
            boolean r2 = r1.c()
            if (r2 == 0) goto L9c
            goto La4
        L9c:
            java.util.concurrent.CancellationException r1 = r1.s()
            r7.c(r0, r1)
            throw r1
        La4:
            java.lang.Object r0 = r7.g(r0)
            return r0
        La9:
            s4.n r0 = (s4.n) r0
            java.lang.Throwable r0 = r0.f6092a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.g.n():java.lang.Object");
    }

    public final void o() {
        i0 p5 = p();
        if (p5 != null && (!(this._state instanceof d1))) {
            p5.a();
            this.f6064g = c1.f6056b;
        }
    }

    public final i0 p() {
        u0 u0Var = (u0) this.f6063f.get(u0.b.f6108b);
        if (u0Var == null) {
            return null;
        }
        i0 a6 = u0.a.a(u0Var, true, new i(this), 2);
        this.f6064g = a6;
        return a6;
    }

    public final void q(k4.l<? super Throwable, c4.h> lVar) {
        d s0Var;
        boolean z5;
        if (lVar instanceof d) {
            s0Var = (d) lVar;
        } else {
            s0Var = new s0(lVar);
        }
        while (true) {
            Object obj = this._state;
            boolean z6 = true;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6061i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z6 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z6) {
                    return;
                }
            } else {
                Throwable th = null;
                if (!(obj instanceof d)) {
                    boolean z7 = obj instanceof n;
                    if (z7) {
                        n nVar = (n) obj;
                        nVar.getClass();
                        if (n.f6091b.compareAndSet(nVar, 0, 1)) {
                            if (obj instanceof h) {
                                if (!z7) {
                                    nVar = null;
                                }
                                if (nVar != null) {
                                    th = nVar.f6092a;
                                }
                                try {
                                    lVar.f(th);
                                    return;
                                } catch (Throwable th2) {
                                    c0.n.f(this.f6063f, new q3.r(l4.f.j(this, "Exception in invokeOnCancellation handler for "), th2));
                                    return;
                                }
                            }
                            return;
                        }
                        s(obj, lVar);
                        throw null;
                    } else if (obj instanceof m) {
                        m mVar = (m) obj;
                        if (mVar.f6080b == null) {
                            Throwable th3 = mVar.f6083e;
                            if (th3 != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                try {
                                    lVar.f(th3);
                                    return;
                                } catch (Throwable th4) {
                                    c0.n.f(this.f6063f, new q3.r(l4.f.j(this, "Exception in invokeOnCancellation handler for "), th4));
                                    return;
                                }
                            }
                            m a6 = m.a(mVar, s0Var, null, 29);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6061i;
                            while (true) {
                                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a6)) {
                                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                        z6 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z6) {
                                return;
                            }
                        } else {
                            s(obj, lVar);
                            throw null;
                        }
                    } else {
                        m mVar2 = new m(obj, s0Var, (k4.l) null, (CancellationException) null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f6061i;
                        while (true) {
                            if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, mVar2)) {
                                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                    z6 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z6) {
                            return;
                        }
                    }
                } else {
                    s(obj, lVar);
                    throw null;
                }
            }
        }
    }

    public final boolean r() {
        return (this.f6065d == 2) && ((kotlinx.coroutines.internal.c) this.f6062e).j();
    }

    public String t() {
        return "CancellableContinuation";
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(t());
        sb.append('(');
        sb.append(y.c(this.f6062e));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof d1) {
            str = "Active";
        } else if (obj instanceof h) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(y.a(this));
        return sb.toString();
    }
}
