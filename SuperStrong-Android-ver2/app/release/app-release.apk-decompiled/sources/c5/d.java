package c5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import v4.v;
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Method f2777c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f2778d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f2779e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f2780f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f2781g;

    /* loaded from: classes.dex */
    public static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f2782a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2783b;

        /* renamed from: c  reason: collision with root package name */
        public String f2784c;

        public a(ArrayList arrayList) {
            this.f2782a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = w4.e.f6594b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f2783b = true;
                return null;
            }
            boolean equals = name.equals("protocols");
            List<String> list = this.f2782a;
            if (equals && objArr.length == 0) {
                return list;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list2 = (List) obj2;
                    int size = list2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = (String) list2.get(i6);
                        if (list.contains(str)) {
                            this.f2784c = str;
                            return str;
                        }
                    }
                    String str2 = list.get(0);
                    this.f2784c = str2;
                    return str2;
                }
            }
            if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                this.f2784c = (String) objArr[0];
                return null;
            }
            return method.invoke(this, objArr);
        }
    }

    public d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f2777c = method;
        this.f2778d = method2;
        this.f2779e = method3;
        this.f2780f = cls;
        this.f2781g = cls2;
    }

    @Override // c5.f
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f2779e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new AssertionError("failed to remove ALPN", e6);
        }
    }

    @Override // c5.f
    public final void g(SSLSocket sSLSocket, String str, List<v> list) {
        try {
            this.f2777c.invoke(null, sSLSocket, Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f2780f, this.f2781g}, new a(f.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new AssertionError("failed to set ALPN", e6);
        }
    }

    @Override // c5.f
    @Nullable
    public final String j(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f2778d.invoke(null, sSLSocket));
            boolean z5 = aVar.f2783b;
            if (!z5 && aVar.f2784c == null) {
                f.f2787a.m(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (z5) {
                return null;
            } else {
                return aVar.f2784c;
            }
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new AssertionError("failed to get ALPN selected protocol", e6);
        }
    }
}
