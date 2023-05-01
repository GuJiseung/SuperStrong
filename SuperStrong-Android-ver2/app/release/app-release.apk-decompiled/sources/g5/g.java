package g5;

import g5.i;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class g implements c<Object, b<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f4230a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f4231b;

    public g(Type type, Executor executor) {
        this.f4230a = type;
        this.f4231b = executor;
    }

    @Override // g5.c
    public final Type a() {
        return this.f4230a;
    }

    @Override // g5.c
    public final Object b(t tVar) {
        Executor executor = this.f4231b;
        return executor == null ? tVar : new i.a(executor, tVar);
    }
}
