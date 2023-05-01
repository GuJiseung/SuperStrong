package c5;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import v4.v;
/* loaded from: classes.dex */
public class b extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f2764c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f2765d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f2766e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f2767f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f2768g;

    /* renamed from: h  reason: collision with root package name */
    public final C0021b f2769h;

    /* loaded from: classes.dex */
    public static final class a extends androidx.activity.result.c {

        /* renamed from: c  reason: collision with root package name */
        public final Object f2770c;

        /* renamed from: d  reason: collision with root package name */
        public final Method f2771d;

        public a(Object obj, Method method) {
            this.f2770c = obj;
            this.f2771d = method;
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        @Override // androidx.activity.result.c
        public final List j(String str, List list) {
            try {
                return (List) this.f2771d.invoke(this.f2770c, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e7) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
                sSLPeerUnverifiedException.initCause(e7);
                throw sSLPeerUnverifiedException;
            }
        }
    }

    /* renamed from: c5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0021b {

        /* renamed from: a  reason: collision with root package name */
        public final Method f2772a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2773b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f2774c;

        public C0021b(Method method, Method method2, Method method3) {
            this.f2772a = method;
            this.f2773b = method2;
            this.f2774c = method3;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements e5.d {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f2775a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2776b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f2776b = method;
            this.f2775a = x509TrustManager;
        }

        @Override // e5.d
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f2776b.invoke(this.f2775a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e6) {
                throw new AssertionError("unable to get issues and signature", e6);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f2775a.equals(cVar.f2775a) && this.f2776b.equals(cVar.f2776b);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f2776b.hashCode() * 31) + this.f2775a.hashCode();
        }
    }

    public b(Class cls, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            method5 = cls2.getMethod("get", new Class[0]);
            method7 = cls2.getMethod("open", String.class);
            method6 = cls2.getMethod("warnIfOpen", new Class[0]);
        } catch (Exception unused) {
            method5 = null;
            method6 = null;
            method7 = null;
        }
        this.f2769h = new C0021b(method5, method7, method6);
        this.f2764c = cls;
        this.f2765d = method;
        this.f2766e = method2;
        this.f2767f = method3;
        this.f2768g = method4;
    }

    public static boolean o(String str, Class cls, Object obj) {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }

    @Override // c5.f
    public final androidx.activity.result.c c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // c5.f
    public final e5.d d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new e5.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // c5.f
    public void g(SSLSocket sSLSocket, String str, List<v> list) {
        if (this.f2764c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f2765d.invoke(sSLSocket, Boolean.TRUE);
                    this.f2766e.invoke(sSLSocket, str);
                } catch (IllegalAccessException | InvocationTargetException e6) {
                    throw new AssertionError(e6);
                }
            }
            this.f2768g.invoke(sSLSocket, f.e(list));
        }
    }

    @Override // c5.f
    public final void h(Socket socket, InetSocketAddress inetSocketAddress, int i6) {
        try {
            socket.connect(inetSocketAddress, i6);
        } catch (AssertionError e6) {
            if (!w4.e.n(e6)) {
                throw e6;
            }
            throw new IOException(e6);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    @Override // c5.f
    public final SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e6) {
            throw new IllegalStateException("No TLS provider", e6);
        }
    }

    @Override // c5.f
    @Nullable
    public String j(SSLSocket sSLSocket) {
        if (this.f2764c.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f2767f.invoke(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }
                return null;
            } catch (IllegalAccessException | InvocationTargetException e6) {
                throw new AssertionError(e6);
            }
        }
        return null;
    }

    @Override // c5.f
    @Nullable
    public final Object k() {
        C0021b c0021b = this.f2769h;
        Method method = c0021b.f2772a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            c0021b.f2773b.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // c5.f
    public final boolean l(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return o(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e6) {
            e = e6;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e7) {
            e = e7;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e8) {
            e = e8;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // c5.f
    public final void m(int i6, String str, @Nullable Throwable th) {
        int min;
        int i7 = i6 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            int indexOf = str.indexOf(10, i8);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i8 + 4000);
                Log.println(i7, "OkHttp", str.substring(i8, min));
                if (min >= indexOf) {
                    break;
                }
                i8 = min;
            }
            i8 = min + 1;
        }
    }

    @Override // c5.f
    public final void n(Object obj, String str) {
        C0021b c0021b = this.f2769h;
        c0021b.getClass();
        boolean z5 = false;
        if (obj != null) {
            try {
                c0021b.f2774c.invoke(obj, new Object[0]);
                z5 = true;
            } catch (Exception unused) {
            }
        }
        if (!z5) {
            m(5, str, null);
        }
    }
}
