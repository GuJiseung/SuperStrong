package kotlinx.coroutines.internal;

import a1.f0;
import e4.e;
import java.util.TreeSet;
import s4.c0;
import s4.g0;
import s4.g1;
import s4.h0;
import s4.l1;
import s4.w;
/* loaded from: classes.dex */
public class f implements s3.n {

    /* renamed from: b  reason: collision with root package name */
    public static final a1.r f4954b = new a1.r(4, "CONDITION_FALSE");

    public static c0 a(w wVar, k4.p pVar) {
        e4.f a6 = s4.r.a(wVar.h(), e4.g.f3850b, true);
        kotlinx.coroutines.scheduling.c cVar = h0.f6067a;
        if (a6 != cVar && a6.get(e.a.f3848b) == null) {
            a6 = a6.plus(cVar);
        }
        c0 c0Var = new c0(a6, true);
        c0Var.W(1, c0Var, pVar);
        return c0Var;
    }

    public static void b(w wVar, k4.p pVar) {
        e4.f a6 = s4.r.a(wVar.h(), e4.g.f3850b, true);
        kotlinx.coroutines.scheduling.c cVar = h0.f6067a;
        if (a6 != cVar && a6.get(e.a.f3848b) == null) {
            a6 = a6.plus(cVar);
        }
        s4.a g1Var = new g1(a6, true);
        g1Var.W(1, g1Var, pVar);
    }

    public static boolean c(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final Object d(Object obj) {
        return obj instanceof s4.n ? f0.e(((s4.n) obj).f6092a) : obj;
    }

    public static final void f(g0 g0Var, e4.d dVar, boolean z5) {
        Object i6 = g0Var.i();
        Throwable f6 = g0Var.f(i6);
        Object e6 = f6 != null ? f0.e(f6) : g0Var.g(i6);
        if (!z5) {
            dVar.d(e6);
            return;
        }
        c cVar = (c) dVar;
        e4.d<T> dVar2 = cVar.f4946f;
        e4.f b6 = dVar2.b();
        Object b7 = q.b(b6, cVar.f4948h);
        l1<?> b8 = b7 != q.f4973a ? s4.r.b(dVar2, b6, b7) : null;
        try {
            cVar.f4946f.d(e6);
            c4.h hVar = c4.h.f2763a;
        } finally {
            if (b8 == null || b8.X()) {
                q.a(b6, b7);
            }
        }
    }

    @Override // s3.n
    public Object e() {
        return new TreeSet();
    }
}
