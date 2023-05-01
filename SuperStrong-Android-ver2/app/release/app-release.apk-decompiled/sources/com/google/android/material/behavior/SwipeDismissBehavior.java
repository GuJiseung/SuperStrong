package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.g0;
import f0.r0;
import g0.f;
import java.util.WeakHashMap;
import m0.c;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public c f2927a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2928b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2929c;

    /* renamed from: d  reason: collision with root package name */
    public int f2930d = 2;

    /* renamed from: e  reason: collision with root package name */
    public final float f2931e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f2932f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f2933g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final a f2934h = new a();

    /* loaded from: classes.dex */
    public class a extends c.AbstractC0063c {

        /* renamed from: a  reason: collision with root package name */
        public int f2935a;

        /* renamed from: b  reason: collision with root package name */
        public int f2936b = -1;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
            if (r0 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
            r0 = r3.f2935a;
            r4 = r4.getWidth() + r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
            r0 = r3.f2935a - r4.getWidth();
            r4 = r3.f2935a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
            if (r0 != false) goto L11;
         */
        @Override // m0.c.AbstractC0063c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int a(android.view.View r4, int r5) {
            /*
                r3 = this;
                java.util.WeakHashMap<android.view.View, f0.r0> r0 = f0.g0.f3878a
                int r0 = f0.g0.e.d(r4)
                r1 = 1
                if (r0 != r1) goto Lb
                r0 = r1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r2 = r2.f2930d
                if (r2 != 0) goto L15
                if (r0 == 0) goto L19
                goto L21
            L15:
                if (r2 != r1) goto L2b
                if (r0 == 0) goto L21
            L19:
                int r0 = r3.f2935a
                int r4 = r4.getWidth()
                int r4 = r4 + r0
                goto L39
            L21:
                int r0 = r3.f2935a
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r4 = r3.f2935a
                goto L39
            L2b:
                int r0 = r3.f2935a
                int r1 = r4.getWidth()
                int r0 = r0 - r1
                int r1 = r3.f2935a
                int r4 = r4.getWidth()
                int r4 = r4 + r1
            L39:
                int r5 = java.lang.Math.max(r0, r5)
                int r4 = java.lang.Math.min(r5, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int):int");
        }

        @Override // m0.c.AbstractC0063c
        public final int b(View view, int i6) {
            return view.getTop();
        }

        @Override // m0.c.AbstractC0063c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // m0.c.AbstractC0063c
        public final void e(View view, int i6) {
            this.f2936b = i6;
            this.f2935a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f2929c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f2929c = false;
            }
        }

        @Override // m0.c.AbstractC0063c
        public final void f(int i6) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // m0.c.AbstractC0063c
        public final void g(View view, int i6, int i7) {
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float width = view.getWidth() * swipeDismissBehavior.f2932f;
            float width2 = view.getWidth() * swipeDismissBehavior.f2933g;
            float abs = Math.abs(i6 - this.f2935a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
            if (java.lang.Math.abs(r9.getLeft() - r8.f2935a) >= java.lang.Math.round(r9.getWidth() * r3.f2931e)) goto L33;
         */
        @Override // m0.c.AbstractC0063c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f2936b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r4 = 0
                if (r1 == 0) goto L39
                java.util.WeakHashMap<android.view.View, f0.r0> r5 = f0.g0.f3878a
                int r5 = f0.g0.e.d(r9)
                if (r5 != r2) goto L1a
                r5 = r2
                goto L1b
            L1a:
                r5 = r4
            L1b:
                int r6 = r3.f2930d
                r7 = 2
                if (r6 != r7) goto L21
                goto L52
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L54
                goto L52
            L2a:
                if (r1 <= 0) goto L54
                goto L52
            L2d:
                if (r6 != r2) goto L54
                if (r5 == 0) goto L34
                if (r1 <= 0) goto L54
                goto L52
            L34:
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L54
                goto L52
            L39:
                int r1 = r9.getLeft()
                int r5 = r8.f2935a
                int r1 = r1 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                float r6 = r3.f2931e
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r5) goto L54
            L52:
                r1 = r2
                goto L55
            L54:
                r1 = r4
            L55:
                if (r1 == 0) goto L6b
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L66
                int r10 = r9.getLeft()
                int r0 = r8.f2935a
                if (r10 >= r0) goto L64
                goto L66
            L64:
                int r0 = r0 + r11
                goto L6e
            L66:
                int r10 = r8.f2935a
                int r0 = r10 - r11
                goto L6e
            L6b:
                int r0 = r8.f2935a
                r2 = r4
            L6e:
                m0.c r10 = r3.f2927a
                int r11 = r9.getTop()
                boolean r10 = r10.q(r0, r11)
                if (r10 == 0) goto L84
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                r10.<init>(r9, r2)
                java.util.WeakHashMap<android.view.View, f0.r0> r11 = f0.g0.f3878a
                f0.g0.d.m(r9, r10)
            L84:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // m0.c.AbstractC0063c
        public final boolean i(View view, int i6) {
            int i7 = this.f2936b;
            return (i7 == -1 || i7 == i6) && SwipeDismissBehavior.this.s(view);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final View f2938b;

        public b(View view, boolean z5) {
            this.f2938b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = SwipeDismissBehavior.this.f2927a;
            if (cVar != null && cVar.g()) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.d.m(this.f2938b, this);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z5 = this.f2928b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f2928b = false;
            }
        } else {
            z5 = coordinatorLayout.l(v2, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2928b = z5;
        }
        if (!z5) {
            return false;
        }
        if (this.f2927a == null) {
            this.f2927a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f2934h);
        }
        if (!this.f2929c && this.f2927a.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v2, int i6) {
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.d.c(v2) == 0) {
            g0.d.s(v2, 1);
            g0.i(v2, 1048576);
            g0.g(v2, 0);
            if (s(v2)) {
                g0.j(v2, f.a.f4103j, new k2.a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (this.f2927a != null) {
            if (this.f2929c && motionEvent.getActionMasked() == 3) {
                return true;
            }
            this.f2927a.k(motionEvent);
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}
