package kotlinx.coroutines.internal;

import androidx.fragment.app.r0;
/* loaded from: classes.dex */
public class o<T> extends s4.a<T> implements g4.d {

    /* renamed from: d  reason: collision with root package name */
    public final e4.d<T> f4971d;

    public o(e4.d dVar, e4.f fVar) {
        super(fVar, true);
        this.f4971d = dVar;
    }

    @Override // s4.z0
    public final boolean J() {
        return true;
    }

    @Override // s4.a
    public void V(Object obj) {
        this.f4971d.d(f.d(obj));
    }

    @Override // g4.d
    public final g4.d a() {
        e4.d<T> dVar = this.f4971d;
        if (dVar instanceof g4.d) {
            return (g4.d) dVar;
        }
        return null;
    }

    @Override // s4.z0
    public void g(Object obj) {
        r0.d(c0.n.g(this.f4971d), f.d(obj), null);
    }
}
