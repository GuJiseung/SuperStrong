package y3;
@g4.e(c = "com.superstrong.android.data.ChpasswdModel$checkPassword$2", f = "ChpasswdModel.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends g4.g implements k4.l<e4.d<? super g5.b0<e>>, Object> {

    /* renamed from: f  reason: collision with root package name */
    public int f6770f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f6771g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f6772h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, String str, e4.d<? super f> dVar) {
        super(1, dVar);
        this.f6771g = hVar;
        this.f6772h = str;
    }

    @Override // k4.l
    public final Object f(e4.d<? super g5.b0<e>> dVar) {
        return new f(this.f6771g, this.f6772h, dVar).i(c4.h.f2763a);
    }

    @Override // g4.a
    public final Object i(Object obj) {
        f4.a aVar = f4.a.COROUTINE_SUSPENDED;
        int i6 = this.f6770f;
        if (i6 != 0) {
            if (i6 == 1) {
                a1.f0.l(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a1.f0.l(obj);
            b bVar = this.f6771g.f6782a;
            p pVar = new p(this.f6772h);
            this.f6770f = 1;
            obj = bVar.c(pVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
