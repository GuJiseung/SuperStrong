package t3;

import java.util.ArrayList;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class h extends x<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6157b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final q3.j f6158a;

    /* loaded from: classes.dex */
    public static class a implements y {
        @Override // q3.y
        public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
            if (aVar.f6586a == Object.class) {
                return new h(jVar);
            }
            return null;
        }
    }

    public h(q3.j jVar) {
        this.f6158a = jVar;
    }

    @Override // q3.x
    public final Object a(x3.a aVar) {
        int a6 = m.g.a(aVar.M());
        if (a6 == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.q()) {
                arrayList.add(a(aVar));
            }
            aVar.k();
            return arrayList;
        } else if (a6 == 2) {
            s3.m mVar = new s3.m();
            aVar.f();
            while (aVar.q()) {
                mVar.put(aVar.G(), a(aVar));
            }
            aVar.n();
            return mVar;
        } else if (a6 != 5) {
            if (a6 != 6) {
                if (a6 != 7) {
                    if (a6 == 8) {
                        aVar.I();
                        return null;
                    }
                    throw new IllegalStateException();
                }
                return Boolean.valueOf(aVar.w());
            }
            return Double.valueOf(aVar.x());
        } else {
            return aVar.K();
        }
    }

    @Override // q3.x
    public final void b(x3.c cVar, Object obj) {
        if (obj == null) {
            cVar.q();
            return;
        }
        Class<?> cls = obj.getClass();
        q3.j jVar = this.f6158a;
        jVar.getClass();
        x c6 = jVar.c(new w3.a(cls));
        if (c6 instanceof h) {
            cVar.h();
            cVar.n();
            return;
        }
        c6.b(cVar, obj);
    }
}
