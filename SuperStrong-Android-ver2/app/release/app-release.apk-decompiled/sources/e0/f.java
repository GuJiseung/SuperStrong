package e0;
/* loaded from: classes.dex */
public final class f<T> extends e {

    /* renamed from: c  reason: collision with root package name */
    public final Object f3806c;

    public f(int i6) {
        super(i6);
        this.f3806c = new Object();
    }

    @Override // e0.e, e0.d
    public final boolean a(T t5) {
        boolean a6;
        synchronized (this.f3806c) {
            a6 = super.a(t5);
        }
        return a6;
    }

    @Override // e0.e, e0.d
    public final T b() {
        T t5;
        synchronized (this.f3806c) {
            t5 = (T) super.b();
        }
        return t5;
    }
}
