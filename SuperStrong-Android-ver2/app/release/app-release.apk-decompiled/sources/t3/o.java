package t3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import s3.m;
/* loaded from: classes.dex */
public final class o {
    public static final u A;
    public static final t3.s B;
    public static final w C;

    /* renamed from: a  reason: collision with root package name */
    public static final t3.p f6188a = new t3.p(Class.class, new q3.w(new k()));

    /* renamed from: b  reason: collision with root package name */
    public static final t3.p f6189b = new t3.p(BitSet.class, new q3.w(new v()));

    /* renamed from: c  reason: collision with root package name */
    public static final y f6190c;

    /* renamed from: d  reason: collision with root package name */
    public static final t3.q f6191d;

    /* renamed from: e  reason: collision with root package name */
    public static final t3.q f6192e;

    /* renamed from: f  reason: collision with root package name */
    public static final t3.q f6193f;

    /* renamed from: g  reason: collision with root package name */
    public static final t3.q f6194g;

    /* renamed from: h  reason: collision with root package name */
    public static final t3.p f6195h;

    /* renamed from: i  reason: collision with root package name */
    public static final t3.p f6196i;

    /* renamed from: j  reason: collision with root package name */
    public static final t3.p f6197j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f6198k;

    /* renamed from: l  reason: collision with root package name */
    public static final t3.p f6199l;

    /* renamed from: m  reason: collision with root package name */
    public static final t3.q f6200m;

    /* renamed from: n  reason: collision with root package name */
    public static final h f6201n;

    /* renamed from: o  reason: collision with root package name */
    public static final i f6202o;

    /* renamed from: p  reason: collision with root package name */
    public static final t3.p f6203p;

    /* renamed from: q  reason: collision with root package name */
    public static final t3.p f6204q;

    /* renamed from: r  reason: collision with root package name */
    public static final t3.p f6205r;
    public static final t3.p s;

    /* renamed from: t  reason: collision with root package name */
    public static final t3.p f6206t;
    public static final t3.s u;

    /* renamed from: v  reason: collision with root package name */
    public static final t3.p f6207v;

    /* renamed from: w  reason: collision with root package name */
    public static final t3.p f6208w;

    /* renamed from: x  reason: collision with root package name */
    public static final r f6209x;

    /* renamed from: y  reason: collision with root package name */
    public static final t3.r f6210y;

    /* renamed from: z  reason: collision with root package name */
    public static final t3.p f6211z;

