package b5;

import f5.x;
import f5.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v4.b0;
import v4.p;
import v4.r;
/* loaded from: classes.dex */
public final class p implements z4.c {

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f2581g = w4.e.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f2582h = w4.e.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final r.a f2583a;

    /* renamed from: b  reason: collision with root package name */
    public final y4.e f2584b;

    /* renamed from: c  reason: collision with root package name */
    public final g f2585c;

    /* renamed from: d  reason: collision with root package name */
    public volatile r f2586d;

    /* renamed from: e  reason: collision with root package name */
    public final v4.v f2587e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f2588f;

    public p(v4.u uVar, y4.e eVar, z4.f fVar, g gVar) {
        this.f2584b = eVar;
        this.f2583a = fVar;
        this.f2585c = gVar;
        v4.v vVar = v4.v.f6544g;
        this.f2587e = uVar.f6500c.contains(vVar) ? vVar : v4.v.f6543f;
    }

    @Override // z4.c
    public final void a() {
        r rVar = this.f2586d;
        synchronized (rVar) {
            if (!rVar.f2605f && !rVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        rVar.f2607h.close();
    }

    @Override // z4.c
    public final void b() {
        this.f2585c.flush();
    }

    @Override // z4.c
    public final y c(b0 b0Var) {
        return this.f2586d.f2606g;
    }

    @Override // z4.c
    public final void cancel() {
        this.f2588f = true;
        if (this.f2586d != null) {
            this.f2586d.e(6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc A[Catch: all -> 0x0181, TryCatch #3 {, blocks: (B:24:0x009e, B:43:0x00e6, B:44:0x00e8, B:57:0x0120, B:58:0x0121, B:25:0x009f, B:27:0x00a6, B:28:0x00aa, B:30:0x00ae, B:32:0x00c4, B:34:0x00cc, B:39:0x00d6, B:41:0x00dc, B:42:0x00e5, B:83:0x017b, B:84:0x0180, B:45:0x00e9, B:47:0x00ed, B:52:0x010a, B:54:0x0110, B:56:0x011c, B:78:0x0170, B:79:0x0177), top: B:92:0x009e }] */
    @Override // z4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(v4.x r19) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.p.d(v4.x):void");
    }

    @Override // z4.c
    public final x e(v4.x xVar, long j5) {
        r rVar = this.f2586d;
        synchronized (rVar) {
            if (!rVar.f2605f && !rVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return rVar.f2607h;
    }

    @Override // z4.c
    public final b0.a f(boolean z5) {
        v4.p pVar;
        r rVar = this.f2586d;
        synchronized (rVar) {
            rVar.f2608i.i();
            while (rVar.f2604e.isEmpty() && rVar.f2610k == 0) {
                rVar.i();
            }
            rVar.f2608i.o();
            if (!rVar.f2604e.isEmpty()) {
                pVar = (v4.p) rVar.f2604e.removeFirst();
            } else {
                IOException iOException = rVar.f2611l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new v(rVar.f2610k);
            }
        }
        v4.v vVar = this.f2587e;
        ArrayList arrayList = new ArrayList(20);
        int length = pVar.f6458a.length / 2;
        z4.j jVar = null;
        for (int i6 = 0; i6 < length; i6++) {
            String d6 = pVar.d(i6);
            String g2 = pVar.g(i6);
            if (d6.equals(":status")) {
                jVar = z4.j.a("HTTP/1.1 " + g2);
            } else if (!f2582h.contains(d6)) {
                w4.a.f6589a.getClass();
                arrayList.add(d6);
                arrayList.add(g2.trim());
            }
        }
        if (jVar != null) {
            b0.a aVar = new b0.a();
            aVar.f6350b = vVar;
            aVar.f6351c = jVar.f7095b;
            aVar.f6352d = jVar.f7096c;
            p.a aVar2 = new p.a();
            Collections.addAll(aVar2.f6459a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar.f6354f = aVar2;
            if (z5) {
                w4.a.f6589a.getClass();
                if (aVar.f6351c == 100) {
                    return null;
                }
            }
            return aVar;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // z4.c
    public final long g(b0 b0Var) {
        return z4.e.a(b0Var);
    }

    @Override // z4.c
    public final y4.e h() {
        return this.f2584b;
    }
}
