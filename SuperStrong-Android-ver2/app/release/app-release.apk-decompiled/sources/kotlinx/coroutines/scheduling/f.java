package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import s4.o0;
/* loaded from: classes.dex */
public class f extends o0 {

    /* renamed from: c  reason: collision with root package name */
    public final a f5005c;

    public f(int i6, int i7, long j5) {
        this.f5005c = new a(i6, i7, j5, "DefaultDispatcher");
    }

    @Override // s4.t
    public final void h(e4.f fVar, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f4982i;
        this.f5005c.f(runnable, k.f5015f, false);
    }
}
