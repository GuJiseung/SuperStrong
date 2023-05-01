package y4;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v4.e0;
import v4.m;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final v4.a f6890a;

    /* renamed from: b  reason: collision with root package name */
    public final q3.b f6891b;

    /* renamed from: c  reason: collision with root package name */
    public final m f6892c;

    /* renamed from: d  reason: collision with root package name */
    public List<Proxy> f6893d;

    /* renamed from: e  reason: collision with root package name */
    public int f6894e;

    /* renamed from: f  reason: collision with root package name */
    public List<InetSocketAddress> f6895f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f6896g = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<e0> f6897a;

        /* renamed from: b  reason: collision with root package name */
        public int f6898b = 0;

        public a(ArrayList arrayList) {
            this.f6897a = arrayList;
        }
    }

    public h(v4.a aVar, q3.b bVar, v4.d dVar, m mVar) {
        List<Proxy> l5;
        this.f6893d = Collections.emptyList();
        this.f6890a = aVar;
        this.f6891b = bVar;
        this.f6892c = mVar;
        Proxy proxy = aVar.f6331h;
        if (proxy != null) {
            l5 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f6330g.select(aVar.f6324a.o());
            if (select != null && !select.isEmpty()) {
                l5 = w4.e.k(select);
            } else {
                l5 = w4.e.l(Proxy.NO_PROXY);
            }
        }
        this.f6893d = l5;
        this.f6894e = 0;
    }
}
