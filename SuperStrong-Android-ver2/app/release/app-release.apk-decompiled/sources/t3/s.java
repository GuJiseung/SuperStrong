package t3;

import q3.u;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class s implements y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f6223b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f6224c;

    /* loaded from: classes.dex */
    public class a extends x<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Class f6225a;

        public a(Class cls) {
            this.f6225a = cls;
        }

        @Override // q3.x
        public final Object a(x3.a aVar) {
            Object a6 = s.this.f6224c.a(aVar);
            if (a6 != null) {
                Class cls = this.f6225a;
                if (!cls.isInstance(a6)) {
                    throw new u("Expected a " + cls.getName() + " but was " + a6.getClass().getName());
                }
            }
            return a6;
        }

        @Override // q3.x
        public final void b(x3.c cVar, Object obj) {
            s.this.f6224c.b(cVar, obj);
        }
    }

    public s(Class cls, x xVar) {
        this.f6223b = cls;
        this.f6224c = xVar;
    }

    @Override // q3.y
    public final <T2> x<T2> a(q3.j jVar, w3.a<T2> aVar) {
        Class<? super T2> cls = aVar.f6586a;
        if (!this.f6223b.isAssignableFrom(cls)) {
            return null;
        }
        return new a(cls);
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f6223b.getName() + ",adapter=" + this.f6224c + "]";
    }
}
