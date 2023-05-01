package b5;

import f5.x;
import f5.y;
import f5.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public long f2600a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f2601b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2602c;

    /* renamed from: d  reason: collision with root package name */
    public final g f2603d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f2604e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2605f;

    /* renamed from: g  reason: collision with root package name */
    public final b f2606g;

    /* renamed from: h  reason: collision with root package name */
    public final a f2607h;

    /* renamed from: i  reason: collision with root package name */
    public final c f2608i;

    /* renamed from: j  reason: collision with root package name */
    public final c f2609j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public int f2610k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public IOException f2611l;

    /* loaded from: classes.dex */
    public final class a implements x {

        /* renamed from: b  reason: collision with root package name */
        public final f5.e f2612b = new f5.e();

        /* renamed from: c  reason: collision with root package name */
        public boolean f2613c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2614d;

        public a() {
        }

        @Override // f5.x
        public final z b() {
            return r.this.f2609j;
        }

        public final void c(boolean z5) {
            r rVar;
            long min;
            r rVar2;
            boolean z6;
            synchronized (r.this) {
                r.this.f2609j.i();
                while (true) {
                    rVar = r.this;
                    if (rVar.f2601b > 0 || this.f2614d || this.f2613c || rVar.f2610k != 0) {
                        break;
                    }
                    rVar.i();
                }
                rVar.f2609j.o();
                r.this.b();
                min = Math.min(r.this.f2601b, this.f2612b.f3977c);
                rVar2 = r.this;
                rVar2.f2601b -= min;
            }
            rVar2.f2609j.i();
            if (z5) {
                try {
                    if (min == this.f2612b.f3977c) {
                        z6 = true;
                        boolean z7 = z6;
                        r rVar3 = r.this;
                        rVar3.f2603d.p(rVar3.f2602c, z7, this.f2612b, min);
                        r.this.f2609j.o();
                    }
                } catch (Throwable th) {
                    r.this.f2609j.o();
                    throw th;
                }
            }
            z6 = false;
            boolean z72 = z6;
            r rVar32 = r.this;
            rVar32.f2603d.p(rVar32.f2602c, z72, this.f2612b, min);
            r.this.f2609j.o();
        }

        @Override // f5.x, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z5;
            synchronized (r.this) {
                if (this.f2613c) {
                    return;
                }
                r rVar = r.this;
                if (!rVar.f2607h.f2614d) {
                    if (this.f2612b.f3977c > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        while (this.f2612b.f3977c > 0) {
                            c(true);
                        }
                    } else {
                        rVar.f2603d.p(rVar.f2602c, true, null, 0L);
                    }
                }
                synchronized (r.this) {
                    this.f2613c = true;
                }
                r.this.f2603d.flush();
                r.this.a();
            }
        }

        @Override // f5.x, java.io.Flushable
        public final void flush() {
            synchronized (r.this) {
                r.this.b();
            }
            while (this.f2612b.f3977c > 0) {
                c(false);
                r.this.f2603d.flush();
            }
        }

        @Override // f5.x
        public final void u(f5.e eVar, long j5) {
            f5.e eVar2 = this.f2612b;
            eVar2.u(eVar, j5);
            while (eVar2.f3977c >= 16384) {
                c(false);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b implements y {

        /* renamed from: b  reason: collision with root package name */
        public final f5.e f2616b = new f5.e();

        /* renamed from: c  reason: collision with root package name */
        public final f5.e f2617c = new f5.e();

        /* renamed from: d  reason: collision with root package name */
        public final long f2618d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2619e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2620f;

        public b(long j5) {
            this.f2618d = j5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
            r0 = -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
        @Override // f5.y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long B(f5.e r13, long r14) {
            /*
                r12 = this;
            L0:
                b5.r r14 = b5.r.this
                monitor-enter(r14)
                b5.r r15 = b5.r.this     // Catch: java.lang.Throwable -> La0
                b5.r$c r15 = r15.f2608i     // Catch: java.lang.Throwable -> La0
                r15.i()     // Catch: java.lang.Throwable -> La0
                b5.r r15 = b5.r.this     // Catch: java.lang.Throwable -> L97
                int r0 = r15.f2610k     // Catch: java.lang.Throwable -> L97
                if (r0 == 0) goto L1f
                java.io.IOException r15 = r15.f2611l     // Catch: java.lang.Throwable -> L97
                if (r15 == 0) goto L15
                goto L20
            L15:
                b5.v r15 = new b5.v     // Catch: java.lang.Throwable -> L97
                b5.r r0 = b5.r.this     // Catch: java.lang.Throwable -> L97
                int r0 = r0.f2610k     // Catch: java.lang.Throwable -> L97
                r15.<init>(r0)     // Catch: java.lang.Throwable -> L97
                goto L20
            L1f:
                r15 = 0
            L20:
                boolean r0 = r12.f2619e     // Catch: java.lang.Throwable -> L97
                if (r0 != 0) goto L8f
                f5.e r0 = r12.f2617c     // Catch: java.lang.Throwable -> L97
                long r1 = r0.f3977c     // Catch: java.lang.Throwable -> L97
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r6 = -1
                if (r5 <= 0) goto L62
                r8 = 8192(0x2000, double:4.0474E-320)
                long r1 = java.lang.Math.min(r8, r1)     // Catch: java.lang.Throwable -> L97
                long r0 = r0.B(r13, r1)     // Catch: java.lang.Throwable -> L97
                b5.r r13 = b5.r.this     // Catch: java.lang.Throwable -> L97
                long r8 = r13.f2600a     // Catch: java.lang.Throwable -> L97
                long r8 = r8 + r0
                r13.f2600a = r8     // Catch: java.lang.Throwable -> L97
                if (r15 != 0) goto L77
                b5.g r13 = r13.f2603d     // Catch: java.lang.Throwable -> L97
                e0.e r13 = r13.s     // Catch: java.lang.Throwable -> L97
                int r13 = r13.c()     // Catch: java.lang.Throwable -> L97
                int r13 = r13 / 2
                long r10 = (long) r13     // Catch: java.lang.Throwable -> L97
                int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r13 < 0) goto L77
                b5.r r13 = b5.r.this     // Catch: java.lang.Throwable -> L97
                b5.g r2 = r13.f2603d     // Catch: java.lang.Throwable -> L97
                int r5 = r13.f2602c     // Catch: java.lang.Throwable -> L97
                long r8 = r13.f2600a     // Catch: java.lang.Throwable -> L97
                r2.r(r5, r8)     // Catch: java.lang.Throwable -> L97
                b5.r r13 = b5.r.this     // Catch: java.lang.Throwable -> L97
                r13.f2600a = r3     // Catch: java.lang.Throwable -> L97
                goto L77
            L62:
                boolean r0 = r12.f2620f     // Catch: java.lang.Throwable -> L97
                if (r0 != 0) goto L76
                if (r15 != 0) goto L76
                b5.r r15 = b5.r.this     // Catch: java.lang.Throwable -> L97
                r15.i()     // Catch: java.lang.Throwable -> L97
                b5.r r15 = b5.r.this     // Catch: java.lang.Throwable -> La0
                b5.r$c r15 = r15.f2608i     // Catch: java.lang.Throwable -> La0
                r15.o()     // Catch: java.lang.Throwable -> La0
                monitor-exit(r14)     // Catch: java.lang.Throwable -> La0
                goto L0
            L76:
                r0 = r6
            L77:
                b5.r r13 = b5.r.this     // Catch: java.lang.Throwable -> La0
                b5.r$c r13 = r13.f2608i     // Catch: java.lang.Throwable -> La0
                r13.o()     // Catch: java.lang.Throwable -> La0
                monitor-exit(r14)     // Catch: java.lang.Throwable -> La0
                int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r13 == 0) goto L8b
                b5.r r13 = b5.r.this
                b5.g r13 = r13.f2603d
                r13.o(r0)
                return r0
            L8b:
                if (r15 != 0) goto L8e
                return r6
            L8e:
                throw r15
            L8f:
                java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L97
                java.lang.String r15 = "stream closed"
                r13.<init>(r15)     // Catch: java.lang.Throwable -> L97
                throw r13     // Catch: java.lang.Throwable -> L97
            L97:
                r13 = move-exception
                b5.r r15 = b5.r.this     // Catch: java.lang.Throwable -> La0
                b5.r$c r15 = r15.f2608i     // Catch: java.lang.Throwable -> La0
                r15.o()     // Catch: java.lang.Throwable -> La0
                throw r13     // Catch: java.lang.Throwable -> La0
            La0:
                r13 = move-exception
                monitor-exit(r14)     // Catch: java.lang.Throwable -> La0
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: b5.r.b.B(f5.e, long):long");
        }

        @Override // f5.y
        public final z b() {
            return r.this.f2608i;
        }

        @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j5;
            synchronized (r.this) {
                this.f2619e = true;
                f5.e eVar = this.f2617c;
                j5 = eVar.f3977c;
                eVar.c();
                r.this.notifyAll();
            }
            if (j5 > 0) {
                r.this.f2603d.o(j5);
            }
            r.this.a();
        }
    }

    /* loaded from: classes.dex */
    public class c extends f5.c {
        public c() {
        }

        @Override // f5.c
        public final IOException m(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // f5.c
        public final void n() {
            r.this.e(6);
            g gVar = r.this.f2603d;
            synchronized (gVar) {
                long j5 = gVar.f2539o;
                long j6 = gVar.f2538n;
                if (j5 >= j6) {
                    gVar.f2538n = j6 + 1;
                    gVar.f2540p = System.nanoTime() + 1000000000;
                    try {
                        gVar.f2533i.execute(new h(gVar, gVar.f2529e));
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
        }

        public final void o() {
            if (l()) {
                throw m(null);
            }
        }
    }

    public r(int i6, g gVar, boolean z5, boolean z6, @Nullable v4.p pVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f2604e = arrayDeque;
        this.f2608i = new c();
        this.f2609j = new c();
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f2602c = i6;
        this.f2603d = gVar;
        this.f2601b = gVar.f2543t.c();
        b bVar = new b(gVar.s.c());
        this.f2606g = bVar;
        a aVar = new a();
        this.f2607h = aVar;
        bVar.f2620f = z6;
        aVar.f2614d = z5;
        if (pVar != null) {
            arrayDeque.add(pVar);
        }
        if (f() && pVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && pVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final void a() {
        boolean z5;
        boolean g2;
        synchronized (this) {
            b bVar = this.f2606g;
            if (!bVar.f2620f && bVar.f2619e) {
                a aVar = this.f2607h;
                if (aVar.f2614d || aVar.f2613c) {
                    z5 = true;
                    g2 = g();
                }
            }
            z5 = false;
            g2 = g();
        }
        if (z5) {
            c(6, null);
        } else if (g2) {
        } else {
            this.f2603d.k(this.f2602c);
        }
    }

    public final void b() {
        a aVar = this.f2607h;
        if (aVar.f2613c) {
            throw new IOException("stream closed");
        }
        if (aVar.f2614d) {
            throw new IOException("stream finished");
        }
        if (this.f2610k != 0) {
            IOException iOException = this.f2611l;
            if (iOException == null) {
                throw new v(this.f2610k);
            }
        }
    }

    public final void c(int i6, @Nullable IOException iOException) {
        if (!d(i6, iOException)) {
            return;
        }
        this.f2603d.f2544v.n(this.f2602c, i6);
    }

    public final boolean d(int i6, @Nullable IOException iOException) {
        synchronized (this) {
            if (this.f2610k != 0) {
                return false;
            }
            if (this.f2606g.f2620f && this.f2607h.f2614d) {
                return false;
            }
            this.f2610k = i6;
            this.f2611l = iOException;
            notifyAll();
            this.f2603d.k(this.f2602c);
            return true;
        }
    }

    public final void e(int i6) {
        if (d(i6, null)) {
            this.f2603d.q(this.f2602c, i6);
        }
    }

    public final boolean f() {
        return this.f2603d.f2526b == ((this.f2602c & 1) == 1);
    }

    public final synchronized boolean g() {
        if (this.f2610k != 0) {
            return false;
        }
        b bVar = this.f2606g;
        if (bVar.f2620f || bVar.f2619e) {
            a aVar = this.f2607h;
            if (aVar.f2614d || aVar.f2613c) {
                if (this.f2605f) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:10:0x0018, B:11:0x001c, B:12:0x0023, B:8:0x000f), top: B:19:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(v4.p r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f2605f     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            if (r0 == 0) goto Lf
            if (r4 != 0) goto L9
            goto Lf
        L9:
            b5.r$b r3 = r2.f2606g     // Catch: java.lang.Throwable -> L2e
            r3.getClass()     // Catch: java.lang.Throwable -> L2e
            goto L16
        Lf:
            r2.f2605f = r1     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayDeque r0 = r2.f2604e     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
        L16:
            if (r4 == 0) goto L1c
            b5.r$b r3 = r2.f2606g     // Catch: java.lang.Throwable -> L2e
            r3.f2620f = r1     // Catch: java.lang.Throwable -> L2e
        L1c:
            boolean r3 = r2.g()     // Catch: java.lang.Throwable -> L2e
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2d
            b5.g r3 = r2.f2603d
            int r4 = r2.f2602c
            r3.k(r4)
        L2d:
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.r.h(v4.p, boolean):void");
    }

    public final void i() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
