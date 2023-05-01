package e4;

import e4.f;
import e4.f.b;
import k4.l;
/* loaded from: classes.dex */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: b  reason: collision with root package name */
    public final l<f.b, E> f3842b;

    /* renamed from: c  reason: collision with root package name */
    public final f.c<?> f3843c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [k4.l<e4.f$b, E extends B>, k4.l<? super e4.f$b, ? extends E extends B>] */
    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        l4.f.f(cVar, "baseKey");
        this.f3842b = lVar;
        this.f3843c = cVar instanceof b ? (f.c<B>) ((b) cVar).f3843c : cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Le4/f$b;)TE; */
    public final f.b a(f.b bVar) {
        l4.f.f(bVar, "element");
        return (f.b) this.f3842b.f(bVar);
    }
}
