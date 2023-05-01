package s3;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class p extends androidx.activity.result.c {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Method f6047c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f6048d;

    public p(Object obj, Method method) {
        this.f6047c = method;
        this.f6048d = obj;
    }

    @Override // androidx.activity.result.c
    public final <T> T p(Class<T> cls) {
        androidx.activity.result.c.g(cls);
        return (T) this.f6047c.invoke(this.f6048d, cls);
    }
}
