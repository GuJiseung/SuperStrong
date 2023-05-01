package s4;
/* loaded from: classes.dex */
public final class i extends w0 {

    /* renamed from: f  reason: collision with root package name */
    public final g<?> f6069f;

    public i(g<?> gVar) {
        this.f6069f = gVar;
    }

    @Override // k4.l
    public final /* bridge */ /* synthetic */ c4.h f(Throwable th) {
        m(th);
        return c4.h.f2763a;
    }

    @Override // s4.p
    public final void m(Throwable th) {
        boolean k5;
        i0 i0Var;
        z0 n5 = n();
        g<?> gVar = this.f6069f;
        Throwable m5 = gVar.m(n5);
        if (!gVar.r()) {
            k5 = false;
        } else {
            k5 = ((kotlinx.coroutines.internal.c) gVar.f6062e).k(m5);
        }
        if (!k5) {
            gVar.k(m5);
            if (!gVar.r() && (i0Var = gVar.f6064g) != null) {
                i0Var.a();
                gVar.f6064g = c1.f6056b;
            }
        }
    }
}
