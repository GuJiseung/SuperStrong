package s4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class f0<T> extends kotlinx.coroutines.internal.o<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6058e = AtomicIntegerFieldUpdater.newUpdater(f0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public f0(e4.d dVar, e4.f fVar) {
        super(dVar, fVar);
        this._decision = 0;
    }

    @Override // kotlinx.coroutines.internal.o, s4.a
    public final void V(Object obj) {
        boolean z5;
        while (true) {
            int i6 = this._decision;
            z5 = false;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f6058e.compareAndSet(this, 0, 2)) {
                z5 = true;
                break;
            }
        }
        if (z5) {
            return;
        }
        androidx.fragment.app.r0.d(c0.n.g(this.f4971d), kotlinx.coroutines.internal.f.d(obj), null);
    }

    public final Object X() {
        boolean z5;
        while (true) {
            int i6 = this._decision;
            z5 = false;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
            } else if (f6058e.compareAndSet(this, 0, 1)) {
                z5 = true;
                break;
            }
        }
        if (z5) {
            return f4.a.COROUTINE_SUSPENDED;
        }
        Object h6 = androidx.fragment.app.r0.h(D());
        if (!(h6 instanceof n)) {
            return h6;
        }
        throw ((n) h6).f6092a;
    }

    @Override // kotlinx.coroutines.internal.o, s4.z0
    public final void g(Object obj) {
        V(obj);
    }
}
