package f5;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class t implements g {

    /* renamed from: b  reason: collision with root package name */
    public final e f4008b = new e();

    /* renamed from: c  reason: collision with root package name */
    public final y f4009c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4010d;

    /* loaded from: classes.dex */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            t tVar = t.this;
            if (tVar.f4010d) {
                throw new IOException("closed");
            }
            return (int) Math.min(tVar.f4008b.f3977c, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            t.this.close();
        }

        @Override // java.io.InputStream
        public final int read() {
            t tVar = t.this;
            if (tVar.f4010d) {
                throw new IOException("closed");
            }
            e eVar = tVar.f4008b;
            if (eVar.f3977c == 0 && tVar.f4009c.B(eVar, 8192L) == -1) {
                return -1;
            }
            return tVar.f4008b.readByte() & 255;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i6, int i7) {
            t tVar = t.this;
            if (tVar.f4010d) {
                throw new IOException("closed");
            }
            a0.a(bArr.length, i6, i7);
            e eVar = tVar.f4008b;
            if (eVar.f3977c == 0 && tVar.f4009c.B(eVar, 8192L) == -1) {
                return -1;
            }
            return tVar.f4008b.read(bArr, i6, i7);
        }

        public final String toString() {
            return t.this + ".inputStream()";
        }
    }

    public t(y yVar) {
        if (yVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f4009c = yVar;
    }

    @Override // f5.y
    public final long B(e eVar, long j5) {
        if (eVar != null) {
            if (j5 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j5);
            } else if (this.f4010d) {
                throw new IllegalStateException("closed");
            } else {
                e eVar2 = this.f4008b;
                if (eVar2.f3977c == 0 && this.f4009c.B(eVar2, 8192L) == -1) {
                    return -1L;
                }
                return eVar2.B(eVar, Math.min(j5, eVar2.f3977c));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // f5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long C() {
        /*
            r7 = this;
            r0 = 1
            r7.y(r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r7.h(r3)
            f5.e r4 = r7.f4008b
            if (r3 == 0) goto L4a
            long r5 = (long) r1
            byte r3 = r4.j(r5)
            r5 = 48
            if (r3 < r5) goto L1f
            r5 = 57
            if (r3 <= r5) goto L30
        L1f:
            r5 = 97
            if (r3 < r5) goto L27
            r5 = 102(0x66, float:1.43E-43)
            if (r3 <= r5) goto L30
        L27:
            r5 = 65
            if (r3 < r5) goto L32
            r5 = 70
            if (r3 <= r5) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            long r0 = r4.C()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.t.C():long");
    }

    @Override // f5.g
    public final InputStream D() {
        return new a();
    }

    @Override // f5.g, f5.f
    public final e a() {
        return this.f4008b;
    }

    @Override // f5.y
    public final z b() {
        return this.f4009c.b();
    }

    public final long c(byte b6, long j5, long j6) {
        if (this.f4010d) {
            throw new IllegalStateException("closed");
        }
        long j7 = 0;
        if (j6 >= 0) {
            while (j7 < j6) {
                long p5 = this.f4008b.p(b6, j7, j6);
                if (p5 == -1) {
                    e eVar = this.f4008b;
                    long j8 = eVar.f3977c;
                    if (j8 >= j6 || this.f4009c.B(eVar, 8192L) == -1) {
                        break;
                    }
                    j7 = Math.max(j7, j8);
                } else {
                    return p5;
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j6)));
    }

    @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4010d) {
            return;
        }
        this.f4010d = true;
        this.f4009c.close();
        this.f4008b.c();
    }

    @Override // f5.g
    public final h e(long j5) {
        y(j5);
        return this.f4008b.e(j5);
    }

    public final void f(byte[] bArr) {
        e eVar = this.f4008b;
        int i6 = 0;
        try {
            y(bArr.length);
            eVar.getClass();
            while (i6 < bArr.length) {
                int read = eVar.read(bArr, i6, bArr.length - i6);
                if (read != -1) {
                    i6 += read;
                } else {
                    throw new EOFException();
                }
            }
        } catch (EOFException e6) {
            while (true) {
                long j5 = eVar.f3977c;
                if (j5 > 0) {
                    int read2 = eVar.read(bArr, i6, (int) j5);
                    if (read2 != -1) {
                        i6 += read2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e6;
                }
            }
        }
    }

    public final boolean h(long j5) {
        e eVar;
        if (j5 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j5);
        } else if (this.f4010d) {
            throw new IllegalStateException("closed");
        } else {
            do {
                eVar = this.f4008b;
                if (eVar.f3977c >= j5) {
                    return true;
                }
            } while (this.f4009c.B(eVar, 8192L) != -1);
            return false;
        }
    }

    @Override // f5.g
    public final int i(r rVar) {
        e eVar;
        if (this.f4010d) {
            throw new IllegalStateException("closed");
        }
        do {
            eVar = this.f4008b;
            int x5 = eVar.x(rVar, true);
            if (x5 == -1) {
                return -1;
            }
            if (x5 != -2) {
                eVar.skip(rVar.f4003b[x5].j());
                return x5;
            }
        } while (this.f4009c.B(eVar, 8192L) != -1);
        return -1;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4010d;
    }

    @Override // f5.g
    public final String l() {
        return t(Long.MAX_VALUE);
    }

    @Override // f5.g
    public final boolean m() {
        if (this.f4010d) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f4008b;
        return eVar.m() && this.f4009c.B(eVar, 8192L) == -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        e eVar = this.f4008b;
        if (eVar.f3977c == 0 && this.f4009c.B(eVar, 8192L) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    @Override // f5.g
    public final byte readByte() {
        y(1L);
        return this.f4008b.readByte();
    }

    @Override // f5.g
    public final int readInt() {
        y(4L);
        return this.f4008b.readInt();
    }

    @Override // f5.g
    public final short readShort() {
        y(2L);
        return this.f4008b.readShort();
    }

    @Override // f5.g
    public final void skip(long j5) {
        if (!this.f4010d) {
            while (j5 > 0) {
                e eVar = this.f4008b;
                if (eVar.f3977c == 0 && this.f4009c.B(eVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j5, eVar.f3977c);
                eVar.skip(min);
                j5 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f5.g
    public final String t(long j5) {
        long j6;
        if (j5 >= 0) {
            if (j5 == Long.MAX_VALUE) {
                j6 = Long.MAX_VALUE;
            } else {
                j6 = j5 + 1;
            }
            long c6 = c((byte) 10, 0L, j6);
            int i6 = (c6 > (-1L) ? 1 : (c6 == (-1L) ? 0 : -1));
            e eVar = this.f4008b;
            if (i6 != 0) {
                return eVar.w(c6);
            }
            if (j6 < Long.MAX_VALUE && h(j6) && eVar.j(j6 - 1) == 13 && h(1 + j6) && eVar.j(j6) == 10) {
                return eVar.w(j6);
            }
            e eVar2 = new e();
            eVar.h(eVar2, 0L, Math.min(32L, eVar.f3977c));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(eVar.f3977c, j5));
            sb.append(" content=");
            try {
                sb.append(new h(eVar2.q(eVar2.f3977c)).f());
                sb.append((char) 8230);
                throw new EOFException(sb.toString());
            } catch (EOFException e6) {
                throw new AssertionError(e6);
            }
        }
        throw new IllegalArgumentException("limit < 0: " + j5);
    }

    public final String toString() {
        return "buffer(" + this.f4009c + ")";
    }

    @Override // f5.g
    public final long v(e eVar) {
        e eVar2;
        long j5 = 0;
        while (true) {
            y yVar = this.f4009c;
            eVar2 = this.f4008b;
            if (yVar.B(eVar2, 8192L) == -1) {
                break;
            }
            long f6 = eVar2.f();
            if (f6 > 0) {
                j5 += f6;
                eVar.u(eVar2, f6);
            }
        }
        long j6 = eVar2.f3977c;
        if (j6 > 0) {
            long j7 = j5 + j6;
            eVar.u(eVar2, j6);
            return j7;
        }
        return j5;
    }

    @Override // f5.g
    public final void y(long j5) {
        if (!h(j5)) {
            throw new EOFException();
        }
    }
}
