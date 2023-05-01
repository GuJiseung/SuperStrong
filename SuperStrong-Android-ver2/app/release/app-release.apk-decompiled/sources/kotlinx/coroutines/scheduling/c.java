package kotlinx.coroutines.scheduling;
/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final c f5003d = new c();

    public c() {
        super(k.f5011b, k.f5012c, k.f5013d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // s4.t
    public final String toString() {
        return "Dispatchers.Default";
    }
}
