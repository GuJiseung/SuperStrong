package s4;
/* loaded from: classes.dex */
public final class j0 extends d {

    /* renamed from: b  reason: collision with root package name */
    public final i0 f6070b;

    public j0(i0 i0Var) {
        this.f6070b = i0Var;
    }

    @Override // s4.e
    public final void a(Throwable th) {
        this.f6070b.a();
    }

    @Override // k4.l
    public final /* bridge */ /* synthetic */ c4.h f(Throwable th) {
        a(th);
        return c4.h.f2763a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f6070b + ']';
    }
}
