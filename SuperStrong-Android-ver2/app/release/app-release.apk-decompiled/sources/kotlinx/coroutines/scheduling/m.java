package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5018b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5019c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5020d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5021e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<g> f5022a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final g a(g gVar, boolean z5) {
        if (z5) {
            return b(gVar);
        }
        g gVar2 = (g) f5018b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        boolean z5 = true;
        if (gVar.f5007c.b() != 1) {
            z5 = false;
        }
        if (z5) {
            f5021e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i6 = this.producerIndex & 127;
        while (this.f5022a.get(i6) != null) {
            Thread.yield();
        }
        this.f5022a.lazySet(i6, gVar);
        f5019c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        if (this.lastScheduledTask != null) {
            return (this.producerIndex - this.consumerIndex) + 1;
        }
        return this.producerIndex - this.consumerIndex;
    }

    public final g d() {
        g andSet;
        while (true) {
            int i6 = this.consumerIndex;
            if (i6 - this.producerIndex == 0) {
                return null;
            }
            int i7 = i6 & 127;
            if (f5020d.compareAndSet(this, i6, i6 + 1) && (andSet = this.f5022a.getAndSet(i7, null)) != null) {
                boolean z5 = true;
                if (andSet.f5007c.b() != 1) {
                    z5 = false;
                }
                if (z5) {
                    f5021e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        return f(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(kotlinx.coroutines.scheduling.m r9) {
        /*
            r8 = this;
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.g> r2 = r9.f5022a
        L6:
            r3 = 1
            if (r0 == r1) goto L45
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 != 0) goto L10
            goto L45
        L10:
            java.lang.Object r5 = r2.get(r4)
            kotlinx.coroutines.scheduling.g r5 = (kotlinx.coroutines.scheduling.g) r5
            if (r5 == 0) goto L42
            kotlinx.coroutines.scheduling.h r6 = r5.f5007c
            int r6 = r6.b()
            r7 = 0
            if (r6 != r3) goto L23
            r6 = r3
            goto L24
        L23:
            r6 = r7
        L24:
            if (r6 == 0) goto L42
        L26:
            r6 = 0
            boolean r6 = r2.compareAndSet(r4, r5, r6)
            if (r6 == 0) goto L2e
            goto L35
        L2e:
            java.lang.Object r6 = r2.get(r4)
            if (r6 == r5) goto L26
            r3 = r7
        L35:
            if (r3 == 0) goto L42
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.m.f5021e
            r0.decrementAndGet(r9)
            r8.a(r5, r7)
            r0 = -1
            return r0
        L42:
            int r0 = r0 + 1
            goto L6
        L45:
            long r0 = r8.f(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.m.e(kotlinx.coroutines.scheduling.m):long");
    }

    public final long f(m mVar, boolean z5) {
        g gVar;
        boolean z6;
        boolean z7;
        do {
            gVar = (g) mVar.lastScheduledTask;
            if (gVar == null) {
                return -2L;
            }
            z6 = true;
            if (z5) {
                if (gVar.f5007c.b() == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    return -2L;
                }
            }
            k.f5014e.getClass();
            long nanoTime = System.nanoTime() - gVar.f5006b;
            long j5 = k.f5010a;
            if (nanoTime < j5) {
                return j5 - nanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5018b;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(mVar, gVar, null)) {
                    if (atomicReferenceFieldUpdater.get(mVar) != gVar) {
                        z6 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z6);
        a(gVar, false);
        return -1L;
    }
}
