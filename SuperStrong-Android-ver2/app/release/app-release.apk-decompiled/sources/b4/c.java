package b4;

import a1.f0;
import s4.w;
import y3.x;
@g4.e(c = "com.superstrong.android.viewmodel.ChpasswdVModel$checkCurrentPassword$1", f = "ChpasswdVModel.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends g4.g implements k4.p<w, e4.d<? super c4.h>, Object> {

    /* renamed from: f  reason: collision with root package name */
    public int f2433f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e f2434g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f2435h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, String str, e4.d<? super c> dVar) {
        super(2, dVar);
        this.f2434g = eVar;
        this.f2435h = str;
    }

    @Override // k4.p
    public final Object e(w wVar, e4.d<? super c4.h> dVar) {
        return ((c) g(wVar, dVar)).i(c4.h.f2763a);
    }

    @Override // g4.a
    public final e4.d<c4.h> g(Object obj, e4.d<?> dVar) {
        return new c(this.f2434g, this.f2435h, dVar);
    }

    @Override // g4.a
    public final Object i(Object obj) {
        Integer num;
        f4.a aVar = f4.a.COROUTINE_SUSPENDED;
        int i6 = this.f2433f;
        e eVar = this.f2434g;
        if (i6 != 0) {
            if (i6 == 1) {
                f0.l(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f0.l(obj);
            y3.h hVar = eVar.f2440e;
            this.f2433f = 1;
            hVar.getClass();
            obj = y3.d.a(new y3.f(hVar, this.f2435h, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        y3.e eVar2 = (y3.e) ((x) obj).f6832a;
        androidx.lifecycle.s<Integer> sVar = eVar.f2439d;
        if (eVar2 != null) {
            num = new Integer(0);
        } else {
            num = new Integer(1);
        }
        sVar.j(num);
        Integer d6 = eVar.f2439d.d();
        if (d6 == null || d6.intValue() != 1) {
            eVar.f2441f.j(new Integer(2));
        }
        return c4.h.f2763a;
    }
}
