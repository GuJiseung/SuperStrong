package s4;
/* loaded from: classes.dex */
public final class s0 extends d {

    /* renamed from: b  reason: collision with root package name */
    public final k4.l<Throwable, c4.h> f6102b;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(k4.l<? super Throwable, c4.h> lVar) {
        this.f6102b = lVar;
    }

    @Override // s4.e
    public final void a(Throwable th) {
        this.f6102b.f(th);
    }

    @Override // k4.l
    public final /* bridge */ /* synthetic */ c4.h f(Throwable th) {
        a(th);
        return c4.h.f2763a;
    }

    public final String toString() {
        return "InvokeOnCancel[" + this.f6102b.getClass().getSimpleName() + '@' + y.a(this) + ']';
    }
}
