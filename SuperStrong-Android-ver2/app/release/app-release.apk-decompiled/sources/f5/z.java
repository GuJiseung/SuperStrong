package f5;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class z {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4023d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f4024a;

    /* renamed from: b  reason: collision with root package name */
    public long f4025b;

    /* renamed from: c  reason: collision with root package name */
    public long f4026c;

    /* loaded from: classes.dex */
    public class a extends z {
        @Override // f5.z
        public final z d(long j5) {
            return this;
        }

        @Override // f5.z
        public final void f() {
        }

        @Override // f5.z
        public final z g(long j5, TimeUnit timeUnit) {
            return this;
        }
    }

    public z a() {
        this.f4024a = false;
        return this;
    }

    public z b() {
        this.f4026c = 0L;
        return this;
    }

    public long c() {
        if (this.f4024a) {
            return this.f4025b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j5) {
        this.f4024a = true;
        this.f4025b = j5;
        return this;
    }

    public boolean e() {
        return this.f4024a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f4024a && this.f4025b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j5, TimeUnit timeUnit) {
        if (j5 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j5);
        } else if (timeUnit != null) {
            this.f4026c = timeUnit.toNanos(j5);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }
}
