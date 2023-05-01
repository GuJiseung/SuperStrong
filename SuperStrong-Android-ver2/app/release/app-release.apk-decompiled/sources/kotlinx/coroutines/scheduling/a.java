package kotlinx.coroutines.scheduling;

import a1.r;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.n;
import s4.y;
/* loaded from: classes.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: b  reason: collision with root package name */
    public final int f4986b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4987c;
    volatile /* synthetic */ long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final long f4988d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4989e;

    /* renamed from: f  reason: collision with root package name */
    public final d f4990f;

    /* renamed from: g  reason: collision with root package name */
    public final d f4991g;

    /* renamed from: h  reason: collision with root package name */
    public final n<C0059a> f4992h;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: l  reason: collision with root package name */
    public static final r f4985l = new r(4, "NOT_IN_STACK");

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4982i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4983j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4984k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.scheduling.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0059a extends Thread {

        /* renamed from: i  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f4993i = AtomicIntegerFieldUpdater.newUpdater(C0059a.class, "workerCtl");

        /* renamed from: b  reason: collision with root package name */
        public final m f4994b;

        /* renamed from: c  reason: collision with root package name */
        public int f4995c;

        /* renamed from: d  reason: collision with root package name */
        public long f4996d;

        /* renamed from: e  reason: collision with root package name */
        public long f4997e;

        /* renamed from: f  reason: collision with root package name */
        public int f4998f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4999g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        public C0059a() {
            throw null;
        }

        public C0059a(int i6) {
            a.this = a.this;
            setDaemon(true);
            this.f4994b = new m();
            this.f4995c = 4;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f4985l;
            this.f4998f = m4.c.f5366b.a();
            f(i6);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
            if (r0 == null) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlinx.coroutines.scheduling.g a(boolean r10) {
            /*
                r9 = this;
                int r0 = r9.f4995c
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L7
                goto L2e
            L7:
                kotlinx.coroutines.scheduling.a r0 = kotlinx.coroutines.scheduling.a.this
            L9:
                long r5 = r0.controlState
                r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r3 = r3 & r5
                r7 = 42
                long r3 = r3 >> r7
                int r3 = (int) r3
                if (r3 != 0) goto L19
                r0 = r2
                goto L2a
            L19:
                r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r3
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.a.f4983j
                r4 = r0
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L9
                r0 = r1
            L2a:
                if (r0 == 0) goto L30
                r9.f4995c = r1
            L2e:
                r0 = r1
                goto L31
            L30:
                r0 = r2
            L31:
                r3 = 0
                if (r0 == 0) goto L77
                if (r10 == 0) goto L6c
                kotlinx.coroutines.scheduling.a r10 = kotlinx.coroutines.scheduling.a.this
                int r10 = r10.f4986b
                int r10 = r10 * 2
                int r10 = r9.d(r10)
                if (r10 != 0) goto L43
                goto L44
            L43:
                r1 = r2
            L44:
                if (r1 == 0) goto L4c
                kotlinx.coroutines.scheduling.g r10 = r9.e()
                if (r10 != 0) goto L76
            L4c:
                kotlinx.coroutines.scheduling.m r10 = r9.f4994b
                r10.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.m.f5018b
                java.lang.Object r0 = r0.getAndSet(r10, r3)
                kotlinx.coroutines.scheduling.g r0 = (kotlinx.coroutines.scheduling.g) r0
                if (r0 != 0) goto L60
                kotlinx.coroutines.scheduling.g r10 = r10.d()
                goto L61
            L60:
                r10 = r0
            L61:
                if (r10 != 0) goto L76
                if (r1 != 0) goto L72
                kotlinx.coroutines.scheduling.g r10 = r9.e()
                if (r10 != 0) goto L76
                goto L72
            L6c:
                kotlinx.coroutines.scheduling.g r10 = r9.e()
                if (r10 != 0) goto L76
            L72:
                kotlinx.coroutines.scheduling.g r10 = r9.i(r2)
            L76:
                return r10
            L77:
                if (r10 == 0) goto L8e
                kotlinx.coroutines.scheduling.m r10 = r9.f4994b
                r10.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.m.f5018b
                java.lang.Object r0 = r0.getAndSet(r10, r3)
                kotlinx.coroutines.scheduling.g r0 = (kotlinx.coroutines.scheduling.g) r0
                if (r0 != 0) goto L8c
                kotlinx.coroutines.scheduling.g r0 = r10.d()
            L8c:
                if (r0 != 0) goto L99
            L8e:
                kotlinx.coroutines.scheduling.a r10 = kotlinx.coroutines.scheduling.a.this
                kotlinx.coroutines.scheduling.d r10 = r10.f4991g
                java.lang.Object r10 = r10.d()
                r0 = r10
                kotlinx.coroutines.scheduling.g r0 = (kotlinx.coroutines.scheduling.g) r0
            L99:
                if (r0 != 0) goto L9f
                kotlinx.coroutines.scheduling.g r0 = r9.i(r1)
            L9f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.C0059a.a(boolean):kotlinx.coroutines.scheduling.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i6) {
            int i7 = this.f4998f;
            int i8 = i7 ^ (i7 << 13);
            int i9 = i8 ^ (i8 >> 17);
            int i10 = i9 ^ (i9 << 5);
            this.f4998f = i10;
            int i11 = i6 - 1;
            return (i11 & i6) == 0 ? i10 & i11 : (i10 & Integer.MAX_VALUE) % i6;
        }

        public final g e() {
            d dVar;
            int d6 = d(2);
            a aVar = a.this;
            if (d6 == 0) {
                g d7 = aVar.f4990f.d();
                if (d7 != null) {
                    return d7;
                }
                dVar = aVar.f4991g;
            } else {
                g d8 = aVar.f4991g.d();
                if (d8 != null) {
                    return d8;
                }
                dVar = aVar.f4990f;
            }
            return dVar.d();
        }

        public final void f(int i6) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f4989e);
            sb.append("-worker-");
            sb.append(i6 == 0 ? "TERMINATED" : String.valueOf(i6));
            setName(sb.toString());
            this.indexInArray = i6;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i6) {
            int i7 = this.f4995c;
            boolean z5 = i7 == 1;
            if (z5) {
                a.f4983j.addAndGet(a.this, 4398046511104L);
            }
            if (i7 != i6) {
                this.f4995c = i6;
            }
            return z5;
        }

        public final g i(boolean z5) {
            long f6;
            int i6 = (int) (a.this.controlState & 2097151);
            if (i6 < 2) {
                return null;
            }
            int d6 = d(i6);
            a aVar = a.this;
            int i7 = 0;
            long j5 = Long.MAX_VALUE;
            while (i7 < i6) {
                i7++;
                d6++;
                if (d6 > i6) {
                    d6 = 1;
                }
                C0059a b6 = aVar.f4992h.b(d6);
                if (b6 != null && b6 != this) {
                    m mVar = this.f4994b;
                    m mVar2 = b6.f4994b;
                    if (z5) {
                        f6 = mVar.e(mVar2);
                    } else {
                        mVar.getClass();
                        g d7 = mVar2.d();
                        if (d7 != null) {
                            mVar.a(d7, false);
                            f6 = -1;
                        } else {
                            f6 = mVar.f(mVar2, false);
                        }
                    }
                    if (f6 == -1) {
                        m mVar3 = this.f4994b;
                        mVar3.getClass();
                        g gVar = (g) m.f5018b.getAndSet(mVar3, null);
                        if (gVar == null) {
                            return mVar3.d();
                        }
                        return gVar;
                    } else if (f6 > 0) {
                        j5 = Math.min(j5, f6);
                    }
                }
            }
            if (j5 == Long.MAX_VALUE) {
                j5 = 0;
            }
            this.f4997e = j5;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x0002 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0062 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 332
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.C0059a.run():void");
        }
    }

    public a(int i6, int i7, long j5, String str) {
        this.f4986b = i6;
        this.f4987c = i7;
        this.f4988d = j5;
        this.f4989e = str;
        if (!(i6 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i6 + " should be at least 1").toString());
        }
        if (!(i7 >= i6)) {
            throw new IllegalArgumentException(("Max pool size " + i7 + " should be greater than or equals to core pool size " + i6).toString());
        }
        if (!(i7 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i7 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j5 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j5 + " must be positive").toString());
        }
        this.f4990f = new d();
        this.f4991g = new d();
        this.parkedWorkersStack = 0L;
        this.f4992h = new n<>(i6 + 1);
        this.controlState = i6 << 42;
        this._isTerminated = 0;
    }

    public final int c() {
        boolean z5;
        synchronized (this.f4992h) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j5 = this.controlState;
            int i6 = (int) (j5 & 2097151);
            int i7 = i6 - ((int) ((j5 & 4398044413952L) >> 21));
            boolean z6 = false;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 >= this.f4986b) {
                return 0;
            }
            if (i6 >= this.f4987c) {
                return 0;
            }
            int i8 = ((int) (this.controlState & 2097151)) + 1;
            if (i8 > 0 && this.f4992h.b(i8) == null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                C0059a c0059a = new C0059a(i8);
                this.f4992h.c(i8, c0059a);
                if (i8 == ((int) (2097151 & f4983j.incrementAndGet(this)))) {
                    z6 = true;
                }
                if (z6) {
                    c0059a.start();
                    return i7 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[LOOP:0: B:22:0x0034->B:39:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007b A[EDGE_INSN: B:70:0x007b->B:40:0x007b ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.a.f4984k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb0
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof kotlinx.coroutines.scheduling.a.C0059a
            r4 = 0
            if (r3 == 0) goto L18
            kotlinx.coroutines.scheduling.a$a r0 = (kotlinx.coroutines.scheduling.a.C0059a) r0
            goto L19
        L18:
            r0 = r4
        L19:
            if (r0 != 0) goto L1c
            goto L25
        L1c:
            kotlinx.coroutines.scheduling.a r3 = kotlinx.coroutines.scheduling.a.this
            boolean r3 = l4.f.a(r3, r10)
            if (r3 == 0) goto L25
            goto L26
        L25:
            r0 = r4
        L26:
            kotlinx.coroutines.internal.n<kotlinx.coroutines.scheduling.a$a> r3 = r10.f4992h
            monitor-enter(r3)
            long r5 = r10.controlState     // Catch: java.lang.Throwable -> Lc4
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L7b
            r3 = r2
        L34:
            int r6 = r3 + 1
            kotlinx.coroutines.internal.n<kotlinx.coroutines.scheduling.a$a> r7 = r10.f4992h
            java.lang.Object r7 = r7.b(r3)
            l4.f.c(r7)
            kotlinx.coroutines.scheduling.a$a r7 = (kotlinx.coroutines.scheduling.a.C0059a) r7
            if (r7 == r0) goto L76
        L43:
            boolean r8 = r7.isAlive()
            if (r8 == 0) goto L52
            java.util.concurrent.locks.LockSupport.unpark(r7)
            r8 = 10000(0x2710, double:4.9407E-320)
            r7.join(r8)
            goto L43
        L52:
            kotlinx.coroutines.scheduling.m r7 = r7.f4994b
            kotlinx.coroutines.scheduling.d r8 = r10.f4991g
            r7.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = kotlinx.coroutines.scheduling.m.f5018b
            java.lang.Object r9 = r9.getAndSet(r7, r4)
            kotlinx.coroutines.scheduling.g r9 = (kotlinx.coroutines.scheduling.g) r9
            if (r9 != 0) goto L64
            goto L67
        L64:
            r8.a(r9)
        L67:
            kotlinx.coroutines.scheduling.g r9 = r7.d()
            if (r9 != 0) goto L6f
            r9 = r1
            goto L73
        L6f:
            r8.a(r9)
            r9 = r2
        L73:
            if (r9 == 0) goto L76
            goto L67
        L76:
            if (r3 != r5) goto L79
            goto L7b
        L79:
            r3 = r6
            goto L34
        L7b:
            kotlinx.coroutines.scheduling.d r1 = r10.f4991g
            r1.b()
            kotlinx.coroutines.scheduling.d r1 = r10.f4990f
            r1.b()
        L85:
            if (r0 != 0) goto L89
            r1 = r4
            goto L8d
        L89:
            kotlinx.coroutines.scheduling.g r1 = r0.a(r2)
        L8d:
            if (r1 != 0) goto Lb1
            kotlinx.coroutines.scheduling.d r1 = r10.f4990f
            java.lang.Object r1 = r1.d()
            kotlinx.coroutines.scheduling.g r1 = (kotlinx.coroutines.scheduling.g) r1
            if (r1 != 0) goto Lb1
            kotlinx.coroutines.scheduling.d r1 = r10.f4991g
            java.lang.Object r1 = r1.d()
            kotlinx.coroutines.scheduling.g r1 = (kotlinx.coroutines.scheduling.g) r1
            if (r1 != 0) goto Lb1
            if (r0 != 0) goto La6
            goto Laa
        La6:
            r1 = 5
            r0.h(r1)
        Laa:
            r0 = 0
            r10.parkedWorkersStack = r0
            r10.controlState = r0
        Lb0:
            return
        Lb1:
            r1.run()     // Catch: java.lang.Throwable -> Lb5
            goto L85
        Lb5:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Thread$UncaughtExceptionHandler r5 = r3.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> Lc2
            r5.uncaughtException(r3, r1)     // Catch: java.lang.Throwable -> Lc2
            goto L85
        Lc2:
            r0 = move-exception
            throw r0
        Lc4:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(runnable, k.f5015f, false);
    }

    public final void f(Runnable runnable, h hVar, boolean z5) {
        g jVar;
        C0059a c0059a;
        g gVar;
        boolean z6;
        d dVar;
        k.f5014e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            jVar = (g) runnable;
            jVar.f5006b = nanoTime;
            jVar.f5007c = hVar;
        } else {
            jVar = new j(runnable, nanoTime, hVar);
        }
        Thread currentThread = Thread.currentThread();
        C0059a c0059a2 = null;
        if (currentThread instanceof C0059a) {
            c0059a = (C0059a) currentThread;
        } else {
            c0059a = null;
        }
        if (c0059a != null && l4.f.a(a.this, this)) {
            c0059a2 = c0059a;
        }
        boolean z7 = true;
        if (c0059a2 == null || c0059a2.f4995c == 5 || (jVar.f5007c.b() == 0 && c0059a2.f4995c == 2)) {
            gVar = jVar;
        } else {
            c0059a2.f4999g = true;
            gVar = c0059a2.f4994b.a(jVar, z5);
        }
        if (gVar != null) {
            if (gVar.f5007c.b() == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                dVar = this.f4991g;
            } else {
                dVar = this.f4990f;
            }
            if (!dVar.a(gVar)) {
                throw new RejectedExecutionException(l4.f.j(" was terminated", this.f4989e));
            }
        }
        if (!z5 || c0059a2 == null) {
            z7 = false;
        }
        if (jVar.f5007c.b() == 0) {
            if (!z7 && !n() && !k(this.controlState)) {
                n();
                return;
            }
            return;
        }
        long addAndGet = f4983j.addAndGet(this, 2097152L);
        if (!z7 && !n() && !k(addAndGet)) {
            n();
        }
    }

    public final void h(C0059a c0059a) {
        long j5;
        int b6;
        if (c0059a.c() != f4985l) {
            return;
        }
        do {
            j5 = this.parkedWorkersStack;
            b6 = c0059a.b();
            c0059a.g(this.f4992h.b((int) (2097151 & j5)));
        } while (!f4982i.compareAndSet(this, j5, b6 | ((2097152 + j5) & (-2097152))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j(C0059a c0059a, int i6, int i7) {
        while (true) {
            long j5 = this.parkedWorkersStack;
            int i8 = (int) (2097151 & j5);
            long j6 = (2097152 + j5) & (-2097152);
            if (i8 == i6) {
                if (i7 == 0) {
                    C0059a c0059a2 = c0059a;
                    while (true) {
                        Object c6 = c0059a2.c();
                        if (c6 == f4985l) {
                            i8 = -1;
                            break;
                        } else if (c6 == null) {
                            i8 = 0;
                            break;
                        } else {
                            c0059a2 = (C0059a) c6;
                            int b6 = c0059a2.b();
                            if (b6 != 0) {
                                i8 = b6;
                                break;
                            }
                        }
                    }
                } else {
                    i8 = i7;
                }
            }
            if (i8 >= 0 && f4982i.compareAndSet(this, j5, j6 | i8)) {
                return;
            }
        }
    }

    public final boolean k(long j5) {
        int i6 = ((int) (2097151 & j5)) - ((int) ((j5 & 4398044413952L) >> 21));
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = this.f4986b;
        if (i6 < i7) {
            int c6 = c();
            if (c6 == 1 && i7 > 1) {
                c();
            }
            if (c6 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        r rVar;
        int i6;
        while (true) {
            long j5 = this.parkedWorkersStack;
            C0059a b6 = this.f4992h.b((int) (2097151 & j5));
            if (b6 == null) {
                b6 = null;
            } else {
                long j6 = (2097152 + j5) & (-2097152);
                C0059a c0059a = b6;
                while (true) {
                    Object c6 = c0059a.c();
                    rVar = f4985l;
                    if (c6 == rVar) {
                        i6 = -1;
                        break;
                    } else if (c6 == null) {
                        i6 = 0;
                        break;
                    } else {
                        c0059a = (C0059a) c6;
                        i6 = c0059a.b();
                        if (i6 != 0) {
                            break;
                        }
                    }
                }
                if (i6 >= 0 && f4982i.compareAndSet(this, j5, i6 | j6)) {
                    b6.g(rVar);
                }
            }
            if (b6 == null) {
                return false;
            }
            if (C0059a.f4993i.compareAndSet(b6, -1, 0)) {
                LockSupport.unpark(b6);
                return true;
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        char c6;
        ArrayList arrayList = new ArrayList();
        int a6 = this.f4992h.a();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1;
        while (i11 < a6) {
            int i12 = i11 + 1;
            C0059a b6 = this.f4992h.b(i11);
            if (b6 != null) {
                int c7 = b6.f4994b.c();
                int a7 = m.g.a(b6.f4995c);
                if (a7 == 0) {
                    i6++;
                    sb = new StringBuilder();
                    sb.append(c7);
                    c6 = 'c';
                } else if (a7 == 1) {
                    i7++;
                    sb = new StringBuilder();
                    sb.append(c7);
                    c6 = 'b';
                } else if (a7 == 2) {
                    i8++;
                } else if (a7 == 3) {
                    i9++;
                    if (c7 > 0) {
                        sb = new StringBuilder();
                        sb.append(c7);
                        c6 = 'd';
                    }
                } else if (a7 == 4) {
                    i10++;
                }
                sb.append(c6);
                arrayList.add(sb.toString());
            }
            i11 = i12;
        }
        long j5 = this.controlState;
        return this.f4989e + '@' + y.a(this) + "[Pool Size {core = " + this.f4986b + ", max = " + this.f4987c + "}, Worker States {CPU = " + i6 + ", blocking = " + i7 + ", parked = " + i8 + ", dormant = " + i9 + ", terminated = " + i10 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f4990f.c() + ", global blocking queue size = " + this.f4991g.c() + ", Control State {created workers= " + ((int) (2097151 & j5)) + ", blocking tasks = " + ((int) ((4398044413952L & j5) >> 21)) + ", CPUs acquired = " + (this.f4986b - ((int) ((9223367638808264704L & j5) >> 42))) + "}]";
    }
}
