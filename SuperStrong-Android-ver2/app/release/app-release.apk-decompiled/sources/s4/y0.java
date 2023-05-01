package s4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class y0 extends p implements i0, q0 {

    /* renamed from: e  reason: collision with root package name */
    public z0 f6112e;

    @Override // s4.i0
    public final void a() {
        boolean z5;
        z0 n5 = n();
        do {
            Object D = n5.D();
            if (D instanceof y0) {
                if (D == this) {
                    k0 k0Var = androidx.fragment.app.r0.f1635m;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0.f6115b;
                        if (atomicReferenceFieldUpdater.compareAndSet(n5, D, k0Var)) {
                            z5 = true;
                            continue;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(n5) != D) {
                            z5 = false;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((D instanceof q0) && ((q0) D).e() != null) {
                l();
                return;
            } else {
                return;
            }
        } while (!z5);
    }

    @Override // s4.q0
    public final boolean c() {
        return true;
    }

    @Override // s4.q0
    public final b1 e() {
        return null;
    }

    public final z0 n() {
        z0 z0Var = this.f6112e;
        if (z0Var != null) {
            return z0Var;
        }
        l4.f.k("job");
        throw null;
    }

    @Override // kotlinx.coroutines.internal.g
    public final String toString() {
        return getClass().getSimpleName() + '@' + y.a(this) + "[job@" + y.a(n()) + ']';
    }
}
