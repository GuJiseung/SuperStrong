package g5;

import javax.annotation.Nullable;
import v4.d;
/* loaded from: classes.dex */
public abstract class k<ResponseT, ReturnT> extends e0<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f4248a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f4249b;

    /* renamed from: c  reason: collision with root package name */
    public final f<v4.d0, ResponseT> f4250c;

    /* loaded from: classes.dex */
    public static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final g5.c<ResponseT, ReturnT> f4251d;

        public a(a0 a0Var, d.a aVar, f<v4.d0, ResponseT> fVar, g5.c<ResponseT, ReturnT> cVar) {
            super(a0Var, aVar, fVar);
            this.f4251d = cVar;
        }

        @Override // g5.k
        public final Object c(t tVar, Object[] objArr) {
            return this.f4251d.b(tVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final g5.c<ResponseT, g5.b<ResponseT>> f4252d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f4253e;

        public b(a0 a0Var, d.a aVar, f fVar, g5.c cVar) {
            super(a0Var, aVar, fVar);
            this.f4252d = cVar;
            this.f4253e = false;
        }

        @Override // g5.k
        public final Object c(t tVar, Object[] objArr) {
            g5.b bVar = (g5.b) this.f4252d.b(tVar);
            e4.d dVar = (e4.d) objArr[objArr.length - 1];
            try {
                if (this.f4253e) {
                    s4.g gVar = new s4.g(c0.n.g(dVar));
                    gVar.q(new n(bVar));
                    bVar.k(new p(gVar));
                    return gVar.n();
                }
                s4.g gVar2 = new s4.g(c0.n.g(dVar));
                gVar2.q(new m(bVar));
                bVar.k(new o(gVar2));
                return gVar2.n();
            } catch (Exception e6) {
                return s.a(e6, dVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final g5.c<ResponseT, g5.b<ResponseT>> f4254d;

        public c(a0 a0Var, d.a aVar, f<v4.d0, ResponseT> fVar, g5.c<ResponseT, g5.b<ResponseT>> cVar) {
            super(a0Var, aVar, fVar);
            this.f4254d = cVar;
        }

        @Override // g5.k
        public final Object c(t tVar, Object[] objArr) {
            g5.b bVar = (g5.b) this.f4254d.b(tVar);
            e4.d dVar = (e4.d) objArr[objArr.length - 1];
            try {
                s4.g gVar = new s4.g(c0.n.g(dVar));
                gVar.q(new q(bVar));
                bVar.k(new r(gVar));
                return gVar.n();
            } catch (Exception e6) {
                return s.a(e6, dVar);
            }
        }
    }

    public k(a0 a0Var, d.a aVar, f<v4.d0, ResponseT> fVar) {
        this.f4248a = a0Var;
        this.f4249b = aVar;
        this.f4250c = fVar;
    }

    @Override // g5.e0
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return (ReturnT) c(new t(this.f4248a, objArr, this.f4249b, this.f4250c), objArr);
    }

    @Nullable
    public abstract Object c(t tVar, Object[] objArr);
}
