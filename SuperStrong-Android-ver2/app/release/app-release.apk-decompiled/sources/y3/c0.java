package y3;

import android.util.Log;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public final class c0 implements X509TrustManager {

    /* renamed from: a  reason: collision with root package name */
    public final X509Certificate f6765a;

    public c0(X509Certificate x509Certificate) {
        this.f6765a = x509Certificate;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr != null) {
            X509Certificate x509Certificate = this.f6765a;
            Log.d("ddddddddddddddddddddddddddddddd", x509Certificate.toString());
            Log.d("ddddddddddddddddddddddddddddddd", x509CertificateArr[0].toString());
            if (x509CertificateArr.length == 1 && l4.f.a(x509CertificateArr[0], x509Certificate)) {
                Log.d("sssssssssssssssssssssssss", "same same same smae");
                return;
            }
        }
        throw new CertificateException("Invalid server certificate");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[]{this.f6765a};
    }
}
