package e2;

import java.io.FilterInputStream;
/* loaded from: classes.dex */
public final class h extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    public int f3828b;

    public h(d dVar) {
        super(dVar);
        this.f3828b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i6 = this.f3828b;
        return i6 == Integer.MIN_VALUE ? super.available() : Math.min(i6, super.available());
    }

    public final long c(long j5) {
        int i6 = this.f3828b;
        if (i6 == 0) {
            return -1L;
        }
        return (i6 == Integer.MIN_VALUE || j5 <= ((long) i6)) ? j5 : i6;
    }

    public final void f(long j5) {
        int i6 = this.f3828b;
        if (i6 == Integer.MIN_VALUE || j5 == -1) {
            return;
        }
        this.f3828b = (int) (i6 - j5);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
        super.mark(i6);
        this.f3828b = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (c(1L) == -1) {
            return -1;
        }
        int read = super.read();
        f(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        int c6 = (int) c(i7);
        if (c6 == -1) {
            return -1;
        }
        int read = super.read(bArr, i6, c6);
        f(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f3828b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) {
        long c6 = c(j5);
        if (c6 == -1) {
            return 0L;
        }
        long skip = super.skip(c6);
        f(skip);
        return skip;
    }
}
