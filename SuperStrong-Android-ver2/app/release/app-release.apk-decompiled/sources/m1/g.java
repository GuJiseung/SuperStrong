package m1;

import k1.m;
import k1.w;
import m1.h;
/* loaded from: classes.dex */
public final class g extends e2.g<i1.f, w<?>> implements h {

    /* renamed from: d  reason: collision with root package name */
    public h.a f5254d;

    public g(long j5) {
        super(j5);
    }

    @Override // e2.g
    public final int b(w<?> wVar) {
        w<?> wVar2 = wVar;
        if (wVar2 == null) {
            return 1;
        }
        return wVar2.c();
    }

    @Override // e2.g
    public final void c(i1.f fVar, w<?> wVar) {
        w<?> wVar2 = wVar;
        h.a aVar = this.f5254d;
        if (aVar != null && wVar2 != null) {
            ((m) aVar).f4833e.a(wVar2, true);
        }
    }
}
