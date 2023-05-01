package f5;
/* loaded from: classes.dex */
public abstract class i implements x {

    /* renamed from: b  reason: collision with root package name */
    public final x f3984b;

    public i(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f3984b = xVar;
    }

    @Override // f5.x
    public final z b() {
        return this.f3984b.b();
    }

    @Override // f5.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3984b.close();
    }

    @Override // f5.x, java.io.Flushable
    public void flush() {
        this.f3984b.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f3984b.toString() + ")";
    }
}
