package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.l implements RecyclerView.w.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;

    /* renamed from: p  reason: collision with root package name */
    public int f1795p;

    /* renamed from: q  reason: collision with root package name */
    public c f1796q;

    /* renamed from: r  reason: collision with root package name */
    public s f1797r;
    public boolean s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1798t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1799v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f1800w;

    /* renamed from: x  reason: collision with root package name */
    public int f1801x;

    /* renamed from: y  reason: collision with root package name */
    public int f1802y;

    /* renamed from: z  reason: collision with root package name */
    public d f1803z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public s f1804a;

        /* renamed from: b  reason: collision with root package name */
        public int f1805b;

        /* renamed from: c  reason: collision with root package name */
        public int f1806c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1807d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1808e;

        public a() {
            c();
        }

        public final void a(View view, int i6) {
            int l5;
            if (this.f1807d) {
                int b6 = this.f1804a.b(view);
                s sVar = this.f1804a;
                if (Integer.MIN_VALUE == sVar.f2164b) {
                    l5 = 0;
                } else {
                    l5 = sVar.l() - sVar.f2164b;
                }
                this.f1806c = l5 + b6;
            } else {
                this.f1806c = this.f1804a.e(view);
            }
            this.f1805b = i6;
        }

        public final void b(View view, int i6) {
            int l5;
            int min;
            s sVar = this.f1804a;
            if (Integer.MIN_VALUE == sVar.f2164b) {
                l5 = 0;
            } else {
                l5 = sVar.l() - sVar.f2164b;
            }
            if (l5 >= 0) {
                a(view, i6);
                return;
            }
            this.f1805b = i6;
            if (this.f1807d) {
                int g2 = (this.f1804a.g() - l5) - this.f1804a.b(view);
                this.f1806c = this.f1804a.g() - g2;
                if (g2 > 0) {
                    int c6 = this.f1806c - this.f1804a.c(view);
                    int k5 = this.f1804a.k();
                    int min2 = c6 - (Math.min(this.f1804a.e(view) - k5, 0) + k5);
                    if (min2 < 0) {
                        min = Math.min(g2, -min2) + this.f1806c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int e6 = this.f1804a.e(view);
                int k6 = e6 - this.f1804a.k();
                this.f1806c = e6;
                if (k6 > 0) {
                    int g6 = (this.f1804a.g() - Math.min(0, (this.f1804a.g() - l5) - this.f1804a.b(view))) - (this.f1804a.c(view) + e6);
                    if (g6 < 0) {
                        min = this.f1806c - Math.min(k6, -g6);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1806c = min;
        }

        public final void c() {
            this.f1805b = -1;
            this.f1806c = Integer.MIN_VALUE;
            this.f1807d = false;
            this.f1808e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f1805b + ", mCoordinate=" + this.f1806c + ", mLayoutFromEnd=" + this.f1807d + ", mValid=" + this.f1808e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1809a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1810b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1811c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1812d;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        public int f1814b;

        /* renamed from: c  reason: collision with root package name */
        public int f1815c;

        /* renamed from: d  reason: collision with root package name */
        public int f1816d;

        /* renamed from: e  reason: collision with root package name */
        public int f1817e;

        /* renamed from: f  reason: collision with root package name */
        public int f1818f;

        /* renamed from: g  reason: collision with root package name */
        public int f1819g;

        /* renamed from: j  reason: collision with root package name */
        public int f1822j;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1824l;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1813a = true;

        /* renamed from: h  reason: collision with root package name */
        public int f1820h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1821i = 0;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.a0> f1823k = null;

        public final void a(View view) {
            int a6;
            int a7;
            int size = this.f1823k.size();
            View view2 = null;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < size; i7++) {
                View view3 = this.f1823k.get(i7).f1873a;
                RecyclerView.m mVar = (RecyclerView.m) view3.getLayoutParams();
                if (view3 != view && !mVar.c() && (a7 = (mVar.a() - this.f1816d) * this.f1817e) >= 0 && a7 < i6) {
                    view2 = view3;
                    if (a7 == 0) {
                        break;
                    }
                    i6 = a7;
                }
            }
            if (view2 == null) {
                a6 = -1;
            } else {
                a6 = ((RecyclerView.m) view2.getLayoutParams()).a();
            }
            this.f1816d = a6;
        }

        public final View b(RecyclerView.s sVar) {
            List<RecyclerView.a0> list = this.f1823k;
            if (list != null) {
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    View view = this.f1823k.get(i6).f1873a;
                    RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
                    if (!mVar.c() && this.f1816d == mVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = sVar.i(this.f1816d, Long.MAX_VALUE).f1873a;
            this.f1816d += this.f1817e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f1825b;

        /* renamed from: c  reason: collision with root package name */
        public int f1826c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1827d;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i6) {
                return new d[i6];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f1825b = parcel.readInt();
            this.f1826c = parcel.readInt();
            this.f1827d = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f1825b = dVar.f1825b;
            this.f1826c = dVar.f1826c;
            this.f1827d = dVar.f1827d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f1825b);
            parcel.writeInt(this.f1826c);
            parcel.writeInt(this.f1827d ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i6) {
        this.f1795p = 1;
        this.f1798t = false;
        this.u = false;
        this.f1799v = false;
        this.f1800w = true;
        this.f1801x = -1;
        this.f1802y = Integer.MIN_VALUE;
        this.f1803z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        c1(i6);
        c(null);
        if (this.f1798t) {
            this.f1798t = false;
            n0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean B0() {
        return this.f1803z == null && this.s == this.f1799v;
    }

    public void C0(RecyclerView.x xVar, int[] iArr) {
        boolean z5;
        int i6;
        int i7;
        if (xVar.f1959a != -1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            i6 = this.f1797r.l();
        } else {
            i6 = 0;
        }
        if (this.f1796q.f1818f == -1) {
            i7 = 0;
        } else {
            i7 = i6;
            i6 = 0;
        }
        iArr[0] = i6;
        iArr[1] = i7;
    }

    public void D0(RecyclerView.x xVar, c cVar, RecyclerView.l.c cVar2) {
        int i6 = cVar.f1816d;
        if (i6 < 0 || i6 >= xVar.b()) {
            return;
        }
        ((m.b) cVar2).a(i6, Math.max(0, cVar.f1819g));
    }

    public final int E0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        I0();
        s sVar = this.f1797r;
        boolean z5 = !this.f1800w;
        return y.a(xVar, sVar, L0(z5), K0(z5), this, this.f1800w);
    }

    public final int F0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        I0();
        s sVar = this.f1797r;
        boolean z5 = !this.f1800w;
        return y.b(xVar, sVar, L0(z5), K0(z5), this, this.f1800w, this.u);
    }

    public final int G0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        I0();
        s sVar = this.f1797r;
        boolean z5 = !this.f1800w;
        return y.c(xVar, sVar, L0(z5), K0(z5), this, this.f1800w);
    }

    public final int H0(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 17 ? i6 != 33 ? i6 != 66 ? (i6 == 130 && this.f1795p == 1) ? 1 : Integer.MIN_VALUE : this.f1795p == 0 ? 1 : Integer.MIN_VALUE : this.f1795p == 1 ? -1 : Integer.MIN_VALUE : this.f1795p == 0 ? -1 : Integer.MIN_VALUE : (this.f1795p != 1 && V0()) ? -1 : 1 : (this.f1795p != 1 && V0()) ? 1 : -1;
    }

    public final void I0() {
        if (this.f1796q == null) {
            this.f1796q = new c();
        }
    }

    public final int J0(RecyclerView.s sVar, c cVar, RecyclerView.x xVar, boolean z5) {
        boolean z6;
        int i6 = cVar.f1815c;
        int i7 = cVar.f1819g;
        if (i7 != Integer.MIN_VALUE) {
            if (i6 < 0) {
                cVar.f1819g = i7 + i6;
            }
            Y0(sVar, cVar);
        }
        int i8 = cVar.f1815c + cVar.f1820h;
        while (true) {
            if (!cVar.f1824l && i8 <= 0) {
                break;
            }
            int i9 = cVar.f1816d;
            if (i9 >= 0 && i9 < xVar.b()) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                break;
            }
            b bVar = this.B;
            bVar.f1809a = 0;
            bVar.f1810b = false;
            bVar.f1811c = false;
            bVar.f1812d = false;
            W0(sVar, xVar, cVar, bVar);
            if (!bVar.f1810b) {
                int i10 = cVar.f1814b;
                int i11 = bVar.f1809a;
                cVar.f1814b = (cVar.f1818f * i11) + i10;
                if (!bVar.f1811c || cVar.f1823k != null || !xVar.f1965g) {
                    cVar.f1815c -= i11;
                    i8 -= i11;
                }
                int i12 = cVar.f1819g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + i11;
                    cVar.f1819g = i13;
                    int i14 = cVar.f1815c;
                    if (i14 < 0) {
                        cVar.f1819g = i13 + i14;
                    }
                    Y0(sVar, cVar);
                }
                if (z5 && bVar.f1812d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i6 - cVar.f1815c;
    }

    public final View K0(boolean z5) {
        int w5;
        int i6;
        if (this.u) {
            i6 = w();
            w5 = 0;
        } else {
            w5 = w() - 1;
            i6 = -1;
        }
        return P0(w5, i6, z5);
    }

    public final View L0(boolean z5) {
        int w5;
        int i6;
        if (this.u) {
            w5 = -1;
            i6 = w() - 1;
        } else {
            w5 = w();
            i6 = 0;
        }
        return P0(i6, w5, z5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean M() {
        return true;
    }

    public final int M0() {
        View P0 = P0(0, w(), false);
        if (P0 == null) {
            return -1;
        }
        return RecyclerView.l.G(P0);
    }

    public final int N0() {
        View P0 = P0(w() - 1, -1, false);
        if (P0 == null) {
            return -1;
        }
        return RecyclerView.l.G(P0);
    }

    public final View O0(int i6, int i7) {
        int i8;
        int i9;
        I0();
        if ((i7 > i6 ? (char) 1 : i7 < i6 ? (char) 65535 : (char) 0) == 0) {
            return v(i6);
        }
        if (this.f1797r.e(v(i6)) < this.f1797r.k()) {
            i8 = 16644;
            i9 = 16388;
        } else {
            i8 = 4161;
            i9 = 4097;
        }
        return (this.f1795p == 0 ? this.f1905c : this.f1906d).a(i6, i7, i8, i9);
    }

    public final View P0(int i6, int i7, boolean z5) {
        I0();
        return (this.f1795p == 0 ? this.f1905c : this.f1906d).a(i6, i7, z5 ? 24579 : 320, 320);
    }

    public View Q0(RecyclerView.s sVar, RecyclerView.x xVar, int i6, int i7, int i8) {
        I0();
        int k5 = this.f1797r.k();
        int g2 = this.f1797r.g();
        int i9 = i7 > i6 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i6 != i7) {
            View v2 = v(i6);
            int G = RecyclerView.l.G(v2);
            if (G >= 0 && G < i8) {
                if (((RecyclerView.m) v2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = v2;
                    }
                } else if (this.f1797r.e(v2) < g2 && this.f1797r.b(v2) >= k5) {
                    return v2;
                } else {
                    if (view == null) {
                        view = v2;
                    }
                }
            }
            i6 += i9;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void R(RecyclerView recyclerView) {
    }

    public final int R0(int i6, RecyclerView.s sVar, RecyclerView.x xVar, boolean z5) {
        int g2;
        int g6 = this.f1797r.g() - i6;
        if (g6 > 0) {
            int i7 = -b1(-g6, sVar, xVar);
            int i8 = i6 + i7;
            if (!z5 || (g2 = this.f1797r.g() - i8) <= 0) {
                return i7;
            }
            this.f1797r.o(g2);
            return g2 + i7;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public View S(View view, int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        int H0;
        View O0;
        View T0;
        a1();
        if (w() == 0 || (H0 = H0(i6)) == Integer.MIN_VALUE) {
            return null;
        }
        I0();
        e1(H0, (int) (this.f1797r.l() * 0.33333334f), false, xVar);
        c cVar = this.f1796q;
        cVar.f1819g = Integer.MIN_VALUE;
        cVar.f1813a = false;
        J0(sVar, cVar, xVar, true);
        if (H0 == -1) {
            if (this.u) {
                O0 = O0(w() - 1, -1);
            } else {
                O0 = O0(0, w());
            }
        } else if (this.u) {
            O0 = O0(0, w());
        } else {
            O0 = O0(w() - 1, -1);
        }
        if (H0 == -1) {
            T0 = U0();
        } else {
            T0 = T0();
        }
        if (T0.hasFocusable()) {
            if (O0 == null) {
                return null;
            }
            return T0;
        }
        return O0;
    }

    public final int S0(int i6, RecyclerView.s sVar, RecyclerView.x xVar, boolean z5) {
        int k5;
        int k6 = i6 - this.f1797r.k();
        if (k6 > 0) {
            int i7 = -b1(k6, sVar, xVar);
            int i8 = i6 + i7;
            if (!z5 || (k5 = i8 - this.f1797r.k()) <= 0) {
                return i7;
            }
            this.f1797r.o(-k5);
            return i7 - k5;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(M0());
            accessibilityEvent.setToIndex(N0());
        }
    }

    public final View T0() {
        return v(this.u ? 0 : w() - 1);
    }

    public final View U0() {
        return v(this.u ? w() - 1 : 0);
    }

    public final boolean V0() {
        return A() == 1;
    }

    public void W0(RecyclerView.s sVar, RecyclerView.x xVar, c cVar, b bVar) {
        boolean z5;
        int d6;
        int i6;
        int i7;
        int i8;
        int D;
        boolean z6;
        View b6 = cVar.b(sVar);
        if (b6 == null) {
            bVar.f1810b = true;
            return;
        }
        RecyclerView.m mVar = (RecyclerView.m) b6.getLayoutParams();
        if (cVar.f1823k == null) {
            boolean z7 = this.u;
            if (cVar.f1818f == -1) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z7 == z6) {
                b(b6, -1, false);
            } else {
                b(b6, 0, false);
            }
        } else {
            boolean z8 = this.u;
            if (cVar.f1818f == -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z8 == z5) {
                b(b6, -1, true);
            } else {
                b(b6, 0, true);
            }
        }
        RecyclerView.m mVar2 = (RecyclerView.m) b6.getLayoutParams();
        Rect K = this.f1904b.K(b6);
        int x5 = RecyclerView.l.x(d(), this.f1916n, this.f1914l, E() + D() + ((ViewGroup.MarginLayoutParams) mVar2).leftMargin + ((ViewGroup.MarginLayoutParams) mVar2).rightMargin + K.left + K.right + 0, ((ViewGroup.MarginLayoutParams) mVar2).width);
        int x6 = RecyclerView.l.x(e(), this.f1917o, this.f1915m, C() + F() + ((ViewGroup.MarginLayoutParams) mVar2).topMargin + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin + K.top + K.bottom + 0, ((ViewGroup.MarginLayoutParams) mVar2).height);
        if (w0(b6, x5, x6, mVar2)) {
            b6.measure(x5, x6);
        }
        bVar.f1809a = this.f1797r.c(b6);
        if (this.f1795p == 1) {
            if (V0()) {
                i8 = this.f1916n - E();
                D = i8 - this.f1797r.d(b6);
            } else {
                D = D();
                i8 = this.f1797r.d(b6) + D;
            }
            int i9 = cVar.f1818f;
            i7 = cVar.f1814b;
            if (i9 == -1) {
                int i10 = D;
                d6 = i7;
                i7 -= bVar.f1809a;
                i6 = i10;
            } else {
                i6 = D;
                d6 = bVar.f1809a + i7;
            }
        } else {
            int F = F();
            d6 = this.f1797r.d(b6) + F;
            int i11 = cVar.f1818f;
            int i12 = cVar.f1814b;
            if (i11 == -1) {
                i6 = i12 - bVar.f1809a;
                i8 = i12;
                i7 = F;
            } else {
                int i13 = bVar.f1809a + i12;
                i6 = i12;
                i7 = F;
                i8 = i13;
            }
        }
        RecyclerView.l.O(b6, i6, i7, i8, d6);
        if (mVar.c() || mVar.b()) {
            bVar.f1811c = true;
        }
        bVar.f1812d = b6.hasFocusable();
    }

    public void X0(RecyclerView.s sVar, RecyclerView.x xVar, a aVar, int i6) {
    }

    public final void Y0(RecyclerView.s sVar, c cVar) {
        if (cVar.f1813a && !cVar.f1824l) {
            int i6 = cVar.f1819g;
            int i7 = cVar.f1821i;
            if (cVar.f1818f == -1) {
                int w5 = w();
                if (i6 >= 0) {
                    int f6 = (this.f1797r.f() - i6) + i7;
                    if (this.u) {
                        for (int i8 = 0; i8 < w5; i8++) {
                            View v2 = v(i8);
                            if (this.f1797r.e(v2) < f6 || this.f1797r.n(v2) < f6) {
                                Z0(sVar, 0, i8);
                                return;
                            }
                        }
                        return;
                    }
                    int i9 = w5 - 1;
                    for (int i10 = i9; i10 >= 0; i10--) {
                        View v5 = v(i10);
                        if (this.f1797r.e(v5) < f6 || this.f1797r.n(v5) < f6) {
                            Z0(sVar, i9, i10);
                            return;
                        }
                    }
                }
            } else if (i6 >= 0) {
                int i11 = i6 - i7;
                int w6 = w();
                if (this.u) {
                    int i12 = w6 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View v6 = v(i13);
                        if (this.f1797r.b(v6) > i11 || this.f1797r.m(v6) > i11) {
                            Z0(sVar, i12, i13);
                            return;
                        }
                    }
                    return;
                }
                for (int i14 = 0; i14 < w6; i14++) {
                    View v7 = v(i14);
                    if (this.f1797r.b(v7) > i11 || this.f1797r.m(v7) > i11) {
                        Z0(sVar, 0, i14);
                        return;
                    }
                }
            }
        }
    }

    public final void Z0(RecyclerView.s sVar, int i6, int i7) {
        if (i6 == i7) {
            return;
        }
        if (i7 <= i6) {
            while (i6 > i7) {
                View v2 = v(i6);
                l0(i6);
                sVar.f(v2);
                i6--;
            }
            return;
        }
        while (true) {
            i7--;
            if (i7 < i6) {
                return;
            }
            View v5 = v(i7);
            l0(i7);
            sVar.f(v5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i6) {
        if (w() == 0) {
            return null;
        }
        int i7 = (i6 < RecyclerView.l.G(v(0))) != this.u ? -1 : 1;
        return this.f1795p == 0 ? new PointF(i7, 0.0f) : new PointF(0.0f, i7);
    }

    public final void a1() {
        this.u = (this.f1795p == 1 || !V0()) ? this.f1798t : !this.f1798t;
    }

    public final int b1(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (w() == 0 || i6 == 0) {
            return 0;
        }
        I0();
        this.f1796q.f1813a = true;
        int i7 = i6 > 0 ? 1 : -1;
        int abs = Math.abs(i6);
        e1(i7, abs, true, xVar);
        c cVar = this.f1796q;
        int J0 = J0(sVar, cVar, xVar, false) + cVar.f1819g;
        if (J0 < 0) {
            return 0;
        }
        if (abs > J0) {
            i6 = i7 * J0;
        }
        this.f1797r.o(-i6);
        this.f1796q.f1822j = i6;
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c(String str) {
        if (this.f1803z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0298  */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v40 */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(androidx.recyclerview.widget.RecyclerView.s r18, androidx.recyclerview.widget.RecyclerView.x r19) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public final void c1(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(androidx.activity.j.a("invalid orientation:", i6));
        }
        c(null);
        if (i6 != this.f1795p || this.f1797r == null) {
            s a6 = s.a(this, i6);
            this.f1797r = a6;
            this.A.f1804a = a6;
            this.f1795p = i6;
            n0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean d() {
        return this.f1795p == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void d0(RecyclerView.x xVar) {
        this.f1803z = null;
        this.f1801x = -1;
        this.f1802y = Integer.MIN_VALUE;
        this.A.c();
    }

    public void d1(boolean z5) {
        c(null);
        if (this.f1799v == z5) {
            return;
        }
        this.f1799v = z5;
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean e() {
        return this.f1795p == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f1803z = (d) parcelable;
            n0();
        }
    }

    public final void e1(int i6, int i7, boolean z5, RecyclerView.x xVar) {
        boolean z6;
        int i8;
        int k5;
        c cVar = this.f1796q;
        int i9 = 1;
        boolean z7 = false;
        if (this.f1797r.i() == 0 && this.f1797r.f() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        cVar.f1824l = z6;
        this.f1796q.f1818f = i6;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(xVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i6 == 1) {
            z7 = true;
        }
        c cVar2 = this.f1796q;
        if (z7) {
            i8 = max2;
        } else {
            i8 = max;
        }
        cVar2.f1820h = i8;
        if (!z7) {
            max = max2;
        }
        cVar2.f1821i = max;
        if (z7) {
            cVar2.f1820h = this.f1797r.h() + i8;
            View T0 = T0();
            c cVar3 = this.f1796q;
            if (this.u) {
                i9 = -1;
            }
            cVar3.f1817e = i9;
            int G = RecyclerView.l.G(T0);
            c cVar4 = this.f1796q;
            cVar3.f1816d = G + cVar4.f1817e;
            cVar4.f1814b = this.f1797r.b(T0);
            k5 = this.f1797r.b(T0) - this.f1797r.g();
        } else {
            View U0 = U0();
            c cVar5 = this.f1796q;
            cVar5.f1820h = this.f1797r.k() + cVar5.f1820h;
            c cVar6 = this.f1796q;
            if (!this.u) {
                i9 = -1;
            }
            cVar6.f1817e = i9;
            int G2 = RecyclerView.l.G(U0);
            c cVar7 = this.f1796q;
            cVar6.f1816d = G2 + cVar7.f1817e;
            cVar7.f1814b = this.f1797r.e(U0);
            k5 = (-this.f1797r.e(U0)) + this.f1797r.k();
        }
        c cVar8 = this.f1796q;
        cVar8.f1815c = i7;
        if (z5) {
            cVar8.f1815c = i7 - k5;
        }
        cVar8.f1819g = k5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final Parcelable f0() {
        d dVar = this.f1803z;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (w() > 0) {
            I0();
            boolean z5 = this.s ^ this.u;
            dVar2.f1827d = z5;
            if (z5) {
                View T0 = T0();
                dVar2.f1826c = this.f1797r.g() - this.f1797r.b(T0);
                dVar2.f1825b = RecyclerView.l.G(T0);
            } else {
                View U0 = U0();
                dVar2.f1825b = RecyclerView.l.G(U0);
                dVar2.f1826c = this.f1797r.e(U0) - this.f1797r.k();
            }
        } else {
            dVar2.f1825b = -1;
        }
        return dVar2;
    }

    public final void f1(int i6, int i7) {
        this.f1796q.f1815c = this.f1797r.g() - i7;
        c cVar = this.f1796q;
        cVar.f1817e = this.u ? -1 : 1;
        cVar.f1816d = i6;
        cVar.f1818f = 1;
        cVar.f1814b = i7;
        cVar.f1819g = Integer.MIN_VALUE;
    }

    public final void g1(int i6, int i7) {
        this.f1796q.f1815c = i7 - this.f1797r.k();
        c cVar = this.f1796q;
        cVar.f1816d = i6;
        cVar.f1817e = this.u ? 1 : -1;
        cVar.f1818f = -1;
        cVar.f1814b = i7;
        cVar.f1819g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h(int i6, int i7, RecyclerView.x xVar, RecyclerView.l.c cVar) {
        if (this.f1795p != 0) {
            i6 = i7;
        }
        if (w() == 0 || i6 == 0) {
            return;
        }
        I0();
        e1(i6 > 0 ? 1 : -1, Math.abs(i6), true, xVar);
        D0(xVar, this.f1796q, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r7, androidx.recyclerview.widget.RecyclerView.l.c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.f1803z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f1825b
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f1827d
            goto L22
        L13:
            r6.a1()
            boolean r0 = r6.u
            int r4 = r6.f1801x
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.C
            if (r0 >= r2) goto L38
            if (r4 < 0) goto L38
            if (r4 >= r7) goto L38
            r2 = r8
            androidx.recyclerview.widget.m$b r2 = (androidx.recyclerview.widget.m.b) r2
            r2.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i(int, androidx.recyclerview.widget.RecyclerView$l$c):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int j(RecyclerView.x xVar) {
        return E0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int k(RecyclerView.x xVar) {
        return F0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int l(RecyclerView.x xVar) {
        return G0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int m(RecyclerView.x xVar) {
        return E0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int n(RecyclerView.x xVar) {
        return F0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int o(RecyclerView.x xVar) {
        return G0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int o0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1795p == 1) {
            return 0;
        }
        return b1(i6, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void p0(int i6) {
        this.f1801x = i6;
        this.f1802y = Integer.MIN_VALUE;
        d dVar = this.f1803z;
        if (dVar != null) {
            dVar.f1825b = -1;
        }
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final View q(int i6) {
        int w5 = w();
        if (w5 == 0) {
            return null;
        }
        int G = i6 - RecyclerView.l.G(v(0));
        if (G >= 0 && G < w5) {
            View v2 = v(G);
            if (RecyclerView.l.G(v2) == i6) {
                return v2;
            }
        }
        return super.q(i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int q0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1795p == 0) {
            return 0;
        }
        return b1(i6, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m r() {
        return new RecyclerView.m(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean x0() {
        boolean z5;
        if (this.f1915m == 1073741824 || this.f1914l == 1073741824) {
            return false;
        }
        int w5 = w();
        int i6 = 0;
        while (true) {
            if (i6 < w5) {
                ViewGroup.LayoutParams layoutParams = v(i6).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z5 = true;
                    break;
                }
                i6++;
            } else {
                z5 = false;
                break;
            }
        }
        if (!z5) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void z0(RecyclerView recyclerView, int i6) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1944a = i6;
        A0(oVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f1795p = 1;
        this.f1798t = false;
        this.u = false;
        this.f1799v = false;
        this.f1800w = true;
        this.f1801x = -1;
        this.f1802y = Integer.MIN_VALUE;
        this.f1803z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.l.d H = RecyclerView.l.H(context, attributeSet, i6, i7);
        c1(H.f1920a);
        boolean z5 = H.f1922c;
        c(null);
        if (z5 != this.f1798t) {
            this.f1798t = z5;
            n0();
        }
        d1(H.f1923d);
    }
}
