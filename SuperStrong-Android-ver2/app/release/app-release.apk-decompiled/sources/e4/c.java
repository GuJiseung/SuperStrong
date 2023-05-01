package e4;

import e4.f;
import java.io.Serializable;
import k4.p;
/* loaded from: classes.dex */
public final class c implements f, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final f f3844b;

    /* renamed from: c  reason: collision with root package name */
    public final f.b f3845c;

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements p<String, f.b, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f3846c = new a();

        public a() {
            super(2);
        }

        @Override // k4.p
        public final String e(String str, f.b bVar) {
            boolean z5;
            String str2 = str;
            f.b bVar2 = bVar;
            l4.f.f(str2, "acc");
            l4.f.f(bVar2, "element");
            if (str2.length() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public c(f.b bVar, f fVar) {
        l4.f.f(fVar, "left");
        l4.f.f(bVar, "element");
        this.f3844b = fVar;
        this.f3845c = bVar;
    }

    public final boolean equals(Object obj) {
        boolean z5;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i6 = 2;
            c cVar2 = cVar;
            int i7 = 2;
            while (true) {
                f fVar = cVar2.f3844b;
                if (fVar instanceof c) {
                    cVar2 = (c) fVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    break;
                }
                i7++;
            }
            c cVar3 = this;
            while (true) {
                f fVar2 = cVar3.f3844b;
                if (fVar2 instanceof c) {
                    cVar3 = (c) fVar2;
                } else {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    break;
                }
                i6++;
            }
            if (i7 != i6) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                f.b bVar = cVar4.f3845c;
                if (!l4.f.a(cVar.get(bVar.getKey()), bVar)) {
                    z5 = false;
                    break;
                }
                f fVar3 = cVar4.f3844b;
                if (fVar3 instanceof c) {
                    cVar4 = (c) fVar3;
                } else {
                    l4.f.d(fVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    f.b bVar2 = (f.b) fVar3;
                    z5 = l4.f.a(cVar.get(bVar2.getKey()), bVar2);
                    break;
                }
            }
            if (!z5) {
                return false;
            }
        }
        return true;
    }

    @Override // e4.f
    public final <R> R fold(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.e((Object) this.f3844b.fold(r5, pVar), this.f3845c);
    }

    @Override // e4.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        l4.f.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e6 = (E) cVar2.f3845c.get(cVar);
            if (e6 != null) {
                return e6;
            }
            f fVar = cVar2.f3844b;
            if (!(fVar instanceof c)) {
                return (E) fVar.get(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public final int hashCode() {
        return this.f3845c.hashCode() + this.f3844b.hashCode();
    }

    @Override // e4.f
    public final f minusKey(f.c<?> cVar) {
        l4.f.f(cVar, "key");
        f.b bVar = this.f3845c;
        f.b bVar2 = bVar.get(cVar);
        f fVar = this.f3844b;
        if (bVar2 != null) {
            return fVar;
        }
        f minusKey = fVar.minusKey(cVar);
        return minusKey == fVar ? this : minusKey == g.f3850b ? bVar : new c(bVar, minusKey);
    }

    @Override // e4.f
    public final f plus(f fVar) {
        return f.a.a(this, fVar);
    }

    public final String toString() {
        return "[" + ((String) fold("", a.f3846c)) + ']';
    }
}
