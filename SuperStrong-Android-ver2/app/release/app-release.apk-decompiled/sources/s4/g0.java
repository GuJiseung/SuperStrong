package s4;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract class g0<T> extends kotlinx.coroutines.scheduling.g {

    /* renamed from: d  reason: collision with root package name */
    public int f6065d;

    public g0(int i6) {
        this.f6065d = i6;
    }

    public void c(Object obj, CancellationException cancellationException) {
    }

    public abstract e4.d<T> e();

    public Throwable f(Object obj) {
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar == null) {
            return null;
        }
        return nVar.f6092a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            androidx.activity.k.f(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        l4.f.c(th);
        c0.n.f(e().b(), new x("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        r6 = (s4.u0) r6.get(s4.u0.b.f6108b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            kotlinx.coroutines.scheduling.h r0 = r12.f5007c
            e4.d r1 = r12.e()     // Catch: java.lang.Throwable -> L93
            kotlinx.coroutines.internal.c r1 = (kotlinx.coroutines.internal.c) r1     // Catch: java.lang.Throwable -> L93
            e4.d<T> r2 = r1.f4946f     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = r1.f4948h     // Catch: java.lang.Throwable -> L93
            e4.f r3 = r2.b()     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = kotlinx.coroutines.internal.q.b(r3, r1)     // Catch: java.lang.Throwable -> L93
            a1.r r4 = kotlinx.coroutines.internal.q.f4973a     // Catch: java.lang.Throwable -> L93
            r5 = 0
            if (r1 == r4) goto L1e
            s4.l1 r4 = s4.r.b(r2, r3, r1)     // Catch: java.lang.Throwable -> L93
            goto L1f
        L1e:
            r4 = r5
        L1f:
            e4.f r6 = r2.b()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r12.i()     // Catch: java.lang.Throwable -> L57
            java.lang.Throwable r8 = r12.f(r7)     // Catch: java.lang.Throwable -> L57
            if (r8 != 0) goto L42
            int r9 = r12.f6065d     // Catch: java.lang.Throwable -> L57
            r10 = 1
            if (r9 == r10) goto L37
            r11 = 2
            if (r9 != r11) goto L36
            goto L37
        L36:
            r10 = 0
        L37:
            if (r10 == 0) goto L42
            s4.u0$b r9 = s4.u0.b.f6108b     // Catch: java.lang.Throwable -> L57
            e4.f$b r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L57
            s4.u0 r6 = (s4.u0) r6     // Catch: java.lang.Throwable -> L57
            goto L43
        L42:
            r6 = r5
        L43:
            if (r6 == 0) goto L59
            boolean r9 = r6.c()     // Catch: java.lang.Throwable -> L57
            if (r9 != 0) goto L59
            java.util.concurrent.CancellationException r6 = r6.s()     // Catch: java.lang.Throwable -> L57
            r12.c(r7, r6)     // Catch: java.lang.Throwable -> L57
            c4.d$a r6 = a1.f0.e(r6)     // Catch: java.lang.Throwable -> L57
            goto L64
        L57:
            r2 = move-exception
            goto L87
        L59:
            if (r8 == 0) goto L60
            c4.d$a r6 = a1.f0.e(r8)     // Catch: java.lang.Throwable -> L57
            goto L64
        L60:
            java.lang.Object r6 = r12.g(r7)     // Catch: java.lang.Throwable -> L57
        L64:
            r2.d(r6)     // Catch: java.lang.Throwable -> L57
            c4.h r2 = c4.h.f2763a     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L71
            boolean r2 = r4.X()     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L74
        L71:
            kotlinx.coroutines.internal.q.a(r3, r1)     // Catch: java.lang.Throwable -> L93
        L74:
            r0.a()     // Catch: java.lang.Throwable -> L7a
            c4.h r0 = c4.h.f2763a     // Catch: java.lang.Throwable -> L7a
            goto L7f
        L7a:
            r0 = move-exception
            c4.d$a r0 = a1.f0.e(r0)
        L7f:
            java.lang.Throwable r0 = c4.d.a(r0)
            r12.h(r5, r0)
            goto La6
        L87:
            if (r4 == 0) goto L8f
            boolean r4 = r4.X()     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L92
        L8f:
            kotlinx.coroutines.internal.q.a(r3, r1)     // Catch: java.lang.Throwable -> L93
        L92:
            throw r2     // Catch: java.lang.Throwable -> L93
        L93:
            r1 = move-exception
            r0.a()     // Catch: java.lang.Throwable -> L9a
            c4.h r0 = c4.h.f2763a     // Catch: java.lang.Throwable -> L9a
            goto L9f
        L9a:
            r0 = move-exception
            c4.d$a r0 = a1.f0.e(r0)
        L9f:
            java.lang.Throwable r0 = c4.d.a(r0)
            r12.h(r1, r0)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.g0.run():void");
    }
}
