package f5;

import java.io.IOException;
/* loaded from: classes.dex */
public final class b implements y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f3966b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f3967c;

    public b(p pVar, o oVar) {
        this.f3967c = pVar;
        this.f3966b = oVar;
    }

    @Override // f5.y
    public final long B(e eVar, long j5) {
        c cVar = this.f3967c;
        cVar.i();
        try {
            try {
                long B = this.f3966b.B(eVar, 8192L);
                cVar.k(true);
                return B;
            } catch (IOException e6) {
                throw cVar.j(e6);
            }
        } catch (Throwable th) {
            cVar.k(false);
            throw th;
        }
    }

    @Override // f5.y
    public final z b() {
        return this.f3967c;
    }

    @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f3967c;
        cVar.i();
        try {
            try {
                this.f3966b.close();
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
        return "AsyncTimeout.source(" + this.f3966b + ")";
    }
}
