package e4;

import e4.e;
import k4.p;
/* loaded from: classes.dex */
public interface f {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e4.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0036a extends l4.g implements p<f, b, f> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0036a f3849c = new C0036a();

            public C0036a() {
                super(2);
            }

            @Override // k4.p
            public final f e(f fVar, b bVar) {
                e4.c cVar;
                f fVar2 = fVar;
                b bVar2 = bVar;
                l4.f.f(fVar2, "acc");
                l4.f.f(bVar2, "element");
                f minusKey = fVar2.minusKey(bVar2.getKey());
                g gVar = g.f3850b;
                if (minusKey != gVar) {
                    int i6 = e.f3847a;
                    e.a aVar = e.a.f3848b;
                    e eVar = (e) minusKey.get(aVar);
                    if (eVar == null) {
                        cVar = new e4.c(bVar2, minusKey);
                    } else {
                        f minusKey2 = minusKey.minusKey(aVar);
                        if (minusKey2 == gVar) {
                            return new e4.c(eVar, bVar2);
                        }
                        cVar = new e4.c(eVar, new e4.c(bVar2, minusKey2));
                    }
                    return cVar;
                }
                return bVar2;
            }
        }

        public static f a(f fVar, f fVar2) {
            l4.f.f(fVar2, "context");
            return fVar2 == g.f3850b ? fVar : (f) fVar2.fold(fVar, C0036a.f3849c);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends f {

        /* loaded from: classes.dex */
        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E a(b bVar, c<E> cVar) {
                l4.f.f(cVar, "key");
                if (l4.f.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static f b(b bVar, c<?> cVar) {
                l4.f.f(cVar, "key");
                return l4.f.a(bVar.getKey(), cVar) ? g.f3850b : bVar;
            }
        }

        @Override // e4.f
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: classes.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r5, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    f minusKey(c<?> cVar);

    f plus(f fVar);
}
