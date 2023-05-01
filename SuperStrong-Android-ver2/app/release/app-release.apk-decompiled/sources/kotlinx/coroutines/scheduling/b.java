package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.p;
import s4.o0;
/* loaded from: classes.dex */
public final class b extends o0 implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final b f5001c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.d f5002d;

    static {
        l lVar = l.f5017c;
        int i6 = p.f4972a;
        if (64 >= i6) {
            i6 = 64;
        }
        boolean z5 = false;
        int d6 = c.b.d("kotlinx.coroutines.io.parallelism", i6, 0, 0, 12);
        lVar.getClass();
        if (d6 >= 1) {
            z5 = true;
        }
        if (z5) {
            f5002d = new kotlinx.coroutines.internal.d(lVar, d6);
            return;
        }
        throw new IllegalArgumentException(l4.f.j(Integer.valueOf(d6), "Expected positive parallelism level, but got ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(e4.g.f3850b, runnable);
    }

    @Override // s4.t
    public final void h(e4.f fVar, Runnable runnable) {
        f5002d.h(fVar, runnable);
    }

    @Override // s4.t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
