package e2;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayDeque f3816d;

    /* renamed from: b  reason: collision with root package name */
    public InputStream f3817b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f3818c;

    static {
        char[] cArr = j.f3832a;
        f3816d = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f3817b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3817b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i6) {
        this.f3817b.mark(i6);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f3817b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f3817b.read();
        } catch (IOException e6) {
            this.f3818c = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f3817b.read(bArr);
        } catch (IOException e6) {
            this.f3818c = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        try {
            return this.f3817b.read(bArr, i6, i7);
        } catch (IOException e6) {
            this.f3818c = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f3817b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j5) {
        try {
            return this.f3817b.skip(j5);
        } catch (IOException e6) {
            this.f3818c = e6;
            throw e6;
        }
    }
}
