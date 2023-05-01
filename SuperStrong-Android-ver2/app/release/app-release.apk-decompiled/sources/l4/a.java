package l4;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class a<T> implements Iterator<T> {

    /* renamed from: b  reason: collision with root package name */
    public final T[] f5127b;

    /* renamed from: c  reason: collision with root package name */
    public int f5128c;

    public a(T[] tArr) {
        this.f5127b = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5128c < this.f5127b.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f5127b;
            int i6 = this.f5128c;
            this.f5128c = i6 + 1;
            return tArr[i6];
        } catch (ArrayIndexOutOfBoundsException e6) {
            this.f5128c--;
            throw new NoSuchElementException(e6.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
