package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.activity.k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import f0.s;
import g0.f;
import i2.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import z.a;
/* loaded from: classes.dex */
public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: b  reason: collision with root package name */
    public int f2873b;

    /* renamed from: c  reason: collision with root package name */
    public int f2874c;

    /* renamed from: d  reason: collision with root package name */
    public int f2875d;

    /* renamed from: e  reason: collision with root package name */
    public int f2876e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2877f;

    /* renamed from: g  reason: collision with root package name */
    public int f2878g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2879h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2880i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2881j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2882k;

    /* renamed from: l  reason: collision with root package name */
    public int f2883l;

    /* renamed from: m  reason: collision with root package name */
    public WeakReference<View> f2884m;

    /* renamed from: n  reason: collision with root package name */
    public ValueAnimator f2885n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f2886o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f2887p;

    /* renamed from: q  reason: collision with root package name */
    public Behavior f2888q;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends i2.c<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f2889j;

        /* renamed from: k  reason: collision with root package name */
        public int f2890k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f2891l;

        /* renamed from: m  reason: collision with root package name */
        public b f2892m;

        /* renamed from: n  reason: collision with root package name */
        public WeakReference<View> f2893n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2894o;

        /* loaded from: classes.dex */
        public class a extends f0.a {
            public a() {
            }

            @Override // f0.a
            public final void d(View view, f fVar) {
                View.AccessibilityDelegate accessibilityDelegate = this.f3856a;
                AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                fVar.i(BaseBehavior.this.f2894o);
                accessibilityNodeInfo.setClassName(ScrollView.class.getName());
            }
        }

        /* loaded from: classes.dex */
        public static class b extends l0.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: d  reason: collision with root package name */
            public boolean f2896d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f2897e;

            /* renamed from: f  reason: collision with root package name */
            public int f2898f;

            /* renamed from: g  reason: collision with root package name */
            public float f2899g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f2900h;

            /* loaded from: classes.dex */
            public class a implements Parcelable.ClassLoaderCreator<b> {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
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
                this.f2896d = parcel.readByte() != 0;
                this.f2897e = parcel.readByte() != 0;
                this.f2898f = parcel.readInt();
                this.f2899g = parcel.readFloat();
                this.f2900h = parcel.readByte() != 0;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // l0.a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i6) {
                parcel.writeParcelable(this.f5073b, i6);
                parcel.writeByte(this.f2896d ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f2897e ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f2898f);
                parcel.writeFloat(this.f2899g);
                parcel.writeByte(this.f2900h ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static void C(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if ((childAt instanceof s) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void I(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                r0 = 1
                if (r5 == 0) goto L5e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f2903a
                r3 = r1 & 1
                if (r3 == 0) goto L5e
                java.util.WeakHashMap<android.view.View, f0.r0> r3 = f0.g0.f3878a
                int r3 = f0.g0.d.d(r5)
                if (r10 <= 0) goto L4b
                r10 = r1 & 12
                if (r10 == 0) goto L4b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
                goto L5c
            L4b:
                r10 = r1 & 2
                if (r10 == 0) goto L5e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
            L5c:
                r9 = r0
                goto L5f
            L5e:
                r9 = r2
            L5f:
                boolean r10 = r8.f2882k
                if (r10 == 0) goto L6b
                android.view.View r9 = D(r7)
                boolean r9 = r8.d(r9)
            L6b:
                boolean r9 = r8.c(r9)
                if (r11 != 0) goto Laf
                if (r9 == 0) goto Lb2
                m.c r9 = r7.f1210c
                java.lang.Object r9 = r9.f5160b
                l.h r9 = (l.h) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f1212e
                r7.clear()
                if (r9 == 0) goto L89
                r7.addAll(r9)
            L89:
                int r9 = r7.size()
                r10 = r2
            L8e:
                if (r10 >= r9) goto Lad
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1229a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto Laa
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f4614f
                if (r7 == 0) goto Lad
                r2 = r0
                goto Lad
            Laa:
                int r10 = r10 + 1
                goto L8e
            Lad:
                if (r2 == 0) goto Lb2
            Laf:
                r8.jumpDrawablesToCurrentState()
            Lb2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.I(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6) {
            int height;
            int abs = Math.abs(x() - i6);
            float abs2 = Math.abs(0.0f);
            float f6 = abs;
            if (abs2 > 0.0f) {
                height = Math.round((f6 / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((f6 / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int x5 = x();
            if (x5 == i6) {
                ValueAnimator valueAnimator = this.f2891l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2891l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f2891l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f2891l = valueAnimator3;
                valueAnimator3.setInterpolator(h2.a.f4426e);
                this.f2891l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f2891l.setDuration(Math.min(height, 600));
            this.f2891l.setIntValues(x5, i6);
            this.f2891l.start();
        }

        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6, int[] iArr) {
            int i7;
            int i8;
            if (i6 != 0) {
                if (i6 < 0) {
                    i7 = -appBarLayout.getTotalScrollRange();
                    i8 = appBarLayout.getDownNestedPreScrollRange() + i7;
                } else {
                    i7 = -appBarLayout.getUpNestedPreScrollRange();
                    i8 = 0;
                }
                int i9 = i7;
                int i10 = i8;
                if (i9 != i10) {
                    iArr[1] = z(coordinatorLayout, appBarLayout, x() - i6, i9, i10);
                }
            }
            if (appBarLayout.f2882k) {
                appBarLayout.c(appBarLayout.d(view));
            }
        }

        public final b F(Parcelable parcelable, T t5) {
            boolean z5;
            boolean z6;
            int s = s();
            int childCount = t5.getChildCount();
            boolean z7 = false;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = t5.getChildAt(i6);
                int bottom = childAt.getBottom() + s;
                if (childAt.getTop() + s <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = l0.a.f5072c;
                    }
                    b bVar = new b(parcelable);
                    if (s == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    bVar.f2897e = z5;
                    if (!z5 && (-s) >= t5.getTotalScrollRange()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bVar.f2896d = z6;
                    bVar.f2898f = i6;
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    if (bottom == t5.getTopInset() + g0.d.d(childAt)) {
                        z7 = true;
                    }
                    bVar.f2900h = z7;
                    bVar.f2899g = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, T t5) {
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            int paddingTop = t5.getPaddingTop() + t5.getTopInset();
            int x5 = x() - paddingTop;
            int childCount = t5.getChildCount();
            int i6 = 0;
            while (true) {
                z5 = true;
                if (i6 < childCount) {
                    View childAt = t5.getChildAt(i6);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    c cVar = (c) childAt.getLayoutParams();
                    if ((cVar.f2903a & 32) == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    }
                    int i7 = -x5;
                    if (top <= i7 && bottom >= i7) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 >= 0) {
                View childAt2 = t5.getChildAt(i6);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i8 = cVar2.f2903a;
                if ((i8 & 17) == 17) {
                    int i9 = -childAt2.getTop();
                    int i10 = -childAt2.getBottom();
                    if (i6 == 0) {
                        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                        if (g0.d.b(t5) && g0.d.b(childAt2)) {
                            i9 -= t5.getTopInset();
                        }
                    }
                    if ((i8 & 2) == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                        i10 += g0.d.d(childAt2);
                    } else {
                        if ((i8 & 5) == 5) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            WeakHashMap<View, r0> weakHashMap3 = g0.f3878a;
                            int d6 = g0.d.d(childAt2) + i10;
                            if (x5 < d6) {
                                i9 = d6;
                            } else {
                                i10 = d6;
                            }
                        }
                    }
                    if ((i8 & 32) != 32) {
                        z5 = false;
                    }
                    if (z5) {
                        i9 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        i10 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (x5 < (i10 + i9) / 2) {
                        i9 = i10;
                    }
                    B(coordinatorLayout, t5, c.a.j(i9 + paddingTop, -t5.getTotalScrollRange(), 0));
                }
            }
        }

        public final void H(CoordinatorLayout coordinatorLayout, T t5) {
            View view;
            boolean z5;
            boolean z6;
            boolean z7;
            g0.i(coordinatorLayout, f.a.f4099f.a());
            boolean z8 = false;
            g0.g(coordinatorLayout, 0);
            g0.i(coordinatorLayout, f.a.f4100g.a());
            g0.g(coordinatorLayout, 0);
            if (t5.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount) {
                    view = coordinatorLayout.getChildAt(i6);
                    if (((CoordinatorLayout.f) view.getLayoutParams()).f1229a instanceof ScrollingViewBehavior) {
                        break;
                    }
                    i6++;
                } else {
                    view = null;
                    break;
                }
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = t5.getChildCount();
            int i7 = 0;
            while (true) {
                z5 = true;
                if (i7 < childCount2) {
                    if (((c) t5.getChildAt(i7).getLayoutParams()).f2903a != 0) {
                        z6 = true;
                        break;
                    }
                    i7++;
                } else {
                    z6 = false;
                    break;
                }
            }
            if (!z6) {
                return;
            }
            if (g0.c(coordinatorLayout) != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                g0.l(coordinatorLayout, new a());
            }
            if (x() != (-t5.getTotalScrollRange())) {
                g0.j(coordinatorLayout, f.a.f4099f, new com.google.android.material.appbar.c(t5, false));
                z8 = true;
            }
            if (x() != 0) {
                if (view2.canScrollVertically(-1)) {
                    int i8 = -t5.getDownNestedPreScrollRange();
                    if (i8 != 0) {
                        g0.j(coordinatorLayout, f.a.f4100g, new com.google.android.material.appbar.b(this, coordinatorLayout, t5, view2, i8));
                    }
                } else {
                    g0.j(coordinatorLayout, f.a.f4100g, new com.google.android.material.appbar.c(t5, true));
                }
                this.f2894o = z5;
            }
            z5 = z8;
            this.f2894o = z5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v13, types: [i2.a] */
        @Override // i2.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
            boolean z5;
            int i7;
            int round;
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i6);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.f2892m;
            if (bVar != null && (pendingAction & 8) == 0) {
                if (bVar.f2896d) {
                    i7 = -appBarLayout.getTotalScrollRange();
                    A(coordinatorLayout, appBarLayout, i7);
                } else {
                    if (!bVar.f2897e) {
                        View childAt = appBarLayout.getChildAt(bVar.f2898f);
                        int i8 = -childAt.getBottom();
                        if (this.f2892m.f2900h) {
                            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                            round = appBarLayout.getTopInset() + g0.d.d(childAt) + i8;
                        } else {
                            round = Math.round(childAt.getHeight() * this.f2892m.f2899g) + i8;
                        }
                        A(coordinatorLayout, appBarLayout, round);
                    }
                    A(coordinatorLayout, appBarLayout, 0);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((pendingAction & 2) != 0) {
                    i7 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z5) {
                        B(coordinatorLayout, appBarLayout, i7);
                    }
                    A(coordinatorLayout, appBarLayout, i7);
                } else if ((pendingAction & 1) != 0) {
                    if (z5) {
                        B(coordinatorLayout, appBarLayout, 0);
                    }
                    A(coordinatorLayout, appBarLayout, 0);
                }
            }
            appBarLayout.f2878g = 0;
            this.f2892m = null;
            int j5 = c.a.j(s(), -appBarLayout.getTotalScrollRange(), 0);
            i2.f fVar = this.f4615a;
            if (fVar != null) {
                if (fVar.f4620d != j5) {
                    fVar.f4620d = j5;
                    fVar.a();
                }
            } else {
                this.f4616b = j5;
            }
            I(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f2873b = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                g0.d.k(appBarLayout);
            }
            H(coordinatorLayout, appBarLayout);
            final View D = D(coordinatorLayout);
            if (D != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    D.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: i2.a
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = AppBarLayout.BaseBehavior.this;
                            View view3 = D;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.C(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    D.setOnKeyListener(new View.OnKeyListener() { // from class: i2.b
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view2, int i9, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior.this.getClass();
                            AppBarLayout.BaseBehavior.C(keyEvent, D, appBarLayout);
                            return false;
                        }
                    });
                }
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.r(appBarLayout, i6, i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int[] iArr, int i8) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i7, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i8 < 0) {
                iArr[1] = z(coordinatorLayout, appBarLayout, x() - i8, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i8 == 0) {
                H(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                b bVar = this.f2892m;
                this.f2892m = (b) parcelable;
                return;
            }
            this.f2892m = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b F = F(absSavedState, (AppBarLayout) view);
            if (F != null) {
                return F;
            }
            return absSavedState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (r2 != false) goto L15;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.f2882k
                r0 = 1
                if (r5 != 0) goto L2b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = r0
                goto L15
            L14:
                r5 = r6
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = r0
                goto L29
            L28:
                r2 = r6
            L29:
                if (r2 == 0) goto L2c
            L2b:
                r6 = r0
            L2c:
                if (r6 == 0) goto L35
                android.animation.ValueAnimator r2 = r1.f2891l
                if (r2 == 0) goto L35
                r2.cancel()
            L35:
                r2 = 0
                r1.f2893n = r2
                r1.f2890k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i6) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f2890k == 0 || i6 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f2882k) {
                    appBarLayout.c(appBarLayout.d(view2));
                }
            }
            this.f2893n = new WeakReference<>(view2);
        }

        @Override // i2.c
        public final boolean u(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f2893n;
            if (weakReference != null && ((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) {
                return false;
            }
            return true;
        }

        @Override // i2.c
        public final int v(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // i2.c
        public final int w(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // i2.c
        public final int x() {
            return s() + this.f2889j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i2.c
        public final void y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            G(coordinatorLayout, appBarLayout);
            if (appBarLayout.f2882k) {
                appBarLayout.c(appBarLayout.d(D(coordinatorLayout)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
        @Override // i2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, int r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 405
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends d {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2651a0);
            this.f4614f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int j5;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1229a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f2889j + this.f4613e;
                if (this.f4614f == 0) {
                    j5 = 0;
                } else {
                    float v2 = v(view2);
                    int i6 = this.f4614f;
                    j5 = c.a.j((int) (v2 * i6), 0, i6);
                }
                int i7 = bottom - j5;
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                view.offsetTopAndBottom(i7);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f2882k) {
                    appBarLayout.c(appBarLayout.d(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                g0.i(coordinatorLayout, f.a.f4099f.a());
                g0.g(coordinatorLayout, 0);
                g0.i(coordinatorLayout, f.a.f4100g.a());
                g0.g(coordinatorLayout, 0);
                g0.l(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z5) {
            AppBarLayout appBarLayout;
            ArrayList e6 = coordinatorLayout.e(view);
            int size = e6.size();
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    View view2 = (View) e6.get(i7);
                    if (view2 instanceof AppBarLayout) {
                        appBarLayout = (AppBarLayout) view2;
                        break;
                    }
                    i7++;
                } else {
                    appBarLayout = null;
                    break;
                }
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f4611c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    if (!z5) {
                        i6 = 4;
                    }
                    appBarLayout.f2878g = 2 | i6 | 8;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        @Override // i2.d
        public final AppBarLayout u(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = (View) arrayList.get(i6);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // i2.d
        public final float v(View view) {
            int i6;
            int i7;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f1229a;
                if (cVar instanceof BaseBehavior) {
                    i6 = ((BaseBehavior) cVar).x();
                } else {
                    i6 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i6 > downNestedPreScrollRange) && (i7 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (i6 / i7) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // i2.d
        public final int w(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
    }

    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f2901a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f2902b = new Rect();
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2903a;

        /* renamed from: b  reason: collision with root package name */
        public b f2904b;

        /* renamed from: c  reason: collision with root package name */
        public final Interpolator f2905c;

        public c() {
            super(-1, -2);
            this.f2903a = 1;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2903a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.C);
            this.f2903a = obtainStyledAttributes.getInt(1, 0);
            this.f2904b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f2905c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2903a = 1;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2903a = 1;
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2903a = 1;
        }
    }

    public static c a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void b() {
        BaseBehavior.b bVar;
        Behavior behavior = this.f2888q;
        if (behavior != null && this.f2874c != -1 && this.f2878g == 0) {
            bVar = behavior.F(l0.a.f5072c, this);
        } else {
            bVar = null;
        }
        this.f2874c = -1;
        this.f2875d = -1;
        this.f2876e = -1;
        if (bVar != null) {
            Behavior behavior2 = this.f2888q;
            if (behavior2.f2892m == null) {
                behavior2.f2892m = bVar;
            }
        }
    }

    public final boolean c(boolean z5) {
        if ((!this.f2879h) && this.f2881j != z5) {
            this.f2881j = z5;
            refreshDrawableState();
            if (!this.f2882k || !(getBackground() instanceof h3.f)) {
                return true;
            }
            ValueAnimator valueAnimator = this.f2885n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
            this.f2885n = ofFloat;
            ofFloat.setDuration(0L);
            this.f2885n.setInterpolator(null);
            this.f2885n.start();
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(View view) {
        int i6;
        View view2;
        View view3 = null;
        if (this.f2884m == null && (i6 = this.f2883l) != -1) {
            if (view != null) {
                view2 = view.findViewById(i6);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f2883l);
            }
            if (view2 != null) {
                this.f2884m = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f2884m;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z5;
        super.draw(canvas);
        if (this.f2887p != null && getTopInset() > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f2873b);
            this.f2887p.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2887p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.d.b(childAt)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f2888q = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f2875d
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r4 = (com.google.android.material.appbar.AppBarLayout.c) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f2903a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap<android.view.View, f0.r0> r4 = f0.g0.f3878a
            int r4 = f0.g0.d.d(r3)
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap<android.view.View, f0.r0> r4 = f0.g0.f3878a
            int r4 = f0.g0.d.d(r3)
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap<android.view.View, f0.r0> r6 = f0.g0.f3878a
            boolean r3 = f0.g0.d.b(r3)
            if (r3 == 0) goto L61
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f2875d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i6 = this.f2876e;
        if (i6 != -1) {
            return i6;
        }
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i9 = cVar.f2903a;
                if ((i9 & 1) == 0) {
                    break;
                }
                i8 += measuredHeight;
                if ((i9 & 2) != 0) {
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    i8 -= g0.d.d(childAt);
                    break;
                }
            }
            i7++;
        }
        int max = Math.max(0, i8);
        this.f2876e = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f2883l;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        int d6 = g0.d.d(this);
        if (d6 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d6 = g0.d.d(getChildAt(childCount - 1));
            } else {
                d6 = 0;
            }
            if (d6 == 0) {
                return getHeight() / 3;
            }
        }
        return (d6 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f2878g;
    }

    public Drawable getStatusBarForeground() {
        return this.f2887p;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i6 = this.f2874c;
        if (i6 != -1) {
            return i6;
        }
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = cVar.f2903a;
                if ((i9 & 1) == 0) {
                    break;
                }
                int i10 = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i8;
                if (i7 == 0) {
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    if (g0.d.b(childAt)) {
                        i10 -= getTopInset();
                    }
                }
                i8 = i10;
                if ((i9 & 2) != 0) {
                    WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                    i8 -= g0.d.d(childAt);
                    break;
                }
            }
            i7++;
        }
        int max = Math.max(0, i8);
        this.f2874c = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.o(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        if (this.f2886o == null) {
            this.f2886o = new int[4];
        }
        int[] iArr = this.f2886o;
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + iArr.length);
        boolean z5 = this.f2880i;
        iArr[0] = z5 ? R.attr.state_liftable : -2130969538;
        iArr[1] = (z5 && this.f2881j) ? R.attr.state_lifted : -2130969539;
        iArr[2] = z5 ? R.attr.state_collapsible : -2130969534;
        iArr[3] = (z5 && this.f2881j) ? R.attr.state_collapsed : -2130969533;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f2884m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2884m = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        boolean z6;
        boolean z7;
        super.onLayout(z5, i6, i7, i8, i9);
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        boolean z8 = true;
        if (g0.d.b(this) && e()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        b();
        this.f2877f = false;
        int childCount2 = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount2) {
                break;
            } else if (((c) getChildAt(i10).getLayoutParams()).f2905c != null) {
                this.f2877f = true;
                break;
            } else {
                i10++;
            }
        }
        Drawable drawable = this.f2887p;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f2879h) {
            if (!this.f2882k) {
                int childCount3 = getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 < childCount3) {
                        int i12 = ((c) getChildAt(i11).getLayoutParams()).f2903a;
                        if ((i12 & 1) == 1 && (i12 & 10) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            z6 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z6 = false;
                        break;
                    }
                }
                if (!z6) {
                    z8 = false;
                }
            }
            if (this.f2880i != z8) {
                this.f2880i = z8;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        int mode = View.MeasureSpec.getMode(i7);
        if (mode != 1073741824) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            if (g0.d.b(this) && e()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = c.a.j(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i7));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        k.n(this, f6);
    }

    public void setExpanded(boolean z5) {
        int i6;
        int i7;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        boolean c6 = g0.g.c(this);
        if (z5) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        if (c6) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        this.f2878g = i6 | i7 | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z5) {
        this.f2882k = z5;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f2883l = -1;
        if (view == null) {
            WeakReference<View> weakReference = this.f2884m;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2884m = null;
            return;
        }
        this.f2884m = new WeakReference<>(view);
    }

    public void setLiftOnScrollTargetViewId(int i6) {
        this.f2883l = i6;
        WeakReference<View> weakReference = this.f2884m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2884m = null;
    }

    public void setLiftableOverrideEnabled(boolean z5) {
        this.f2879h = z5;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i6) {
        if (i6 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i6);
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z5;
        Drawable drawable2 = this.f2887p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2887p = drawable3;
            boolean z6 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2887p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f2887p;
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                a.c.b(drawable4, g0.e.d(this));
                Drawable drawable5 = this.f2887p;
                if (getVisibility() == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                drawable5.setVisible(z5, false);
                this.f2887p.setCallback(this);
            }
            if (this.f2887p != null && getTopInset() > 0) {
                z6 = true;
            }
            setWillNotDraw(!z6);
            WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
            g0.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i6) {
        setStatusBarForeground(new ColorDrawable(i6));
    }

    public void setStatusBarForegroundResource(int i6) {
        setStatusBarForeground(e.a.a(getContext(), i6));
    }

    @Deprecated
    public void setTargetElevation(float f6) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j5 = integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130969539}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j5));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(this, "elevation", f6).setDuration(j5));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z5 = i6 == 0;
        Drawable drawable = this.f2887p;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2887p;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
