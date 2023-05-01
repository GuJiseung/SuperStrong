package androidx.lifecycle;

import java.io.Closeable;
import s4.u0;
/* loaded from: classes.dex */
public final class c implements Closeable, s4.w {

    /* renamed from: b  reason: collision with root package name */
    public final e4.f f1724b;

    public c(e4.f fVar) {
        l4.f.f(fVar, "context");
        this.f1724b = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u0 u0Var = (u0) this.f1724b.get(u0.b.f6108b);
        if (u0Var == null) {
            return;
        }
        u0Var.w(null);
    }

    @Override // s4.w
    public final e4.f h() {
        return this.f1724b;
    }
}
