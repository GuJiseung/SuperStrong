package c5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import v4.v;
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Method f2785c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f2786d;

    public e(Method method, Method method2) {
        this.f2785c = method;
        this.f2786d = method2;
    }

    @Override // c5.f
    public final void g(SSLSocket sSLSocket, String str, List<v> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b6 = f.b(list);
            this.f2785c.invoke(sSLParameters, b6.toArray(new String[b6.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new AssertionError("failed to set SSL parameters", e6);
        }
    }

    @Override // c5.f
    @Nullable
    public final String j(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f2786d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to get ALPN selected protocol", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        }
    }
}
