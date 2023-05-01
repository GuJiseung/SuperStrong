package t3;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import s3.m;
/* loaded from: classes.dex */
public final class e extends x3.a {

    /* renamed from: v  reason: collision with root package name */
    public static final Object f6143v;

    /* renamed from: r  reason: collision with root package name */
    public Object[] f6144r;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public String[] f6145t;
    public int[] u;

    /* loaded from: classes.dex */
    public static class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i6, int i7) {
            throw new AssertionError();
        }
    }

    static {
        new a();
        f6143v = new Object();
    }

    private String s() {
        return " at path " + p();
    }

    @Override // x3.a
    public final int E() {
        int parseInt;
        int M = M();
        if (M != 7 && M != 6) {
            throw new IllegalStateException("Expected " + x3.b.a(7) + " but was " + x3.b.a(M) + s());
        }
        q3.s sVar = (q3.s) U();
        if (sVar.f5848b instanceof Number) {
            parseInt = sVar.d().intValue();
        } else {
            parseInt = Integer.parseInt(sVar.b());
        }
        V();
        int i6 = this.s;
        if (i6 > 0) {
            int[] iArr = this.u;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
        }
        return parseInt;
    }

    @Override // x3.a
    public final long F() {
        long parseLong;
        int M = M();
        if (M != 7 && M != 6) {
            throw new IllegalStateException("Expected " + x3.b.a(7) + " but was " + x3.b.a(M) + s());
        }
        q3.s sVar = (q3.s) U();
        if (sVar.f5848b instanceof Number) {
            parseLong = sVar.d().longValue();
        } else {
            parseLong = Long.parseLong(sVar.b());
        }
        V();
        int i6 = this.s;
        if (i6 > 0) {
            int[] iArr = this.u;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
        }
        return parseLong;
    }

    @Override // x3.a
    public final String G() {
        T(5);
        Map.Entry entry = (Map.Entry) ((Iterator) U()).next();
        String str = (String) entry.getKey();
        this.f6145t[this.s - 1] = str;
        W(entry.getValue());
        return str;
    }

    @Override // x3.a
    public final void I() {
        T(9);
        V();
        int i6 = this.s;
        if (i6 > 0) {
            int[] iArr = this.u;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
        }
    }

    @Override // x3.a
    public final String K() {
        int M = M();
        if (M != 6 && M != 7) {
            throw new IllegalStateException("Expected " + x3.b.a(6) + " but was " + x3.b.a(M) + s());
        }
        String b6 = ((q3.s) V()).b();
        int i6 = this.s;
        if (i6 > 0) {
            int[] iArr = this.u;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
        }
        return b6;
    }

    @Override // x3.a
    public final int M() {
        if (this.s == 0) {
            return 10;
        }
        Object U = U();
        if (U instanceof Iterator) {
            boolean z5 = this.f6144r[this.s - 2] instanceof q3.q;
            Iterator it = (Iterator) U;
            if (it.hasNext()) {
                if (z5) {
                    return 5;
                }
                W(it.next());
                return M();
            } else if (z5) {
                return 4;
            } else {
                return 2;
            }
        } else if (U instanceof q3.q) {
            return 3;
        } else {
            if (U instanceof q3.l) {
                return 1;
            }
            if (U instanceof q3.s) {
                Object obj = ((q3.s) U).f5848b;
                if (obj instanceof String) {
                    return 6;
                }
                if (obj instanceof Boolean) {
                    return 8;
                }
                if (obj instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (U instanceof q3.p) {
                return 9;
            } else {
                if (U == f6143v) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // x3.a
    public final void R() {
        if (M() == 5) {
            G();
            this.f6145t[this.s - 2] = "null";
        } else {
            V();
            int i6 = this.s;
            if (i6 > 0) {
                this.f6145t[i6 - 1] = "null";
            }
        }
        int i7 = this.s;
        if (i7 > 0) {
            int[] iArr = this.u;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
    }

    public final void T(int i6) {
        if (M() == i6) {
            return;
        }
        throw new IllegalStateException("Expected " + x3.b.a(i6) + " but was " + x3.b.a(M()) + s());
    }

    public final Object U() {
        return this.f6144r[this.s - 1];
    }

    public final Object V() {
        Object[] objArr = this.f6144r;
        int i6 = this.s - 1;
        this.s = i6;
        Object obj = objArr[i6];
        objArr[i6] = null;
        return obj;
    }

    public final void W(Object obj) {
        int i6 = this.s;
        Object[] objArr = this.f6144r;
        if (i6 == objArr.length) {
            Object[] objArr2 = new Object[i6 * 2];
            int[] iArr = new int[i6 * 2];
            String[] strArr = new String[i6 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i6);
            System.arraycopy(this.u, 0, iArr, 0, this.s);
            System.arraycopy(this.f6145t, 0, strArr, 0, this.s);
            this.f6144r = objArr2;
            this.u = iArr;
            this.f6145t = strArr;
        }
        Object[] objArr3 = this.f6144r;
        int i7 = this.s;
        this.s = i7 + 1;
        objArr3[i7] = obj;
    }

    @Override // x3.a
    public final void c() {
        T(1);
        W(((q3.l) U()).iterator());
        this.u[this.s - 1] = 0;
    }

    @Override // x3.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6144r = new Object[]{f6143v};
        this.s = 1;
    }

    @Override // x3.a
    public final void f() {
        T(3);
        W(new m.b.a((m.b) ((q3.q) U()).f5846b.entrySet()));
    }

    @Override // x3.a
    public final void k() {
        T(2);
        V();
        V();
        int i6 = this.s;
        if (i6 > 0) {
            int[] iArr = this.u;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
        }
    }

    @Override // x3.a
    public final void n() {
        T(4);
        V();
        V();
        int i6 = this.s;
        if (i6 > 0) {
            int[] iArr = this.u;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
        }
    }

    @Override // x3.a
    public final String p() {
        StringBuilder sb = new StringBuilder("$");
        int i6 = 0;
        while (i6 < this.s) {
            Object[] objArr = this.f6144r;
            Object obj = objArr[i6];
            if (obj instanceof q3.l) {
                i6++;
                if (objArr[i6] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.u[i6]);
                    sb.append(']');
                }
            } else if (obj instanceof q3.q) {
                i6++;
                if (objArr[i6] instanceof Iterator) {
                    sb.append('.');
                    String str = this.f6145t[i6];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i6++;
        }
        return sb.toString();
    }

    @Override // x3.a
    public final boolean q() {
        int M = M();
        return (M == 4 || M == 2) ? false : true;
    }

    @Override // x3.a
    public final String toString() {
        return e.class.getSimpleName();
    }

    @Override // x3.a
    public final boolean w() {
        T(8);
        boolean c6 = ((q3.s) V()).c();
        int i6 = this.s;
        if (i6 > 0) {
            int[] iArr = this.u;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
        }
        return c6;
    }

    @Override // x3.a
    public final double x() {
        int M = M();
        if (M != 7 && M != 6) {
            throw new IllegalStateException("Expected " + x3.b.a(7) + " but was " + x3.b.a(M) + s());
        }
        double a6 = ((q3.s) U()).a();
        if (!this.f6694c && (Double.isNaN(a6) || Double.isInfinite(a6))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + a6);
        }
        V();
        int i6 = this.s;
        if (i6 > 0) {
            int[] iArr = this.u;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
        }
        return a6;
    }
}
