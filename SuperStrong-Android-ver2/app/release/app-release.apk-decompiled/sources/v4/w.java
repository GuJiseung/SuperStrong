package v4;

import g5.t;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class w implements d {

    /* renamed from: b  reason: collision with root package name */
    public final u f6548b;

    /* renamed from: c  reason: collision with root package name */
    public y4.i f6549c;

    /* renamed from: d  reason: collision with root package name */
    public final x f6550d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6551e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6552f;

    /* loaded from: classes.dex */
    public final class a extends w4.b {

        /* renamed from: c  reason: collision with root package name */
        public final e f6553c;

        /* renamed from: d  reason: collision with root package name */
        public volatile AtomicInteger f6554d;

        public a(t.a aVar) {
            super("OkHttp %s", w.this.f6550d.f6556a.n());
            this.f6554d = new AtomicInteger(0);
            this.f6553c = aVar;
        }

        @Override // w4.b
        public final void a() {
            e eVar = this.f6553c;
            w wVar = w.this;
            y4.i iVar = wVar.f6549c;
            u uVar = wVar.f6548b;
            iVar.f6903e.i();
            boolean z5 = false;
            try {
                try {
                } catch (Throwable th) {
                    uVar.f6499b.b(this);
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ((t.a) eVar).b(wVar.a());
            } catch (IOException e7) {
                e = e7;
                z5 = true;
                if (z5) {
                    c5.f.f2787a.m(4, "Callback failure for " + wVar.b(), e);
                } else {
                    ((t.a) eVar).a(e);
                }
                uVar.f6499b.b(this);
            } catch (Throwable th3) {
                th = th3;
                z5 = true;
                wVar.f6549c.a();
                if (!z5) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.addSuppressed(th);
                    ((t.a) eVar).a(iOException);
                }
                throw th;
            }
            uVar.f6499b.b(this);
        }
    }

    public w(u uVar, x xVar, boolean z5) {
        this.f6548b = uVar;
        this.f6550d = xVar;
        this.f6551e = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v4.b0 a() {
        /*
            r12 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            v4.u r0 = r12.f6548b
            java.util.List<v4.r> r2 = r0.f6502e
            r1.addAll(r2)
            z4.i r2 = new z4.i
            r2.<init>(r0)
            r1.add(r2)
            z4.a r2 = new z4.a
            v4.j$a r3 = r0.f6506i
            r2.<init>(r3)
            r1.add(r2)
            x4.a r2 = new x4.a
            r2.<init>()
            r1.add(r2)
            y4.a r2 = new y4.a
            r2.<init>()
            r1.add(r2)
            boolean r2 = r12.f6551e
            if (r2 != 0) goto L37
            java.util.List<v4.r> r3 = r0.f6503f
            r1.addAll(r3)
        L37:
            z4.b r3 = new z4.b
            r3.<init>(r2)
            r1.add(r3)
            z4.f r10 = new z4.f
            y4.i r2 = r12.f6549c
            r3 = 0
            r4 = 0
            v4.x r11 = r12.f6550d
            int r7 = r0.u
            int r8 = r0.f6517v
            int r9 = r0.f6518w
            r0 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            v4.b0 r1 = r10.a(r11)     // Catch: java.io.IOException -> L76 java.lang.Throwable -> L78
            y4.i r2 = r12.f6549c     // Catch: java.io.IOException -> L76 java.lang.Throwable -> L78
            y4.f r3 = r2.f6900b     // Catch: java.io.IOException -> L76 java.lang.Throwable -> L78
            monitor-enter(r3)     // Catch: java.io.IOException -> L76 java.lang.Throwable -> L78
            boolean r2 = r2.f6911m     // Catch: java.lang.Throwable -> L73
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
            if (r2 != 0) goto L68
            y4.i r2 = r12.f6549c
            r2.e(r0)
            return r1
        L68:
            w4.e.b(r1)     // Catch: java.io.IOException -> L76 java.lang.Throwable -> L78
            java.io.IOException r1 = new java.io.IOException     // Catch: java.io.IOException -> L76 java.lang.Throwable -> L78
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.io.IOException -> L76 java.lang.Throwable -> L78
            throw r1     // Catch: java.io.IOException -> L76 java.lang.Throwable -> L78
        L73:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
            throw r1     // Catch: java.io.IOException -> L76 java.lang.Throwable -> L78
        L76:
            r1 = move-exception
            goto L7b
        L78:
            r1 = move-exception
            r2 = 0
            goto L84
        L7b:
            y4.i r2 = r12.f6549c     // Catch: java.lang.Throwable -> L82
            java.io.IOException r1 = r2.e(r1)     // Catch: java.lang.Throwable -> L82
            throw r1     // Catch: java.lang.Throwable -> L82
        L82:
            r1 = move-exception
            r2 = 1
        L84:
            if (r2 != 0) goto L8b
            y4.i r2 = r12.f6549c
            r2.e(r0)
        L8b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.w.a():v4.b0");
    }

    public final String b() {
        boolean z5;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        y4.i iVar = this.f6549c;
        synchronized (iVar.f6900b) {
            z5 = iVar.f6911m;
        }
        if (z5) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f6551e) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(this.f6550d.f6556a.n());
        return sb.toString();
    }

    public final Object clone() {
        u uVar = this.f6548b;
        w wVar = new w(uVar, this.f6550d, this.f6551e);
        wVar.f6549c = new y4.i(uVar, wVar);
        return wVar;
    }
}
