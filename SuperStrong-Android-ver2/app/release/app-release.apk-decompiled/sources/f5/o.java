package f5;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class o implements y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f3998b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InputStream f3999c;

    public o(InputStream inputStream, z zVar) {
        this.f3998b = zVar;
        this.f3999c = inputStream;
    }

    @Override // f5.y
    public final long B(e eVar, long j5) {
        boolean z5 = true;
        try {
            this.f3998b.f();
            u E = eVar.E(1);
            int read = this.f3999c.read(E.f4012a, E.f4014c, (int) Math.min(8192L, 8192 - E.f4014c));
            if (read == -1) {
                return -1L;
            }
            E.f4014c += read;
            long j6 = read;
            eVar.f3977c += j6;
            return j6;
        } catch (AssertionError e6) {
            if ((e6.getCause() == null || e6.getMessage() == null || !e6.getMessage().contains("getsockname failed")) ? false : false) {
                throw new IOException(e6);
            }
            throw e6;
        }
    }

    @Override // f5.y
    public final z b() {
        return this.f3998b;
    }

    @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3999c.close();
    }

    public final String toString() {
        return "source(" + this.f3999c + ")";
    }
}
