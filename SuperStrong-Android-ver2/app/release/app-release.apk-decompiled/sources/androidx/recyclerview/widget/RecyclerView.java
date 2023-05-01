package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import b0.h;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import g0.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements f0.s {

    /* renamed from: u0  reason: collision with root package name */
    public static final int[] f1828u0 = {16843830};

    /* renamed from: v0  reason: collision with root package name */
    public static final Class<?>[] f1829v0;
    public static final b w0;
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public h E;
    public EdgeEffect F;
    public EdgeEffect G;
    public EdgeEffect H;
    public EdgeEffect I;
    public i J;
    public int K;
    public int L;
    public VelocityTracker M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public o S;
    public final int T;
    public final int U;
    public final float V;
    public final float W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1830a0;

    /* renamed from: b  reason: collision with root package name */
    public final u f1831b;

    /* renamed from: b0  reason: collision with root package name */
    public final z f1832b0;

    /* renamed from: c  reason: collision with root package name */
    public final s f1833c;

    /* renamed from: c0  reason: collision with root package name */
    public androidx.recyclerview.widget.m f1834c0;

    /* renamed from: d  reason: collision with root package name */
    public v f1835d;

    /* renamed from: d0  reason: collision with root package name */
    public final m.b f1836d0;

    /* renamed from: e  reason: collision with root package name */
    public androidx.recyclerview.widget.a f1837e;

    /* renamed from: e0  reason: collision with root package name */
    public final x f1838e0;

    /* renamed from: f  reason: collision with root package name */
    public androidx.recyclerview.widget.b f1839f;

    /* renamed from: f0  reason: collision with root package name */
    public q f1840f0;

    /* renamed from: g  reason: collision with root package name */
    public final c0 f1841g;

    /* renamed from: g0  reason: collision with root package name */
    public ArrayList f1842g0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1843h;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1844h0;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f1845i;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1846i0;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f1847j;

    /* renamed from: j0  reason: collision with root package name */
    public final j f1848j0;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f1849k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f1850k0;

    /* renamed from: l  reason: collision with root package name */
    public d f1851l;

    /* renamed from: l0  reason: collision with root package name */
    public androidx.recyclerview.widget.x f1852l0;

    /* renamed from: m  reason: collision with root package name */
    public l f1853m;

    /* renamed from: m0  reason: collision with root package name */
    public final int[] f1854m0;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<k> f1855n;

    /* renamed from: n0  reason: collision with root package name */
    public f0.t f1856n0;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<p> f1857o;

    /* renamed from: o0  reason: collision with root package name */
    public final int[] f1858o0;

    /* renamed from: p  reason: collision with root package name */
    public p f1859p;

    /* renamed from: p0  reason: collision with root package name */
    public final int[] f1860p0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1861q;

    /* renamed from: q0  reason: collision with root package name */
    public final int[] f1862q0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1863r;
    public final ArrayList r0;
    public boolean s;

    /* renamed from: s0  reason: collision with root package name */
    public final a f1864s0;

    /* renamed from: t  reason: collision with root package name */
    public int f1865t;

    /* renamed from: t0  reason: collision with root package name */
    public final c f1866t0;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1867v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1868w;

    /* renamed from: x  reason: collision with root package name */
    public int f1869x;

    /* renamed from: y  reason: collision with root package name */
    public final AccessibilityManager f1870y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f1871z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j5;
            long j6;
            RecyclerView recyclerView = RecyclerView.this;
            i iVar = recyclerView.J;
            if (iVar != null) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) iVar;
                ArrayList<a0> arrayList = kVar.f2079h;
                boolean z5 = !arrayList.isEmpty();
                ArrayList<k.b> arrayList2 = kVar.f2081j;
                boolean z6 = !arrayList2.isEmpty();
                ArrayList<k.a> arrayList3 = kVar.f2082k;
                boolean z7 = !arrayList3.isEmpty();
                ArrayList<a0> arrayList4 = kVar.f2080i;
                boolean z8 = !arrayList4.isEmpty();
                if (z5 || z6 || z8 || z7) {
                    Iterator<a0> it = arrayList.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        j5 = kVar.f1897d;
                        if (!hasNext) {
                            break;
                        }
                        a0 next = it.next();
                        View view = next.f1873a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.f2088q.add(next);
                        animate.setDuration(j5).alpha(0.0f).setListener(new androidx.recyclerview.widget.f(view, animate, kVar, next)).start();
                        it = it;
                    }
                    arrayList.clear();
                    if (z6) {
                        ArrayList<k.b> arrayList5 = new ArrayList<>();
                        arrayList5.addAll(arrayList2);
                        kVar.f2084m.add(arrayList5);
                        arrayList2.clear();
                        androidx.recyclerview.widget.c cVar = new androidx.recyclerview.widget.c(kVar, arrayList5);
                        if (z5) {
                            View view2 = arrayList5.get(0).f2096a.f1873a;
                            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                            g0.d.n(view2, cVar, j5);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z7) {
                        ArrayList<k.a> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList3);
                        kVar.f2085n.add(arrayList6);
                        arrayList3.clear();
                        androidx.recyclerview.widget.d dVar = new androidx.recyclerview.widget.d(kVar, arrayList6);
                        if (z5) {
                            View view3 = arrayList6.get(0).f2090a.f1873a;
                            WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                            g0.d.n(view3, dVar, j5);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z8) {
                        ArrayList<a0> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList4);
                        kVar.f2083l.add(arrayList7);
                        arrayList4.clear();
                        androidx.recyclerview.widget.e eVar = new androidx.recyclerview.widget.e(kVar, arrayList7);
                        if (!z5 && !z6 && !z7) {
                            eVar.run();
                        } else {
                            long j7 = 0;
                            if (!z5) {
                                j5 = 0;
                            }
                            if (z6) {
                                j6 = kVar.f1898e;
                            } else {
                                j6 = 0;
                            }
                            if (z7) {
                                j7 = kVar.f1899f;
                            }
                            View view4 = arrayList7.get(0).f1873a;
                            WeakHashMap<View, r0> weakHashMap3 = g0.f3878a;
                            g0.d.n(view4, eVar, Math.max(j6, j7) + j5);
                        }
                    }
                }
            }
            recyclerView.f1850k0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {
        public static final List<Object> s = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f1873a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f1874b;

        /* renamed from: j  reason: collision with root package name */
        public int f1882j;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f1890r;

        /* renamed from: c  reason: collision with root package name */
        public int f1875c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1876d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f1877e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1878f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1879g = -1;

        /* renamed from: h  reason: collision with root package name */
        public a0 f1880h = null;

        /* renamed from: i  reason: collision with root package name */
        public a0 f1881i = null;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList f1883k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f1884l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f1885m = 0;

        /* renamed from: n  reason: collision with root package name */
        public s f1886n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1887o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f1888p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f1889q = -1;

        public a0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f1873a = view;
        }

        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f1882j) == 0) {
                if (this.f1883k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f1883k = arrayList;
                    this.f1884l = Collections.unmodifiableList(arrayList);
                }
                this.f1883k.add(obj);
            }
        }

        public final void b(int i6) {
            this.f1882j = i6 | this.f1882j;
        }

        public final int c() {
            int i6 = this.f1879g;
            return i6 == -1 ? this.f1875c : i6;
        }

        public final List<Object> d() {
            ArrayList arrayList;
            return ((this.f1882j & 1024) != 0 || (arrayList = this.f1883k) == null || arrayList.size() == 0) ? s : this.f1884l;
        }

        public final boolean e() {
            View view = this.f1873a;
            return (view.getParent() == null || view.getParent() == this.f1890r) ? false : true;
        }

        public final boolean f() {
            return (this.f1882j & 1) != 0;
        }

        public final boolean g() {
            return (this.f1882j & 4) != 0;
        }

        public final boolean h() {
            if ((this.f1882j & 16) == 0) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                if (!g0.d.i(this.f1873a)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean i() {
            return (this.f1882j & 8) != 0;
        }

        public final boolean j() {
            return this.f1886n != null;
        }

        public final boolean k() {
            return (this.f1882j & 256) != 0;
        }

        public final void l(int i6, boolean z5) {
            if (this.f1876d == -1) {
                this.f1876d = this.f1875c;
            }
            if (this.f1879g == -1) {
                this.f1879g = this.f1875c;
            }
            if (z5) {
                this.f1879g += i6;
            }
            this.f1875c += i6;
            View view = this.f1873a;
            if (view.getLayoutParams() != null) {
                ((m) view.getLayoutParams()).f1926c = true;
            }
        }

        public final void m() {
            this.f1882j = 0;
            this.f1875c = -1;
            this.f1876d = -1;
            this.f1877e = -1L;
            this.f1879g = -1;
            this.f1885m = 0;
            this.f1880h = null;
            this.f1881i = null;
            ArrayList arrayList = this.f1883k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f1882j &= -1025;
            this.f1888p = 0;
            this.f1889q = -1;
            RecyclerView.j(this);
        }

        public final void n(boolean z5) {
            int i6;
            int i7 = this.f1885m;
            int i8 = z5 ? i7 - 1 : i7 + 1;
            this.f1885m = i8;
            if (i8 < 0) {
                this.f1885m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z5 && i8 == 1) {
                i6 = this.f1882j | 16;
            } else if (!z5 || i8 != 0) {
                return;
            } else {
                i6 = this.f1882j & (-17);
            }
            this.f1882j = i6;
        }

        public final boolean o() {
            return (this.f1882j & 128) != 0;
        }

        public final boolean p() {
            return (this.f1882j & 32) != 0;
        }

        public final String toString() {
            String simpleName;
            boolean z5;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1875c + " id=" + this.f1877e + ", oldPos=" + this.f1876d + ", pLpos:" + this.f1879g);
            if (j()) {
                sb.append(" scrap ");
                if (this.f1887o) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (g()) {
                sb.append(" invalid");
            }
            if (!f()) {
                sb.append(" unbound");
            }
            boolean z6 = true;
            if ((this.f1882j & 2) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                sb.append(" update");
            }
            if (i()) {
                sb.append(" removed");
            }
            if (o()) {
                sb.append(" ignored");
            }
            if (k()) {
                sb.append(" tmpDetached");
            }
            if (!h()) {
                sb.append(" not recyclable(" + this.f1885m + ")");
            }
            if ((this.f1882j & 512) == 0 && !g()) {
                z6 = false;
            }
            if (z6) {
                sb.append(" undefined adapter position");
            }
            if (this.f1873a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d<VH extends a0> {

        /* renamed from: a  reason: collision with root package name */
        public final e f1892a = new e();

        /* renamed from: b  reason: collision with root package name */
        public boolean f1893b = false;

        public abstract int c();

        public long d(int i6) {
            return -1L;
        }

        public void e(RecyclerView recyclerView) {
        }

        public abstract void f(VH vh, int i6);

        public abstract a0 g(RecyclerView recyclerView);

        public void h(RecyclerView recyclerView) {
        }

        public boolean i(VH vh) {
            return false;
        }

        public void j(VH vh) {
        }

        public void k(VH vh) {
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Observable<f> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public void a() {
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public static class h {
    }

    /* loaded from: classes.dex */
    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public b f1894a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<a> f1895b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public final long f1896c = 120;

        /* renamed from: d  reason: collision with root package name */
        public final long f1897d = 120;

        /* renamed from: e  reason: collision with root package name */
        public final long f1898e = 250;

        /* renamed from: f  reason: collision with root package name */
        public final long f1899f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f1900a;

            /* renamed from: b  reason: collision with root package name */
            public int f1901b;

            public final void a(a0 a0Var) {
                View view = a0Var.f1873a;
                this.f1900a = view.getLeft();
                this.f1901b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(a0 a0Var) {
            RecyclerView recyclerView;
            int i6 = a0Var.f1882j & 14;
            if (!a0Var.g() && (i6 & 4) == 0 && (recyclerView = a0Var.f1890r) != null) {
                recyclerView.G(a0Var);
            }
        }

        public abstract boolean a(a0 a0Var, a0 a0Var2, c cVar, c cVar2);

        public final void c(a0 a0Var) {
            boolean z5;
            b bVar = this.f1894a;
            if (bVar != null) {
                j jVar = (j) bVar;
                boolean z6 = true;
                a0Var.n(true);
                if (a0Var.f1880h != null && a0Var.f1881i == null) {
                    a0Var.f1880h = null;
                }
                a0Var.f1881i = null;
                if ((a0Var.f1882j & 16) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.d0();
                    androidx.recyclerview.widget.b bVar2 = recyclerView.f1839f;
                    androidx.recyclerview.widget.v vVar = (androidx.recyclerview.widget.v) bVar2.f2033a;
                    RecyclerView recyclerView2 = vVar.f2169a;
                    View view = a0Var.f1873a;
                    int indexOfChild = recyclerView2.indexOfChild(view);
                    if (indexOfChild == -1) {
                        bVar2.k(view);
                    } else {
                        b.a aVar = bVar2.f2034b;
                        if (aVar.d(indexOfChild)) {
                            aVar.f(indexOfChild);
                            bVar2.k(view);
                            vVar.b(indexOfChild);
                        } else {
                            z6 = false;
                        }
                    }
                    if (z6) {
                        a0 J = RecyclerView.J(view);
                        s sVar = recyclerView.f1833c;
                        sVar.j(J);
                        sVar.g(J);
                    }
                    recyclerView.e0(!z6);
                    if (!z6 && a0Var.k()) {
                        recyclerView.removeDetachedView(view, false);
                    }
                }
            }
        }

        public abstract void d(a0 a0Var);

        public abstract void e();

        public abstract boolean f();
    }

    /* loaded from: classes.dex */
    public class j implements i.b {
        public j() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public void d(Canvas canvas, RecyclerView recyclerView) {
        }

        public void e(Canvas canvas) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public androidx.recyclerview.widget.b f1903a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1904b;

        /* renamed from: c  reason: collision with root package name */
        public final b0 f1905c;

        /* renamed from: d  reason: collision with root package name */
        public final b0 f1906d;

        /* renamed from: e  reason: collision with root package name */
        public w f1907e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1908f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1909g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f1910h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f1911i;

        /* renamed from: j  reason: collision with root package name */
        public int f1912j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1913k;

        /* renamed from: l  reason: collision with root package name */
        public int f1914l;

        /* renamed from: m  reason: collision with root package name */
        public int f1915m;

        /* renamed from: n  reason: collision with root package name */
        public int f1916n;

        /* renamed from: o  reason: collision with root package name */
        public int f1917o;

        /* loaded from: classes.dex */
        public class a implements b0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int a() {
                l lVar = l.this;
                return lVar.f1916n - lVar.E();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int b(View view) {
                l.this.getClass();
                return (view.getLeft() - l.B(view)) - ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final View c(int i6) {
                return l.this.v(i6);
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int d() {
                return l.this.D();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int e(View view) {
                l.this.getClass();
                return l.I(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements b0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int a() {
                l lVar = l.this;
                return lVar.f1917o - lVar.C();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int b(View view) {
                l.this.getClass();
                return (view.getTop() - l.K(view)) - ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final View c(int i6) {
                return l.this.v(i6);
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int d() {
                return l.this.F();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int e(View view) {
                l.this.getClass();
                return l.u(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f1920a;

            /* renamed from: b  reason: collision with root package name */
            public int f1921b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f1922c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1923d;
        }

        public l() {
            a aVar = new a();
            b bVar = new b();
            this.f1905c = new b0(aVar);
            this.f1906d = new b0(bVar);
            this.f1908f = false;
            this.f1909g = false;
            this.f1910h = true;
            this.f1911i = true;
        }

        public static int B(View view) {
            return ((m) view.getLayoutParams()).f1925b.left;
        }

        public static int G(View view) {
            return ((m) view.getLayoutParams()).a();
        }

        public static d H(Context context, AttributeSet attributeSet, int i6, int i7) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.fragment.app.r0.f1636n, i6, i7);
            dVar.f1920a = obtainStyledAttributes.getInt(0, 1);
            dVar.f1921b = obtainStyledAttributes.getInt(10, 1);
            dVar.f1922c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f1923d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int I(View view) {
            return ((m) view.getLayoutParams()).f1925b.right;
        }

        public static int K(View view) {
            return ((m) view.getLayoutParams()).f1925b.top;
        }

        public static boolean N(int i6, int i7, int i8) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (i8 <= 0 || i6 == i8) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i6;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i6;
                } else {
                    return true;
                }
            }
            return false;
        }

        public static void O(View view, int i6, int i7, int i8, int i9) {
            m mVar = (m) view.getLayoutParams();
            Rect rect = mVar.f1925b;
            view.layout(i6 + rect.left + ((ViewGroup.MarginLayoutParams) mVar).leftMargin, i7 + rect.top + ((ViewGroup.MarginLayoutParams) mVar).topMargin, (i8 - rect.right) - ((ViewGroup.MarginLayoutParams) mVar).rightMargin, (i9 - rect.bottom) - ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
        }

        public static int g(int i6, int i7, int i8) {
            int mode = View.MeasureSpec.getMode(i6);
            int size = View.MeasureSpec.getSize(i6);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i7, i8) : size : Math.min(size, Math.max(i7, i8));
        }

        public static int u(View view) {
            return ((m) view.getLayoutParams()).f1925b.bottom;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r6 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int x(boolean r4, int r5, int r6, int r7, int r8) {
            /*
                int r5 = r5 - r7
                r7 = 0
                int r5 = java.lang.Math.max(r7, r5)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L1a
                if (r8 < 0) goto L11
                goto L1c
            L11:
                if (r8 != r1) goto L2f
                if (r6 == r2) goto L20
                if (r6 == 0) goto L2f
                if (r6 == r3) goto L20
                goto L2f
            L1a:
                if (r8 < 0) goto L1e
            L1c:
                r6 = r3
                goto L31
            L1e:
                if (r8 != r1) goto L22
            L20:
                r8 = r5
                goto L31
            L22:
                if (r8 != r0) goto L2f
                if (r6 == r2) goto L2c
                if (r6 != r3) goto L29
                goto L2c
            L29:
                r8 = r5
                r6 = r7
                goto L31
            L2c:
                r8 = r5
                r6 = r2
                goto L31
            L2f:
                r6 = r7
                r8 = r6
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.x(boolean, int, int, int, int):int");
        }

        public static void z(View view, Rect rect) {
            int[] iArr = RecyclerView.f1828u0;
            m mVar = (m) view.getLayoutParams();
            Rect rect2 = mVar.f1925b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) mVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
        }

        public final int A() {
            RecyclerView recyclerView = this.f1904b;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            return g0.e.d(recyclerView);
        }

        public final void A0(androidx.recyclerview.widget.o oVar) {
            w wVar = this.f1907e;
            if (wVar != null && oVar != wVar && wVar.f1948e) {
                wVar.d();
            }
            this.f1907e = oVar;
            RecyclerView recyclerView = this.f1904b;
            z zVar = recyclerView.f1832b0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f1975d.abortAnimation();
            if (oVar.f1951h) {
                Log.w("RecyclerView", "An instance of " + oVar.getClass().getSimpleName() + " was started more than once. Each instance of" + oVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            oVar.f1945b = recyclerView;
            oVar.f1946c = this;
            int i6 = oVar.f1944a;
            if (i6 != -1) {
                recyclerView.f1838e0.f1959a = i6;
                oVar.f1948e = true;
                oVar.f1947d = true;
                oVar.f1949f = recyclerView.f1853m.q(i6);
                oVar.f1945b.f1832b0.a();
                oVar.f1951h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public boolean B0() {
            return false;
        }

        public final int C() {
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int D() {
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int E() {
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int F() {
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int J(s sVar, x xVar) {
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView == null || recyclerView.f1851l == null || !e()) {
                return 1;
            }
            return this.f1904b.f1851l.c();
        }

        public final void L(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((m) view.getLayoutParams()).f1925b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f1904b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f1904b.f1849k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean M() {
            return false;
        }

        public void P(int i6) {
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView != null) {
                int e6 = recyclerView.f1839f.e();
                for (int i7 = 0; i7 < e6; i7++) {
                    recyclerView.f1839f.d(i7).offsetLeftAndRight(i6);
                }
            }
        }

        public void Q(int i6) {
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView != null) {
                int e6 = recyclerView.f1839f.e();
                for (int i7 = 0; i7 < e6; i7++) {
                    recyclerView.f1839f.d(i7).offsetTopAndBottom(i6);
                }
            }
        }

        public void R(RecyclerView recyclerView) {
        }

        public View S(View view, int i6, s sVar, x xVar) {
            return null;
        }

        public void T(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1904b;
            s sVar = recyclerView.f1833c;
            x xVar = recyclerView.f1838e0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z5 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1904b.canScrollVertically(-1) && !this.f1904b.canScrollHorizontally(-1) && !this.f1904b.canScrollHorizontally(1)) {
                    z5 = false;
                }
                accessibilityEvent.setScrollable(z5);
                d dVar = this.f1904b.f1851l;
                if (dVar != null) {
                    accessibilityEvent.setItemCount(dVar.c());
                }
            }
        }

        public void U(s sVar, x xVar, g0.f fVar) {
            if (this.f1904b.canScrollVertically(-1) || this.f1904b.canScrollHorizontally(-1)) {
                fVar.a(8192);
                fVar.i(true);
            }
            if (this.f1904b.canScrollVertically(1) || this.f1904b.canScrollHorizontally(1)) {
                fVar.a(4096);
                fVar.i(true);
            }
            fVar.f4095a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(J(sVar, xVar), y(sVar, xVar), 0).f4110a);
        }

        public final void V(View view, g0.f fVar) {
            a0 J = RecyclerView.J(view);
            if (J == null || J.i() || this.f1903a.j(J.f1873a)) {
                return;
            }
            RecyclerView recyclerView = this.f1904b;
            W(recyclerView.f1833c, recyclerView.f1838e0, view, fVar);
        }

        public void W(s sVar, x xVar, View view, g0.f fVar) {
            fVar.g(f.c.a(e() ? G(view) : 0, 1, d() ? G(view) : 0, 1, false));
        }

        public void X(int i6, int i7) {
        }

        public void Y() {
        }

        public void Z(int i6, int i7) {
        }

        public void a0(int i6, int i7) {
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(android.view.View r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.b(android.view.View, int, boolean):void");
        }

        public void b0(int i6, int i7) {
        }

        public void c(String str) {
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void c0(s sVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean d() {
            return false;
        }

        public void d0(x xVar) {
        }

        public boolean e() {
            return false;
        }

        public void e0(Parcelable parcelable) {
        }

        public boolean f(m mVar) {
            return mVar != null;
        }

        public Parcelable f0() {
            return null;
        }

        public void g0(int i6) {
        }

        public void h(int i6, int i7, x xVar, c cVar) {
        }

        public boolean h0(s sVar, x xVar, int i6, Bundle bundle) {
            int i7;
            int D;
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView == null) {
                return false;
            }
            if (i6 != 4096) {
                if (i6 != 8192) {
                    i7 = 0;
                    D = 0;
                } else {
                    if (recyclerView.canScrollVertically(-1)) {
                        i7 = -((this.f1917o - F()) - C());
                    } else {
                        i7 = 0;
                    }
                    if (this.f1904b.canScrollHorizontally(-1)) {
                        D = -((this.f1916n - D()) - E());
                    }
                    D = 0;
                }
            } else {
                if (recyclerView.canScrollVertically(1)) {
                    i7 = (this.f1917o - F()) - C();
                } else {
                    i7 = 0;
                }
                if (this.f1904b.canScrollHorizontally(1)) {
                    D = (this.f1916n - D()) - E();
                }
                D = 0;
            }
            if (i7 == 0 && D == 0) {
                return false;
            }
            this.f1904b.b0(D, i7, true);
            return true;
        }

        public void i(int i6, c cVar) {
        }

        public final void i0(s sVar) {
            int w5 = w();
            while (true) {
                w5--;
                if (w5 >= 0) {
                    if (!RecyclerView.J(v(w5)).o()) {
                        View v2 = v(w5);
                        l0(w5);
                        sVar.f(v2);
                    }
                } else {
                    return;
                }
            }
        }

        public int j(x xVar) {
            return 0;
        }

        public final void j0(s sVar) {
            ArrayList<a0> arrayList;
            int size = sVar.f1934a.size();
            int i6 = size - 1;
            while (true) {
                arrayList = sVar.f1934a;
                if (i6 < 0) {
                    break;
                }
                View view = arrayList.get(i6).f1873a;
                a0 J = RecyclerView.J(view);
                if (!J.o()) {
                    J.n(false);
                    if (J.k()) {
                        this.f1904b.removeDetachedView(view, false);
                    }
                    i iVar = this.f1904b.J;
                    if (iVar != null) {
                        iVar.d(J);
                    }
                    J.n(true);
                    a0 J2 = RecyclerView.J(view);
                    J2.f1886n = null;
                    J2.f1887o = false;
                    J2.f1882j &= -33;
                    sVar.g(J2);
                }
                i6--;
            }
            arrayList.clear();
            ArrayList<a0> arrayList2 = sVar.f1935b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f1904b.invalidate();
            }
        }

        public int k(x xVar) {
            return 0;
        }

        public final void k0(View view, s sVar) {
            androidx.recyclerview.widget.b bVar = this.f1903a;
            androidx.recyclerview.widget.v vVar = (androidx.recyclerview.widget.v) bVar.f2033a;
            int indexOfChild = vVar.f2169a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f2034b.f(indexOfChild)) {
                    bVar.k(view);
                }
                vVar.b(indexOfChild);
            }
            sVar.f(view);
        }

        public int l(x xVar) {
            return 0;
        }

        public final void l0(int i6) {
            if (v(i6) != null) {
                androidx.recyclerview.widget.b bVar = this.f1903a;
                int f6 = bVar.f(i6);
                androidx.recyclerview.widget.v vVar = (androidx.recyclerview.widget.v) bVar.f2033a;
                View childAt = vVar.f2169a.getChildAt(f6);
                if (childAt != null) {
                    if (bVar.f2034b.f(f6)) {
                        bVar.k(childAt);
                    }
                    vVar.b(f6);
                }
            }
        }

        public int m(x xVar) {
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
            if (r10 == false) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.D()
                int r1 = r8.F()
                int r2 = r8.f1916n
                int r3 = r8.E()
                int r2 = r2 - r3
                int r3 = r8.f1917o
                int r4 = r8.C()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.A()
                r7 = 1
                if (r3 != r7) goto L5c
                if (r2 == 0) goto L57
                goto L64
            L57:
                int r2 = java.lang.Math.max(r6, r10)
                goto L64
            L5c:
                if (r6 == 0) goto L5f
                goto L63
            L5f:
                int r6 = java.lang.Math.min(r4, r2)
            L63:
                r2 = r6
            L64:
                if (r1 == 0) goto L67
                goto L6b
            L67:
                int r1 = java.lang.Math.min(r5, r11)
            L6b:
                if (r13 == 0) goto Lab
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L74
                goto La8
            L74:
                int r11 = r8.D()
                int r13 = r8.F()
                int r3 = r8.f1916n
                int r4 = r8.E()
                int r3 = r3 - r4
                int r4 = r8.f1917o
                int r5 = r8.C()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f1904b
                android.graphics.Rect r5 = r5.f1845i
                z(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto La8
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto La8
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto La8
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto La6
                goto La8
            La6:
                r10 = r7
                goto La9
            La8:
                r10 = r0
            La9:
                if (r10 == 0) goto Lb0
            Lab:
                if (r2 != 0) goto Lb1
                if (r1 == 0) goto Lb0
                goto Lb1
            Lb0:
                return r0
            Lb1:
                if (r12 == 0) goto Lb7
                r9.scrollBy(r2, r1)
                goto Lba
            Lb7:
                r9.b0(r2, r1, r0)
            Lba:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.m0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int n(x xVar) {
            return 0;
        }

        public final void n0() {
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int o(x xVar) {
            return 0;
        }

        public int o0(int i6, s sVar, x xVar) {
            return 0;
        }

        public final void p(s sVar) {
            int w5 = w();
            while (true) {
                w5--;
                if (w5 >= 0) {
                    View v2 = v(w5);
                    a0 J = RecyclerView.J(v2);
                    if (!J.o()) {
                        if (J.g() && !J.i() && !this.f1904b.f1851l.f1893b) {
                            l0(w5);
                            sVar.g(J);
                        } else {
                            v(w5);
                            this.f1903a.c(w5);
                            sVar.h(v2);
                            this.f1904b.f1841g.b(J);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public void p0(int i6) {
        }

        public View q(int i6) {
            int w5 = w();
            for (int i7 = 0; i7 < w5; i7++) {
                View v2 = v(i7);
                a0 J = RecyclerView.J(v2);
                if (J != null && J.c() == i6 && !J.o() && (this.f1904b.f1838e0.f1965g || !J.i())) {
                    return v2;
                }
            }
            return null;
        }

        public int q0(int i6, s sVar, x xVar) {
            return 0;
        }

        public abstract m r();

        public final void r0(RecyclerView recyclerView) {
            s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public m s(Context context, AttributeSet attributeSet) {
            return new m(context, attributeSet);
        }

        public final void s0(int i6, int i7) {
            this.f1916n = View.MeasureSpec.getSize(i6);
            int mode = View.MeasureSpec.getMode(i6);
            this.f1914l = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.f1828u0;
            }
            this.f1917o = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i7);
            this.f1915m = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.f1828u0;
            }
        }

        public m t(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof m ? new m((m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new m((ViewGroup.MarginLayoutParams) layoutParams) : new m(layoutParams);
        }

        public void t0(Rect rect, int i6, int i7) {
            int E = E() + D() + rect.width();
            int C = C() + F() + rect.height();
            RecyclerView recyclerView = this.f1904b;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            this.f1904b.setMeasuredDimension(g(i6, E, g0.d.e(recyclerView)), g(i7, C, g0.d.d(this.f1904b)));
        }

        public final void u0(int i6, int i7) {
            int w5 = w();
            if (w5 == 0) {
                this.f1904b.n(i6, i7);
                return;
            }
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < w5; i12++) {
                View v2 = v(i12);
                Rect rect = this.f1904b.f1845i;
                z(v2, rect);
                int i13 = rect.left;
                if (i13 < i11) {
                    i11 = i13;
                }
                int i14 = rect.right;
                if (i14 > i8) {
                    i8 = i14;
                }
                int i15 = rect.top;
                if (i15 < i9) {
                    i9 = i15;
                }
                int i16 = rect.bottom;
                if (i16 > i10) {
                    i10 = i16;
                }
            }
            this.f1904b.f1845i.set(i11, i9, i8, i10);
            t0(this.f1904b.f1845i, i6, i7);
        }

        public final View v(int i6) {
            androidx.recyclerview.widget.b bVar = this.f1903a;
            if (bVar != null) {
                return bVar.d(i6);
            }
            return null;
        }

        public final void v0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f1904b = null;
                this.f1903a = null;
                height = 0;
                this.f1916n = 0;
            } else {
                this.f1904b = recyclerView;
                this.f1903a = recyclerView.f1839f;
                this.f1916n = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f1917o = height;
            this.f1914l = 1073741824;
            this.f1915m = 1073741824;
        }

        public final int w() {
            androidx.recyclerview.widget.b bVar = this.f1903a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final boolean w0(View view, int i6, int i7, m mVar) {
            return (!view.isLayoutRequested() && this.f1910h && N(view.getWidth(), i6, ((ViewGroup.MarginLayoutParams) mVar).width) && N(view.getHeight(), i7, ((ViewGroup.MarginLayoutParams) mVar).height)) ? false : true;
        }

        public boolean x0() {
            return false;
        }

        public int y(s sVar, x xVar) {
            RecyclerView recyclerView = this.f1904b;
            if (recyclerView == null || recyclerView.f1851l == null || !d()) {
                return 1;
            }
            return this.f1904b.f1851l.c();
        }

        public final boolean y0(View view, int i6, int i7, m mVar) {
            return (this.f1910h && N(view.getMeasuredWidth(), i6, ((ViewGroup.MarginLayoutParams) mVar).width) && N(view.getMeasuredHeight(), i7, ((ViewGroup.MarginLayoutParams) mVar).height)) ? false : true;
        }

        public void z0(RecyclerView recyclerView, int i6) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }
    }

    /* loaded from: classes.dex */
    public static class m extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public a0 f1924a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1925b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1926c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1927d;

        public m(int i6, int i7) {
            super(i6, i7);
            this.f1925b = new Rect();
            this.f1926c = true;
            this.f1927d = false;
        }

        public m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1925b = new Rect();
            this.f1926c = true;
            this.f1927d = false;
        }

        public m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1925b = new Rect();
            this.f1926c = true;
            this.f1927d = false;
        }

        public m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1925b = new Rect();
            this.f1926c = true;
            this.f1927d = false;
        }

        public m(m mVar) {
            super((ViewGroup.LayoutParams) mVar);
            this.f1925b = new Rect();
            this.f1926c = true;
            this.f1927d = false;
        }

        public final int a() {
            return this.f1924a.c();
        }

        public final boolean b() {
            if ((this.f1924a.f1882j & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean c() {
            return this.f1924a.i();
        }
    }

    /* loaded from: classes.dex */
    public interface n {
        void a(View view);

        void b();
    }

    /* loaded from: classes.dex */
    public static abstract class o {
    }

    /* loaded from: classes.dex */
    public interface p {
        void a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);

        void c();
    }

    /* loaded from: classes.dex */
    public static abstract class q {
        public void a(int i6, RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i6, int i7) {
        }
    }

    /* loaded from: classes.dex */
    public static class r {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1928a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1929b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<a0> f1930a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final int f1931b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f1932c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f1933d = 0;
        }

        public final a a(int i6) {
            SparseArray<a> sparseArray = this.f1928a;
            a aVar = sparseArray.get(i6);
            if (aVar == null) {
                a aVar2 = new a();
                sparseArray.put(i6, aVar2);
                return aVar2;
            }
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public final class s {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<a0> f1934a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a0> f1935b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<a0> f1936c;

        /* renamed from: d  reason: collision with root package name */
        public final List<a0> f1937d;

        /* renamed from: e  reason: collision with root package name */
        public int f1938e;

        /* renamed from: f  reason: collision with root package name */
        public int f1939f;

        /* renamed from: g  reason: collision with root package name */
        public r f1940g;

        public s() {
            ArrayList<a0> arrayList = new ArrayList<>();
            this.f1934a = arrayList;
            this.f1935b = null;
            this.f1936c = new ArrayList<>();
            this.f1937d = Collections.unmodifiableList(arrayList);
            this.f1938e = 2;
            this.f1939f = 2;
        }

        public final void a(a0 a0Var, boolean z5) {
            f0.a aVar;
            RecyclerView.j(a0Var);
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.x xVar = recyclerView.f1852l0;
            if (xVar != null) {
                x.a aVar2 = xVar.f2172e;
                boolean z6 = aVar2 instanceof x.a;
                View view = a0Var.f1873a;
                if (z6) {
                    aVar = (f0.a) aVar2.f2174e.remove(view);
                } else {
                    aVar = null;
                }
                g0.l(view, aVar);
            }
            if (z5) {
                d dVar = recyclerView.f1851l;
                if (dVar != null) {
                    dVar.k(a0Var);
                }
                if (recyclerView.f1838e0 != null) {
                    recyclerView.f1841g.c(a0Var);
                }
            }
            a0Var.f1890r = null;
            r c6 = c();
            c6.getClass();
            int i6 = a0Var.f1878f;
            ArrayList<a0> arrayList = c6.a(i6).f1930a;
            if (c6.f1928a.get(i6).f1931b > arrayList.size()) {
                a0Var.m();
                arrayList.add(a0Var);
            }
        }

        public final int b(int i6) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i6 >= 0 && i6 < recyclerView.f1838e0.b()) {
                if (!recyclerView.f1838e0.f1965g) {
                    return i6;
                }
                return recyclerView.f1837e.f(i6, 0);
            }
            throw new IndexOutOfBoundsException("invalid position " + i6 + ". State item count is " + recyclerView.f1838e0.b() + recyclerView.z());
        }

        public final r c() {
            if (this.f1940g == null) {
                this.f1940g = new r();
            }
            return this.f1940g;
        }

        public final void d() {
            ArrayList<a0> arrayList = this.f1936c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                e(size);
            }
            arrayList.clear();
            int[] iArr = RecyclerView.f1828u0;
            m.b bVar = RecyclerView.this.f1836d0;
            int[] iArr2 = bVar.f2138c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f2139d = 0;
        }

        public final void e(int i6) {
            ArrayList<a0> arrayList = this.f1936c;
            a(arrayList.get(i6), true);
            arrayList.remove(i6);
        }

        public final void f(View view) {
            a0 J = RecyclerView.J(view);
            boolean k5 = J.k();
            RecyclerView recyclerView = RecyclerView.this;
            if (k5) {
                recyclerView.removeDetachedView(view, false);
            }
            if (J.j()) {
                J.f1886n.j(J);
            } else if (J.p()) {
                J.f1882j &= -33;
            }
            g(J);
            if (recyclerView.J != null && !J.h()) {
                recyclerView.J.d(J);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(androidx.recyclerview.widget.RecyclerView.a0 r12) {
            /*
                Method dump skipped, instructions count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.g(androidx.recyclerview.widget.RecyclerView$a0):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(android.view.View r6) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView$a0 r6 = androidx.recyclerview.widget.RecyclerView.J(r6)
                int r0 = r6.f1882j
                r1 = r0 & 12
                r2 = 1
                r3 = 0
                if (r1 == 0) goto Le
                r1 = r2
                goto Lf
            Le:
                r1 = r3
            Lf:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                if (r1 != 0) goto L5b
                r0 = r0 & 2
                if (r0 == 0) goto L19
                r0 = r2
                goto L1a
            L19:
                r0 = r3
            L1a:
                if (r0 == 0) goto L5b
                androidx.recyclerview.widget.RecyclerView$i r0 = r4.J
                if (r0 == 0) goto L45
                java.util.List r1 = r6.d()
                androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.k) r0
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L3f
                boolean r0 = r0.f2175g
                if (r0 == 0) goto L39
                boolean r0 = r6.g()
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = r3
                goto L3a
            L39:
                r0 = r2
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = r3
                goto L40
            L3f:
                r0 = r2
            L40:
                if (r0 == 0) goto L43
                goto L45
            L43:
                r0 = r3
                goto L46
            L45:
                r0 = r2
            L46:
                if (r0 == 0) goto L49
                goto L5b
            L49:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r5.f1935b
                if (r0 != 0) goto L54
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.f1935b = r0
            L54:
                r6.f1886n = r5
                r6.f1887o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r5.f1935b
                goto L8c
            L5b:
                boolean r0 = r6.g()
                if (r0 == 0) goto L86
                boolean r0 = r6.i()
                if (r0 != 0) goto L86
                androidx.recyclerview.widget.RecyclerView$d r0 = r4.f1851l
                boolean r0 = r0.f1893b
                if (r0 == 0) goto L6e
                goto L86
            L6e:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                r0.<init>(r1)
                java.lang.String r1 = r4.z()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L86:
                r6.f1886n = r5
                r6.f1887o = r3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r5.f1934a
            L8c:
                r0.add(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.h(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:110:0x01d0, code lost:
            if (r8.f1878f != 0) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:240:0x0423, code lost:
            if (r8.g() == false) goto L227;
         */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0235  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x03d2  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x03dc  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x03de  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x03e1  */
        /* JADX WARN: Removed duplicated region for block: B:229:0x0405  */
        /* JADX WARN: Removed duplicated region for block: B:234:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:245:0x043b  */
        /* JADX WARN: Removed duplicated region for block: B:257:0x0464  */
        /* JADX WARN: Removed duplicated region for block: B:260:0x0483  */
        /* JADX WARN: Removed duplicated region for block: B:263:0x0496  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x04b4  */
        /* JADX WARN: Removed duplicated region for block: B:270:0x04c3  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x04ce  */
        /* JADX WARN: Removed duplicated region for block: B:296:0x050d  */
        /* JADX WARN: Removed duplicated region for block: B:299:0x0512  */
        /* JADX WARN: Removed duplicated region for block: B:303:0x051e  */
        /* JADX WARN: Removed duplicated region for block: B:304:0x0523  */
        /* JADX WARN: Removed duplicated region for block: B:311:0x053c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0142  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.recyclerview.widget.RecyclerView.a0 i(int r20, long r21) {
            /*
                Method dump skipped, instructions count: 1396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.i(int, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        public final void j(a0 a0Var) {
            ArrayList<a0> arrayList;
            if (a0Var.f1887o) {
                arrayList = this.f1935b;
            } else {
                arrayList = this.f1934a;
            }
            arrayList.remove(a0Var);
            a0Var.f1886n = null;
            a0Var.f1887o = false;
            a0Var.f1882j &= -33;
        }

        public final void k() {
            l lVar = RecyclerView.this.f1853m;
            this.f1939f = this.f1938e + (lVar != null ? lVar.f1912j : 0);
            ArrayList<a0> arrayList = this.f1936c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1939f; size--) {
                e(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface t {
    }

    /* loaded from: classes.dex */
    public class u extends f {
        public u() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            recyclerView.f1838e0.f1964f = true;
            recyclerView.U(true);
            if (recyclerView.f1837e.g()) {
                return;
            }
            recyclerView.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static class v extends l0.a {
        public static final Parcelable.Creator<v> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public Parcelable f1943d;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<v> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new v(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new v[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final v createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new v(parcel, classLoader);
            }
        }

        public v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1943d = parcel.readParcelable(classLoader == null ? l.class.getClassLoader() : classLoader);
        }

        public v(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeParcelable(this.f1943d, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class w {

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1945b;

        /* renamed from: c  reason: collision with root package name */
        public l f1946c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1947d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1948e;

        /* renamed from: f  reason: collision with root package name */
        public View f1949f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1951h;

        /* renamed from: a  reason: collision with root package name */
        public int f1944a = -1;

        /* renamed from: g  reason: collision with root package name */
        public final a f1950g = new a();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: d  reason: collision with root package name */
            public int f1955d = -1;

            /* renamed from: f  reason: collision with root package name */
            public boolean f1957f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f1958g = 0;

            /* renamed from: a  reason: collision with root package name */
            public int f1952a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f1953b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f1954c = Integer.MIN_VALUE;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f1956e = null;

            public final void a(RecyclerView recyclerView) {
                int i6 = this.f1955d;
                if (i6 >= 0) {
                    this.f1955d = -1;
                    recyclerView.M(i6);
                    this.f1957f = false;
                } else if (this.f1957f) {
                    Interpolator interpolator = this.f1956e;
                    if (interpolator != null && this.f1954c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i7 = this.f1954c;
                    if (i7 >= 1) {
                        recyclerView.f1832b0.b(this.f1952a, this.f1953b, i7, interpolator);
                        int i8 = this.f1958g + 1;
                        this.f1958g = i8;
                        if (i8 > 10) {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f1957f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    this.f1958g = 0;
                }
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i6);
        }

        public final PointF a(int i6) {
            l lVar = this.f1946c;
            if (lVar instanceof b) {
                return ((b) lVar).a(i6);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i6, int i7) {
            float f6;
            PointF a6;
            RecyclerView recyclerView = this.f1945b;
            int i8 = -1;
            if (this.f1944a == -1 || recyclerView == null) {
                d();
            }
            if (this.f1947d && this.f1949f == null && this.f1946c != null && (a6 = a(this.f1944a)) != null) {
                float f7 = a6.x;
                if (f7 != 0.0f || a6.y != 0.0f) {
                    recyclerView.Z((int) Math.signum(f7), (int) Math.signum(a6.y), null);
                }
            }
            boolean z5 = false;
            this.f1947d = false;
            View view = this.f1949f;
            a aVar = this.f1950g;
            if (view != null) {
                this.f1945b.getClass();
                a0 J = RecyclerView.J(view);
                if (J != null) {
                    i8 = J.c();
                }
                if (i8 == this.f1944a) {
                    View view2 = this.f1949f;
                    x xVar = recyclerView.f1838e0;
                    c(view2, aVar);
                    aVar.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f1949f = null;
                }
            }
            if (this.f1948e) {
                x xVar2 = recyclerView.f1838e0;
                androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) this;
                if (oVar.f1945b.f1853m.w() == 0) {
                    oVar.d();
                } else {
                    int i9 = oVar.f2160o;
                    int i10 = i9 - i6;
                    if (i9 * i10 <= 0) {
                        i10 = 0;
                    }
                    oVar.f2160o = i10;
                    int i11 = oVar.f2161p;
                    int i12 = i11 - i7;
                    if (i11 * i12 <= 0) {
                        i12 = 0;
                    }
                    oVar.f2161p = i12;
                    if (i10 == 0 && i12 == 0) {
                        PointF a7 = oVar.a(oVar.f1944a);
                        if (a7 != null) {
                            if (a7.x != 0.0f || a7.y != 0.0f) {
                                float f8 = a7.y;
                                float sqrt = (float) Math.sqrt((f8 * f8) + (f6 * f6));
                                float f9 = a7.x / sqrt;
                                a7.x = f9;
                                float f10 = a7.y / sqrt;
                                a7.y = f10;
                                oVar.f2156k = a7;
                                oVar.f2160o = (int) (f9 * 10000.0f);
                                oVar.f2161p = (int) (f10 * 10000.0f);
                                int g2 = oVar.g(10000);
                                LinearInterpolator linearInterpolator = oVar.f2154i;
                                aVar.f1952a = (int) (oVar.f2160o * 1.2f);
                                aVar.f1953b = (int) (oVar.f2161p * 1.2f);
                                aVar.f1954c = (int) (g2 * 1.2f);
                                aVar.f1956e = linearInterpolator;
                                aVar.f1957f = true;
                            }
                        }
                        aVar.f1955d = oVar.f1944a;
                        oVar.d();
                    }
                }
                if (aVar.f1955d >= 0) {
                    z5 = true;
                }
                aVar.a(recyclerView);
                if (z5 && this.f1948e) {
                    this.f1947d = true;
                    recyclerView.f1832b0.a();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (!this.f1948e) {
                return;
            }
            this.f1948e = false;
            androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) this;
            oVar.f2161p = 0;
            oVar.f2160o = 0;
            oVar.f2156k = null;
            this.f1945b.f1838e0.f1959a = -1;
            this.f1949f = null;
            this.f1944a = -1;
            this.f1947d = false;
            l lVar = this.f1946c;
            if (lVar.f1907e == this) {
                lVar.f1907e = null;
            }
            this.f1946c = null;
            this.f1945b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class x {

        /* renamed from: a  reason: collision with root package name */
        public int f1959a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f1960b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1961c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1962d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f1963e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1964f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1965g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1966h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1967i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1968j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1969k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f1970l;

        /* renamed from: m  reason: collision with root package name */
        public long f1971m;

        /* renamed from: n  reason: collision with root package name */
        public int f1972n;

        public final void a(int i6) {
            if ((this.f1962d & i6) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i6) + " but it is " + Integer.toBinaryString(this.f1962d));
        }

        public final int b() {
            return this.f1965g ? this.f1960b - this.f1961c : this.f1963e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f1959a + ", mData=null, mItemCount=" + this.f1963e + ", mIsMeasuring=" + this.f1967i + ", mPreviousLayoutItemCount=" + this.f1960b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1961c + ", mStructureChanged=" + this.f1964f + ", mInPreLayout=" + this.f1965g + ", mRunSimpleAnimations=" + this.f1968j + ", mRunPredictiveAnimations=" + this.f1969k + '}';
        }
    }

    /* loaded from: classes.dex */
    public static abstract class y {
    }

    /* loaded from: classes.dex */
    public class z implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public int f1973b;

        /* renamed from: c  reason: collision with root package name */
        public int f1974c;

        /* renamed from: d  reason: collision with root package name */
        public OverScroller f1975d;

        /* renamed from: e  reason: collision with root package name */
        public Interpolator f1976e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1977f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1978g;

        public z() {
            b bVar = RecyclerView.w0;
            this.f1976e = bVar;
            this.f1977f = false;
            this.f1978g = false;
            this.f1975d = new OverScroller(RecyclerView.this.getContext(), bVar);
        }

        public final void a() {
            if (this.f1977f) {
                this.f1978g = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.m(recyclerView, this);
        }

        public final void b(int i6, int i7, int i8, Interpolator interpolator) {
            boolean z5;
            int height;
            int i9;
            RecyclerView recyclerView = RecyclerView.this;
            if (i8 == Integer.MIN_VALUE) {
                int abs = Math.abs(i6);
                int abs2 = Math.abs(i7);
                if (abs > abs2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((i7 * i7) + (i6 * i6));
                if (z5) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                int i10 = height / 2;
                float f6 = height;
                float f7 = i10;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f6) - 0.5f) * 0.47123894f)) * f7) + f7;
                if (sqrt > 0) {
                    i9 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z5) {
                        abs = abs2;
                    }
                    i9 = (int) (((abs / f6) + 1.0f) * 300.0f);
                }
                i8 = Math.min(i9, 2000);
            }
            int i11 = i8;
            if (interpolator == null) {
                interpolator = RecyclerView.w0;
            }
            if (this.f1976e != interpolator) {
                this.f1976e = interpolator;
                this.f1975d = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f1974c = 0;
            this.f1973b = 0;
            recyclerView.setScrollState(2);
            this.f1975d.startScroll(0, 0, i6, i7, i11);
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i6;
            int i7;
            int i8;
            int i9;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            int i10;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1853m == null) {
                recyclerView.removeCallbacks(this);
                this.f1975d.abortAnimation();
                return;
            }
            this.f1978g = false;
            this.f1977f = true;
            recyclerView.m();
            OverScroller overScroller = this.f1975d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i11 = currX - this.f1973b;
                int i12 = currY - this.f1974c;
                this.f1973b = currX;
                this.f1974c = currY;
                int[] iArr = recyclerView.f1862q0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean s = recyclerView.s(i11, i12, iArr, null, 1);
                int[] iArr2 = recyclerView.f1862q0;
                if (s) {
                    i11 -= iArr2[0];
                    i12 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.l(i11, i12);
                }
                if (recyclerView.f1851l != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.Z(i11, i12, iArr2);
                    int i13 = iArr2[0];
                    int i14 = iArr2[1];
                    int i15 = i11 - i13;
                    int i16 = i12 - i14;
                    w wVar = recyclerView.f1853m.f1907e;
                    if (wVar != null && !wVar.f1947d && wVar.f1948e) {
                        int b6 = recyclerView.f1838e0.b();
                        if (b6 == 0) {
                            wVar.d();
                        } else {
                            if (wVar.f1944a >= b6) {
                                wVar.f1944a = b6 - 1;
                            }
                            wVar.b(i13, i14);
                        }
                    }
                    i9 = i13;
                    i6 = i15;
                    i7 = i16;
                    i8 = i14;
                } else {
                    i6 = i11;
                    i7 = i12;
                    i8 = 0;
                    i9 = 0;
                }
                if (!recyclerView.f1855n.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.f1862q0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i17 = i8;
                recyclerView.t(i9, i8, i6, i7, null, 1, iArr3);
                int i18 = i6 - iArr2[0];
                int i19 = i7 - iArr2[1];
                if (i9 != 0 || i17 != 0) {
                    recyclerView.u(i9, i17);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!overScroller.isFinished() && ((!z5 && i18 == 0) || (!z6 && i19 == 0))) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                w wVar2 = recyclerView.f1853m.f1907e;
                if (wVar2 != null && wVar2.f1947d) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8 && z7) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i18 < 0) {
                            i10 = -currVelocity;
                        } else if (i18 > 0) {
                            i10 = currVelocity;
                        } else {
                            i10 = 0;
                        }
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        if (i10 < 0) {
                            recyclerView.w();
                            if (recyclerView.F.isFinished()) {
                                recyclerView.F.onAbsorb(-i10);
                            }
                        } else if (i10 > 0) {
                            recyclerView.x();
                            if (recyclerView.H.isFinished()) {
                                recyclerView.H.onAbsorb(i10);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.y();
                            if (recyclerView.G.isFinished()) {
                                recyclerView.G.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.v();
                            if (recyclerView.I.isFinished()) {
                                recyclerView.I.onAbsorb(currVelocity);
                            }
                        }
                        if (i10 != 0 || currVelocity != 0) {
                            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                            g0.d.k(recyclerView);
                        }
                    }
                    m.b bVar = recyclerView.f1836d0;
                    int[] iArr4 = bVar.f2138c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    bVar.f2139d = 0;
                } else {
                    a();
                    androidx.recyclerview.widget.m mVar = recyclerView.f1834c0;
                    if (mVar != null) {
                        mVar.a(recyclerView, i9, i17);
                    }
                }
            }
            w wVar3 = recyclerView.f1853m.f1907e;
            if (wVar3 != null && wVar3.f1947d) {
                wVar3.b(0, 0);
            }
            this.f1977f = false;
            if (this.f1978g) {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                g0.d.m(recyclerView, this);
                return;
            }
            recyclerView.setScrollState(0);
            recyclerView.f0(1);
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        f1829v0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        w0 = new b();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:43)(10:80|(1:82)|45|46|47|(1:49)(1:64)|50|51|52|53)|46|47|(0)(0)|50|51|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x026e, code lost:
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0274, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0283, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0284, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02a4, code lost:
        throw new java.lang.IllegalStateException(r20.getPositionDescription() + ": Error creating LayoutManager " + r3, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0238 A[Catch: ClassCastException -> 0x02a5, IllegalAccessException -> 0x02c4, InstantiationException -> 0x02e3, InvocationTargetException -> 0x0300, ClassNotFoundException -> 0x031d, TryCatch #4 {ClassCastException -> 0x02a5, ClassNotFoundException -> 0x031d, IllegalAccessException -> 0x02c4, InstantiationException -> 0x02e3, InvocationTargetException -> 0x0300, blocks: (B:53:0x0232, B:55:0x0238, B:57:0x0245, B:58:0x0250, B:64:0x0275, B:62:0x026e, B:66:0x0284, B:67:0x02a4, B:56:0x0241), top: B:92:0x0232 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0241 A[Catch: ClassCastException -> 0x02a5, IllegalAccessException -> 0x02c4, InstantiationException -> 0x02e3, InvocationTargetException -> 0x0300, ClassNotFoundException -> 0x031d, TryCatch #4 {ClassCastException -> 0x02a5, ClassNotFoundException -> 0x031d, IllegalAccessException -> 0x02c4, InstantiationException -> 0x02e3, InvocationTargetException -> 0x0300, blocks: (B:53:0x0232, B:55:0x0238, B:57:0x0245, B:58:0x0250, B:64:0x0275, B:62:0x026e, B:66:0x0284, B:67:0x02a4, B:56:0x0241), top: B:92:0x0232 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static RecyclerView E(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                RecyclerView E = E(viewGroup.getChildAt(i6));
                if (E != null) {
                    return E;
                }
            }
            return null;
        }
        return null;
    }

    public static a0 J(View view) {
        if (view == null) {
            return null;
        }
        return ((m) view.getLayoutParams()).f1924a;
    }

    private f0.t getScrollingChildHelper() {
        if (this.f1856n0 == null) {
            this.f1856n0 = new f0.t(this);
        }
        return this.f1856n0;
    }

    public static void j(a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.f1874b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == a0Var.f1873a) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                a0Var.f1874b = null;
                return;
            }
        }
    }

    public final void A(x xVar) {
        if (getScrollState() != 2) {
            xVar.getClass();
            return;
        }
        OverScroller overScroller = this.f1832b0.f1975d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        xVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View B(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.View):android.view.View");
    }

    public final boolean C(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<p> arrayList = this.f1857o;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = arrayList.get(i6);
            if (pVar.b(motionEvent) && action != 3) {
                this.f1859p = pVar;
                return true;
            }
        }
        return false;
    }

    public final void D(int[] iArr) {
        int e6 = this.f1839f.e();
        if (e6 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = 0; i8 < e6; i8++) {
            a0 J = J(this.f1839f.d(i8));
            if (!J.o()) {
                int c6 = J.c();
                if (c6 < i6) {
                    i6 = c6;
                }
                if (c6 > i7) {
                    i7 = c6;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
    }

    public final a0 F(int i6) {
        a0 a0Var = null;
        if (this.A) {
            return null;
        }
        int h6 = this.f1839f.h();
        for (int i7 = 0; i7 < h6; i7++) {
            a0 J = J(this.f1839f.g(i7));
            if (J != null && !J.i() && G(J) == i6) {
                if (!this.f1839f.j(J.f1873a)) {
                    return J;
                }
                a0Var = J;
            }
        }
        return a0Var;
    }

    public final int G(a0 a0Var) {
        boolean z5;
        if ((a0Var.f1882j & 524) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 && a0Var.f()) {
            androidx.recyclerview.widget.a aVar = this.f1837e;
            int i6 = a0Var.f1875c;
            ArrayList<a.b> arrayList = aVar.f2021b;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                a.b bVar = arrayList.get(i7);
                int i8 = bVar.f2025a;
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 == 8) {
                            int i9 = bVar.f2026b;
                            if (i9 == i6) {
                                i6 = bVar.f2028d;
                            } else {
                                if (i9 < i6) {
                                    i6--;
                                }
                                if (bVar.f2028d <= i6) {
                                    i6++;
                                }
                            }
                        }
                    } else {
                        int i10 = bVar.f2026b;
                        if (i10 <= i6) {
                            int i11 = bVar.f2028d;
                            if (i10 + i11 <= i6) {
                                i6 -= i11;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (bVar.f2026b <= i6) {
                    i6 += bVar.f2028d;
                }
            }
            return i6;
        }
        return -1;
    }

    public final long H(a0 a0Var) {
        if (this.f1851l.f1893b) {
            return a0Var.f1877e;
        }
        return a0Var.f1875c;
    }

    public final a0 I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return J(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect K(View view) {
        m mVar = (m) view.getLayoutParams();
        boolean z5 = mVar.f1926c;
        Rect rect = mVar.f1925b;
        if (!z5) {
            return rect;
        }
        if (this.f1838e0.f1965g && (mVar.b() || mVar.f1924a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<k> arrayList = this.f1855n;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Rect rect2 = this.f1845i;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i6).getClass();
            ((m) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        mVar.f1926c = false;
        return rect;
    }

    public final boolean L() {
        return this.C > 0;
    }

    public final void M(int i6) {
        if (this.f1853m == null) {
            return;
        }
        setScrollState(2);
        this.f1853m.p0(i6);
        awakenScrollBars();
    }

    public final void N() {
        int h6 = this.f1839f.h();
        for (int i6 = 0; i6 < h6; i6++) {
            ((m) this.f1839f.g(i6).getLayoutParams()).f1926c = true;
        }
        ArrayList<a0> arrayList = this.f1833c.f1936c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) arrayList.get(i7).f1873a.getLayoutParams();
            if (mVar != null) {
                mVar.f1926c = true;
            }
        }
    }

    public final void O(int i6, int i7, boolean z5) {
        int i8 = i6 + i7;
        int h6 = this.f1839f.h();
        for (int i9 = 0; i9 < h6; i9++) {
            a0 J = J(this.f1839f.g(i9));
            if (J != null && !J.o()) {
                int i10 = J.f1875c;
                if (i10 >= i8) {
                    J.l(-i7, z5);
                } else if (i10 >= i6) {
                    J.b(8);
                    J.l(-i7, z5);
                    J.f1875c = i6 - 1;
                }
                this.f1838e0.f1964f = true;
            }
        }
        s sVar = this.f1833c;
        ArrayList<a0> arrayList = sVar.f1936c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                a0 a0Var = arrayList.get(size);
                if (a0Var != null) {
                    int i11 = a0Var.f1875c;
                    if (i11 >= i8) {
                        a0Var.l(-i7, z5);
                    } else if (i11 >= i6) {
                        a0Var.b(8);
                        sVar.e(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void P() {
        this.C++;
    }

    public final void Q(boolean z5) {
        int i6;
        boolean z6 = true;
        int i7 = this.C - 1;
        this.C = i7;
        if (i7 < 1) {
            this.C = 0;
            if (z5) {
                int i8 = this.f1869x;
                this.f1869x = 0;
                if (i8 != 0) {
                    AccessibilityManager accessibilityManager = this.f1870y;
                    if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : false) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        g0.b.b(obtain, i8);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.r0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    a0 a0Var = (a0) arrayList.get(size);
                    if (a0Var.f1873a.getParent() == this && !a0Var.o() && (i6 = a0Var.f1889q) != -1) {
                        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                        g0.d.s(a0Var.f1873a, i6);
                        a0Var.f1889q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.L) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.L = motionEvent.getPointerId(i6);
            int x5 = (int) (motionEvent.getX(i6) + 0.5f);
            this.P = x5;
            this.N = x5;
            int y5 = (int) (motionEvent.getY(i6) + 0.5f);
            this.Q = y5;
            this.O = y5;
        }
    }

    public final void S() {
        if (!this.f1850k0 && this.f1861q) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.m(this, this.f1864s0);
            this.f1850k0 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007d, code lost:
        if (r0 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() {
        /*
            r5 = this;
            boolean r0 = r5.A
            if (r0 == 0) goto L19
            androidx.recyclerview.widget.a r0 = r5.f1837e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2021b
            r0.l(r1)
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2022c
            r0.l(r1)
            boolean r0 = r5.B
            if (r0 == 0) goto L19
            androidx.recyclerview.widget.RecyclerView$l r0 = r5.f1853m
            r0.Y()
        L19:
            androidx.recyclerview.widget.RecyclerView$i r0 = r5.J
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L29
            androidx.recyclerview.widget.RecyclerView$l r0 = r5.f1853m
            boolean r0 = r0.B0()
            if (r0 == 0) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L32
            androidx.recyclerview.widget.a r0 = r5.f1837e
            r0.j()
            goto L37
        L32:
            androidx.recyclerview.widget.a r0 = r5.f1837e
            r0.c()
        L37:
            boolean r0 = r5.f1844h0
            if (r0 != 0) goto L42
            boolean r0 = r5.f1846i0
            if (r0 == 0) goto L40
            goto L42
        L40:
            r0 = r2
            goto L43
        L42:
            r0 = r1
        L43:
            boolean r3 = r5.s
            if (r3 == 0) goto L61
            androidx.recyclerview.widget.RecyclerView$i r3 = r5.J
            if (r3 == 0) goto L61
            boolean r3 = r5.A
            if (r3 != 0) goto L57
            if (r0 != 0) goto L57
            androidx.recyclerview.widget.RecyclerView$l r4 = r5.f1853m
            boolean r4 = r4.f1908f
            if (r4 == 0) goto L61
        L57:
            if (r3 == 0) goto L5f
            androidx.recyclerview.widget.RecyclerView$d r3 = r5.f1851l
            boolean r3 = r3.f1893b
            if (r3 == 0) goto L61
        L5f:
            r3 = r1
            goto L62
        L61:
            r3 = r2
        L62:
            androidx.recyclerview.widget.RecyclerView$x r4 = r5.f1838e0
            r4.f1968j = r3
            if (r3 == 0) goto L80
            if (r0 == 0) goto L80
            boolean r0 = r5.A
            if (r0 != 0) goto L80
            androidx.recyclerview.widget.RecyclerView$i r0 = r5.J
            if (r0 == 0) goto L7c
            androidx.recyclerview.widget.RecyclerView$l r0 = r5.f1853m
            boolean r0 = r0.B0()
            if (r0 == 0) goto L7c
            r0 = r1
            goto L7d
        L7c:
            r0 = r2
        L7d:
            if (r0 == 0) goto L80
            goto L81
        L80:
            r1 = r2
        L81:
            r4.f1969k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.T():void");
    }

    public final void U(boolean z5) {
        this.B = z5 | this.B;
        this.A = true;
        int h6 = this.f1839f.h();
        for (int i6 = 0; i6 < h6; i6++) {
            a0 J = J(this.f1839f.g(i6));
            if (J != null && !J.o()) {
                J.b(6);
            }
        }
        N();
        s sVar = this.f1833c;
        ArrayList<a0> arrayList = sVar.f1936c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            a0 a0Var = arrayList.get(i7);
            if (a0Var != null) {
                a0Var.b(6);
                a0Var.a(null);
            }
        }
        d dVar = RecyclerView.this.f1851l;
        if (dVar == null || !dVar.f1893b) {
            sVar.d();
        }
    }

    public final void V(a0 a0Var, i.c cVar) {
        boolean z5 = false;
        int i6 = (a0Var.f1882j & (-8193)) | 0;
        a0Var.f1882j = i6;
        boolean z6 = this.f1838e0.f1966h;
        c0 c0Var = this.f1841g;
        if (z6) {
            if ((i6 & 2) != 0) {
                z5 = true;
            }
            if (z5 && !a0Var.i() && !a0Var.o()) {
                c0Var.f2048b.f(H(a0Var), a0Var);
            }
        }
        l.h<a0, c0.a> hVar = c0Var.f2047a;
        c0.a orDefault = hVar.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = c0.a.a();
            hVar.put(a0Var, orDefault);
        }
        orDefault.f2051b = cVar;
        orDefault.f2050a |= 4;
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1845i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m) {
            m mVar = (m) layoutParams;
            if (!mVar.f1926c) {
                int i6 = rect.left;
                Rect rect2 = mVar.f1925b;
                rect.left = i6 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1853m.m0(this, view, this.f1845i, !this.s, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z5 = false;
        f0(0);
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z5 = this.F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.G;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z5 |= this.G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.H;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z5 |= this.H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.I;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z5 |= this.I.isFinished();
        }
        if (z5) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y(int r22, int r23, android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent):boolean");
    }

    public final void Z(int i6, int i7, int[] iArr) {
        int i8;
        int i9;
        a0 a0Var;
        d0();
        P();
        int i10 = b0.h.f2267a;
        h.a.a("RV Scroll");
        x xVar = this.f1838e0;
        A(xVar);
        s sVar = this.f1833c;
        if (i6 != 0) {
            i8 = this.f1853m.o0(i6, sVar, xVar);
        } else {
            i8 = 0;
        }
        if (i7 != 0) {
            i9 = this.f1853m.q0(i7, sVar, xVar);
        } else {
            i9 = 0;
        }
        h.a.b();
        int e6 = this.f1839f.e();
        for (int i11 = 0; i11 < e6; i11++) {
            View d6 = this.f1839f.d(i11);
            a0 I = I(d6);
            if (I != null && (a0Var = I.f1881i) != null) {
                int left = d6.getLeft();
                int top = d6.getTop();
                View view = a0Var.f1873a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        e0(false);
        if (iArr != null) {
            iArr[0] = i8;
            iArr[1] = i9;
        }
    }

    public final void a0(int i6) {
        w wVar;
        if (this.f1867v) {
            return;
        }
        setScrollState(0);
        z zVar = this.f1832b0;
        RecyclerView.this.removeCallbacks(zVar);
        zVar.f1975d.abortAnimation();
        l lVar = this.f1853m;
        if (lVar != null && (wVar = lVar.f1907e) != null) {
            wVar.d();
        }
        l lVar2 = this.f1853m;
        if (lVar2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        lVar2.p0(i6);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i6, int i7) {
        l lVar = this.f1853m;
        if (lVar != null) {
            lVar.getClass();
        }
        super.addFocusables(arrayList, i6, i7);
    }

    public final void b0(int i6, int i7, boolean z5) {
        l lVar = this.f1853m;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f1867v) {
        } else {
            int i8 = 0;
            if (!lVar.d()) {
                i6 = 0;
            }
            if (!this.f1853m.e()) {
                i7 = 0;
            }
            if (i6 != 0 || i7 != 0) {
                if (z5) {
                    if (i6 != 0) {
                        i8 = 1;
                    }
                    if (i7 != 0) {
                        i8 |= 2;
                    }
                    getScrollingChildHelper().g(i8, 1);
                }
                this.f1832b0.b(i6, i7, Integer.MIN_VALUE, null);
            }
        }
    }

    public final void c0(int i6) {
        if (this.f1867v) {
            return;
        }
        l lVar = this.f1853m;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lVar.z0(this, i6);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m) && this.f1853m.f((m) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        l lVar = this.f1853m;
        if (lVar != null && lVar.d()) {
            return this.f1853m.j(this.f1838e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        l lVar = this.f1853m;
        if (lVar != null && lVar.d()) {
            return this.f1853m.k(this.f1838e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        l lVar = this.f1853m;
        if (lVar != null && lVar.d()) {
            return this.f1853m.l(this.f1838e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        l lVar = this.f1853m;
        if (lVar != null && lVar.e()) {
            return this.f1853m.m(this.f1838e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        l lVar = this.f1853m;
        if (lVar != null && lVar.e()) {
            return this.f1853m.n(this.f1838e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        l lVar = this.f1853m;
        if (lVar != null && lVar.e()) {
            return this.f1853m.o(this.f1838e0);
        }
        return 0;
    }

    public final void d0() {
        int i6 = this.f1865t + 1;
        this.f1865t = i6;
        if (i6 != 1 || this.f1867v) {
            return;
        }
        this.u = false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return getScrollingChildHelper().a(f6, f7, z5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return getScrollingChildHelper().b(f6, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i6, i7, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return getScrollingChildHelper().e(i6, i7, i8, i9, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z5;
        float f6;
        float f7;
        int i6;
        boolean z6;
        boolean z7;
        int i7;
        super.draw(canvas);
        ArrayList<k> arrayList = this.f1855n;
        int size = arrayList.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.get(i8).e(canvas);
        }
        EdgeEffect edgeEffect = this.F;
        boolean z9 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f1843h) {
                i7 = getPaddingBottom();
            } else {
                i7 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i7, 0.0f);
            EdgeEffect edgeEffect2 = this.F;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z5 = true;
            } else {
                z5 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect3 = this.G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1843h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.G;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z7 = true;
            } else {
                z7 = false;
            }
            z5 |= z7;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.H;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f1843h) {
                i6 = getPaddingTop();
            } else {
                i6 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(-i6, -width);
            EdgeEffect edgeEffect6 = this.H;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z6 = true;
            } else {
                z6 = false;
            }
            z5 |= z6;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.I;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1843h) {
                f6 = getPaddingRight() + (-getWidth());
                f7 = getPaddingBottom() + (-getHeight());
            } else {
                f6 = -getWidth();
                f7 = -getHeight();
            }
            canvas.translate(f6, f7);
            EdgeEffect edgeEffect8 = this.I;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z8 = true;
            }
            z5 |= z8;
            canvas.restoreToCount(save4);
        }
        if (z5 || this.J == null || arrayList.size() <= 0 || !this.J.f()) {
            z9 = z5;
        }
        if (z9) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        return super.drawChild(canvas, view, j5);
    }

    public final void e0(boolean z5) {
        if (this.f1865t < 1) {
            this.f1865t = 1;
        }
        if (!z5 && !this.f1867v) {
            this.u = false;
        }
        if (this.f1865t == 1) {
            if (z5 && this.u && !this.f1867v && this.f1853m != null && this.f1851l != null) {
                p();
            }
            if (!this.f1867v) {
                this.u = false;
            }
        }
        this.f1865t--;
    }

    public final void f(a0 a0Var) {
        boolean z5;
        View view = a0Var.f1873a;
        if (view.getParent() == this) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f1833c.j(I(view));
        if (a0Var.k()) {
            this.f1839f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.f1839f;
        if (!z5) {
            bVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((androidx.recyclerview.widget.v) bVar.f2033a).f2169a.indexOfChild(view);
        if (indexOfChild >= 0) {
            bVar.f2034b.h(indexOfChild);
            bVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void f0(int i6) {
        getScrollingChildHelper().h(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0158, code lost:
        if (r4 > 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0176, code lost:
        if (r3 > 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0179, code lost:
        if (r4 < 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x017c, code lost:
        if (r3 < 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0184, code lost:
        if ((r3 * r2) < 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x018c, code lost:
        if ((r3 * r2) > 0) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(k kVar) {
        l lVar = this.f1853m;
        if (lVar != null) {
            lVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<k> arrayList = this.f1855n;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(kVar);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = this.f1853m;
        if (lVar != null) {
            return lVar.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l lVar = this.f1853m;
        if (lVar != null) {
            return lVar.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l lVar = this.f1853m;
        if (lVar != null) {
            return lVar.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public d getAdapter() {
        return this.f1851l;
    }

    @Override // android.view.View
    public int getBaseline() {
        l lVar = this.f1853m;
        if (lVar != null) {
            lVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i7) {
        return super.getChildDrawingOrder(i6, i7);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1843h;
    }

    public androidx.recyclerview.widget.x getCompatAccessibilityDelegate() {
        return this.f1852l0;
    }

    public h getEdgeEffectFactory() {
        return this.E;
    }

    public i getItemAnimator() {
        return this.J;
    }

    public int getItemDecorationCount() {
        return this.f1855n.size();
    }

    public l getLayoutManager() {
        return this.f1853m;
    }

    public int getMaxFlingVelocity() {
        return this.U;
    }

    public int getMinFlingVelocity() {
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public o getOnFlingListener() {
        return this.S;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1830a0;
    }

    public r getRecycledViewPool() {
        return this.f1833c.c();
    }

    public int getScrollState() {
        return this.K;
    }

    public final void h(q qVar) {
        if (this.f1842g0 == null) {
            this.f1842g0 = new ArrayList();
        }
        this.f1842g0.add(qVar);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().f(0) == null) {
            return false;
        }
        return true;
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + z());
        } else if (this.D > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + z()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1861q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1867v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3916d;
    }

    public final void k() {
        int h6 = this.f1839f.h();
        for (int i6 = 0; i6 < h6; i6++) {
            a0 J = J(this.f1839f.g(i6));
            if (!J.o()) {
                J.f1876d = -1;
                J.f1879g = -1;
            }
        }
        s sVar = this.f1833c;
        ArrayList<a0> arrayList = sVar.f1936c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            a0 a0Var = arrayList.get(i7);
            a0Var.f1876d = -1;
            a0Var.f1879g = -1;
        }
        ArrayList<a0> arrayList2 = sVar.f1934a;
        int size2 = arrayList2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            a0 a0Var2 = arrayList2.get(i8);
            a0Var2.f1876d = -1;
            a0Var2.f1879g = -1;
        }
        ArrayList<a0> arrayList3 = sVar.f1935b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i9 = 0; i9 < size3; i9++) {
                a0 a0Var3 = sVar.f1935b.get(i9);
                a0Var3.f1876d = -1;
                a0Var3.f1879g = -1;
            }
        }
    }

    public final void l(int i6, int i7) {
        boolean z5;
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect != null && !edgeEffect.isFinished() && i6 > 0) {
            this.F.onRelease();
            z5 = this.F.isFinished();
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.H;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i6 < 0) {
            this.H.onRelease();
            z5 |= this.H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i7 > 0) {
            this.G.onRelease();
            z5 |= this.G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.I;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i7 < 0) {
            this.I.onRelease();
            z5 |= this.I.isFinished();
        }
        if (z5) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.k(this);
        }
    }

    public final void m() {
        if (this.s && !this.A) {
            if (!this.f1837e.g()) {
                return;
            }
            this.f1837e.getClass();
            if (this.f1837e.g()) {
                int i6 = b0.h.f2267a;
                h.a.a("RV FullInvalidate");
                p();
                h.a.b();
                return;
            }
            return;
        }
        int i7 = b0.h.f2267a;
        h.a.a("RV FullInvalidate");
        p();
        h.a.b();
    }

    public final void n(int i6, int i7) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        setMeasuredDimension(l.g(i6, paddingRight, g0.d.e(this)), l.g(i7, getPaddingBottom() + getPaddingTop(), g0.d.d(this)));
    }

    public final void o(View view) {
        J(view);
        d dVar = this.f1851l;
        ArrayList arrayList = this.f1871z;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((n) this.f1871z.get(size)).b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r1 >= 30.0f) goto L16;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.C = r0
            r1 = 1
            r5.f1861q = r1
            boolean r2 = r5.s
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.s = r2
            androidx.recyclerview.widget.RecyclerView$l r2 = r5.f1853m
            if (r2 == 0) goto L1e
            r2.f1909g = r1
        L1e:
            r5.f1850k0 = r0
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.m.f2130f
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.m) r1
            r5.f1834c0 = r1
            if (r1 != 0) goto L5a
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.f1834c0 = r1
            java.util.WeakHashMap<android.view.View, f0.r0> r1 = f0.g0.f3878a
            android.view.Display r1 = f0.g0.e.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4c
            if (r1 == 0) goto L4c
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4c
            goto L4e
        L4c:
            r1 = 1114636288(0x42700000, float:60.0)
        L4e:
            androidx.recyclerview.widget.m r2 = r5.f1834c0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f2134d = r3
            r0.set(r2)
        L5a:
            androidx.recyclerview.widget.m r0 = r5.f1834c0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f2132b
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        w wVar;
        super.onDetachedFromWindow();
        i iVar = this.J;
        if (iVar != null) {
            iVar.e();
        }
        setScrollState(0);
        z zVar = this.f1832b0;
        RecyclerView.this.removeCallbacks(zVar);
        zVar.f1975d.abortAnimation();
        l lVar = this.f1853m;
        if (lVar != null && (wVar = lVar.f1907e) != null) {
            wVar.d();
        }
        this.f1861q = false;
        l lVar2 = this.f1853m;
        if (lVar2 != null) {
            lVar2.f1909g = false;
            lVar2.R(this);
        }
        this.r0.clear();
        removeCallbacks(this.f1864s0);
        this.f1841g.getClass();
        do {
        } while (c0.a.f2049d.b() != null);
        androidx.recyclerview.widget.m mVar = this.f1834c0;
        if (mVar != null) {
            mVar.f2132b.remove(this);
            this.f1834c0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<k> arrayList = this.f1855n;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).d(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r5.f1853m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f1867v
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$l r0 = r5.f1853m
            boolean r0 = r0.e()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$l r3 = r5.f1853m
            boolean r3 = r3.d()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$l r3 = r5.f1853m
            boolean r3 = r3.e()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$l r3 = r5.f1853m
            boolean r3 = r3.d()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.V
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.W
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.Y(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        if (this.f1867v) {
            return false;
        }
        this.f1859p = null;
        if (C(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        l lVar = this.f1853m;
        if (lVar == null) {
            return false;
        }
        boolean d6 = lVar.d();
        boolean e6 = this.f1853m.e();
        if (this.M == null) {
            this.M = VelocityTracker.obtain();
        }
        this.M.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                R(motionEvent);
                            }
                        } else {
                            this.L = motionEvent.getPointerId(actionIndex);
                            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.P = x5;
                            this.N = x5;
                            int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.Q = y5;
                            this.O = y5;
                        }
                    } else {
                        X();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.L);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.L + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x6 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y6 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.K != 1) {
                        int i6 = x6 - this.N;
                        int i7 = y6 - this.O;
                        if (d6 && Math.abs(i6) > this.R) {
                            this.P = x6;
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (e6 && Math.abs(i7) > this.R) {
                            this.Q = y6;
                            z5 = true;
                        }
                        if (z5) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.M.clear();
                f0(0);
            }
        } else {
            if (this.f1868w) {
                this.f1868w = false;
            }
            this.L = motionEvent.getPointerId(0);
            int x7 = (int) (motionEvent.getX() + 0.5f);
            this.P = x7;
            this.N = x7;
            int y7 = (int) (motionEvent.getY() + 0.5f);
            this.Q = y7;
            this.O = y7;
            if (this.K == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                f0(1);
            }
            int[] iArr = this.f1860p0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i8 = d6;
            if (e6) {
                i8 = (d6 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        }
        if (this.K != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int i10 = b0.h.f2267a;
        h.a.a("RV OnLayout");
        p();
        h.a.b();
        this.s = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        l lVar = this.f1853m;
        if (lVar == null) {
            n(i6, i7);
            return;
        }
        boolean M = lVar.M();
        boolean z5 = false;
        x xVar = this.f1838e0;
        if (M) {
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i7);
            this.f1853m.f1904b.n(i6, i7);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z5 = true;
            }
            if (!z5 && this.f1851l != null) {
                if (xVar.f1962d == 1) {
                    q();
                }
                this.f1853m.s0(i6, i7);
                xVar.f1967i = true;
                r();
                this.f1853m.u0(i6, i7);
                if (this.f1853m.x0()) {
                    this.f1853m.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    xVar.f1967i = true;
                    r();
                    this.f1853m.u0(i6, i7);
                }
            }
        } else if (this.f1863r) {
            this.f1853m.f1904b.n(i6, i7);
        } else if (xVar.f1969k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            d dVar = this.f1851l;
            if (dVar != null) {
                xVar.f1963e = dVar.c();
            } else {
                xVar.f1963e = 0;
            }
            d0();
            this.f1853m.f1904b.n(i6, i7);
            e0(false);
            xVar.f1965g = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i6, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        this.f1835d = vVar;
        super.onRestoreInstanceState(vVar.f5073b);
        l lVar = this.f1853m;
        if (lVar != null && (parcelable2 = this.f1835d.f1943d) != null) {
            lVar.e0(parcelable2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        v vVar = new v(super.onSaveInstanceState());
        v vVar2 = this.f1835d;
        if (vVar2 != null) {
            vVar.f1943d = vVar2.f1943d;
        } else {
            l lVar = this.f1853m;
            if (lVar != null) {
                parcelable = lVar.f0();
            } else {
                parcelable = null;
            }
            vVar.f1943d = parcelable;
        }
        return vVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        if (i6 != i8 || i7 != i9) {
            this.I = null;
            this.G = null;
            this.H = null;
            this.F = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x0336, code lost:
        if (r0 < r8) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x022d, code lost:
        if (r15.J.a(r10, r10, r5, r6) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0251, code lost:
        if (r5 != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0253, code lost:
        r15.S();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03a9, code lost:
        if (r18.f1839f.j(getFocusedChild()) == false) goto L246;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.recyclerview.widget.RecyclerView$a0] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        View view;
        a0 a0Var;
        int G;
        View view2;
        int id;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        View B;
        x xVar = this.f1838e0;
        xVar.a(1);
        A(xVar);
        xVar.f1967i = false;
        d0();
        c0 c0Var = this.f1841g;
        c0Var.f2047a.clear();
        c0Var.f2048b.a();
        P();
        T();
        if (this.f1830a0 && hasFocus() && this.f1851l != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view == null || (B = B(view)) == null) {
            a0Var = null;
        } else {
            a0Var = I(B);
        }
        long j5 = -1;
        if (a0Var == null) {
            xVar.f1971m = -1L;
            xVar.f1970l = -1;
            xVar.f1972n = -1;
        } else {
            if (this.f1851l.f1893b) {
                j5 = a0Var.f1877e;
            }
            xVar.f1971m = j5;
            if (!this.A) {
                if (a0Var.i()) {
                    G = a0Var.f1876d;
                } else {
                    RecyclerView recyclerView = a0Var.f1890r;
                    if (recyclerView != null) {
                        G = recyclerView.G(a0Var);
                    }
                }
                xVar.f1970l = G;
                view2 = a0Var.f1873a;
                loop3: while (true) {
                    id = view2.getId();
                    while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                        view2 = ((ViewGroup) view2).getFocusedChild();
                        if (view2.getId() != -1) {
                            break;
                        }
                    }
                }
                xVar.f1972n = id;
            }
            G = -1;
            xVar.f1970l = G;
            view2 = a0Var.f1873a;
            loop3: while (true) {
                id = view2.getId();
                while (!view2.isFocused()) {
                    view2 = ((ViewGroup) view2).getFocusedChild();
                    if (view2.getId() != -1) {
                        break;
                    }
                }
            }
            xVar.f1972n = id;
        }
        if (xVar.f1968j && this.f1846i0) {
            z5 = true;
        } else {
            z5 = false;
        }
        xVar.f1966h = z5;
        this.f1846i0 = false;
        this.f1844h0 = false;
        xVar.f1965g = xVar.f1969k;
        xVar.f1963e = this.f1851l.c();
        D(this.f1854m0);
        boolean z9 = xVar.f1968j;
        l.h<a0, c0.a> hVar = c0Var.f2047a;
        if (z9) {
            int e6 = this.f1839f.e();
            for (int i6 = 0; i6 < e6; i6++) {
                a0 J = J(this.f1839f.d(i6));
                if (!J.o() && (!J.g() || this.f1851l.f1893b)) {
                    i iVar = this.J;
                    i.b(J);
                    J.d();
                    iVar.getClass();
                    i.c cVar = new i.c();
                    cVar.a(J);
                    c0.a orDefault = hVar.getOrDefault(J, null);
                    if (orDefault == null) {
                        orDefault = c0.a.a();
                        hVar.put(J, orDefault);
                    }
                    orDefault.f2051b = cVar;
                    orDefault.f2050a |= 4;
                    if (xVar.f1966h) {
                        if ((J.f1882j & 2) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8 && !J.i() && !J.o() && !J.g()) {
                            c0Var.f2048b.f(H(J), J);
                        }
                    }
                }
            }
        }
        if (xVar.f1969k) {
            int h6 = this.f1839f.h();
            for (int i7 = 0; i7 < h6; i7++) {
                a0 J2 = J(this.f1839f.g(i7));
                if (!J2.o() && J2.f1876d == -1) {
                    J2.f1876d = J2.f1875c;
                }
            }
            boolean z10 = xVar.f1964f;
            xVar.f1964f = false;
            this.f1853m.c0(this.f1833c, xVar);
            xVar.f1964f = z10;
            for (int i8 = 0; i8 < this.f1839f.e(); i8++) {
                a0 J3 = J(this.f1839f.d(i8));
                if (!J3.o()) {
                    c0.a orDefault2 = hVar.getOrDefault(J3, null);
                    if (orDefault2 != null && (orDefault2.f2050a & 4) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        i.b(J3);
                        if ((J3.f1882j & 8192) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        i iVar2 = this.J;
                        J3.d();
                        iVar2.getClass();
                        i.c cVar2 = new i.c();
                        cVar2.a(J3);
                        if (z7) {
                            V(J3, cVar2);
                        } else {
                            c0.a orDefault3 = hVar.getOrDefault(J3, null);
                            if (orDefault3 == null) {
                                orDefault3 = c0.a.a();
                                hVar.put(J3, orDefault3);
                            }
                            orDefault3.f2050a |= 2;
                            orDefault3.f2051b = cVar2;
                        }
                    }
                }
            }
        }
        k();
        Q(true);
        e0(false);
        xVar.f1962d = 2;
    }

    public final void r() {
        boolean z5;
        d0();
        P();
        x xVar = this.f1838e0;
        xVar.a(6);
        this.f1837e.c();
        xVar.f1963e = this.f1851l.c();
        xVar.f1961c = 0;
        xVar.f1965g = false;
        this.f1853m.c0(this.f1833c, xVar);
        xVar.f1964f = false;
        this.f1835d = null;
        if (xVar.f1968j && this.J != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        xVar.f1968j = z5;
        xVar.f1962d = 4;
        Q(true);
        e0(false);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z5) {
        a0 J = J(view);
        if (J != null) {
            if (J.k()) {
                J.f1882j &= -257;
            } else if (!J.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + J + z());
            }
        }
        view.clearAnimation();
        o(view);
        super.removeDetachedView(view, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z5;
        w wVar = this.f1853m.f1907e;
        boolean z6 = true;
        if (wVar != null && wVar.f1948e) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 && !L()) {
            z6 = false;
        }
        if (!z6 && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        return this.f1853m.m0(this, view, rect, z5, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        ArrayList<p> arrayList = this.f1857o;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).c();
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1865t != 0 || this.f1867v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    public final boolean s(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        return getScrollingChildHelper().c(i6, i7, iArr, iArr2, i8);
    }

    @Override // android.view.View
    public final void scrollBy(int i6, int i7) {
        l lVar = this.f1853m;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f1867v) {
        } else {
            boolean d6 = lVar.d();
            boolean e6 = this.f1853m.e();
            if (d6 || e6) {
                if (!d6) {
                    i6 = 0;
                }
                if (!e6) {
                    i7 = 0;
                }
                Y(i6, i7, null);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i6, int i7) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i6;
        int i7 = 0;
        if (L()) {
            if (accessibilityEvent != null) {
                i6 = g0.b.a(accessibilityEvent);
            } else {
                i6 = 0;
            }
            if (i6 != 0) {
                i7 = i6;
            }
            this.f1869x |= i7;
            i7 = 1;
        }
        if (i7 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.x xVar) {
        this.f1852l0 = xVar;
        g0.l(this, xVar);
    }

    public void setAdapter(d dVar) {
        setLayoutFrozen(false);
        d dVar2 = this.f1851l;
        u uVar = this.f1831b;
        if (dVar2 != null) {
            dVar2.f1892a.unregisterObserver(uVar);
            this.f1851l.h(this);
        }
        i iVar = this.J;
        if (iVar != null) {
            iVar.e();
        }
        l lVar = this.f1853m;
        s sVar = this.f1833c;
        if (lVar != null) {
            lVar.i0(sVar);
            this.f1853m.j0(sVar);
        }
        sVar.f1934a.clear();
        sVar.d();
        androidx.recyclerview.widget.a aVar = this.f1837e;
        aVar.l(aVar.f2021b);
        aVar.l(aVar.f2022c);
        d dVar3 = this.f1851l;
        this.f1851l = dVar;
        if (dVar != null) {
            dVar.f1892a.registerObserver(uVar);
            dVar.e(this);
        }
        d dVar4 = this.f1851l;
        sVar.f1934a.clear();
        sVar.d();
        r c6 = sVar.c();
        if (dVar3 != null) {
            c6.f1929b--;
        }
        if (c6.f1929b == 0) {
            int i6 = 0;
            while (true) {
                SparseArray<r.a> sparseArray = c6.f1928a;
                if (i6 >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i6).f1930a.clear();
                i6++;
            }
        }
        if (dVar4 != null) {
            c6.f1929b++;
        }
        this.f1838e0.f1964f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g gVar) {
        if (gVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z5) {
        if (z5 != this.f1843h) {
            this.I = null;
            this.G = null;
            this.H = null;
            this.F = null;
        }
        this.f1843h = z5;
        super.setClipToPadding(z5);
        if (this.s) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h hVar) {
        hVar.getClass();
        this.E = hVar;
        this.I = null;
        this.G = null;
        this.H = null;
        this.F = null;
    }

    public void setHasFixedSize(boolean z5) {
        this.f1863r = z5;
    }

    public void setItemAnimator(i iVar) {
        i iVar2 = this.J;
        if (iVar2 != null) {
            iVar2.e();
            this.J.f1894a = null;
        }
        this.J = iVar;
        if (iVar != null) {
            iVar.f1894a = this.f1848j0;
        }
    }

    public void setItemViewCacheSize(int i6) {
        s sVar = this.f1833c;
        sVar.f1938e = i6;
        sVar.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z5) {
        suppressLayout(z5);
    }

    public void setLayoutManager(l lVar) {
        b.InterfaceC0015b interfaceC0015b;
        RecyclerView recyclerView;
        w wVar;
        if (lVar == this.f1853m) {
            return;
        }
        int i6 = 0;
        setScrollState(0);
        z zVar = this.f1832b0;
        RecyclerView.this.removeCallbacks(zVar);
        zVar.f1975d.abortAnimation();
        l lVar2 = this.f1853m;
        if (lVar2 != null && (wVar = lVar2.f1907e) != null) {
            wVar.d();
        }
        l lVar3 = this.f1853m;
        s sVar = this.f1833c;
        if (lVar3 != null) {
            i iVar = this.J;
            if (iVar != null) {
                iVar.e();
            }
            this.f1853m.i0(sVar);
            this.f1853m.j0(sVar);
            sVar.f1934a.clear();
            sVar.d();
            if (this.f1861q) {
                l lVar4 = this.f1853m;
                lVar4.f1909g = false;
                lVar4.R(this);
            }
            this.f1853m.v0(null);
            this.f1853m = null;
        } else {
            sVar.f1934a.clear();
            sVar.d();
        }
        androidx.recyclerview.widget.b bVar = this.f1839f;
        bVar.f2034b.g();
        ArrayList arrayList = bVar.f2035c;
        int size = arrayList.size();
        while (true) {
            size--;
            interfaceC0015b = bVar.f2033a;
            if (size < 0) {
                break;
            }
            androidx.recyclerview.widget.v vVar = (androidx.recyclerview.widget.v) interfaceC0015b;
            vVar.getClass();
            a0 J = J((View) arrayList.get(size));
            if (J != null) {
                int i7 = J.f1888p;
                RecyclerView recyclerView2 = vVar.f2169a;
                if (recyclerView2.L()) {
                    J.f1889q = i7;
                    recyclerView2.r0.add(J);
                } else {
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    g0.d.s(J.f1873a, i7);
                }
                J.f1888p = 0;
            }
            arrayList.remove(size);
        }
        androidx.recyclerview.widget.v vVar2 = (androidx.recyclerview.widget.v) interfaceC0015b;
        int a6 = vVar2.a();
        while (true) {
            recyclerView = vVar2.f2169a;
            if (i6 >= a6) {
                break;
            }
            View childAt = recyclerView.getChildAt(i6);
            recyclerView.o(childAt);
            childAt.clearAnimation();
            i6++;
        }
        recyclerView.removeAllViews();
        this.f1853m = lVar;
        if (lVar != null) {
            if (lVar.f1904b == null) {
                lVar.v0(this);
                if (this.f1861q) {
                    this.f1853m.f1909g = true;
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + lVar + " is already attached to a RecyclerView:" + lVar.f1904b.z());
            }
        }
        sVar.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        f0.t scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3916d) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.i.z(scrollingChildHelper.f3915c);
        }
        scrollingChildHelper.f3916d = z5;
    }

    public void setOnFlingListener(o oVar) {
        this.S = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.f1840f0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z5) {
        this.f1830a0 = z5;
    }

    public void setRecycledViewPool(r rVar) {
        r rVar2;
        s sVar = this.f1833c;
        if (sVar.f1940g != null) {
            rVar2.f1929b--;
        }
        sVar.f1940g = rVar;
        if (rVar != null && RecyclerView.this.getAdapter() != null) {
            sVar.f1940g.f1929b++;
        }
    }

    public void setRecyclerListener(t tVar) {
    }

    void setScrollState(int i6) {
        w wVar;
        if (i6 == this.K) {
            return;
        }
        this.K = i6;
        if (i6 != 2) {
            z zVar = this.f1832b0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f1975d.abortAnimation();
            l lVar = this.f1853m;
            if (lVar != null && (wVar = lVar.f1907e) != null) {
                wVar.d();
            }
        }
        l lVar2 = this.f1853m;
        if (lVar2 != null) {
            lVar2.g0(i6);
        }
        q qVar = this.f1840f0;
        if (qVar != null) {
            qVar.a(i6, this);
        }
        ArrayList arrayList = this.f1842g0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((q) this.f1842g0.get(size)).a(i6, this);
                } else {
                    return;
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i6) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i6 != 0) {
            if (i6 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.R = scaledTouchSlop;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i6 + "; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.R = scaledTouchSlop;
    }

    public void setViewCacheExtension(y yVar) {
        this.f1833c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i6) {
        return getScrollingChildHelper().g(i6, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z5) {
        w wVar;
        if (z5 != this.f1867v) {
            i("Do not suppressLayout in layout or scroll");
            if (!z5) {
                this.f1867v = false;
                if (this.u && this.f1853m != null && this.f1851l != null) {
                    requestLayout();
                }
                this.u = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1867v = true;
            this.f1868w = true;
            setScrollState(0);
            z zVar = this.f1832b0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f1975d.abortAnimation();
            l lVar = this.f1853m;
            if (lVar != null && (wVar = lVar.f1907e) != null) {
                wVar.d();
            }
        }
    }

    public final void t(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        getScrollingChildHelper().e(i6, i7, i8, i9, iArr, i10, iArr2);
    }

    public final void u(int i6, int i7) {
        this.D++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i6, scrollY - i7);
        q qVar = this.f1840f0;
        if (qVar != null) {
            qVar.b(this, i6, i7);
        }
        ArrayList arrayList = this.f1842g0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((q) this.f1842g0.get(size)).b(this, i6, i7);
            }
        }
        this.D--;
    }

    public final void v() {
        int measuredWidth;
        int measuredHeight;
        if (this.I != null) {
            return;
        }
        this.E.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I = edgeEffect;
        if (this.f1843h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final void w() {
        int measuredHeight;
        int measuredWidth;
        if (this.F != null) {
            return;
        }
        this.E.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.f1843h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void x() {
        int measuredHeight;
        int measuredWidth;
        if (this.H != null) {
            return;
        }
        this.E.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.H = edgeEffect;
        if (this.f1843h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void y() {
        int measuredWidth;
        int measuredHeight;
        if (this.G != null) {
            return;
        }
        this.E.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.G = edgeEffect;
        if (this.f1843h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final String z() {
        return " " + super.toString() + ", adapter:" + this.f1851l + ", layout:" + this.f1853m + ", context:" + getContext();
    }
}
