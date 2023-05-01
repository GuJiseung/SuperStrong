package y4;

import f5.j;
import f5.x;
import f5.y;
import java.io.IOException;
import java.net.ProtocolException;
import javax.annotation.Nullable;
import v4.b0;
import v4.m;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final i f6841a;

    /* renamed from: b  reason: collision with root package name */
    public final m f6842b;

    /* renamed from: c  reason: collision with root package name */
    public final d f6843c;

    /* renamed from: d  reason: collision with root package name */
    public final z4.c f6844d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6845e;

    /* loaded from: classes.dex */
    public final class a extends f5.i {

        /* renamed from: c  reason: collision with root package name */
        public boolean f6846c;

        /* renamed from: d  reason: collision with root package name */
        public final long f6847d;

        /* renamed from: e  reason: collision with root package name */
        public long f6848e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6849f;

        public a(x xVar, long j5) {
            super(xVar);
            this.f6847d = j5;
        }

        @Nullable
        public final IOException c(@Nullable IOException iOException) {
            if (this.f6846c) {
                return iOException;
            }
            this.f6846c = true;
            c cVar = c.this;
            if (iOException != null) {
                cVar.c(iOException);
            }
            cVar.f6842b.getClass();
            return cVar.f6841a.c(cVar, true, false, iOException);
        }

        @Override // f5.i, f5.x, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f6849f) {
                return;
            }
            this.f6849f = true;
            long j5 = this.f6847d;
            if (j5 != -1 && this.f6848e != j5) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                c(null);
            } catch (IOException e6) {
                throw c(e6);
            }
        }

        @Override // f5.i, f5.x, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e6) {
                throw c(e6);
            }
        }

        @Override // f5.x
        public final void u(f5.e eVar, long j5) {
            if (!this.f6849f) {
                long j6 = this.f6847d;
                if (j6 != -1 && this.f6848e + j5 > j6) {
                    throw new ProtocolException("expected " + j6 + " bytes but received " + (this.f6848e + j5));
                }
                try {
                    this.f3984b.u(eVar, j5);
                    this.f6848e += j5;
                    return;
                } catch (IOException e6) {
                    throw c(e6);
                }
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes.dex */
    public final class b extends j {

        /* renamed from: c  reason: collision with root package name */
        public final long f6851c;

        /* renamed from: d  reason: collision with root package name */
        public long f6852d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6853e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6854f;

        public b(y yVar, long j5) {
            super(yVar);
            this.f6851c = j5;
            if (j5 == 0) {
                c(null);
            }
        }

        @Override // f5.y
        public final long B(f5.e eVar, long j5) {
            if (!this.f6854f) {
                try {
                    long B = this.f3985b.B(eVar, 8192L);
                    if (B == -1) {
                        c(null);
                        return -1L;
                    }
                    long j6 = this.f6852d + B;
                    long j7 = this.f6851c;
                    if (j7 != -1 && j6 > j7) {
                        throw new ProtocolException("expected " + j7 + " bytes but received " + j6);
                    }
                    this.f6852d = j6;
                    if (j6 == j7) {
                        c(null);
                    }
                    return B;
                } catch (IOException e6) {
                    throw c(e6);
                }
            }
            throw new IllegalStateException("closed");
        }

        @Nullable
        public final IOException c(@Nullable IOException iOException) {
            if (this.f6853e) {
                return iOException;
            }
            this.f6853e = true;
            c cVar = c.this;
            if (iOException != null) {
                cVar.c(iOException);
            }
            cVar.f6842b.getClass();
            return cVar.f6841a.c(cVar, false, true, iOException);
        }

        @Override // f5.j, f5.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f6854f) {
                return;
            }
            this.f6854f = true;
            try {
                super.close();
                c(null);
            } catch (IOException e6) {
                throw c(e6);
            }
        }
    }

    public c(i iVar, v4.d dVar, m mVar, d dVar2, z4.c cVar) {
        this.f6841a = iVar;
        this.f6842b = mVar;
        this.f6843c = dVar2;
        this.f6844d = cVar;
    }

    public final e a() {
        return this.f6844d.h();
    }

    @Nullable
    public final b0.a b(boolean z5) {
        try {
            b0.a f6 = this.f6844d.f(z5);
            if (f6 != null) {
                w4.a.f6589a.getClass();
                f6.f6361m = this;
            }
            return f6;
        } catch (IOException e6) {
            this.f6842b.getClass();
            c(e6);
            throw e6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r6 > 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.io.IOException r6) {
        /*
            r5 = this;
            y4.d r0 = r5.f6843c
            y4.f r1 = r0.f6858c
            monitor-enter(r1)
            r2 = 1
            r0.f6863h = r2     // Catch: java.lang.Throwable -> L51
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            z4.c r0 = r5.f6844d
            y4.e r0 = r0.h()
            y4.f r3 = r0.f6865b
            monitor-enter(r3)
            boolean r1 = r6 instanceof b5.v     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L2b
            b5.v r6 = (b5.v) r6     // Catch: java.lang.Throwable -> L4e
            int r6 = r6.f2638b     // Catch: java.lang.Throwable -> L4e
            r1 = 5
            if (r6 != r1) goto L27
            int r6 = r0.f6877n     // Catch: java.lang.Throwable -> L4e
            int r6 = r6 + r2
            r0.f6877n = r6     // Catch: java.lang.Throwable -> L4e
            if (r6 <= r2) goto L4c
        L24:
            r0.f6874k = r2     // Catch: java.lang.Throwable -> L4e
            goto L47
        L27:
            r1 = 6
            if (r6 == r1) goto L4c
            goto L24
        L2b:
            b5.g r1 = r0.f6871h     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L31
            r1 = r2
            goto L32
        L31:
            r1 = 0
        L32:
            if (r1 == 0) goto L38
            boolean r1 = r6 instanceof b5.a     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L4c
        L38:
            r0.f6874k = r2     // Catch: java.lang.Throwable -> L4e
            int r1 = r0.f6876m     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L4c
            if (r6 == 0) goto L47
            y4.f r1 = r0.f6865b     // Catch: java.lang.Throwable -> L4e
            v4.e0 r4 = r0.f6866c     // Catch: java.lang.Throwable -> L4e
            r1.a(r4, r6)     // Catch: java.lang.Throwable -> L4e
        L47:
            int r6 = r0.f6875l     // Catch: java.lang.Throwable -> L4e
            int r6 = r6 + r2
            r0.f6875l = r6     // Catch: java.lang.Throwable -> L4e
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4e
            return
        L4e:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4e
            throw r6
        L51:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.c.c(java.io.IOException):void");
    }
}
