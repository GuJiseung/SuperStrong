package b4;

import a1.f0;
import s4.w;
import y3.a0;
import y3.b0;
@g4.e(c = "com.superstrong.android.viewmodel.SignupVModel$signupRequest$1", f = "SignupVModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q extends g4.g implements k4.p<w, e4.d<? super c4.h>, Object> {

    /* renamed from: f  reason: collision with root package name */
    public int f2480f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r f2481g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a0 f2482h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, a0 a0Var, e4.d<? super q> dVar) {
        super(2, dVar);
        this.f2481g = rVar;
        this.f2482h = a0Var;
    }

    @Override // k4.p
    public final Object e(w wVar, e4.d<? super c4.h> dVar) {
        return ((q) g(wVar, dVar)).i(c4.h.f2763a);
    }

    @Override // g4.a
    public final e4.d<c4.h> g(Object obj, e4.d<?> dVar) {
        return new q(this.f2481g, this.f2482h, dVar);
    }

    @Override // g4.a
    public final Object i(Object obj) {
        f4.a aVar = f4.a.COROUTINE_SUSPENDED;
        int i6 = this.f2480f;
        r rVar = this.f2481g;
        if (i6 != 0) {
            if (i6 == 1) {
                f0.l(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f0.l(obj);
            y3.w wVar = rVar.f2488i;
            this.f2480f = 1;
            obj = wVar.c(this.f2482h, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        b0 b0Var = (b0) obj;
        rVar.f2486g.j(new Integer(8));
        Integer d6 = rVar.f2486g.d();
        if (d6 != null && d6.intValue() == 0) {
            rVar.f2483d.j(new Integer(3));
        }
        rVar.f2487h.j(Boolean.FALSE);
        return c4.h.f2763a;
    }
}
