package y3;
@g4.e(c = "com.superstrong.android.data.Repository$sendCode$job$1", f = "SignupModel.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends g4.g implements k4.l<e4.d<? super g5.b0<k>>, Object> {

    /* renamed from: f  reason: collision with root package name */
    public int f6822f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f6823g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ j f6824h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, j jVar, e4.d<? super t> dVar) {
        super(1, dVar);
        this.f6823g = wVar;
        this.f6824h = jVar;
    }

    @Override // k4.l
    public final Object f(e4.d<? super g5.b0<k>> dVar) {
        return new t(this.f6823g, this.f6824h, dVar).i(c4.h.f2763a);
    }

    @Override // g4.a
    public final Object i(Object obj) {
        f4.a aVar = f4.a.COROUTINE_SUSPENDED;
        int i6 = this.f6822f;
        if (i6 != 0) {
            if (i6 == 1) {
                a1.f0.l(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a1.f0.l(obj);
            b bVar = this.f6823g.f6831a;
            this.f6822f = 1;
            obj = bVar.i(this.f6824h, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
