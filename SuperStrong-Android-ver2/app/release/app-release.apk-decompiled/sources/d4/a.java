package d4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class a<T> implements Collection<T> {

    /* renamed from: b  reason: collision with root package name */
    public final T[] f3798b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3799c = false;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object[] objArr) {
        this.f3798b = objArr;
    }

    @Override // java.util.Collection
    public final boolean add(T t5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i6;
        T[] tArr = this.f3798b;
        l4.f.f(tArr, "<this>");
        if (obj == null) {
            int length = tArr.length;
            i6 = 0;
            while (i6 < length) {
                if (tArr[i6] == null) {
                    break;
                }
                i6++;
            }
            i6 = -1;
        } else {
            int length2 = tArr.length;
            for (int i7 = 0; i7 < length2; i7++) {
                if (l4.f.a(obj, tArr[i7])) {
                    i6 = i7;
                    break;
                }
            }
            i6 = -1;
        }
        if (i6 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        l4.f.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3798b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        T[] tArr = this.f3798b;
        l4.f.f(tArr, "array");
        return new l4.a(tArr);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3798b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.f3798b;
        l4.f.f(tArr, "<this>");
        if (this.f3799c && l4.f.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        l4.f.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        l4.f.f(tArr, "array");
        return (T[]) c.b.g(this, tArr);
    }
}
