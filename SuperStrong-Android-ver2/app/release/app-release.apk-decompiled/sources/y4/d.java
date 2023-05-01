package y4;

import v4.e0;
import v4.m;
import y4.h;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final i f6856a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.a f6857b;

    /* renamed from: c  reason: collision with root package name */
    public final f f6858c;

    /* renamed from: d  reason: collision with root package name */
    public final m f6859d;

    /* renamed from: e  reason: collision with root package name */
    public h.a f6860e;

    /* renamed from: f  reason: collision with root package name */
    public final h f6861f;

    /* renamed from: g  reason: collision with root package name */
    public e f6862g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6863h;

    /* renamed from: i  reason: collision with root package name */
    public e0 f6864i;

    public d(i iVar, f fVar, v4.a aVar, v4.d dVar, m mVar) {
        this.f6856a = iVar;
        this.f6858c = fVar;
        this.f6857b = aVar;
        this.f6859d = mVar;
        this.f6861f = new h(aVar, fVar.f6886e, dVar, mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x020a, code lost:
        throw new java.net.SocketException("No route to " + r13 + ":" + r12 + "; port is out of range");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x022f, code lost:
        if (r3.isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0231, code lost:
        r3.addAll(r2.f6896g);
        r2.f6896g.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x023b, code lost:
        r16.f6860e = new y4.h.a(r3);
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
        if (r2 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y4.e a(boolean r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.d.a(boolean, int, int, int):y4.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x008d A[LOOP:0: B:3:0x000a->B:54:0x008d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y4.e b(int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
        La:
            y4.e r6 = r1.a(r5, r2, r3, r4)
            y4.f r7 = r1.f6858c
            monitor-enter(r7)
            int r0 = r6.f6876m     // Catch: java.lang.Throwable -> L22
            r8 = 1
            r9 = 0
            if (r0 != 0) goto L25
            b5.g r0 = r6.f6871h     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1d
            r0 = r8
            goto L1e
        L1d:
            r0 = r9
        L1e:
            if (r0 != 0) goto L25
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L22
            return r6
        L22:
            r0 = move-exception
            goto L93
        L25:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L22
            java.net.Socket r0 = r6.f6868e
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L8a
            java.net.Socket r0 = r6.f6868e
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L8a
            java.net.Socket r0 = r6.f6868e
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L3f
            goto L8a
        L3f:
            b5.g r7 = r6.f6871h
            if (r7 == 0) goto L62
            long r10 = java.lang.System.nanoTime()
            monitor-enter(r7)
            boolean r0 = r7.f2532h     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L4d
            goto L5b
        L4d:
            long r12 = r7.f2539o     // Catch: java.lang.Throwable -> L5f
            long r14 = r7.f2538n     // Catch: java.lang.Throwable -> L5f
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L5d
            long r12 = r7.f2540p     // Catch: java.lang.Throwable -> L5f
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L5d
        L5b:
            monitor-exit(r7)
            goto L8a
        L5d:
            monitor-exit(r7)
            goto L8b
        L5f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L62:
            if (r21 == 0) goto L8b
            java.net.Socket r0 = r6.f6868e     // Catch: java.io.IOException -> L8a java.net.SocketTimeoutException -> L8b
            int r7 = r0.getSoTimeout()     // Catch: java.io.IOException -> L8a java.net.SocketTimeoutException -> L8b
            java.net.Socket r0 = r6.f6868e     // Catch: java.lang.Throwable -> L83
            r0.setSoTimeout(r8)     // Catch: java.lang.Throwable -> L83
            f5.t r0 = r6.f6872i     // Catch: java.lang.Throwable -> L83
            boolean r0 = r0.m()     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L7d
            java.net.Socket r0 = r6.f6868e     // Catch: java.io.IOException -> L8a java.net.SocketTimeoutException -> L8b
            r0.setSoTimeout(r7)     // Catch: java.io.IOException -> L8a java.net.SocketTimeoutException -> L8b
            goto L8a
        L7d:
            java.net.Socket r0 = r6.f6868e     // Catch: java.io.IOException -> L8a java.net.SocketTimeoutException -> L8b
            r0.setSoTimeout(r7)     // Catch: java.io.IOException -> L8a java.net.SocketTimeoutException -> L8b
            goto L8b
        L83:
            r0 = move-exception
            java.net.Socket r10 = r6.f6868e     // Catch: java.io.IOException -> L8a java.net.SocketTimeoutException -> L8b
            r10.setSoTimeout(r7)     // Catch: java.io.IOException -> L8a java.net.SocketTimeoutException -> L8b
            throw r0     // Catch: java.io.IOException -> L8a java.net.SocketTimeoutException -> L8b
        L8a:
            r8 = r9
        L8b:
            if (r8 != 0) goto L92
            r6.h()
            goto La
        L92:
            return r6
        L93:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L22
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.d.b(int, int, int, boolean, boolean):y4.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r1 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r6 = this;
            y4.f r0 = r6.f6858c
            monitor-enter(r0)
            v4.e0 r1 = r6.f6864i     // Catch: java.lang.Throwable -> L51
            r2 = 1
            if (r1 == 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            return r2
        La:
            boolean r1 = r6.d()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L1a
            y4.i r1 = r6.f6856a     // Catch: java.lang.Throwable -> L51
            y4.e r1 = r1.f6907i     // Catch: java.lang.Throwable -> L51
            v4.e0 r1 = r1.f6866c     // Catch: java.lang.Throwable -> L51
            r6.f6864i = r1     // Catch: java.lang.Throwable -> L51
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            return r2
        L1a:
            y4.h$a r1 = r6.f6860e     // Catch: java.lang.Throwable -> L51
            r3 = 0
            if (r1 == 0) goto L2e
            int r4 = r1.f6898b     // Catch: java.lang.Throwable -> L51
            java.util.List<v4.e0> r1 = r1.f6897a     // Catch: java.lang.Throwable -> L51
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L51
            if (r4 >= r1) goto L2b
            r1 = r2
            goto L2c
        L2b:
            r1 = r3
        L2c:
            if (r1 != 0) goto L4f
        L2e:
            y4.h r1 = r6.f6861f     // Catch: java.lang.Throwable -> L51
            int r4 = r1.f6894e     // Catch: java.lang.Throwable -> L51
            java.util.List<java.net.Proxy> r5 = r1.f6893d     // Catch: java.lang.Throwable -> L51
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L51
            if (r4 >= r5) goto L3c
            r4 = r2
            goto L3d
        L3c:
            r4 = r3
        L3d:
            if (r4 != 0) goto L4a
            java.util.ArrayList r1 = r1.f6896g     // Catch: java.lang.Throwable -> L51
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L48
            goto L4a
        L48:
            r1 = r3
            goto L4b
        L4a:
            r1 = r2
        L4b:
            if (r1 == 0) goto L4e
            goto L4f
        L4e:
            r2 = r3
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            return r2
        L51:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.d.c():boolean");
    }

    public final boolean d() {
        e eVar = this.f6856a.f6907i;
        if (eVar != null && eVar.f6875l == 0 && w4.e.p(eVar.f6866c.f6386a.f6324a, this.f6857b.f6324a)) {
            return true;
        }
        return false;
    }
}
