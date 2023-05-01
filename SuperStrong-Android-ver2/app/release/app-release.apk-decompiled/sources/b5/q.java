package b5;

import b5.d;
import b5.g;
import b5.r;
import f5.y;
import f5.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class q implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f2589f = Logger.getLogger(e.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public final f5.g f2590b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2591c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2592d;

    /* renamed from: e  reason: collision with root package name */
    public final d.a f2593e;

    /* loaded from: classes.dex */
    public static final class a implements y {

        /* renamed from: b  reason: collision with root package name */
        public final f5.g f2594b;

        /* renamed from: c  reason: collision with root package name */
        public int f2595c;

        /* renamed from: d  reason: collision with root package name */
        public byte f2596d;

        /* renamed from: e  reason: collision with root package name */
        public int f2597e;

        /* renamed from: f  reason: collision with root package name */
        public int f2598f;

        /* renamed from: g  reason: collision with root package name */
        public short f2599g;

        public a(f5.g gVar) {
            this.f2594b = gVar;
        }

        @Override // f5.y
        public final long B(f5.e eVar, long j5) {
            int i6;
            int readInt;
            do {
                int i7 = this.f2598f;
                f5.g gVar = this.f2594b;
                if (i7 == 0) {
                    gVar.skip(this.f2599g);
                    this.f2599g = (short) 0;
                    if ((this.f2596d & 4) != 0) {
                        return -1L;
                    }
                    i6 = this.f2597e;
                    int readByte = ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8) | (gVar.readByte() & 255);
                    this.f2598f = readByte;
                    this.f2595c = readByte;
                    byte readByte2 = (byte) (gVar.readByte() & 255);
                    this.f2596d = (byte) (gVar.readByte() & 255);
                    Logger logger = q.f2589f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(e.a(true, this.f2597e, this.f2595c, readByte2, this.f2596d));
                    }
                    readInt = gVar.readInt() & Integer.MAX_VALUE;
                    this.f2597e = readInt;
                    if (readByte2 != 9) {
                        e.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte2));
                        throw null;
                    }
                } else {
                    long B = gVar.B(eVar, Math.min(8192L, i7));
                    if (B == -1) {
                        return -1L;
                    }
                    this.f2598f = (int) (this.f2598f - B);
                    return B;
                }
            } while (readInt == i6);
            e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // f5.y
        public final z b() {
            return this.f2594b.b();
        }

        @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public q(f5.g gVar, boolean z5) {
        this.f2590b = gVar;
        this.f2592d = z5;
        a aVar = new a(gVar);
        this.f2591c = aVar;
        this.f2593e = new d.a(aVar);
    }

    public static int c(int i6, byte b6, short s) {
        if ((b6 & 8) != 0) {
            i6--;
        }
        if (s <= i6) {
            return (short) (i6 - s);
        }
        e.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i6));
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2590b.close();
    }

    public final boolean f(boolean z5, b bVar) {
        boolean z6;
        boolean z7;
        short s;
        boolean z8;
        short s5;
        boolean z9;
        boolean z10;
        long j5;
        boolean z11;
        long j6;
        boolean z12;
        short s6;
        boolean z13;
        int i6;
        boolean z14;
        short s7;
        try {
            this.f2590b.y(9L);
            f5.g gVar = this.f2590b;
            int readByte = (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
            if (readByte >= 0 && readByte <= 16384) {
                byte readByte2 = (byte) (this.f2590b.readByte() & 255);
                int i7 = 4;
                if (z5 && readByte2 != 4) {
                    e.b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte2));
                    throw null;
                }
                byte readByte3 = (byte) (this.f2590b.readByte() & 255);
                int readInt = this.f2590b.readInt() & Integer.MAX_VALUE;
                Logger logger = f2589f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.a(true, readInt, readByte, readByte2, readByte3));
                }
                switch (readByte2) {
                    case 0:
                        if (readInt != 0) {
                            if ((readByte3 & 1) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if ((readByte3 & 32) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (!z7) {
                                if ((readByte3 & 8) != 0) {
                                    s = (short) (this.f2590b.readByte() & 255);
                                } else {
                                    s = 0;
                                }
                                int c6 = c(readByte, readByte3, s);
                                f5.g gVar2 = this.f2590b;
                                g.f fVar = (g.f) bVar;
                                g.this.getClass();
                                if (readInt != 0 && (readInt & 1) == 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    g gVar3 = g.this;
                                    gVar3.getClass();
                                    f5.e eVar = new f5.e();
                                    long j7 = c6;
                                    gVar2.y(j7);
                                    gVar2.B(eVar, j7);
                                    if (eVar.f3977c == j7) {
                                        gVar3.j(new k(gVar3, new Object[]{gVar3.f2529e, Integer.valueOf(readInt)}, readInt, eVar, c6, z6));
                                    } else {
                                        throw new IOException(eVar.f3977c + " != " + c6);
                                    }
                                } else {
                                    r h6 = g.this.h(readInt);
                                    if (h6 == null) {
                                        g.this.q(readInt, 2);
                                        long j8 = c6;
                                        g.this.o(j8);
                                        gVar2.skip(j8);
                                    } else {
                                        r.b bVar2 = h6.f2606g;
                                        long j9 = c6;
                                        while (true) {
                                            if (j9 > 0) {
                                                synchronized (r.this) {
                                                    z9 = bVar2.f2620f;
                                                    s5 = s;
                                                    if (bVar2.f2617c.f3977c + j9 > bVar2.f2618d) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                }
                                                if (z10) {
                                                    gVar2.skip(j9);
                                                    r.this.e(i7);
                                                } else if (z9) {
                                                    gVar2.skip(j9);
                                                } else {
                                                    long B = gVar2.B(bVar2.f2616b, j9);
                                                    if (B != -1) {
                                                        long j10 = j9 - B;
                                                        synchronized (r.this) {
                                                            if (bVar2.f2619e) {
                                                                f5.e eVar2 = bVar2.f2616b;
                                                                j6 = eVar2.f3977c;
                                                                eVar2.c();
                                                                j5 = j10;
                                                            } else {
                                                                f5.e eVar3 = bVar2.f2617c;
                                                                j5 = j10;
                                                                if (eVar3.f3977c == 0) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                                f5.e eVar4 = bVar2.f2616b;
                                                                if (eVar4 != null) {
                                                                    while (eVar4.B(eVar3, 8192L) != -1) {
                                                                    }
                                                                    if (z11) {
                                                                        r.this.notifyAll();
                                                                    }
                                                                    j6 = 0;
                                                                } else {
                                                                    throw new IllegalArgumentException("source == null");
                                                                }
                                                            }
                                                        }
                                                        if (j6 > 0) {
                                                            r.this.f2603d.o(j6);
                                                        }
                                                        j9 = j5;
                                                        s = s5;
                                                        i7 = 4;
                                                    } else {
                                                        throw new EOFException();
                                                    }
                                                }
                                            } else {
                                                s5 = s;
                                                bVar2.getClass();
                                            }
                                        }
                                        if (z6) {
                                            h6.h(w4.e.f6595c, true);
                                        }
                                        this.f2590b.skip(s5);
                                        return true;
                                    }
                                }
                                s5 = s;
                                this.f2590b.skip(s5);
                                return true;
                            }
                            e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            throw null;
                        }
                        e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    case 1:
                        if (readInt != 0) {
                            if ((readByte3 & 1) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if ((readByte3 & 8) != 0) {
                                s6 = (short) (this.f2590b.readByte() & 255);
                            } else {
                                s6 = 0;
                            }
                            if ((readByte3 & 32) != 0) {
                                f5.g gVar4 = this.f2590b;
                                gVar4.readInt();
                                gVar4.readByte();
                                bVar.getClass();
                                readByte -= 5;
                            }
                            ArrayList k5 = k(c(readByte, readByte3, s6), s6, readByte3, readInt);
                            g.f fVar2 = (g.f) bVar;
                            g.this.getClass();
                            if (readInt != 0 && (readInt & 1) == 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                g gVar5 = g.this;
                                gVar5.getClass();
                                gVar5.j(new j(gVar5, new Object[]{gVar5.f2529e, Integer.valueOf(readInt)}, readInt, k5, z12));
                                return true;
                            }
                            synchronized (g.this) {
                                try {
                                    r h7 = g.this.h(readInt);
                                    if (h7 == null) {
                                        g gVar6 = g.this;
                                        if (!gVar6.f2532h && readInt > gVar6.f2530f && readInt % 2 != gVar6.f2531g % 2) {
                                            r rVar = new r(readInt, g.this, false, z12, w4.e.t(k5));
                                            g gVar7 = g.this;
                                            gVar7.f2530f = readInt;
                                            gVar7.f2528d.put(Integer.valueOf(readInt), rVar);
                                            g.f2525y.execute(new m(fVar2, new Object[]{g.this.f2529e, Integer.valueOf(readInt)}, rVar));
                                        }
                                    } else {
                                        h7.h(w4.e.t(k5), z12);
                                    }
                                } finally {
                                }
                            }
                            return true;
                        }
                        e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        throw null;
                    case 2:
                        if (readByte == 5) {
                            if (readInt != 0) {
                                f5.g gVar8 = this.f2590b;
                                gVar8.readInt();
                                gVar8.readByte();
                                bVar.getClass();
                                return true;
                            }
                            e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                        e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(readByte));
                        throw null;
                    case 3:
                        if (readByte == 4) {
                            if (readInt != 0) {
                                int readInt2 = this.f2590b.readInt();
                                int[] _values = b5.b._values();
                                int length = _values.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < length) {
                                        i6 = _values[i8];
                                        if (b5.b.a(i6) != readInt2) {
                                            i8++;
                                        }
                                    } else {
                                        i6 = 0;
                                    }
                                }
                                if (i6 != 0) {
                                    g gVar9 = g.this;
                                    gVar9.getClass();
                                    if (readInt != 0 && (readInt & 1) == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        gVar9.j(new l(gVar9, new Object[]{gVar9.f2529e, Integer.valueOf(readInt)}, readInt, i6));
                                    } else {
                                        r k6 = gVar9.k(readInt);
                                        if (k6 != null) {
                                            synchronized (k6) {
                                                if (k6.f2610k == 0) {
                                                    k6.f2610k = i6;
                                                    k6.notifyAll();
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                                e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                                throw null;
                            }
                            e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(readByte));
                        throw null;
                    case 4:
                        if (readInt == 0) {
                            if ((readByte3 & 1) != 0) {
                                if (readByte == 0) {
                                    bVar.getClass();
                                    return true;
                                }
                                e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                                throw null;
                            } else if (readByte % 6 == 0) {
                                e0.e eVar5 = new e0.e();
                                for (int i9 = 0; i9 < readByte; i9 += 6) {
                                    f5.g gVar10 = this.f2590b;
                                    int readShort = gVar10.readShort() & 65535;
                                    int readInt3 = gVar10.readInt();
                                    if (readShort != 2) {
                                        if (readShort != 3) {
                                            if (readShort != 4) {
                                                if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                                    e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt3));
                                                    throw null;
                                                }
                                            } else if (readInt3 >= 0) {
                                                readShort = 7;
                                            } else {
                                                e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                                throw null;
                                            }
                                        } else {
                                            readShort = 4;
                                        }
                                    } else if (readInt3 != 0 && readInt3 != 1) {
                                        e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                        throw null;
                                    }
                                    eVar5.d(readShort, readInt3);
                                }
                                g.f fVar3 = (g.f) bVar;
                                fVar3.getClass();
                                g gVar11 = g.this;
                                gVar11.f2533i.execute(new n(fVar3, new Object[]{gVar11.f2529e}, eVar5));
                                return true;
                            } else {
                                e.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(readByte));
                                throw null;
                            }
                        }
                        e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    case 5:
                        if (readInt != 0) {
                            if ((readByte3 & 8) != 0) {
                                s7 = (short) (this.f2590b.readByte() & 255);
                            } else {
                                s7 = 0;
                            }
                            int readInt4 = this.f2590b.readInt() & Integer.MAX_VALUE;
                            ArrayList k7 = k(c(readByte - 4, readByte3, s7), s7, readByte3, readInt);
                            g gVar12 = g.this;
                            synchronized (gVar12) {
                                if (gVar12.f2546x.contains(Integer.valueOf(readInt4))) {
                                    gVar12.q(readInt4, 2);
                                } else {
                                    gVar12.f2546x.add(Integer.valueOf(readInt4));
                                    gVar12.j(new i(gVar12, new Object[]{gVar12.f2529e, Integer.valueOf(readInt4)}, readInt4, k7));
                                }
                            }
                            return true;
                        }
                        e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    case 6:
                        n(bVar, readByte, readByte3, readInt);
                        return true;
                    case 7:
                        j(bVar, readByte, readInt);
                        return true;
                    case 8:
                        o(bVar, readByte, readInt);
                        return true;
                    default:
                        this.f2590b.skip(readByte);
                        return true;
                }
            }
            e.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(readByte));
            throw null;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void h(b bVar) {
        if (this.f2592d) {
            if (!f(true, bVar)) {
                e.b("Required SETTINGS preface not received", new Object[0]);
                throw null;
            }
            return;
        }
        f5.h hVar = e.f2518a;
        f5.h e6 = this.f2590b.e(hVar.f3981b.length);
        Level level = Level.FINE;
        Logger logger = f2589f;
        if (logger.isLoggable(level)) {
            logger.fine(w4.e.i("<< CONNECTION %s", e6.f()));
        }
        if (hVar.equals(e6)) {
            return;
        }
        e.b("Expected a connection header but was %s", e6.m());
        throw null;
    }

    public final void j(b bVar, int i6, int i7) {
        int i8;
        r[] rVarArr;
        if (i6 >= 8) {
            if (i7 == 0) {
                int readInt = this.f2590b.readInt();
                int readInt2 = this.f2590b.readInt();
                int i9 = i6 - 8;
                int[] _values = b5.b._values();
                int length = _values.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        i8 = _values[i10];
                        if (b5.b.a(i8) == readInt2) {
                            break;
                        }
                        i10++;
                    } else {
                        i8 = 0;
                        break;
                    }
                }
                if (i8 != 0) {
                    f5.h hVar = f5.h.f3980f;
                    if (i9 > 0) {
                        hVar = this.f2590b.e(i9);
                    }
                    g.f fVar = (g.f) bVar;
                    fVar.getClass();
                    hVar.j();
                    synchronized (g.this) {
                        rVarArr = (r[]) g.this.f2528d.values().toArray(new r[g.this.f2528d.size()]);
                        g.this.f2532h = true;
                    }
                    for (r rVar : rVarArr) {
                        if (rVar.f2602c > readInt && rVar.f()) {
                            synchronized (rVar) {
                                if (rVar.f2610k == 0) {
                                    rVar.f2610k = 5;
                                    rVar.notifyAll();
                                }
                            }
                            g.this.k(rVar.f2602c);
                        }
                    }
                    return;
                }
                e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i6));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
        throw new java.io.IOException("Invalid dynamic table size update " + r3.f2505d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList k(int r3, short r4, byte r5, int r6) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.q.k(int, short, byte, int):java.util.ArrayList");
    }

    public final void n(b bVar, int i6, byte b6, int i7) {
        boolean z5 = false;
        if (i6 == 8) {
            if (i7 == 0) {
                int readInt = this.f2590b.readInt();
                int readInt2 = this.f2590b.readInt();
                if ((b6 & 1) != 0) {
                    z5 = true;
                }
                g.f fVar = (g.f) bVar;
                fVar.getClass();
                if (z5) {
                    synchronized (g.this) {
                        try {
                            if (readInt == 1) {
                                g.this.f2537m++;
                            } else if (readInt == 2) {
                                g.this.f2539o++;
                            } else if (readInt == 3) {
                                g gVar = g.this;
                                gVar.getClass();
                                gVar.notifyAll();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                try {
                    g gVar2 = g.this;
                    gVar2.f2533i.execute(new g.e(readInt, readInt2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            e.b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        e.b("TYPE_PING length != 8: %s", Integer.valueOf(i6));
        throw null;
    }

    public final void o(b bVar, int i6, int i7) {
        if (i6 == 4) {
            long readInt = this.f2590b.readInt() & 2147483647L;
            int i8 = (readInt > 0L ? 1 : (readInt == 0L ? 0 : -1));
            if (i8 != 0) {
                g.f fVar = (g.f) bVar;
                g gVar = g.this;
                if (i7 == 0) {
                    synchronized (gVar) {
                        g gVar2 = g.this;
                        gVar2.f2542r += readInt;
                        gVar2.notifyAll();
                    }
                    return;
                }
                r h6 = gVar.h(i7);
                if (h6 != null) {
                    synchronized (h6) {
                        h6.f2601b += readInt;
                        if (i8 > 0) {
                            h6.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            e.b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i6));
        throw null;
    }
}
