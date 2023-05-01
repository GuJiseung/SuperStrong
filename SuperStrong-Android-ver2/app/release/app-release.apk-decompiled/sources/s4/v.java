package s4;

import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final List<u> f6109a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [q4.a] */
    static {
        Iterator c6 = b5.b.c();
        l4.f.f(c6, "<this>");
        q4.d dVar = new q4.d(c6);
        if (!(dVar instanceof q4.a)) {
            dVar = new q4.a(dVar);
        }
        f6109a = q4.c.q(dVar);
    }

    public static final void a(e4.f fVar, Throwable th) {
        Throwable runtimeException;
        for (u uVar : f6109a) {
            try {
                uVar.handleException(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    androidx.activity.k.f(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            androidx.activity.k.f(th, new e0(fVar));
            c4.h hVar = c4.h.f2763a;
        } catch (Throwable th3) {
            a1.f0.e(th3);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
