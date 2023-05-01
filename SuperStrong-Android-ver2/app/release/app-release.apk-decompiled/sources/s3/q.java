package s3;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class q extends androidx.activity.result.c {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Method f6049c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6050d;

    public q(int i6, Method method) {
        this.f6049c = method;
        this.f6050d = i6;
    }

    @Override // androidx.activity.result.c
    public final <T> T p(Class<T> cls) {
        androidx.activity.result.c.g(cls);
        return (T) this.f6049c.invoke(null, cls, Integer.valueOf(this.f6050d));
    }
}
