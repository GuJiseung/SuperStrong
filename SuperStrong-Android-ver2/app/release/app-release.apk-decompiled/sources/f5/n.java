package f5;

import java.io.OutputStream;
/* loaded from: classes.dex */
public final class n implements x {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f3996b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ OutputStream f3997c;

    public n(OutputStream outputStream, p pVar) {
        this.f3996b = pVar;
        this.f3997c = outputStream;
    }

    @Override // f5.x
    public final z b() {
        return this.f3996b;
    }

    @Override // f5.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3997c.close();
    }

    @Override // f5.x, java.io.Flushable
    public final void flush() {
        this.f3997c.flush();
    }

    public final String toString() {
        return "sink(" + this.f3997c + ")";
    }

    @Override // f5.x
    public final void u(e eVar, long j5) {
        a0.a(eVar.f3977c, 0L, j5);
        while (j5 > 0) {
            this.f3996b.f();
            u uVar = eVar.f3976b;
            int min = (int) Math.min(j5, uVar.f4014c - uVar.f4013b);
            this.f3997c.write(uVar.f4012a, uVar.f4013b, min);
            int i6 = uVar.f4013b + min;
            uVar.f4013b = i6;
            long j6 = min;
            j5 -= j6;
            eVar.f3977c -= j6;
            if (i6 == uVar.f4014c) {
                eVar.f3976b = uVar.a();
                v.a(uVar);
            }
        }
    }
}
