package f5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class c extends z {

    /* renamed from: h  reason: collision with root package name */
    public static final long f3968h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f3969i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public static c f3970j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3971e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public c f3972f;

    /* renamed from: g  reason: collision with root package name */
    public long f3973g;

    /* loaded from: classes.dex */
    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.n();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<f5.c> r0 = f5.c.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                f5.c r1 = f5.c.h()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                f5.c r2 = f5.c.f3970j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                f5.c.f3970j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.n()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: f5.c.a.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f3968h = millis;
        f3969i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static c h() {
        c cVar = f3970j.f3972f;
        long nanoTime = System.nanoTime();
        if (cVar == null) {
            c.class.wait(f3968h);
            if (f3970j.f3972f != null || System.nanoTime() - nanoTime < f3969i) {
                return null;
            }
            return f3970j;
        }
        long j5 = cVar.f3973g - nanoTime;
        if (j5 > 0) {
            long j6 = j5 / 1000000;
            c.class.wait(j6, (int) (j5 - (1000000 * j6)));
            return null;
        }
        f3970j.f3972f = cVar.f3972f;
        cVar.f3972f = null;
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {, blocks: (B:10:0x0017, B:12:0x001b, B:13:0x002a, B:16:0x0032, B:18:0x003e, B:21:0x004a, B:22:0x004f, B:24:0x0053, B:28:0x005d, B:30:0x0065, B:20:0x0044, B:33:0x006c, B:34:0x0071), top: B:40:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r9 = this;
            boolean r0 = r9.f3971e
            if (r0 != 0) goto L75
            long r0 = r9.f4026c
            boolean r2 = r9.f4024a
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L11
            if (r2 != 0) goto L11
            return
        L11:
            r4 = 1
            r9.f3971e = r4
            java.lang.Class<f5.c> r4 = f5.c.class
            monitor-enter(r4)
            f5.c r5 = f5.c.f3970j     // Catch: java.lang.Throwable -> L72
            if (r5 != 0) goto L2a
            f5.c r5 = new f5.c     // Catch: java.lang.Throwable -> L72
            r5.<init>()     // Catch: java.lang.Throwable -> L72
            f5.c.f3970j = r5     // Catch: java.lang.Throwable -> L72
            f5.c$a r5 = new f5.c$a     // Catch: java.lang.Throwable -> L72
            r5.<init>()     // Catch: java.lang.Throwable -> L72
            r5.start()     // Catch: java.lang.Throwable -> L72
        L2a:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L3c
            if (r2 == 0) goto L3c
            long r2 = r9.c()     // Catch: java.lang.Throwable -> L72
            long r2 = r2 - r5
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L72
            goto L3e
        L3c:
            if (r3 == 0) goto L42
        L3e:
            long r0 = r0 + r5
            r9.f3973g = r0     // Catch: java.lang.Throwable -> L72
            goto L4a
        L42:
            if (r2 == 0) goto L6c
            long r0 = r9.c()     // Catch: java.lang.Throwable -> L72
            r9.f3973g = r0     // Catch: java.lang.Throwable -> L72
        L4a:
            long r0 = r9.f3973g     // Catch: java.lang.Throwable -> L72
            long r0 = r0 - r5
            f5.c r2 = f5.c.f3970j     // Catch: java.lang.Throwable -> L72
        L4f:
            f5.c r3 = r2.f3972f     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L5d
            long r7 = r3.f3973g     // Catch: java.lang.Throwable -> L72
            long r7 = r7 - r5
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5b
            goto L5d
        L5b:
            r2 = r3
            goto L4f
        L5d:
            r9.f3972f = r3     // Catch: java.lang.Throwable -> L72
            r2.f3972f = r9     // Catch: java.lang.Throwable -> L72
            f5.c r0 = f5.c.f3970j     // Catch: java.lang.Throwable -> L72
            if (r2 != r0) goto L6a
            java.lang.Class<f5.c> r0 = f5.c.class
            r0.notify()     // Catch: java.lang.Throwable -> L72
        L6a:
            monitor-exit(r4)
            return
        L6c:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L72
            r0.<init>()     // Catch: java.lang.Throwable -> L72
            throw r0     // Catch: java.lang.Throwable -> L72
        L72:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unbalanced enter/exit"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.c.i():void");
    }

    public final IOException j(IOException iOException) {
        return !l() ? iOException : m(iOException);
    }

    public final void k(boolean z5) {
        if (l() && z5) {
            throw m(null);
        }
    }

    public final boolean l() {
        if (!this.f3971e) {
            return false;
        }
        this.f3971e = false;
        synchronized (c.class) {
            c cVar = f3970j;
            while (cVar != null) {
                c cVar2 = cVar.f3972f;
                if (cVar2 == this) {
                    cVar.f3972f = this.f3972f;
                    this.f3972f = null;
                    return false;
                }
                cVar = cVar2;
            }
            return true;
        }
    }

    public IOException m(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void n() {
    }
}
