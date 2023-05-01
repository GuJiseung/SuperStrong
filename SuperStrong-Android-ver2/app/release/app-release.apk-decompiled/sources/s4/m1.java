package s4;

import e4.f;
/* loaded from: classes.dex */
public final class m1 implements f.b, f.c<m1> {

    /* renamed from: b  reason: collision with root package name */
    public static final m1 f6090b = new m1();

    @Override // e4.f
    public final <R> R fold(R r5, k4.p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.e(r5, this);
    }

    @Override // e4.f.b, e4.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // e4.f.b
    public final f.c<?> getKey() {
        return this;
    }

    @Override // e4.f
    public final e4.f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // e4.f
    public final e4.f plus(e4.f fVar) {
        l4.f.f(fVar, "context");
        return f.a.a(this, fVar);
    }
}
