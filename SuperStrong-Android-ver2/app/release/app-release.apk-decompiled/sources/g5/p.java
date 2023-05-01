package g5;
/* loaded from: classes.dex */
public final class p implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s4.f f4260a;

    public p(s4.g gVar) {
        this.f4260a = gVar;
    }

    @Override // g5.d
    public final void a(b<Object> bVar, Throwable th) {
        l4.f.g(bVar, "call");
        l4.f.g(th, "t");
        this.f4260a.d(a1.f0.e(th));
    }

    @Override // g5.d
    public final void b(b<Object> bVar, b0<Object> b0Var) {
        l4.f.g(bVar, "call");
        l4.f.g(b0Var, "response");
        this.f4260a.d(b0Var.a() ? b0Var.f4212b : a1.f0.e(new j(b0Var)));
    }
}
