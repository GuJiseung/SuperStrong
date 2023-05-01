package f5;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class k extends z {

    /* renamed from: e  reason: collision with root package name */
    public z f3986e;

    public k(z zVar) {
        if (zVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f3986e = zVar;
    }

    @Override // f5.z
    public final z a() {
        return this.f3986e.a();
    }

    @Override // f5.z
    public final z b() {
        return this.f3986e.b();
    }

    @Override // f5.z
    public final long c() {
        return this.f3986e.c();
    }

    @Override // f5.z
    public final z d(long j5) {
        return this.f3986e.d(j5);
    }

    @Override // f5.z
    public final boolean e() {
        return this.f3986e.e();
    }

    @Override // f5.z
    public final void f() {
        this.f3986e.f();
    }

    @Override // f5.z
    public final z g(long j5, TimeUnit timeUnit) {
        return this.f3986e.g(j5, timeUnit);
    }
}
