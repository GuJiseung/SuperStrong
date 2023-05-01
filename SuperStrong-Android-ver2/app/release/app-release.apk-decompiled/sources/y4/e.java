package y4;

import a5.a;
import androidx.activity.j;
import b5.g;
import b5.p;
import b5.r;
import f5.q;
import f5.s;
import f5.t;
import f5.z;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import v4.b0;
import v4.e0;
import v4.m;
import v4.o;
import v4.u;
import v4.v;
import v4.x;
/* loaded from: classes.dex */
public final class e extends g.d {

    /* renamed from: b  reason: collision with root package name */
    public final f f6865b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f6866c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f6867d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f6868e;

    /* renamed from: f  reason: collision with root package name */
    public o f6869f;

    /* renamed from: g  reason: collision with root package name */
    public v f6870g;

    /* renamed from: h  reason: collision with root package name */
    public b5.g f6871h;

    /* renamed from: i  reason: collision with root package name */
    public t f6872i;

    /* renamed from: j  reason: collision with root package name */
    public s f6873j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6874k;

    /* renamed from: l  reason: collision with root package name */
    public int f6875l;

    /* renamed from: m  reason: collision with root package name */
    public int f6876m;

    /* renamed from: n  reason: collision with root package name */
    public int f6877n;

    /* renamed from: o  reason: collision with root package name */
    public int f6878o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f6879p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public long f6880q = Long.MAX_VALUE;

    public e(f fVar, e0 e0Var) {
        this.f6865b = fVar;
        this.f6866c = e0Var;
    }

