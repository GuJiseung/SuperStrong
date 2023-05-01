package e4;

import e4.f;
import k4.p;
/* loaded from: classes.dex */
public abstract class a implements f.b {
    private final f.c<?> key;

    public a(f.c<?> cVar) {
        l4.f.f(cVar, "key");
        this.key = cVar;
    }

    @Override // e4.f
    public <R> R fold(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        l4.f.f(pVar, "operation");
        return pVar.e(r5, this);
    }

    @Override // e4.f.b, e4.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // e4.f.b
    public f.c<?> getKey() {
        return this.key;
    }

    @Override // e4.f
    public f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // e4.f
    public f plus(f fVar) {
        l4.f.f(fVar, "context");
        return f.a.a(this, fVar);
    }
}
