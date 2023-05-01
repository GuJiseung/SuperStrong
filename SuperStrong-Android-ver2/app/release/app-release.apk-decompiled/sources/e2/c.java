package e2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    public final long f3814b;

    /* renamed from: c  reason: collision with root package name */
    public int f3815c;

    public c(InputStream inputStream, long j5) {
        super(inputStream);
        this.f3814b = j5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f3814b - this.f3815c, ((FilterInputStream) this).in.available());
    }

    public final void c(int i6) {
        int i7 = this.f3815c;
        if (i6 >= 0) {
            this.f3815c = i7 + i6;
            return;
        }
        long j5 = this.f3814b;
        if (j5 - i7 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j5 + ", but read: " + this.f3815c);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        c(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i6, int i7) {
        int read;
        read = super.read(bArr, i6, i7);
        c(read);
        return read;
    }
}
