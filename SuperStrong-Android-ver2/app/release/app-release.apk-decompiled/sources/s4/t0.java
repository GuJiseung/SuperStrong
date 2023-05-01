package s4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class t0 extends w0 {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6105g = AtomicIntegerFieldUpdater.newUpdater(t0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: f  reason: collision with root package name */
    public final k4.l<Throwable, c4.h> f6106f;

    public t0(y0 y0Var) {
        this.f6106f = y0Var;
    }

    @Override // k4.l
    public final /* bridge */ /* synthetic */ c4.h f(Throwable th) {
        m(th);
        return c4.h.f2763a;
    }

    @Override // s4.p
    public final void m(Throwable th) {
        if (f6105g.compareAndSet(this, 0, 1)) {
            this.f6106f.f(th);
        }
    }
}
