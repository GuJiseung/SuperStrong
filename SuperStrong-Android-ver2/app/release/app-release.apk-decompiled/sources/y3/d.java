package y3;

import android.util.Log;
import e4.e;
import s4.l1;
import s4.u0;
import y3.x;
/* loaded from: classes.dex */
public abstract class d {

    @g4.e(c = "com.superstrong.android.data.BaseRepo$safeApiCall$2", f = "BaseRepo.kt", l = {35}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends g4.g implements k4.p<s4.w, e4.d<? super x<Object>>, Object> {

        /* renamed from: f  reason: collision with root package name */
        public int f6766f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ k4.l<e4.d<? super g5.b0<Object>>, Object> f6767g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(k4.l<? super e4.d<? super g5.b0<Object>>, ? extends Object> lVar, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f6767g = lVar;
        }

        @Override // k4.p
        public final Object e(s4.w wVar, e4.d<? super x<Object>> dVar) {
            return ((a) g(wVar, dVar)).i(c4.h.f2763a);
        }

        @Override // g4.a
        public final e4.d<c4.h> g(Object obj, e4.d<?> dVar) {
            return new a(this.f6767g, dVar);
        }

        @Override // g4.a
        public final Object i(Object obj) {
            f4.a aVar = f4.a.COROUTINE_SUSPENDED;
            int i6 = this.f6766f;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        a1.f0.l(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a1.f0.l(obj);
                    k4.l<e4.d<? super g5.b0<Object>>, Object> lVar = this.f6767g;
                    this.f6766f = 1;
                    obj = lVar.f(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                g5.b0 b0Var = (g5.b0) obj;
                if (b0Var.a()) {
                    T t5 = b0Var.f4212b;
                    l4.f.c(t5);
                    return new x.b(t5);
                }
                Log.d("safeApicall", "not successful");
                return new x.a();
            } catch (Exception unused) {
                Log.d("safeApicall", "something wrong");
                return new x.a();
            }
        }
    }

    public static Object a(k4.l lVar, e4.d dVar) {
        e4.f a6;
        kotlinx.coroutines.scheduling.b bVar = s4.h0.f6068b;
        a aVar = new a(lVar, null);
        e4.f b6 = dVar.b();
        if (!((Boolean) bVar.fold(Boolean.FALSE, s4.s.f6101c)).booleanValue()) {
            a6 = b6.plus(bVar);
        } else {
            a6 = s4.r.a(b6, bVar, false);
        }
        u0 u0Var = (u0) a6.get(u0.b.f6108b);
        if (u0Var == null || u0Var.c()) {
            if (a6 == b6) {
                kotlinx.coroutines.internal.o oVar = new kotlinx.coroutines.internal.o(dVar, a6);
                return c.b.b(oVar, oVar, aVar);
            }
            e.a aVar2 = e.a.f3848b;
            if (l4.f.a(a6.get(aVar2), b6.get(aVar2))) {
                l1 l1Var = new l1(dVar, a6);
                Object b7 = kotlinx.coroutines.internal.q.b(a6, null);
                try {
                    return c.b.b(l1Var, l1Var, aVar);
                } finally {
                    kotlinx.coroutines.internal.q.a(a6, b7);
                }
            }
            s4.f0 f0Var = new s4.f0(dVar, a6);
            c0.n.i(aVar, f0Var, f0Var);
            return f0Var.X();
        }
        throw u0Var.s();
    }
}
