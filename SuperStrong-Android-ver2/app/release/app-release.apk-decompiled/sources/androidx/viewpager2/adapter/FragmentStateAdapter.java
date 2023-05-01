package androidx.viewpager2.adapter;

import a1.f0;
import a4.i;
import a4.k;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.a0;
import androidx.fragment.app.b0;
import androidx.fragment.app.o;
import androidx.fragment.app.r;
import androidx.fragment.app.y;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import f0.g0;
import f0.r0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.g;
/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.d<f> implements g {

    /* renamed from: c  reason: collision with root package name */
    public final j f2179c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f2180d;

    /* renamed from: e  reason: collision with root package name */
    public final l.e<o> f2181e;

    /* renamed from: f  reason: collision with root package name */
    public final l.e<o.f> f2182f;

    /* renamed from: g  reason: collision with root package name */
    public final l.e<Integer> f2183g;

    /* renamed from: h  reason: collision with root package name */
    public b f2184h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2185i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2186j;

    /* loaded from: classes.dex */
    public static abstract class a extends RecyclerView.f {
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public d f2192a;

        /* renamed from: b  reason: collision with root package name */
        public e f2193b;

        /* renamed from: c  reason: collision with root package name */
        public m f2194c;

        /* renamed from: d  reason: collision with root package name */
        public ViewPager2 f2195d;

        /* renamed from: e  reason: collision with root package name */
        public long f2196e = -1;

        public b() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z5) {
            boolean z6;
            int currentItem;
            boolean z7;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (fragmentStateAdapter.f2180d.O() || this.f2195d.getScrollState() != 0) {
                return;
            }
            l.e<o> eVar = fragmentStateAdapter.f2181e;
            if (eVar.h() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 || (currentItem = this.f2195d.getCurrentItem()) >= 2) {
                return;
            }
            long j5 = currentItem;
            if (j5 == this.f2196e && !z5) {
                return;
            }
            o oVar = null;
            o oVar2 = (o) eVar.d(j5, null);
            if (oVar2 != null && oVar2.q()) {
                this.f2196e = j5;
                a0 a0Var = fragmentStateAdapter.f2180d;
                a0Var.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(a0Var);
                for (int i6 = 0; i6 < eVar.h(); i6++) {
                    long e6 = eVar.e(i6);
                    o i7 = eVar.i(i6);
                    if (i7.q()) {
                        if (e6 != this.f2196e) {
                            aVar.i(i7, j.c.STARTED);
                        } else {
                            oVar = i7;
                        }
                        if (e6 == this.f2196e) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i7.C != z7) {
                            i7.C = z7;
                        }
                    }
                }
                if (oVar != null) {
                    aVar.i(oVar, j.c.RESUMED);
                }
                if (!aVar.f1499a.isEmpty()) {
                    aVar.e();
                }
            }
        }
    }

    public FragmentStateAdapter(r rVar) {
        b0 z5 = rVar.z();
        this.f2181e = new l.e<>();
        this.f2182f = new l.e<>();
        this.f2183g = new l.e<>();
        this.f2185i = false;
        this.f2186j = false;
        this.f2180d = z5;
        this.f2179c = rVar.f235e;
        if (!this.f1892a.a()) {
            this.f1893b = true;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public static void l(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public static boolean m(long j5) {
        return j5 >= 0 && j5 < ((long) 2);
    }

    @Override // androidx.viewpager2.adapter.g
    public final Bundle a() {
        l.e<o> eVar = this.f2181e;
        int h6 = eVar.h();
        l.e<o.f> eVar2 = this.f2182f;
        Bundle bundle = new Bundle(eVar2.h() + h6);
        for (int i6 = 0; i6 < eVar.h(); i6++) {
            long e6 = eVar.e(i6);
            o oVar = (o) eVar.d(e6, null);
            if (oVar != null && oVar.q()) {
                String str = "f#" + e6;
                a0 a0Var = this.f2180d;
                a0Var.getClass();
                if (oVar.s == a0Var) {
                    bundle.putString(str, oVar.f1571f);
                } else {
                    a0Var.f0(new IllegalStateException("Fragment " + oVar + " is not currently in the FragmentManager"));
                    throw null;
                }
            }
        }
        for (int i7 = 0; i7 < eVar2.h(); i7++) {
            long e7 = eVar2.e(i7);
            if (m(e7)) {
                bundle.putParcelable("s#" + e7, (Parcelable) eVar2.d(e7, null));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.g
    public final void b(Parcelable parcelable) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        l.e<o.f> eVar = this.f2182f;
        boolean z9 = false;
        if (eVar.h() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            l.e<o> eVar2 = this.f2181e;
            if (eVar2.h() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        long parseLong = Long.parseLong(str.substring(2));
                        a0 a0Var = this.f2180d;
                        a0Var.getClass();
                        String string = bundle.getString(str);
                        o oVar = null;
                        if (string != null) {
                            o C = a0Var.C(string);
                            if (C != null) {
                                oVar = C;
                            } else {
                                a0Var.f0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                throw null;
                            }
                        }
                        eVar2.f(parseLong, oVar);
                    } else {
                        if (str.startsWith("s#") && str.length() > 2) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            long parseLong2 = Long.parseLong(str.substring(2));
                            o.f fVar = (o.f) bundle.getParcelable(str);
                            if (m(parseLong2)) {
                                eVar.f(parseLong2, fVar);
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                    }
                }
                if (eVar2.h() == 0) {
                    z9 = true;
                }
                if (!z9) {
                    this.f2186j = true;
                    this.f2185i = true;
                    n();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final c cVar = new c(this);
                    this.f2179c.a(new m() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                        @Override // androidx.lifecycle.m
                        public final void f(androidx.lifecycle.o oVar2, j.b bVar) {
                            if (bVar == j.b.ON_DESTROY) {
                                handler.removeCallbacks(cVar);
                                oVar2.v().c(this);
                            }
                        }
                    });
                    handler.postDelayed(cVar, 10000L);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final long d(int i6) {
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(RecyclerView recyclerView) {
        boolean z5;
        if (this.f2184h == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            final b bVar = new b();
            this.f2184h = bVar;
            bVar.f2195d = b.a(recyclerView);
            d dVar = new d(bVar);
            bVar.f2192a = dVar;
            bVar.f2195d.f2210d.f2240a.add(dVar);
            e eVar = new e(bVar);
            bVar.f2193b = eVar;
            this.f1892a.registerObserver(eVar);
            m mVar = new m() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // androidx.lifecycle.m
                public final void f(androidx.lifecycle.o oVar, j.b bVar2) {
                    FragmentStateAdapter.b.this.b(false);
                }
            };
            bVar.f2194c = mVar;
            this.f2179c.a(mVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void f(f fVar, int i6) {
        boolean z5;
        o iVar;
        Bundle bundle;
        f fVar2 = fVar;
        long j5 = fVar2.f1877e;
        FrameLayout frameLayout = (FrameLayout) fVar2.f1873a;
        int id = frameLayout.getId();
        Long o5 = o(id);
        l.e<Integer> eVar = this.f2183g;
        if (o5 != null && o5.longValue() != j5) {
            q(o5.longValue());
            eVar.g(o5.longValue());
        }
        eVar.f(j5, Integer.valueOf(id));
        long j6 = i6;
        l.e<o> eVar2 = this.f2181e;
        if (eVar2.f5037b) {
            eVar2.c();
        }
        if (f0.d(eVar2.f5038c, eVar2.f5040e, j6) >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            if (i6 != 0) {
                if (i6 != 1) {
                    iVar = new i();
                } else {
                    iVar = new k();
                }
            } else {
                iVar = new i();
            }
            Bundle bundle2 = null;
            o.f fVar3 = (o.f) this.f2182f.d(j6, null);
            if (iVar.s == null) {
                if (fVar3 != null && (bundle = fVar3.f1605b) != null) {
                    bundle2 = bundle;
                }
                iVar.f1568c = bundle2;
                eVar2.f(j6, iVar);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.g.b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new androidx.viewpager2.adapter.a(this, frameLayout, fVar2));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final RecyclerView.a0 g(RecyclerView recyclerView) {
        int i6 = f.f2207t;
        FrameLayout frameLayout = new FrameLayout(recyclerView.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        frameLayout.setId(g0.e.a());
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void h(RecyclerView recyclerView) {
        b bVar = this.f2184h;
        bVar.getClass();
        ViewPager2 a6 = b.a(recyclerView);
        a6.f2210d.f2240a.remove(bVar.f2192a);
        e eVar = bVar.f2193b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.f1892a.unregisterObserver(eVar);
        fragmentStateAdapter.f2179c.c(bVar.f2194c);
        bVar.f2195d = null;
        this.f2184h = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final /* bridge */ /* synthetic */ boolean i(f fVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void j(f fVar) {
        p(fVar);
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void k(f fVar) {
        Long o5 = o(((FrameLayout) fVar.f1873a).getId());
        if (o5 != null) {
            q(o5.longValue());
            this.f2183g.g(o5.longValue());
        }
    }

    public final void n() {
        l.e<o> eVar;
        l.e<Integer> eVar2;
        boolean z5;
        o oVar;
        View view;
        if (this.f2186j && !this.f2180d.O()) {
            l.d dVar = new l.d();
            int i6 = 0;
            while (true) {
                eVar = this.f2181e;
                int h6 = eVar.h();
                eVar2 = this.f2183g;
                if (i6 >= h6) {
                    break;
                }
                long e6 = eVar.e(i6);
                if (!m(e6)) {
                    dVar.add(Long.valueOf(e6));
                    eVar2.g(e6);
                }
                i6++;
            }
            if (!this.f2185i) {
                this.f2186j = false;
                for (int i7 = 0; i7 < eVar.h(); i7++) {
                    long e7 = eVar.e(i7);
                    if (eVar2.f5037b) {
                        eVar2.c();
                    }
                    boolean z6 = true;
                    if (f0.d(eVar2.f5038c, eVar2.f5040e, e7) >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5 && ((oVar = (o) eVar.d(e7, null)) == null || (view = oVar.F) == null || view.getParent() == null)) {
                        z6 = false;
                    }
                    if (!z6) {
                        dVar.add(Long.valueOf(e7));
                    }
                }
            }
            Iterator it = dVar.iterator();
            while (true) {
                g.a aVar = (g.a) it;
                if (aVar.hasNext()) {
                    q(((Long) aVar.next()).longValue());
                } else {
                    return;
                }
            }
        }
    }

    public final Long o(int i6) {
        Long l5 = null;
        int i7 = 0;
        while (true) {
            l.e<Integer> eVar = this.f2183g;
            if (i7 >= eVar.h()) {
                return l5;
            }
            if (eVar.i(i7).intValue() == i6) {
                if (l5 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l5 = Long.valueOf(eVar.e(i7));
            }
            i7++;
        }
    }

    public final void p(final f fVar) {
        o oVar = (o) this.f2181e.d(fVar.f1877e, null);
        if (oVar != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.f1873a;
            View view = oVar.F;
            if (!oVar.q() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            boolean q5 = oVar.q();
            a0 a0Var = this.f2180d;
            if (q5 && view == null) {
                a0Var.f1397l.f1673a.add(new y.a(new androidx.viewpager2.adapter.b(this, oVar, frameLayout)));
                return;
            } else if (oVar.q() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    l(view, frameLayout);
                    return;
                }
                return;
            } else if (oVar.q()) {
                l(view, frameLayout);
                return;
            } else if (!a0Var.O()) {
                a0Var.f1397l.f1673a.add(new y.a(new androidx.viewpager2.adapter.b(this, oVar, frameLayout)));
                a0Var.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(a0Var);
                aVar.f(0, oVar, "f" + fVar.f1877e, 1);
                aVar.i(oVar, j.c.STARTED);
                aVar.e();
                this.f2184h.b(false);
                return;
            } else if (a0Var.G) {
                return;
            } else {
                this.f2179c.a(new m() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.m
                    public final void f(androidx.lifecycle.o oVar2, j.b bVar) {
                        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                        if (fragmentStateAdapter.f2180d.O()) {
                            return;
                        }
                        oVar2.v().c(this);
                        f fVar2 = fVar;
                        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                        if (g0.g.b((FrameLayout) fVar2.f1873a)) {
                            fragmentStateAdapter.p(fVar2);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void q(long j5) {
        Bundle o5;
        ViewParent parent;
        l.e<o> eVar = this.f2181e;
        o.f fVar = null;
        o oVar = (o) eVar.d(j5, null);
        if (oVar == null) {
            return;
        }
        View view = oVar.F;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean m5 = m(j5);
        l.e<o.f> eVar2 = this.f2182f;
        if (!m5) {
            eVar2.g(j5);
        }
        if (!oVar.q()) {
            eVar.g(j5);
            return;
        }
        a0 a0Var = this.f2180d;
        if (a0Var.O()) {
            this.f2186j = true;
            return;
        }
        if (oVar.q() && m(j5)) {
            a0Var.getClass();
            androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) ((HashMap) a0Var.f1388c.f1493b).get(oVar.f1571f);
            if (g0Var != null) {
                o oVar2 = g0Var.f1484c;
                if (oVar2.equals(oVar)) {
                    if (oVar2.f1567b > -1 && (o5 = g0Var.o()) != null) {
                        fVar = new o.f(o5);
                    }
                    eVar2.f(j5, fVar);
                }
            }
            a0Var.f0(new IllegalStateException("Fragment " + oVar + " is not currently in the FragmentManager"));
            throw null;
        }
        a0Var.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(a0Var);
        aVar.h(oVar);
        aVar.e();
        eVar.g(j5);
    }
}
