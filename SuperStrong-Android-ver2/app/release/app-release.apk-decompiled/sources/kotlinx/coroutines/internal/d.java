package kotlinx.coroutines.internal;

import s4.a0;
import s4.d0;
/* loaded from: classes.dex */
public final class d extends s4.t implements Runnable, d0 {

    /* renamed from: c  reason: collision with root package name */
    public final s4.t f4949c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4950d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d0 f4951e;

    /* renamed from: f  reason: collision with root package name */
    public final h<Runnable> f4952f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4953g;
    private volatile int runningWorkers;

    public d(kotlinx.coroutines.scheduling.l lVar, int i6) {
        d0 d0Var;
        this.f4949c = lVar;
        this.f4950d = i6;
        if (lVar instanceof d0) {
            d0Var = (d0) lVar;
        } else {
            d0Var = null;
        }
        this.f4951e = d0Var == null ? a0.f6053a : d0Var;
        this.f4952f = new h<>();
        this.f4953g = new Object();
    }

    @Override // s4.t
    public final void h(e4.f fVar, Runnable runnable) {
        boolean z5;
        this.f4952f.a(runnable);
        boolean z6 = true;
        if (this.runningWorkers >= this.f4950d) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            synchronized (this.f4953g) {
                if (this.runningWorkers >= this.f4950d) {
                    z6 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z6) {
                this.f4949c.h(this, this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = r3.f4953g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        r3.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r3.f4952f.c() != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        r3.runningWorkers++;
        r1 = c4.h.f2763a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            kotlinx.coroutines.internal.h<java.lang.Runnable> r1 = r3.f4952f
            java.lang.Object r1 = r1.d()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L29
            r1.run()     // Catch: java.lang.Throwable -> Lf
            goto L15
        Lf:
            r1 = move-exception
            e4.g r2 = e4.g.f3850b
            c0.n.f(r2, r1)
        L15:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L1
            s4.t r1 = r3.f4949c
            boolean r1 = r1.G()
            if (r1 == 0) goto L1
            s4.t r0 = r3.f4949c
            r0.h(r3, r3)
            return
        L29:
            java.lang.Object r0 = r3.f4953g
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L46
            int r1 = r1 + (-1)
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L46
            kotlinx.coroutines.internal.h<java.lang.Runnable> r1 = r3.f4952f     // Catch: java.lang.Throwable -> L46
            int r1 = r1.c()     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L3c
            monitor-exit(r0)
            return
        L3c:
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L46
            int r1 = r1 + 1
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L46
            c4.h r1 = c4.h.f2763a     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            goto L0
        L46:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.d.run():void");
    }
}
