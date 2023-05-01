package s4;

import s4.z0;
/* loaded from: classes.dex */
public class c0<T> extends a<T> implements b0<T> {
    public c0(e4.f fVar, boolean z5) {
        super(fVar, z5);
    }

    @Override // s4.b0
    public final Object n(e4.d<? super T> dVar) {
        Object D;
        do {
            D = D();
            if (!(D instanceof q0)) {
                if (!(D instanceof n)) {
                    return androidx.fragment.app.r0.h(D);
                }
                throw ((n) D).f6092a;
            }
        } while (R(D) < 0);
        z0.a aVar = new z0.a(c0.n.g(dVar), this);
        aVar.o();
        aVar.q(new j0(k(false, true, new f1(aVar))));
        return aVar.n();
    }
}
