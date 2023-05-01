package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import b0.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<m> f2130f = new ThreadLocal<>();

    /* renamed from: g  reason: collision with root package name */
    public static final a f2131g = new a();

    /* renamed from: c  reason: collision with root package name */
    public long f2133c;

    /* renamed from: d  reason: collision with root package name */
    public long f2134d;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<RecyclerView> f2132b = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<c> f2135e = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
            if (r0 != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(androidx.recyclerview.widget.m.c r7, androidx.recyclerview.widget.m.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.m.c) r7
                androidx.recyclerview.widget.m$c r8 = (androidx.recyclerview.widget.m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2143d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2143d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f2140a
                boolean r3 = r8.f2140a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f2141b
                int r2 = r7.f2141b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f2142c
                int r8 = r8.f2142c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.l.c {

        /* renamed from: a  reason: collision with root package name */
        public int f2136a;

        /* renamed from: b  reason: collision with root package name */
        public int f2137b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f2138c;

        /* renamed from: d  reason: collision with root package name */
        public int f2139d;

        public final void a(int i6, int i7) {
            if (i6 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i7 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i8 = this.f2139d * 2;
            int[] iArr = this.f2138c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2138c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i8 >= iArr.length) {
                int[] iArr3 = new int[i8 * 2];
                this.f2138c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2138c;
            iArr4[i8] = i6;
            iArr4[i8 + 1] = i7;
            this.f2139d++;
        }

        public final void b(RecyclerView recyclerView, boolean z5) {
            boolean z6 = false;
            this.f2139d = 0;
            int[] iArr = this.f2138c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.l lVar = recyclerView.f1853m;
            if (recyclerView.f1851l != null && lVar != null && lVar.f1911i) {
                if (z5) {
                    if (!recyclerView.f1837e.g()) {
                        lVar.i(recyclerView.f1851l.c(), this);
                    }
                } else {
                    if (!((!recyclerView.s || recyclerView.A || recyclerView.f1837e.g()) ? true : true)) {
                        lVar.h(this.f2136a, this.f2137b, recyclerView.f1838e0, this);
                    }
                }
                int i6 = this.f2139d;
                if (i6 > lVar.f1912j) {
                    lVar.f1912j = i6;
                    lVar.f1913k = z5;
                    recyclerView.f1833c.k();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2140a;

        /* renamed from: b  reason: collision with root package name */
        public int f2141b;

        /* renamed from: c  reason: collision with root package name */
        public int f2142c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f2143d;

        /* renamed from: e  reason: collision with root package name */
        public int f2144e;
    }

    public static RecyclerView.a0 c(RecyclerView recyclerView, int i6, long j5) {
        boolean z5;
        int h6 = recyclerView.f1839f.h();
        int i7 = 0;
        while (true) {
            if (i7 < h6) {
                RecyclerView.a0 J = RecyclerView.J(recyclerView.f1839f.g(i7));
                if (J.f1875c == i6 && !J.g()) {
                    z5 = true;
                    break;
                }
                i7++;
            } else {
                z5 = false;
                break;
            }
        }
        if (z5) {
            return null;
        }
        RecyclerView.s sVar = recyclerView.f1833c;
        try {
            recyclerView.P();
            RecyclerView.a0 i8 = sVar.i(i6, j5);
            if (i8 != null) {
                if (i8.f() && !i8.g()) {
                    sVar.f(i8.f1873a);
                } else {
                    sVar.a(i8, false);
                }
            }
            return i8;
        } finally {
            recyclerView.Q(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i6, int i7) {
        if (recyclerView.isAttachedToWindow() && this.f2133c == 0) {
            this.f2133c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f1836d0;
        bVar.f2136a = i6;
        bVar.f2137b = i7;
    }

    public final void b(long j5) {
        c cVar;
        RecyclerView recyclerView;
        long j6;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z5;
        ArrayList<RecyclerView> arrayList = this.f2132b;
        int size = arrayList.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView3 = arrayList.get(i7);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.f1836d0;
                bVar.b(recyclerView3, false);
                i6 += bVar.f2139d;
            }
        }
        ArrayList<c> arrayList2 = this.f2135e;
        arrayList2.ensureCapacity(i6);
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView4 = arrayList.get(i9);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f1836d0;
                int abs = Math.abs(bVar2.f2137b) + Math.abs(bVar2.f2136a);
                for (int i10 = 0; i10 < bVar2.f2139d * 2; i10 += 2) {
                    if (i8 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i8);
                    }
                    int[] iArr = bVar2.f2138c;
                    int i11 = iArr[i10 + 1];
                    if (i11 <= abs) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    cVar2.f2140a = z5;
                    cVar2.f2141b = abs;
                    cVar2.f2142c = i11;
                    cVar2.f2143d = recyclerView4;
                    cVar2.f2144e = iArr[i10];
                    i8++;
                }
            }
        }
        Collections.sort(arrayList2, f2131g);
        for (int i12 = 0; i12 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i12)).f2143d) != null; i12++) {
            if (cVar.f2140a) {
                j6 = Long.MAX_VALUE;
            } else {
                j6 = j5;
            }
            RecyclerView.a0 c6 = c(recyclerView, cVar.f2144e, j6);
            if (c6 != null && c6.f1874b != null && c6.f() && !c6.g() && (recyclerView2 = c6.f1874b.get()) != null) {
                if (recyclerView2.A && recyclerView2.f1839f.h() != 0) {
                    RecyclerView.i iVar = recyclerView2.J;
                    if (iVar != null) {
                        iVar.e();
                    }
                    RecyclerView.l lVar = recyclerView2.f1853m;
                    RecyclerView.s sVar = recyclerView2.f1833c;
                    if (lVar != null) {
                        lVar.i0(sVar);
                        recyclerView2.f1853m.j0(sVar);
                    }
                    sVar.f1934a.clear();
                    sVar.d();
                }
                b bVar3 = recyclerView2.f1836d0;
                bVar3.b(recyclerView2, true);
                if (bVar3.f2139d != 0) {
                    try {
                        int i13 = b0.h.f2267a;
                        h.a.a("RV Nested Prefetch");
                        RecyclerView.x xVar = recyclerView2.f1838e0;
                        RecyclerView.d dVar = recyclerView2.f1851l;
                        xVar.f1962d = 1;
                        xVar.f1963e = dVar.c();
                        xVar.f1965g = false;
                        xVar.f1966h = false;
                        xVar.f1967i = false;
                        for (int i14 = 0; i14 < bVar3.f2139d * 2; i14 += 2) {
                            c(recyclerView2, bVar3.f2138c[i14], j5);
                        }
                        h.a.b();
                        cVar.f2140a = false;
                        cVar.f2141b = 0;
                        cVar.f2142c = 0;
                        cVar.f2143d = null;
                        cVar.f2144e = 0;
                    } catch (Throwable th) {
                        int i15 = b0.h.f2267a;
                        h.a.b();
                        throw th;
                    }
                }
            }
            cVar.f2140a = false;
            cVar.f2141b = 0;
            cVar.f2142c = 0;
            cVar.f2143d = null;
            cVar.f2144e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i6 = b0.h.f2267a;
            h.a.a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f2132b;
            if (arrayList.isEmpty()) {
                this.f2133c = 0L;
                h.a.b();
                return;
            }
            int size = arrayList.size();
            long j5 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                RecyclerView recyclerView = arrayList.get(i7);
                if (recyclerView.getWindowVisibility() == 0) {
                    j5 = Math.max(recyclerView.getDrawingTime(), j5);
                }
            }
            if (j5 == 0) {
                this.f2133c = 0L;
                h.a.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j5) + this.f2134d);
            this.f2133c = 0L;
            h.a.b();
        } catch (Throwable th) {
            this.f2133c = 0L;
            int i8 = b0.h.f2267a;
            h.a.b();
            throw th;
        }
    }
}
