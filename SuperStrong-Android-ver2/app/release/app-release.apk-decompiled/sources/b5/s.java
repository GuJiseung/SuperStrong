package b5;

import b5.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f2623h = Logger.getLogger(e.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public final f5.f f2624b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2625c;

    /* renamed from: d  reason: collision with root package name */
    public final f5.e f2626d;

    /* renamed from: e  reason: collision with root package name */
    public int f2627e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2628f;

    /* renamed from: g  reason: collision with root package name */
    public final d.b f2629g;

    public s(f5.f fVar, boolean z5) {
        this.f2624b = fVar;
        this.f2625c = z5;
        f5.e eVar = new f5.e();
        this.f2626d = eVar;
        this.f2629g = new d.b(eVar);
        this.f2627e = 16384;
    }

    public final synchronized void c(e0.e eVar) {
        int i6;
        int i7;
        if (!this.f2628f) {
            int i8 = this.f2627e;
            int i9 = eVar.f3804a;
            if ((i9 & 32) != 0) {
                i8 = ((int[]) eVar.f3805b)[5];
            }
            this.f2627e = i8;
            if ((i9 & 2) != 0) {
                i6 = ((int[]) eVar.f3805b)[1];
            } else {
                i6 = -1;
            }
            if (i6 != -1) {
                d.b bVar = this.f2629g;
                if ((i9 & 2) != 0) {
                    i7 = ((int[]) eVar.f3805b)[1];
                } else {
                    i7 = -1;
                }
                bVar.getClass();
                int min = Math.min(i7, 16384);
                int i10 = bVar.f2513d;
                if (i10 != min) {
                    if (min < i10) {
                        bVar.f2511b = Math.min(bVar.f2511b, min);
                    }
                    bVar.f2512c = true;
                    bVar.f2513d = min;
                    int i11 = bVar.f2517h;
                    if (min < i11) {
                        if (min == 0) {
                            Arrays.fill(bVar.f2514e, (Object) null);
                            bVar.f2515f = bVar.f2514e.length - 1;
                            bVar.f2516g = 0;
                            bVar.f2517h = 0;
                        } else {
                            bVar.a(i11 - min);
                        }
                    }
                }
            }
            h(0, 0, (byte) 4, (byte) 1);
            this.f2624b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f2628f = true;
        this.f2624b.close();
    }

    public final synchronized void f(boolean z5, int i6, f5.e eVar, int i7) {
        byte b6;
        if (!this.f2628f) {
            if (z5) {
                b6 = (byte) 1;
            } else {
                b6 = 0;
            }
            h(i6, i7, (byte) 0, b6);
            if (i7 > 0) {
                this.f2624b.u(eVar, i7);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void h(int i6, int i7, byte b6, byte b7) {
        Level level = Level.FINE;
        Logger logger = f2623h;
        if (logger.isLoggable(level)) {
            logger.fine(e.a(false, i6, i7, b6, b7));
        }
        int i8 = this.f2627e;
        if (i7 <= i8) {
            if ((Integer.MIN_VALUE & i6) == 0) {
                f5.f fVar = this.f2624b;
                fVar.writeByte((i7 >>> 16) & 255);
                fVar.writeByte((i7 >>> 8) & 255);
                fVar.writeByte(i7 & 255);
                fVar.writeByte(b6 & 255);
                fVar.writeByte(b7 & 255);
                fVar.writeInt(i6 & Integer.MAX_VALUE);
                return;
            }
            Object[] objArr = {Integer.valueOf(i6)};
            f5.h hVar = e.f2518a;
            throw new IllegalArgumentException(w4.e.i("reserved bit set: %s", objArr));
        }
        Object[] objArr2 = {Integer.valueOf(i8), Integer.valueOf(i7)};
        f5.h hVar2 = e.f2518a;
        throw new IllegalArgumentException(w4.e.i("FRAME_SIZE_ERROR length > %d: %d", objArr2));
    }

    public final synchronized void j(int i6, int i7, byte[] bArr) {
        if (!this.f2628f) {
            if (b.a(i7) != -1) {
                h(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f2624b.writeInt(i6);
                this.f2624b.writeInt(b.a(i7));
                if (bArr.length > 0) {
                    this.f2624b.write(bArr);
                }
                this.f2624b.flush();
            } else {
                f5.h hVar = e.f2518a;
                throw new IllegalArgumentException(w4.e.i("errorCode.httpCode == -1", new Object[0]));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(int i6, int i7, boolean z5) {
        if (this.f2628f) {
            throw new IOException("closed");
        }
        h(0, 8, (byte) 6, z5 ? (byte) 1 : (byte) 0);
        this.f2624b.writeInt(i6);
        this.f2624b.writeInt(i7);
        this.f2624b.flush();
    }

    public final synchronized void n(int i6, int i7) {
        if (this.f2628f) {
            throw new IOException("closed");
        }
        if (b.a(i7) == -1) {
            throw new IllegalArgumentException();
        }
        h(i6, 4, (byte) 3, (byte) 0);
        this.f2624b.writeInt(b.a(i7));
        this.f2624b.flush();
    }

    public final synchronized void o(int i6, long j5) {
        if (!this.f2628f) {
            if (j5 != 0 && j5 <= 2147483647L) {
                h(i6, 4, (byte) 8, (byte) 0);
                this.f2624b.writeInt((int) j5);
                this.f2624b.flush();
            } else {
                Object[] objArr = {Long.valueOf(j5)};
                f5.h hVar = e.f2518a;
                throw new IllegalArgumentException(w4.e.i("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void p(int i6, long j5) {
        while (j5 > 0) {
            int min = (int) Math.min(this.f2627e, j5);
            long j6 = min;
            j5 -= j6;
            h(i6, min, (byte) 9, j5 == 0 ? (byte) 4 : (byte) 0);
            this.f2624b.u(this.f2626d, j6);
        }
    }
}
