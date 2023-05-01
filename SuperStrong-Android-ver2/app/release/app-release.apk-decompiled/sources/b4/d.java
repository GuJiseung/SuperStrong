package b4;

import a1.f0;
import s4.w;
import y3.x;
@g4.e(c = "com.superstrong.android.viewmodel.ChpasswdVModel$newpass$1", f = "ChpasswdVModel.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends g4.g implements k4.p<w, e4.d<? super c4.h>, Object> {

    /* renamed from: f  reason: collision with root package name */
    public int f2436f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e f2437g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f2438h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, e4.d<? super d> dVar) {
        super(2, dVar);
        this.f2437g = eVar;
        this.f2438h = str;
    }

    @Override // k4.p
    public final Object e(w wVar, e4.d<? super c4.h> dVar) {
        return ((d) g(wVar, dVar)).i(c4.h.f2763a);
    }

    @Override // g4.a
    public final e4.d<c4.h> g(Object obj, e4.d<?> dVar) {
        return new d(this.f2437g, this.f2438h, dVar);
    }

    @Override // g4.a
    public final Object i(Object obj) {
        f4.a aVar = f4.a.COROUTINE_SUSPENDED;
        int i6 = this.f2436f;
        if (i6 != 0) {
            if (i6 == 1) {
                f0.l(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f0.l(obj);
            y3.h hVar = this.f2437g.f2440e;
            this.f2436f = 1;
            hVar.getClass();
            obj = y3.d.a(new y3.g(hVar, this.f2438h, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        y3.e eVar = (y3.e) ((x) obj).f6832a;
        return c4.h.f2763a;
    }
}
