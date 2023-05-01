package f5;

import java.io.IOException;
/* loaded from: classes.dex */
public final class a implements x {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f3963b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f3964c;

    public a(p pVar, n nVar) {
        this.f3964c = pVar;
        this.f3963b = nVar;
    }

    @Override // f5.x
    public final z b() {
        return this.f3964c;
    }

    @Override // f5.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f3964c;
        cVar.i();
        try {
            try {
                this.f3963b.close();
                cVar.k(true);
            } catch (IOException e6) {
                throw cVar.j(e6);
            }
        } catch (Throwable th) {
            cVar.k(false);
            throw th;
        }
    }

    @Override // f5.x, java.io.Flushable
    public final void flush() {
        c cVar = this.f3964c;
        cVar.i();
        try {
            try {
                this.f3963b.flush();
                cVar.k(true);
            } catch (IOException e6) {
                throw cVar.j(e6);
            }
        } catch (Throwable th) {
            cVar.k(false);
            throw th;
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f3963b + ")";
    }

    @Override // f5.x
    public final void u(e eVar, long j5) {
        a0.a(eVar.f3977c, 0L, j5);
        while (true) {
            long j6 = 0;
            if (j5 <= 0) {
                return;
            }
            u uVar = eVar.f3976b;
            while (true) {
                if (j6 >= 65536) {
                    break;
                }
                j6 += uVar.f4014c - uVar.f4013b;
                if (j6 >= j5) {
                    j6 = j5;
                    break;
                }
                uVar = uVar.f4017f;
            }
            c cVar = this.f3964c;
            cVar.i();
            try {
                try {
                    this.f3963b.u(eVar, j6);
                    j5 -= j6;
                    cVar.k(true);
                } catch (IOException e6) {
                    throw cVar.j(e6);
                }
            } catch (Throwable th) {
                cVar.k(false);
                throw th;
            }
        }
    }
}