    /* loaded from: classes.dex */
    public static class a extends q3.x<AtomicIntegerArray> {
        @Override // q3.x
        public final AtomicIntegerArray a(x3.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.q()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.E()));
                } catch (NumberFormatException e6) {
                    throw new q3.u(e6);
                }
            }
            aVar.k();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i6 = 0; i6 < size; i6++) {
                atomicIntegerArray.set(i6, ((Integer) arrayList.get(i6)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // q3.x
        public final void b(x3.c cVar, AtomicIntegerArray atomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            cVar.f();
            int length = atomicIntegerArray2.length();
            for (int i6 = 0; i6 < length; i6++) {
                cVar.w(atomicIntegerArray2.get(i6));
            }
            cVar.k();
        }
    }

    /* loaded from: classes.dex */
    public static class a0 extends q3.x<Number> {
        @Override // q3.x
        public final Number a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.E());
            } catch (NumberFormatException e6) {
                throw new q3.u(e6);
            }
        }

        @Override // q3.x
        public final void b(x3.c cVar, Number number) {
            cVar.E(number);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends q3.x<Number> {
        @Override // q3.x
        public final Number a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            try {
                return Long.valueOf(aVar.F());
            } catch (NumberFormatException e6) {
                throw new q3.u(e6);
            }
        }

        @Override // q3.x
        public final void b(x3.c cVar, Number number) {
            cVar.E(number);
        }
    }

    /* loaded from: classes.dex */
    public static class b0 extends q3.x<Number> {
        @Override // q3.x
        public final Number a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            try {
                return Integer.valueOf(aVar.E());
            } catch (NumberFormatException e6) {
                throw new q3.u(e6);
            }
        }

        @Override // q3.x
        public final void b(x3.c cVar, Number number) {
            cVar.E(number);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends q3.x<Number> {
        @Override // q3.x
        public final Number a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            return Float.valueOf((float) aVar.x());
        }

        @Override // q3.x
        public final void b(x3.c cVar, Number number) {
            cVar.E(number);
        }
    }

    /* loaded from: classes.dex */
    public static class c0 extends q3.x<AtomicInteger> {
        @Override // q3.x
        public final AtomicInteger a(x3.a aVar) {
            try {
                return new AtomicInteger(aVar.E());
            } catch (NumberFormatException e6) {
                throw new q3.u(e6);
            }
        }

        @Override // q3.x
        public final void b(x3.c cVar, AtomicInteger atomicInteger) {
            cVar.w(atomicInteger.get());
        }
    }

    /* loaded from: classes.dex */
    public static class d extends q3.x<Number> {
        @Override // q3.x
        public final Number a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            return Double.valueOf(aVar.x());
        }

        @Override // q3.x
        public final void b(x3.c cVar, Number number) {
            cVar.E(number);
        }
    }

    /* loaded from: classes.dex */
    public static class d0 extends q3.x<AtomicBoolean> {
        @Override // q3.x
        public final AtomicBoolean a(x3.a aVar) {
            return new AtomicBoolean(aVar.w());
        }

        @Override // q3.x
        public final void b(x3.c cVar, AtomicBoolean atomicBoolean) {
            cVar.G(atomicBoolean.get());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends q3.x<Number> {
        @Override // q3.x
        public final Number a(x3.a aVar) {
            int M = aVar.M();
            int a6 = m.g.a(M);
            if (a6 == 5 || a6 == 6) {
                return new s3.l(aVar.K());
            }
            if (a6 == 8) {
                aVar.I();
                return null;
            }
            throw new q3.u("Expecting number, got: ".concat(x3.b.a(M)));
        }

        @Override // q3.x
        public final void b(x3.c cVar, Number number) {
            cVar.E(number);
        }
    }

    /* loaded from: classes.dex */
    public static final class e0<T extends Enum<T>> extends q3.x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f6212a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f6213b = new HashMap();

        public e0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t5 : cls.getEnumConstants()) {
                    String name = t5.name();
                    r3.b bVar = (r3.b) cls.getField(name).getAnnotation(r3.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.f6212a.put(str, t5);
                        }
                    }
                    this.f6212a.put(name, t5);
                    this.f6213b.put(t5, name);
                }
            } catch (NoSuchFieldException e6) {
                throw new AssertionError(e6);
            }
        }

        @Override // q3.x
        public final Object a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            return (Enum) this.f6212a.get(aVar.K());
        }

        @Override // q3.x
        public final void b(x3.c cVar, Object obj) {
            String str;
            Enum r32 = (Enum) obj;
            if (r32 == null) {
                str = null;
            } else {
                str = (String) this.f6213b.get(r32);
            }
            cVar.F(str);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends q3.x<Character> {
        @Override // q3.x
        public final Character a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            String K = aVar.K();
            if (K.length() == 1) {
                return Character.valueOf(K.charAt(0));
            }
            throw new q3.u("Expecting character, got: ".concat(K));
        }

        @Override // q3.x
        public final void b(x3.c cVar, Character ch) {
            String valueOf;
            Character ch2 = ch;
            if (ch2 == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(ch2);
            }
            cVar.F(valueOf);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends q3.x<String> {
        @Override // q3.x
        public final String a(x3.a aVar) {
            int M = aVar.M();
            if (M != 9) {
                return M == 8 ? Boolean.toString(aVar.w()) : aVar.K();
            }
            aVar.I();
            return null;
        }

        @Override // q3.x
        public final void b(x3.c cVar, String str) {
            cVar.F(str);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends q3.x<BigDecimal> {
        @Override // q3.x
        public final BigDecimal a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            try {
                return new BigDecimal(aVar.K());
            } catch (NumberFormatException e6) {
                throw new q3.u(e6);
            }
        }

        @Override // q3.x
        public final void b(x3.c cVar, BigDecimal bigDecimal) {
            cVar.E(bigDecimal);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends q3.x<BigInteger> {
        @Override // q3.x
        public final BigInteger a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            try {
                return new BigInteger(aVar.K());
            } catch (NumberFormatException e6) {
                throw new q3.u(e6);
            }
        }

        @Override // q3.x
        public final void b(x3.c cVar, BigInteger bigInteger) {
            cVar.E(bigInteger);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends q3.x<StringBuilder> {
        @Override // q3.x
        public final StringBuilder a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            return new StringBuilder(aVar.K());
        }

        @Override // q3.x
        public final void b(x3.c cVar, StringBuilder sb) {
            String sb2;
            StringBuilder sb3 = sb;
            if (sb3 == null) {
                sb2 = null;
            } else {
                sb2 = sb3.toString();
            }
            cVar.F(sb2);
        }
    }

    /* loaded from: classes.dex */
    public static class k extends q3.x<Class> {
        @Override // q3.x
        public final Class a(x3.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // q3.x
        public final void b(x3.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: classes.dex */
    public static class l extends q3.x<StringBuffer> {
        @Override // q3.x
        public final StringBuffer a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            return new StringBuffer(aVar.K());
        }

        @Override // q3.x
        public final void b(x3.c cVar, StringBuffer stringBuffer) {
            String stringBuffer2;
            StringBuffer stringBuffer3 = stringBuffer;
            if (stringBuffer3 == null) {
                stringBuffer2 = null;
            } else {
                stringBuffer2 = stringBuffer3.toString();
            }
            cVar.F(stringBuffer2);
        }
    }

    /* loaded from: classes.dex */
    public static class m extends q3.x<URL> {
        @Override // q3.x
        public final URL a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
            } else {
                String K = aVar.K();
                if (!"null".equals(K)) {
                    return new URL(K);
                }
            }
            return null;
        }

        @Override // q3.x
        public final void b(x3.c cVar, URL url) {
            String externalForm;
            URL url2 = url;
            if (url2 == null) {
                externalForm = null;
            } else {
                externalForm = url2.toExternalForm();
            }
            cVar.F(externalForm);
        }
    }

    /* loaded from: classes.dex */
    public static class n extends q3.x<URI> {
        @Override // q3.x
        public final URI a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
            } else {
                try {
                    String K = aVar.K();
                    if (!"null".equals(K)) {
                        return new URI(K);
                    }
                } catch (URISyntaxException e6) {
                    throw new q3.o(e6);
                }
            }
            return null;
        }

        @Override // q3.x
        public final void b(x3.c cVar, URI uri) {
            String aSCIIString;
            URI uri2 = uri;
            if (uri2 == null) {
                aSCIIString = null;
            } else {
                aSCIIString = uri2.toASCIIString();
            }
            cVar.F(aSCIIString);
        }
    }

    /* renamed from: t3.o$o  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0092o extends q3.x<InetAddress> {
        @Override // q3.x
        public final InetAddress a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            return InetAddress.getByName(aVar.K());
        }

        @Override // q3.x
        public final void b(x3.c cVar, InetAddress inetAddress) {
            String hostAddress;
            InetAddress inetAddress2 = inetAddress;
            if (inetAddress2 == null) {
                hostAddress = null;
            } else {
                hostAddress = inetAddress2.getHostAddress();
            }
            cVar.F(hostAddress);
        }
    }

    /* loaded from: classes.dex */
    public static class p extends q3.x<UUID> {
        @Override // q3.x
        public final UUID a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            return UUID.fromString(aVar.K());
        }

        @Override // q3.x
        public final void b(x3.c cVar, UUID uuid) {
            String uuid2;
            UUID uuid3 = uuid;
            if (uuid3 == null) {
                uuid2 = null;
            } else {
                uuid2 = uuid3.toString();
            }
            cVar.F(uuid2);
        }
    }

    /* loaded from: classes.dex */
    public static class q extends q3.x<Currency> {
        @Override // q3.x
        public final Currency a(x3.a aVar) {
            return Currency.getInstance(aVar.K());
        }

        @Override // q3.x
        public final void b(x3.c cVar, Currency currency) {
            cVar.F(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes.dex */
    public static class r implements q3.y {

        /* loaded from: classes.dex */
        public class a extends q3.x<Timestamp> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ q3.x f6214a;

            public a(q3.x xVar) {
                this.f6214a = xVar;
            }

            @Override // q3.x
            public final Timestamp a(x3.a aVar) {
                Date date = (Date) this.f6214a.a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // q3.x
            public final void b(x3.c cVar, Timestamp timestamp) {
                this.f6214a.b(cVar, timestamp);
            }
        }

        @Override // q3.y
        public final <T> q3.x<T> a(q3.j jVar, w3.a<T> aVar) {
            if (aVar.f6586a != Timestamp.class) {
                return null;
            }
            jVar.getClass();
            return new a(jVar.c(new w3.a<>(Date.class)));
        }
    }

    /* loaded from: classes.dex */
    public static class s extends q3.x<Calendar> {
        @Override // q3.x
        public final Calendar a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            aVar.f();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (aVar.M() != 4) {
                String G = aVar.G();
                int E = aVar.E();
                if ("year".equals(G)) {
                    i6 = E;
                } else if ("month".equals(G)) {
                    i7 = E;
                } else if ("dayOfMonth".equals(G)) {
                    i8 = E;
                } else if ("hourOfDay".equals(G)) {
                    i9 = E;
                } else if ("minute".equals(G)) {
                    i10 = E;
                } else if ("second".equals(G)) {
                    i11 = E;
                }
            }
            aVar.n();
            return new GregorianCalendar(i6, i7, i8, i9, i10, i11);
        }

        @Override // q3.x
        public final void b(x3.c cVar, Calendar calendar) {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                cVar.q();
                return;
            }
            cVar.h();
            cVar.o("year");
            cVar.w(calendar2.get(1));
            cVar.o("month");
            cVar.w(calendar2.get(2));
            cVar.o("dayOfMonth");
            cVar.w(calendar2.get(5));
            cVar.o("hourOfDay");
            cVar.w(calendar2.get(11));
            cVar.o("minute");
            cVar.w(calendar2.get(12));
            cVar.o("second");
            cVar.w(calendar2.get(13));
            cVar.n();
        }
    }

    /* loaded from: classes.dex */
    public static class t extends q3.x<Locale> {
        @Override // q3.x
        public final Locale a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.K(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            return nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // q3.x
        public final void b(x3.c cVar, Locale locale) {
            String locale2;
            Locale locale3 = locale;
            if (locale3 == null) {
                locale2 = null;
            } else {
                locale2 = locale3.toString();
            }
            cVar.F(locale2);
        }
    }

    /* loaded from: classes.dex */
    public static class u extends q3.x<q3.n> {
        public static q3.n c(x3.a aVar) {
            int a6 = m.g.a(aVar.M());
            if (a6 != 0) {
                if (a6 != 2) {
                    if (a6 != 5) {
                        if (a6 != 6) {
                            if (a6 != 7) {
                                if (a6 == 8) {
                                    aVar.I();
                                    return q3.p.f5845b;
                                }
                                throw new IllegalArgumentException();
                            }
                            return new q3.s(Boolean.valueOf(aVar.w()));
                        }
                        return new q3.s(new s3.l(aVar.K()));
                    }
                    return new q3.s(aVar.K());
                }
                q3.q qVar = new q3.q();
                aVar.f();
                while (aVar.q()) {
                    String G = aVar.G();
                    q3.n c6 = c(aVar);
                    if (c6 == null) {
                        c6 = q3.p.f5845b;
                    }
                    qVar.f5846b.put(G, c6);
                }
                aVar.n();
                return qVar;
            }
            q3.l lVar = new q3.l();
            aVar.c();
            while (aVar.q()) {
                Object c7 = c(aVar);
                if (c7 == null) {
                    c7 = q3.p.f5845b;
                }
                lVar.f5844b.add(c7);
            }
            aVar.k();
            return lVar;
        }

        public static void d(q3.n nVar, x3.c cVar) {
            boolean z5;
            if (nVar != null && !(nVar instanceof q3.p)) {
                boolean z6 = nVar instanceof q3.s;
                if (z6) {
                    if (z6) {
                        q3.s sVar = (q3.s) nVar;
                        Object obj = sVar.f5848b;
                        if (obj instanceof Number) {
                            cVar.E(sVar.d());
                            return;
                        } else if (obj instanceof Boolean) {
                            cVar.G(sVar.c());
                            return;
                        } else {
                            cVar.F(sVar.b());
                            return;
                        }
                    }
                    throw new IllegalStateException("Not a JSON Primitive: " + nVar);
                }
                boolean z7 = nVar instanceof q3.l;
                if (z7) {
                    cVar.f();
                    if (z7) {
                        Iterator<q3.n> it = ((q3.l) nVar).iterator();
                        while (it.hasNext()) {
                            d(it.next(), cVar);
                        }
                        cVar.k();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + nVar);
                }
                boolean z8 = nVar instanceof q3.q;
                if (z8) {
                    cVar.h();
                    if (z8) {
                        s3.m mVar = s3.m.this;
                        m.e eVar = mVar.f6029f.f6041e;
                        int i6 = mVar.f6028e;
                        while (true) {
                            m.e eVar2 = mVar.f6029f;
                            if (eVar != eVar2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                if (eVar != eVar2) {
                                    if (mVar.f6028e == i6) {
                                        m.e eVar3 = eVar.f6041e;
                                        cVar.o((String) eVar.f6043g);
                                        d((q3.n) eVar.f6044h, cVar);
                                        eVar = eVar3;
                                    } else {
                                        throw new ConcurrentModificationException();
                                    }
                                } else {
                                    throw new NoSuchElementException();
                                }
                            } else {
                                cVar.n();
                                return;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Not a JSON Object: " + nVar);
                    }
                } else {
                    throw new IllegalArgumentException("Couldn't write " + nVar.getClass());
                }
            } else {
                cVar.q();
            }
        }

        @Override // q3.x
        public final /* bridge */ /* synthetic */ q3.n a(x3.a aVar) {
            return c(aVar);
        }

        @Override // q3.x
        public final /* bridge */ /* synthetic */ void b(x3.c cVar, q3.n nVar) {
            d(nVar, cVar);
        }
    }

    /* loaded from: classes.dex */
    public static class v extends q3.x<BitSet> {
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
            if (r8.E() != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
            r1 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L23;
         */
        @Override // q3.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.BitSet a(x3.a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.c()
                int r1 = r8.M()
                r2 = 0
                r3 = r2
            Le:
                r4 = 2
                if (r1 == r4) goto L69
                int r4 = m.g.a(r1)
                r5 = 5
                r6 = 1
                if (r4 == r5) goto L3e
                r5 = 6
                if (r4 == r5) goto L34
                r5 = 7
                if (r4 != r5) goto L24
                boolean r1 = r8.w()
                goto L49
            L24:
                q3.u r8 = new q3.u
                java.lang.String r0 = x3.b.a(r1)
                java.lang.String r1 = "Invalid bitset value type: "
                java.lang.String r0 = r1.concat(r0)
                r8.<init>(r0)
                throw r8
            L34:
                int r1 = r8.E()
                if (r1 == 0) goto L3b
                goto L3c
            L3b:
                r6 = r2
            L3c:
                r1 = r6
                goto L49
            L3e:
                java.lang.String r1 = r8.K()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L55
                if (r1 == 0) goto L3b
                goto L3c
            L49:
                if (r1 == 0) goto L4e
                r0.set(r3)
            L4e:
                int r3 = r3 + 1
                int r1 = r8.M()
                goto Le
            L55:
                q3.u r8 = new q3.u
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L69:
                r8.k()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.o.v.a(x3.a):java.lang.Object");
        }

        @Override // q3.x
        public final void b(x3.c cVar, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            cVar.f();
            int length = bitSet2.length();
            for (int i6 = 0; i6 < length; i6++) {
                cVar.w(bitSet2.get(i6) ? 1L : 0L);
            }
            cVar.k();
        }
    }

    /* loaded from: classes.dex */
    public static class w implements q3.y {
        @Override // q3.y
        public final <T> q3.x<T> a(q3.j jVar, w3.a<T> aVar) {
            Class<? super T> cls = aVar.f6586a;
            if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new e0(cls);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class x extends q3.x<Boolean> {
        @Override // q3.x
        public final Boolean a(x3.a aVar) {
            int M = aVar.M();
            if (M != 9) {
                return Boolean.valueOf(M == 6 ? Boolean.parseBoolean(aVar.K()) : aVar.w());
            }
            aVar.I();
            return null;
        }

        @Override // q3.x
        public final void b(x3.c cVar, Boolean bool) {
            cVar.x(bool);
        }
    }

    /* loaded from: classes.dex */
    public static class y extends q3.x<Boolean> {
        @Override // q3.x
        public final Boolean a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            return Boolean.valueOf(aVar.K());
        }

        @Override // q3.x
        public final void b(x3.c cVar, Boolean bool) {
            String bool2;
            Boolean bool3 = bool;
            if (bool3 == null) {
                bool2 = "null";
            } else {
                bool2 = bool3.toString();
            }
            cVar.F(bool2);
        }
    }

    /* loaded from: classes.dex */
    public static class z extends q3.x<Number> {
        @Override // q3.x
        public final Number a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.E());
            } catch (NumberFormatException e6) {
                throw new q3.u(e6);
            }
        }

        @Override // q3.x
        public final void b(x3.c cVar, Number number) {
            cVar.E(number);
        }
    }

    static {
        x xVar = new x();
        f6190c = new y();
        f6191d = new t3.q(Boolean.TYPE, Boolean.class, xVar);
        f6192e = new t3.q(Byte.TYPE, Byte.class, new z());
        f6193f = new t3.q(Short.TYPE, Short.class, new a0());
        f6194g = new t3.q(Integer.TYPE, Integer.class, new b0());
        f6195h = new t3.p(AtomicInteger.class, new q3.w(new c0()));
        f6196i = new t3.p(AtomicBoolean.class, new q3.w(new d0()));
        f6197j = new t3.p(AtomicIntegerArray.class, new q3.w(new a()));
        f6198k = new b();
        new c();
        new d();
        f6199l = new t3.p(Number.class, new e());
        f6200m = new t3.q(Character.TYPE, Character.class, new f());
        g gVar = new g();
        f6201n = new h();
        f6202o = new i();
        f6203p = new t3.p(String.class, gVar);
        f6204q = new t3.p(StringBuilder.class, new j());
        f6205r = new t3.p(StringBuffer.class, new l());
        s = new t3.p(URL.class, new m());
        f6206t = new t3.p(URI.class, new n());
        u = new t3.s(InetAddress.class, new C0092o());
        f6207v = new t3.p(UUID.class, new p());
        f6208w = new t3.p(Currency.class, new q3.w(new q()));
        f6209x = new r();
        f6210y = new t3.r(new s());
        f6211z = new t3.p(Locale.class, new t());
        u uVar = new u();
        A = uVar;
        B = new t3.s(q3.n.class, uVar);
        C = new w();
    }
}
