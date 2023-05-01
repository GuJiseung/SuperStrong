package f5;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class s implements f {

    /* renamed from: b  reason: collision with root package name */
    public final e f4005b = new e();

    /* renamed from: c  reason: collision with root package name */
    public final x f4006c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4007d;

    public s(x xVar) {
        this.f4006c = xVar;
    }

    @Override // f5.f
    public final f A(long j5) {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        this.f4005b.H(j5);
        c();
        return this;
    }

    @Override // f5.f
    public final e a() {
        return this.f4005b;
    }

    @Override // f5.x
    public final z b() {
        return this.f4006c.b();
    }

    public final f c() {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f4005b;
        long f6 = eVar.f();
        if (f6 > 0) {
            this.f4006c.u(eVar, f6);
        }
        return this;
    }

    @Override // f5.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.f4006c;
        if (this.f4007d) {
            return;
        }
        try {
            e eVar = this.f4005b;
            long j5 = eVar.f3977c;
            if (j5 > 0) {
                xVar.u(eVar, j5);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            xVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f4007d = true;
        if (th == null) {
            return;
        }
        Charset charset = a0.f3965a;
        throw th;
    }

    @Override // f5.f
    public final f d(long j5) {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        this.f4005b.I(j5);
        c();
        return this;
    }

    @Override // f5.f, f5.x, java.io.Flushable
    public final void flush() {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f4005b;
        long j5 = eVar.f3977c;
        int i6 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
        x xVar = this.f4006c;
        if (i6 > 0) {
            xVar.u(eVar, j5);
        }
        xVar.flush();
    }

    @Override // f5.f
    public final f g(h hVar) {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        this.f4005b.F(hVar);
        c();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4007d;
    }

    public final String toString() {
        return "buffer(" + this.f4006c + ")";
    }

    @Override // f5.x
    public final void u(e eVar, long j5) {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        this.f4005b.u(eVar, j5);
        c();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        int write = this.f4005b.write(byteBuffer);
        c();
        return write;
    }

    @Override // f5.f
    public final f write(byte[] bArr) {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f4005b;
        eVar.getClass();
        if (bArr != null) {
            eVar.m0write(bArr, 0, bArr.length);
            c();
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // f5.f
    public final f write(byte[] bArr, int i6, int i7) {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        this.f4005b.m0write(bArr, i6, i7);
        c();
        return this;
    }

    @Override // f5.f
    public final f writeByte(int i6) {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        this.f4005b.G(i6);
        c();
        return this;
    }

    @Override // f5.f
    public final f writeInt(int i6) {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        this.f4005b.J(i6);
        c();
        return this;
    }

    @Override // f5.f
    public final f writeShort(int i6) {
        if (this.f4007d) {
            throw new IllegalStateException("closed");
        }
        this.f4005b.K(i6);
        c();
        return this;
    }

    @Override // f5.f
    public final f z(String str) {
        if (!this.f4007d) {
            e eVar = this.f4005b;
            eVar.getClass();
            eVar.L(0, str.length(), str);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
