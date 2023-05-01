package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.appcompat.widget.k1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import g0.f;
import g0.j;
import h3.f;
import h3.i;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m0.c;
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public i3.a f3280a;

    /* renamed from: b  reason: collision with root package name */
    public f f3281b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f3282c;

    /* renamed from: d  reason: collision with root package name */
    public final i f3283d;

    /* renamed from: e  reason: collision with root package name */
    public final SideSheetBehavior<V>.c f3284e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3285f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3286g;

    /* renamed from: h  reason: collision with root package name */
    public int f3287h;

    /* renamed from: i  reason: collision with root package name */
    public m0.c f3288i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3289j;

    /* renamed from: k  reason: collision with root package name */
    public final float f3290k;

    /* renamed from: l  reason: collision with root package name */
    public int f3291l;

    /* renamed from: m  reason: collision with root package name */
    public int f3292m;

    /* renamed from: n  reason: collision with root package name */
    public WeakReference<V> f3293n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference<View> f3294o;

    /* renamed from: p  reason: collision with root package name */
    public int f3295p;

    /* renamed from: q  reason: collision with root package name */
    public VelocityTracker f3296q;

    /* renamed from: r  reason: collision with root package name */
    public int f3297r;
    public final LinkedHashSet s;

    /* renamed from: t  reason: collision with root package name */
    public final a f3298t;

    /* loaded from: classes.dex */
    public class a extends c.AbstractC0063c {
        public a() {
        }

        @Override // m0.c.AbstractC0063c
        public final int a(View view, int i6) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return c.a.j(i6, sideSheetBehavior.f3280a.a(), sideSheetBehavior.f3292m);
        }

        @Override // m0.c.AbstractC0063c
        public final int b(View view, int i6) {
            return view.getTop();
        }

        @Override // m0.c.AbstractC0063c
        public final int c(View view) {
            return SideSheetBehavior.this.f3292m;
        }

        @Override // m0.c.AbstractC0063c
        public final void f(int i6) {
            if (i6 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f3286g) {
                    sideSheetBehavior.s(1);
                }
            }
        }

        @Override // m0.c.AbstractC0063c
        public final void g(View view, int i6, int i7) {
            View view2;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f3294o;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                i3.a aVar = sideSheetBehavior.f3280a;
                int left = view.getLeft();
                view.getRight();
                int i8 = aVar.f4621a.f3292m;
                if (left <= i8) {
                    marginLayoutParams.rightMargin = i8 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet<i3.b> linkedHashSet = sideSheetBehavior.s;
            if (!linkedHashSet.isEmpty()) {
                i3.a aVar2 = sideSheetBehavior.f3280a;
                int i9 = aVar2.f4621a.f3292m;
                aVar2.a();
                for (i3.b bVar : linkedHashSet) {
                    bVar.b();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
            if (r6 != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
            if (r6 == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
            if (java.lang.Math.abs(r9 - r1.a()) < java.lang.Math.abs(r9 - r5.f3292m)) goto L34;
         */
        @Override // m0.c.AbstractC0063c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                i3.a r1 = r0.f3280a
                r1.getClass()
                r2 = 0
                int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                r4 = 1
                if (r3 >= 0) goto Lf
                goto L84
            Lf:
                int r3 = r8.getRight()
                float r3 = (float) r3
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r5 = r1.f4621a
                float r6 = r5.f3290k
                float r6 = r6 * r9
                float r6 = r6 + r3
                float r3 = java.lang.Math.abs(r6)
                r6 = 1056964608(0x3f000000, float:0.5)
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                r6 = 0
                if (r3 <= 0) goto L27
                r3 = r4
                goto L28
            L27:
                r3 = r6
            L28:
                if (r3 == 0) goto L5a
                float r9 = java.lang.Math.abs(r9)
                float r2 = java.lang.Math.abs(r10)
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 <= 0) goto L38
                r9 = r4
                goto L39
            L38:
                r9 = r6
            L39:
                if (r9 == 0) goto L44
                r9 = 500(0x1f4, float:7.0E-43)
                float r9 = (float) r9
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 <= 0) goto L44
                r9 = r4
                goto L45
            L44:
                r9 = r6
            L45:
                if (r9 != 0) goto L86
                int r9 = r8.getLeft()
                int r10 = r5.f3292m
                int r1 = r1.a()
                int r10 = r10 - r1
                int r10 = r10 / 2
                if (r9 <= r10) goto L57
                r6 = r4
            L57:
                if (r6 == 0) goto L84
                goto L86
            L5a:
                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r2 == 0) goto L6d
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L6b
                r6 = r4
            L6b:
                if (r6 != 0) goto L86
            L6d:
                int r9 = r8.getLeft()
                int r10 = r1.a()
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                int r1 = r5.f3292m
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L86
            L84:
                r9 = 3
                goto L87
            L86:
                r9 = 5
            L87:
                r0.t(r8, r9, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // m0.c.AbstractC0063c
        public final boolean i(View view, int i6) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (sideSheetBehavior.f3287h == 1 || (weakReference = sideSheetBehavior.f3293n) == null || weakReference.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public final int f3300d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new b[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3300d = parcel.readInt();
        }

        public b(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f3300d = sideSheetBehavior.f3287h;
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeInt(this.f3300d);
        }
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public int f3301a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3302b;

        /* renamed from: c  reason: collision with root package name */
        public final k1 f3303c = new k1(3, this);

        public c() {
        }

        public final void a(int i6) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f3293n;
            if (weakReference != null && weakReference.get() != null) {
                this.f3301a = i6;
                if (!this.f3302b) {
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    g0.d.m(sideSheetBehavior.f3293n.get(), this.f3303c);
                    this.f3302b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.f3284e = new c();
        this.f3286g = true;
        this.f3287h = 5;
        this.f3290k = 0.1f;
        this.f3295p = -1;
        this.s = new LinkedHashSet();
        this.f3298t = new a();
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3284e = new c();
        this.f3286g = true;
        this.f3287h = 5;
        this.f3290k = 0.1f;
        this.f3295p = -1;
        this.s = new LinkedHashSet();
        this.f3298t = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2655c0);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f3282c = d3.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f3283d = new i(i.b(context, attributeSet, 0, 2131952557));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f3295p = resourceId;
            WeakReference<View> weakReference = this.f3294o;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3294o = null;
            WeakReference<V> weakReference2 = this.f3293n;
            if (weakReference2 != null) {
                V v2 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    if (g0.g.c(v2)) {
                        v2.requestLayout();
                    }
                }
            }
        }
        i iVar = this.f3283d;
        if (iVar != null) {
            f fVar = new f(iVar);
            this.f3281b = fVar;
            fVar.i(context);
            ColorStateList colorStateList = this.f3282c;
            if (colorStateList != null) {
                this.f3281b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f3281b.setTint(typedValue.data);
            }
        }
        this.f3285f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f3286g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.f3280a == null) {
            this.f3280a = new i3.a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.f3293n = null;
        this.f3288i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.f3293n = null;
        this.f3288i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z5;
        m0.c cVar;
        VelocityTracker velocityTracker;
        if ((v2.isShown() || g0.d(v2) != null) && this.f3286g) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            this.f3289j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f3296q) != null) {
            velocityTracker.recycle();
            this.f3296q = null;
        }
        if (this.f3296q == null) {
            this.f3296q = VelocityTracker.obtain();
        }
        this.f3296q.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f3289j) {
                this.f3289j = false;
                return false;
            }
        } else {
            this.f3297r = (int) motionEvent.getX();
        }
        if (!this.f3289j && (cVar = this.f3288i) != null && cVar.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v2, int i6) {
        int i7;
        View findViewById;
        int i8;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.d.b(coordinatorLayout) && !g0.d.b(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int i9 = 0;
        if (this.f3293n == null) {
            this.f3293n = new WeakReference<>(v2);
            f fVar = this.f3281b;
            if (fVar != null) {
                g0.d.q(v2, fVar);
                f fVar2 = this.f3281b;
                float f6 = this.f3285f;
                if (f6 == -1.0f) {
                    f6 = g0.i.i(v2);
                }
                fVar2.j(f6);
            } else {
                ColorStateList colorStateList = this.f3282c;
                if (colorStateList != null) {
                    g0.i.q(v2, colorStateList);
                }
            }
            if (this.f3287h == 5) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            if (v2.getVisibility() != i8) {
                v2.setVisibility(i8);
            }
            u();
            if (g0.d.c(v2) == 0) {
                g0.d.s(v2, 1);
            }
            if (g0.d(v2) == null) {
                g0.m(v2, v2.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f3288i == null) {
            this.f3288i = new m0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f3298t);
        }
        this.f3280a.getClass();
        int left = v2.getLeft();
        coordinatorLayout.q(v2, i6);
        this.f3292m = coordinatorLayout.getWidth();
        this.f3291l = v2.getWidth();
        int i10 = this.f3287h;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 5) {
                    i9 = this.f3280a.f4621a.f3292m;
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f3287h);
                }
            }
        } else {
            this.f3280a.getClass();
            i9 = left - v2.getLeft();
        }
        v2.offsetLeftAndRight(i9);
        if (this.f3294o == null && (i7 = this.f3295p) != -1 && (findViewById = coordinatorLayout.findViewById(i7)) != null) {
            this.f3294o = new WeakReference<>(findViewById);
        }
        for (i3.b bVar : this.s) {
            if (bVar instanceof i3.f) {
                ((i3.f) bVar).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        int i6 = ((b) parcelable).f3300d;
        this.f3287h = (i6 == 1 || i6 == 2) ? 5 : 5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        boolean z7;
        VelocityTracker velocityTracker;
        boolean z8 = false;
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i6 = this.f3287h;
        if (i6 == 1 && actionMasked == 0) {
            return true;
        }
        m0.c cVar = this.f3288i;
        if (cVar != null && (this.f3286g || i6 == 1)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f3296q) != null) {
            velocityTracker.recycle();
            this.f3296q = null;
        }
        if (this.f3296q == null) {
            this.f3296q = VelocityTracker.obtain();
        }
        this.f3296q.addMovement(motionEvent);
        m0.c cVar2 = this.f3288i;
        if (cVar2 != null && (this.f3286g || this.f3287h == 1)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 && actionMasked == 2 && !this.f3289j) {
            if (cVar2 != null && (this.f3286g || this.f3287h == 1)) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 && Math.abs(this.f3297r - motionEvent.getX()) > this.f3288i.f5221b) {
                z8 = true;
            }
            if (z8) {
                this.f3288i.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3289j;
    }

    public final void s(int i6) {
        V v2;
        int i7;
        if (this.f3287h == i6) {
            return;
        }
        this.f3287h = i6;
        WeakReference<V> weakReference = this.f3293n;
        if (weakReference == null || (v2 = weakReference.get()) == null) {
            return;
        }
        if (this.f3287h == 5) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        if (v2.getVisibility() != i7) {
            v2.setVisibility(i7);
        }
        for (i3.b bVar : this.s) {
            bVar.a();
        }
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r0.q(r1, r4.getTop()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r4 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            i3.a r0 = r3.f3280a
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r0.f4621a
            r1 = 3
            if (r5 == r1) goto L20
            r1 = 5
            if (r5 != r1) goto L11
            i3.a r1 = r0.f3280a
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r1 = r1.f4621a
            int r1 = r1.f3292m
            goto L26
        L11:
            r0.getClass()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid state to get outward edge offset: "
            java.lang.String r5 = androidx.activity.j.a(r6, r5)
            r4.<init>(r5)
            throw r4
        L20:
            i3.a r1 = r0.f3280a
            int r1 = r1.a()
        L26:
            m0.c r0 = r0.f3288i
            r2 = 0
            if (r0 == 0) goto L55
            if (r6 == 0) goto L38
            int r4 = r4.getTop()
            boolean r4 = r0.q(r1, r4)
            if (r4 == 0) goto L55
            goto L54
        L38:
            int r6 = r4.getTop()
            r0.f5237r = r4
            r4 = -1
            r0.f5222c = r4
            boolean r4 = r0.i(r1, r6, r2, r2)
            if (r4 != 0) goto L52
            int r6 = r0.f5220a
            if (r6 != 0) goto L52
            android.view.View r6 = r0.f5237r
            if (r6 == 0) goto L52
            r6 = 0
            r0.f5237r = r6
        L52:
            if (r4 == 0) goto L55
        L54:
            r2 = 1
        L55:
            if (r2 == 0) goto L61
            r4 = 2
            r3.s(r4)
            com.google.android.material.sidesheet.SideSheetBehavior<V>$c r4 = r3.f3284e
            r4.a(r5)
            goto L64
        L61:
            r3.s(r5)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        V v2;
        WeakReference<V> weakReference = this.f3293n;
        if (weakReference == null || (v2 = weakReference.get()) == null) {
            return;
        }
        g0.i(v2, 262144);
        g0.g(v2, 0);
        g0.i(v2, 1048576);
        g0.g(v2, 0);
        if (this.f3287h != 5) {
            g0.j(v2, f.a.f4103j, new j() { // from class: i3.d
                /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
                @Override // g0.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean a(android.view.View r5) {
                    /*
                        r4 = this;
                        com.google.android.material.sidesheet.SideSheetBehavior r5 = com.google.android.material.sidesheet.SideSheetBehavior.this
                        r5.getClass()
                        r0 = 1
                        int r1 = r2
                        if (r1 == r0) goto L4b
                        r2 = 2
                        if (r1 != r2) goto Le
                        goto L4b
                    Le:
                        java.lang.ref.WeakReference<V extends android.view.View> r2 = r5.f3293n
                        if (r2 == 0) goto L47
                        java.lang.Object r2 = r2.get()
                        if (r2 != 0) goto L19
                        goto L47
                    L19:
                        java.lang.ref.WeakReference<V extends android.view.View> r2 = r5.f3293n
                        java.lang.Object r2 = r2.get()
                        android.view.View r2 = (android.view.View) r2
                        i3.e r3 = new i3.e
                        r3.<init>()
                        android.view.ViewParent r5 = r2.getParent()
                        if (r5 == 0) goto L3c
                        boolean r5 = r5.isLayoutRequested()
                        if (r5 == 0) goto L3c
                        java.util.WeakHashMap<android.view.View, f0.r0> r5 = f0.g0.f3878a
                        boolean r5 = f0.g0.g.b(r2)
                        if (r5 == 0) goto L3c
                        r5 = r0
                        goto L3d
                    L3c:
                        r5 = 0
                    L3d:
                        if (r5 == 0) goto L43
                        r2.post(r3)
                        goto L4a
                    L43:
                        r3.run()
                        goto L4a
                    L47:
                        r5.s(r1)
                    L4a:
                        return r0
                    L4b:
                        java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "STATE_"
                        r2.<init>(r3)
                        if (r1 != r0) goto L59
                        java.lang.String r0 = "DRAGGING"
                        goto L5b
                    L59:
                        java.lang.String r0 = "SETTLING"
                    L5b:
                        r2.append(r0)
                        java.lang.String r0 = " should not be set externally."
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                        r5.<init>(r0)
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: i3.d.a(android.view.View):boolean");
                }
            });
        }
        if (this.f3287h != 3) {
            g0.j(v2, f.a.f4101h, new j() { // from class: i3.d
                @Override // g0.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean a(android.view.View r5) {
                    /*
                        r4 = this;
                        com.google.android.material.sidesheet.SideSheetBehavior r5 = com.google.android.material.sidesheet.SideSheetBehavior.this
                        r5.getClass()
                        r0 = 1
                        int r1 = r2
                        if (r1 == r0) goto L4b
                        r2 = 2
                        if (r1 != r2) goto Le
                        goto L4b
                    Le:
                        java.lang.ref.WeakReference<V extends android.view.View> r2 = r5.f3293n
                        if (r2 == 0) goto L47
                        java.lang.Object r2 = r2.get()
                        if (r2 != 0) goto L19
                        goto L47
                    L19:
                        java.lang.ref.WeakReference<V extends android.view.View> r2 = r5.f3293n
                        java.lang.Object r2 = r2.get()
                        android.view.View r2 = (android.view.View) r2
                        i3.e r3 = new i3.e
                        r3.<init>()
                        android.view.ViewParent r5 = r2.getParent()
                        if (r5 == 0) goto L3c
                        boolean r5 = r5.isLayoutRequested()
                        if (r5 == 0) goto L3c
                        java.util.WeakHashMap<android.view.View, f0.r0> r5 = f0.g0.f3878a
                        boolean r5 = f0.g0.g.b(r2)
                        if (r5 == 0) goto L3c
                        r5 = r0
                        goto L3d
                    L3c:
                        r5 = 0
                    L3d:
                        if (r5 == 0) goto L43
                        r2.post(r3)
                        goto L4a
                    L43:
                        r3.run()
                        goto L4a
                    L47:
                        r5.s(r1)
                    L4a:
                        return r0
                    L4b:
                        java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "STATE_"
                        r2.<init>(r3)
                        if (r1 != r0) goto L59
                        java.lang.String r0 = "DRAGGING"
                        goto L5b
                    L59:
                        java.lang.String r0 = "SETTLING"
                    L5b:
                        r2.append(r0)
                        java.lang.String r0 = " should not be set externally."
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                        r5.<init>(r0)
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: i3.d.a(android.view.View):boolean");
                }
            });
        }
    }
}
