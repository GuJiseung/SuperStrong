package g5;
/* loaded from: classes.dex */
public final class n extends l4.g implements k4.l<Throwable, c4.h> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f4258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar) {
        super(1);
        this.f4258c = bVar;
    }

    @Override // k4.l
    public final c4.h f(Throwable th) {
        this.f4258c.cancel();
        return c4.h.f2763a;
    }
}
