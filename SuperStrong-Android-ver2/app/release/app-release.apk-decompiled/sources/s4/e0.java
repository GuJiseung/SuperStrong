package s4;
/* loaded from: classes.dex */
public final class e0 extends RuntimeException {

    /* renamed from: b  reason: collision with root package name */
    public final e4.f f6057b;

    public e0(e4.f fVar) {
        this.f6057b = fVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f6057b.toString();
    }
}
