package s4;
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<l0> f6071a = new ThreadLocal<>();

    public static l0 a() {
        ThreadLocal<l0> threadLocal = f6071a;
        l0 l0Var = threadLocal.get();
        if (l0Var == null) {
            c cVar = new c(Thread.currentThread());
            threadLocal.set(cVar);
            return cVar;
        }
        return l0Var;
    }
}
