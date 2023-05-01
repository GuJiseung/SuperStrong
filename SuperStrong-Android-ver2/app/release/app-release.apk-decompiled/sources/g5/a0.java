package g5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Method f4177a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.q f4178b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4179c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String f4180d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final v4.p f4181e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final v4.s f4182f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4183g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4184h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4185i;

    /* renamed from: j  reason: collision with root package name */
    public final x<?>[] f4186j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4187k;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final Pattern f4188x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f4189y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final d0 f4190a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f4191b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f4192c;

        /* renamed from: d  reason: collision with root package name */
        public final Annotation[][] f4193d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f4194e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4195f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4196g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4197h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f4198i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f4199j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4200k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4201l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4202m;
        @Nullable

        /* renamed from: n  reason: collision with root package name */
        public String f4203n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f4204o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f4205p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f4206q;
        @Nullable

        /* renamed from: r  reason: collision with root package name */
        public String f4207r;
        @Nullable
        public v4.p s;
        @Nullable

        /* renamed from: t  reason: collision with root package name */
        public v4.s f4208t;
        @Nullable
        public LinkedHashSet u;
        @Nullable

        /* renamed from: v  reason: collision with root package name */
        public x<?>[] f4209v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f4210w;

        public a(d0 d0Var, Method method) {
            this.f4190a = d0Var;
            this.f4191b = method;
            this.f4192c = method.getAnnotations();
            this.f4194e = method.getGenericParameterTypes();
            this.f4193d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z5) {
            String str3 = this.f4203n;
            Method method = this.f4191b;
            if (str3 == null) {
                this.f4203n = str;
                this.f4204o = z5;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                Pattern pattern = f4188x;
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (pattern.matcher(substring).find()) {
                        throw h0.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.f4207r = str2;
                Matcher matcher = pattern.matcher(str2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (matcher.find()) {
                    linkedHashSet.add(matcher.group(1));
                }
                this.u = linkedHashSet;
                return;
            }
            throw h0.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i6, Type type) {
            if (h0.g(type)) {
                throw h0.j(this.f4191b, i6, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public a0(a aVar) {
        this.f4177a = aVar.f4191b;
        this.f4178b = aVar.f4190a.f4220c;
        this.f4179c = aVar.f4203n;
        this.f4180d = aVar.f4207r;
        this.f4181e = aVar.s;
        this.f4182f = aVar.f4208t;
        this.f4183g = aVar.f4204o;
        this.f4184h = aVar.f4205p;
        this.f4185i = aVar.f4206q;
        this.f4186j = aVar.f4209v;
        this.f4187k = aVar.f4210w;
    }
}
