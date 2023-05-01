package androidx.fragment.app;

import com.superstrong.android.R;
import java.util.concurrent.CancellationException;
import s4.j1;
import s4.l1;
import s4.u0;
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f1623a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b  reason: collision with root package name */
    public static final a1.r f1624b = new a1.r(4, "UNDEFINED");

    /* renamed from: c  reason: collision with root package name */
    public static final a1.r f1625c = new a1.r(4, "REUSABLE_CLAIMED");

    /* renamed from: d  reason: collision with root package name */
    public static final boolean[] f1626d = new boolean[3];

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1627e = {R.attr.keylines, R.attr.statusBarBackground};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1628f = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: g  reason: collision with root package name */
    public static final a1.r f1629g = new a1.r(4, "COMPLETING_ALREADY");

    /* renamed from: h  reason: collision with root package name */
    public static final a1.r f1630h = new a1.r(4, "COMPLETING_WAITING_CHILDREN");

    /* renamed from: i  reason: collision with root package name */
    public static final a1.r f1631i = new a1.r(4, "COMPLETING_RETRY");

    /* renamed from: j  reason: collision with root package name */
    public static final a1.r f1632j = new a1.r(4, "TOO_LATE_TO_CANCEL");

    /* renamed from: k  reason: collision with root package name */
    public static final a1.r f1633k = new a1.r(4, "SEALED");

    /* renamed from: l  reason: collision with root package name */
    public static final s4.k0 f1634l = new s4.k0(false);

    /* renamed from: m  reason: collision with root package name */
    public static final s4.k0 f1635m = new s4.k0(true);

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f1636n = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};

    public static void a(o.e eVar, m.d dVar, o.d dVar2) {
        dVar2.f5450p = -1;
        dVar2.f5452q = -1;
        int i6 = eVar.V[0];
        int[] iArr = dVar2.V;
        if (i6 != 2 && iArr[0] == 4) {
            o.c cVar = dVar2.K;
            int i7 = cVar.f5408g;
            int q5 = eVar.q();
            o.c cVar2 = dVar2.M;
            int i8 = q5 - cVar2.f5408g;
            cVar.f5410i = dVar.l(cVar);
            cVar2.f5410i = dVar.l(cVar2);
            dVar.d(cVar.f5410i, i7);
            dVar.d(cVar2.f5410i, i8);
            dVar2.f5450p = 2;
            dVar2.f5423b0 = i7;
            int i9 = i8 - i7;
            dVar2.X = i9;
            int i10 = dVar2.f5429e0;
            if (i9 < i10) {
                dVar2.X = i10;
            }
        }
        if (eVar.V[1] != 2 && iArr[1] == 4) {
            o.c cVar3 = dVar2.L;
            int i11 = cVar3.f5408g;
            int l5 = eVar.l();
            o.c cVar4 = dVar2.N;
            int i12 = l5 - cVar4.f5408g;
            cVar3.f5410i = dVar.l(cVar3);
            cVar4.f5410i = dVar.l(cVar4);
            dVar.d(cVar3.f5410i, i11);
            dVar.d(cVar4.f5410i, i12);
            if (dVar2.f5427d0 > 0 || dVar2.f5439j0 == 8) {
                o.c cVar5 = dVar2.O;
                m.h l6 = dVar.l(cVar5);
                cVar5.f5410i = l6;
                dVar.d(l6, dVar2.f5427d0 + i11);
            }
            dVar2.f5452q = 2;
            dVar2.f5425c0 = i11;
            int i13 = i12 - i11;
            dVar2.Y = i13;
            int i14 = dVar2.f5431f0;
            if (i13 < i14) {
                dVar2.Y = i14;
            }
        }
    }

    public static final androidx.lifecycle.g0 b(o oVar, l4.d dVar, k4.a aVar, k4.a aVar2, k4.a aVar3) {
        l4.f.f(oVar, "<this>");
        return new androidx.lifecycle.g0(dVar, aVar, aVar3, aVar2);
    }

    public static final boolean c(int i6, int i7) {
        return (i6 & i7) == i7;
    }

    public static final void d(e4.d dVar, Object obj, k4.l lVar) {
        Object nVar;
        boolean z5;
        l1<?> l1Var;
        if (dVar instanceof kotlinx.coroutines.internal.c) {
            kotlinx.coroutines.internal.c cVar = (kotlinx.coroutines.internal.c) dVar;
            Throwable a6 = c4.d.a(obj);
            boolean z6 = false;
            if (a6 == null) {
                if (lVar != null) {
                    nVar = new s4.o(obj, lVar);
                } else {
                    nVar = obj;
                }
            } else {
                nVar = new s4.n(a6, false);
            }
            s4.t tVar = cVar.f4945e;
            e4.d<T> dVar2 = cVar.f4946f;
            cVar.b();
            if (tVar.G()) {
                cVar.f4947g = nVar;
                cVar.f6065d = 1;
                cVar.f4945e.h(cVar.b(), cVar);
                return;
            }
            s4.l0 a7 = j1.a();
            if (a7.f6075c >= 4294967296L) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                cVar.f4947g = nVar;
                cVar.f6065d = 1;
                a7.I(cVar);
                return;
            }
            a7.J(true);
            try {
                s4.u0 u0Var = (s4.u0) cVar.b().get(u0.b.f6108b);
                if (u0Var != null && !u0Var.c()) {
                    CancellationException s = u0Var.s();
                    cVar.c(nVar, s);
                    cVar.d(a1.f0.e(s));
                    z6 = true;
                }
                if (!z6) {
                    Object obj2 = cVar.f4948h;
                    e4.f b6 = dVar2.b();
                    Object b7 = kotlinx.coroutines.internal.q.b(b6, obj2);
                    if (b7 != kotlinx.coroutines.internal.q.f4973a) {
                        l1Var = s4.r.b(dVar2, b6, b7);
                    } else {
                        l1Var = null;
                    }
                    dVar2.d(obj);
                    c4.h hVar = c4.h.f2763a;
                    if (l1Var == null || l1Var.X()) {
                        kotlinx.coroutines.internal.q.a(b6, b7);
                    }
                }
                do {
                } while (a7.K());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.d(obj);
    }

    public static final Object h(Object obj) {
        s4.q0 q0Var;
        s4.r0 r0Var = obj instanceof s4.r0 ? (s4.r0) obj : null;
        return (r0Var == null || (q0Var = r0Var.f6100a) == null) ? obj : q0Var;
    }

    public void f(boolean z5) {
    }

    public void g(boolean z5) {
        throw null;
    }
}
