package s4;
/* loaded from: classes.dex */
public final class k1 extends t {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f6074c = 0;

    static {
        new k1();
    }

    @Override // s4.t
    public final void h(e4.f fVar, Runnable runnable) {
        if (((n1) fVar.get(n1.f6093b)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // s4.t
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
