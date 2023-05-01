package t3;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import q3.x;
import t3.j;
/* loaded from: classes.dex */
public final class n<T> extends x<T> {

    /* renamed from: a  reason: collision with root package name */
    public final q3.j f6185a;

    /* renamed from: b  reason: collision with root package name */
    public final x<T> f6186b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f6187c;

    public n(q3.j jVar, x<T> xVar, Type type) {
        this.f6185a = jVar;
        this.f6186b = xVar;
        this.f6187c = type;
    }

    @Override // q3.x
    public final T a(x3.a aVar) {
        return this.f6186b.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // q3.x
    public final void b(x3.c cVar, T t5) {
        Class<?> cls;
        ?? r0 = this.f6187c;
        if (t5 != null && (r0 == Object.class || (r0 instanceof TypeVariable) || (r0 instanceof Class))) {
            cls = t5.getClass();
        } else {
            cls = r0;
        }
        x<T> xVar = this.f6186b;
        if (cls != r0) {
            x<T> c6 = this.f6185a.c(new w3.a<>(cls));
            if (!(c6 instanceof j.a) || (xVar instanceof j.a)) {
                xVar = c6;
            }
        }
        xVar.b(cVar, t5);
    }
}
