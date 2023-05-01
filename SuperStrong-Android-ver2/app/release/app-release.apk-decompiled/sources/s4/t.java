package s4;

import e4.e;
import e4.f;
/* loaded from: classes.dex */
public abstract class t extends e4.a implements e4.e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6103b = new a();

    /* loaded from: classes.dex */
    public static final class a extends e4.b<e4.e, t> {

        /* renamed from: s4.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0090a extends l4.g implements k4.l<f.b, t> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0090a f6104c = new C0090a();

            public C0090a() {
                super(1);
            }

            @Override // k4.l
            public final t f(f.b bVar) {
                f.b bVar2 = bVar;
                if (bVar2 instanceof t) {
                    return (t) bVar2;
                }
                return null;
            }
        }

        public a() {
            super(e.a.f3848b, C0090a.f6104c);
        }
    }

    public t() {
        super(e.a.f3848b);
    }

    @Override // e4.e
    public final void E(e4.d<?> dVar) {
        ((kotlinx.coroutines.internal.c) dVar).l();
    }

    public boolean G() {
        return !(this instanceof k1);
    }

    @Override // e4.a, e4.f.b, e4.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        boolean z5;
        l4.f.f(cVar, "key");
        if (cVar instanceof e4.b) {
            e4.b bVar = (e4.b) cVar;
            f.c<?> key = getKey();
            l4.f.f(key, "key");
            if (key != bVar && bVar.f3843c != key) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                E e6 = (E) bVar.a(this);
                if (e6 instanceof f.b) {
                    return e6;
                }
            }
        } else if (e.a.f3848b == cVar) {
            return this;
        }
        return null;
    }

    public abstract void h(e4.f fVar, Runnable runnable);

    @Override // e4.a, e4.f
    public final e4.f minusKey(f.c<?> cVar) {
        boolean z5;
        l4.f.f(cVar, "key");
        boolean z6 = cVar instanceof e4.b;
        e4.g gVar = e4.g.f3850b;
        if (z6) {
            e4.b bVar = (e4.b) cVar;
            f.c<?> key = getKey();
            l4.f.f(key, "key");
            if (key != bVar && bVar.f3843c != key) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5 && bVar.a(this) != null) {
                return gVar;
            }
        } else if (e.a.f3848b == cVar) {
            return gVar;
        }
        return this;
    }

    @Override // e4.e
    public final kotlinx.coroutines.internal.c p(g4.c cVar) {
        return new kotlinx.coroutines.internal.c(this, cVar);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + y.a(this);
    }
}
