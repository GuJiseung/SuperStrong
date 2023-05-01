package f5;
/* loaded from: classes.dex */
public abstract class j implements y {

    /* renamed from: b  reason: collision with root package name */
    public final y f3985b;

    public j(y yVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f3985b = yVar;
    }

    @Override // f5.y
    public final z b() {
        return this.f3985b.b();
    }

    @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3985b.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f3985b.toString() + ")";
    }
}
