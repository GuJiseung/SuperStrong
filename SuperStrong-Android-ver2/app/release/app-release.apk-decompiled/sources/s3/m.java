package s3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public final class m<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final a f6024i = new a();

    /* renamed from: b  reason: collision with root package name */
    public final Comparator<? super K> f6025b;

    /* renamed from: c  reason: collision with root package name */
    public e<K, V> f6026c;

    /* renamed from: d  reason: collision with root package name */
    public int f6027d;

    /* renamed from: e  reason: collision with root package name */
    public int f6028e;

    /* renamed from: f  reason: collision with root package name */
    public final e<K, V> f6029f;

    /* renamed from: g  reason: collision with root package name */
    public m<K, V>.b f6030g;

    /* renamed from: h  reason: collision with root package name */
    public m<K, V>.c f6031h;

    /* loaded from: classes.dex */
    public static class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes.dex */
        public class a extends m<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && m.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            m mVar;
            e<K, V> b6;
            if ((obj instanceof Map.Entry) && (b6 = (mVar = m.this).b((Map.Entry) obj)) != null) {
                mVar.d(b6, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return m.this.f6027d;
        }
    }

    /* loaded from: classes.dex */
    public final class c extends AbstractSet<K> {

        /* loaded from: classes.dex */
        public class a extends m<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return a().f6043g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return m.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                s3.m r0 = s3.m.this
                r0.getClass()
                r1 = 0
                if (r4 == 0) goto Ld
                s3.m$e r4 = r0.a(r4, r1)     // Catch: java.lang.ClassCastException -> Ld
                goto Le
            Ld:
                r4 = 0
            Le:
                r2 = 1
                if (r4 == 0) goto L14
                r0.d(r4, r2)
            L14:
                if (r4 == 0) goto L17
                r1 = r2
            L17:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.m.c.remove(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return m.this.f6027d;
        }
    }

    /* loaded from: classes.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f6034b;

        /* renamed from: c  reason: collision with root package name */
        public e<K, V> f6035c = null;

        /* renamed from: d  reason: collision with root package name */
        public int f6036d;

        public d() {
            this.f6034b = m.this.f6029f.f6041e;
            this.f6036d = m.this.f6028e;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f6034b;
            m mVar = m.this;
            if (eVar != mVar.f6029f) {
                if (mVar.f6028e == this.f6036d) {
                    this.f6034b = eVar.f6041e;
                    this.f6035c = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6034b != m.this.f6029f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f6035c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            m mVar = m.this;
            mVar.d(eVar, true);
            this.f6035c = null;
            this.f6036d = mVar.f6028e;
        }
    }

    /* loaded from: classes.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f6038b;

        /* renamed from: c  reason: collision with root package name */
        public e<K, V> f6039c;

        /* renamed from: d  reason: collision with root package name */
        public e<K, V> f6040d;

        /* renamed from: e  reason: collision with root package name */
        public e<K, V> f6041e;

        /* renamed from: f  reason: collision with root package name */
        public e<K, V> f6042f;

        /* renamed from: g  reason: collision with root package name */
        public final K f6043g;

        /* renamed from: h  reason: collision with root package name */
        public V f6044h;

        /* renamed from: i  reason: collision with root package name */
        public int f6045i;

        public e() {
            this.f6043g = null;
            this.f6042f = this;
            this.f6041e = this;
        }

        public e(e<K, V> eVar, K k5, e<K, V> eVar2, e<K, V> eVar3) {
            this.f6038b = eVar;
            this.f6043g = k5;
            this.f6045i = 1;
            this.f6041e = eVar2;
            this.f6042f = eVar3;
            eVar3.f6041e = this;
            eVar2.f6042f = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k5 = this.f6043g;
                if (k5 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k5.equals(entry.getKey())) {
                    return false;
                }
                V v2 = this.f6044h;
                Object value = entry.getValue();
                if (v2 == null) {
                    if (value != null) {
                        return false;
                    }
                } else if (!v2.equals(value)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f6043g;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f6044h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k5 = this.f6043g;
            int hashCode = k5 == null ? 0 : k5.hashCode();
            V v2 = this.f6044h;
            return (v2 != null ? v2.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v2) {
            V v5 = this.f6044h;
            this.f6044h = v2;
            return v5;
        }

        public final String toString() {
            return this.f6043g + "=" + this.f6044h;
        }
    }

    public m() {
        a aVar = f6024i;
        this.f6027d = 0;
        this.f6028e = 0;
        this.f6029f = new e<>();
        this.f6025b = aVar;
    }

    public final e<K, V> a(K k5, boolean z5) {
        int i6;
        e<K, V> eVar;
        e<K, V> eVar2 = this.f6026c;
        a aVar = f6024i;
        Comparator<? super K> comparator = this.f6025b;
        if (eVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) k5 : null;
            while (true) {
                Object obj = (K) eVar2.f6043g;
                i6 = comparable != null ? comparable.compareTo(obj) : comparator.compare(k5, obj);
                if (i6 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i6 < 0 ? eVar2.f6039c : eVar2.f6040d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i6 = 0;
        }
        if (z5) {
            e<K, V> eVar4 = this.f6029f;
            if (eVar2 != null) {
                eVar = new e<>(eVar2, k5, eVar4, eVar4.f6042f);
                if (i6 < 0) {
                    eVar2.f6039c = eVar;
                } else {
                    eVar2.f6040d = eVar;
                }
                c(eVar2, true);
            } else if (comparator == aVar && !(k5 instanceof Comparable)) {
                throw new ClassCastException(k5.getClass().getName().concat(" is not Comparable"));
            } else {
                eVar = new e<>(eVar2, k5, eVar4, eVar4.f6042f);
                this.f6026c = eVar;
            }
            this.f6027d++;
            this.f6028e++;
            return eVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s3.m.e<K, V> b(java.util.Map.Entry<?, ?> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            s3.m$e r0 = r5.a(r0, r1)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L28
            V r3 = r0.f6044h
            java.lang.Object r6 = r6.getValue()
            r4 = 1
            if (r3 == r6) goto L24
            if (r3 == 0) goto L22
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L22
            goto L24
        L22:
            r6 = r1
            goto L25
        L24:
            r6 = r4
        L25:
            if (r6 == 0) goto L28
            r1 = r4
        L28:
            if (r1 == 0) goto L2b
            r2 = r0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.m.b(java.util.Map$Entry):s3.m$e");
    }

    public final void c(e<K, V> eVar, boolean z5) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f6039c;
            e<K, V> eVar3 = eVar.f6040d;
            int i6 = eVar2 != null ? eVar2.f6045i : 0;
            int i7 = eVar3 != null ? eVar3.f6045i : 0;
            int i8 = i6 - i7;
            if (i8 == -2) {
                e<K, V> eVar4 = eVar3.f6039c;
                e<K, V> eVar5 = eVar3.f6040d;
                int i9 = (eVar4 != null ? eVar4.f6045i : 0) - (eVar5 != null ? eVar5.f6045i : 0);
                if (i9 != -1 && (i9 != 0 || z5)) {
                    g(eVar3);
                }
                f(eVar);
                if (z5) {
                    return;
                }
            } else if (i8 == 2) {
                e<K, V> eVar6 = eVar2.f6039c;
                e<K, V> eVar7 = eVar2.f6040d;
                int i10 = (eVar6 != null ? eVar6.f6045i : 0) - (eVar7 != null ? eVar7.f6045i : 0);
                if (i10 != 1 && (i10 != 0 || z5)) {
                    f(eVar2);
                }
                g(eVar);
                if (z5) {
                    return;
                }
            } else if (i8 == 0) {
                eVar.f6045i = i6 + 1;
                if (z5) {
                    return;
                }
            } else {
                eVar.f6045i = Math.max(i6, i7) + 1;
                if (!z5) {
                    return;
                }
            }
            eVar = eVar.f6038b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f6026c = null;
        this.f6027d = 0;
        this.f6028e++;
        e<K, V> eVar = this.f6029f;
        eVar.f6042f = eVar;
        eVar.f6041e = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[ORIG_RETURN, RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            s3.m$e r2 = r1.a(r2, r0)     // Catch: java.lang.ClassCastException -> L8
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto Lc
            r0 = 1
        Lc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.m.containsKey(java.lang.Object):boolean");
    }

    public final void d(e<K, V> eVar, boolean z5) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i6;
        if (z5) {
            e<K, V> eVar4 = eVar.f6042f;
            eVar4.f6041e = eVar.f6041e;
            eVar.f6041e.f6042f = eVar4;
        }
        e<K, V> eVar5 = eVar.f6039c;
        e<K, V> eVar6 = eVar.f6040d;
        e<K, V> eVar7 = eVar.f6038b;
        int i7 = 0;
        if (eVar5 != null && eVar6 != null) {
            if (eVar5.f6045i > eVar6.f6045i) {
                do {
                    eVar3 = eVar5;
                    eVar5 = eVar5.f6040d;
                } while (eVar5 != null);
            } else {
                do {
                    eVar2 = eVar6;
                    eVar6 = eVar6.f6039c;
                } while (eVar6 != null);
                eVar3 = eVar2;
            }
            d(eVar3, false);
            e<K, V> eVar8 = eVar.f6039c;
            if (eVar8 != null) {
                i6 = eVar8.f6045i;
                eVar3.f6039c = eVar8;
                eVar8.f6038b = eVar3;
                eVar.f6039c = null;
            } else {
                i6 = 0;
            }
            e<K, V> eVar9 = eVar.f6040d;
            if (eVar9 != null) {
                i7 = eVar9.f6045i;
                eVar3.f6040d = eVar9;
                eVar9.f6038b = eVar3;
                eVar.f6040d = null;
            }
            eVar3.f6045i = Math.max(i6, i7) + 1;
            e(eVar, eVar3);
            return;
        }
        if (eVar5 != null) {
            e(eVar, eVar5);
            eVar.f6039c = null;
        } else if (eVar6 != null) {
            e(eVar, eVar6);
            eVar.f6040d = null;
        } else {
            e(eVar, null);
        }
        c(eVar7, false);
        this.f6027d--;
        this.f6028e++;
    }

    public final void e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f6038b;
        eVar.f6038b = null;
        if (eVar2 != null) {
            eVar2.f6038b = eVar3;
        }
        if (eVar3 == null) {
            this.f6026c = eVar2;
        } else if (eVar3.f6039c == eVar) {
            eVar3.f6039c = eVar2;
        } else {
            eVar3.f6040d = eVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        m<K, V>.b bVar = this.f6030g;
        if (bVar != null) {
            return bVar;
        }
        m<K, V>.b bVar2 = new b();
        this.f6030g = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f6039c;
        e<K, V> eVar3 = eVar.f6040d;
        e<K, V> eVar4 = eVar3.f6039c;
        e<K, V> eVar5 = eVar3.f6040d;
        eVar.f6040d = eVar4;
        if (eVar4 != null) {
            eVar4.f6038b = eVar;
        }
        e(eVar, eVar3);
        eVar3.f6039c = eVar;
        eVar.f6038b = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f6045i : 0, eVar4 != null ? eVar4.f6045i : 0) + 1;
        eVar.f6045i = max;
        eVar3.f6045i = Math.max(max, eVar5 != null ? eVar5.f6045i : 0) + 1;
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f6039c;
        e<K, V> eVar3 = eVar.f6040d;
        e<K, V> eVar4 = eVar2.f6039c;
        e<K, V> eVar5 = eVar2.f6040d;
        eVar.f6039c = eVar5;
        if (eVar5 != null) {
            eVar5.f6038b = eVar;
        }
        e(eVar, eVar2);
        eVar2.f6040d = eVar;
        eVar.f6038b = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f6045i : 0, eVar5 != null ? eVar5.f6045i : 0) + 1;
        eVar.f6045i = max;
        eVar2.f6045i = Math.max(max, eVar4 != null ? eVar4.f6045i : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            s3.m$e r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            V r0 = r3.f6044h
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.m.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        m<K, V>.c cVar = this.f6031h;
        if (cVar != null) {
            return cVar;
        }
        m<K, V>.c cVar2 = new c();
        this.f6031h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k5, V v2) {
        if (k5 != null) {
            e<K, V> a6 = a(k5, true);
            V v5 = a6.f6044h;
            a6.f6044h = v2;
            return v5;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            s3.m$e r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.d(r3, r1)
        L10:
            if (r3 == 0) goto L14
            V r0 = r3.f6044h
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.m.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6027d;
    }
}
