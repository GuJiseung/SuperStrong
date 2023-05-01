package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.s;
import s4.m0;
/* loaded from: classes.dex */
public class r<T extends s & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    public T[] f4977a;

    public final void a(T t5) {
        t5.b((m0.b) this);
        T[] tArr = this.f4977a;
        if (tArr == null) {
            tArr = (T[]) new s[4];
            this.f4977a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            l4.f.e(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((s[]) copyOf);
            this.f4977a = tArr;
        }
        int i6 = this._size;
        this._size = i6 + 1;
        tArr[i6] = t5;
        t5.setIndex(i6);
        e(i6);
    }

    public final boolean b() {
        return this._size == 0;
    }

    public final T c(int i6) {
        T[] tArr = this.f4977a;
        l4.f.c(tArr);
        this._size--;
        if (i6 < this._size) {
            f(i6, this._size);
            int i7 = (i6 - 1) / 2;
            if (i6 > 0) {
                T t5 = tArr[i6];
                l4.f.c(t5);
                T t6 = tArr[i7];
                l4.f.c(t6);
                if (((Comparable) t5).compareTo(t6) < 0) {
                    f(i6, i7);
                    e(i7);
                }
            }
            while (true) {
                int i8 = (i6 * 2) + 1;
                if (i8 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f4977a;
                l4.f.c(tArr2);
                int i9 = i8 + 1;
                if (i9 < this._size) {
                    T t7 = tArr2[i9];
                    l4.f.c(t7);
                    T t8 = tArr2[i8];
                    l4.f.c(t8);
                    if (((Comparable) t7).compareTo(t8) < 0) {
                        i8 = i9;
                    }
                }
                T t9 = tArr2[i6];
                l4.f.c(t9);
                T t10 = tArr2[i8];
                l4.f.c(t10);
                if (((Comparable) t9).compareTo(t10) <= 0) {
                    break;
                }
                f(i6, i8);
                i6 = i8;
            }
        }
        T t11 = tArr[this._size];
        l4.f.c(t11);
        t11.b(null);
        t11.setIndex(-1);
        tArr[this._size] = null;
        return t11;
    }

    public final T d() {
        T t5;
        synchronized (this) {
            if (this._size > 0) {
                t5 = c(0);
            } else {
                t5 = null;
            }
        }
        return t5;
    }

    public final void e(int i6) {
        while (i6 > 0) {
            T[] tArr = this.f4977a;
            l4.f.c(tArr);
            int i7 = (i6 - 1) / 2;
            T t5 = tArr[i7];
            l4.f.c(t5);
            T t6 = tArr[i6];
            l4.f.c(t6);
            if (((Comparable) t5).compareTo(t6) <= 0) {
                return;
            }
            f(i6, i7);
            i6 = i7;
        }
    }

    public final void f(int i6, int i7) {
        T[] tArr = this.f4977a;
        l4.f.c(tArr);
        T t5 = tArr[i7];
        l4.f.c(t5);
        T t6 = tArr[i6];
        l4.f.c(t6);
        tArr[i6] = t5;
        tArr[i7] = t6;
        t5.setIndex(i6);
        t6.setIndex(i7);
    }
}
