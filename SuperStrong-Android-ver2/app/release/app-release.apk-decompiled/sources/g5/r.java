package g5;
/* loaded from: classes.dex */
public final class r implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s4.f f4262a;

    public r(s4.g gVar) {
        this.f4262a = gVar;
    }

    @Override // g5.d
    public final void a(b<Object> bVar, Throwable th) {
        l4.f.g(bVar, "call");
        l4.f.g(th, "t");
        this.f4262a.d(a1.f0.e(th));
    }

    @Override // g5.d
    public final void b(b<Object> bVar, b0<Object> b0Var) {
        l4.f.g(bVar, "call");
        l4.f.g(b0Var, "response");
        this.f4262a.d(b0Var);
    }
}