    @Override // b5.g.d
    public final void a(b5.g gVar) {
        int i6;
        synchronized (this.f6865b) {
            try {
                synchronized (gVar) {
                    e0.e eVar = gVar.f2543t;
                    if ((eVar.f3804a & 16) != 0) {
                        i6 = ((int[]) eVar.f3805b)[4];
                    } else {
                        i6 = Integer.MAX_VALUE;
                    }
                }
                this.f6878o = i6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // b5.g.d
    public final void b(r rVar) {
        rVar.c(5, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r10, int r11, int r12, boolean r13, v4.m r14) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.e.c(int, int, int, boolean, v4.m):void");
    }

    public final void d(int i6, int i7, m mVar) {
        Socket createSocket;
        e0 e0Var = this.f6866c;
        Proxy proxy = e0Var.f6387b;
        InetSocketAddress inetSocketAddress = e0Var.f6388c;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = e0Var.f6386a.f6326c.createSocket();
        }
        this.f6867d = createSocket;
        mVar.getClass();
        this.f6867d.setSoTimeout(i7);
        try {
            c5.f.f2787a.h(this.f6867d, inetSocketAddress, i6);
            try {
                this.f6872i = new t(q.b(this.f6867d));
                this.f6873j = new s(q.a(this.f6867d));
            } catch (NullPointerException e6) {
                if (!"throw with null exception".equals(e6.getMessage())) {
                    return;
                }
                throw new IOException(e6);
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e7);
            throw connectException;
        }
    }

    public final void e(int i6, int i7, int i8, m mVar) {
        x.a aVar = new x.a();
        e0 e0Var = this.f6866c;
        v4.q qVar = e0Var.f6386a.f6324a;
        if (qVar != null) {
            aVar.f6562a = qVar;
            aVar.b("CONNECT", null);
            v4.a aVar2 = e0Var.f6386a;
            aVar.f6564c.c("Host", w4.e.j(aVar2.f6324a, true));
            aVar.f6564c.c("Proxy-Connection", "Keep-Alive");
            aVar.f6564c.c("User-Agent", "okhttp/3.14.9");
            x a6 = aVar.a();
            b0.a aVar3 = new b0.a();
            aVar3.f6349a = a6;
            aVar3.f6350b = v.f6541d;
            aVar3.f6351c = 407;
            aVar3.f6352d = "Preemptive Authenticate";
            aVar3.f6355g = w4.e.f6596d;
            aVar3.f6359k = -1L;
            aVar3.f6360l = -1L;
            aVar3.f6354f.c("Proxy-Authenticate", "OkHttp-Preemptive");
            aVar3.a();
            aVar2.f6327d.getClass();
            d(i6, i7, mVar);
            t tVar = this.f6872i;
            a5.a aVar4 = new a5.a(null, null, tVar, this.f6873j);
            z b6 = tVar.b();
            long j5 = i7;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            b6.g(j5, timeUnit);
            this.f6873j.b().g(i8, timeUnit);
            aVar4.l(a6.f6558c, "CONNECT " + w4.e.j(a6.f6556a, true) + " HTTP/1.1");
            aVar4.a();
            b0.a f6 = aVar4.f(false);
            f6.f6349a = a6;
            b0 a7 = f6.a();
            long a8 = z4.e.a(a7);
            if (a8 != -1) {
                a.d i9 = aVar4.i(a8);
                w4.e.q(i9, Integer.MAX_VALUE, timeUnit);
                i9.close();
            }
            int i10 = a7.f6338d;
            if (i10 != 200) {
                if (i10 == 407) {
                    aVar2.f6327d.getClass();
                    throw new IOException("Failed to authenticate with proxy");
                }
                throw new IOException(j.a("Unexpected response code for CONNECT: ", i10));
            } else if (this.f6872i.f4008b.m() && this.f6873j.f4005b.m()) {
                return;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
        throw new NullPointerException("url == null");
    }

    public final void f(b bVar, m mVar) {
        SSLSocket sSLSocket;
        e0 e0Var = this.f6866c;
        v4.a aVar = e0Var.f6386a;
        SSLSocketFactory sSLSocketFactory = aVar.f6332i;
        v vVar = v.f6541d;
        if (sSLSocketFactory == null) {
            v vVar2 = v.f6544g;
            if (aVar.f6328e.contains(vVar2)) {
                this.f6868e = this.f6867d;
                this.f6870g = vVar2;
                i();
                return;
            }
            this.f6868e = this.f6867d;
            this.f6870g = vVar;
            return;
        }
        mVar.getClass();
        v4.a aVar2 = e0Var.f6386a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f6332i;
        v4.q qVar = aVar2.f6324a;
        String str = null;
        try {
            try {
                sSLSocket = (SSLSocket) sSLSocketFactory2.createSocket(this.f6867d, qVar.f6464d, qVar.f6465e, true);
            } catch (AssertionError e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            v4.h a6 = bVar.a(sSLSocket);
            String str2 = qVar.f6464d;
            boolean z5 = a6.f6420b;
            if (z5) {
                c5.f.f2787a.g(sSLSocket, str2, aVar2.f6328e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            o a7 = o.a(session);
            boolean verify = aVar2.f6333j.verify(str2, session);
            List<Certificate> list = a7.f6456c;
            if (!verify) {
                if (!list.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) list.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + str2 + " not verified:\n    certificate: " + v4.f.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + e5.c.a(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + str2 + " not verified (no certificates)");
            }
            aVar2.f6334k.a(str2, list);
            if (z5) {
                str = c5.f.f2787a.j(sSLSocket);
            }
            this.f6868e = sSLSocket;
            this.f6872i = new t(q.b(sSLSocket));
            this.f6873j = new s(q.a(this.f6868e));
            this.f6869f = a7;
            if (str != null) {
                vVar = v.a(str);
            }
            this.f6870g = vVar;
            c5.f.f2787a.a(sSLSocket);
            if (this.f6870g == v.f6543f) {
                i();
            }
        } catch (AssertionError e7) {
            e = e7;
            if (w4.e.n(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                c5.f.f2787a.a(sSLSocket);
            }
            w4.e.c(sSLSocket);
            throw th;
        }
    }

    public final z4.c g(u uVar, z4.f fVar) {
        if (this.f6871h != null) {
            return new p(uVar, this, fVar, this.f6871h);
        }
        Socket socket = this.f6868e;
        int i6 = fVar.f7087h;
        socket.setSoTimeout(i6);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f6872i.b().g(i6, timeUnit);
        this.f6873j.b().g(fVar.f7088i, timeUnit);
        return new a5.a(uVar, this, this.f6872i, this.f6873j);
    }

    public final void h() {
        synchronized (this.f6865b) {
            this.f6874k = true;
        }
    }

    public final void i() {
        int c6;
        boolean z5;
        int i6;
        this.f6868e.setSoTimeout(0);
        g.b bVar = new g.b();
        Socket socket = this.f6868e;
        String str = this.f6866c.f6386a.f6324a.f6464d;
        t tVar = this.f6872i;
        s sVar = this.f6873j;
        bVar.f2550a = socket;
        bVar.f2551b = str;
        bVar.f2552c = tVar;
        bVar.f2553d = sVar;
        bVar.f2554e = this;
        bVar.f2555f = 0;
        b5.g gVar = new b5.g(bVar);
        this.f6871h = gVar;
        b5.s sVar2 = gVar.f2544v;
        synchronized (sVar2) {
            if (!sVar2.f2628f) {
                if (sVar2.f2625c) {
                    Logger logger = b5.s.f2623h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(w4.e.i(">> CONNECTION %s", b5.e.f2518a.f()));
                    }
                    sVar2.f2624b.write((byte[]) b5.e.f2518a.f3981b.clone());
                    sVar2.f2624b.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        b5.s sVar3 = gVar.f2544v;
        e0.e eVar = gVar.s;
        synchronized (sVar3) {
            if (!sVar3.f2628f) {
                sVar3.h(0, Integer.bitCount(eVar.f3804a) * 6, (byte) 4, (byte) 0);
                for (int i7 = 0; i7 < 10; i7++) {
                    if (((1 << i7) & eVar.f3804a) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        if (i7 == 4) {
                            i6 = 3;
                        } else if (i7 == 7) {
                            i6 = 4;
                        } else {
                            i6 = i7;
                        }
                        sVar3.f2624b.writeShort(i6);
                        sVar3.f2624b.writeInt(((int[]) eVar.f3805b)[i7]);
                    }
                }
                sVar3.f2624b.flush();
            } else {
                throw new IOException("closed");
            }
        }
        if (gVar.s.c() != 65535) {
            gVar.f2544v.o(0, c6 - 65535);
        }
        new Thread(gVar.f2545w).start();
    }

    public final boolean j(v4.q qVar) {
        int i6 = qVar.f6465e;
        v4.q qVar2 = this.f6866c.f6386a.f6324a;
        if (i6 != qVar2.f6465e) {
            return false;
        }
        String str = qVar.f6464d;
        if (str.equals(qVar2.f6464d)) {
            return true;
        }
        o oVar = this.f6869f;
        if (oVar == null || !e5.c.c(str, (X509Certificate) oVar.f6456c.get(0))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        e0 e0Var = this.f6866c;
        sb.append(e0Var.f6386a.f6324a.f6464d);
        sb.append(":");
        sb.append(e0Var.f6386a.f6324a.f6465e);
        sb.append(", proxy=");
        sb.append(e0Var.f6387b);
        sb.append(" hostAddress=");
        sb.append(e0Var.f6388c);
        sb.append(" cipherSuite=");
        o oVar = this.f6869f;
        if (oVar != null) {
            obj = oVar.f6455b;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f6870g);
        sb.append('}');
        return sb.toString();
    }
}
