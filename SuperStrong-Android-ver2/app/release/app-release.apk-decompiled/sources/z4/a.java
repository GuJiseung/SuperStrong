package z4;

import f5.l;
import f5.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import v4.a0;
import v4.b0;
import v4.j;
import v4.p;
import v4.q;
import v4.r;
import v4.s;
import v4.x;
/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a  reason: collision with root package name */
    public final v4.j f7077a;

    public a(j.a aVar) {
        this.f7077a = aVar;
    }

    @Override // v4.r
    public final b0 a(f fVar) {
        a aVar;
        boolean z5;
        x xVar = fVar.f7084e;
        xVar.getClass();
        x.a aVar2 = new x.a(xVar);
        a0 a0Var = xVar.f6559d;
        if (a0Var != null) {
            s b6 = a0Var.b();
            if (b6 != null) {
                aVar2.f6564c.c("Content-Type", b6.f6480a);
            }
            long a6 = a0Var.a();
            if (a6 != -1) {
                aVar2.f6564c.c("Content-Length", Long.toString(a6));
                aVar2.c("Transfer-Encoding");
            } else {
                aVar2.f6564c.c("Transfer-Encoding", "chunked");
                aVar2.c("Content-Length");
            }
        }
        String a7 = xVar.a("Host");
        q qVar = xVar.f6556a;
        if (a7 == null) {
            aVar2.f6564c.c("Host", w4.e.j(qVar, false));
        }
        if (xVar.a("Connection") == null) {
            aVar2.f6564c.c("Connection", "Keep-Alive");
        }
        if (xVar.a("Accept-Encoding") == null && xVar.a("Range") == null) {
            aVar2.f6564c.c("Accept-Encoding", "gzip");
            z5 = true;
            aVar = this;
        } else {
            aVar = this;
            z5 = false;
        }
        v4.j jVar = aVar.f7077a;
        ((j.a) jVar).getClass();
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (i6 > 0) {
                    sb.append("; ");
                }
                v4.i iVar = (v4.i) emptyList.get(i6);
                sb.append(iVar.f6431a);
                sb.append('=');
                sb.append(iVar.f6432b);
            }
            aVar2.f6564c.c("Cookie", sb.toString());
        }
        if (xVar.a("User-Agent") == null) {
            aVar2.f6564c.c("User-Agent", "okhttp/3.14.9");
        }
        b0 a8 = fVar.a(aVar2.a());
        p pVar = a8.f6341g;
        e.d(jVar, qVar, pVar);
        b0.a aVar3 = new b0.a(a8);
        aVar3.f6349a = xVar;
        if (z5 && "gzip".equalsIgnoreCase(a8.c("Content-Encoding")) && e.b(a8)) {
            l lVar = new l(a8.f6342h.h());
            p.a e6 = pVar.e();
            e6.b("Content-Encoding");
            e6.b("Content-Length");
            ArrayList arrayList = e6.f6459a;
            p.a aVar4 = new p.a();
            Collections.addAll(aVar4.f6459a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar3.f6354f = aVar4;
            String c6 = a8.c("Content-Type");
            Logger logger = f5.q.f4001a;
            aVar3.f6355g = new g(c6, -1L, new t(lVar));
        }
        return aVar3.a();
    }
}
