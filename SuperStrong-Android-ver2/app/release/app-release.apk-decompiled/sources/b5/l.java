package b5;
/* loaded from: classes.dex */
public final class l extends w4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2573c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f2574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, Object[] objArr, int i6, int i7) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f2574d = gVar;
        this.f2573c = i6;
    }

    @Override // w4.b
    public final void a() {
        this.f2574d.f2535k.getClass();
        synchronized (this.f2574d) {
            this.f2574d.f2546x.remove(Integer.valueOf(this.f2573c));
        }
    }
}
