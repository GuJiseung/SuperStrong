package v4;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f6454a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6455b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Certificate> f6456c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f6457d;

    public o(f0 f0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f6454a = f0Var;
        this.f6455b = gVar;
        this.f6456c = list;
        this.f6457d = list2;
    }

    public static o a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            }
            g a6 = g.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                if ("NONE".equals(protocol)) {
                    throw new IOException("tlsVersion == NONE");
                }
                f0 a7 = f0.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List l5 = certificateArr != null ? w4.e.l(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new o(a7, a6, l5, localCertificates != null ? w4.e.l(localCertificates) : Collections.emptyList());
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f6454a.equals(oVar.f6454a) && this.f6455b.equals(oVar.f6455b) && this.f6456c.equals(oVar.f6456c) && this.f6457d.equals(oVar.f6457d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6455b.hashCode();
        int hashCode2 = this.f6456c.hashCode();
        return this.f6457d.hashCode() + ((hashCode2 + ((hashCode + ((this.f6454a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Handshake{tlsVersion=" + this.f6454a + " cipherSuite=" + this.f6455b + " peerCertificates=" + b(this.f6456c) + " localCertificates=" + b(this.f6457d) + '}';
    }
}
