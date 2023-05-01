package g5;

import c4.d;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class o implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s4.f f4259a;

    public o(s4.g gVar) {
        this.f4259a = gVar;
    }

    @Override // g5.d
    public final void a(b<Object> bVar, Throwable th) {
        l4.f.g(bVar, "call");
        l4.f.g(th, "t");
        this.f4259a.d(a1.f0.e(th));
    }

    @Override // g5.d
    public final void b(b<Object> bVar, b0<Object> b0Var) {
        d.a e6;
        l4.f.g(bVar, "call");
        l4.f.g(b0Var, "response");
        boolean a6 = b0Var.a();
        s4.f fVar = this.f4259a;
        if (a6) {
            Object obj = b0Var.f4212b;
            if (obj == null) {
                Object cast = l.class.cast(bVar.n().f6560e.get(l.class));
                if (cast != null) {
                    StringBuilder sb = new StringBuilder("Response from ");
                    Method method = ((l) cast).f4255a;
                    l4.f.b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    l4.f.b(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    e6 = a1.f0.e(new c4.b(sb.toString()));
                } else {
                    c4.b bVar2 = new c4.b();
                    l4.f.i(l4.f.class.getName(), bVar2);
                    throw bVar2;
                }
            } else {
                fVar.d(obj);
                return;
            }
        } else {
            e6 = a1.f0.e(new j(b0Var));
        }
        fVar.d(e6);
    }
}
