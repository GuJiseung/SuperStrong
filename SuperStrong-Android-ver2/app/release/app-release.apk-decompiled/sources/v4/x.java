package v4;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import v4.p;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final q f6556a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6557b;

    /* renamed from: c  reason: collision with root package name */
    public final p f6558c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final a0 f6559d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f6560e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public volatile c f6561f;

    /* loaded from: classes.dex */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public q f6562a;

        /* renamed from: b  reason: collision with root package name */
        public String f6563b;

        /* renamed from: c  reason: collision with root package name */
        public p.a f6564c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public a0 f6565d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f6566e;

        public a() {
            this.f6566e = Collections.emptyMap();
            this.f6563b = "GET";
            this.f6564c = new p.a();
        }

        public a(x xVar) {
            this.f6566e = Collections.emptyMap();
            this.f6562a = xVar.f6556a;
            this.f6563b = xVar.f6557b;
            this.f6565d = xVar.f6559d;
            Map<Class<?>, Object> map = xVar.f6560e;
            this.f6566e = map.isEmpty() ? Collections.emptyMap() : new LinkedHashMap(map);
            this.f6564c = xVar.f6558c.e();
        }

        public final x a() {
            if (this.f6562a != null) {
                return new x(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final void b(String str, @Nullable a0 a0Var) {
            boolean z5;
            if (str != null) {
                if (str.length() != 0) {
                    if (a0Var != null && !kotlinx.coroutines.internal.f.c(str)) {
                        throw new IllegalArgumentException(b5.b.b("method ", str, " must not have a request body."));
                    }
                    if (a0Var == null) {
                        if (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH") && !str.equals("PROPPATCH") && !str.equals("REPORT")) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            throw new IllegalArgumentException(b5.b.b("method ", str, " must have a request body."));
                        }
                    }
                    this.f6563b = str;
                    this.f6565d = a0Var;
                    return;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public final void c(String str) {
            this.f6564c.b(str);
        }

        public final void d(Class cls, @Nullable Object obj) {
            if (cls == null) {
                throw new NullPointerException("type == null");
            }
            if (obj == null) {
                this.f6566e.remove(cls);
                return;
            }
            if (this.f6566e.isEmpty()) {
                this.f6566e = new LinkedHashMap();
            }
            this.f6566e.put(cls, cls.cast(obj));
        }
    }

    public x(a aVar) {
        Map<Class<?>, Object> unmodifiableMap;
        this.f6556a = aVar.f6562a;
        this.f6557b = aVar.f6563b;
        p.a aVar2 = aVar.f6564c;
        aVar2.getClass();
        this.f6558c = new p(aVar2);
        this.f6559d = aVar.f6565d;
        Map<Class<?>, Object> map = aVar.f6566e;
        byte[] bArr = w4.e.f6593a;
        if (map.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        this.f6560e = unmodifiableMap;
    }

    @Nullable
    public final String a(String str) {
        return this.f6558c.c(str);
    }

    public final String toString() {
        return "Request{method=" + this.f6557b + ", url=" + this.f6556a + ", tags=" + this.f6560e + '}';
    }
}
