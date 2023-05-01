package s4;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import s4.m0;
/* loaded from: classes.dex */
public final class z extends m0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h  reason: collision with root package name */
    public static final z f6113h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f6114i;

    static {
        Long l5;
        z zVar = new z();
        f6113h = zVar;
        zVar.J(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l5 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l5 = 1000L;
        }
        f6114i = timeUnit.toNanos(l5.longValue());
    }

    @Override // s4.n0
    public final Thread L() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // s4.n0
    public final void M(long j5, m0.a aVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // s4.m0
    public final void N(Runnable runnable) {
        boolean z5;
        if (debugStatus == 4) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            super.N(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void T() {
        boolean z5;
        int i6 = debugStatus;
        if (i6 != 2 && i6 != 3) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5) {
            return;
        }
        debugStatus = 3;
        R();
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        boolean z6;
        boolean z7;
        j1.f6071a.set(this);
        try {
            synchronized (this) {
                int i6 = debugStatus;
                if (i6 != 2 && i6 != 3) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z5) {
                    z6 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z6 = true;
                }
            }
            if (!z6) {
                _thread = null;
                T();
                if (!P()) {
                    L();
                    return;
                }
                return;
            }
            long j5 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long Q = Q();
                if (Q == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j5 == Long.MAX_VALUE) {
                        j5 = f6114i + nanoTime;
                    }
                    long j6 = j5 - nanoTime;
                    if (j6 <= 0) {
                        _thread = null;
                        T();
                        if (!P()) {
                            L();
                            return;
                        }
                        return;
                    } else if (Q > j6) {
                        Q = j6;
                    }
                } else {
                    j5 = Long.MAX_VALUE;
                }
                if (Q > 0) {
                    int i7 = debugStatus;
                    if (i7 != 2 && i7 != 3) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        _thread = null;
                        T();
                        if (!P()) {
                            L();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, Q);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            T();
            if (!P()) {
                L();
            }
            throw th;
        }
    }

    @Override // s4.m0, s4.l0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
