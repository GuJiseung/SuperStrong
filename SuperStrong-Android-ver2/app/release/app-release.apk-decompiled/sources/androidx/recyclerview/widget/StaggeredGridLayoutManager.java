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
import f0.g0;
import f0.r0;
import g0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.l implements RecyclerView.w.b {
    public final d B;
    public final int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public final boolean I;
    public int[] J;
    public final a K;

    /* renamed from: p  reason: collision with root package name */
    public int f1980p;

    /* renamed from: q  reason: collision with root package name */
    public f[] f1981q;

    /* renamed from: r  reason: collision with root package name */
    public s f1982r;
    public s s;

    /* renamed from: t  reason: collision with root package name */
    public int f1983t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public final n f1984v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1985w;

    /* renamed from: y  reason: collision with root package name */
    public BitSet f1987y;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1986x = false;

    /* renamed from: z  reason: collision with root package name */
    public int f1988z = -1;
    public int A = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.D0();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1990a;

        /* renamed from: b  reason: collision with root package name */
        public int f1991b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1992c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1993d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1994e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f1995f;

        public b() {
            a();
        }

        public final void a() {
            this.f1990a = -1;
            this.f1991b = Integer.MIN_VALUE;
            this.f1992c = false;
            this.f1993d = false;
            this.f1994e = false;
            int[] iArr = this.f1995f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.m {

        /* renamed from: e  reason: collision with root package name */
        public f f1997e;

        public c(int i6, int i7) {
            super(i6, i7);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f1998a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f1999b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0013a();

            /* renamed from: b  reason: collision with root package name */
            public int f2000b;

            /* renamed from: c  reason: collision with root package name */
            public int f2001c;

            /* renamed from: d  reason: collision with root package name */
            public int[] f2002d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f2003e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0013a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i6) {
                    return new a[i6];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f2000b = parcel.readInt();
                this.f2001c = parcel.readInt();
                this.f2003e = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2002d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f2000b + ", mGapDir=" + this.f2001c + ", mHasUnwantedGapAfter=" + this.f2003e + ", mGapPerSpan=" + Arrays.toString(this.f2002d) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i6) {
                parcel.writeInt(this.f2000b);
                parcel.writeInt(this.f2001c);
                parcel.writeInt(this.f2003e ? 1 : 0);
                int[] iArr = this.f2002d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2002d);
            }
        }

        public final void a(int i6) {
            int[] iArr = this.f1998a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i6, 10) + 1];
                this.f1998a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i6 >= iArr.length) {
                int length = iArr.length;
                while (length <= i6) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1998a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1998a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int b(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f1998a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r6 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1999b
                if (r0 != 0) goto Lf
                goto L5e
            Lf:
                r2 = 0
                if (r0 != 0) goto L13
                goto L2b
            L13:
                int r0 = r0.size()
                int r0 = r0 + r1
            L18:
                if (r0 < 0) goto L2b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1999b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r4 = r3.f2000b
                if (r4 != r6) goto L28
                r2 = r3
                goto L2b
            L28:
                int r0 = r0 + (-1)
                goto L18
            L2b:
                if (r2 == 0) goto L32
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1999b
                r0.remove(r2)
            L32:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1999b
                int r0 = r0.size()
                r2 = 0
            L39:
                if (r2 >= r0) goto L4b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1999b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f2000b
                if (r3 < r6) goto L48
                goto L4c
            L48:
                int r2 = r2 + 1
                goto L39
            L4b:
                r2 = r1
            L4c:
                if (r2 == r1) goto L5e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1999b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1999b
                r3.remove(r2)
                int r0 = r0.f2000b
                goto L5f
            L5e:
                r0 = r1
            L5f:
                if (r0 != r1) goto L6b
                int[] r0 = r5.f1998a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f1998a
                int r6 = r6.length
                return r6
            L6b:
                int[] r2 = r5.f1998a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.b(int):int");
        }

        public final void c(int i6, int i7) {
            int[] iArr = this.f1998a;
            if (iArr != null && i6 < iArr.length) {
                int i8 = i6 + i7;
                a(i8);
                int[] iArr2 = this.f1998a;
                System.arraycopy(iArr2, i6, iArr2, i8, (iArr2.length - i6) - i7);
                Arrays.fill(this.f1998a, i6, i8, -1);
                List<a> list = this.f1999b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f1999b.get(size);
                        int i9 = aVar.f2000b;
                        if (i9 >= i6) {
                            aVar.f2000b = i9 + i7;
                        }
                    }
                }
            }
        }

        public final void d(int i6, int i7) {
            int[] iArr = this.f1998a;
            if (iArr != null && i6 < iArr.length) {
                int i8 = i6 + i7;
                a(i8);
                int[] iArr2 = this.f1998a;
                System.arraycopy(iArr2, i8, iArr2, i6, (iArr2.length - i6) - i7);
                int[] iArr3 = this.f1998a;
                Arrays.fill(iArr3, iArr3.length - i7, iArr3.length, -1);
                List<a> list = this.f1999b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f1999b.get(size);
                        int i9 = aVar.f2000b;
                        if (i9 >= i6) {
                            if (i9 < i8) {
                                this.f1999b.remove(size);
                            } else {
                                aVar.f2000b = i9 - i7;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f2004b;

        /* renamed from: c  reason: collision with root package name */
        public int f2005c;

        /* renamed from: d  reason: collision with root package name */
        public int f2006d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f2007e;

        /* renamed from: f  reason: collision with root package name */
        public int f2008f;

        /* renamed from: g  reason: collision with root package name */
        public int[] f2009g;

        /* renamed from: h  reason: collision with root package name */
        public List<d.a> f2010h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2011i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2012j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2013k;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i6) {
                return new e[i6];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f2004b = parcel.readInt();
            this.f2005c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2006d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2007e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2008f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2009g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2011i = parcel.readInt() == 1;
            this.f2012j = parcel.readInt() == 1;
            this.f2013k = parcel.readInt() == 1;
            this.f2010h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2006d = eVar.f2006d;
            this.f2004b = eVar.f2004b;
            this.f2005c = eVar.f2005c;
            this.f2007e = eVar.f2007e;
            this.f2008f = eVar.f2008f;
            this.f2009g = eVar.f2009g;
            this.f2011i = eVar.f2011i;
            this.f2012j = eVar.f2012j;
            this.f2013k = eVar.f2013k;
            this.f2010h = eVar.f2010h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f2004b);
            parcel.writeInt(this.f2005c);
            parcel.writeInt(this.f2006d);
            if (this.f2006d > 0) {
                parcel.writeIntArray(this.f2007e);
            }
            parcel.writeInt(this.f2008f);
            if (this.f2008f > 0) {
                parcel.writeIntArray(this.f2009g);
            }
            parcel.writeInt(this.f2011i ? 1 : 0);
            parcel.writeInt(this.f2012j ? 1 : 0);
            parcel.writeInt(this.f2013k ? 1 : 0);
            parcel.writeList(this.f2010h);
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f2014a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2015b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f2016c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f2017d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f2018e;

        public f(int i6) {
            this.f2018e = i6;
        }

        public static c h(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a() {
            ArrayList<View> arrayList = this.f2014a;
            View view = arrayList.get(arrayList.size() - 1);
            c h6 = h(view);
            this.f2016c = StaggeredGridLayoutManager.this.f1982r.b(view);
            h6.getClass();
        }

        public final void b() {
            this.f2014a.clear();
            this.f2015b = Integer.MIN_VALUE;
            this.f2016c = Integer.MIN_VALUE;
            this.f2017d = 0;
        }

        public final int c() {
            boolean z5 = StaggeredGridLayoutManager.this.f1985w;
            ArrayList<View> arrayList = this.f2014a;
            return z5 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
        }

        public final int d() {
            boolean z5 = StaggeredGridLayoutManager.this.f1985w;
            ArrayList<View> arrayList = this.f2014a;
            return z5 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
        }

        public final int e(int i6, int i7) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k5 = staggeredGridLayoutManager.f1982r.k();
            int g2 = staggeredGridLayoutManager.f1982r.g();
            int i8 = i7 > i6 ? 1 : -1;
            while (i6 != i7) {
                View view = this.f2014a.get(i6);
                int e6 = staggeredGridLayoutManager.f1982r.e(view);
                int b6 = staggeredGridLayoutManager.f1982r.b(view);
                boolean z5 = e6 <= g2;
                boolean z6 = b6 >= k5;
                if (z5 && z6 && (e6 < k5 || b6 > g2)) {
                    return RecyclerView.l.G(view);
                }
                i6 += i8;
            }
            return -1;
        }

        public final int f(int i6) {
            int i7 = this.f2016c;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            if (this.f2014a.size() == 0) {
                return i6;
            }
            a();
            return this.f2016c;
        }

        public final View g(int i6, int i7) {
            ArrayList<View> arrayList = this.f2014a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i7 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f1985w && RecyclerView.l.G(view2) >= i6) || ((!staggeredGridLayoutManager.f1985w && RecyclerView.l.G(view2) <= i6) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i8 = 0;
                while (i8 < size2) {
                    View view3 = arrayList.get(i8);
                    if ((staggeredGridLayoutManager.f1985w && RecyclerView.l.G(view3) <= i6) || ((!staggeredGridLayoutManager.f1985w && RecyclerView.l.G(view3) >= i6) || !view3.hasFocusable())) {
                        break;
                    }
                    i8++;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i6) {
            int i7 = this.f2015b;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            ArrayList<View> arrayList = this.f2014a;
            if (arrayList.size() == 0) {
                return i6;
            }
            View view = arrayList.get(0);
            c h6 = h(view);
            this.f2015b = StaggeredGridLayoutManager.this.f1982r.e(view);
            h6.getClass();
            return this.f2015b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f1980p = -1;
        this.f1985w = false;
        d dVar = new d();
        this.B = dVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.l.d H = RecyclerView.l.H(context, attributeSet, i6, i7);
        int i8 = H.f1920a;
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i8 != this.f1983t) {
            this.f1983t = i8;
            s sVar = this.f1982r;
            this.f1982r = this.s;
            this.s = sVar;
            n0();
        }
        int i9 = H.f1921b;
        c(null);
        if (i9 != this.f1980p) {
            int[] iArr = dVar.f1998a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            dVar.f1999b = null;
            n0();
            this.f1980p = i9;
            this.f1987y = new BitSet(this.f1980p);
            this.f1981q = new f[this.f1980p];
            for (int i10 = 0; i10 < this.f1980p; i10++) {
                this.f1981q[i10] = new f(i10);
            }
            n0();
        }
        boolean z5 = H.f1922c;
        c(null);
        e eVar = this.F;
        if (eVar != null && eVar.f2011i != z5) {
            eVar.f2011i = z5;
        }
        this.f1985w = z5;
        n0();
        this.f1984v = new n();
        this.f1982r = s.a(this, this.f1983t);
        this.s = s.a(this, 1 - this.f1983t);
    }

    public static int e1(int i6, int i7, int i8) {
        if (i7 == 0 && i8 == 0) {
            return i6;
        }
        int mode = View.MeasureSpec.getMode(i6);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i6) - i7) - i8), mode) : i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean B0() {
        return this.F == null;
    }

    public final int C0(int i6) {
        if (w() == 0) {
            return this.f1986x ? 1 : -1;
        }
        return (i6 < M0()) != this.f1986x ? -1 : 1;
    }

    public final boolean D0() {
        int M0;
        if (w() != 0 && this.C != 0 && this.f1909g) {
            if (this.f1986x) {
                M0 = N0();
                M0();
            } else {
                M0 = M0();
                N0();
            }
            if (M0 == 0 && R0() != null) {
                d dVar = this.B;
                int[] iArr = dVar.f1998a;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                dVar.f1999b = null;
                this.f1908f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int E0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        s sVar = this.f1982r;
        boolean z5 = this.I;
        return y.a(xVar, sVar, J0(!z5), I0(!z5), this, this.I);
    }

    public final int F0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        s sVar = this.f1982r;
        boolean z5 = this.I;
        return y.b(xVar, sVar, J0(!z5), I0(!z5), this, this.I, this.f1986x);
    }

    public final int G0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        s sVar = this.f1982r;
        boolean z5 = this.I;
        return y.c(xVar, sVar, J0(!z5), I0(!z5), this, this.I);
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    public final int H0(RecyclerView.s sVar, n nVar, RecyclerView.x xVar) {
        int i6;
        int k5;
        int i7;
        int O0;
        int i8;
        int i9;
        f fVar;
        ?? r8;
        int x5;
        int i10;
        int x6;
        int i11;
        int c6;
        int k6;
        int c7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        int i17 = 1;
        this.f1987y.set(0, this.f1980p, true);
        n nVar2 = this.f1984v;
        if (nVar2.f2153i) {
            if (nVar.f2149e == 1) {
                i6 = Integer.MAX_VALUE;
            } else {
                i6 = Integer.MIN_VALUE;
            }
        } else if (nVar.f2149e == 1) {
            i6 = nVar.f2151g + nVar.f2146b;
        } else {
            i6 = nVar.f2150f - nVar.f2146b;
        }
        int i18 = nVar.f2149e;
        for (int i19 = 0; i19 < this.f1980p; i19++) {
            if (!this.f1981q[i19].f2014a.isEmpty()) {
                d1(this.f1981q[i19], i18, i6);
            }
        }
        if (this.f1986x) {
            k5 = this.f1982r.g();
        } else {
            k5 = this.f1982r.k();
        }
        boolean z5 = false;
        while (true) {
            int i20 = nVar.f2147c;
            if (i20 >= 0 && i20 < xVar.b()) {
                i7 = i17;
            } else {
                i7 = i16;
            }
            if (i7 == 0 || (!nVar2.f2153i && this.f1987y.isEmpty())) {
                break;
            }
            View view = sVar.i(nVar.f2147c, Long.MAX_VALUE).f1873a;
            nVar.f2147c += nVar.f2148d;
            c cVar = (c) view.getLayoutParams();
            int a6 = cVar.a();
            d dVar = this.B;
            int[] iArr = dVar.f1998a;
            if (iArr != null && a6 < iArr.length) {
                i8 = iArr[a6];
            } else {
                i8 = -1;
            }
            if (i8 == -1) {
                i9 = i17;
            } else {
                i9 = i16;
            }
            if (i9 != 0) {
                if (U0(nVar.f2149e)) {
                    i15 = this.f1980p - i17;
                    i14 = -1;
                    i13 = -1;
                } else {
                    i13 = i17;
                    i14 = this.f1980p;
                    i15 = i16;
                }
                f fVar2 = null;
                if (nVar.f2149e == i17) {
                    int k7 = this.f1982r.k();
                    int i21 = Integer.MAX_VALUE;
                    while (i15 != i14) {
                        f fVar3 = this.f1981q[i15];
                        int f6 = fVar3.f(k7);
                        if (f6 < i21) {
                            i21 = f6;
                            fVar2 = fVar3;
                        }
                        i15 += i13;
                    }
                } else {
                    int g2 = this.f1982r.g();
                    int i22 = Integer.MIN_VALUE;
                    while (i15 != i14) {
                        f fVar4 = this.f1981q[i15];
                        int i23 = fVar4.i(g2);
                        if (i23 > i22) {
                            fVar2 = fVar4;
                            i22 = i23;
                        }
                        i15 += i13;
                    }
                }
                fVar = fVar2;
                dVar.a(a6);
                dVar.f1998a[a6] = fVar.f2018e;
            } else {
                fVar = this.f1981q[i8];
            }
            cVar.f1997e = fVar;
            if (nVar.f2149e == 1) {
                r8 = 0;
                b(view, -1, false);
            } else {
                r8 = 0;
                b(view, 0, false);
            }
            if (this.f1983t == 1) {
                x5 = RecyclerView.l.x(r8, this.u, this.f1914l, r8, ((ViewGroup.MarginLayoutParams) cVar).width);
                x6 = RecyclerView.l.x(true, this.f1917o, this.f1915m, C() + F(), ((ViewGroup.MarginLayoutParams) cVar).height);
                i10 = 0;
            } else {
                x5 = RecyclerView.l.x(true, this.f1916n, this.f1914l, E() + D(), ((ViewGroup.MarginLayoutParams) cVar).width);
                i10 = 0;
                x6 = RecyclerView.l.x(false, this.u, this.f1915m, 0, ((ViewGroup.MarginLayoutParams) cVar).height);
            }
            RecyclerView recyclerView = this.f1904b;
            Rect rect = this.G;
            if (recyclerView == null) {
                rect.set(i10, i10, i10, i10);
            } else {
                rect.set(recyclerView.K(view));
            }
            c cVar2 = (c) view.getLayoutParams();
            int e1 = e1(x5, ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar2).rightMargin + rect.right);
            int e12 = e1(x6, ((ViewGroup.MarginLayoutParams) cVar2).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin + rect.bottom);
            if (w0(view, e1, e12, cVar2)) {
                view.measure(e1, e12);
            }
            if (nVar.f2149e == 1) {
                c6 = fVar.f(k5);
                i11 = this.f1982r.c(view) + c6;
            } else {
                i11 = fVar.i(k5);
                c6 = i11 - this.f1982r.c(view);
            }
            int i24 = nVar.f2149e;
            f fVar5 = cVar.f1997e;
            fVar5.getClass();
            if (i24 == 1) {
                c cVar3 = (c) view.getLayoutParams();
                cVar3.f1997e = fVar5;
                ArrayList<View> arrayList = fVar5.f2014a;
                arrayList.add(view);
                fVar5.f2016c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    fVar5.f2015b = Integer.MIN_VALUE;
                }
                if (cVar3.c() || cVar3.b()) {
                    fVar5.f2017d = StaggeredGridLayoutManager.this.f1982r.c(view) + fVar5.f2017d;
                }
            } else {
                c cVar4 = (c) view.getLayoutParams();
                cVar4.f1997e = fVar5;
                ArrayList<View> arrayList2 = fVar5.f2014a;
                arrayList2.add(0, view);
                fVar5.f2015b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    fVar5.f2016c = Integer.MIN_VALUE;
                }
                if (cVar4.c() || cVar4.b()) {
                    fVar5.f2017d = StaggeredGridLayoutManager.this.f1982r.c(view) + fVar5.f2017d;
                }
            }
            if (S0() && this.f1983t == 1) {
                c7 = this.s.g() - (((this.f1980p - 1) - fVar.f2018e) * this.u);
                k6 = c7 - this.s.c(view);
            } else {
                k6 = this.s.k() + (fVar.f2018e * this.u);
                c7 = this.s.c(view) + k6;
            }
            if (this.f1983t == 1) {
                int i25 = k6;
                k6 = c6;
                c6 = i25;
                int i26 = c7;
                c7 = i11;
                i11 = i26;
            }
            RecyclerView.l.O(view, c6, k6, i11, c7);
            d1(fVar, nVar2.f2149e, i6);
            W0(sVar, nVar2);
            if (nVar2.f2152h && view.hasFocusable()) {
                i12 = 0;
                this.f1987y.set(fVar.f2018e, false);
            } else {
                i12 = 0;
            }
            i16 = i12;
            i17 = 1;
            z5 = true;
        }
        int i27 = i16;
        if (!z5) {
            W0(sVar, nVar2);
        }
        if (nVar2.f2149e == -1) {
            O0 = this.f1982r.k() - P0(this.f1982r.k());
        } else {
            O0 = O0(this.f1982r.g()) - this.f1982r.g();
        }
        if (O0 > 0) {
            return Math.min(nVar.f2146b, O0);
        }
        return i27;
    }

    public final View I0(boolean z5) {
        int k5 = this.f1982r.k();
        int g2 = this.f1982r.g();
        View view = null;
        for (int w5 = w() - 1; w5 >= 0; w5--) {
            View v2 = v(w5);
            int e6 = this.f1982r.e(v2);
            int b6 = this.f1982r.b(v2);
            if (b6 > k5 && e6 < g2) {
                if (b6 <= g2 || !z5) {
                    return v2;
                }
                if (view == null) {
                    view = v2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int J(RecyclerView.s sVar, RecyclerView.x xVar) {
        return this.f1983t == 0 ? this.f1980p : super.J(sVar, xVar);
    }

    public final View J0(boolean z5) {
        int k5 = this.f1982r.k();
        int g2 = this.f1982r.g();
        int w5 = w();
        View view = null;
        for (int i6 = 0; i6 < w5; i6++) {
            View v2 = v(i6);
            int e6 = this.f1982r.e(v2);
            if (this.f1982r.b(v2) > k5 && e6 < g2) {
                if (e6 >= k5 || !z5) {
                    return v2;
                }
                if (view == null) {
                    view = v2;
                }
            }
        }
        return view;
    }

    public final void K0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z5) {
        int g2;
        int O0 = O0(Integer.MIN_VALUE);
        if (O0 != Integer.MIN_VALUE && (g2 = this.f1982r.g() - O0) > 0) {
            int i6 = g2 - (-a1(-g2, sVar, xVar));
            if (!z5 || i6 <= 0) {
                return;
            }
            this.f1982r.o(i6);
        }
    }

    public final void L0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z5) {
        int k5;
        int P0 = P0(Integer.MAX_VALUE);
        if (P0 != Integer.MAX_VALUE && (k5 = P0 - this.f1982r.k()) > 0) {
            int a12 = k5 - a1(k5, sVar, xVar);
            if (!z5 || a12 <= 0) {
                return;
            }
            this.f1982r.o(-a12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean M() {
        return this.C != 0;
    }

    public final int M0() {
        if (w() == 0) {
            return 0;
        }
        return RecyclerView.l.G(v(0));
    }

    public final int N0() {
        int w5 = w();
        if (w5 == 0) {
            return 0;
        }
        return RecyclerView.l.G(v(w5 - 1));
    }

    public final int O0(int i6) {
        int f6 = this.f1981q[0].f(i6);
        for (int i7 = 1; i7 < this.f1980p; i7++) {
            int f7 = this.f1981q[i7].f(i6);
            if (f7 > f6) {
                f6 = f7;
            }
        }
        return f6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void P(int i6) {
        super.P(i6);
        for (int i7 = 0; i7 < this.f1980p; i7++) {
            f fVar = this.f1981q[i7];
            int i8 = fVar.f2015b;
            if (i8 != Integer.MIN_VALUE) {
                fVar.f2015b = i8 + i6;
            }
            int i9 = fVar.f2016c;
            if (i9 != Integer.MIN_VALUE) {
                fVar.f2016c = i9 + i6;
            }
        }
    }

    public final int P0(int i6) {
        int i7 = this.f1981q[0].i(i6);
        for (int i8 = 1; i8 < this.f1980p; i8++) {
            int i9 = this.f1981q[i8].i(i6);
            if (i9 < i7) {
                i7 = i9;
            }
        }
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Q(int i6) {
        super.Q(i6);
        for (int i7 = 0; i7 < this.f1980p; i7++) {
            f fVar = this.f1981q[i7];
            int i8 = fVar.f2015b;
            if (i8 != Integer.MIN_VALUE) {
                fVar.f2015b = i8 + i6;
            }
            int i9 = fVar.f2016c;
            if (i9 != Integer.MIN_VALUE) {
                fVar.f2016c = i9 + i6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f1986x
            if (r0 == 0) goto L9
            int r0 = r7.N0()
            goto Ld
        L9:
            int r0 = r7.M0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r7.B
            r4.b(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.d(r8, r5)
            r4.c(r9, r5)
            goto L39
        L32:
            r4.d(r8, r9)
            goto L39
        L36:
            r4.c(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.f1986x
            if (r8 == 0) goto L45
            int r8 = r7.M0()
            goto L49
        L45:
            int r8 = r7.N0()
        L49:
            if (r3 > r8) goto L4e
            r7.n0()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1904b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i6 = 0; i6 < this.f1980p; i6++) {
            this.f1981q[i6].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
        if (r10 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
        if (r10 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View R0() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0():android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004a, code lost:
        if (r8.f1983t == 1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004f, code lost:
        if (r8.f1983t == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005d, code lost:
        if (S0() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0069, code lost:
        if (S0() == false) goto L115;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.s r11, androidx.recyclerview.widget.RecyclerView.x r12) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    public final boolean S0() {
        return A() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (w() > 0) {
            View J0 = J0(false);
            View I0 = I0(false);
            if (J0 == null || I0 == null) {
                return;
            }
            int G = RecyclerView.l.G(J0);
            int G2 = RecyclerView.l.G(I0);
            if (G < G2) {
                accessibilityEvent.setFromIndex(G);
                accessibilityEvent.setToIndex(G2);
                return;
            }
            accessibilityEvent.setFromIndex(G2);
            accessibilityEvent.setToIndex(G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x03f1, code lost:
        if (D0() != false) goto L267;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T0(androidx.recyclerview.widget.RecyclerView.s r17, androidx.recyclerview.widget.RecyclerView.x r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    public final boolean U0(int i6) {
        if (this.f1983t == 0) {
            return (i6 == -1) != this.f1986x;
        }
        return ((i6 == -1) == this.f1986x) == S0();
    }

    public final void V0(int i6, RecyclerView.x xVar) {
        int M0;
        int i7;
        if (i6 > 0) {
            M0 = N0();
            i7 = 1;
        } else {
            M0 = M0();
            i7 = -1;
        }
        n nVar = this.f1984v;
        nVar.f2145a = true;
        c1(M0, xVar);
        b1(i7);
        nVar.f2147c = M0 + nVar.f2148d;
        nVar.f2146b = Math.abs(i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void W(RecyclerView.s sVar, RecyclerView.x xVar, View view, g0.f fVar) {
        int i6;
        int i7;
        int i8;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            V(view, fVar);
            return;
        }
        c cVar = (c) layoutParams;
        int i9 = 1;
        int i10 = -1;
        if (this.f1983t == 0) {
            f fVar2 = cVar.f1997e;
            if (fVar2 == null) {
                i8 = -1;
            } else {
                i8 = fVar2.f2018e;
            }
            i7 = -1;
        } else {
            f fVar3 = cVar.f1997e;
            if (fVar3 == null) {
                i6 = -1;
            } else {
                i6 = fVar3.f2018e;
            }
            i7 = i6;
            i8 = -1;
            i10 = 1;
            i9 = -1;
        }
        fVar.g(f.c.a(i8, i9, i7, i10, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r6.f2149e == (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W0(androidx.recyclerview.widget.RecyclerView.s r5, androidx.recyclerview.widget.n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f2145a
            if (r0 == 0) goto L7c
            boolean r0 = r6.f2153i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f2146b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f2149e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f2151g
        L15:
            r4.X0(r6, r5)
            goto L7c
        L19:
            int r6 = r6.f2150f
        L1b:
            r4.Y0(r6, r5)
            goto L7c
        L1f:
            int r0 = r6.f2149e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f2150f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1981q
            r1 = r1[r2]
            int r1 = r1.i(r0)
        L2f:
            int r2 = r4.f1980p
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1981q
            r2 = r2[r3]
            int r2 = r2.i(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f2151g
            int r6 = r6.f2146b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f2151g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1981q
            r1 = r1[r2]
            int r1 = r1.f(r0)
        L5a:
            int r2 = r4.f1980p
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1981q
            r2 = r2[r3]
            int r2 = r2.f(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f2151g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f2150f
            int r6 = r6.f2146b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.n):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void X(int i6, int i7) {
        Q0(i6, i7, 1);
    }

    public final void X0(int i6, RecyclerView.s sVar) {
        for (int w5 = w() - 1; w5 >= 0; w5--) {
            View v2 = v(w5);
            if (this.f1982r.e(v2) >= i6 && this.f1982r.n(v2) >= i6) {
                c cVar = (c) v2.getLayoutParams();
                cVar.getClass();
                if (cVar.f1997e.f2014a.size() == 1) {
                    return;
                }
                f fVar = cVar.f1997e;
                ArrayList<View> arrayList = fVar.f2014a;
                int size = arrayList.size();
                View remove = arrayList.remove(size - 1);
                c h6 = f.h(remove);
                h6.f1997e = null;
                if (h6.c() || h6.b()) {
                    fVar.f2017d -= StaggeredGridLayoutManager.this.f1982r.c(remove);
                }
                if (size == 1) {
                    fVar.f2015b = Integer.MIN_VALUE;
                }
                fVar.f2016c = Integer.MIN_VALUE;
                k0(v2, sVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Y() {
        d dVar = this.B;
        int[] iArr = dVar.f1998a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        dVar.f1999b = null;
        n0();
    }

    public final void Y0(int i6, RecyclerView.s sVar) {
        while (w() > 0) {
            View v2 = v(0);
            if (this.f1982r.b(v2) <= i6 && this.f1982r.m(v2) <= i6) {
                c cVar = (c) v2.getLayoutParams();
                cVar.getClass();
                if (cVar.f1997e.f2014a.size() == 1) {
                    return;
                }
                f fVar = cVar.f1997e;
                ArrayList<View> arrayList = fVar.f2014a;
                View remove = arrayList.remove(0);
                c h6 = f.h(remove);
                h6.f1997e = null;
                if (arrayList.size() == 0) {
                    fVar.f2016c = Integer.MIN_VALUE;
                }
                if (h6.c() || h6.b()) {
                    fVar.f2017d -= StaggeredGridLayoutManager.this.f1982r.c(remove);
                }
                fVar.f2015b = Integer.MIN_VALUE;
                k0(v2, sVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Z(int i6, int i7) {
        Q0(i6, i7, 8);
    }

    public final void Z0() {
        this.f1986x = (this.f1983t == 1 || !S0()) ? this.f1985w : !this.f1985w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i6) {
        int C0 = C0(i6);
        PointF pointF = new PointF();
        if (C0 == 0) {
            return null;
        }
        if (this.f1983t == 0) {
            pointF.x = C0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = C0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void a0(int i6, int i7) {
        Q0(i6, i7, 2);
    }

    public final int a1(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (w() == 0 || i6 == 0) {
            return 0;
        }
        V0(i6, xVar);
        n nVar = this.f1984v;
        int H0 = H0(sVar, nVar, xVar);
        if (nVar.f2146b >= H0) {
            i6 = i6 < 0 ? -H0 : H0;
        }
        this.f1982r.o(-i6);
        this.D = this.f1986x;
        nVar.f2146b = 0;
        W0(sVar, nVar);
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void b0(int i6, int i7) {
        Q0(i6, i7, 4);
    }

    public final void b1(int i6) {
        n nVar = this.f1984v;
        nVar.f2149e = i6;
        nVar.f2148d = this.f1986x != (i6 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c0(RecyclerView.s sVar, RecyclerView.x xVar) {
        T0(sVar, xVar, true);
    }

    public final void c1(int i6, RecyclerView.x xVar) {
        boolean z5;
        int i7;
        int i8;
        boolean z6;
        int i9;
        boolean z7;
        n nVar = this.f1984v;
        boolean z8 = false;
        nVar.f2146b = 0;
        nVar.f2147c = i6;
        RecyclerView.w wVar = this.f1907e;
        if (wVar != null && wVar.f1948e) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && (i9 = xVar.f1959a) != -1) {
            boolean z9 = this.f1986x;
            if (i9 < i6) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z9 == z7) {
                i7 = this.f1982r.l();
                i8 = 0;
            } else {
                i8 = this.f1982r.l();
                i7 = 0;
            }
        } else {
            i7 = 0;
            i8 = 0;
        }
        RecyclerView recyclerView = this.f1904b;
        if (recyclerView != null && recyclerView.f1843h) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            nVar.f2150f = this.f1982r.k() - i8;
            nVar.f2151g = this.f1982r.g() + i7;
        } else {
            nVar.f2151g = this.f1982r.f() + i7;
            nVar.f2150f = -i8;
        }
        nVar.f2152h = false;
        nVar.f2145a = true;
        if (this.f1982r.i() == 0 && this.f1982r.f() == 0) {
            z8 = true;
        }
        nVar.f2153i = z8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean d() {
        return this.f1983t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d0(RecyclerView.x xVar) {
        this.f1988z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void d1(f fVar, int i6, int i7) {
        int i8 = fVar.f2017d;
        if (i6 == -1) {
            int i9 = fVar.f2015b;
            if (i9 == Integer.MIN_VALUE) {
                View view = fVar.f2014a.get(0);
                c h6 = f.h(view);
                fVar.f2015b = StaggeredGridLayoutManager.this.f1982r.e(view);
                h6.getClass();
                i9 = fVar.f2015b;
            }
            if (i9 + i8 > i7) {
                return;
            }
        } else {
            int i10 = fVar.f2016c;
            if (i10 == Integer.MIN_VALUE) {
                fVar.a();
                i10 = fVar.f2016c;
            }
            if (i10 - i8 < i7) {
                return;
            }
        }
        this.f1987y.set(fVar.f2018e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean e() {
        return this.f1983t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.F = (e) parcelable;
            n0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f(RecyclerView.m mVar) {
        return mVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final Parcelable f0() {
        int M0;
        View J0;
        int i6;
        int k5;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f2011i = this.f1985w;
        eVar2.f2012j = this.D;
        eVar2.f2013k = this.E;
        d dVar = this.B;
        if (dVar != null && (iArr = dVar.f1998a) != null) {
            eVar2.f2009g = iArr;
            eVar2.f2008f = iArr.length;
            eVar2.f2010h = dVar.f1999b;
        } else {
            eVar2.f2008f = 0;
        }
        int i7 = -1;
        if (w() > 0) {
            if (this.D) {
                M0 = N0();
            } else {
                M0 = M0();
            }
            eVar2.f2004b = M0;
            if (this.f1986x) {
                J0 = I0(true);
            } else {
                J0 = J0(true);
            }
            if (J0 != null) {
                i7 = RecyclerView.l.G(J0);
            }
            eVar2.f2005c = i7;
            int i8 = this.f1980p;
            eVar2.f2006d = i8;
            eVar2.f2007e = new int[i8];
            for (int i9 = 0; i9 < this.f1980p; i9++) {
                if (this.D) {
                    i6 = this.f1981q[i9].f(Integer.MIN_VALUE);
                    if (i6 != Integer.MIN_VALUE) {
                        k5 = this.f1982r.g();
                        i6 -= k5;
                        eVar2.f2007e[i9] = i6;
                    } else {
                        eVar2.f2007e[i9] = i6;
                    }
                } else {
                    i6 = this.f1981q[i9].i(Integer.MIN_VALUE);
                    if (i6 != Integer.MIN_VALUE) {
                        k5 = this.f1982r.k();
                        i6 -= k5;
                        eVar2.f2007e[i9] = i6;
                    } else {
                        eVar2.f2007e[i9] = i6;
                    }
                }
            }
        } else {
            eVar2.f2004b = -1;
            eVar2.f2005c = -1;
            eVar2.f2006d = 0;
        }
        return eVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g0(int i6) {
        if (i6 == 0) {
            D0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h(int i6, int i7, RecyclerView.x xVar, RecyclerView.l.c cVar) {
        n nVar;
        boolean z5;
        int f6;
        int i8;
        if (this.f1983t != 0) {
            i6 = i7;
        }
        if (w() != 0 && i6 != 0) {
            V0(i6, xVar);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f1980p) {
                this.J = new int[this.f1980p];
            }
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = this.f1980p;
                nVar = this.f1984v;
                if (i9 >= i11) {
                    break;
                }
                if (nVar.f2148d == -1) {
                    f6 = nVar.f2150f;
                    i8 = this.f1981q[i9].i(f6);
                } else {
                    f6 = this.f1981q[i9].f(nVar.f2151g);
                    i8 = nVar.f2151g;
                }
                int i12 = f6 - i8;
                if (i12 >= 0) {
                    this.J[i10] = i12;
                    i10++;
                }
                i9++;
            }
            Arrays.sort(this.J, 0, i10);
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = nVar.f2147c;
                if (i14 >= 0 && i14 < xVar.b()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    ((m.b) cVar).a(nVar.f2147c, this.J[i13]);
                    nVar.f2147c += nVar.f2148d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int j(RecyclerView.x xVar) {
        return E0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int k(RecyclerView.x xVar) {
        return F0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int l(RecyclerView.x xVar) {
        return G0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int m(RecyclerView.x xVar) {
        return E0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int n(RecyclerView.x xVar) {
        return F0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o(RecyclerView.x xVar) {
        return G0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        return a1(i6, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void p0(int i6) {
        e eVar = this.F;
        if (eVar != null && eVar.f2004b != i6) {
            eVar.f2007e = null;
            eVar.f2006d = 0;
            eVar.f2004b = -1;
            eVar.f2005c = -1;
        }
        this.f1988z = i6;
        this.A = Integer.MIN_VALUE;
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int q0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        return a1(i6, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m r() {
        return this.f1983t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m s(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void t0(Rect rect, int i6, int i7) {
        int g2;
        int g6;
        int E = E() + D();
        int C = C() + F();
        if (this.f1983t == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f1904b;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g6 = RecyclerView.l.g(i7, height, g0.d.d(recyclerView));
            g2 = RecyclerView.l.g(i6, (this.u * this.f1980p) + E, g0.d.e(this.f1904b));
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f1904b;
            WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
            g2 = RecyclerView.l.g(i6, width, g0.d.e(recyclerView2));
            g6 = RecyclerView.l.g(i7, (this.u * this.f1980p) + C, g0.d.d(this.f1904b));
        }
        this.f1904b.setMeasuredDimension(g2, g6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int y(RecyclerView.s sVar, RecyclerView.x xVar) {
        return this.f1983t == 1 ? this.f1980p : super.y(sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void z0(RecyclerView recyclerView, int i6) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1944a = i6;
        A0(oVar);
    }
}
