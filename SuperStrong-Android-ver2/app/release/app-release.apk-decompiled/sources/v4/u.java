package v4;

import androidx.fragment.app.x0;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import v4.d;
import v4.j;
/* loaded from: classes.dex */
public final class u implements Cloneable, d.a {

    /* renamed from: x  reason: collision with root package name */
    public static final List<v> f6497x = w4.e.l(v.f6543f, v.f6541d);

    /* renamed from: y  reason: collision with root package name */
    public static final List<h> f6498y = w4.e.l(h.f6417e, h.f6418f);

    /* renamed from: b  reason: collision with root package name */
    public final k f6499b;

    /* renamed from: c  reason: collision with root package name */
    public final List<v> f6500c;

    /* renamed from: d  reason: collision with root package name */
    public final List<h> f6501d;

    /* renamed from: e  reason: collision with root package name */
    public final List<r> f6502e;

    /* renamed from: f  reason: collision with root package name */
    public final List<r> f6503f;

    /* renamed from: g  reason: collision with root package name */
    public final m3.j f6504g;

    /* renamed from: h  reason: collision with root package name */
    public final ProxySelector f6505h;

    /* renamed from: i  reason: collision with root package name */
    public final j.a f6506i;

    /* renamed from: j  reason: collision with root package name */
    public final SocketFactory f6507j;

    /* renamed from: k  reason: collision with root package name */
    public final SSLSocketFactory f6508k;

    /* renamed from: l  reason: collision with root package name */
    public final HostnameVerifier f6509l;

    /* renamed from: m  reason: collision with root package name */
    public final f f6510m;

    /* renamed from: n  reason: collision with root package name */
    public final x0 f6511n;

    /* renamed from: o  reason: collision with root package name */
    public final x0 f6512o;

    /* renamed from: p  reason: collision with root package name */
    public final d.s f6513p;

    /* renamed from: q  reason: collision with root package name */
    public final a2.d f6514q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f6515r;
    public final boolean s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f6516t;
    public final int u;

    /* renamed from: v  reason: collision with root package name */
    public final int f6517v;

    /* renamed from: w  reason: collision with root package name */
    public final int f6518w;

    /* loaded from: classes.dex */
    public class a extends w4.a {
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: g  reason: collision with root package name */
        public final ProxySelector f6525g;

        /* renamed from: h  reason: collision with root package name */
        public final j.a f6526h;

        /* renamed from: i  reason: collision with root package name */
        public final SocketFactory f6527i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public SSLSocketFactory f6528j;
        @Nullable

        /* renamed from: k  reason: collision with root package name */
        public androidx.activity.result.c f6529k;

        /* renamed from: l  reason: collision with root package name */
        public HostnameVerifier f6530l;

        /* renamed from: m  reason: collision with root package name */
        public final f f6531m;

        /* renamed from: n  reason: collision with root package name */
        public final x0 f6532n;

        /* renamed from: o  reason: collision with root package name */
        public final x0 f6533o;

        /* renamed from: p  reason: collision with root package name */
        public final d.s f6534p;

        /* renamed from: q  reason: collision with root package name */
        public final a2.d f6535q;

        /* renamed from: r  reason: collision with root package name */
        public final boolean f6536r;
        public final boolean s;

        /* renamed from: t  reason: collision with root package name */
        public final boolean f6537t;
        public final int u;

        /* renamed from: v  reason: collision with root package name */
        public final int f6538v;

        /* renamed from: w  reason: collision with root package name */
        public final int f6539w;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f6522d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f6523e = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        public final k f6519a = new k();

        /* renamed from: b  reason: collision with root package name */
        public final List<v> f6520b = u.f6497x;

        /* renamed from: c  reason: collision with root package name */
        public final List<h> f6521c = u.f6498y;

        /* renamed from: f  reason: collision with root package name */
        public final m3.j f6524f = new m3.j(6, m.f6448a);

        public b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f6525g = proxySelector;
            if (proxySelector == null) {
                this.f6525g = new d5.a();
            }
            this.f6526h = j.f6440a;
            this.f6527i = SocketFactory.getDefault();
            this.f6530l = e5.c.f3853a;
            this.f6531m = f.f6389c;
            x0 x0Var = v4.b.f6335a;
            this.f6532n = x0Var;
            this.f6533o = x0Var;
            this.f6534p = new d.s(2);
            this.f6535q = l.f6447a;
            this.f6536r = true;
            this.s = true;
            this.f6537t = true;
            this.u = 10000;
            this.f6538v = 10000;
            this.f6539w = 10000;
        }
    }

    static {
        w4.a.f6589a = new a();
    }

    public u() {
        this(new b());
    }

    public u(b bVar) {
        boolean z5;
        androidx.activity.result.c cVar;
        this.f6499b = bVar.f6519a;
        this.f6500c = bVar.f6520b;
        List<h> list = bVar.f6521c;
        this.f6501d = list;
        this.f6502e = w4.e.k(bVar.f6522d);
        this.f6503f = w4.e.k(bVar.f6523e);
        this.f6504g = bVar.f6524f;
        this.f6505h = bVar.f6525g;
        this.f6506i = bVar.f6526h;
        this.f6507j = bVar.f6527i;
        loop0: while (true) {
            z5 = false;
            for (h hVar : list) {
                z5 = (z5 || hVar.f6419a) ? true : z5;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f6528j;
        if (sSLSocketFactory == null && z5) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            c5.f fVar = c5.f.f2787a;
                            SSLContext i6 = fVar.i();
                            i6.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f6508k = i6.getSocketFactory();
                            cVar = fVar.c(x509TrustManager);
                        } catch (GeneralSecurityException e6) {
                            throw new AssertionError("No System TLS", e6);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e7) {
                throw new AssertionError("No System TLS", e7);
            }
        }
        this.f6508k = sSLSocketFactory;
        cVar = bVar.f6529k;
        SSLSocketFactory sSLSocketFactory2 = this.f6508k;
        if (sSLSocketFactory2 != null) {
            c5.f.f2787a.f(sSLSocketFactory2);
        }
        this.f6509l = bVar.f6530l;
        f fVar2 = bVar.f6531m;
        this.f6510m = Objects.equals(fVar2.f6391b, cVar) ? fVar2 : new f(fVar2.f6390a, cVar);
        this.f6511n = bVar.f6532n;
        this.f6512o = bVar.f6533o;
        this.f6513p = bVar.f6534p;
        this.f6514q = bVar.f6535q;
        this.f6515r = bVar.f6536r;
        this.s = bVar.s;
        this.f6516t = bVar.f6537t;
        this.u = bVar.u;
        this.f6517v = bVar.f6538v;
        this.f6518w = bVar.f6539w;
        if (this.f6502e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f6502e);
        } else if (this.f6503f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f6503f);
        }
    }

    @Override // v4.d.a
    public final w a(x xVar) {
        w wVar = new w(this, xVar, false);
        wVar.f6549c = new y4.i(this, wVar);
        return wVar;
    }
}
