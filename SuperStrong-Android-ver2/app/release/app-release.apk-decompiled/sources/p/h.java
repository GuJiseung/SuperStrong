package p;

import java.util.HashSet;
import java.util.Iterator;
import o.c;
import p.b;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f5661a = new b.a();

    public static boolean a(o.d dVar) {
        o.e eVar;
        boolean z5;
        boolean z6;
        int[] iArr = dVar.V;
        int i6 = iArr[0];
        int i7 = iArr[1];
        o.d dVar2 = dVar.W;
        if (dVar2 != null) {
            eVar = (o.e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i8 = eVar.V[0];
        }
        if (eVar != null) {
            int i9 = eVar.V[1];
        }
        if (i6 != 1 && !dVar.A() && i6 != 2 && ((i6 != 3 || dVar.s != 0 || dVar.Z != 0.0f || !dVar.t(0)) && (i6 != 3 || dVar.s != 1 || !dVar.u(0, dVar.q())))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (i7 != 1 && !dVar.B() && i7 != 2 && ((i7 != 3 || dVar.f5455t != 0 || dVar.Z != 0.0f || !dVar.t(1)) && (i7 != 3 || dVar.f5455t != 1 || !dVar.u(1, dVar.l())))) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (dVar.Z > 0.0f && (z5 || z6)) {
            return true;
        }
        if (!z5 || !z6) {
            return false;
        }
        return true;
    }

    public static void b(int i6, o.d dVar, b.InterfaceC0073b interfaceC0073b, boolean z5) {
        boolean z6;
        o.c cVar;
        o.c cVar2;
        Iterator<o.c> it;
        boolean z7;
        o.c cVar3;
        o.c cVar4;
        if (dVar.f5446n) {
            return;
        }
        if (!(dVar instanceof o.e) && dVar.z() && a(dVar)) {
            o.e.U(dVar, interfaceC0073b, new b.a());
        }
        o.c j5 = dVar.j(c.a.LEFT);
        o.c j6 = dVar.j(c.a.RIGHT);
        int d6 = j5.d();
        int d7 = j6.d();
        HashSet<o.c> hashSet = j5.f5402a;
        if (hashSet != null && j5.f5404c) {
            Iterator<o.c> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                o.c next = it2.next();
                o.d dVar2 = next.f5405d;
                int i7 = i6 + 1;
                boolean a6 = a(dVar2);
                if (dVar2.z() && a6) {
                    o.e.U(dVar2, interfaceC0073b, new b.a());
                }
                o.c cVar5 = dVar2.K;
                o.c cVar6 = dVar2.M;
                if ((next == cVar5 && (cVar4 = cVar6.f5407f) != null && cVar4.f5404c) || (next == cVar6 && (cVar3 = cVar5.f5407f) != null && cVar3.f5404c)) {
                    it = it2;
                    z7 = true;
                } else {
                    it = it2;
                    z7 = false;
                }
                int i8 = dVar2.V[0];
                if (i8 == 3 && !a6) {
                    if (i8 == 3 && dVar2.f5457w >= 0 && dVar2.f5456v >= 0 && ((dVar2.f5439j0 == 8 || (dVar2.s == 0 && dVar2.Z == 0.0f)) && !dVar2.x() && !dVar2.H && z7 && !dVar2.x())) {
                        d(i7, dVar, interfaceC0073b, dVar2, z5);
                    }
                } else if (!dVar2.z()) {
                    if (next == cVar5 && cVar6.f5407f == null) {
                        int e6 = cVar5.e() + d6;
                        dVar2.I(e6, dVar2.q() + e6);
                    } else if (next == cVar6 && cVar5.f5407f == null) {
                        int e7 = d6 - cVar6.e();
                        dVar2.I(e7 - dVar2.q(), e7);
                    } else if (z7 && !dVar2.x()) {
                        c(i7, dVar2, interfaceC0073b, z5);
                    }
                    b(i7, dVar2, interfaceC0073b, z5);
                }
                it2 = it;
            }
        }
        if (dVar instanceof o.g) {
            return;
        }
        HashSet<o.c> hashSet2 = j6.f5402a;
        if (hashSet2 != null && j6.f5404c) {
            Iterator<o.c> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                o.c next2 = it3.next();
                o.d dVar3 = next2.f5405d;
                int i9 = i6 + 1;
                boolean a7 = a(dVar3);
                if (dVar3.z() && a7) {
                    o.e.U(dVar3, interfaceC0073b, new b.a());
                }
                o.c cVar7 = dVar3.K;
                o.c cVar8 = dVar3.M;
                if ((next2 == cVar7 && (cVar2 = cVar8.f5407f) != null && cVar2.f5404c) || (next2 == cVar8 && (cVar = cVar7.f5407f) != null && cVar.f5404c)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i10 = dVar3.V[0];
                if (i10 == 3 && !a7) {
                    if (i10 == 3 && dVar3.f5457w >= 0 && dVar3.f5456v >= 0) {
                        if (dVar3.f5439j0 != 8) {
                            if (dVar3.s == 0) {
                                if (dVar3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!dVar3.x() && !dVar3.H && z6 && !dVar3.x()) {
                            d(i9, dVar, interfaceC0073b, dVar3, z5);
                        }
                    }
                } else if (!dVar3.z()) {
                    if (next2 == cVar7 && cVar8.f5407f == null) {
                        int e8 = cVar7.e() + d7;
                        dVar3.I(e8, dVar3.q() + e8);
                    } else if (next2 == cVar8 && cVar7.f5407f == null) {
                        int e9 = d7 - cVar8.e();
                        dVar3.I(e9 - dVar3.q(), e9);
                    } else if (z6 && !dVar3.x()) {
                        c(i9, dVar3, interfaceC0073b, z5);
                    }
                    b(i9, dVar3, interfaceC0073b, z5);
                }
            }
        }
        dVar.f5446n = true;
    }

    public static void c(int i6, o.d dVar, b.InterfaceC0073b interfaceC0073b, boolean z5) {
        float f6;
        float f7 = dVar.f5433g0;
        o.c cVar = dVar.K;
        int d6 = cVar.f5407f.d();
        o.c cVar2 = dVar.M;
        int d7 = cVar2.f5407f.d();
        int e6 = cVar.e() + d6;
        int e7 = d7 - cVar2.e();
        if (d6 == d7) {
            f7 = 0.5f;
        } else {
            d6 = e6;
            d7 = e7;
        }
        int q5 = dVar.q();
        int i7 = (d7 - d6) - q5;
        if (d6 > d7) {
            i7 = (d6 - d7) - q5;
        }
        if (i7 > 0) {
            f6 = (f7 * i7) + 0.5f;
        } else {
            f6 = f7 * i7;
        }
        int i8 = ((int) f6) + d6;
        int i9 = i8 + q5;
        if (d6 > d7) {
            i9 = i8 - q5;
        }
        dVar.I(i8, i9);
        b(i6 + 1, dVar, interfaceC0073b, z5);
    }

    public static void d(int i6, o.d dVar, b.InterfaceC0073b interfaceC0073b, o.d dVar2, boolean z5) {
        float f6 = dVar2.f5433g0;
        o.c cVar = dVar2.K;
        int e6 = cVar.e() + cVar.f5407f.d();
        o.c cVar2 = dVar2.M;
        int d6 = cVar2.f5407f.d() - cVar2.e();
        if (d6 >= e6) {
            int q5 = dVar2.q();
            if (dVar2.f5439j0 != 8) {
                int i7 = dVar2.s;
                if (i7 == 2) {
                    if (!(dVar instanceof o.e)) {
                        dVar = dVar.W;
                    }
                    q5 = (int) (dVar2.f5433g0 * 0.5f * dVar.q());
                } else if (i7 == 0) {
                    q5 = d6 - e6;
                }
                q5 = Math.max(dVar2.f5456v, q5);
                int i8 = dVar2.f5457w;
                if (i8 > 0) {
                    q5 = Math.min(i8, q5);
                }
            }
            int i9 = e6 + ((int) ((f6 * ((d6 - e6) - q5)) + 0.5f));
            dVar2.I(i9, q5 + i9);
            b(i6 + 1, dVar2, interfaceC0073b, z5);
        }
    }

    public static void e(int i6, o.d dVar, b.InterfaceC0073b interfaceC0073b) {
        float f6;
        float f7 = dVar.f5435h0;
        o.c cVar = dVar.L;
        int d6 = cVar.f5407f.d();
        o.c cVar2 = dVar.N;
        int d7 = cVar2.f5407f.d();
        int e6 = cVar.e() + d6;
        int e7 = d7 - cVar2.e();
        if (d6 == d7) {
            f7 = 0.5f;
        } else {
            d6 = e6;
            d7 = e7;
        }
        int l5 = dVar.l();
        int i7 = (d7 - d6) - l5;
        if (d6 > d7) {
            i7 = (d6 - d7) - l5;
        }
        if (i7 > 0) {
            f6 = (f7 * i7) + 0.5f;
        } else {
            f6 = f7 * i7;
        }
        int i8 = (int) f6;
        int i9 = d6 + i8;
        int i10 = i9 + l5;
        if (d6 > d7) {
            i9 = d6 - i8;
            i10 = i9 - l5;
        }
        dVar.J(i9, i10);
        g(i6 + 1, dVar, interfaceC0073b);
    }

    public static void f(int i6, o.d dVar, b.InterfaceC0073b interfaceC0073b, o.d dVar2) {
        float f6 = dVar2.f5435h0;
        o.c cVar = dVar2.L;
        int e6 = cVar.e() + cVar.f5407f.d();
        o.c cVar2 = dVar2.N;
        int d6 = cVar2.f5407f.d() - cVar2.e();
        if (d6 >= e6) {
            int l5 = dVar2.l();
            if (dVar2.f5439j0 != 8) {
                int i7 = dVar2.f5455t;
                if (i7 == 2) {
                    if (!(dVar instanceof o.e)) {
                        dVar = dVar.W;
                    }
                    l5 = (int) (f6 * 0.5f * dVar.l());
                } else if (i7 == 0) {
                    l5 = d6 - e6;
                }
                l5 = Math.max(dVar2.f5459y, l5);
                int i8 = dVar2.f5460z;
                if (i8 > 0) {
                    l5 = Math.min(i8, l5);
                }
            }
            int i9 = e6 + ((int) ((f6 * ((d6 - e6) - l5)) + 0.5f));
            dVar2.J(i9, l5 + i9);
            g(i6 + 1, dVar2, interfaceC0073b);
        }
    }

    public static void g(int i6, o.d dVar, b.InterfaceC0073b interfaceC0073b) {
        o.c cVar;
        boolean z5;
        o.c cVar2;
        o.c cVar3;
        boolean z6;
        o.c cVar4;
        o.c cVar5;
        if (dVar.f5448o) {
            return;
        }
        if (!(dVar instanceof o.e) && dVar.z() && a(dVar)) {
            o.e.U(dVar, interfaceC0073b, new b.a());
        }
        o.c j5 = dVar.j(c.a.TOP);
        o.c j6 = dVar.j(c.a.BOTTOM);
        int d6 = j5.d();
        int d7 = j6.d();
        HashSet<o.c> hashSet = j5.f5402a;
        if (hashSet != null && j5.f5404c) {
            Iterator<o.c> it = hashSet.iterator();
            while (it.hasNext()) {
                o.c next = it.next();
                o.d dVar2 = next.f5405d;
                int i7 = i6 + 1;
                boolean a6 = a(dVar2);
                if (dVar2.z() && a6) {
                    o.e.U(dVar2, interfaceC0073b, new b.a());
                }
                o.c cVar6 = dVar2.L;
                o.c cVar7 = dVar2.N;
                if ((next == cVar6 && (cVar5 = cVar7.f5407f) != null && cVar5.f5404c) || (next == cVar7 && (cVar4 = cVar6.f5407f) != null && cVar4.f5404c)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i8 = dVar2.V[1];
                if (i8 == 3 && !a6) {
                    if (i8 == 3 && dVar2.f5460z >= 0 && dVar2.f5459y >= 0 && (dVar2.f5439j0 == 8 || (dVar2.f5455t == 0 && dVar2.Z == 0.0f))) {
                        if (!dVar2.y() && !dVar2.H && z6 && !dVar2.y()) {
                            f(i7, dVar, interfaceC0073b, dVar2);
                        }
                    }
                } else if (!dVar2.z()) {
                    if (next == cVar6 && cVar7.f5407f == null) {
                        int e6 = cVar6.e() + d6;
                        dVar2.J(e6, dVar2.l() + e6);
                    } else if (next == cVar7 && cVar6.f5407f == null) {
                        int e7 = d6 - cVar7.e();
                        dVar2.J(e7 - dVar2.l(), e7);
                    } else if (z6 && !dVar2.y()) {
                        e(i7, dVar2, interfaceC0073b);
                    }
                    g(i7, dVar2, interfaceC0073b);
                }
            }
        }
        if (dVar instanceof o.g) {
            return;
        }
        HashSet<o.c> hashSet2 = j6.f5402a;
        if (hashSet2 != null && j6.f5404c) {
            Iterator<o.c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                o.c next2 = it2.next();
                o.d dVar3 = next2.f5405d;
                int i9 = i6 + 1;
                boolean a7 = a(dVar3);
                if (dVar3.z() && a7) {
                    o.e.U(dVar3, interfaceC0073b, new b.a());
                }
                o.c cVar8 = dVar3.L;
                o.c cVar9 = dVar3.N;
                if ((next2 == cVar8 && (cVar3 = cVar9.f5407f) != null && cVar3.f5404c) || (next2 == cVar9 && (cVar2 = cVar8.f5407f) != null && cVar2.f5404c)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i10 = dVar3.V[1];
                if (i10 == 3 && !a7) {
                    if (i10 == 3 && dVar3.f5460z >= 0 && dVar3.f5459y >= 0) {
                        if (dVar3.f5439j0 != 8) {
                            if (dVar3.f5455t == 0) {
                                if (dVar3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!dVar3.y() && !dVar3.H && z5 && !dVar3.y()) {
                            f(i9, dVar, interfaceC0073b, dVar3);
                        }
                    }
                } else if (!dVar3.z()) {
                    if (next2 == cVar8 && cVar9.f5407f == null) {
                        int e8 = cVar8.e() + d7;
                        dVar3.J(e8, dVar3.l() + e8);
                    } else if (next2 == cVar9 && cVar8.f5407f == null) {
                        int e9 = d7 - cVar9.e();
                        dVar3.J(e9 - dVar3.l(), e9);
                    } else if (z5 && !dVar3.y()) {
                        e(i9, dVar3, interfaceC0073b);
                    }
                    g(i9, dVar3, interfaceC0073b);
                }
            }
        }
        o.c j7 = dVar.j(c.a.BASELINE);
        if (j7.f5402a != null && j7.f5404c) {
            int d8 = j7.d();
            Iterator<o.c> it3 = j7.f5402a.iterator();
            while (it3.hasNext()) {
                o.c next3 = it3.next();
                o.d dVar4 = next3.f5405d;
                int i11 = i6 + 1;
                boolean a8 = a(dVar4);
                if (dVar4.z() && a8) {
                    o.e.U(dVar4, interfaceC0073b, new b.a());
                }
                if (dVar4.V[1] != 3 || a8) {
                    if (!dVar4.z() && next3 == (cVar = dVar4.O)) {
                        int e10 = next3.e() + d8;
                        if (dVar4.F) {
                            int i12 = e10 - dVar4.f5427d0;
                            int i13 = dVar4.Y + i12;
                            dVar4.f5425c0 = i12;
                            dVar4.L.l(i12);
                            dVar4.N.l(i13);
                            cVar.l(e10);
                            dVar4.f5444m = true;
                        }
                        g(i11, dVar4, interfaceC0073b);
                    }
                }
            }
        }
        dVar.f5448o = true;
    }
}
