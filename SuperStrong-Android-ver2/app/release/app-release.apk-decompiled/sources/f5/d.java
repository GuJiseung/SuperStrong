package f5;

import java.io.OutputStream;
/* loaded from: classes.dex */
public final class d extends OutputStream {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f3974b;

    public d(e eVar) {
        this.f3974b = eVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.f3974b + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i6) {
        this.f3974b.G((byte) i6);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i6, int i7) {
        this.f3974b.m0write(bArr, i6, i7);
    }
}
