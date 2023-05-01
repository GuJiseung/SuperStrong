package g5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class c0 implements InvocationHandler {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d0 f4217d;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f4216c = y3.b.class;

    /* renamed from: a  reason: collision with root package name */
    public final y f4214a = y.f4326c;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f4215b = new Object[0];

    public c0(d0 d0Var) {
        this.f4217d = d0Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    @Nullable
    public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
        boolean z5;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f4215b;
        }
        y yVar = this.f4214a;
        if (yVar.f4327a && method.isDefault()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return yVar.b(method, this.f4216c, obj, objArr);
        }
        return this.f4217d.b(method).a(objArr);
    }
}
