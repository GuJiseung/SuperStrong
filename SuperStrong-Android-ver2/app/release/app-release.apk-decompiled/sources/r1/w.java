package r1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class w extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    public volatile byte[] f5952b;

    /* renamed from: c  reason: collision with root package name */
    public int f5953c;

    /* renamed from: d  reason: collision with root package name */
    public int f5954d;

    /* renamed from: e  reason: collision with root package name */
    public int f5955e;

    /* renamed from: f  reason: collision with root package name */
    public int f5956f;

    /* renamed from: g  reason: collision with root package name */
    public final l1.b f5957g;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public w(InputStream inputStream, l1.b bVar) {
        super(inputStream);
        this.f5955e = -1;
        this.f5957g = bVar;
        this.f5952b = (byte[]) bVar.c(65536, byte[].class);
    }

    public static void h() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f5952b == null || inputStream == null) {
            h();
            throw null;
        }
        return (this.f5953c - this.f5956f) + inputStream.available();
    }

    public final int c(InputStream inputStream, byte[] bArr) {
        int i6 = this.f5955e;
        if (i6 != -1) {
            int i7 = this.f5956f - i6;
            int i8 = this.f5954d;
            if (i7 < i8) {
                if (i6 == 0 && i8 > bArr.length && this.f5953c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i8) {
                        i8 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f5957g.c(i8, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f5952b = bArr2;
                    this.f5957g.put(bArr);
                    bArr = bArr2;
                } else if (i6 > 0) {
                    System.arraycopy(bArr, i6, bArr, 0, bArr.length - i6);
                }
                int i9 = this.f5956f - this.f5955e;
                this.f5956f = i9;
                this.f5955e = 0;
                this.f5953c = 0;
                int read = inputStream.read(bArr, i9, bArr.length - i9);
                int i10 = this.f5956f;
                if (read > 0) {
                    i10 += read;
                }
                this.f5953c = i10;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f5955e = -1;
            this.f5956f = 0;
            this.f5953c = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5952b != null) {
            this.f5957g.put(this.f5952b);
            this.f5952b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void f() {
        if (this.f5952b != null) {
            this.f5957g.put(this.f5952b);
            this.f5952b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
        this.f5954d = Math.max(this.f5954d, i6);
        this.f5955e = this.f5956f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f5952b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            h();
            throw null;
        } else if (this.f5956f < this.f5953c || c(inputStream, bArr) != -1) {
            if (bArr != this.f5952b && (bArr = this.f5952b) == null) {
                h();
                throw null;
            }
            int i6 = this.f5953c;
            int i7 = this.f5956f;
            if (i6 - i7 > 0) {
                this.f5956f = i7 + 1;
                return bArr[i7] & 255;
            }
            return -1;
        } else {
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        byte[] bArr2 = this.f5952b;
        if (bArr2 == null) {
            h();
            throw null;
        } else if (i7 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                h();
                throw null;
            }
            int i10 = this.f5956f;
            int i11 = this.f5953c;
            if (i10 < i11) {
                int i12 = i11 - i10;
                if (i12 >= i7) {
                    i12 = i7;
                }
                System.arraycopy(bArr2, i10, bArr, i6, i12);
                this.f5956f += i12;
                if (i12 == i7 || inputStream.available() == 0) {
                    return i12;
                }
                i6 += i12;
                i8 = i7 - i12;
            } else {
                i8 = i7;
            }
            while (true) {
                if (this.f5955e == -1 && i8 >= bArr2.length) {
                    i9 = inputStream.read(bArr, i6, i8);
                    if (i9 == -1) {
                        return i8 != i7 ? i7 - i8 : -1;
                    }
                } else if (c(inputStream, bArr2) == -1) {
                    return i8 != i7 ? i7 - i8 : -1;
                } else {
                    if (bArr2 != this.f5952b && (bArr2 = this.f5952b) == null) {
                        h();
                        throw null;
                    }
                    int i13 = this.f5953c;
                    int i14 = this.f5956f;
                    i9 = i13 - i14;
                    if (i9 >= i8) {
                        i9 = i8;
                    }
                    System.arraycopy(bArr2, i14, bArr, i6, i9);
                    this.f5956f += i9;
                }
                i8 -= i9;
                if (i8 == 0) {
                    return i7;
                }
                if (inputStream.available() == 0) {
                    return i7 - i8;
                }
                i6 += i9;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f5952b == null) {
            throw new IOException("Stream is closed");
        }
        int i6 = this.f5955e;
        if (-1 == i6) {
            throw new a("Mark has been invalidated, pos: " + this.f5956f + " markLimit: " + this.f5954d);
        }
        this.f5956f = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j5) {
        if (j5 < 1) {
            return 0L;
        }
        byte[] bArr = this.f5952b;
        if (bArr == null) {
            h();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            h();
            throw null;
        }
        int i6 = this.f5953c;
        int i7 = this.f5956f;
        if (i6 - i7 >= j5) {
            this.f5956f = (int) (i7 + j5);
            return j5;
        }
        long j6 = i6 - i7;
        this.f5956f = i6;
        if (this.f5955e == -1 || j5 > this.f5954d) {
            long skip = inputStream.skip(j5 - j6);
            if (skip > 0) {
                this.f5955e = -1;
            }
            return j6 + skip;
        } else if (c(inputStream, bArr) == -1) {
            return j6;
        } else {
            int i8 = this.f5953c;
            int i9 = this.f5956f;
            if (i8 - i9 >= j5 - j6) {
                this.f5956f = (int) ((i9 + j5) - j6);
                return j5;
            }
            long j7 = (j6 + i8) - i9;
            this.f5956f = i8;
            return j7;
        }
    }
}
