package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import f0.g0;
import f0.r0;
import g0.f;
import java.util.Arrays;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final a K;
    public final Rect L;

    /* loaded from: classes.dex */
    public static final class a extends c {
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.m {

        /* renamed from: e  reason: collision with root package name */
        public int f1791e;

        /* renamed from: f  reason: collision with root package name */
        public int f1792f;

        public b(int i6, int i7) {
            super(i6, i7);
            this.f1791e = -1;
            this.f1792f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1791e = -1;
            this.f1792f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1791e = -1;
            this.f1792f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1791e = -1;
            this.f1792f = 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f1793a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f1794b = new SparseIntArray();

        public static int a(int i6, int i7) {
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i8++;
                if (i8 == i7) {
                    i9++;
                    i8 = 0;
                } else if (i8 > i7) {
                    i9++;
                    i8 = 1;
                }
            }
            return i8 + 1 > i7 ? i9 + 1 : i9;
        }

        public final void b() {
            this.f1793a.clear();
        }
    }

    public GridLayoutManager(int i6) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        n1(i6);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        n1(RecyclerView.l.H(context, attributeSet, i6, i7).f1921b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final boolean B0() {
        return this.f1803z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(RecyclerView.x xVar, LinearLayoutManager.c cVar, RecyclerView.l.c cVar2) {
        boolean z5;
        int i6 = this.F;
        for (int i7 = 0; i7 < this.F; i7++) {
            int i8 = cVar.f1816d;
            if (i8 >= 0 && i8 < xVar.b()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && i6 > 0) {
                ((m.b) cVar2).a(cVar.f1816d, Math.max(0, cVar.f1819g));
                this.K.getClass();
                i6--;
                cVar.f1816d += cVar.f1817e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int J(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1795p == 0) {
            return this.F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return j1(xVar.b() - 1, sVar, xVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Q0(RecyclerView.s sVar, RecyclerView.x xVar, int i6, int i7, int i8) {
        I0();
        int k5 = this.f1797r.k();
        int g2 = this.f1797r.g();
        int i9 = i7 > i6 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i6 != i7) {
            View v2 = v(i6);
            int G = RecyclerView.l.G(v2);
            if (G >= 0 && G < i8 && k1(G, sVar, xVar) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
        if (r13 == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010f, code lost:
        if (r13 == r5) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.s r25, androidx.recyclerview.widget.RecyclerView.x r26) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void W(RecyclerView.s sVar, RecyclerView.x xVar, View view, g0.f fVar) {
        int i6;
        int i7;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            V(view, fVar);
            return;
        }
        b bVar = (b) layoutParams;
        int j12 = j1(bVar.a(), sVar, xVar);
        int i8 = 1;
        if (this.f1795p == 0) {
            int i9 = bVar.f1791e;
            int i10 = bVar.f1792f;
            i6 = j12;
            j12 = i9;
            i7 = 1;
            i8 = i10;
        } else {
            i6 = bVar.f1791e;
            i7 = bVar.f1792f;
        }
        fVar.g(f.c.a(j12, i8, i6, i7, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v42 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int x5;
        int i17;
        ?? r12;
        boolean z7;
        View b6;
        int j5 = this.f1797r.j();
        if (j5 != 1073741824) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (w() > 0) {
            i6 = this.G[this.F];
        } else {
            i6 = 0;
        }
        if (z5) {
            o1();
        }
        if (cVar.f1817e == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i18 = this.F;
        if (!z6) {
            i18 = k1(cVar.f1816d, sVar, xVar) + l1(cVar.f1816d, sVar, xVar);
        }
        int i19 = 0;
        while (i19 < this.F) {
            int i20 = cVar.f1816d;
            if (i20 >= 0 && i20 < xVar.b()) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7 || i18 <= 0) {
                break;
            }
            int i21 = cVar.f1816d;
            int l12 = l1(i21, sVar, xVar);
            if (l12 <= this.F) {
                i18 -= l12;
                if (i18 < 0 || (b6 = cVar.b(sVar)) == null) {
                    break;
                }
                this.H[i19] = b6;
                i19++;
            } else {
                throw new IllegalArgumentException("Item at position " + i21 + " requires " + l12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
        }
        if (i19 == 0) {
            bVar.f1810b = true;
            return;
        }
        if (z6) {
            i9 = 1;
            i8 = i19;
            i7 = 0;
        } else {
            i7 = i19 - 1;
            i8 = -1;
            i9 = -1;
        }
        int i22 = 0;
        while (i7 != i8) {
            View view = this.H[i7];
            b bVar2 = (b) view.getLayoutParams();
            int l13 = l1(RecyclerView.l.G(view), sVar, xVar);
            bVar2.f1792f = l13;
            bVar2.f1791e = i22;
            i22 += l13;
            i7 += i9;
        }
        float f6 = 0.0f;
        int i23 = 0;
        for (int i24 = 0; i24 < i19; i24++) {
            View view2 = this.H[i24];
            if (cVar.f1823k == null) {
                if (z6) {
                    r12 = 0;
                    b(view2, -1, false);
                } else {
                    r12 = 0;
                    b(view2, 0, false);
                }
            } else {
                r12 = 0;
                r12 = 0;
                if (z6) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            }
            RecyclerView recyclerView = this.f1904b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.K(view2));
            }
            m1(view2, j5, r12);
            int c6 = this.f1797r.c(view2);
            if (c6 > i23) {
                i23 = c6;
            }
            float d6 = (this.f1797r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f1792f;
            if (d6 > f6) {
                f6 = d6;
            }
        }
        if (z5) {
            h1(Math.max(Math.round(f6 * this.F), i6));
            i23 = 0;
            for (int i25 = 0; i25 < i19; i25++) {
                View view3 = this.H[i25];
                m1(view3, 1073741824, true);
                int c7 = this.f1797r.c(view3);
                if (c7 > i23) {
                    i23 = c7;
                }
            }
        }
        for (int i26 = 0; i26 < i19; i26++) {
            View view4 = this.H[i26];
            if (this.f1797r.c(view4) != i23) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect2 = bVar3.f1925b;
                int i27 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i28 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int i110 = i1(bVar3.f1791e, bVar3.f1792f);
                if (this.f1795p == 1) {
                    i17 = RecyclerView.l.x(false, i110, 1073741824, i28, ((ViewGroup.MarginLayoutParams) bVar3).width);
                    x5 = View.MeasureSpec.makeMeasureSpec(i23 - i27, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - i28, 1073741824);
                    x5 = RecyclerView.l.x(false, i110, 1073741824, i27, ((ViewGroup.MarginLayoutParams) bVar3).height);
                    i17 = makeMeasureSpec;
                }
                if (y0(view4, i17, x5, (RecyclerView.m) view4.getLayoutParams())) {
                    view4.measure(i17, x5);
                }
            }
        }
        bVar.f1809a = i23;
        if (this.f1795p == 1) {
            if (cVar.f1818f == -1) {
                i16 = cVar.f1814b;
                i15 = i16 - i23;
            } else {
                int i29 = cVar.f1814b;
                i15 = i29;
                i16 = i23 + i29;
            }
            i13 = 0;
            i12 = i15;
            i14 = i16;
            i11 = 0;
        } else {
            if (cVar.f1818f == -1) {
                i11 = cVar.f1814b;
                i10 = i11 - i23;
            } else {
                int i30 = cVar.f1814b;
                i10 = i30;
                i11 = i23 + i30;
            }
            i12 = 0;
            i13 = i10;
            i14 = 0;
        }
        for (int i31 = 0; i31 < i19; i31++) {
            View view5 = this.H[i31];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f1795p == 1) {
                if (V0()) {
                    i11 = D() + this.G[this.F - bVar4.f1791e];
                    i13 = i11 - this.f1797r.d(view5);
                } else {
                    int D = D() + this.G[bVar4.f1791e];
                    i13 = D;
                    i11 = this.f1797r.d(view5) + D;
                }
            } else {
                i12 = F() + this.G[bVar4.f1791e];
                i14 = this.f1797r.d(view5) + i12;
            }
            RecyclerView.l.O(view5, i13, i12, i11, i14);
            if (bVar4.c() || bVar4.b()) {
                bVar.f1811c = true;
            }
            bVar.f1812d = view5.hasFocusable() | bVar.f1812d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void X(int i6, int i7) {
        a aVar = this.K;
        aVar.b();
        aVar.f1794b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i6) {
        boolean z5;
        o1();
        if (xVar.b() > 0 && !xVar.f1965g) {
            if (i6 == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            int k12 = k1(aVar.f1805b, sVar, xVar);
            if (z5) {
                while (k12 > 0) {
                    int i7 = aVar.f1805b;
                    if (i7 <= 0) {
                        break;
                    }
                    int i8 = i7 - 1;
                    aVar.f1805b = i8;
                    k12 = k1(i8, sVar, xVar);
                }
            } else {
                int b6 = xVar.b() - 1;
                int i9 = aVar.f1805b;
                while (i9 < b6) {
                    int i10 = i9 + 1;
                    int k13 = k1(i10, sVar, xVar);
                    if (k13 <= k12) {
                        break;
                    }
                    i9 = i10;
                    k12 = k13;
                }
                aVar.f1805b = i9;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Y() {
        a aVar = this.K;
        aVar.b();
        aVar.f1794b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Z(int i6, int i7) {
        a aVar = this.K;
        aVar.b();
        aVar.f1794b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void a0(int i6, int i7) {
        a aVar = this.K;
        aVar.b();
        aVar.f1794b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void b0(int i6, int i7) {
        a aVar = this.K;
        aVar.b();
        aVar.f1794b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void c0(RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z5 = xVar.f1965g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z5) {
            int w5 = w();
            for (int i6 = 0; i6 < w5; i6++) {
                b bVar = (b) v(i6).getLayoutParams();
                int a6 = bVar.a();
                sparseIntArray2.put(a6, bVar.f1792f);
                sparseIntArray.put(a6, bVar.f1791e);
            }
        }
        super.c0(sVar, xVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void d0(RecyclerView.x xVar) {
        super.d0(xVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean z5) {
        if (z5) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.d1(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f(RecyclerView.m mVar) {
        return mVar instanceof b;
    }

    public final void h1(int i6) {
        int i7;
        int[] iArr = this.G;
        int i8 = this.F;
        if (iArr == null || iArr.length != i8 + 1 || iArr[iArr.length - 1] != i6) {
            iArr = new int[i8 + 1];
        }
        int i9 = 0;
        iArr[0] = 0;
        int i10 = i6 / i8;
        int i11 = i6 % i8;
        int i12 = 0;
        for (int i13 = 1; i13 <= i8; i13++) {
            i9 += i11;
            if (i9 > 0 && i8 - i9 < i11) {
                i7 = i10 + 1;
                i9 -= i8;
            } else {
                i7 = i10;
            }
            i12 += i7;
            iArr[i13] = i12;
        }
        this.G = iArr;
    }

    public final int i1(int i6, int i7) {
        if (this.f1795p != 1 || !V0()) {
            int[] iArr = this.G;
            return iArr[i7 + i6] - iArr[i6];
        }
        int[] iArr2 = this.G;
        int i8 = this.F;
        return iArr2[i8 - i6] - iArr2[(i8 - i6) - i7];
    }

    public final int j1(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z5 = xVar.f1965g;
        a aVar = this.K;
        if (!z5) {
            int i7 = this.F;
            aVar.getClass();
            return c.a(i6, i7);
        }
        int b6 = sVar.b(i6);
        if (b6 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i6);
            return 0;
        }
        int i8 = this.F;
        aVar.getClass();
        return c.a(b6, i8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int k(RecyclerView.x xVar) {
        return F0(xVar);
    }

    public final int k1(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z5 = xVar.f1965g;
        a aVar = this.K;
        if (!z5) {
            int i7 = this.F;
            aVar.getClass();
            return i6 % i7;
        }
        int i8 = this.J.get(i6, -1);
        if (i8 != -1) {
            return i8;
        }
        int b6 = sVar.b(i6);
        if (b6 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
            return 0;
        }
        int i9 = this.F;
        aVar.getClass();
        return b6 % i9;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int l(RecyclerView.x xVar) {
        return G0(xVar);
    }

    public final int l1(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z5 = xVar.f1965g;
        a aVar = this.K;
        if (!z5) {
            aVar.getClass();
            return 1;
        }
        int i7 = this.I.get(i6, -1);
        if (i7 != -1) {
            return i7;
        }
        if (sVar.b(i6) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
            return 1;
        }
        aVar.getClass();
        return 1;
    }

    public final void m1(View view, int i6, boolean z5) {
        int i7;
        int i8;
        boolean w0;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1925b;
        int i9 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i10 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int i12 = i1(bVar.f1791e, bVar.f1792f);
        if (this.f1795p == 1) {
            i8 = RecyclerView.l.x(false, i12, i6, i10, ((ViewGroup.MarginLayoutParams) bVar).width);
            i7 = RecyclerView.l.x(true, this.f1797r.l(), this.f1915m, i9, ((ViewGroup.MarginLayoutParams) bVar).height);
        } else {
            int x5 = RecyclerView.l.x(false, i12, i6, i9, ((ViewGroup.MarginLayoutParams) bVar).height);
            int x6 = RecyclerView.l.x(true, this.f1797r.l(), this.f1914l, i10, ((ViewGroup.MarginLayoutParams) bVar).width);
            i7 = x5;
            i8 = x6;
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        if (z5) {
            w0 = y0(view, i8, i7, mVar);
        } else {
            w0 = w0(view, i8, i7, mVar);
        }
        if (w0) {
            view.measure(i8, i7);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int n(RecyclerView.x xVar) {
        return F0(xVar);
    }

    public final void n1(int i6) {
        if (i6 == this.F) {
            return;
        }
        this.E = true;
        if (i6 >= 1) {
            this.F = i6;
            this.K.b();
            n0();
            return;
        }
        throw new IllegalArgumentException(androidx.activity.j.a("Span count should be at least 1. Provided ", i6));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int o(RecyclerView.x xVar) {
        return G0(xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int o0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        o1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.o0(i6, sVar, xVar);
    }

    public final void o1() {
        int C;
        int F;
        if (this.f1795p == 1) {
            C = this.f1916n - E();
            F = D();
        } else {
            C = this.f1917o - C();
            F = F();
        }
        h1(C - F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int q0(int i6, RecyclerView.s sVar, RecyclerView.x xVar) {
        o1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.q0(i6, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m r() {
        return this.f1795p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m s(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void t0(Rect rect, int i6, int i7) {
        int g2;
        int g6;
        if (this.G == null) {
            super.t0(rect, i6, i7);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.f1795p == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f1904b;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g6 = RecyclerView.l.g(i7, height, g0.d.d(recyclerView));
            int[] iArr = this.G;
            g2 = RecyclerView.l.g(i6, iArr[iArr.length - 1] + E, g0.d.e(this.f1904b));
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f1904b;
            WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
            g2 = RecyclerView.l.g(i6, width, g0.d.e(recyclerView2));
            int[] iArr2 = this.G;
            g6 = RecyclerView.l.g(i7, iArr2[iArr2.length - 1] + C, g0.d.d(this.f1904b));
        }
        this.f1904b.setMeasuredDimension(g2, g6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int y(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1795p == 1) {
            return this.F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return j1(xVar.b() - 1, sVar, xVar) + 1;
    }
}
