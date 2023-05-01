package v4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f6389c = new f(new LinkedHashSet(new ArrayList()), null);

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f6390a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final androidx.activity.result.c f6391b;

    /* loaded from: classes.dex */
    public static final class a {
        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                ((a) obj).getClass();
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public f(Set<a> set, @Nullable androidx.activity.result.c cVar) {
        this.f6390a = set;
        this.f6391b = cVar;
    }

    public static String b(X509Certificate x509Certificate) {
        if (x509Certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder("sha256/");
            try {
                sb.append(f5.h.g(MessageDigest.getInstance("SHA-256").digest(f5.h.g(x509Certificate.getPublicKey().getEncoded()).f3981b)).a());
                return sb.toString();
            } catch (NoSuchAlgorithmException e6) {
                throw new AssertionError(e6);
            }
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<a> it = this.f6390a.iterator();
        if (!it.hasNext()) {
            if (emptyList.isEmpty()) {
                return;
            }
            androidx.activity.result.c cVar = this.f6391b;
            if (cVar != 0) {
                list = cVar.j(str, list);
            }
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i6);
                if (emptyList.size() > 0) {
                    ((a) emptyList.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i7);
                sb.append("\n    ");
                sb.append(b(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = emptyList.size();
            for (int i8 = 0; i8 < size3; i8++) {
                sb.append("\n    ");
                sb.append((a) emptyList.get(i8));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
        it.next().getClass();
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f6391b, fVar.f6391b) && this.f6390a.equals(fVar.f6390a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6390a.hashCode() + (Objects.hashCode(this.f6391b) * 31);
    }
}
