package t3;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import q3.u;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class g implements y {

    /* renamed from: b  reason: collision with root package name */
    public final s3.c f6151b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6152c = false;

    /* loaded from: classes.dex */
    public final class a<K, V> extends x<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final n f6153a;

        /* renamed from: b  reason: collision with root package name */
        public final n f6154b;

        /* renamed from: c  reason: collision with root package name */
        public final s3.n<? extends Map<K, V>> f6155c;

        public a(q3.j jVar, Type type, x<K> xVar, Type type2, x<V> xVar2, s3.n<? extends Map<K, V>> nVar) {
            this.f6153a = new n(jVar, xVar, type);
            this.f6154b = new n(jVar, xVar2, type2);
            this.f6155c = nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q3.x
        public final Object a(x3.a aVar) {
            int M = aVar.M();
            if (M == 9) {
                aVar.I();
                return null;
            }
            Map map = (Map) ((Map<K, V>) this.f6155c.e());
            n nVar = this.f6154b;
            n nVar2 = this.f6153a;
            if (M == 1) {
                aVar.c();
                while (aVar.q()) {
                    aVar.c();
                    Object a6 = nVar2.a(aVar);
                    if (map.put(a6, nVar.a(aVar)) != null) {
                        throw new u("duplicate key: " + a6);
                    }
                    aVar.k();
                }
                aVar.k();
            } else {
                aVar.f();
                while (aVar.q()) {
                    androidx.activity.result.c.f285b.A(aVar);
                    Object a7 = nVar2.a(aVar);
                    if (map.put(a7, nVar.a(aVar)) != null) {
                        throw new u("duplicate key: " + a7);
                    }
                }
                aVar.n();
            }
            return map;
        }

        @Override // q3.x
        public final void b(x3.c cVar, Object obj) {
            String str;
            boolean z5;
            Map map = (Map) obj;
            if (map == null) {
                cVar.q();
                return;
            }
            boolean z6 = g.this.f6152c;
            n nVar = this.f6154b;
            if (!z6) {
                cVar.h();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.o(String.valueOf(entry.getKey()));
                    nVar.b(cVar, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i6 = 0;
                boolean z7 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    K key = entry2.getKey();
                    n nVar2 = this.f6153a;
                    nVar2.getClass();
                    try {
                        f fVar = new f();
                        nVar2.b(fVar, key);
                        ArrayList arrayList3 = fVar.f6148m;
                        if (arrayList3.isEmpty()) {
                            q3.n nVar3 = fVar.f6150o;
                            arrayList.add(nVar3);
                            arrayList2.add(entry2.getValue());
                            nVar3.getClass();
                            if (!(nVar3 instanceof q3.l) && !(nVar3 instanceof q3.q)) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            z7 |= z5;
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                        }
                    } catch (IOException e6) {
                        throw new q3.o(e6);
                    }
                }
                if (z7) {
                    cVar.f();
                    int size = arrayList.size();
                    while (i6 < size) {
                        cVar.f();
                        o.A.b(cVar, (q3.n) arrayList.get(i6));
                        nVar.b(cVar, arrayList2.get(i6));
                        cVar.k();
                        i6++;
                    }
                    cVar.k();
                    return;
                }
                cVar.h();
                int size2 = arrayList.size();
                while (i6 < size2) {
                    q3.n nVar4 = (q3.n) arrayList.get(i6);
                    nVar4.getClass();
                    boolean z8 = nVar4 instanceof q3.s;
                    if (z8) {
                        if (z8) {
                            q3.s sVar = (q3.s) nVar4;
                            Object obj2 = sVar.f5848b;
                            if (obj2 instanceof Number) {
                                str = String.valueOf(sVar.d());
                            } else if (obj2 instanceof Boolean) {
                                str = Boolean.toString(sVar.c());
                            } else if (obj2 instanceof String) {
                                str = sVar.b();
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            throw new IllegalStateException("Not a JSON Primitive: " + nVar4);
                        }
                    } else if (nVar4 instanceof q3.p) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    cVar.o(str);
                    nVar.b(cVar, arrayList2.get(i6));
                    i6++;
                }
            }
            cVar.n();
        }
    }

    public g(s3.c cVar) {
        this.f6151b = cVar;
    }

    @Override // q3.y
    public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
        Type[] actualTypeArguments;
        x<T> xVar;
        Type type = aVar.f6587b;
        if (!Map.class.isAssignableFrom(aVar.f6586a)) {
            return null;
        }
        Class<?> e6 = s3.a.e(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type f6 = s3.a.f(type, e6, Map.class);
            actualTypeArguments = f6 instanceof ParameterizedType ? ((ParameterizedType) f6).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            xVar = jVar.c(new w3.a<>(type2));
        } else {
            xVar = o.f6190c;
        }
        return new a(jVar, actualTypeArguments[0], xVar, actualTypeArguments[1], jVar.c(new w3.a<>(actualTypeArguments[1])), this.f6151b.a(aVar));
    }
}
