package l4;

import a1.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k4.o;
import k4.p;
import k4.q;
import k4.r;
import k4.s;
import k4.t;
import k4.u;
import k4.v;
import k4.w;
/* loaded from: classes.dex */
public final class d implements p4.b<Object>, c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<Object>, Integer> f5136b;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f5137a;

    static {
        int i6 = 0;
        List asList = Arrays.asList(k4.a.class, k4.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, k4.b.class, k4.c.class, k4.d.class, k4.e.class, k4.f.class, k4.g.class, k4.h.class, k4.i.class, k4.j.class, k4.k.class, k4.m.class, k4.n.class, o.class);
        f.e(asList, "asList(this)");
        ArrayList arrayList = new ArrayList(asList.size());
        for (Object obj : asList) {
            int i7 = i6 + 1;
            if (i6 >= 0) {
                arrayList.add(new c4.c((Class) obj, Integer.valueOf(i6)));
                i6 = i7;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f5136b = d4.h.n(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        f.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            f.e(str, "kotlinName");
            sb.append(r4.g.n(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<Object>, Integer> entry : f5136b.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(f0.h(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), r4.g.n((String) entry2.getValue()));
        }
    }

    public d(Class<?> cls) {
        f.f(cls, "jClass");
        this.f5137a = cls;
    }

    @Override // l4.c
    public final Class<?> a() {
        return this.f5137a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && f.a(c0.n.d(this), c0.n.d((p4.b) obj));
    }

    public final int hashCode() {
        return c0.n.d(this).hashCode();
    }

    public final String toString() {
        return this.f5137a.toString() + " (Kotlin reflection is not available)";
    }
}
