package s4;
/* loaded from: classes.dex */
public final class l1<T> extends kotlinx.coroutines.internal.o<T> {

    /* renamed from: e  reason: collision with root package name */
    public final ThreadLocal<c4.c<e4.f, Object>> f6078e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l1(e4.d r3, e4.f r4) {
        /*
            r2 = this;
            s4.m1 r0 = s4.m1.f6090b
            e4.f$b r1 = r4.get(r0)
            if (r1 != 0) goto Lc
            e4.f r4 = r4.plus(r0)
        Lc:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.f6078e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.l1.<init>(e4.d, e4.f):void");
    }

    @Override // kotlinx.coroutines.internal.o, s4.a
    public final void V(Object obj) {
        ThreadLocal<c4.c<e4.f, Object>> threadLocal = this.f6078e;
        c4.c<e4.f, Object> cVar = threadLocal.get();
        if (cVar != null) {
            kotlinx.coroutines.internal.q.a(cVar.f2755b, cVar.f2756c);
            threadLocal.set(null);
        }
        Object d6 = kotlinx.coroutines.internal.f.d(obj);
        e4.d<T> dVar = this.f4971d;
        e4.f b6 = dVar.b();
        Object b7 = kotlinx.coroutines.internal.q.b(b6, null);
        l1<?> b8 = b7 != kotlinx.coroutines.internal.q.f4973a ? r.b(dVar, b6, b7) : null;
        try {
            dVar.d(d6);
            c4.h hVar = c4.h.f2763a;
        } finally {
            if (b8 == null || b8.X()) {
                kotlinx.coroutines.internal.q.a(b6, b7);
            }
        }
    }

    public final boolean X() {
        ThreadLocal<c4.c<e4.f, Object>> threadLocal = this.f6078e;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set(null);
        return true;
    }
}
