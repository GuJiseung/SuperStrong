package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import f0.g0;
import f0.r0;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0015b f2033a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2034b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2035c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f2036a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f2037b;

        public final void a(int i6) {
            if (i6 < 64) {
                this.f2036a &= ~(1 << i6);
                return;
            }
            a aVar = this.f2037b;
            if (aVar != null) {
                aVar.a(i6 - 64);
            }
        }

        public final int b(int i6) {
            long j5;
            a aVar = this.f2037b;
            if (aVar == null) {
                if (i6 >= 64) {
                    j5 = this.f2036a;
                    return Long.bitCount(j5);
                }
            } else if (i6 >= 64) {
                return Long.bitCount(this.f2036a) + aVar.b(i6 - 64);
            }
            j5 = this.f2036a & ((1 << i6) - 1);
            return Long.bitCount(j5);
        }

        public final void c() {
            if (this.f2037b == null) {
                this.f2037b = new a();
            }
        }

        public final boolean d(int i6) {
            if (i6 < 64) {
                return (this.f2036a & (1 << i6)) != 0;
            }
            c();
            return this.f2037b.d(i6 - 64);
        }

        public final void e(int i6, boolean z5) {
            if (i6 >= 64) {
                c();
                this.f2037b.e(i6 - 64, z5);
                return;
            }
            long j5 = this.f2036a;
            boolean z6 = (Long.MIN_VALUE & j5) != 0;
            long j6 = (1 << i6) - 1;
            this.f2036a = ((j5 & (~j6)) << 1) | (j5 & j6);
            if (z5) {
                h(i6);
            } else {
                a(i6);
            }
            if (z6 || this.f2037b != null) {
                c();
                this.f2037b.e(0, z6);
            }
        }

        public final boolean f(int i6) {
            if (i6 >= 64) {
                c();
                return this.f2037b.f(i6 - 64);
            }
            long j5 = 1 << i6;
            long j6 = this.f2036a;
            boolean z5 = (j6 & j5) != 0;
            long j7 = j6 & (~j5);
            this.f2036a = j7;
            long j8 = j5 - 1;
            this.f2036a = (j7 & j8) | Long.rotateRight((~j8) & j7, 1);
            a aVar = this.f2037b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2037b.f(0);
            }
            return z5;
        }

        public final void g() {
            this.f2036a = 0L;
            a aVar = this.f2037b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i6) {
            if (i6 < 64) {
                this.f2036a |= 1 << i6;
                return;
            }
            c();
            this.f2037b.h(i6 - 64);
        }

        public final String toString() {
            if (this.f2037b == null) {
                return Long.toBinaryString(this.f2036a);
            }
            return this.f2037b.toString() + "xx" + Long.toBinaryString(this.f2036a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0015b {
    }

    public b(v vVar) {
        this.f2033a = vVar;
    }

    public final void a(View view, int i6, boolean z5) {
        int f6;
        InterfaceC0015b interfaceC0015b = this.f2033a;
        if (i6 < 0) {
            f6 = ((v) interfaceC0015b).a();
        } else {
            f6 = f(i6);
        }
        this.f2034b.e(f6, z5);
        if (z5) {
            i(view);
        }
        RecyclerView recyclerView = ((v) interfaceC0015b).f2169a;
        recyclerView.addView(view, f6);
        RecyclerView.a0 J = RecyclerView.J(view);
        RecyclerView.d dVar = recyclerView.f1851l;
        if (dVar != null && J != null) {
            dVar.j(J);
        }
        ArrayList arrayList = recyclerView.f1871z;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.n) recyclerView.f1871z.get(size)).a(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void b(View view, int i6, ViewGroup.LayoutParams layoutParams, boolean z5) {
        int f6;
        InterfaceC0015b interfaceC0015b = this.f2033a;
        if (i6 < 0) {
            f6 = ((v) interfaceC0015b).a();
        } else {
            f6 = f(i6);
        }
        this.f2034b.e(f6, z5);
        if (z5) {
            i(view);
        }
        v vVar = (v) interfaceC0015b;
        vVar.getClass();
        RecyclerView.a0 J = RecyclerView.J(view);
        RecyclerView recyclerView = vVar.f2169a;
        if (J != null) {
            if (!J.k() && !J.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + J + recyclerView.z());
            }
            J.f1882j &= -257;
        }
        recyclerView.attachViewToParent(view, f6, layoutParams);
    }

    public final void c(int i6) {
        RecyclerView.a0 J;
        int f6 = f(i6);
        this.f2034b.f(f6);
        v vVar = (v) this.f2033a;
        View childAt = vVar.f2169a.getChildAt(f6);
        RecyclerView recyclerView = vVar.f2169a;
        if (childAt != null && (J = RecyclerView.J(childAt)) != null) {
            if (J.k() && !J.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + J + recyclerView.z());
            }
            J.b(256);
        }
        recyclerView.detachViewFromParent(f6);
    }

    public final View d(int i6) {
        return ((v) this.f2033a).f2169a.getChildAt(f(i6));
    }

    public final int e() {
        return ((v) this.f2033a).a() - this.f2035c.size();
    }

    public final int f(int i6) {
        if (i6 < 0) {
            return -1;
        }
        int a6 = ((v) this.f2033a).a();
        int i7 = i6;
        while (i7 < a6) {
            a aVar = this.f2034b;
            int b6 = i6 - (i7 - aVar.b(i7));
            if (b6 == 0) {
                while (aVar.d(i7)) {
                    i7++;
                }
                return i7;
            }
            i7 += b6;
        }
        return -1;
    }

    public final View g(int i6) {
        return ((v) this.f2033a).f2169a.getChildAt(i6);
    }

    public final int h() {
        return ((v) this.f2033a).a();
    }

    public final void i(View view) {
        this.f2035c.add(view);
        v vVar = (v) this.f2033a;
        vVar.getClass();
        RecyclerView.a0 J = RecyclerView.J(view);
        if (J != null) {
            int i6 = J.f1889q;
            View view2 = J.f1873a;
            if (i6 == -1) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                i6 = g0.d.c(view2);
            }
            J.f1888p = i6;
            RecyclerView recyclerView = vVar.f2169a;
            if (recyclerView.L()) {
                J.f1889q = 4;
                recyclerView.r0.add(J);
                return;
            }
            WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
            g0.d.s(view2, 4);
        }
    }

    public final boolean j(View view) {
        return this.f2035c.contains(view);
    }

    public final void k(View view) {
        if (this.f2035c.remove(view)) {
            v vVar = (v) this.f2033a;
            vVar.getClass();
            RecyclerView.a0 J = RecyclerView.J(view);
            if (J != null) {
                int i6 = J.f1888p;
                RecyclerView recyclerView = vVar.f2169a;
                if (recyclerView.L()) {
                    J.f1889q = i6;
                    recyclerView.r0.add(J);
                } else {
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    g0.d.s(J.f1873a, i6);
                }
                J.f1888p = 0;
            }
        }
    }

    public final String toString() {
        return this.f2034b.toString() + ", hidden list:" + this.f2035c.size();
    }
}
