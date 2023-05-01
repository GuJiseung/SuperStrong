package q3;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import q3.c;
import q3.v;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Map<w3.a<?>, a<?>>> f5833a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f5834b;

    /* renamed from: c  reason: collision with root package name */
    public final s3.c f5835c;

    /* renamed from: d  reason: collision with root package name */
    public final t3.d f5836d;

    /* renamed from: e  reason: collision with root package name */
    public final List<y> f5837e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5838f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5839g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5840h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5841i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5842j;

    /* loaded from: classes.dex */
    public static class a<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public x<T> f5843a;

        @Override // q3.x
        public final T a(x3.a aVar) {
            x<T> xVar = this.f5843a;
            if (xVar != null) {
                return xVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // q3.x
        public final void b(x3.c cVar, T t5) {
            x<T> xVar = this.f5843a;
            if (xVar == null) {
                throw new IllegalStateException();
            }
            xVar.b(cVar, t5);
        }
    }

    static {
        new w3.a(Object.class);
    }

    public j() {
        this(s3.j.f6010g, c.f5829b, Collections.emptyMap(), true, v.f5849b, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public j(s3.j jVar, c.a aVar, Map map, boolean z5, v.a aVar2, List list, List list2, List list3) {
        this.f5833a = new ThreadLocal<>();
        this.f5834b = new ConcurrentHashMap();
        s3.c cVar = new s3.c(map);
        this.f5835c = cVar;
        this.f5838f = false;
        this.f5839g = false;
        this.f5840h = z5;
        this.f5841i = false;
        this.f5842j = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(t3.o.B);
        arrayList.add(t3.h.f6157b);
        arrayList.add(jVar);
        arrayList.addAll(list3);
        arrayList.add(t3.o.f6203p);
        arrayList.add(t3.o.f6194g);
        arrayList.add(t3.o.f6191d);
        arrayList.add(t3.o.f6192e);
        arrayList.add(t3.o.f6193f);
        x gVar = aVar2 == v.f5849b ? t3.o.f6198k : new g();
        arrayList.add(new t3.q(Long.TYPE, Long.class, gVar));
        arrayList.add(new t3.q(Double.TYPE, Double.class, new e()));
        arrayList.add(new t3.q(Float.TYPE, Float.class, new f()));
        arrayList.add(t3.o.f6199l);
        arrayList.add(t3.o.f6195h);
        arrayList.add(t3.o.f6196i);
        arrayList.add(new t3.p(AtomicLong.class, new w(new h(gVar))));
        arrayList.add(new t3.p(AtomicLongArray.class, new w(new i(gVar))));
        arrayList.add(t3.o.f6197j);
        arrayList.add(t3.o.f6200m);
        arrayList.add(t3.o.f6204q);
        arrayList.add(t3.o.f6205r);
        arrayList.add(new t3.p(BigDecimal.class, t3.o.f6201n));
        arrayList.add(new t3.p(BigInteger.class, t3.o.f6202o));
        arrayList.add(t3.o.s);
        arrayList.add(t3.o.f6206t);
        arrayList.add(t3.o.f6207v);
        arrayList.add(t3.o.f6208w);
        arrayList.add(t3.o.f6211z);
        arrayList.add(t3.o.u);
        arrayList.add(t3.o.f6189b);
        arrayList.add(t3.c.f6140b);
        arrayList.add(t3.o.f6210y);
        arrayList.add(t3.l.f6177b);
        arrayList.add(t3.k.f6175b);
        arrayList.add(t3.o.f6209x);
        arrayList.add(t3.a.f6134c);
        arrayList.add(t3.o.f6188a);
        arrayList.add(new t3.b(cVar));
        arrayList.add(new t3.g(cVar));
        t3.d dVar = new t3.d(cVar);
        this.f5836d = dVar;
        arrayList.add(dVar);
        arrayList.add(t3.o.C);
        arrayList.add(new t3.j(cVar, aVar, jVar, dVar));
        this.f5837e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d6) {
        if (Double.isNaN(d6) || Double.isInfinite(d6)) {
            throw new IllegalArgumentException(d6 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String str) {
        Class<q> cls = q.class;
        Object obj = null;
        if (str != null) {
            x3.a aVar = new x3.a(new StringReader(str));
            boolean z5 = this.f5842j;
            boolean z6 = true;
            aVar.f6694c = true;
            try {
                try {
                    try {
                        try {
                            aVar.M();
                            z6 = false;
                            obj = c(new w3.a(cls)).a(aVar);
                        } catch (IllegalStateException e6) {
                            throw new u(e6);
                        }
                    } catch (IOException e7) {
                        throw new u(e7);
                    }
                } catch (EOFException e8) {
                    if (!z6) {
                        throw new u(e8);
                    }
                } catch (AssertionError e9) {
                    throw new AssertionError("AssertionError (GSON 2.8.5): " + e9.getMessage(), e9);
                }
                aVar.f6694c = z5;
                if (obj != null) {
                    try {
                        if (aVar.M() != 10) {
                            throw new o("JSON document was not fully consumed.");
                        }
                    } catch (x3.d e10) {
                        throw new u(e10);
                    } catch (IOException e11) {
                        throw new o(e11);
                    }
                }
            } catch (Throwable th) {
                aVar.f6694c = z5;
                throw th;
            }
        }
        Class<?> cls2 = s3.o.f6046a.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.cast(obj);
    }

    public final <T> x<T> c(w3.a<T> aVar) {
        boolean z5;
        ConcurrentHashMap concurrentHashMap = this.f5834b;
        x<T> xVar = (x) concurrentHashMap.get(aVar);
        if (xVar != null) {
            return xVar;
        }
        ThreadLocal<Map<w3.a<?>, a<?>>> threadLocal = this.f5833a;
        Map<w3.a<?>, a<?>> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
            z5 = true;
        } else {
            z5 = false;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            for (y yVar : this.f5837e) {
                x<T> a6 = yVar.a(this, aVar);
                if (a6 != null) {
                    if (aVar3.f5843a == null) {
                        aVar3.f5843a = a6;
                        concurrentHashMap.put(aVar, a6);
                        return a6;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z5) {
                threadLocal.remove();
            }
        }
    }

    public final <T> x<T> d(y yVar, w3.a<T> aVar) {
        List<y> list = this.f5837e;
        if (!list.contains(yVar)) {
            yVar = this.f5836d;
        }
        boolean z5 = false;
        for (y yVar2 : list) {
            if (z5) {
                x<T> a6 = yVar2.a(this, aVar);
                if (a6 != null) {
                    return a6;
                }
            } else if (yVar2 == yVar) {
                z5 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final x3.c e(Writer writer) {
        if (this.f5839g) {
            writer.write(")]}'\n");
        }
        x3.c cVar = new x3.c(writer);
        if (this.f5841i) {
            cVar.f6713e = "  ";
            cVar.f6714f = ": ";
        }
        cVar.f6718j = this.f5838f;
        return cVar;
    }

    public final String f(Object obj) {
        if (obj == null) {
            p pVar = p.f5845b;
            StringWriter stringWriter = new StringWriter();
            try {
                h(pVar, e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e6) {
                throw new o(e6);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            g(obj, cls, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e7) {
            throw new o(e7);
        }
    }

    public final void g(Object obj, Class cls, x3.c cVar) {
        x c6 = c(new w3.a(cls));
        boolean z5 = cVar.f6715g;
        cVar.f6715g = true;
        boolean z6 = cVar.f6716h;
        cVar.f6716h = this.f5840h;
        boolean z7 = cVar.f6718j;
        cVar.f6718j = this.f5838f;
        try {
            try {
                try {
                    c6.b(cVar, obj);
                } catch (IOException e6) {
                    throw new o(e6);
                }
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e7.getMessage(), e7);
            }
        } finally {
            cVar.f6715g = z5;
            cVar.f6716h = z6;
            cVar.f6718j = z7;
        }
    }

    public final void h(p pVar, x3.c cVar) {
        boolean z5 = cVar.f6715g;
        cVar.f6715g = true;
        boolean z6 = cVar.f6716h;
        cVar.f6716h = this.f5840h;
        boolean z7 = cVar.f6718j;
        cVar.f6718j = this.f5838f;
        try {
            try {
                t3.o.A.b(cVar, pVar);
            } catch (IOException e6) {
                throw new o(e6);
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e7.getMessage(), e7);
            }
        } finally {
            cVar.f6715g = z5;
            cVar.f6716h = z6;
            cVar.f6718j = z7;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f5838f + ",factories:" + this.f5837e + ",instanceCreators:" + this.f5835c + "}";
    }
}
