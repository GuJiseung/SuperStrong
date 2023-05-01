package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
/* loaded from: classes.dex */
public final class c extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public ViewPager2.e f2241a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f2242b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f2243c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayoutManager f2244d;

    /* renamed from: e  reason: collision with root package name */
    public int f2245e;

    /* renamed from: f  reason: collision with root package name */
    public int f2246f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2247g;

    /* renamed from: h  reason: collision with root package name */
    public int f2248h;

    /* renamed from: i  reason: collision with root package name */
    public int f2249i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2250j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2251k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2252l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2253m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2254a;

        /* renamed from: b  reason: collision with root package name */
        public float f2255b;

        /* renamed from: c  reason: collision with root package name */
        public int f2256c;
    }

    public c(ViewPager2 viewPager2) {
        this.f2242b = viewPager2;
        ViewPager2.i iVar = viewPager2.f2217k;
        this.f2243c = iVar;
        this.f2244d = (LinearLayoutManager) iVar.getLayoutManager();
        this.f2247g = new a();
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(int i6, RecyclerView recyclerView) {
        boolean z5;
        boolean z6;
        ViewPager2.e eVar;
        int i7 = this.f2245e;
        boolean z7 = true;
        if ((i7 != 1 || this.f2246f != 1) && i6 == 1) {
            this.f2253m = false;
            this.f2245e = 1;
            int i8 = this.f2249i;
            if (i8 != -1) {
                this.f2248h = i8;
                this.f2249i = -1;
            } else if (this.f2248h == -1) {
                this.f2248h = this.f2244d.M0();
            }
            d(1);
            return;
        }
        if (i7 != 1 && i7 != 4) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5 && i6 == 2) {
            if (this.f2251k) {
                d(2);
                this.f2250j = true;
                return;
            }
            return;
        }
        if (i7 != 1 && i7 != 4) {
            z6 = false;
        } else {
            z6 = true;
        }
        a aVar = this.f2247g;
        if (z6 && i6 == 0) {
            f();
            if (!this.f2251k) {
                int i9 = aVar.f2254a;
                if (i9 != -1 && (eVar = this.f2241a) != null) {
                    eVar.b(0.0f, i9, 0);
                }
            } else if (aVar.f2256c == 0) {
                int i10 = this.f2248h;
                int i11 = aVar.f2254a;
                if (i10 != i11) {
                    c(i11);
                }
            } else {
                z7 = false;
            }
            if (z7) {
                d(0);
                e();
            }
        }
        if (this.f2245e == 2 && i6 == 0 && this.f2252l) {
            f();
            if (aVar.f2256c == 0) {
                int i12 = this.f2249i;
                int i13 = aVar.f2254a;
                if (i12 != i13) {
                    if (i13 == -1) {
                        i13 = 0;
                    }
                    c(i13);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r7 == r8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r5.f2248h == r7) goto L21;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f2251k = r6
            r5.f()
            boolean r0 = r5.f2250j
            r1 = -1
            androidx.viewpager2.widget.c$a r2 = r5.f2247g
            r3 = 0
            if (r0 == 0) goto L3f
            r5.f2250j = r3
            if (r8 > 0) goto L2b
            if (r8 != 0) goto L29
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f2242b
            androidx.viewpager2.widget.ViewPager2$d r8 = r8.f2214h
            int r8 = r8.A()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L29
            goto L2b
        L29:
            r7 = r3
            goto L2c
        L2b:
            r7 = r6
        L2c:
            if (r7 == 0) goto L36
            int r7 = r2.f2256c
            if (r7 == 0) goto L36
            int r7 = r2.f2254a
            int r7 = r7 + r6
            goto L38
        L36:
            int r7 = r2.f2254a
        L38:
            r5.f2249i = r7
            int r8 = r5.f2248h
            if (r8 == r7) goto L4b
            goto L48
        L3f:
            int r7 = r5.f2245e
            if (r7 != 0) goto L4b
            int r7 = r2.f2254a
            if (r7 != r1) goto L48
            r7 = r3
        L48:
            r5.c(r7)
        L4b:
            int r7 = r2.f2254a
            if (r7 != r1) goto L50
            r7 = r3
        L50:
            float r8 = r2.f2255b
            int r0 = r2.f2256c
            androidx.viewpager2.widget.ViewPager2$e r4 = r5.f2241a
            if (r4 == 0) goto L5b
            r4.b(r8, r7, r0)
        L5b:
            int r7 = r2.f2254a
            int r8 = r5.f2249i
            if (r7 == r8) goto L63
            if (r8 != r1) goto L71
        L63:
            int r7 = r2.f2256c
            if (r7 != 0) goto L71
            int r7 = r5.f2246f
            if (r7 == r6) goto L71
            r5.d(r3)
            r5.e()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i6) {
        ViewPager2.e eVar = this.f2241a;
        if (eVar != null) {
            eVar.c(i6);
        }
    }

    public final void d(int i6) {
        if ((this.f2245e == 3 && this.f2246f == 0) || this.f2246f == i6) {
            return;
        }
        this.f2246f = i6;
        ViewPager2.e eVar = this.f2241a;
        if (eVar != null) {
            eVar.a(i6);
        }
    }

    public final void e() {
        this.f2245e = 0;
        this.f2246f = 0;
        a aVar = this.f2247g;
        aVar.f2254a = -1;
        aVar.f2255b = 0.0f;
        aVar.f2256c = 0;
        this.f2248h = -1;
        this.f2249i = -1;
        this.f2250j = false;
        this.f2251k = false;
        this.f2253m = false;
        this.f2252l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011e, code lost:
        if (r5[r1 - 1][1] >= r6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0123, code lost:
        r1 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.f():void");
    }
}
