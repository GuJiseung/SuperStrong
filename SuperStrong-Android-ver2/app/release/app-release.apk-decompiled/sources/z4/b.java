package z4;

import f5.q;
import f5.s;
import f5.t;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.logging.Logger;
import v4.a0;
import v4.b0;
import v4.d0;
import v4.m;
import v4.r;
import v4.x;
import y4.c;
/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7078a;

    public b(boolean z5) {
        this.f7078a = z5;
    }

    @Override // v4.r
    public final b0 a(f fVar) {
        boolean z5;
        b0.a aVar;
        d0 d0Var;
        a0 a0Var;
        b0.a b6;
        y4.c cVar = fVar.f7082c;
        if (cVar != null) {
            c cVar2 = cVar.f6844d;
            m mVar = cVar.f6842b;
            x xVar = fVar.f7084e;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                mVar.getClass();
                cVar2.d(xVar);
                boolean c6 = kotlinx.coroutines.internal.f.c(xVar.f6557b);
                b0.a aVar2 = null;
                boolean z6 = true;
                y4.i iVar = cVar.f6841a;
                if (c6 && (a0Var = xVar.f6559d) != null) {
                    if ("100-continue".equalsIgnoreCase(xVar.a("Expect"))) {
                        try {
                            cVar2.b();
                            mVar.getClass();
                            b6 = cVar.b(true);
                            z5 = true;
                        } catch (IOException e6) {
                            mVar.getClass();
                            cVar.c(e6);
                            throw e6;
                        }
                    } else {
                        b6 = null;
                        z5 = false;
                    }
                    if (b6 == null) {
                        cVar.f6845e = false;
                        long a6 = a0Var.a();
                        mVar.getClass();
                        c.a aVar3 = new c.a(cVar2.e(xVar, a6), a6);
                        Logger logger = q.f4001a;
                        s sVar = new s(aVar3);
                        a0Var.c(sVar);
                        sVar.close();
                    } else {
                        iVar.c(cVar, true, false, null);
                        if (cVar.a().f6871h == null) {
                            z6 = false;
                        }
                        if (!z6) {
                            cVar2.h().h();
                        }
                    }
                    aVar2 = b6;
                } else {
                    iVar.c(cVar, true, false, null);
                    z5 = false;
                }
                try {
                    cVar2.a();
                    if (!z5) {
                        mVar.getClass();
                    }
                    if (aVar2 == null) {
                        aVar2 = cVar.b(false);
                    }
                    aVar2.f6349a = xVar;
                    aVar2.f6353e = cVar.a().f6869f;
                    aVar2.f6359k = currentTimeMillis;
                    aVar2.f6360l = System.currentTimeMillis();
                    b0 a7 = aVar2.a();
                    int i6 = a7.f6338d;
                    if (i6 == 100) {
                        b0.a b7 = cVar.b(false);
                        b7.f6349a = xVar;
                        b7.f6353e = cVar.a().f6869f;
                        b7.f6359k = currentTimeMillis;
                        b7.f6360l = System.currentTimeMillis();
                        a7 = b7.a();
                        i6 = a7.f6338d;
                    }
                    mVar.getClass();
                    if (this.f7078a && i6 == 101) {
                        aVar = new b0.a(a7);
                        aVar.f6355g = w4.e.f6596d;
                    } else {
                        aVar = new b0.a(a7);
                        try {
                            String c7 = a7.c("Content-Type");
                            long g2 = cVar2.g(a7);
                            c.b bVar = new c.b(cVar2.c(a7), g2);
                            Logger logger2 = q.f4001a;
                            aVar.f6355g = new g(c7, g2, new t(bVar));
                        } catch (IOException e7) {
                            cVar.c(e7);
                            throw e7;
                        }
                    }
                    b0 a8 = aVar.a();
                    if ("close".equalsIgnoreCase(a8.f6336b.a("Connection")) || "close".equalsIgnoreCase(a8.c("Connection"))) {
                        cVar2.h().h();
                    }
                    if (i6 == 204 || i6 == 205) {
                        if (a8.f6342h.c() > 0) {
                            throw new ProtocolException("HTTP " + i6 + " had non-zero Content-Length: " + d0Var.c());
                        }
                    }
                    return a8;
                } catch (IOException e8) {
                    mVar.getClass();
                    cVar.c(e8);
                    throw e8;
                }
            } catch (IOException e9) {
                mVar.getClass();
                cVar.c(e9);
                throw e9;
            }
        }
        throw new IllegalStateException();
    }
}
