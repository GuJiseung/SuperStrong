package y3;
@g4.e(c = "com.superstrong.android.data.Repository$signupRequest$job$1", f = "SignupModel.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v extends g4.g implements k4.l<e4.d<? super g5.b0<k>>, Object> {

    /* renamed from: f  reason: collision with root package name */
    public int f6828f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f6829g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ j f6830h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, j jVar, e4.d<? super v> dVar) {
        super(1, dVar);
        this.f6829g = wVar;
        this.f6830h = jVar;
    }

    @Override // k4.l
    public final Object f(e4.d<? super g5.b0<k>> dVar) {
        return new v(this.f6829g, this.f6830h, dVar).i(c4.h.f2763a);
    }

    @Override // g4.a
    public final Object i(Object obj) {
        f4.a aVar = f4.a.COROUTINE_SUSPENDED;
        int i6 = this.f6828f;
        if (i6 != 0) {
            if (i6 == 1) {
                a1.f0.l(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a1.f0.l(obj);
            b bVar = this.f6829g.f6831a;
            this.f6828f = 1;
            obj = bVar.g(this.f6830h, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
