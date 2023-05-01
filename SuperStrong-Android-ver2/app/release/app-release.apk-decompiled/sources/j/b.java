package j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f4628b;

    /* renamed from: c  reason: collision with root package name */
    public c<K, V> f4629c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f4630d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public int f4631e = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // j.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f4635e;
        }

        @Override // j.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f4634d;
        }
    }

    /* renamed from: j.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0049b<K, V> extends e<K, V> {
        public C0049b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // j.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f4634d;
        }

        @Override // j.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f4635e;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public final K f4632b;

        /* renamed from: c  reason: collision with root package name */
        public final V f4633c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f4634d;

        /* renamed from: e  reason: collision with root package name */
        public c<K, V> f4635e;

        public c(K k5, V v2) {
            this.f4632b = k5;
            this.f4633c = v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f4632b.equals(cVar.f4632b) && this.f4633c.equals(cVar.f4633c);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f4632b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f4633c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f4632b.hashCode() ^ this.f4633c.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f4632b + "=" + this.f4633c;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f4636b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4637c = true;

        public d() {
        }

        @Override // j.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f4636b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f4635e;
                this.f4636b = cVar3;
                this.f4637c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f4637c) {
                return b.this.f4628b != null;
            }
            c<K, V> cVar = this.f4636b;
            return (cVar == null || cVar.f4634d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.f4637c) {
                this.f4637c = false;
                cVar = b.this.f4628b;
            } else {
                c<K, V> cVar2 = this.f4636b;
                cVar = cVar2 != null ? cVar2.f4634d : null;
            }
            this.f4636b = cVar;
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f4639b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f4640c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f4639b = cVar2;
            this.f4640c = cVar;
        }

        @Override // j.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f4639b == cVar && cVar == this.f4640c) {
                this.f4640c = null;
                this.f4639b = null;
            }
            c<K, V> cVar3 = this.f4639b;
            if (cVar3 == cVar) {
                this.f4639b = b(cVar3);
            }
            c<K, V> cVar4 = this.f4640c;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f4639b;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f4640c = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f4640c != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f4640c;
            c<K, V> cVar3 = this.f4639b;
            if (cVar2 != cVar3 && cVar3 != null) {
                cVar = c(cVar2);
            } else {
                cVar = null;
            }
            this.f4640c = cVar;
            return cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k5) {
        c<K, V> cVar = this.f4628b;
        while (cVar != null && !cVar.f4632b.equals(k5)) {
            cVar = cVar.f4634d;
        }
        return cVar;
    }

    public V b(K k5) {
        c<K, V> a6 = a(k5);
        if (a6 == null) {
            return null;
        }
        this.f4631e--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f4630d;
        if (!weakHashMap.isEmpty()) {
            for (f<K, V> fVar : weakHashMap.keySet()) {
                fVar.a(a6);
            }
        }
        c<K, V> cVar = a6.f4635e;
        c<K, V> cVar2 = a6.f4634d;
        if (cVar != null) {
            cVar.f4634d = cVar2;
        } else {
            this.f4628b = cVar2;
        }
        c<K, V> cVar3 = a6.f4634d;
        if (cVar3 != null) {
            cVar3.f4635e = cVar;
        } else {
            this.f4629c = cVar;
        }
        a6.f4634d = null;
        a6.f4635e = null;
        return a6.f4633c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((j.b.e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof j.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j.b r7 = (j.b) r7
            int r1 = r6.f4631e
            int r3 = r7.f4631e
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            j.b$e r3 = (j.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            j.b$e r4 = (j.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            j.b$e r7 = (j.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i6 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i6;
            }
            i6 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f4628b, this.f4629c);
        this.f4630d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
