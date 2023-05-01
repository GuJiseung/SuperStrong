package kotlinx.coroutines.internal;

import e4.f;
import s4.i1;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final a1.r f4973a = new a1.r(4, "NO_THREAD_ELEMENTS");

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements k4.p<Object, f.b, Object> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f4974c = new a();

        public a() {
            super(2);
        }

        @Override // k4.p
        public final Object e(Object obj, f.b bVar) {
            Integer num;
            int intValue;
            f.b bVar2 = bVar;
            if (bVar2 instanceof i1) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num == null) {
                    intValue = 1;
                } else {
                    intValue = num.intValue();
                }
                if (intValue == 0) {
                    return bVar2;
                }
                return Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l4.g implements k4.p<i1<?>, f.b, i1<?>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f4975c = new b();

        public b() {
            super(2);
        }

        @Override // k4.p
        public final i1<?> e(i1<?> i1Var, f.b bVar) {
            i1<?> i1Var2 = i1Var;
            f.b bVar2 = bVar;
            if (i1Var2 == null) {
                if (bVar2 instanceof i1) {
                    return (i1) bVar2;
                }
                return null;
            }
            return i1Var2;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l4.g implements k4.p<t, f.b, t> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f4976c = new c();

        public c() {
            super(2);
        }

        @Override // k4.p
        public final t e(t tVar, f.b bVar) {
            t tVar2 = tVar;
            f.b bVar2 = bVar;
            if (bVar2 instanceof i1) {
                i1<Object> i1Var = (i1) bVar2;
                String f6 = i1Var.f(tVar2.f4978a);
                int i6 = tVar2.f4981d;
                tVar2.f4979b[i6] = f6;
                tVar2.f4981d = i6 + 1;
                tVar2.f4980c[i6] = i1Var;
            }
            return tVar2;
        }
    }

    public static final void a(e4.f fVar, Object obj) {
        if (obj == f4973a) {
            return;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            i1<Object>[] i1VarArr = tVar.f4980c;
            int length = i1VarArr.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i6 = length - 1;
                i1<Object> i1Var = i1VarArr[length];
                l4.f.c(i1Var);
                i1Var.o(tVar.f4979b[length]);
                if (i6 >= 0) {
                    length = i6;
                } else {
                    return;
                }
            }
        } else {
            Object fold = fVar.fold(null, b.f4975c);
            if (fold != null) {
                ((i1) fold).o(obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static final Object b(e4.f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.fold(0, a.f4974c);
            l4.f.c(obj);
        }
        if (obj == 0) {
            return f4973a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new t(fVar, ((Number) obj).intValue()), c.f4976c);
        }
        return ((i1) obj).f(fVar);
    }
}
