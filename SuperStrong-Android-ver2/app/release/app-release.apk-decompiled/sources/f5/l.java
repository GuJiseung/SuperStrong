package f5;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class l implements y {

    /* renamed from: c  reason: collision with root package name */
    public final t f3988c;

    /* renamed from: d  reason: collision with root package name */
    public final Inflater f3989d;

    /* renamed from: e  reason: collision with root package name */
    public final m f3990e;

    /* renamed from: b  reason: collision with root package name */
    public int f3987b = 0;

    /* renamed from: f  reason: collision with root package name */
    public final CRC32 f3991f = new CRC32();

    public l(y yVar) {
        if (yVar != null) {
            Inflater inflater = new Inflater(true);
            this.f3989d = inflater;
            Logger logger = q.f4001a;
            t tVar = new t(yVar);
            this.f3988c = tVar;
            this.f3990e = new m(tVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public static void c(int i6, int i7, String str) {
        if (i7 != i6) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i7), Integer.valueOf(i6)));
        }
    }

    @Override // f5.y
    public final long B(e eVar, long j5) {
        t tVar;
        boolean z5;
        e eVar2;
        long j6;
        int i6 = this.f3987b;
        CRC32 crc32 = this.f3991f;
        t tVar2 = this.f3988c;
        if (i6 == 0) {
            tVar2.y(10L);
            e eVar3 = tVar2.f4008b;
            byte j7 = eVar3.j(3L);
            if (((j7 >> 1) & 1) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                f(tVar2.f4008b, 0L, 10L);
            }
            c(8075, tVar2.readShort(), "ID1ID2");
            tVar2.skip(8L);
            if (((j7 >> 2) & 1) == 1) {
                tVar2.y(2L);
                if (z5) {
                    f(tVar2.f4008b, 0L, 2L);
                }
                short readShort = eVar3.readShort();
                Charset charset = a0.f3965a;
                int i7 = readShort & 65535;
                long j8 = (short) (((i7 & 255) << 8) | ((i7 & 65280) >>> 8));
                tVar2.y(j8);
                if (z5) {
                    f(tVar2.f4008b, 0L, j8);
                    j6 = j8;
                } else {
                    j6 = j8;
                }
                tVar2.skip(j6);
            }
            if (((j7 >> 3) & 1) == 1) {
                eVar2 = eVar3;
                long c6 = tVar2.c((byte) 0, 0L, Long.MAX_VALUE);
                if (c6 != -1) {
                    if (z5) {
                        tVar = tVar2;
                        f(tVar2.f4008b, 0L, c6 + 1);
                    } else {
                        tVar = tVar2;
                    }
                    tVar.skip(c6 + 1);
                } else {
                    throw new EOFException();
                }
            } else {
                eVar2 = eVar3;
                tVar = tVar2;
            }
            if (((j7 >> 4) & 1) == 1) {
                long c7 = tVar.c((byte) 0, 0L, Long.MAX_VALUE);
                if (c7 != -1) {
                    if (z5) {
                        f(tVar.f4008b, 0L, c7 + 1);
                    }
                    tVar.skip(c7 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (z5) {
                tVar.y(2L);
                short readShort2 = eVar2.readShort();
                Charset charset2 = a0.f3965a;
                int i8 = readShort2 & 65535;
                c((short) (((i8 & 255) << 8) | ((i8 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f3987b = 1;
        } else {
            tVar = tVar2;
        }
        if (this.f3987b == 1) {
            long j9 = eVar.f3977c;
            long B = this.f3990e.B(eVar, 8192L);
            if (B != -1) {
                f(eVar, j9, B);
                return B;
            }
            this.f3987b = 2;
        }
        if (this.f3987b == 2) {
            tVar.y(4L);
            int readInt = tVar.f4008b.readInt();
            Charset charset3 = a0.f3965a;
            c(((readInt & 255) << 24) | ((readInt & (-16777216)) >>> 24) | ((readInt & 16711680) >>> 8) | ((readInt & 65280) << 8), (int) crc32.getValue(), "CRC");
            tVar.y(4L);
            int readInt2 = tVar.f4008b.readInt();
            c(((readInt2 & 255) << 24) | ((readInt2 & (-16777216)) >>> 24) | ((readInt2 & 16711680) >>> 8) | ((65280 & readInt2) << 8), (int) this.f3989d.getBytesWritten(), "ISIZE");
            this.f3987b = 3;
            if (!tVar.m()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // f5.y
    public final z b() {
        return this.f3988c.b();
    }

    @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3990e.close();
    }

    public final void f(e eVar, long j5, long j6) {
        int i6;
        u uVar = eVar.f3976b;
        while (true) {
            int i7 = uVar.f4014c;
            int i8 = uVar.f4013b;
            if (j5 < i7 - i8) {
                break;
            }
            j5 -= i7 - i8;
            uVar = uVar.f4017f;
        }
        while (j6 > 0) {
            int min = (int) Math.min(uVar.f4014c - i6, j6);
            this.f3991f.update(uVar.f4012a, (int) (uVar.f4013b + j5), min);
            j6 -= min;
            uVar = uVar.f4017f;
            j5 = 0;
        }
    }
}
