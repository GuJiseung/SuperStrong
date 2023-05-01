package b5;

import b5.q;
import b5.u;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class g implements Closeable {

    /* renamed from: y  reason: collision with root package name */
    public static final ThreadPoolExecutor f2525y;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2526b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2527c;

    /* renamed from: e  reason: collision with root package name */
    public final String f2529e;

    /* renamed from: f  reason: collision with root package name */
    public int f2530f;

    /* renamed from: g  reason: collision with root package name */
    public int f2531g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2532h;

    /* renamed from: i  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2533i;

    /* renamed from: j  reason: collision with root package name */
    public final ThreadPoolExecutor f2534j;

    /* renamed from: k  reason: collision with root package name */
    public final u.a f2535k;

    /* renamed from: r  reason: collision with root package name */
    public long f2542r;
    public final e0.e s;

    /* renamed from: t  reason: collision with root package name */
    public final e0.e f2543t;
    public final Socket u;

    /* renamed from: v  reason: collision with root package name */
    public final s f2544v;

    /* renamed from: w  reason: collision with root package name */
    public final f f2545w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashSet f2546x;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f2528d = new LinkedHashMap();

    /* renamed from: l  reason: collision with root package name */
    public long f2536l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f2537m = 0;

    /* renamed from: n  reason: collision with root package name */
    public long f2538n = 0;

    /* renamed from: o  reason: collision with root package name */
    public long f2539o = 0;

    /* renamed from: p  reason: collision with root package name */
    public long f2540p = 0;

    /* renamed from: q  reason: collision with root package name */
    public long f2541q = 0;

    /* loaded from: classes.dex */
    public class a extends w4.b {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2547c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ long f2548d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object[] objArr, int i6, long j5) {
            super("OkHttp Window Update %s stream %d", objArr);
            this.f2547c = i6;
            this.f2548d = j5;
        }

        @Override // w4.b
        public final void a() {
            g gVar = g.this;
            try {
                gVar.f2544v.o(this.f2547c, this.f2548d);
            } catch (IOException e6) {
                gVar.f(e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Socket f2550a;

        /* renamed from: b  reason: collision with root package name */
        public String f2551b;

        /* renamed from: c  reason: collision with root package name */
        public f5.g f2552c;

        /* renamed from: d  reason: collision with root package name */
        public f5.f f2553d;

        /* renamed from: e  reason: collision with root package name */
        public d f2554e = d.f2557a;

        /* renamed from: f  reason: collision with root package name */
        public int f2555f;
    }

    /* loaded from: classes.dex */
    public final class c extends w4.b {
        public c() {
            super("OkHttp %s ping", g.this.f2529e);
        }

        @Override // w4.b
        public final void a() {
            g gVar;
            boolean z5;
            synchronized (g.this) {
                gVar = g.this;
                long j5 = gVar.f2537m;
                long j6 = gVar.f2536l;
                if (j5 < j6) {
                    z5 = true;
                } else {
                    gVar.f2536l = j6 + 1;
                    z5 = false;
                }
            }
            if (z5) {
                gVar.c(2, 2, null);
                return;
            }
            try {
                gVar.f2544v.k(1, 0, false);
            } catch (IOException e6) {
                gVar.c(2, 2, e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2557a = new a();

        /* loaded from: classes.dex */
        public class a extends d {
            @Override // b5.g.d
            public final void b(r rVar) {
                rVar.c(5, null);
            }
        }

        public void a(g gVar) {
        }

        public abstract void b(r rVar);
    }

    /* loaded from: classes.dex */
    public final class e extends w4.b {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f2558c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2559d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2560e;

        public e(int i6, int i7) {
            super("OkHttp %s ping %08x%08x", g.this.f2529e, Integer.valueOf(i6), Integer.valueOf(i7));
            this.f2558c = true;
            this.f2559d = i6;
            this.f2560e = i7;
        }

        @Override // w4.b
        public final void a() {
            int i6 = this.f2559d;
            int i7 = this.f2560e;
            boolean z5 = this.f2558c;
            g gVar = g.this;
            gVar.getClass();
            try {
                gVar.f2544v.k(i6, i7, z5);
            } catch (IOException e6) {
                gVar.c(2, 2, e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f extends w4.b implements q.b {

        /* renamed from: c  reason: collision with root package name */
        public final q f2562c;

        public f(q qVar) {
            super("OkHttp %s", g.this.f2529e);
            this.f2562c = qVar;
        }

        @Override // w4.b
        public final void a() {
            g gVar = g.this;
            q qVar = this.f2562c;
            try {
                qVar.h(this);
                do {
                } while (qVar.f(false, this));
                gVar.c(1, 6, null);
            } catch (IOException e6) {
                gVar.c(2, 2, e6);
            } catch (Throwable th) {
                gVar.c(3, 3, null);
                w4.e.b(qVar);
                throw th;
            }
            w4.e.b(qVar);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = w4.e.f6593a;
        f2525y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new w4.c("OkHttp Http2Connection", true));
    }

    public g(b bVar) {
        e0.e eVar = new e0.e();
        this.s = eVar;
        e0.e eVar2 = new e0.e();
        this.f2543t = eVar2;
        this.f2546x = new LinkedHashSet();
        this.f2535k = u.f2637a;
        this.f2526b = true;
        this.f2527c = bVar.f2554e;
        this.f2531g = 3;
        eVar.d(7, 16777216);
        String str = bVar.f2551b;
        this.f2529e = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new w4.c(w4.e.i("OkHttp %s Writer", str), false));
        this.f2533i = scheduledThreadPoolExecutor;
        if (bVar.f2555f != 0) {
            c cVar = new c();
            long j5 = bVar.f2555f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(cVar, j5, j5, TimeUnit.MILLISECONDS);
        }
        this.f2534j = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w4.c(w4.e.i("OkHttp %s Push Observer", str), true));
        eVar2.d(7, 65535);
        eVar2.d(5, 16384);
        this.f2542r = eVar2.c();
        this.u = bVar.f2550a;
        this.f2544v = new s(bVar.f2553d, true);
        this.f2545w = new f(new q(bVar.f2552c, true));
    }

    public final void c(int i6, int i7, @Nullable IOException iOException) {
        r[] rVarArr;
        try {
            n(i6);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f2528d.isEmpty()) {
                rVarArr = null;
            } else {
                rVarArr = (r[]) this.f2528d.values().toArray(new r[this.f2528d.size()]);
                this.f2528d.clear();
            }
        }
        if (rVarArr != null) {
            for (r rVar : rVarArr) {
                try {
                    rVar.c(i7, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f2544v.close();
        } catch (IOException unused3) {
        }
        try {
            this.u.close();
        } catch (IOException unused4) {
        }
        this.f2533i.shutdown();
        this.f2534j.shutdown();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(1, 6, null);
    }

    public final void f(@Nullable IOException iOException) {
        c(2, 2, iOException);
    }

    public final void flush() {
        s sVar = this.f2544v;
        synchronized (sVar) {
            if (!sVar.f2628f) {
                sVar.f2624b.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final synchronized r h(int i6) {
        return (r) this.f2528d.get(Integer.valueOf(i6));
    }

    public final synchronized void j(w4.b bVar) {
        if (!this.f2532h) {
            this.f2534j.execute(bVar);
        }
    }

    public final synchronized r k(int i6) {
        r rVar;
        rVar = (r) this.f2528d.remove(Integer.valueOf(i6));
        notifyAll();
        return rVar;
    }

    public final void n(int i6) {
        synchronized (this.f2544v) {
            synchronized (this) {
                if (this.f2532h) {
                    return;
                }
                this.f2532h = true;
                this.f2544v.j(this.f2530f, i6, w4.e.f6593a);
            }
        }
    }

    public final synchronized void o(long j5) {
        long j6 = this.f2541q + j5;
        this.f2541q = j6;
        if (j6 >= this.s.c() / 2) {
            r(0, this.f2541q);
            this.f2541q = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f2544v.f2627e);
        r6 = r2;
        r8.f2542r -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r9, boolean r10, f5.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            b5.s r12 = r8.f2544v
            r12.f(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            monitor-enter(r8)
        L12:
            long r4 = r8.f2542r     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
            java.util.LinkedHashMap r2 = r8.f2528d     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
        L30:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L54
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L54
            b5.s r4 = r8.f2544v     // Catch: java.lang.Throwable -> L54
            int r4 = r4.f2627e     // Catch: java.lang.Throwable -> L54
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L54
            long r4 = r8.f2542r     // Catch: java.lang.Throwable -> L54
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L54
            long r4 = r4 - r6
            r8.f2542r = r4     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            long r12 = r12 - r6
            b5.s r4 = r8.f2544v
            if (r10 == 0) goto L4f
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = r3
        L50:
            r4.f(r5, r9, r11, r2)
            goto Ld
        L54:
            r9 = move-exception
            goto L63
        L56:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L54
            r9.interrupt()     // Catch: java.lang.Throwable -> L54
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L54
            r9.<init>()     // Catch: java.lang.Throwable -> L54
            throw r9     // Catch: java.lang.Throwable -> L54
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r9
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.g.p(int, boolean, f5.e, long):void");
    }

    public final void q(int i6, int i7) {
        try {
            this.f2533i.execute(new b5.f(this, new Object[]{this.f2529e, Integer.valueOf(i6)}, i6, i7));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void r(int i6, long j5) {
        try {
            this.f2533i.execute(new a(new Object[]{this.f2529e, Integer.valueOf(i6)}, i6, j5));
        } catch (RejectedExecutionException unused) {
        }
    }
}
