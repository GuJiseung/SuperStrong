package a1;

import a1.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class h0 extends i {

    /* renamed from: z  reason: collision with root package name */
    public static final String[] f39z = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: y  reason: collision with root package name */
    public int f40y = 3;

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements i.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f41a;

        /* renamed from: b  reason: collision with root package name */
        public final int f42b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f43c;

        /* renamed from: e  reason: collision with root package name */
        public boolean f45e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f46f = false;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f44d = true;

        public a(View view, int i6) {
            this.f41a = view;
            this.f42b = i6;
            this.f43c = (ViewGroup) view.getParent();
            f(true);
        }

        @Override // a1.i.d
        public final void a() {
        }

        @Override // a1.i.d
        public final void b() {
            f(false);
        }

        @Override // a1.i.d
        public final void c() {
            f(true);
        }

        @Override // a1.i.d
        public final void d() {
        }

        @Override // a1.i.d
        public final void e(i iVar) {
            if (!this.f46f) {
                u.f103a.k(this.f41a, this.f42b);
                ViewGroup viewGroup = this.f43c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            iVar.y(this);
        }

        public final void f(boolean z5) {
            ViewGroup viewGroup;
            if (!this.f44d || this.f45e == z5 || (viewGroup = this.f43c) == null) {
                return;
            }
            this.f45e = z5;
            t.a(viewGroup, z5);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f46f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f46f) {
                u.f103a.k(this.f41a, this.f42b);
                ViewGroup viewGroup = this.f43c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (!this.f46f) {
                u.f103a.k(this.f41a, this.f42b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (!this.f46f) {
                u.f103a.k(this.f41a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f47a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f48b;

        /* renamed from: c  reason: collision with root package name */
        public int f49c;

        /* renamed from: d  reason: collision with root package name */
        public int f50d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f51e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f52f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r9 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r0.f51e == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r0.f49c == 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a1.h0.b L(a1.q r8, a1.q r9) {
        /*
            a1.h0$b r0 = new a1.h0$b
            r0.<init>()
            r1 = 0
            r0.f47a = r1
            r0.f48b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f97a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f49c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f51e = r6
            goto L33
        L2f:
            r0.f49c = r4
            r0.f51e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f97a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f50d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f52f = r2
            goto L56
        L52:
            r0.f50d = r4
            r0.f52f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L7a
            if (r9 == 0) goto L7a
            int r8 = r0.f49c
            int r9 = r0.f50d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f51e
            android.view.ViewGroup r4 = r0.f52f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L70
            if (r8 != 0) goto L6d
            goto L89
        L6d:
            if (r9 != 0) goto L8d
            goto L80
        L70:
            android.view.ViewGroup r8 = r0.f52f
            if (r8 != 0) goto L75
            goto L89
        L75:
            android.view.ViewGroup r8 = r0.f51e
            if (r8 != 0) goto L8d
            goto L80
        L7a:
            if (r8 != 0) goto L83
            int r8 = r0.f50d
            if (r8 != 0) goto L83
        L80:
            r0.f48b = r2
            goto L8b
        L83:
            if (r9 != 0) goto L8d
            int r8 = r0.f49c
            if (r8 != 0) goto L8d
        L89:
            r0.f48b = r1
        L8b:
            r0.f47a = r2
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h0.L(a1.q, a1.q):a1.h0$b");
    }

    public final void K(q qVar) {
        View view = qVar.f98b;
        int visibility = view.getVisibility();
        HashMap hashMap = qVar.f97a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    @Override // a1.i
    public final void d(q qVar) {
        K(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (L(q(r3, false), t(r3, false)).f47a != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01eb  */
    @Override // a1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator l(android.view.ViewGroup r22, a1.q r23, a1.q r24) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h0.l(android.view.ViewGroup, a1.q, a1.q):android.animation.Animator");
    }

    @Override // a1.i
    public final String[] s() {
        return f39z;
    }

    @Override // a1.i
    public final boolean u(q qVar, q qVar2) {
        if (qVar == null && qVar2 == null) {
            return false;
        }
        if (qVar == null || qVar2 == null || qVar2.f97a.containsKey("android:visibility:visibility") == qVar.f97a.containsKey("android:visibility:visibility")) {
            b L = L(qVar, qVar2);
            if (L.f47a) {
                return L.f49c == 0 || L.f50d == 0;
            }
            return false;
        }
        return false;
    }
}
