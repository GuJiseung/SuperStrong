package s3;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class r extends androidx.activity.result.c {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Method f6051c;

    public r(Method method) {
        this.f6051c = method;
    }

    @Override // androidx.activity.result.c
    public final <T> T p(Class<T> cls) {
        androidx.activity.result.c.g(cls);
        return (T) this.f6051c.invoke(null, cls, Object.class);
    }
}
