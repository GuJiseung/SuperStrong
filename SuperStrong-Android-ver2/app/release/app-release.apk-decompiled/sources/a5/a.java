package a5;

import f5.g;
import f5.k;
import f5.x;
import f5.y;
import f5.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import v4.b0;
import v4.p;
import v4.q;
import v4.u;
import z4.h;
import z4.j;
/* loaded from: classes.dex */
public final class a implements z4.c {

    /* renamed from: a  reason: collision with root package name */
    public final u f211a;

    /* renamed from: b  reason: collision with root package name */
    public final y4.e f212b;

    /* renamed from: c  reason: collision with root package name */
    public final g f213c;

    /* renamed from: d  reason: collision with root package name */
    public final f5.f f214d;

    /* renamed from: e  reason: collision with root package name */
    public int f215e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f216f = 262144;

    /* renamed from: a5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public abstract class AbstractC0002a implements y {

        /* renamed from: b  reason: collision with root package name */
        public final k f217b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f218c;

        public AbstractC0002a() {
            this.f217b = new k(a.this.f213c.b());
        }

        @Override // f5.y
        public long B(f5.e eVar, long j5) {
            a aVar = a.this;
            try {
                return aVar.f213c.B(eVar, j5);
            } catch (IOException e6) {
                aVar.f212b.h();
                c();
                throw e6;
            }
        }

        @Override // f5.y
        public final z b() {
            return this.f217b;
        }

