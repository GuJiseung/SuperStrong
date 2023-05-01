package s4;

import s4.u0;
/* loaded from: classes.dex */
public abstract class a<T> extends z0 implements e4.d<T>, w {

    /* renamed from: c  reason: collision with root package name */
    public final e4.f f6052c;

    public a(e4.f fVar, boolean z5) {
        super(z5);
        I((u0) fVar.get(u0.b.f6108b));
        this.f6052c = fVar.plus(this);
    }

    @Override // s4.z0
    public final void H(q3.r rVar) {
        c0.n.f(this.f6052c, rVar);
    }

    @Override // s4.z0
    public final String L() {
        return super.L();
    }

    @Override // s4.z0
    public final void O(Object obj) {
        if (obj instanceof n) {
            Throwable th = ((n) obj).f6092a;
        }
    }

    public void V(Object obj) {
        g(obj);
    }

    public final void W(int i6, a aVar, k4.p pVar) {
        Object e6;
        if (i6 != 0) {
            int i7 = i6 - 1;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            try {
                                e4.f fVar = this.f6052c;
                                Object b6 = kotlinx.coroutines.internal.q.b(fVar, null);
                                l4.n.a(pVar);
                                e6 = pVar.e(aVar, this);
                                kotlinx.coroutines.internal.q.a(fVar, b6);
                                if (e6 == f4.a.COROUTINE_SUSPENDED) {
                                    return;
                                }
                            } catch (Throwable th) {
                                e6 = a1.f0.e(th);
                            }
                            d(e6);
                            return;
                        }
                        throw new c4.a();
                    }
                    c0.n.g(c0.n.c(aVar, this, pVar)).d(c4.h.f2763a);
                    return;
                }
                return;
            }
            c0.n.i(pVar, aVar, this);
            return;
        }
        throw null;
    }

    @Override // e4.d
    public final e4.f b() {
        return this.f6052c;
    }

    @Override // s4.z0, s4.u0
    public final boolean c() {
        return super.c();
    }

    @Override // e4.d
    public final void d(Object obj) {
        Throwable a6 = c4.d.a(obj);
        if (a6 != null) {
            obj = new n(a6, false);
        }
        Object K = K(obj);
        if (K == androidx.fragment.app.r0.f1630h) {
            return;
        }
        V(K);
    }

    @Override // s4.w
    public final e4.f h() {
        return this.f6052c;
    }

    @Override // s4.z0
    public final String m() {
        return l4.f.j(" was cancelled", getClass().getSimpleName());
    }
}
