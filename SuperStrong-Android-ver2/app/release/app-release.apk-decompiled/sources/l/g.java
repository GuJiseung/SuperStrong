package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public g<K, V>.b f5046a;

    /* renamed from: b  reason: collision with root package name */
    public g<K, V>.c f5047b;

    /* renamed from: c  reason: collision with root package name */
    public g<K, V>.e f5048c;

    /* loaded from: classes.dex */
    public final class a<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        public final int f5049b;

        /* renamed from: c  reason: collision with root package name */
        public int f5050c;

        /* renamed from: d  reason: collision with root package name */
        public int f5051d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5052e = false;

        public a(int i6) {
            this.f5049b = i6;
            this.f5050c = g.this.d();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f5051d < this.f5050c;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t5 = (T) g.this.b(this.f5051d, this.f5049b);
                this.f5051d++;
                this.f5052e = true;
                return t5;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f5052e) {
                throw new IllegalStateException();
            }
            int i6 = this.f5051d - 1;
            this.f5051d = i6;
            this.f5050c--;
            this.f5052e = false;
            g.this.h(i6);
        }
    }

    /* loaded from: classes.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            g gVar = g.this;
            int d6 = gVar.d();
            for (Map.Entry<K, V> entry : collection) {
                gVar.g(entry.getKey(), entry.getValue());
            }
            return d6 != gVar.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            g gVar = g.this;
            int e6 = gVar.e(key);
            if (e6 < 0) {
                return false;
            }
            Object b6 = gVar.b(e6, 1);
            Object value = entry.getValue();
            if (b6 != value && (b6 == null || !b6.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            g gVar = g.this;
            int i6 = 0;
            for (int d6 = gVar.d() - 1; d6 >= 0; d6--) {
                Object b6 = gVar.b(d6, 0);
                Object b7 = gVar.b(d6, 1);
                i6 += (b6 == null ? 0 : b6.hashCode()) ^ (b7 == null ? 0 : b7.hashCode());
            }
            return i6;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k5) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> c6 = g.this.c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!c6.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            g gVar = g.this;
            int i6 = 0;
            for (int d6 = gVar.d() - 1; d6 >= 0; d6--) {
                Object b6 = gVar.b(d6, 0);
                i6 += b6 == null ? 0 : b6.hashCode();
            }
            return i6;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            g gVar = g.this;
            int e6 = gVar.e(obj);
            if (e6 >= 0) {
                gVar.h(e6);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> c6 = g.this.c();
            int size = c6.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                c6.remove(it.next());
            }
            if (size != c6.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return g.k(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            g gVar = g.this;
            int d6 = gVar.d();
            Object[] objArr = new Object[d6];
            for (int i6 = 0; i6 < d6; i6++) {
                objArr[i6] = gVar.b(i6, 0);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.l(0, tArr);
        }
    }

    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public int f5056b;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5058d = false;

        /* renamed from: c  reason: collision with root package name */
        public int f5057c = -1;

        public d() {
            this.f5056b = g.this.d() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean z5;
            boolean z6;
            if (this.f5058d) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i6 = this.f5057c;
                g gVar = g.this;
                Object b6 = gVar.b(i6, 0);
                if (key != b6 && (key == null || !key.equals(b6))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    return false;
                }
                Object value = entry.getValue();
                Object b7 = gVar.b(this.f5057c, 1);
                if (value != b7 && (value == null || !value.equals(b7))) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (!z6) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f5058d) {
                return (K) g.this.b(this.f5057c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f5058d) {
                return (V) g.this.b(this.f5057c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f5057c < this.f5056b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (this.f5058d) {
                int i6 = this.f5057c;
                g gVar = g.this;
                Object b6 = gVar.b(i6, 0);
                Object b7 = gVar.b(this.f5057c, 1);
                return (b6 == null ? 0 : b6.hashCode()) ^ (b7 != null ? b7.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.f5057c++;
                this.f5058d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f5058d) {
                throw new IllegalStateException();
            }
            g.this.h(this.f5057c);
            this.f5057c--;
            this.f5056b--;
            this.f5058d = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v2) {
            if (this.f5058d) {
                return (V) g.this.i(this.f5057c, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            g gVar = g.this;
            int f6 = gVar.f(obj);
            if (f6 >= 0) {
                gVar.h(f6);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            g gVar = g.this;
            int d6 = gVar.d();
            int i6 = 0;
            boolean z5 = false;
            while (i6 < d6) {
                if (collection.contains(gVar.b(i6, 1))) {
                    gVar.h(i6);
                    i6--;
                    d6--;
                    z5 = true;
                }
                i6++;
            }
            return z5;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            g gVar = g.this;
            int d6 = gVar.d();
            int i6 = 0;
            boolean z5 = false;
            while (i6 < d6) {
                if (!collection.contains(gVar.b(i6, 1))) {
                    gVar.h(i6);
                    i6--;
                    d6--;
                    z5 = true;
                }
                i6++;
            }
            return z5;
        }

        @Override // java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            g gVar = g.this;
            int d6 = gVar.d();
            Object[] objArr = new Object[d6];
            for (int i6 = 0; i6 < d6; i6++) {
                objArr[i6] = gVar.b(i6, 1);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.l(1, tArr);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i6, int i7);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k5, V v2);

    public abstract void h(int i6);

    public abstract V i(int i6, V v2);

    public final Object[] l(int i6, Object[] objArr) {
        int d6 = d();
        if (objArr.length < d6) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d6);
        }
        for (int i7 = 0; i7 < d6; i7++) {
            objArr[i7] = b(i7, i6);
        }
        if (objArr.length > d6) {
            objArr[d6] = null;
        }
        return objArr;
    }
}
