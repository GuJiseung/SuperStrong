package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.superstrong.android.R;
import f0.a;
import f0.g0;
import f0.r0;
import g0.f;
import h3.f;
import h3.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import m0.c;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public final BottomSheetBehavior<V>.e A;
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public m0.c M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference<V> U;
    public WeakReference<View> V;
    public final ArrayList<c> W;
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public int f2959a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2960a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2961b;

    /* renamed from: b0  reason: collision with root package name */
    public HashMap f2962b0;

    /* renamed from: c  reason: collision with root package name */
    public final float f2963c;

    /* renamed from: c0  reason: collision with root package name */
    public final SparseIntArray f2964c0;

    /* renamed from: d  reason: collision with root package name */
    public int f2965d;

    /* renamed from: d0  reason: collision with root package name */
    public final b f2966d0;

    /* renamed from: e  reason: collision with root package name */
    public int f2967e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2968f;

    /* renamed from: g  reason: collision with root package name */
    public int f2969g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2970h;

    /* renamed from: i  reason: collision with root package name */
    public f f2971i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f2972j;

    /* renamed from: k  reason: collision with root package name */
    public int f2973k;

    /* renamed from: l  reason: collision with root package name */
    public int f2974l;

    /* renamed from: m  reason: collision with root package name */
    public int f2975m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2976n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f2977o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f2978p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f2979q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f2980r;
    public final boolean s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f2981t;
    public final boolean u;

    /* renamed from: v  reason: collision with root package name */
    public int f2982v;

    /* renamed from: w  reason: collision with root package name */
    public int f2983w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f2984x;

    /* renamed from: y  reason: collision with root package name */
    public final i f2985y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2986z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2987b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2988c;

        public a(View view, int i6) {
            this.f2987b = view;
            this.f2988c = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.F(this.f2987b, this.f2988c, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends c.AbstractC0063c {
        public b() {
        }

        @Override // m0.c.AbstractC0063c
        public final int a(View view, int i6) {
            return view.getLeft();
        }

        @Override // m0.c.AbstractC0063c
        public final int b(View view, int i6) {
            return c.a.j(i6, BottomSheetBehavior.this.x(), d());
        }

        @Override // m0.c.AbstractC0063c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.I) {
                return bottomSheetBehavior.T;
            }
            return bottomSheetBehavior.G;
        }

        @Override // m0.c.AbstractC0063c
        public final void f(int i6) {
            if (i6 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K) {
                    bottomSheetBehavior.D(1);
                }
            }
        }

        @Override // m0.c.AbstractC0063c
        public final void g(View view, int i6, int i7) {
            BottomSheetBehavior.this.u(i7);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
            if (java.lang.Math.abs(r5.getTop() - r3.x()) < java.lang.Math.abs(r5.getTop() - r3.E)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
            if (java.lang.Math.abs(r6 - r3.E) < java.lang.Math.abs(r6 - r3.G)) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
            if (java.lang.Math.abs(r6 - r3.D) < java.lang.Math.abs(r6 - r3.G)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
            if (r6 < java.lang.Math.abs(r6 - r3.G)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
            if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r3.G)) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r6 > r3.E) goto L7;
         */
        @Override // m0.c.AbstractC0063c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 0
                int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                if (r1 >= 0) goto L1b
                boolean r6 = r3.f2961b
                if (r6 == 0) goto Le
                goto Lc4
            Le:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                int r7 = r3.E
                if (r6 <= r7) goto Lc4
                goto Ld5
            L1b:
                boolean r1 = r3.I
                if (r1 == 0) goto L70
                boolean r1 = r3.E(r5, r7)
                if (r1 == 0) goto L70
                float r6 = java.lang.Math.abs(r6)
                float r0 = java.lang.Math.abs(r7)
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 >= 0) goto L38
                int r6 = r3.f2965d
                float r6 = (float) r6
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L4c
            L38:
                int r6 = r5.getTop()
                int r7 = r3.T
                int r0 = r3.x()
                int r0 = r0 + r7
                int r0 = r0 / 2
                if (r6 <= r0) goto L49
                r6 = r2
                goto L4a
            L49:
                r6 = 0
            L4a:
                if (r6 == 0) goto L4f
            L4c:
                r6 = 5
                goto Ld8
            L4f:
                boolean r6 = r3.f2961b
                if (r6 == 0) goto L55
                goto Lc4
            L55:
                int r6 = r5.getTop()
                int r7 = r3.x()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                int r0 = r3.E
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto Ld5
                goto Lc4
            L70:
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 == 0) goto L9c
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L81
                goto L9c
            L81:
                boolean r6 = r3.f2961b
                if (r6 == 0) goto L86
                goto Ld7
            L86:
                int r6 = r5.getTop()
                int r7 = r3.E
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
                goto Ld5
            L9c:
                int r6 = r5.getTop()
                boolean r7 = r3.f2961b
                if (r7 == 0) goto Lb6
                int r7 = r3.D
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
                goto Lc4
            Lb6:
                int r7 = r3.E
                if (r6 >= r7) goto Lc6
                int r7 = r3.G
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto Ld5
            Lc4:
                r6 = 3
                goto Ld8
            Lc6:
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
            Ld5:
                r6 = 6
                goto Ld8
            Ld7:
                r6 = 4
            Ld8:
                r3.getClass()
                r3.F(r5, r6, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.h(android.view.View, float, float):void");
        }

        @Override // m0.c.AbstractC0063c
        public final boolean i(View view, int i6) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i7 = bottomSheetBehavior.L;
            if (i7 == 1 || bottomSheetBehavior.f2960a0) {
                return false;
            }
            if (i7 == 3 && bottomSheetBehavior.Y == i6) {
                WeakReference<View> weakReference = bottomSheetBehavior.V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.U;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a();

        public abstract void b();
    }

    /* loaded from: classes.dex */
    public static class d extends l0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public final int f2991d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2992e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f2993f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f2994g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f2995h;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new d[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2991d = parcel.readInt();
            this.f2992e = parcel.readInt();
            this.f2993f = parcel.readInt() == 1;
            this.f2994g = parcel.readInt() == 1;
            this.f2995h = parcel.readInt() == 1;
        }

        public d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f2991d = bottomSheetBehavior.L;
            this.f2992e = bottomSheetBehavior.f2967e;
            this.f2993f = bottomSheetBehavior.f2961b;
            this.f2994g = bottomSheetBehavior.I;
            this.f2995h = bottomSheetBehavior.J;
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeInt(this.f2991d);
            parcel.writeInt(this.f2992e);
            parcel.writeInt(this.f2993f ? 1 : 0);
            parcel.writeInt(this.f2994g ? 1 : 0);
            parcel.writeInt(this.f2995h ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public int f2996a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2997b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2998c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f2997b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                m0.c cVar = bottomSheetBehavior.M;
                if (cVar != null && cVar.g()) {
                    eVar.a(eVar.f2996a);
                } else if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.D(eVar.f2996a);
                }
            }
        }

        public e() {
        }

        public final void a(int i6) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.U;
            if (weakReference != null && weakReference.get() != null) {
                this.f2996a = i6;
                if (!this.f2997b) {
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    g0.d.m(bottomSheetBehavior.U.get(), this.f2998c);
                    this.f2997b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.f2959a = 0;
        this.f2961b = true;
        this.f2973k = -1;
        this.f2974l = -1;
        this.A = new e();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList<>();
        this.f2964c0 = new SparseIntArray();
        this.f2966d0 = new b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        int i6;
        this.f2959a = 0;
        this.f2961b = true;
        this.f2973k = -1;
        this.f2974l = -1;
        this.A = new e();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList<>();
        this.f2964c0 = new SparseIntArray();
        this.f2966d0 = new b();
        this.f2970h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.F);
        int i7 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2972j = d3.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2985y = new i(i.b(context, attributeSet, R.attr.bottomSheetStyle, 2131952415));
        }
        i iVar = this.f2985y;
        if (iVar != null) {
            f fVar = new f(iVar);
            this.f2971i = fVar;
            fVar.i(context);
            ColorStateList colorStateList = this.f2972j;
            if (colorStateList != null) {
                this.f2971i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f2971i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new n2.a(this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2973k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2974l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i6 = peekValue.data) == -1) {
            B(i6);
        } else {
            B(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z5 = obtainStyledAttributes.getBoolean(8, false);
        if (this.I != z5) {
            this.I = z5;
            if (!z5 && this.L == 5) {
                C(4);
            }
            G();
        }
        this.f2976n = obtainStyledAttributes.getBoolean(13, false);
        boolean z6 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2961b != z6) {
            this.f2961b = z6;
            if (this.U != null) {
                s();
            }
            D((this.f2961b && this.L == 6) ? i7 : this.L);
            H(this.L, true);
            G();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f2959a = obtainStyledAttributes.getInt(10, 0);
        float f6 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f6 > 0.0f && f6 < 1.0f) {
            this.F = f6;
            if (this.U != null) {
                this.E = (int) ((1.0f - f6) * this.T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                dimensionPixelOffset = peekValue2.data;
            } else {
                dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            }
            A(dimensionPixelOffset);
            this.f2965d = obtainStyledAttributes.getInt(11, 500);
            this.f2977o = obtainStyledAttributes.getBoolean(17, false);
            this.f2978p = obtainStyledAttributes.getBoolean(18, false);
            this.f2979q = obtainStyledAttributes.getBoolean(19, false);
            this.f2980r = obtainStyledAttributes.getBoolean(20, true);
            this.s = obtainStyledAttributes.getBoolean(14, false);
            this.f2981t = obtainStyledAttributes.getBoolean(15, false);
            this.u = obtainStyledAttributes.getBoolean(16, false);
            this.f2984x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f2963c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View v2 = v(viewGroup.getChildAt(i6));
                if (v2 != null) {
                    return v2;
                }
            }
        }
        return null;
    }

    public final void A(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.C = i6;
        H(this.L, true);
    }

    public final void B(int i6) {
        boolean z5 = false;
        if (i6 == -1) {
            if (!this.f2968f) {
                this.f2968f = true;
                z5 = true;
            }
        } else if (this.f2968f || this.f2967e != i6) {
            this.f2968f = false;
            this.f2967e = Math.max(0, i6);
            z5 = true;
        }
        if (z5) {
            J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (f0.g0.g.b(r5) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L71
            r1 = 2
            if (r5 != r1) goto L8
            goto L71
        L8:
            boolean r1 = r4.I
            if (r1 != 0) goto L23
            r1 = 5
            if (r5 != r1) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set state: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r5)
            return
        L23:
            r1 = 6
            if (r5 != r1) goto L34
            boolean r1 = r4.f2961b
            if (r1 == 0) goto L34
            int r1 = r4.y(r5)
            int r2 = r4.D
            if (r1 > r2) goto L34
            r1 = 3
            goto L35
        L34:
            r1 = r5
        L35:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r4.U
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L40
            goto L6d
        L40:
            java.lang.ref.WeakReference<V extends android.view.View> r5 = r4.U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r5, r1)
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L62
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L62
            java.util.WeakHashMap<android.view.View, f0.r0> r1 = f0.g0.f3878a
            boolean r1 = f0.g0.g.b(r5)
            if (r1 == 0) goto L62
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 == 0) goto L69
            r5.post(r2)
            goto L70
        L69:
            r2.run()
            goto L70
        L6d:
            r4.D(r5)
        L70:
            return
        L71:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L7f
            java.lang.String r5 = "DRAGGING"
            goto L81
        L7f:
            java.lang.String r5 = "SETTLING"
        L81:
            r2.append(r5)
            java.lang.String r5 = " should not be set externally."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(int):void");
    }

    public final void D(int i6) {
        if (this.L == i6) {
            return;
        }
        this.L = i6;
        WeakReference<V> weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int i7 = 0;
        if (i6 == 3) {
            I(true);
        } else if (i6 == 6 || i6 == 5 || i6 == 4) {
            I(false);
        }
        H(i6, true);
        while (true) {
            ArrayList<c> arrayList = this.W;
            if (i7 >= arrayList.size()) {
                G();
                return;
            } else {
                arrayList.get(i7).b();
                i7++;
            }
        }
    }

    public final boolean E(View view, float f6) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f6 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1.q(r5.getLeft(), r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(android.view.View r5, int r6, boolean r7) {
        /*
            r4 = this;
            int r0 = r4.y(r6)
            m0.c r1 = r4.M
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r7 == 0) goto L17
            int r5 = r5.getLeft()
            boolean r5 = r1.q(r5, r0)
            if (r5 == 0) goto L34
            goto L33
        L17:
            int r7 = r5.getLeft()
            r1.f5237r = r5
            r5 = -1
            r1.f5222c = r5
            boolean r5 = r1.i(r7, r0, r2, r2)
            if (r5 != 0) goto L31
            int r7 = r1.f5220a
            if (r7 != 0) goto L31
            android.view.View r7 = r1.f5237r
            if (r7 == 0) goto L31
            r7 = 0
            r1.f5237r = r7
        L31:
            if (r5 == 0) goto L34
        L33:
            r2 = r3
        L34:
            if (r2 == 0) goto L43
            r5 = 2
            r4.D(r5)
            r4.H(r6, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r5 = r4.A
            r5.a(r6)
            goto L46
        L43:
            r4.D(r6)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.F(android.view.View, int, boolean):void");
    }

    public final void G() {
        V v2;
        f.a aVar;
        int i6;
        boolean z5;
        f0.a aVar2;
        WeakReference<V> weakReference = this.U;
        if (weakReference != null && (v2 = weakReference.get()) != null) {
            g0.i(v2, 524288);
            g0.g(v2, 0);
            g0.i(v2, 262144);
            g0.g(v2, 0);
            g0.i(v2, 1048576);
            g0.g(v2, 0);
            SparseIntArray sparseIntArray = this.f2964c0;
            int i7 = sparseIntArray.get(0, -1);
            if (i7 != -1) {
                g0.i(v2, i7);
                g0.g(v2, 0);
                sparseIntArray.delete(0);
            }
            int i8 = 6;
            if (!this.f2961b && this.L != 6) {
                String string = v2.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                n2.c cVar = new n2.c(this, 6);
                ArrayList e6 = g0.e(v2);
                int i9 = 0;
                while (true) {
                    if (i9 < e6.size()) {
                        if (TextUtils.equals(string, ((f.a) e6.get(i9)).b())) {
                            i6 = ((f.a) e6.get(i9)).a();
                            break;
                        }
                        i9++;
                    } else {
                        int i10 = 0;
                        int i11 = -1;
                        while (true) {
                            int[] iArr = g0.f3881d;
                            if (i10 >= iArr.length || i11 != -1) {
                                break;
                            }
                            int i12 = iArr[i10];
                            boolean z6 = true;
                            for (int i13 = 0; i13 < e6.size(); i13++) {
                                if (((f.a) e6.get(i13)).a() != i12) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                z6 &= z5;
                            }
                            if (z6) {
                                i11 = i12;
                            }
                            i10++;
                        }
                        i6 = i11;
                    }
                }
                if (i6 != -1) {
                    f.a aVar3 = new f.a(null, i6, string, cVar, null);
                    View.AccessibilityDelegate c6 = g0.c(v2);
                    if (c6 == null) {
                        aVar2 = null;
                    } else if (c6 instanceof a.C0037a) {
                        aVar2 = ((a.C0037a) c6).f3858a;
                    } else {
                        aVar2 = new f0.a(c6);
                    }
                    if (aVar2 == null) {
                        aVar2 = new f0.a();
                    }
                    g0.l(v2, aVar2);
                    g0.i(v2, aVar3.a());
                    g0.e(v2).add(aVar3);
                    g0.g(v2, 0);
                }
                sparseIntArray.put(0, i6);
            }
            if (this.I && this.L != 5) {
                z(v2, f.a.f4103j, 5);
            }
            int i14 = this.L;
            if (i14 != 3) {
                if (i14 != 4) {
                    if (i14 == 6) {
                        z(v2, f.a.f4102i, 4);
                        z(v2, f.a.f4101h, 3);
                        return;
                    }
                    return;
                }
                if (this.f2961b) {
                    i8 = 3;
                }
                aVar = f.a.f4101h;
            } else {
                if (this.f2961b) {
                    i8 = 4;
                }
                aVar = f.a.f4102i;
            }
            z(v2, aVar, i8);
        }
    }

    public final void H(int i6, boolean z5) {
        boolean z6;
        ValueAnimator valueAnimator;
        if (i6 == 2) {
            return;
        }
        if (this.L == 3 && (this.f2984x || x() == 0)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f2986z != z6 && this.f2971i != null) {
            this.f2986z = z6;
            float f6 = 0.0f;
            if (z5 && (valueAnimator = this.B) != null) {
                if (valueAnimator.isRunning()) {
                    this.B.reverse();
                    return;
                }
                if (!z6) {
                    f6 = 1.0f;
                }
                this.B.setFloatValues(1.0f - f6, f6);
                this.B.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.B;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B.cancel();
            }
            h3.f fVar = this.f2971i;
            if (!this.f2986z) {
                f6 = 1.0f;
            }
            f.b bVar = fVar.f4446b;
            if (bVar.f4476j != f6) {
                bVar.f4476j = f6;
                fVar.f4450f = true;
                fVar.invalidateSelf();
            }
        }
    }

    public final void I(boolean z5) {
        WeakReference<V> weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z5) {
            if (this.f2962b0 == null) {
                this.f2962b0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = coordinatorLayout.getChildAt(i6);
            if (childAt != this.U.get() && z5) {
                this.f2962b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z5) {
            this.f2962b0 = null;
        }
    }

    public final void J() {
        V v2;
        if (this.U != null) {
            s();
            if (this.L != 4 || (v2 = this.U.get()) == null) {
                return;
            }
            v2.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z5;
        View view;
        m0.c cVar;
        if (v2.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.Y = -1;
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.X = null;
                }
            }
            if (this.X == null) {
                this.X = VelocityTracker.obtain();
            }
            this.X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f2960a0 = false;
                    this.Y = -1;
                    if (this.N) {
                        this.N = false;
                        return false;
                    }
                }
            } else {
                int x5 = (int) motionEvent.getX();
                this.Z = (int) motionEvent.getY();
                if (this.L != 2) {
                    WeakReference<View> weakReference = this.V;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.l(view, x5, this.Z)) {
                        this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f2960a0 = true;
                    }
                }
                if (this.Y == -1 && !coordinatorLayout.l(v2, x5, this.Z)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.N = z5;
            }
            if (!this.N && (cVar = this.M) != null && cVar.r(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.V;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.N || this.L == 1 || coordinatorLayout.l(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(this.Z - motionEvent.getY()) <= this.M.f5221b) {
                return false;
            }
            return true;
        }
        this.N = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0128 A[LOOP:0: B:73:0x0120->B:75:0x0128, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0134 A[SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r6, V r7, int r8) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, this.f2973k, marginLayoutParams.width), w(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f2974l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(View view) {
        WeakReference<View> weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(CoordinatorLayout coordinatorLayout, V v2, View view, int i6, int i7, int[] iArr, int i8) {
        int i9;
        if (i8 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.V;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v2.getTop();
        int i10 = top - i7;
        if (i7 > 0) {
            if (i10 < x()) {
                int x5 = top - x();
                iArr[1] = x5;
                int i11 = -x5;
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                v2.offsetTopAndBottom(i11);
                i9 = 3;
                D(i9);
            } else if (!this.K) {
                return;
            } else {
                iArr[1] = i7;
                int i12 = -i7;
                WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                v2.offsetTopAndBottom(i12);
                D(1);
            }
        } else if (i7 < 0 && !view.canScrollVertically(-1)) {
            int i13 = this.G;
            if (i10 > i13 && !this.I) {
                int i14 = top - i13;
                iArr[1] = i14;
                int i15 = -i14;
                WeakHashMap<View, r0> weakHashMap3 = g0.f3878a;
                v2.offsetTopAndBottom(i15);
                i9 = 4;
                D(i9);
            } else if (!this.K) {
                return;
            } else {
                iArr[1] = i7;
                int i122 = -i7;
                WeakHashMap<View, r0> weakHashMap22 = g0.f3878a;
                v2.offsetTopAndBottom(i122);
                D(1);
            }
        }
        u(v2.getTop());
        this.O = i7;
        this.P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i6 = this.f2959a;
        if (i6 != 0) {
            if (i6 == -1 || (i6 & 1) == 1) {
                this.f2967e = dVar.f2992e;
            }
            if (i6 == -1 || (i6 & 2) == 2) {
                this.f2961b = dVar.f2993f;
            }
            if (i6 == -1 || (i6 & 4) == 4) {
                this.I = dVar.f2994g;
            }
            if (i6 == -1 || (i6 & 8) == 8) {
                this.J = dVar.f2995h;
            }
        }
        int i7 = dVar.f2991d;
        if (i7 != 1 && i7 != 2) {
            this.L = i7;
        } else {
            this.L = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i6, int i7) {
        this.O = 0;
        this.P = false;
        return (i6 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r3.getTop() <= r1.E) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (java.lang.Math.abs(r2 - r1.D) < java.lang.Math.abs(r2 - r1.G)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
        if (r2 < java.lang.Math.abs(r2 - r1.G)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.G)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (java.lang.Math.abs(r2 - r1.E) < java.lang.Math.abs(r2 - r1.G)) goto L18;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.x()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.D(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.V
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.P
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.O
            if (r2 <= 0) goto L33
            boolean r2 = r1.f2961b
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.E
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.I
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.X
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f2963c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.X
            int r4 = r1.Y
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.E(r3, r2)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.O
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.f2961b
            if (r4 == 0) goto L72
            int r4 = r1.D
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.E
            if (r2 >= r4) goto L81
            int r4 = r1.G
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.f2961b
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.F(r3, r0, r2)
            r1.P = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z5;
        boolean z6 = false;
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i6 = this.L;
        if (i6 == 1 && actionMasked == 0) {
            return true;
        }
        m0.c cVar = this.M;
        if (cVar != null && (this.K || i6 == 1)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && (this.K || this.L == 1)) {
            z6 = true;
        }
        if (z6 && actionMasked == 2 && !this.N) {
            float abs = Math.abs(this.Z - motionEvent.getY());
            m0.c cVar2 = this.M;
            if (abs > cVar2.f5221b) {
                cVar2.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void s() {
        int t5 = t();
        if (this.f2961b) {
            this.G = Math.max(this.T - t5, this.D);
        } else {
            this.G = this.T - t5;
        }
    }

    public final int t() {
        int i6;
        return this.f2968f ? Math.min(Math.max(this.f2969g, this.T - ((this.S * 9) / 16)), this.R) + this.f2982v : (this.f2976n || this.f2977o || (i6 = this.f2975m) <= 0) ? this.f2967e + this.f2982v : Math.max(this.f2967e, i6 + this.f2970h);
    }

    public final void u(int i6) {
        if (this.U.get() != null) {
            ArrayList<c> arrayList = this.W;
            if (!arrayList.isEmpty()) {
                int i7 = this.G;
                if (i6 <= i7 && i7 != x()) {
                    x();
                }
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    arrayList.get(i8).a();
                }
            }
        }
    }

    public final int w(int i6, int i7, int i8, int i9) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, i7, i9);
        if (i8 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i8 = Math.min(size, i8);
            }
            return View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i8), 1073741824);
    }

    public final int x() {
        if (this.f2961b) {
            return this.D;
        }
        return Math.max(this.C, this.f2980r ? 0 : this.f2983w);
    }

    public final int y(int i6) {
        if (i6 != 3) {
            if (i6 != 4) {
                if (i6 != 5) {
                    if (i6 == 6) {
                        return this.E;
                    }
                    throw new IllegalArgumentException(j.a("Invalid state to get top offset: ", i6));
                }
                return this.T;
            }
            return this.G;
        }
        return x();
    }

    public final void z(View view, f.a aVar, int i6) {
        g0.j(view, aVar, new n2.c(this, i6));
    }
}
