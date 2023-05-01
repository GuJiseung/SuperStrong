package b4;

import a1.f0;
import s4.w;
import y3.e0;
@g4.e(c = "com.superstrong.android.viewmodel.SignupVModel$sendCode$1", f = "SignupVModel.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p extends g4.g implements k4.p<w, e4.d<? super c4.h>, Object> {

    /* renamed from: f  reason: collision with root package name */
    public r f2476f;

    /* renamed from: g  reason: collision with root package name */
    public int f2477g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r f2478h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ y3.a f2479i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, y3.a aVar, e4.d<? super p> dVar) {
        super(2, dVar);
        this.f2478h = rVar;
        this.f2479i = aVar;
    }

    @Override // k4.p
    public final Object e(w wVar, e4.d<? super c4.h> dVar) {
        return ((p) g(wVar, dVar)).i(c4.h.f2763a);
    }

    @Override // g4.a
    public final e4.d<c4.h> g(Object obj, e4.d<?> dVar) {
        return new p(this.f2478h, this.f2479i, dVar);
    }

    @Override // g4.a
    public final Object i(Object obj) {
        r rVar;
        f4.a aVar = f4.a.COROUTINE_SUSPENDED;
        int i6 = this.f2477g;
        r rVar2 = this.f2478h;
        if (i6 != 0) {
            if (i6 == 1) {
                rVar = this.f2476f;
                f0.l(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f0.l(obj);
            y3.w wVar = rVar2.f2488i;
            this.f2476f = rVar2;
            this.f2477g = 1;
            obj = wVar.b(this.f2479i, this);
            if (obj == aVar) {
                return aVar;
            }
            rVar = rVar2;
        }
        rVar.f2489j = (e0) obj;
        rVar2.f2490k.j(new Integer(-1));
        Integer d6 = rVar2.f2490k.d();
        if (d6 != null && d6.intValue() == 1) {
            rVar2.f2483d.j(new Integer(4));
        }
        rVar2.f2487h.j(Boolean.FALSE);
        return c4.h.f2763a;
    }
}
