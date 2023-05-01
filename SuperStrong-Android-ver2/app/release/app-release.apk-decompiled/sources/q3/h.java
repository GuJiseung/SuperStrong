package q3;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class h extends x<AtomicLong> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f5831a;

    public h(x xVar) {
        this.f5831a = xVar;
    }

    @Override // q3.x
    public final AtomicLong a(x3.a aVar) {
        return new AtomicLong(((Number) this.f5831a.a(aVar)).longValue());
    }

    @Override // q3.x
    public final void b(x3.c cVar, AtomicLong atomicLong) {
        this.f5831a.b(cVar, Long.valueOf(atomicLong.get()));
    }
}
