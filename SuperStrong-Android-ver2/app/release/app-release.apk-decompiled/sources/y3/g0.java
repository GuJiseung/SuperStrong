package y3;
@g4.e(c = "com.superstrong.android.data.WalletRepo$getBalance$job$1", f = "WalletRepo.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g0 extends g4.g implements k4.l<e4.d<? super g5.b0<k>>, Object> {

    /* renamed from: f  reason: collision with root package name */
    public int f6779f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j0 f6780g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f6781h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, i iVar, e4.d<? super g0> dVar) {
        super(1, dVar);
        this.f6780g = j0Var;
        this.f6781h = iVar;
    }

    @Override // k4.l
    public final Object f(e4.d<? super g5.b0<k>> dVar) {
        return new g0(this.f6780g, this.f6781h, dVar).i(c4.h.f2763a);
    }

    @Override // g4.a
    public final Object i(Object obj) {
        f4.a aVar = f4.a.COROUTINE_SUSPENDED;
        int i6 = this.f6779f;
        if (i6 != 0) {
            if (i6 == 1) {
                a1.f0.l(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a1.f0.l(obj);
            b bVar = this.f6780g.f6792a;
            this.f6779f = 1;
            obj = bVar.b(this.f6781h, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
