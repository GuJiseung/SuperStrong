package v4;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;
import v4.w;
/* loaded from: classes.dex */
public final class k {
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public ThreadPoolExecutor f6443c;

    /* renamed from: a  reason: collision with root package name */
    public final int f6441a = 64;

    /* renamed from: b  reason: collision with root package name */
    public final int f6442b = 5;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f6444d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f6445e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f6446f = new ArrayDeque();

    @Nullable
    public final w.a a(String str) {
        Iterator it = this.f6445e.iterator();
        while (it.hasNext()) {
            w.a aVar = (w.a) it.next();
            if (w.this.f6550d.f6556a.f6464d.equals(str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f6444d.iterator();
        while (it2.hasNext()) {
            w.a aVar2 = (w.a) it2.next();
            if (w.this.f6550d.f6556a.f6464d.equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    public final void b(w.a aVar) {
        aVar.f6554d.decrementAndGet();
        ArrayDeque arrayDeque = this.f6445e;
        synchronized (this) {
            if (!arrayDeque.remove(aVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque r1 = r14.f6444d     // Catch: java.lang.Throwable -> Lbb
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lbb
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lbb
            v4.w$a r2 = (v4.w.a) r2     // Catch: java.lang.Throwable -> Lbb
            java.util.ArrayDeque r3 = r14.f6445e     // Catch: java.lang.Throwable -> Lbb
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lbb
            int r4 = r14.f6441a     // Catch: java.lang.Throwable -> Lbb
            if (r3 < r4) goto L23
            goto L3f
        L23:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f6554d     // Catch: java.lang.Throwable -> Lbb
            int r3 = r3.get()     // Catch: java.lang.Throwable -> Lbb
            int r4 = r14.f6442b     // Catch: java.lang.Throwable -> Lbb
            if (r3 < r4) goto L2e
            goto Lc
        L2e:
            r1.remove()     // Catch: java.lang.Throwable -> Lbb
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f6554d     // Catch: java.lang.Throwable -> Lbb
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> Lbb
            r0.add(r2)     // Catch: java.lang.Throwable -> Lbb
            java.util.ArrayDeque r3 = r14.f6445e     // Catch: java.lang.Throwable -> Lbb
            r3.add(r2)     // Catch: java.lang.Throwable -> Lbb
            goto Lc
        L3f:
            monitor-enter(r14)     // Catch: java.lang.Throwable -> Lbb
            java.util.ArrayDeque r1 = r14.f6445e     // Catch: java.lang.Throwable -> Lb8
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lb8
            java.util.ArrayDeque r2 = r14.f6446f     // Catch: java.lang.Throwable -> Lb8
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lb8
            int r1 = r1 + r2
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lbb
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L55:
            if (r3 >= r1) goto Lb7
            java.lang.Object r4 = r0.get(r3)
            v4.w$a r4 = (v4.w.a) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f6443c     // Catch: java.lang.Throwable -> Lb4
            if (r5 != 0) goto L80
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> Lb4
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lb4
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> Lb4
            r12.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = "OkHttp Dispatcher"
            byte[] r13 = w4.e.f6593a     // Catch: java.lang.Throwable -> Lb4
            w4.c r13 = new w4.c     // Catch: java.lang.Throwable -> Lb4
            r13.<init>(r6, r2)     // Catch: java.lang.Throwable -> Lb4
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch: java.lang.Throwable -> Lb4
            r14.f6443c = r5     // Catch: java.lang.Throwable -> Lb4
        L80:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f6443c     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r14)
            v4.w r6 = v4.w.this
            r5.execute(r4)     // Catch: java.lang.Throwable -> L89 java.util.concurrent.RejectedExecutionException -> L8b
            goto La9
        L89:
            r0 = move-exception
            goto Lac
        L8b:
            r5 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L89
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L89
            r7.initCause(r5)     // Catch: java.lang.Throwable -> L89
            y4.i r5 = r6.f6549c     // Catch: java.lang.Throwable -> L89
            r5.e(r7)     // Catch: java.lang.Throwable -> L89
            v4.e r5 = r4.f6553c     // Catch: java.lang.Throwable -> L89
            g5.t$a r5 = (g5.t.a) r5     // Catch: java.lang.Throwable -> L89
            r5.a(r7)     // Catch: java.lang.Throwable -> L89
            v4.u r5 = r6.f6548b
            v4.k r5 = r5.f6499b
            r5.b(r4)
        La9:
            int r3 = r3 + 1
            goto L55
        Lac:
            v4.u r1 = r6.f6548b
            v4.k r1 = r1.f6499b
            r1.b(r4)
            throw r0
        Lb4:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        Lb7:
            return
        Lb8:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lbb
            throw r0     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lbb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.k.c():void");
    }
}