        public final void c() {
            a aVar = a.this;
            int i6 = aVar.f215e;
            if (i6 == 6) {
                return;
            }
            if (i6 == 5) {
                k kVar = this.f217b;
                z zVar = kVar.f3986e;
                kVar.f3986e = z.f4023d;
                zVar.a();
                zVar.b();
                aVar.f215e = 6;
                return;
            }
            throw new IllegalStateException("state: " + aVar.f215e);
        }
    }

    /* loaded from: classes.dex */
    public final class b implements x {

        /* renamed from: b  reason: collision with root package name */
        public final k f220b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f221c;

        public b() {
            this.f220b = new k(a.this.f214d.b());
        }

        @Override // f5.x
        public final z b() {
            return this.f220b;
        }

        @Override // f5.x, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f221c) {
                return;
            }
            this.f221c = true;
            a.this.f214d.z("0\r\n\r\n");
            a aVar = a.this;
            k kVar = this.f220b;
            aVar.getClass();
            z zVar = kVar.f3986e;
            kVar.f3986e = z.f4023d;
            zVar.a();
            zVar.b();
            a.this.f215e = 3;
        }

        @Override // f5.x, java.io.Flushable
        public final synchronized void flush() {
            if (this.f221c) {
                return;
            }
            a.this.f214d.flush();
        }

        @Override // f5.x
        public final void u(f5.e eVar, long j5) {
            if (!this.f221c) {
                if (j5 == 0) {
                    return;
                }
                a aVar = a.this;
                aVar.f214d.d(j5);
                aVar.f214d.z("\r\n");
                aVar.f214d.u(eVar, j5);
                aVar.f214d.z("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes.dex */
    public class c extends AbstractC0002a {

        /* renamed from: e  reason: collision with root package name */
        public final q f223e;

        /* renamed from: f  reason: collision with root package name */
        public long f224f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f225g;

        public c(q qVar) {
            super();
            this.f224f = -1L;
            this.f225g = true;
            this.f223e = qVar;
        }

        @Override // a5.a.AbstractC0002a, f5.y
        public final long B(f5.e eVar, long j5) {
            if (!this.f218c) {
                if (!this.f225g) {
                    return -1L;
                }
                long j6 = this.f224f;
                int i6 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                a aVar = a.this;
                if (i6 == 0 || j6 == -1) {
                    if (j6 != -1) {
                        aVar.f213c.l();
                    }
                    try {
                        this.f224f = aVar.f213c.C();
                        String trim = aVar.f213c.l().trim();
                        if (this.f224f >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                            if (this.f224f == 0) {
                                this.f225g = false;
                                z4.e.d(aVar.f211a.f6506i, this.f223e, aVar.k());
                                c();
                            }
                            if (!this.f225g) {
                                return -1L;
                            }
                        } else {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f224f + trim + "\"");
                        }
                    } catch (NumberFormatException e6) {
                        throw new ProtocolException(e6.getMessage());
                    }
                }
                long B = super.B(eVar, Math.min(8192L, this.f224f));
                if (B != -1) {
                    this.f224f -= B;
                    return B;
                }
                aVar.f212b.h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            }
            throw new IllegalStateException("closed");
        }

        @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f218c) {
                return;
            }
            if (this.f225g && !w4.e.h(this, TimeUnit.MILLISECONDS)) {
                a.this.f212b.h();
                c();
            }
            this.f218c = true;
        }
    }

    /* loaded from: classes.dex */
    public class d extends AbstractC0002a {

        /* renamed from: e  reason: collision with root package name */
        public long f227e;

        public d(long j5) {
            super();
            this.f227e = j5;
            if (j5 == 0) {
                c();
            }
        }

        @Override // a5.a.AbstractC0002a, f5.y
        public final long B(f5.e eVar, long j5) {
            if (!this.f218c) {
                long j6 = this.f227e;
                if (j6 == 0) {
                    return -1L;
                }
                long B = super.B(eVar, Math.min(j6, 8192L));
                if (B != -1) {
                    long j7 = this.f227e - B;
                    this.f227e = j7;
                    if (j7 == 0) {
                        c();
                    }
                    return B;
                }
                a.this.f212b.h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            }
            throw new IllegalStateException("closed");
        }

        @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f218c) {
                return;
            }
            if (this.f227e != 0 && !w4.e.h(this, TimeUnit.MILLISECONDS)) {
                a.this.f212b.h();
                c();
            }
            this.f218c = true;
        }
    }

    /* loaded from: classes.dex */
    public final class e implements x {

        /* renamed from: b  reason: collision with root package name */
        public final k f229b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f230c;

        public e() {
            this.f229b = new k(a.this.f214d.b());
        }

        @Override // f5.x
        public final z b() {
            return this.f229b;
        }

        @Override // f5.x, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f230c) {
                return;
            }
            this.f230c = true;
            a aVar = a.this;
            aVar.getClass();
            k kVar = this.f229b;
            z zVar = kVar.f3986e;
            kVar.f3986e = z.f4023d;
            zVar.a();
            zVar.b();
            aVar.f215e = 3;
        }

        @Override // f5.x, java.io.Flushable
        public final void flush() {
            if (this.f230c) {
                return;
            }
            a.this.f214d.flush();
        }

        @Override // f5.x
        public final void u(f5.e eVar, long j5) {
            if (!this.f230c) {
                long j6 = eVar.f3977c;
                byte[] bArr = w4.e.f6593a;
                if ((0 | j5) >= 0 && 0 <= j6 && j6 - 0 >= j5) {
                    a.this.f214d.u(eVar, j5);
                    return;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes.dex */
    public class f extends AbstractC0002a {

        /* renamed from: e  reason: collision with root package name */
        public boolean f232e;

        public f(a aVar) {
            super();
        }

        @Override // a5.a.AbstractC0002a, f5.y
        public final long B(f5.e eVar, long j5) {
            if (this.f218c) {
                throw new IllegalStateException("closed");
            }
            if (this.f232e) {
                return -1L;
            }
            long B = super.B(eVar, 8192L);
            if (B == -1) {
                this.f232e = true;
                c();
                return -1L;
            }
            return B;
        }

        @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f218c) {
                return;
            }
            if (!this.f232e) {
                c();
            }
            this.f218c = true;
        }
    }

    public a(u uVar, y4.e eVar, g gVar, f5.f fVar) {
        this.f211a = uVar;
        this.f212b = eVar;
        this.f213c = gVar;
        this.f214d = fVar;
    }

    @Override // z4.c
    public final void a() {
        this.f214d.flush();
    }

    @Override // z4.c
    public final void b() {
        this.f214d.flush();
    }

    @Override // z4.c
    public final y c(b0 b0Var) {
        if (!z4.e.b(b0Var)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(b0Var.c("Transfer-Encoding"))) {
            q qVar = b0Var.f6336b.f6556a;
            if (this.f215e == 4) {
                this.f215e = 5;
                return new c(qVar);
            }
            throw new IllegalStateException("state: " + this.f215e);
        }
        long a6 = z4.e.a(b0Var);
        if (a6 != -1) {
            return i(a6);
        }
        if (this.f215e == 4) {
            this.f215e = 5;
            this.f212b.h();
            return new f(this);
        }
        throw new IllegalStateException("state: " + this.f215e);
    }

    @Override // z4.c
    public final void cancel() {
        y4.e eVar = this.f212b;
        if (eVar != null) {
            w4.e.c(eVar.f6867d);
        }
    }

    @Override // z4.c
    public final void d(v4.x xVar) {
        boolean z5;
        Proxy.Type type = this.f212b.f6866c.f6387b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(xVar.f6557b);
        sb.append(' ');
        q qVar = xVar.f6556a;
        if (!qVar.f6461a.equals("https") && type == Proxy.Type.HTTP) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            sb.append(qVar);
        } else {
            sb.append(h.a(qVar));
        }
        sb.append(" HTTP/1.1");
        l(xVar.f6558c, sb.toString());
    }

    @Override // z4.c
    public final x e(v4.x xVar, long j5) {
        if ("chunked".equalsIgnoreCase(xVar.a("Transfer-Encoding"))) {
            if (this.f215e == 1) {
                this.f215e = 2;
                return new b();
            }
            throw new IllegalStateException("state: " + this.f215e);
        } else if (j5 != -1) {
            if (this.f215e == 1) {
                this.f215e = 2;
                return new e();
            }
            throw new IllegalStateException("state: " + this.f215e);
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // z4.c
    public final b0.a f(boolean z5) {
        String str;
        int i6 = this.f215e;
        if (i6 != 1 && i6 != 3) {
            throw new IllegalStateException("state: " + this.f215e);
        }
        try {
            j a6 = j.a(j());
            int i7 = a6.f7095b;
            b0.a aVar = new b0.a();
            aVar.f6350b = a6.f7094a;
            aVar.f6351c = i7;
            aVar.f6352d = a6.f7096c;
            aVar.f6354f = k().e();
            if (z5 && i7 == 100) {
                return null;
            }
            if (i7 == 100) {
                this.f215e = 3;
                return aVar;
            }
            this.f215e = 4;
            return aVar;
        } catch (EOFException e6) {
            y4.e eVar = this.f212b;
            if (eVar != null) {
                str = eVar.f6866c.f6386a.f6324a.n();
            } else {
                str = "unknown";
            }
            throw new IOException("unexpected end of stream on " + str, e6);
        }
    }

    @Override // z4.c
    public final long g(b0 b0Var) {
        if (z4.e.b(b0Var)) {
            if ("chunked".equalsIgnoreCase(b0Var.c("Transfer-Encoding"))) {
                return -1L;
            }
            return z4.e.a(b0Var);
        }
        return 0L;
    }

    @Override // z4.c
    public final y4.e h() {
        return this.f212b;
    }

    public final d i(long j5) {
        if (this.f215e == 4) {
            this.f215e = 5;
            return new d(j5);
        }
        throw new IllegalStateException("state: " + this.f215e);
    }

    public final String j() {
        String t5 = this.f213c.t(this.f216f);
        this.f216f -= t5.length();
        return t5;
    }

    public final p k() {
        String str;
        p.a aVar = new p.a();
        while (true) {
            String j5 = j();
            if (j5.length() != 0) {
                w4.a.f6589a.getClass();
                int indexOf = j5.indexOf(":", 1);
                if (indexOf != -1) {
                    str = j5.substring(0, indexOf);
                    j5 = j5.substring(indexOf + 1);
                } else {
                    if (j5.startsWith(":")) {
                        j5 = j5.substring(1);
                    }
                    str = "";
                }
                aVar.a(str, j5);
            } else {
                return new p(aVar);
            }
        }
    }

    public final void l(p pVar, String str) {
        if (this.f215e == 0) {
            f5.f fVar = this.f214d;
            fVar.z(str).z("\r\n");
            int length = pVar.f6458a.length / 2;
            for (int i6 = 0; i6 < length; i6++) {
                fVar.z(pVar.d(i6)).z(": ").z(pVar.g(i6)).z("\r\n");
            }
            fVar.z("\r\n");
            this.f215e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f215e);
    }
}
