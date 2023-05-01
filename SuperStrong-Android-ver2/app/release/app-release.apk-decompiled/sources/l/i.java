package l;

import a1.f0;
/* loaded from: classes.dex */
public final class i<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f5068e = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int[] f5069b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f5070c;

    /* renamed from: d  reason: collision with root package name */
    public int f5071d;

    public i() {
        int i6;
        int i7 = 4;
        while (true) {
            i6 = 40;
            if (i7 >= 32) {
                break;
            }
            int i8 = (1 << i7) - 12;
            if (40 <= i8) {
                i6 = i8;
                break;
            }
            i7++;
        }
        int i9 = i6 / 4;
        this.f5069b = new int[i9];
        this.f5070c = new Object[i9];
    }

    public final void a(int i6, E e6) {
        int i7 = this.f5071d;
        if (i7 != 0 && i6 <= this.f5069b[i7 - 1]) {
            d(i6, e6);
            return;
        }
        if (i7 >= this.f5069b.length) {
            int i8 = (i7 + 1) * 4;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 4;
            int[] iArr = new int[i11];
            Object[] objArr = new Object[i11];
            int[] iArr2 = this.f5069b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f5070c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f5069b = iArr;
            this.f5070c = objArr;
        }
        this.f5069b[i7] = i6;
        this.f5070c[i7] = e6;
        this.f5071d = i7 + 1;
    }

    /* renamed from: b */
    public final i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f5069b = (int[]) this.f5069b.clone();
            iVar.f5070c = (Object[]) this.f5070c.clone();
            return iVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final Object c(int i6, Integer num) {
        Object obj;
        int c6 = f0.c(this.f5071d, i6, this.f5069b);
        return (c6 < 0 || (obj = this.f5070c[c6]) == f5068e) ? num : obj;
    }

    public final void d(int i6, E e6) {
        int c6 = f0.c(this.f5071d, i6, this.f5069b);
        if (c6 >= 0) {
            this.f5070c[c6] = e6;
            return;
        }
        int i7 = ~c6;
        int i8 = this.f5071d;
        if (i7 < i8) {
            Object[] objArr = this.f5070c;
            if (objArr[i7] == f5068e) {
                this.f5069b[i7] = i6;
                objArr[i7] = e6;
                return;
            }
        }
        if (i8 >= this.f5069b.length) {
            int i9 = (i8 + 1) * 4;
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
            int i12 = i9 / 4;
            int[] iArr = new int[i12];
            Object[] objArr2 = new Object[i12];
            int[] iArr2 = this.f5069b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f5070c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5069b = iArr;
            this.f5070c = objArr2;
        }
        int i13 = this.f5071d - i7;
        if (i13 != 0) {
            int[] iArr3 = this.f5069b;
            int i14 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i14, i13);
            Object[] objArr4 = this.f5070c;
            System.arraycopy(objArr4, i7, objArr4, i14, this.f5071d - i7);
        }
        this.f5069b[i7] = i6;
        this.f5070c[i7] = e6;
        this.f5071d++;
    }

    public final String toString() {
        int i6 = this.f5071d;
        if (i6 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i6 * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f5071d; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(this.f5069b[i7]);
            sb.append('=');
            Object obj = this.f5070c[i7];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
