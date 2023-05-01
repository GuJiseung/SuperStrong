package f5;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f3975d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public u f3976b;

    /* renamed from: c  reason: collision with root package name */
    public long f3977c;

    /* loaded from: classes.dex */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(e.this.f3977c, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            e eVar = e.this;
            if (eVar.f3977c > 0) {
                return eVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i6, int i7) {
            return e.this.read(bArr, i6, i7);
        }

        public final String toString() {
            return e.this + ".inputStream()";
        }
    }

    @Override // f5.f
    public final /* bridge */ /* synthetic */ f A(long j5) {
        H(j5);
        return this;
    }

    @Override // f5.y
    public final long B(e eVar, long j5) {
        if (eVar != null) {
            if (j5 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j5);
            }
            long j6 = this.f3977c;
            if (j6 == 0) {
                return -1L;
            }
            if (j5 > j6) {
                j5 = j6;
            }
            eVar.u(this, j5);
            return j5;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[EDGE_INSN: B:42:0x0094->B:38:0x0094 ?: BREAK  , SYNTHETIC] */
    @Override // f5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long C() {
        /*
            r14 = this;
            long r0 = r14.f3977c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L9b
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            f5.u r6 = r14.f3976b
            byte[] r7 = r6.f4012a
            int r8 = r6.f4013b
            int r9 = r6.f4014c
        L13:
            if (r8 >= r9) goto L80
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L39
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-97)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L64
            r11 = 70
            if (r10 > r11) goto L64
            int r11 = r10 + (-65)
        L37:
            int r11 = r11 + 10
        L39:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L49
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L49:
            f5.e r0 = new f5.e
            r0.<init>()
            r0.I(r4)
            r0.G(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.s()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L64:
            if (r0 == 0) goto L68
            r1 = 1
            goto L80
        L68:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L80:
            if (r8 != r9) goto L8c
            f5.u r7 = r6.a()
            r14.f3976b = r7
            f5.v.a(r6)
            goto L8e
        L8c:
            r6.f4013b = r8
        L8e:
            if (r1 != 0) goto L94
            f5.u r6 = r14.f3976b
            if (r6 != 0) goto Lb
        L94:
            long r1 = r14.f3977c
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f3977c = r1
            return r4
        L9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.e.C():long");
    }

    @Override // f5.g
    public final InputStream D() {
        return new a();
    }

    public final u E(int i6) {
        if (i6 < 1 || i6 > 8192) {
            throw new IllegalArgumentException();
        }
        u uVar = this.f3976b;
        if (uVar == null) {
            u b6 = v.b();
            this.f3976b = b6;
            b6.f4018g = b6;
            b6.f4017f = b6;
            return b6;
        }
        u uVar2 = uVar.f4018g;
        if (uVar2.f4014c + i6 > 8192 || !uVar2.f4016e) {
            u b7 = v.b();
            uVar2.b(b7);
            return b7;
        }
        return uVar2;
    }

    public final void F(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        hVar.n(this);
    }

    public final void G(int i6) {
        u E = E(1);
        int i7 = E.f4014c;
        E.f4014c = i7 + 1;
        E.f4012a[i7] = (byte) i6;
        this.f3977c++;
    }

    public final e H(long j5) {
        byte[] bArr;
        int i6 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
        if (i6 == 0) {
            G(48);
            return this;
        }
        int i7 = 1;
        boolean z5 = false;
        if (i6 < 0) {
            j5 = -j5;
            if (j5 < 0) {
                L(0, 20, "-9223372036854775808");
                return this;
            }
            z5 = true;
        }
        if (j5 < 100000000) {
            if (j5 < 10000) {
                if (j5 < 100) {
                    if (j5 >= 10) {
                        i7 = 2;
                    }
                } else if (j5 < 1000) {
                    i7 = 3;
                } else {
                    i7 = 4;
                }
            } else if (j5 < 1000000) {
                if (j5 < 100000) {
                    i7 = 5;
                } else {
                    i7 = 6;
                }
            } else if (j5 < 10000000) {
                i7 = 7;
            } else {
                i7 = 8;
            }
        } else if (j5 < 1000000000000L) {
            if (j5 < 10000000000L) {
                if (j5 < 1000000000) {
                    i7 = 9;
                } else {
                    i7 = 10;
                }
            } else if (j5 < 100000000000L) {
                i7 = 11;
            } else {
                i7 = 12;
            }
        } else if (j5 < 1000000000000000L) {
            if (j5 < 10000000000000L) {
                i7 = 13;
            } else if (j5 < 100000000000000L) {
                i7 = 14;
            } else {
                i7 = 15;
            }
        } else if (j5 < 100000000000000000L) {
            if (j5 < 10000000000000000L) {
                i7 = 16;
            } else {
                i7 = 17;
            }
        } else if (j5 < 1000000000000000000L) {
            i7 = 18;
        } else {
            i7 = 19;
        }
        if (z5) {
            i7++;
        }
        u E = E(i7);
        int i8 = E.f4014c + i7;
        while (true) {
            int i9 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
            bArr = E.f4012a;
            if (i9 == 0) {
                break;
            }
            i8--;
            bArr[i8] = f3975d[(int) (j5 % 10)];
            j5 /= 10;
        }
        if (z5) {
            bArr[i8 - 1] = 45;
        }
        E.f4014c += i7;
        this.f3977c += i7;
        return this;
    }

    public final e I(long j5) {
        if (j5 == 0) {
            G(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j5)) / 4) + 1;
        u E = E(numberOfTrailingZeros);
        int i6 = E.f4014c;
        int i7 = i6 + numberOfTrailingZeros;
        while (true) {
            i7--;
            if (i7 < i6) {
                E.f4014c += numberOfTrailingZeros;
                this.f3977c += numberOfTrailingZeros;
                return this;
            }
            E.f4012a[i7] = f3975d[(int) (15 & j5)];
            j5 >>>= 4;
        }
    }

    public final void J(int i6) {
        u E = E(4);
        int i7 = E.f4014c;
        int i8 = i7 + 1;
        byte[] bArr = E.f4012a;
        bArr[i7] = (byte) ((i6 >>> 24) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i6 >>> 16) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i6 >>> 8) & 255);
        bArr[i10] = (byte) (i6 & 255);
        E.f4014c = i10 + 1;
        this.f3977c += 4;
    }

    public final void K(int i6) {
        u E = E(2);
        int i7 = E.f4014c;
        int i8 = i7 + 1;
        byte[] bArr = E.f4012a;
        bArr[i7] = (byte) ((i6 >>> 8) & 255);
        bArr[i8] = (byte) (i6 & 255);
        E.f4014c = i8 + 1;
        this.f3977c += 2;
    }

    public final void L(int i6, int i7, String str) {
        char charAt;
        int i8;
        char c6;
        if (str != null) {
            if (i6 >= 0) {
                if (i7 >= i6) {
                    if (i7 <= str.length()) {
                        while (i6 < i7) {
                            char charAt2 = str.charAt(i6);
                            if (charAt2 < 128) {
                                u E = E(1);
                                int i9 = E.f4014c - i6;
                                int min = Math.min(i7, 8192 - i9);
                                int i10 = i6 + 1;
                                byte[] bArr = E.f4012a;
                                bArr[i6 + i9] = (byte) charAt2;
                                while (true) {
                                    i6 = i10;
                                    if (i6 >= min || (charAt = str.charAt(i6)) >= 128) {
                                        break;
                                    }
                                    i10 = i6 + 1;
                                    bArr[i6 + i9] = (byte) charAt;
                                }
                                int i11 = E.f4014c;
                                int i12 = (i9 + i6) - i11;
                                E.f4014c = i11 + i12;
                                this.f3977c += i12;
                            } else {
                                if (charAt2 < 2048) {
                                    i8 = (charAt2 >> 6) | 192;
                                } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                    int i13 = i6 + 1;
                                    if (i13 < i7) {
                                        c6 = str.charAt(i13);
                                    } else {
                                        c6 = 0;
                                    }
                                    if (charAt2 <= 56319 && c6 >= 56320 && c6 <= 57343) {
                                        int i14 = (((charAt2 & 10239) << 10) | (9215 & c6)) + 65536;
                                        G((i14 >> 18) | 240);
                                        G(((i14 >> 12) & 63) | 128);
                                        G(((i14 >> 6) & 63) | 128);
                                        G((i14 & 63) | 128);
                                        i6 += 2;
                                    } else {
                                        G(63);
                                        i6 = i13;
                                    }
                                } else {
                                    G((charAt2 >> '\f') | 224);
                                    i8 = ((charAt2 >> 6) & 63) | 128;
                                }
                                G(i8);
                                G((charAt2 & '?') | 128);
                                i6++;
                            }
                        }
                        return;
                    }
                    throw new IllegalArgumentException("endIndex > string.length: " + i7 + " > " + str.length());
                }
                throw new IllegalArgumentException("endIndex < beginIndex: " + i7 + " < " + i6);
            }
            throw new IllegalArgumentException(androidx.activity.j.a("beginIndex < 0: ", i6));
        }
        throw new IllegalArgumentException("string == null");
    }

    public final void M(int i6) {
        int i7;
        int i8;
        if (i6 >= 128) {
            if (i6 < 2048) {
                i8 = (i6 >> 6) | 192;
            } else {
                if (i6 < 65536) {
                    if (i6 >= 55296 && i6 <= 57343) {
                        G(63);
                        return;
                    }
                    i7 = (i6 >> 12) | 224;
                } else if (i6 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i6));
                } else {
                    G((i6 >> 18) | 240);
                    i7 = ((i6 >> 12) & 63) | 128;
                }
                G(i7);
                i8 = ((i6 >> 6) & 63) | 128;
            }
            G(i8);
            i6 = (i6 & 63) | 128;
        }
        G(i6);
    }

    @Override // f5.g, f5.f
    public final e a() {
        return this;
    }

    @Override // f5.y
    public final z b() {
        return z.f4023d;
    }

    public final void c() {
        try {
            skip(this.f3977c);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f3977c != 0) {
            u c6 = this.f3976b.c();
            eVar.f3976b = c6;
            c6.f4018g = c6;
            c6.f4017f = c6;
            u uVar = this.f3976b;
            while (true) {
                uVar = uVar.f4017f;
                if (uVar == this.f3976b) {
                    break;
                }
                eVar.f3976b.f4018g.b(uVar.c());
            }
            eVar.f3977c = this.f3977c;
        }
        return eVar;
    }

    @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // f5.f
    public final /* bridge */ /* synthetic */ f d(long j5) {
        I(j5);
        return this;
    }

    @Override // f5.g
    public final h e(long j5) {
        return new h(q(j5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            long j5 = this.f3977c;
            if (j5 != eVar.f3977c) {
                return false;
            }
            long j6 = 0;
            if (j5 == 0) {
                return true;
            }
            u uVar = this.f3976b;
            u uVar2 = eVar.f3976b;
            int i6 = uVar.f4013b;
            int i7 = uVar2.f4013b;
            while (j6 < this.f3977c) {
                long min = Math.min(uVar.f4014c - i6, uVar2.f4014c - i7);
                int i8 = 0;
                while (i8 < min) {
                    int i9 = i6 + 1;
                    int i10 = i7 + 1;
                    if (uVar.f4012a[i6] != uVar2.f4012a[i7]) {
                        return false;
                    }
                    i8++;
                    i6 = i9;
                    i7 = i10;
                }
                if (i6 == uVar.f4014c) {
                    uVar = uVar.f4017f;
                    i6 = uVar.f4013b;
                }
                if (i7 == uVar2.f4014c) {
                    uVar2 = uVar2.f4017f;
                    i7 = uVar2.f4013b;
                }
                j6 += min;
            }
            return true;
        }
        return false;
    }

    public final long f() {
        long j5 = this.f3977c;
        if (j5 == 0) {
            return 0L;
        }
        u uVar = this.f3976b.f4018g;
        int i6 = uVar.f4014c;
        return (i6 >= 8192 || !uVar.f4016e) ? j5 : j5 - (i6 - uVar.f4013b);
    }

    @Override // f5.f, f5.x, java.io.Flushable
    public final void flush() {
    }

    @Override // f5.f
    public final /* bridge */ /* synthetic */ f g(h hVar) {
        F(hVar);
        return this;
    }

    public final void h(e eVar, long j5, long j6) {
        if (eVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        a0.a(this.f3977c, j5, j6);
        if (j6 == 0) {
            return;
        }
        eVar.f3977c += j6;
        u uVar = this.f3976b;
        while (true) {
            long j7 = uVar.f4014c - uVar.f4013b;
            if (j5 < j7) {
                break;
            }
            j5 -= j7;
            uVar = uVar.f4017f;
        }
        while (j6 > 0) {
            u c6 = uVar.c();
            int i6 = (int) (c6.f4013b + j5);
            c6.f4013b = i6;
            c6.f4014c = Math.min(i6 + ((int) j6), c6.f4014c);
            u uVar2 = eVar.f3976b;
            if (uVar2 == null) {
                c6.f4018g = c6;
                c6.f4017f = c6;
                eVar.f3976b = c6;
            } else {
                uVar2.f4018g.b(c6);
            }
            j6 -= c6.f4014c - c6.f4013b;
            uVar = uVar.f4017f;
            j5 = 0;
        }
    }

    public final int hashCode() {
        u uVar = this.f3976b;
        if (uVar == null) {
            return 0;
        }
        int i6 = 1;
        do {
            int i7 = uVar.f4014c;
            for (int i8 = uVar.f4013b; i8 < i7; i8++) {
                i6 = (i6 * 31) + uVar.f4012a[i8];
            }
            uVar = uVar.f4017f;
        } while (uVar != this.f3976b);
        return i6;
    }

    @Override // f5.g
    public final int i(r rVar) {
        int x5 = x(rVar, false);
        if (x5 == -1) {
            return -1;
        }
        try {
            skip(rVar.f4003b[x5].j());
            return x5;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte j(long j5) {
        int i6;
        a0.a(this.f3977c, j5, 1L);
        long j6 = this.f3977c;
        if (j6 - j5 <= j5) {
            long j7 = j5 - j6;
            u uVar = this.f3976b;
            do {
                uVar = uVar.f4018g;
                int i7 = uVar.f4014c;
                i6 = uVar.f4013b;
                j7 += i7 - i6;
            } while (j7 < 0);
            return uVar.f4012a[i6 + ((int) j7)];
        }
        u uVar2 = this.f3976b;
        while (true) {
            int i8 = uVar2.f4014c;
            int i9 = uVar2.f4013b;
            long j8 = i8 - i9;
            if (j5 < j8) {
                return uVar2.f4012a[i9 + ((int) j5)];
            }
            j5 -= j8;
            uVar2 = uVar2.f4017f;
        }
    }

    @Override // f5.g
    public final String l() {
        return t(Long.MAX_VALUE);
    }

    @Override // f5.g
    public final boolean m() {
        return this.f3977c == 0;
    }

    public final long p(byte b6, long j5, long j6) {
        u uVar;
        long j7 = 0;
        if (j5 < 0 || j6 < j5) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f3977c), Long.valueOf(j5), Long.valueOf(j6)));
        }
        long j8 = this.f3977c;
        long j9 = j6 > j8 ? j8 : j6;
        if (j5 == j9 || (uVar = this.f3976b) == null) {
            return -1L;
        }
        if (j8 - j5 < j5) {
            while (j8 > j5) {
                uVar = uVar.f4018g;
                j8 -= uVar.f4014c - uVar.f4013b;
            }
        } else {
            while (true) {
                long j10 = (uVar.f4014c - uVar.f4013b) + j7;
                if (j10 >= j5) {
                    break;
                }
                uVar = uVar.f4017f;
                j7 = j10;
            }
            j8 = j7;
        }
        long j11 = j5;
        while (j8 < j9) {
            byte[] bArr = uVar.f4012a;
            int min = (int) Math.min(uVar.f4014c, (uVar.f4013b + j9) - j8);
            for (int i6 = (int) ((uVar.f4013b + j11) - j8); i6 < min; i6++) {
                if (bArr[i6] == b6) {
                    return (i6 - uVar.f4013b) + j8;
                }
            }
            j8 += uVar.f4014c - uVar.f4013b;
            uVar = uVar.f4017f;
            j11 = j8;
        }
        return -1L;
    }

    public final byte[] q(long j5) {
        a0.a(this.f3977c, 0L, j5);
        if (j5 <= 2147483647L) {
            int i6 = (int) j5;
            byte[] bArr = new byte[i6];
            int i7 = 0;
            while (i7 < i6) {
                int read = read(bArr, i7, i6 - i7);
                if (read != -1) {
                    i7 += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j5);
    }

    public final String r(long j5, Charset charset) {
        a0.a(this.f3977c, 0L, j5);
        if (charset != null) {
            if (j5 > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j5);
            } else if (j5 == 0) {
                return "";
            } else {
                u uVar = this.f3976b;
                int i6 = uVar.f4013b;
                if (i6 + j5 > uVar.f4014c) {
                    return new String(q(j5), charset);
                }
                String str = new String(uVar.f4012a, i6, (int) j5, charset);
                int i7 = (int) (uVar.f4013b + j5);
                uVar.f4013b = i7;
                this.f3977c -= j5;
                if (i7 == uVar.f4014c) {
                    this.f3976b = uVar.a();
                    v.a(uVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        u uVar = this.f3976b;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f4014c - uVar.f4013b);
        byteBuffer.put(uVar.f4012a, uVar.f4013b, min);
        int i6 = uVar.f4013b + min;
        uVar.f4013b = i6;
        this.f3977c -= min;
        if (i6 == uVar.f4014c) {
            this.f3976b = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    public final int read(byte[] bArr, int i6, int i7) {
        a0.a(bArr.length, i6, i7);
        u uVar = this.f3976b;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i7, uVar.f4014c - uVar.f4013b);
        System.arraycopy(uVar.f4012a, uVar.f4013b, bArr, i6, min);
        int i8 = uVar.f4013b + min;
        uVar.f4013b = i8;
        this.f3977c -= min;
        if (i8 == uVar.f4014c) {
            this.f3976b = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // f5.g
    public final byte readByte() {
        long j5 = this.f3977c;
        if (j5 != 0) {
            u uVar = this.f3976b;
            int i6 = uVar.f4013b;
            int i7 = uVar.f4014c;
            int i8 = i6 + 1;
            byte b6 = uVar.f4012a[i6];
            this.f3977c = j5 - 1;
            if (i8 == i7) {
                this.f3976b = uVar.a();
                v.a(uVar);
            } else {
                uVar.f4013b = i8;
            }
            return b6;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // f5.g
    public final int readInt() {
        long j5 = this.f3977c;
        if (j5 < 4) {
            throw new IllegalStateException("size < 4: " + this.f3977c);
        }
        u uVar = this.f3976b;
        int i6 = uVar.f4013b;
        int i7 = uVar.f4014c;
        if (i7 - i6 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        int i8 = i6 + 1;
        byte[] bArr = uVar.f4012a;
        int i9 = i8 + 1;
        int i10 = ((bArr[i6] & 255) << 24) | ((bArr[i8] & 255) << 16);
        int i11 = i9 + 1;
        int i12 = i10 | ((bArr[i9] & 255) << 8);
        int i13 = i11 + 1;
        int i14 = i12 | (bArr[i11] & 255);
        this.f3977c = j5 - 4;
        if (i13 == i7) {
            this.f3976b = uVar.a();
            v.a(uVar);
        } else {
            uVar.f4013b = i13;
        }
        return i14;
    }

    @Override // f5.g
    public final short readShort() {
        long j5 = this.f3977c;
        if (j5 < 2) {
            throw new IllegalStateException("size < 2: " + this.f3977c);
        }
        u uVar = this.f3976b;
        int i6 = uVar.f4013b;
        int i7 = uVar.f4014c;
        if (i7 - i6 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i8 = i6 + 1;
        byte[] bArr = uVar.f4012a;
        int i9 = i8 + 1;
        int i10 = ((bArr[i6] & 255) << 8) | (bArr[i8] & 255);
        this.f3977c = j5 - 2;
        if (i9 == i7) {
            this.f3976b = uVar.a();
            v.a(uVar);
        } else {
            uVar.f4013b = i9;
        }
        return (short) i10;
    }

    public final String s() {
        try {
            return r(this.f3977c, a0.f3965a);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // f5.g
    public final void skip(long j5) {
        u uVar;
        while (j5 > 0) {
            if (this.f3976b == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j5, uVar.f4014c - uVar.f4013b);
            long j6 = min;
            this.f3977c -= j6;
            j5 -= j6;
            u uVar2 = this.f3976b;
            int i6 = uVar2.f4013b + min;
            uVar2.f4013b = i6;
            if (i6 == uVar2.f4014c) {
                this.f3976b = uVar2.a();
                v.a(uVar2);
            }
        }
    }

    @Override // f5.g
    public final String t(long j5) {
        if (j5 >= 0) {
            long j6 = Long.MAX_VALUE;
            if (j5 != Long.MAX_VALUE) {
                j6 = j5 + 1;
            }
            long p5 = p((byte) 10, 0L, j6);
            if (p5 != -1) {
                return w(p5);
            }
            if (j6 < this.f3977c && j(j6 - 1) == 13 && j(j6) == 10) {
                return w(j6);
            }
            e eVar = new e();
            h(eVar, 0L, Math.min(32L, this.f3977c));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.f3977c, j5));
            sb.append(" content=");
            try {
                sb.append(new h(eVar.q(eVar.f3977c)).f());
                sb.append((char) 8230);
                throw new EOFException(sb.toString());
            } catch (EOFException e6) {
                throw new AssertionError(e6);
            }
        }
        throw new IllegalArgumentException("limit < 0: " + j5);
    }

    public final String toString() {
        h wVar;
        long j5 = this.f3977c;
        if (j5 <= 2147483647L) {
            int i6 = (int) j5;
            if (i6 == 0) {
                wVar = h.f3980f;
            } else {
                wVar = new w(this, i6);
            }
            return wVar.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f3977c);
    }

    @Override // f5.x
    public final void u(e eVar, long j5) {
        u uVar;
        u b6;
        int i6;
        if (eVar != null) {
            if (eVar != this) {
                a0.a(eVar.f3977c, 0L, j5);
                while (j5 > 0) {
                    u uVar2 = eVar.f3976b;
                    int i7 = uVar2.f4014c - uVar2.f4013b;
                    int i8 = 0;
                    if (j5 < i7) {
                        u uVar3 = this.f3976b;
                        if (uVar3 != null) {
                            uVar = uVar3.f4018g;
                        } else {
                            uVar = null;
                        }
                        if (uVar != null && uVar.f4016e) {
                            long j6 = uVar.f4014c + j5;
                            if (uVar.f4015d) {
                                i6 = 0;
                            } else {
                                i6 = uVar.f4013b;
                            }
                            if (j6 - i6 <= 8192) {
                                uVar2.d(uVar, (int) j5);
                                eVar.f3977c -= j5;
                                this.f3977c += j5;
                                return;
                            }
                        }
                        int i9 = (int) j5;
                        if (i9 > 0 && i9 <= i7) {
                            if (i9 >= 1024) {
                                b6 = uVar2.c();
                            } else {
                                b6 = v.b();
                                System.arraycopy(uVar2.f4012a, uVar2.f4013b, b6.f4012a, 0, i9);
                            }
                            b6.f4014c = b6.f4013b + i9;
                            uVar2.f4013b += i9;
                            uVar2.f4018g.b(b6);
                            eVar.f3976b = b6;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    u uVar4 = eVar.f3976b;
                    long j7 = uVar4.f4014c - uVar4.f4013b;
                    eVar.f3976b = uVar4.a();
                    u uVar5 = this.f3976b;
                    if (uVar5 == null) {
                        this.f3976b = uVar4;
                        uVar4.f4018g = uVar4;
                        uVar4.f4017f = uVar4;
                    } else {
                        uVar5.f4018g.b(uVar4);
                        u uVar6 = uVar4.f4018g;
                        if (uVar6 != uVar4) {
                            if (uVar6.f4016e) {
                                int i10 = uVar4.f4014c - uVar4.f4013b;
                                int i11 = 8192 - uVar6.f4014c;
                                if (!uVar6.f4015d) {
                                    i8 = uVar6.f4013b;
                                }
                                if (i10 <= i11 + i8) {
                                    uVar4.d(uVar6, i10);
                                    uVar4.a();
                                    v.a(uVar4);
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    eVar.f3977c -= j7;
                    this.f3977c += j7;
                    j5 -= j7;
                }
                return;
            }
            throw new IllegalArgumentException("source == this");
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // f5.g
    public final long v(e eVar) {
        long j5 = this.f3977c;
        if (j5 > 0) {
            eVar.u(this, j5);
        }
        return j5;
    }

    public final String w(long j5) {
        if (j5 > 0) {
            long j6 = j5 - 1;
            if (j(j6) == 13) {
                String r5 = r(j6, a0.f3965a);
                skip(2L);
                return r5;
            }
        }
        String r6 = r(j5, a0.f3965a);
        skip(1L);
        return r6;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i6 = remaining;
            while (i6 > 0) {
                u E = E(1);
                int min = Math.min(i6, 8192 - E.f4014c);
                byteBuffer.get(E.f4012a, E.f4014c, min);
                i6 -= min;
                E.f4014c += min;
            }
            this.f3977c += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // f5.f
    public final f write(byte[] bArr) {
        if (bArr != null) {
            m0write(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // f5.f
    public final /* bridge */ /* synthetic */ f write(byte[] bArr, int i6, int i7) {
        m0write(bArr, i6, i7);
        return this;
    }

    /* renamed from: write  reason: collision with other method in class */
    public final void m0write(byte[] bArr, int i6, int i7) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j5 = i7;
        a0.a(bArr.length, i6, j5);
        int i8 = i7 + i6;
        while (i6 < i8) {
            u E = E(1);
            int min = Math.min(i8 - i6, 8192 - E.f4014c);
            System.arraycopy(bArr, i6, E.f4012a, E.f4014c, min);
            i6 += min;
            E.f4014c += min;
        }
        this.f3977c += j5;
    }

    @Override // f5.f
    public final /* bridge */ /* synthetic */ f writeByte(int i6) {
        G(i6);
        return this;
    }

    @Override // f5.f
    public final /* bridge */ /* synthetic */ f writeInt(int i6) {
        J(i6);
        return this;
    }

    @Override // f5.f
    public final /* bridge */ /* synthetic */ f writeShort(int i6) {
        K(i6);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x(f5.r r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.e.x(f5.r, boolean):int");
    }

    @Override // f5.g
    public final void y(long j5) {
        if (this.f3977c < j5) {
            throw new EOFException();
        }
    }

    @Override // f5.f
    public final f z(String str) {
        L(0, str.length(), str);
        return this;
    }
}
