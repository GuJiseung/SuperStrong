package l;

import a1.f0;
/* loaded from: classes.dex */
public final class e<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f5036f = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f5037b = false;

    /* renamed from: c  reason: collision with root package name */
    public long[] f5038c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f5039d;

    /* renamed from: e  reason: collision with root package name */
    public int f5040e;

    public e() {
        int i6;
        int i7 = 4;
        while (true) {
            i6 = 80;
            if (i7 >= 32) {
                break;
            }
            int i8 = (1 << i7) - 12;
            if (80 <= i8) {
                i6 = i8;
                break;
            }
            i7++;
        }
        int i9 = i6 / 8;
        this.f5038c = new long[i9];
        this.f5039d = new Object[i9];
    }

    public final void a() {
        int i6 = this.f5040e;
        Object[] objArr = this.f5039d;
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = null;
        }
        this.f5040e = 0;
        this.f5037b = false;
    }

    /* renamed from: b */
    public final e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f5038c = (long[]) this.f5038c.clone();
            eVar.f5039d = (Object[]) this.f5039d.clone();
            return eVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final void c() {
        int i6 = this.f5040e;
        long[] jArr = this.f5038c;
        Object[] objArr = this.f5039d;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[i8];
            if (obj != f5036f) {
                if (i8 != i7) {
                    jArr[i7] = jArr[i8];
                    objArr[i7] = obj;
                    objArr[i8] = null;
                }
                i7++;
            }
        }
        this.f5037b = false;
        this.f5040e = i7;
    }

    public final Object d(long j5, Long l5) {
        Object obj;
        int d6 = f0.d(this.f5038c, this.f5040e, j5);
        return (d6 < 0 || (obj = this.f5039d[d6]) == f5036f) ? l5 : obj;
    }

    public final long e(int i6) {
        if (this.f5037b) {
            c();
        }
        return this.f5038c[i6];
    }

    public final void f(long j5, E e6) {
        int d6 = f0.d(this.f5038c, this.f5040e, j5);
        if (d6 >= 0) {
            this.f5039d[d6] = e6;
            return;
        }
        int i6 = ~d6;
        int i7 = this.f5040e;
        if (i6 < i7) {
            Object[] objArr = this.f5039d;
            if (objArr[i6] == f5036f) {
                this.f5038c[i6] = j5;
                objArr[i6] = e6;
                return;
            }
        }
        if (this.f5037b && i7 >= this.f5038c.length) {
            c();
            i6 = ~f0.d(this.f5038c, this.f5040e, j5);
        }
        int i8 = this.f5040e;
        if (i8 >= this.f5038c.length) {
            int i9 = (i8 + 1) * 8;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 8;
            long[] jArr = new long[i12];
            Object[] objArr2 = new Object[i12];
            long[] jArr2 = this.f5038c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f5039d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5038c = jArr;
            this.f5039d = objArr2;
        }
        int i13 = this.f5040e - i6;
        if (i13 != 0) {
            long[] jArr3 = this.f5038c;
            int i14 = i6 + 1;
            System.arraycopy(jArr3, i6, jArr3, i14, i13);
            Object[] objArr4 = this.f5039d;
            System.arraycopy(objArr4, i6, objArr4, i14, this.f5040e - i6);
        }
        this.f5038c[i6] = j5;
        this.f5039d[i6] = e6;
        this.f5040e++;
    }

    public final void g(long j5) {
        int d6 = f0.d(this.f5038c, this.f5040e, j5);
        if (d6 >= 0) {
            Object[] objArr = this.f5039d;
            Object obj = objArr[d6];
            Object obj2 = f5036f;
            if (obj != obj2) {
                objArr[d6] = obj2;
                this.f5037b = true;
            }
        }
    }

    public final int h() {
        if (this.f5037b) {
            c();
        }
        return this.f5040e;
    }

    public final E i(int i6) {
        if (this.f5037b) {
            c();
        }
        return (E) this.f5039d[i6];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5040e * 28);
        sb.append('{');
        for (int i6 = 0; i6 < this.f5040e; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(e(i6));
            sb.append('=');
            E i7 = i(i6);
            if (i7 != this) {
                sb.append(i7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
