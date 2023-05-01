package g1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    public final InputStream f4141b;

    /* renamed from: c  reason: collision with root package name */
    public final Charset f4142c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f4143d;

    /* renamed from: e  reason: collision with root package name */
    public int f4144e;

    /* renamed from: f  reason: collision with root package name */
    public int f4145f;

    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i6) {
            super(i6);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i6 = ((ByteArrayOutputStream) this).count;
            if (i6 > 0 && ((ByteArrayOutputStream) this).buf[i6 - 1] == 13) {
                i6--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i6, b.this.f4142c.name());
            } catch (UnsupportedEncodingException e6) {
                throw new AssertionError(e6);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(c.f4147a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f4141b = fileInputStream;
        this.f4142c = charset;
        this.f4143d = new byte[8192];
    }

    public final String c() {
        int i6;
        synchronized (this.f4141b) {
            byte[] bArr = this.f4143d;
            if (bArr != null) {
                if (this.f4144e >= this.f4145f) {
                    int read = this.f4141b.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f4144e = 0;
                        this.f4145f = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i7 = this.f4144e; i7 != this.f4145f; i7++) {
                    byte[] bArr2 = this.f4143d;
                    if (bArr2[i7] == 10) {
                        int i8 = this.f4144e;
                        if (i7 != i8) {
                            i6 = i7 - 1;
                            if (bArr2[i6] == 13) {
                                String str = new String(bArr2, i8, i6 - i8, this.f4142c.name());
                                this.f4144e = i7 + 1;
                                return str;
                            }
                        }
                        i6 = i7;
                        String str2 = new String(bArr2, i8, i6 - i8, this.f4142c.name());
                        this.f4144e = i7 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f4145f - this.f4144e) + 80);
                while (true) {
                    byte[] bArr3 = this.f4143d;
                    int i9 = this.f4144e;
                    aVar.write(bArr3, i9, this.f4145f - i9);
                    this.f4145f = -1;
                    byte[] bArr4 = this.f4143d;
                    int read2 = this.f4141b.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f4144e = 0;
                        this.f4145f = read2;
                        for (int i10 = 0; i10 != this.f4145f; i10++) {
                            byte[] bArr5 = this.f4143d;
                            if (bArr5[i10] == 10) {
                                int i11 = this.f4144e;
                                if (i10 != i11) {
                                    aVar.write(bArr5, i11, i10 - i11);
                                }
                                this.f4144e = i10 + 1;
                                return aVar.toString();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f4141b) {
            if (this.f4143d != null) {
                this.f4143d = null;
                this.f4141b.close();
            }
        }
    }
}
