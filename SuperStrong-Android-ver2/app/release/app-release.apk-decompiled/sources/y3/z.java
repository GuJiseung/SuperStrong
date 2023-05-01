package y3;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import q3.c;
import q3.v;
import v4.q;
import v4.u;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static X509TrustManager f6833a;

    /* renamed from: b  reason: collision with root package name */
    public static SSLContext f6834b;

    /* renamed from: c  reason: collision with root package name */
    public static v4.u f6835c;

    /* renamed from: d  reason: collision with root package name */
    public static b f6836d;

    static {
        List<String> list;
        List singletonList;
        List emptyList;
        Method[] declaredMethods;
        Object[] objArr;
        s3.j jVar = s3.j.f6010g;
        v.a aVar = q3.v.f5849b;
        c.a aVar2 = q3.c.f5829b;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        q3.j jVar2 = new q3.j(jVar, aVar2, hashMap, true, aVar, arrayList, arrayList2, arrayList3);
        byte[] bytes = "-----BEGIN CERTIFICATE-----\nMIIDdTCCAl2gAwIBAgIEMX6TrDANBgkqhkiG9w0BAQsFADBrMQswCQYDVQQGEwJr\nbzEQMA4GA1UECBMHVW5rbm93bjEQMA4GA1UEBxMHVW5rbm93bjEUMBIGA1UEChML\nc3VwZXJzdHJvbmcxEDAOBgNVBAsTB1Vua25vd24xEDAOBgNVBAMTB1Vua25vd24w\nHhcNMjMwNDIwMTQzNDQ1WhcNMjMwNzE5MTQzNDQ1WjBrMQswCQYDVQQGEwJrbzEQ\nMA4GA1UECBMHVW5rbm93bjEQMA4GA1UEBxMHVW5rbm93bjEUMBIGA1UEChMLc3Vw\nZXJzdHJvbmcxEDAOBgNVBAsTB1Vua25vd24xEDAOBgNVBAMTB1Vua25vd24wggEi\nMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQC/clu6ODehkWJDXt/pCvnEya/z\nwgpe9RHR8sWIjbbuq2xEl5Swy5fcND03LM97nr2I1UsXtez7p5iD+iQLSPzLroRy\nGjVfvNoDq2s+WCQ50RNr+Kc09I81pfARsXLM2kKwPYkBKu4y6h8OtE2cd1KUa6nn\n065RFUJyvshpRUazXOC0qjhggTv4gBfsANf/BbkyE8ERvm0Bm/mYXaoQeivPCgj5\nhnR2VGL+vN7C0Z/xeRKE5UEO4FSC8fDLpJmficnywUX8pyWhTyQaBCnOO8bmwdTV\nXkPh/ggzakvT4NRTgxRafloR/kfBTE8/BsQ0aW15p5/DA+i3w2jL3EjTtYWNAgMB\nAAGjITAfMB0GA1UdDgQWBBTNoKmYI+nGLCFmX84IZcQ7vTnCyDANBgkqhkiG9w0B\nAQsFAAOCAQEAY9mLgta2zmrAJQiSaLsA3/8anK91yNho+0l/N1ikfDd4sLmFt073\n027CTlRNHtDovpdnvN10XyOpu9xE52DSwPPCluQsNYdyOvNnf53IEC+MjTpOnBiQ\nXVkP+932BlAQxYOqKLsdj9Sc3o+HRF6bIfSzMgYwrhE5QJgkA5Fm59ZR3I/Elw5b\n4yCJrIh69B0YEM+kUKde+7Ttkm6qP99WnKfdnhK4fyvt1EYu9QpR3xz0XE81dpnW\n4fV1k87KQz/yskpkPbMxkzv2kiRkZLTYdsna89UacwMYqskEUV9xO70TVPLlJ7ft\nuLUn8kacAAOjOtv7e2ANAQVY6XZuBNnsIQ==\n-----END CERTIFICATE-----".getBytes(r4.a.f5970a);
        l4.f.e(bytes, "this as java.lang.String).getBytes(charset)");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        l4.f.e(certificateFactory, "getInstance(\"X.509\")");
        Certificate generateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
        l4.f.d(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        f6833a = new c0((X509Certificate) generateCertificate);
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        l4.f.e(sSLContext, "getInstance(\"SSL\")");
        f6834b = sSLContext;
        X509TrustManager[] x509TrustManagerArr = new X509TrustManager[1];
        X509TrustManager x509TrustManager = f6833a;
        if (x509TrustManager != null) {
            x509TrustManagerArr[0] = x509TrustManager;
            sSLContext.init(null, x509TrustManagerArr, new SecureRandom());
            u.b bVar = new u.b();
            SSLContext sSLContext2 = f6834b;
            if (sSLContext2 != null) {
                SSLSocketFactory socketFactory = sSLContext2.getSocketFactory();
                X509TrustManager x509TrustManager2 = f6833a;
                if (x509TrustManager2 != null) {
                    if (socketFactory != null) {
                        bVar.f6528j = socketFactory;
                        bVar.f6529k = c5.f.f2787a.c(x509TrustManager2);
                        bVar.f6530l = new HostnameVerifier() { // from class: y3.y
                            @Override // javax.net.ssl.HostnameVerifier
                            public final boolean verify(String str, SSLSession sSLSession) {
                                X509TrustManager x509TrustManager3 = z.f6833a;
                                return true;
                            }
                        };
                        f6835c = new v4.u(bVar);
                        g5.y yVar = g5.y.f4326c;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        q.a aVar3 = new q.a();
                        aVar3.b(null, "https://ec2-43-201-205-63.ap-northeast-2.compute.amazonaws.com");
                        v4.q a6 = aVar3.a();
                        if ("".equals(a6.f6466f.get(list.size() - 1))) {
                            arrayList5.add(new h5.a(jVar2));
                            v4.u uVar = f6835c;
                            if (uVar != null) {
                                Executor a7 = yVar.a();
                                ArrayList arrayList7 = new ArrayList(arrayList6);
                                g5.i iVar = new g5.i(a7);
                                boolean z5 = yVar.f4327a;
                                if (z5) {
                                    singletonList = Arrays.asList(g5.e.f4224a, iVar);
                                } else {
                                    singletonList = Collections.singletonList(iVar);
                                }
                                arrayList7.addAll(singletonList);
                                ArrayList arrayList8 = new ArrayList(arrayList5.size() + 1 + (z5 ? 1 : 0));
                                arrayList8.add(new g5.a());
                                arrayList8.addAll(arrayList5);
                                if (z5) {
                                    emptyList = Collections.singletonList(g5.u.f4283a);
                                } else {
                                    emptyList = Collections.emptyList();
                                }
                                arrayList8.addAll(emptyList);
                                g5.d0 d0Var = new g5.d0(uVar, a6, Collections.unmodifiableList(arrayList8), Collections.unmodifiableList(arrayList7));
                                if (b.class.isInterface()) {
                                    ArrayDeque arrayDeque = new ArrayDeque(1);
                                    arrayDeque.add(b.class);
                                    while (!arrayDeque.isEmpty()) {
                                        Class cls = (Class) arrayDeque.removeFirst();
                                        if (cls.getTypeParameters().length != 0) {
                                            StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                                            sb.append(cls.getName());
                                            if (cls != b.class) {
                                                sb.append(" which is an interface of ");
                                                sb.append(b.class.getName());
                                            }
                                            throw new IllegalArgumentException(sb.toString());
                                        }
                                        Collections.addAll(arrayDeque, cls.getInterfaces());
                                    }
                                    if (d0Var.f4223f) {
                                        g5.y yVar2 = g5.y.f4326c;
                                        for (Method method : b.class.getDeclaredMethods()) {
                                            if (yVar2.f4327a && method.isDefault()) {
                                                objArr = 1;
                                            } else {
                                                objArr = null;
                                            }
                                            if (objArr == null && !Modifier.isStatic(method.getModifiers())) {
                                                d0Var.b(method);
                                            }
                                        }
                                    }
                                    Object newProxyInstance = Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{b.class}, new g5.c0(d0Var));
                                    l4.f.e(newProxyInstance, "retrofit.create(BackendApiService::class.java)");
                                    f6836d = (b) newProxyInstance;
                                    return;
                                }
                                throw new IllegalArgumentException("API declarations must be interfaces.");
                            }
                            l4.f.k("client");
                            throw null;
                        }
                        throw new IllegalArgumentException("baseUrl must end in /: " + a6);
                    }
                    throw new NullPointerException("sslSocketFactory == null");
                }
                l4.f.k("trustManager");
                throw null;
            }
            l4.f.k("sslContext");
            throw null;
        }
        l4.f.k("trustManager");
        throw null;
    }

    public static b a() {
        b bVar = f6836d;
        if (bVar != null) {
            return bVar;
        }
        l4.f.k("backendApiService");
        throw null;
    }
}
