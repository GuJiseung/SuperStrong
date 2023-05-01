package g5;

import g5.a;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import v4.p;
import v4.t;
/* loaded from: classes.dex */
public abstract class x<T> {

    /* loaded from: classes.dex */
    public static final class a<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f4287a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4288b;

        /* renamed from: c  reason: collision with root package name */
        public final g5.f<T, v4.a0> f4289c;

        public a(Method method, int i6, g5.f<T, v4.a0> fVar) {
            this.f4287a = method;
            this.f4288b = i6;
            this.f4289c = fVar;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable T t5) {
            int i6 = this.f4288b;
            Method method = this.f4287a;
            if (t5 != null) {
                try {
                    zVar.f4342k = this.f4289c.a(t5);
                    return;
                } catch (IOException e6) {
                    throw h0.k(method, e6, i6, "Unable to convert " + t5 + " to RequestBody", new Object[0]);
                }
            }
            throw h0.j(method, i6, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f4290a;

        /* renamed from: b  reason: collision with root package name */
        public final g5.f<T, String> f4291b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4292c;

        public b(String str, boolean z5) {
            a.d dVar = a.d.f4174b;
            Objects.requireNonNull(str, "name == null");
            this.f4290a = str;
            this.f4291b = dVar;
            this.f4292c = z5;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable T t5) {
            String a6;
            if (t5 == null || (a6 = this.f4291b.a(t5)) == null) {
                return;
            }
            zVar.a(this.f4290a, a6, this.f4292c);
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f4293a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4294b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4295c;

        public c(Method method, int i6, boolean z5) {
            this.f4293a = method;
            this.f4294b = i6;
            this.f4295c = z5;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable Object obj) {
            Map map = (Map) obj;
            int i6 = this.f4294b;
            Method method = this.f4293a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.a(str, obj2, this.f4295c);
                            } else {
                                throw h0.j(method, i6, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw h0.j(method, i6, b5.b.b("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.j(method, i6, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.j(method, i6, "Field map was null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f4296a;

        /* renamed from: b  reason: collision with root package name */
        public final g5.f<T, String> f4297b;

        public d(String str) {
            a.d dVar = a.d.f4174b;
            Objects.requireNonNull(str, "name == null");
            this.f4296a = str;
            this.f4297b = dVar;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable T t5) {
            String a6;
            if (t5 == null || (a6 = this.f4297b.a(t5)) == null) {
                return;
            }
            zVar.b(this.f4296a, a6);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f4298a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4299b;

        public e(Method method, int i6) {
            this.f4298a = method;
            this.f4299b = i6;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable Object obj) {
            Map map = (Map) obj;
            int i6 = this.f4299b;
            Method method = this.f4298a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            zVar.b(str, value.toString());
                        } else {
                            throw h0.j(method, i6, b5.b.b("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.j(method, i6, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.j(method, i6, "Header map was null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends x<v4.p> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f4300a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4301b;

        public f(int i6, Method method) {
            this.f4300a = method;
            this.f4301b = i6;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable v4.p pVar) {
            v4.p pVar2 = pVar;
            if (pVar2 != null) {
                p.a aVar = zVar.f4337f;
                aVar.getClass();
                int length = pVar2.f6458a.length / 2;
                for (int i6 = 0; i6 < length; i6++) {
                    aVar.a(pVar2.d(i6), pVar2.g(i6));
                }
                return;
            }
            int i7 = this.f4301b;
            throw h0.j(this.f4300a, i7, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f4302a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4303b;

        /* renamed from: c  reason: collision with root package name */
        public final v4.p f4304c;

        /* renamed from: d  reason: collision with root package name */
        public final g5.f<T, v4.a0> f4305d;

        public g(Method method, int i6, v4.p pVar, g5.f<T, v4.a0> fVar) {
            this.f4302a = method;
            this.f4303b = i6;
            this.f4304c = pVar;
            this.f4305d = fVar;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable T t5) {
            if (t5 == null) {
                return;
            }
            try {
                zVar.c(this.f4304c, this.f4305d.a(t5));
            } catch (IOException e6) {
                throw h0.j(this.f4302a, this.f4303b, "Unable to convert " + t5 + " to RequestBody", e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f4306a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4307b;

        /* renamed from: c  reason: collision with root package name */
        public final g5.f<T, v4.a0> f4308c;

        /* renamed from: d  reason: collision with root package name */
        public final String f4309d;

        public h(Method method, int i6, g5.f<T, v4.a0> fVar, String str) {
            this.f4306a = method;
            this.f4307b = i6;
            this.f4308c = fVar;
            this.f4309d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // g5.x
        public final void a(z zVar, @Nullable Object obj) {
            Map map = (Map) obj;
            int i6 = this.f4307b;
            Method method = this.f4306a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            zVar.c(v4.p.f("Content-Disposition", b5.b.b("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f4309d), (v4.a0) this.f4308c.a(value));
                        } else {
                            throw h0.j(method, i6, b5.b.b("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.j(method, i6, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.j(method, i6, "Part map was null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class i<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f4310a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4311b;

        /* renamed from: c  reason: collision with root package name */
        public final String f4312c;

        /* renamed from: d  reason: collision with root package name */
        public final g5.f<T, String> f4313d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f4314e;

        public i(Method method, int i6, String str, boolean z5) {
            a.d dVar = a.d.f4174b;
            this.f4310a = method;
            this.f4311b = i6;
            Objects.requireNonNull(str, "name == null");
            this.f4312c = str;
            this.f4313d = dVar;
            this.f4314e = z5;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
        @Override // g5.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(g5.z r18, @javax.annotation.Nullable T r19) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: g5.x.i.a(g5.z, java.lang.Object):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class j<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f4315a;

        /* renamed from: b  reason: collision with root package name */
        public final g5.f<T, String> f4316b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4317c;

        public j(String str, boolean z5) {
            a.d dVar = a.d.f4174b;
            Objects.requireNonNull(str, "name == null");
            this.f4315a = str;
            this.f4316b = dVar;
            this.f4317c = z5;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable T t5) {
            String a6;
            if (t5 == null || (a6 = this.f4316b.a(t5)) == null) {
                return;
            }
            zVar.d(this.f4315a, a6, this.f4317c);
        }
    }

    /* loaded from: classes.dex */
    public static final class k<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f4318a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4319b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4320c;

        public k(Method method, int i6, boolean z5) {
            this.f4318a = method;
            this.f4319b = i6;
            this.f4320c = z5;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable Object obj) {
            Map map = (Map) obj;
            int i6 = this.f4319b;
            Method method = this.f4318a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.d(str, obj2, this.f4320c);
                            } else {
                                throw h0.j(method, i6, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw h0.j(method, i6, b5.b.b("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.j(method, i6, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.j(method, i6, "Query map was null", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class l<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4321a;

        public l(boolean z5) {
            this.f4321a = z5;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable T t5) {
            if (t5 == null) {
                return;
            }
            zVar.d(t5.toString(), null, this.f4321a);
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends x<t.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f4322a = new m();

        @Override // g5.x
        public final void a(z zVar, @Nullable t.b bVar) {
            t.b bVar2 = bVar;
            if (bVar2 != null) {
                zVar.f4340i.f6494c.add(bVar2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends x<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f4323a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4324b;

        public n(int i6, Method method) {
            this.f4323a = method;
            this.f4324b = i6;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable Object obj) {
            if (obj != null) {
                zVar.f4334c = obj.toString();
                return;
            }
            int i6 = this.f4324b;
            throw h0.j(this.f4323a, i6, "@Url parameter is null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class o<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f4325a;

        public o(Class<T> cls) {
            this.f4325a = cls;
        }

        @Override // g5.x
        public final void a(z zVar, @Nullable T t5) {
            zVar.f4336e.d(this.f4325a, t5);
        }
    }

    public abstract void a(z zVar, @Nullable T t5);
}
