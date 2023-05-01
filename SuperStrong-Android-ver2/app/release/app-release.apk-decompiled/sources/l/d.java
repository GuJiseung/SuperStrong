package l;

import a1.f0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import l.g;
/* loaded from: classes.dex */
public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f5026f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final Object[] f5027g = new Object[0];

    /* renamed from: h  reason: collision with root package name */
    public static Object[] f5028h;

    /* renamed from: i  reason: collision with root package name */
    public static int f5029i;

    /* renamed from: j  reason: collision with root package name */
    public static Object[] f5030j;

    /* renamed from: k  reason: collision with root package name */
    public static int f5031k;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5032b = f5026f;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f5033c = f5027g;

    /* renamed from: d  reason: collision with root package name */
    public int f5034d = 0;

    /* renamed from: e  reason: collision with root package name */
    public c f5035e;

    public static void b(int[] iArr, Object[] objArr, int i6) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (f5031k < 10) {
                    objArr[0] = f5030j;
                    objArr[1] = iArr;
                    for (int i7 = i6 - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    f5030j = objArr;
                    f5031k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (d.class) {
                if (f5029i < 10) {
                    objArr[0] = f5028h;
                    objArr[1] = iArr;
                    for (int i8 = i6 - 1; i8 >= 2; i8--) {
                        objArr[i8] = null;
                    }
                    f5028h = objArr;
                    f5029i++;
                }
            }
        }
    }

    public final void a(int i6) {
        if (i6 == 8) {
            synchronized (d.class) {
                Object[] objArr = f5030j;
                if (objArr != null) {
                    this.f5033c = objArr;
                    f5030j = (Object[]) objArr[0];
                    this.f5032b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5031k--;
                    return;
                }
            }
        } else if (i6 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = f5028h;
                if (objArr2 != null) {
                    this.f5033c = objArr2;
                    f5028h = (Object[]) objArr2[0];
                    this.f5032b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5029i--;
                    return;
                }
            }
        }
        this.f5032b = new int[i6];
        this.f5033c = new Object[i6];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e6) {
        int i6;
        int c6;
        if (e6 == null) {
            c6 = d();
            i6 = 0;
        } else {
            int hashCode = e6.hashCode();
            i6 = hashCode;
            c6 = c(hashCode, e6);
        }
        if (c6 >= 0) {
            return false;
        }
        int i7 = ~c6;
        int i8 = this.f5034d;
        int[] iArr = this.f5032b;
        if (i8 >= iArr.length) {
            int i9 = 8;
            if (i8 >= 8) {
                i9 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i9 = 4;
            }
            Object[] objArr = this.f5033c;
            a(i9);
            int[] iArr2 = this.f5032b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f5033c, 0, objArr.length);
            }
            b(iArr, objArr, this.f5034d);
        }
        int i10 = this.f5034d;
        if (i7 < i10) {
            int[] iArr3 = this.f5032b;
            int i11 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i11, i10 - i7);
            Object[] objArr2 = this.f5033c;
            System.arraycopy(objArr2, i7, objArr2, i11, this.f5034d - i7);
        }
        this.f5032b[i7] = i6;
        this.f5033c[i7] = e6;
        this.f5034d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f5034d;
        int[] iArr = this.f5032b;
        boolean z5 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f5033c;
            a(size);
            int i6 = this.f5034d;
            if (i6 > 0) {
                System.arraycopy(iArr, 0, this.f5032b, 0, i6);
                System.arraycopy(objArr, 0, this.f5033c, 0, this.f5034d);
            }
            b(iArr, objArr, this.f5034d);
        }
        for (E e6 : collection) {
            z5 |= add(e6);
        }
        return z5;
    }

    public final int c(int i6, Object obj) {
        int i7 = this.f5034d;
        if (i7 == 0) {
            return -1;
        }
        int c6 = f0.c(i7, i6, this.f5032b);
        if (c6 >= 0 && !obj.equals(this.f5033c[c6])) {
            int i8 = c6 + 1;
            while (i8 < i7 && this.f5032b[i8] == i6) {
                if (obj.equals(this.f5033c[i8])) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = c6 - 1; i9 >= 0 && this.f5032b[i9] == i6; i9--) {
                if (obj.equals(this.f5033c[i9])) {
                    return i9;
                }
            }
            return ~i8;
        }
        return c6;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i6 = this.f5034d;
        if (i6 != 0) {
            b(this.f5032b, this.f5033c, i6);
            this.f5032b = f5026f;
            this.f5033c = f5027g;
            this.f5034d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i6 = this.f5034d;
        if (i6 == 0) {
            return -1;
        }
        int c6 = f0.c(i6, 0, this.f5032b);
        if (c6 >= 0 && this.f5033c[c6] != null) {
            int i7 = c6 + 1;
            while (i7 < i6 && this.f5032b[i7] == 0) {
                if (this.f5033c[i7] == null) {
                    return i7;
                }
                i7++;
            }
            for (int i8 = c6 - 1; i8 >= 0 && this.f5032b[i8] == 0; i8--) {
                if (this.f5033c[i8] == null) {
                    return i8;
                }
            }
            return ~i7;
        }
        return c6;
    }

    public final void e(int i6) {
        Object[] objArr = this.f5033c;
        Object obj = objArr[i6];
        int i7 = this.f5034d;
        if (i7 <= 1) {
            b(this.f5032b, objArr, i7);
            this.f5032b = f5026f;
            this.f5033c = f5027g;
            this.f5034d = 0;
            return;
        }
        int[] iArr = this.f5032b;
        if (iArr.length <= 8 || i7 >= iArr.length / 3) {
            int i8 = i7 - 1;
            this.f5034d = i8;
            if (i6 < i8) {
                int i9 = i6 + 1;
                System.arraycopy(iArr, i9, iArr, i6, i8 - i6);
                Object[] objArr2 = this.f5033c;
                System.arraycopy(objArr2, i9, objArr2, i6, this.f5034d - i6);
            }
            this.f5033c[this.f5034d] = null;
            return;
        }
        a(i7 > 8 ? i7 + (i7 >> 1) : 8);
        this.f5034d--;
        if (i6 > 0) {
            System.arraycopy(iArr, 0, this.f5032b, 0, i6);
            System.arraycopy(objArr, 0, this.f5033c, 0, i6);
        }
        int i10 = this.f5034d;
        if (i6 < i10) {
            int i11 = i6 + 1;
            System.arraycopy(iArr, i11, this.f5032b, i6, i10 - i6);
            System.arraycopy(objArr, i11, this.f5033c, i6, this.f5034d - i6);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f5034d != set.size()) {
                return false;
            }
            for (int i6 = 0; i6 < this.f5034d; i6++) {
                try {
                    if (!set.contains(this.f5033c[i6])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f5032b;
        int i6 = this.f5034d;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += iArr[i8];
        }
        return i7;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5034d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f5035e == null) {
            this.f5035e = new c(this);
        }
        c cVar = this.f5035e;
        if (cVar.f5047b == null) {
            cVar.f5047b = new g.c();
        }
        return (Iterator<E>) cVar.f5047b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            e(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= remove(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z5 = false;
        for (int i6 = this.f5034d - 1; i6 >= 0; i6--) {
            if (!collection.contains(this.f5033c[i6])) {
                e(i6);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f5034d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i6 = this.f5034d;
        Object[] objArr = new Object[i6];
        System.arraycopy(this.f5033c, 0, objArr, 0, i6);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f5034d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f5034d));
        }
        System.arraycopy(this.f5033c, 0, tArr, 0, this.f5034d);
        int length = tArr.length;
        int i6 = this.f5034d;
        if (length > i6) {
            tArr[i6] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5034d * 14);
        sb.append('{');
        for (int i6 = 0; i6 < this.f5034d; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = this.f5033c[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
