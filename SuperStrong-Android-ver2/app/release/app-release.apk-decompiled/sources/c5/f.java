package c5;

import java.io.EOFException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import v4.v;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f2787a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f2788b;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
        if (r1 != null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    static {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.f.<clinit>():void");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            v vVar = (v) list.get(i6);
            if (vVar != v.f6540c) {
                arrayList.add(vVar.f6547b);
            }
        }
        return arrayList;
    }

    public static byte[] e(List<v> list) {
        f5.e eVar = new f5.e();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            v vVar = list.get(i6);
            if (vVar != v.f6540c) {
                eVar.G(vVar.f6547b.length());
                String str = vVar.f6547b;
                eVar.L(0, str.length(), str);
            }
        }
        try {
            return eVar.q(eVar.f3977c);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    public void a(SSLSocket sSLSocket) {
    }

    public androidx.activity.result.c c(X509TrustManager x509TrustManager) {
        return new e5.a(d(x509TrustManager));
    }

    public e5.d d(X509TrustManager x509TrustManager) {
        return new e5.b(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, @Nullable String str, List<v> list) {
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i6) {
        socket.connect(inetSocketAddress, i6);
    }

    public SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e6) {
            throw new IllegalStateException("No TLS provider", e6);
        }
    }

    @Nullable
    public String j(SSLSocket sSLSocket) {
        return null;
    }

    @Nullable
    public Object k() {
        if (f2788b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean l(String str) {
        return true;
    }

    public void m(int i6, String str, @Nullable Throwable th) {
        f2788b.log(i6 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void n(Object obj, String str) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
