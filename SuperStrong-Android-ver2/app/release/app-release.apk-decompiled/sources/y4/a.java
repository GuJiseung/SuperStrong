package y4;

import java.io.IOException;
import v4.b0;
import v4.r;
import v4.u;
import v4.x;
/* loaded from: classes.dex */
public final class a implements r {
    @Override // v4.r
    public final b0 a(z4.f fVar) {
        x xVar = fVar.f7084e;
        i iVar = fVar.f7081b;
        boolean z5 = !xVar.f6557b.equals("GET");
        synchronized (iVar.f6900b) {
            if (!iVar.f6913o) {
                if (iVar.f6908j != null) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        d dVar = iVar.f6906h;
        u uVar = iVar.f6899a;
        dVar.getClass();
        int i6 = fVar.f7086g;
        int i7 = fVar.f7087h;
        int i8 = fVar.f7088i;
        uVar.getClass();
        try {
            c cVar = new c(iVar, iVar.f6901c, iVar.f6902d, iVar.f6906h, dVar.b(i6, i7, i8, uVar.f6516t, z5).g(uVar, fVar));
            synchronized (iVar.f6900b) {
                iVar.f6908j = cVar;
                iVar.f6909k = false;
                iVar.f6910l = false;
            }
            return fVar.b(xVar, iVar, cVar);
        } catch (IOException e6) {
            synchronized (dVar.f6858c) {
                dVar.f6863h = true;
                throw new g(e6);
            }
        } catch (g e7) {
            synchronized (dVar.f6858c) {
                dVar.f6863h = true;
                throw e7;
            }
        }
    }
}
