package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.v0;
import f0.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.g;
/* loaded from: classes.dex */
public final class m extends v0 {

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f1535c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1536d;

        /* renamed from: e  reason: collision with root package name */
        public s f1537e;

        public a(v0.b bVar, b0.d dVar, boolean z5) {
            super(bVar, dVar);
            this.f1536d = false;
            this.f1535c = z5;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0061 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.fragment.app.s c(android.content.Context r10) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.a.c(android.content.Context):androidx.fragment.app.s");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final v0.b f1538a;

        /* renamed from: b  reason: collision with root package name */
        public final b0.d f1539b;

        public b(v0.b bVar, b0.d dVar) {
            this.f1538a = bVar;
            this.f1539b = dVar;
        }

        public final void a() {
            v0.b bVar = this.f1538a;
            HashSet<b0.d> hashSet = bVar.f1662e;
            if (hashSet.remove(this.f1539b) && hashSet.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            v0.b bVar = this.f1538a;
            int c6 = x0.c(bVar.f1660c.F);
            int i6 = bVar.f1658a;
            if (c6 != i6 && (c6 == 2 || i6 == 2)) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: c  reason: collision with root package name */
        public final Object f1540c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1541d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f1542e;

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
            if (r4 == androidx.fragment.app.o.U) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r4 == androidx.fragment.app.o.U) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(androidx.fragment.app.v0.b r3, b0.d r4, boolean r5, boolean r6) {
            /*
                r2 = this;
                r2.<init>(r3, r4)
                int r4 = r3.f1658a
                r0 = 2
                r1 = 0
                androidx.fragment.app.o r3 = r3.f1660c
                if (r4 != r0) goto L27
                if (r5 == 0) goto L19
                androidx.fragment.app.o$c r4 = r3.I
                if (r4 != 0) goto L12
                goto L1c
            L12:
                java.lang.Object r4 = r4.f1601j
                java.lang.Object r0 = androidx.fragment.app.o.U
                if (r4 != r0) goto L1d
                goto L1c
            L19:
                r3.getClass()
            L1c:
                r4 = r1
            L1d:
                r2.f1540c = r4
                if (r5 == 0) goto L24
                androidx.fragment.app.o$c r4 = r3.I
                goto L3b
            L24:
                androidx.fragment.app.o$c r4 = r3.I
                goto L3b
            L27:
                if (r5 == 0) goto L35
                androidx.fragment.app.o$c r4 = r3.I
                if (r4 != 0) goto L2e
                goto L38
            L2e:
                java.lang.Object r4 = r4.f1600i
                java.lang.Object r0 = androidx.fragment.app.o.U
                if (r4 != r0) goto L39
                goto L38
            L35:
                r3.getClass()
            L38:
                r4 = r1
            L39:
                r2.f1540c = r4
            L3b:
                r4 = 1
                r2.f1541d = r4
                if (r6 == 0) goto L53
                if (r5 == 0) goto L50
                androidx.fragment.app.o$c r3 = r3.I
                if (r3 != 0) goto L47
                goto L53
            L47:
                java.lang.Object r3 = r3.f1602k
                java.lang.Object r4 = androidx.fragment.app.o.U
                if (r3 != r4) goto L4e
                goto L53
            L4e:
                r1 = r3
                goto L53
            L50:
                r3.getClass()
            L53:
                r2.f1542e = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.c.<init>(androidx.fragment.app.v0$b, b0.d, boolean, boolean):void");
        }

        public final p0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            l0 l0Var = j0.f1526a;
            if (l0Var != null && (obj instanceof Transition)) {
                return l0Var;
            }
            p0 p0Var = j0.f1527b;
            if (p0Var != null && p0Var.e(obj)) {
                return p0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1538a.f1660c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public m(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void i(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (f0.n0.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = viewGroup.getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    i(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(l.b bVar, View view) {
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        String k5 = g0.i.k(view);
        if (k5 != null) {
            bVar.put(k5, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = viewGroup.getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    j(bVar, childAt);
                }
            }
        }
    }

    public static void k(l.b bVar, Collection collection) {
        Iterator it = ((g.b) bVar.entrySet()).iterator();
        while (true) {
            g.d dVar = (g.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
                if (!collection.contains(g0.i.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0537, code lost:
        if (r11 == r4) goto L327;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x057c  */
    @Override // androidx.fragment.app.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 2143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.b(java.util.ArrayList, boolean):void");
    }
}
