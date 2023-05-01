package v4;

import androidx.fragment.app.x0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import v4.q;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final q f6324a;

    /* renamed from: b  reason: collision with root package name */
    public final l f6325b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f6326c;

    /* renamed from: d  reason: collision with root package name */
    public final b f6327d;

    /* renamed from: e  reason: collision with root package name */
    public final List<v> f6328e;

    /* renamed from: f  reason: collision with root package name */
    public final List<h> f6329f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f6330g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f6331h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f6332i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f6333j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final f f6334k;

    public a(String str, int i6, a2.d dVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable f fVar, x0 x0Var, List list, List list2, ProxySelector proxySelector) {
        q.a aVar = new q.a();
        String str2 = "https";
        String str3 = sSLSocketFactory != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            str2 = "http";
        } else if (!str3.equalsIgnoreCase("https")) {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str3));
        }
        aVar.f6470a = str2;
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String a6 = w4.e.a(q.j(str, 0, str.length(), false));
        if (a6 != null) {
            aVar.f6473d = a6;
            if (i6 > 0 && i6 <= 65535) {
                aVar.f6474e = i6;
                this.f6324a = aVar.a();
                if (dVar == null) {
                    throw new NullPointerException("dns == null");
                }
                this.f6325b = dVar;
                if (socketFactory == null) {
                    throw new NullPointerException("socketFactory == null");
                }
                this.f6326c = socketFactory;
                if (x0Var == null) {
                    throw new NullPointerException("proxyAuthenticator == null");
                }
                this.f6327d = x0Var;
                if (list == null) {
                    throw new NullPointerException("protocols == null");
                }
                this.f6328e = w4.e.k(list);
                if (list2 == null) {
                    throw new NullPointerException("connectionSpecs == null");
                }
                this.f6329f = w4.e.k(list2);
                if (proxySelector == null) {
                    throw new NullPointerException("proxySelector == null");
                }
                this.f6330g = proxySelector;
                this.f6331h = null;
                this.f6332i = sSLSocketFactory;
                this.f6333j = hostnameVerifier;
                this.f6334k = fVar;
                return;
            }
            throw new IllegalArgumentException(androidx.activity.j.a("unexpected port: ", i6));
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final boolean a(a aVar) {
        if (this.f6325b.equals(aVar.f6325b) && this.f6327d.equals(aVar.f6327d) && this.f6328e.equals(aVar.f6328e) && this.f6329f.equals(aVar.f6329f) && this.f6330g.equals(aVar.f6330g) && Objects.equals(this.f6331h, aVar.f6331h) && Objects.equals(this.f6332i, aVar.f6332i) && Objects.equals(this.f6333j, aVar.f6333j) && Objects.equals(this.f6334k, aVar.f6334k) && this.f6324a.f6465e == aVar.f6324a.f6465e) {
            return true;
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f6324a.equals(aVar.f6324a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6325b.hashCode();
        int hashCode2 = this.f6327d.hashCode();
        int hashCode3 = this.f6328e.hashCode();
        int hashCode4 = this.f6329f.hashCode();
        int hashCode5 = this.f6330g.hashCode();
        int hashCode6 = Objects.hashCode(this.f6331h);
        int hashCode7 = Objects.hashCode(this.f6332i);
        int hashCode8 = Objects.hashCode(this.f6333j);
        return Objects.hashCode(this.f6334k) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f6324a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        q qVar = this.f6324a;
        sb.append(qVar.f6464d);
        sb.append(":");
        sb.append(qVar.f6465e);
        Object obj = this.f6331h;
        if (obj != null) {
            sb.append(", proxy=");
        } else {
            sb.append(", proxySelector=");
            obj = this.f6330g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
