package l;

import a1.f0;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class h<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static Object[] f5061e;

    /* renamed from: f  reason: collision with root package name */
    public static int f5062f;

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f5063g;

    /* renamed from: h  reason: collision with root package name */
    public static int f5064h;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5065b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f5066c;

    /* renamed from: d  reason: collision with root package name */
    public int f5067d;

    public h() {
        this.f5065b = f0.f25c;
        this.f5066c = f0.f26d;
        this.f5067d = 0;
    }

    public h(int i6) {
        if (i6 == 0) {
            this.f5065b = f0.f25c;
            this.f5066c = f0.f26d;
        } else {
            a(i6);
        }
        this.f5067d = 0;
    }

    private void a(int i6) {
        if (i6 == 8) {
            synchronized (h.class) {
                Object[] objArr = f5063g;
                if (objArr != null) {
                    this.f5066c = objArr;
                    f5063g = (Object[]) objArr[0];
                    this.f5065b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5064h--;
                    return;
                }
            }
        } else if (i6 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f5061e;
                if (objArr2 != null) {
                    this.f5066c = objArr2;
                    f5061e = (Object[]) objArr2[0];
                    this.f5065b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5062f--;
                    return;
                }
            }
        }
        this.f5065b = new int[i6];
        this.f5066c = new Object[i6 << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i6) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f5064h < 10) {
                    objArr[0] = f5063g;
                    objArr[1] = iArr;
                    for (int i7 = (i6 << 1) - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    f5063g = objArr;
                    f5064h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (f5062f < 10) {
                    objArr[0] = f5061e;
                    objArr[1] = iArr;
                    for (int i8 = (i6 << 1) - 1; i8 >= 2; i8--) {
                        objArr[i8] = null;
                    }
                    f5061e = objArr;
                    f5062f++;
                }
            }
        }
    }

    public final void b(int i6) {
        int i7 = this.f5067d;
        int[] iArr = this.f5065b;
        if (iArr.length < i6) {
            Object[] objArr = this.f5066c;
            a(i6);
            if (this.f5067d > 0) {
                System.arraycopy(iArr, 0, this.f5065b, 0, i7);
                System.arraycopy(objArr, 0, this.f5066c, 0, i7 << 1);
            }
            c(iArr, objArr, i7);
        }
        if (this.f5067d != i7) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i6 = this.f5067d;
        if (i6 > 0) {
            int[] iArr = this.f5065b;
            Object[] objArr = this.f5066c;
            this.f5065b = f0.f25c;
            this.f5066c = f0.f26d;
            this.f5067d = 0;
            c(iArr, objArr, i6);
        }
        if (this.f5067d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i6, Object obj) {
        int i7 = this.f5067d;
        if (i7 == 0) {
            return -1;
        }
        try {
            int c6 = f0.c(i7, i6, this.f5065b);
            if (c6 < 0) {
                return c6;
            }
            if (obj.equals(this.f5066c[c6 << 1])) {
                return c6;
            }
            int i8 = c6 + 1;
            while (i8 < i7 && this.f5065b[i8] == i6) {
                if (obj.equals(this.f5066c[i8 << 1])) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = c6 - 1; i9 >= 0 && this.f5065b[i9] == i6; i9--) {
                if (obj.equals(this.f5066c[i9 << 1])) {
                    return i9;
                }
            }
            return ~i8;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f5067d != hVar.f5067d) {
                return false;
            }
            for (int i6 = 0; i6 < this.f5067d; i6++) {
                try {
                    K h6 = h(i6);
                    V l5 = l(i6);
                    Object orDefault = hVar.getOrDefault(h6, null);
                    if (l5 == null) {
                        if (orDefault != null || !hVar.containsKey(h6)) {
                            return false;
                        }
                    } else if (!l5.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f5067d != map.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f5067d; i7++) {
                try {
                    K h7 = h(i7);
                    V l6 = l(i7);
                    Object obj2 = map.get(h7);
                    if (l6 == null) {
                        if (obj2 != null || !map.containsKey(h7)) {
                            return false;
                        }
                    } else if (!l6.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i6 = this.f5067d;
        if (i6 == 0) {
            return -1;
        }
        try {
            int c6 = f0.c(i6, 0, this.f5065b);
            if (c6 < 0) {
                return c6;
            }
            if (this.f5066c[c6 << 1] == null) {
                return c6;
            }
            int i7 = c6 + 1;
            while (i7 < i6 && this.f5065b[i7] == 0) {
                if (this.f5066c[i7 << 1] == null) {
                    return i7;
                }
                i7++;
            }
            for (int i8 = c6 - 1; i8 >= 0 && this.f5065b[i8] == 0; i8--) {
                if (this.f5066c[i8 << 1] == null) {
                    return i8;
                }
            }
            return ~i7;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(Object obj) {
        int i6 = this.f5067d * 2;
        Object[] objArr = this.f5066c;
        if (obj == null) {
            for (int i7 = 1; i7 < i6; i7 += 2) {
                if (objArr[i7] == null) {
                    return i7 >> 1;
                }
            }
            return -1;
        }
        for (int i8 = 1; i8 < i6; i8 += 2) {
            if (obj.equals(objArr[i8])) {
                return i8 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v2) {
        int e6 = e(obj);
        return e6 >= 0 ? (V) this.f5066c[(e6 << 1) + 1] : v2;
    }

    public final K h(int i6) {
        return (K) this.f5066c[i6 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f5065b;
        Object[] objArr = this.f5066c;
        int i6 = this.f5067d;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            Object obj = objArr[i7];
            i9 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i8];
            i8++;
            i7 += 2;
        }
        return i9;
    }

    public void i(b bVar) {
        int i6 = bVar.f5067d;
        b(this.f5067d + i6);
        if (this.f5067d != 0) {
            for (int i7 = 0; i7 < i6; i7++) {
                put(bVar.h(i7), bVar.l(i7));
            }
        } else if (i6 > 0) {
            System.arraycopy(bVar.f5065b, 0, this.f5065b, 0, i6);
            System.arraycopy(bVar.f5066c, 0, this.f5066c, 0, i6 << 1);
            this.f5067d = i6;
        }
    }

    public final boolean isEmpty() {
        return this.f5067d <= 0;
    }

    public V j(int i6) {
        Object[] objArr = this.f5066c;
        int i7 = i6 << 1;
        V v2 = (V) objArr[i7 + 1];
        int i8 = this.f5067d;
        int i9 = 0;
        if (i8 <= 1) {
            c(this.f5065b, objArr, i8);
            this.f5065b = f0.f25c;
            this.f5066c = f0.f26d;
        } else {
            int i10 = i8 - 1;
            int[] iArr = this.f5065b;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                if (i6 < i10) {
                    int i11 = i6 + 1;
                    int i12 = i10 - i6;
                    System.arraycopy(iArr, i11, iArr, i6, i12);
                    Object[] objArr2 = this.f5066c;
                    System.arraycopy(objArr2, i11 << 1, objArr2, i7, i12 << 1);
                }
                Object[] objArr3 = this.f5066c;
                int i13 = i10 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                a(i8 > 8 ? i8 + (i8 >> 1) : 8);
                if (i8 != this.f5067d) {
                    throw new ConcurrentModificationException();
                }
                if (i6 > 0) {
                    System.arraycopy(iArr, 0, this.f5065b, 0, i6);
                    System.arraycopy(objArr, 0, this.f5066c, 0, i7);
                }
                if (i6 < i10) {
                    int i14 = i6 + 1;
                    int i15 = i10 - i6;
                    System.arraycopy(iArr, i14, this.f5065b, i6, i15);
                    System.arraycopy(objArr, i14 << 1, this.f5066c, i7, i15 << 1);
                }
            }
            i9 = i10;
        }
        if (i8 == this.f5067d) {
            this.f5067d = i9;
            return v2;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i6, V v2) {
        int i7 = (i6 << 1) + 1;
        Object[] objArr = this.f5066c;
        V v5 = (V) objArr[i7];
        objArr[i7] = v2;
        return v5;
    }

    public final V l(int i6) {
        return (V) this.f5066c[(i6 << 1) + 1];
    }

    public V put(K k5, V v2) {
        int i6;
        int d6;
        int i7 = this.f5067d;
        if (k5 == null) {
            d6 = f();
            i6 = 0;
        } else {
            int hashCode = k5.hashCode();
            i6 = hashCode;
            d6 = d(hashCode, k5);
        }
        if (d6 >= 0) {
            int i8 = (d6 << 1) + 1;
            Object[] objArr = this.f5066c;
            V v5 = (V) objArr[i8];
            objArr[i8] = v2;
            return v5;
        }
        int i9 = ~d6;
        int[] iArr = this.f5065b;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            Object[] objArr2 = this.f5066c;
            a(i10);
            if (i7 != this.f5067d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f5065b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f5066c, 0, objArr2.length);
            }
            c(iArr, objArr2, i7);
        }
        if (i9 < i7) {
            int[] iArr3 = this.f5065b;
            int i11 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i11, i7 - i9);
            Object[] objArr3 = this.f5066c;
            System.arraycopy(objArr3, i9 << 1, objArr3, i11 << 1, (this.f5067d - i9) << 1);
        }
        int i12 = this.f5067d;
        if (i7 == i12) {
            int[] iArr4 = this.f5065b;
            if (i9 < iArr4.length) {
                iArr4[i9] = i6;
                Object[] objArr4 = this.f5066c;
                int i13 = i9 << 1;
                objArr4[i13] = k5;
                objArr4[i13 + 1] = v2;
                this.f5067d = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k5, V v2) {
        V orDefault = getOrDefault(k5, null);
        if (orDefault == null) {
            return put(k5, v2);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int e6 = e(obj);
        if (e6 >= 0) {
            return j(e6);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e6 = e(obj);
        if (e6 >= 0) {
            V l5 = l(e6);
            if (obj2 == l5 || (obj2 != null && obj2.equals(l5))) {
                j(e6);
                return true;
            }
            return false;
        }
        return false;
    }

    public final V replace(K k5, V v2) {
        int e6 = e(k5);
        if (e6 >= 0) {
            return k(e6, v2);
        }
        return null;
    }

    public final boolean replace(K k5, V v2, V v5) {
        int e6 = e(k5);
        if (e6 >= 0) {
            V l5 = l(e6);
            if (l5 == v2 || (v2 != null && v2.equals(l5))) {
                k(e6, v5);
                return true;
            }
            return false;
        }
        return false;
    }

    public final int size() {
        return this.f5067d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5067d * 28);
        sb.append('{');
        for (int i6 = 0; i6 < this.f5067d; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            K h6 = h(i6);
            if (h6 != this) {
                sb.append(h6);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V l5 = l(i6);
            if (l5 != this) {
                sb.append(l5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
