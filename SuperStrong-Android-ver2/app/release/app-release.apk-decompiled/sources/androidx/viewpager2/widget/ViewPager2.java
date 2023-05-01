package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import androidx.viewpager2.widget.c;
import f0.g0;
import f0.r0;
import g0.f;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public final Rect f2208b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2209c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.viewpager2.widget.a f2210d;

    /* renamed from: e  reason: collision with root package name */
    public int f2211e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2212f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2213g;

    /* renamed from: h  reason: collision with root package name */
    public d f2214h;

    /* renamed from: i  reason: collision with root package name */
    public int f2215i;

    /* renamed from: j  reason: collision with root package name */
    public Parcelable f2216j;

    /* renamed from: k  reason: collision with root package name */
    public i f2217k;

    /* renamed from: l  reason: collision with root package name */
    public h f2218l;

    /* renamed from: m  reason: collision with root package name */
    public androidx.viewpager2.widget.c f2219m;

    /* renamed from: n  reason: collision with root package name */
    public androidx.viewpager2.widget.a f2220n;

    /* renamed from: o  reason: collision with root package name */
    public f1.c f2221o;

    /* renamed from: p  reason: collision with root package name */
    public androidx.viewpager2.widget.b f2222p;

    /* renamed from: q  reason: collision with root package name */
    public RecyclerView.i f2223q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2224r;
    public boolean s;

    /* renamed from: t  reason: collision with root package name */
    public int f2225t;
    public f u;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f2212f = true;
            viewPager2.f2219m.f2252l = true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {
    }

    /* loaded from: classes.dex */
    public static abstract class c extends RecyclerView.f {
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayoutManager {
        public d() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void C0(RecyclerView.x xVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.C0(xVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void U(RecyclerView.s sVar, RecyclerView.x xVar, g0.f fVar) {
            super.U(sVar, xVar, fVar);
            ViewPager2.this.u.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final boolean h0(RecyclerView.s sVar, RecyclerView.x xVar, int i6, Bundle bundle) {
            ViewPager2.this.u.getClass();
            return super.h0(sVar, xVar, i6, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z6) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(int i6) {
        }

        public void b(float f6, int i6, int i7) {
        }

        public void c(int i6) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f2227a = new a();

        /* renamed from: b  reason: collision with root package name */
        public final b f2228b = new b();

        /* renamed from: c  reason: collision with root package name */
        public androidx.viewpager2.widget.f f2229c;

        /* loaded from: classes.dex */
        public class a implements g0.j {
            public a() {
            }

            @Override // g0.j
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.s) {
                    viewPager2.b(currentItem, true);
                }
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements g0.j {
            public b() {
            }

            @Override // g0.j
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.s) {
                    viewPager2.b(currentItem, true);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a(RecyclerView recyclerView) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.s(recyclerView, 2);
            this.f2229c = new androidx.viewpager2.widget.f(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (g0.d.c(viewPager2) == 0) {
                g0.d.s(viewPager2, 1);
            }
        }

        public final void b() {
            int c6;
            int i6;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i7 = 16908360;
            g0.i(viewPager2, 16908360);
            boolean z5 = false;
            g0.g(viewPager2, 0);
            g0.i(viewPager2, 16908361);
            g0.g(viewPager2, 0);
            g0.i(viewPager2, 16908358);
            g0.g(viewPager2, 0);
            g0.i(viewPager2, 16908359);
            g0.g(viewPager2, 0);
            if (viewPager2.getAdapter() == null || (c6 = viewPager2.getAdapter().c()) == 0 || !viewPager2.s) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.f2228b;
            a aVar = this.f2227a;
            if (orientation == 0) {
                if (viewPager2.f2214h.A() == 1) {
                    z5 = true;
                }
                if (z5) {
                    i6 = 16908360;
                } else {
                    i6 = 16908361;
                }
                if (z5) {
                    i7 = 16908361;
                }
                if (viewPager2.f2211e < c6 - 1) {
                    g0.j(viewPager2, new f.a(i6), aVar);
                }
                if (viewPager2.f2211e > 0) {
                    g0.j(viewPager2, new f.a(i7), bVar);
                    return;
                }
                return;
            }
            if (viewPager2.f2211e < c6 - 1) {
                g0.j(viewPager2, new f.a(16908359), aVar);
            }
            if (viewPager2.f2211e > 0) {
                g0.j(viewPager2, new f.a(16908358), bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends u {
        public h() {
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.a0
        public final View c(RecyclerView.l lVar) {
            if (((androidx.viewpager2.widget.c) ViewPager2.this.f2221o.f3952c).f2253m) {
                return null;
            }
            return super.c(lVar);
        }
    }

    /* loaded from: classes.dex */
    public class i extends RecyclerView {
        public i(Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.u.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f2211e);
            accessibilityEvent.setToIndex(viewPager2.f2211e);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.s && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.s && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends View.BaseSavedState {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f2235b;

        /* renamed from: c  reason: collision with root package name */
        public int f2236c;

        /* renamed from: d  reason: collision with root package name */
        public Parcelable f2237d;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<j> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new j[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }
        }

        public j() {
            throw null;
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2235b = parcel.readInt();
            this.f2236c = parcel.readInt();
            this.f2237d = parcel.readParcelable(classLoader);
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f2235b);
            parcel.writeInt(this.f2236c);
            parcel.writeParcelable(this.f2237d, i6);
        }
    }

    /* loaded from: classes.dex */
    public static class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final int f2238b;

        /* renamed from: c  reason: collision with root package name */
        public final RecyclerView f2239c;

        public k(int i6, RecyclerView recyclerView) {
            this.f2238b = i6;
            this.f2239c = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f2239c.c0(this.f2238b);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2208b = new Rect();
        this.f2209c = new Rect();
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
        this.f2210d = aVar;
        this.f2212f = false;
        this.f2213g = new a();
        this.f2215i = -1;
        this.f2223q = null;
        this.f2224r = false;
        this.s = true;
        this.f2225t = -1;
        this.u = new f();
        i iVar = new i(context);
        this.f2217k = iVar;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        iVar.setId(g0.e.a());
        this.f2217k.setDescendantFocusability(131072);
        d dVar = new d();
        this.f2214h = dVar;
        this.f2217k.setLayoutManager(dVar);
        this.f2217k.setScrollingTouchSlop(1);
        int[] iArr = androidx.activity.k.f280b;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f2217k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            i iVar2 = this.f2217k;
            f1.d dVar2 = new f1.d();
            if (iVar2.f1871z == null) {
                iVar2.f1871z = new ArrayList();
            }
            iVar2.f1871z.add(dVar2);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.f2219m = cVar;
            this.f2221o = new f1.c(this, cVar, this.f2217k);
            h hVar = new h();
            this.f2218l = hVar;
            hVar.a(this.f2217k);
            this.f2217k.h(this.f2219m);
            androidx.viewpager2.widget.a aVar2 = new androidx.viewpager2.widget.a();
            this.f2220n = aVar2;
            this.f2219m.f2241a = aVar2;
            androidx.viewpager2.widget.d dVar3 = new androidx.viewpager2.widget.d(this);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
            this.f2220n.f2240a.add(dVar3);
            this.f2220n.f2240a.add(eVar);
            this.u.a(this.f2217k);
            this.f2220n.f2240a.add(aVar);
            androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(this.f2214h);
            this.f2222p = bVar;
            this.f2220n.f2240a.add(bVar);
            i iVar3 = this.f2217k;
            attachViewToParent(iVar3, 0, iVar3.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        RecyclerView.d adapter;
        if (this.f2215i == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f2216j;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                ((androidx.viewpager2.adapter.g) adapter).b(parcelable);
            }
            this.f2216j = null;
        }
        int max = Math.max(0, Math.min(this.f2215i, adapter.c() - 1));
        this.f2211e = max;
        this.f2215i = -1;
        this.f2217k.a0(max);
        this.u.b();
    }

    public final void b(int i6, boolean z5) {
        boolean z6;
        int i7;
        int i8;
        boolean z7;
        RecyclerView.d adapter = getAdapter();
        boolean z8 = false;
        if (adapter == null) {
            if (this.f2215i != -1) {
                this.f2215i = Math.max(i6, 0);
            }
        } else if (adapter.c() <= 0) {
        } else {
            int min = Math.min(Math.max(i6, 0), adapter.c() - 1);
            int i9 = this.f2211e;
            if (min == i9) {
                if (this.f2219m.f2246f == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    return;
                }
            }
            if (min == i9 && z5) {
                return;
            }
            double d6 = i9;
            this.f2211e = min;
            this.u.b();
            androidx.viewpager2.widget.c cVar = this.f2219m;
            if (cVar.f2246f == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                cVar.f();
                c.a aVar = cVar.f2247g;
                d6 = aVar.f2254a + aVar.f2255b;
            }
            androidx.viewpager2.widget.c cVar2 = this.f2219m;
            cVar2.getClass();
            if (z5) {
                i7 = 2;
            } else {
                i7 = 3;
            }
            cVar2.f2245e = i7;
            cVar2.f2253m = false;
            if (cVar2.f2249i != min) {
                z8 = true;
            }
            cVar2.f2249i = min;
            cVar2.d(2);
            if (z8) {
                cVar2.c(min);
            }
            if (!z5) {
                this.f2217k.a0(min);
                return;
            }
            double d7 = min;
            if (Math.abs(d7 - d6) > 3.0d) {
                i iVar = this.f2217k;
                if (d7 > d6) {
                    i8 = min - 3;
                } else {
                    i8 = min + 3;
                }
                iVar.a0(i8);
                i iVar2 = this.f2217k;
                iVar2.post(new k(min, iVar2));
                return;
            }
            this.f2217k.c0(min);
        }
    }

    public final void c() {
        h hVar = this.f2218l;
        if (hVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View c6 = hVar.c(this.f2214h);
        if (c6 == null) {
            return;
        }
        this.f2214h.getClass();
        int G = RecyclerView.l.G(c6);
        if (G != this.f2211e && getScrollState() == 0) {
            this.f2220n.c(G);
        }
        this.f2212f = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i6) {
        return this.f2217k.canScrollHorizontally(i6);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i6) {
        return this.f2217k.canScrollVertically(i6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i6 = ((j) parcelable).f2235b;
            sparseArray.put(this.f2217k.getId(), sparseArray.get(i6));
            sparseArray.remove(i6);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.u.getClass();
        this.u.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.d getAdapter() {
        return this.f2217k.getAdapter();
    }

    public int getCurrentItem() {
        return this.f2211e;
    }

    public int getItemDecorationCount() {
        return this.f2217k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f2225t;
    }

    public int getOrientation() {
        return this.f2214h.f1795p;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        i iVar = this.f2217k;
        if (getOrientation() == 0) {
            height = iVar.getWidth() - iVar.getPaddingLeft();
            paddingBottom = iVar.getPaddingRight();
        } else {
            height = iVar.getHeight() - iVar.getPaddingTop();
            paddingBottom = iVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f2219m.f2246f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i6;
        int i7;
        int c6;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() != null) {
            int orientation = viewPager2.getOrientation();
            i7 = viewPager2.getAdapter().c();
            if (orientation == 1) {
                i6 = 0;
            } else {
                i6 = i7;
                i7 = 0;
            }
        } else {
            i6 = 0;
            i7 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(i7, i6, 0).f4110a);
        RecyclerView.d adapter = viewPager2.getAdapter();
        if (adapter != null && (c6 = adapter.c()) != 0 && viewPager2.s) {
            if (viewPager2.f2211e > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.f2211e < c6 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int measuredWidth = this.f2217k.getMeasuredWidth();
        int measuredHeight = this.f2217k.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f2208b;
        rect.left = paddingLeft;
        rect.right = (i8 - i6) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i9 - i7) - getPaddingBottom();
        Rect rect2 = this.f2209c;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f2217k.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f2212f) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        measureChild(this.f2217k, i6, i7);
        int measuredWidth = this.f2217k.getMeasuredWidth();
        int measuredHeight = this.f2217k.getMeasuredHeight();
        int measuredState = this.f2217k.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i6, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i7, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f2215i = jVar.f2236c;
        this.f2216j = jVar.f2237d;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f2235b = this.f2217k.getId();
        int i6 = this.f2215i;
        if (i6 == -1) {
            i6 = this.f2211e;
        }
        jVar.f2236c = i6;
        Parcelable parcelable = this.f2216j;
        if (parcelable == null) {
            RecyclerView.d adapter = this.f2217k.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                parcelable = ((androidx.viewpager2.adapter.g) adapter).a();
            }
            return jVar;
        }
        jVar.f2237d = parcelable;
        return jVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i6, Bundle bundle) {
        boolean z5;
        int currentItem;
        this.u.getClass();
        boolean z6 = false;
        if (i6 != 8192 && i6 != 4096) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            f fVar = this.u;
            fVar.getClass();
            if (i6 == 8192 || i6 == 4096) {
                z6 = true;
            }
            if (z6) {
                ViewPager2 viewPager2 = ViewPager2.this;
                if (i6 == 8192) {
                    currentItem = viewPager2.getCurrentItem() - 1;
                } else {
                    currentItem = viewPager2.getCurrentItem() + 1;
                }
                if (viewPager2.s) {
                    viewPager2.b(currentItem, true);
                }
                return true;
            }
            throw new IllegalStateException();
        }
        return super.performAccessibilityAction(i6, bundle);
    }

    public void setAdapter(RecyclerView.d dVar) {
        RecyclerView.d adapter = this.f2217k.getAdapter();
        f fVar = this.u;
        if (adapter != null) {
            adapter.f1892a.unregisterObserver(fVar.f2229c);
        } else {
            fVar.getClass();
        }
        a aVar = this.f2213g;
        if (adapter != null) {
            adapter.f1892a.unregisterObserver(aVar);
        }
        this.f2217k.setAdapter(dVar);
        this.f2211e = 0;
        a();
        f fVar2 = this.u;
        fVar2.b();
        if (dVar != null) {
            dVar.f1892a.registerObserver(fVar2.f2229c);
        }
        if (dVar != null) {
            dVar.f1892a.registerObserver(aVar);
        }
    }

    public void setCurrentItem(int i6) {
        if (!((androidx.viewpager2.widget.c) this.f2221o.f3952c).f2253m) {
            b(i6, true);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
        super.setLayoutDirection(i6);
        this.u.b();
    }

    public void setOffscreenPageLimit(int i6) {
        if (i6 < 1 && i6 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f2225t = i6;
        this.f2217k.requestLayout();
    }

    public void setOrientation(int i6) {
        this.f2214h.c1(i6);
        this.u.b();
    }

    public void setPageTransformer(g gVar) {
        boolean z5 = this.f2224r;
        if (gVar != null) {
            if (!z5) {
                this.f2223q = this.f2217k.getItemAnimator();
                this.f2224r = true;
            }
            this.f2217k.setItemAnimator(null);
        } else if (z5) {
            this.f2217k.setItemAnimator(this.f2223q);
            this.f2223q = null;
            this.f2224r = false;
        }
        this.f2222p.getClass();
        if (gVar == null) {
            return;
        }
        this.f2222p.getClass();
        this.f2222p.getClass();
    }

    public void setUserInputEnabled(boolean z5) {
        this.s = z5;
        this.u.b();
    }
}
