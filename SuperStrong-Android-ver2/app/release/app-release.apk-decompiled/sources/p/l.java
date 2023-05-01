package p;

import java.util.ArrayList;
import o.c;
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f5662k = new int[2];

    public l(o.d dVar) {
        super(dVar);
        this.f5680h.f5652e = 4;
        this.f5681i.f5652e = 5;
        this.f5678f = 0;
    }

    public static void m(int[] iArr, int i6, int i7, int i8, int i9, float f6, int i10) {
        int i11 = i7 - i6;
        int i12 = i9 - i8;
        if (i10 != -1) {
            if (i10 == 0) {
                iArr[0] = (int) ((i12 * f6) + 0.5f);
                iArr[1] = i12;
                return;
            } else if (i10 != 1) {
                return;
            } else {
                iArr[0] = i11;
                iArr[1] = (int) ((i11 * f6) + 0.5f);
                return;
            }
        }
        int i13 = (int) ((i12 * f6) + 0.5f);
        int i14 = (int) ((i11 / f6) + 0.5f);
        if (i13 <= i11) {
            iArr[0] = i13;
            iArr[1] = i12;
        } else if (i14 <= i12) {
            iArr[0] = i11;
            iArr[1] = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x022a, code lost:
        if (r3 != 1) goto L125;
     */
    @Override // p.p, p.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(p.d r24) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l.a(p.d):void");
    }

    @Override // p.p
    public final void d() {
        o.d dVar;
        o.d dVar2;
        int i6;
        o.d dVar3;
        o.c cVar;
        ArrayList arrayList;
        o.d dVar4;
        int i7;
        o.d dVar5 = this.f5674b;
        boolean z5 = dVar5.f5420a;
        g gVar = this.f5677e;
        if (z5) {
            gVar.d(dVar5.q());
        }
        boolean z6 = gVar.f5657j;
        f fVar = this.f5681i;
        f fVar2 = this.f5680h;
        if (!z6) {
            o.d dVar6 = this.f5674b;
            int i8 = dVar6.V[0];
            this.f5676d = i8;
            if (i8 != 3) {
                if (i8 == 4 && (dVar4 = dVar6.W) != null && ((i7 = dVar4.V[0]) == 1 || i7 == 4)) {
                    int q5 = (dVar4.q() - this.f5674b.K.e()) - this.f5674b.M.e();
                    p.b(fVar2, dVar4.f5426d.f5680h, this.f5674b.K.e());
                    p.b(fVar, dVar4.f5426d.f5681i, -this.f5674b.M.e());
                    gVar.d(q5);
                    return;
                } else if (i8 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.f5676d == 4 && (dVar2 = (dVar = this.f5674b).W) != null && ((i6 = dVar2.V[0]) == 1 || i6 == 4)) {
            p.b(fVar2, dVar2.f5426d.f5680h, dVar.K.e());
            p.b(fVar, dVar2.f5426d.f5681i, -this.f5674b.M.e());
            return;
        }
        if (gVar.f5657j) {
            o.d dVar7 = this.f5674b;
            if (dVar7.f5420a) {
                o.c[] cVarArr = dVar7.S;
                o.c cVar2 = cVarArr[0];
                o.c cVar3 = cVar2.f5407f;
                if (cVar3 != null && cVarArr[1].f5407f != null) {
                    if (dVar7.x()) {
                        fVar2.f5653f = this.f5674b.S[0].e();
                        cVar = this.f5674b.S[1];
                        fVar.f5653f = -cVar.e();
                        return;
                    }
                    f h6 = p.h(this.f5674b.S[0]);
                    if (h6 != null) {
                        p.b(fVar2, h6, this.f5674b.S[0].e());
                    }
                    f h7 = p.h(this.f5674b.S[1]);
                    if (h7 != null) {
                        p.b(fVar, h7, -this.f5674b.S[1].e());
                    }
                    fVar2.f5649b = true;
                    fVar.f5649b = true;
                    return;
                }
                if (cVar3 != null) {
                    f h8 = p.h(cVar2);
                    if (h8 != null) {
                        p.b(fVar2, h8, this.f5674b.S[0].e());
                    } else {
                        return;
                    }
                } else {
                    o.c cVar4 = cVarArr[1];
                    if (cVar4.f5407f != null) {
                        f h9 = p.h(cVar4);
                        if (h9 != null) {
                            p.b(fVar, h9, -this.f5674b.S[1].e());
                            p.b(fVar2, fVar, -gVar.f5654g);
                            return;
                        }
                        return;
                    } else if (!(dVar7 instanceof o.h) && dVar7.W != null && dVar7.j(c.a.CENTER).f5407f == null) {
                        o.d dVar8 = this.f5674b;
                        p.b(fVar2, dVar8.W.f5426d.f5680h, dVar8.r());
                    } else {
                        return;
                    }
                }
                p.b(fVar, fVar2, gVar.f5654g);
                return;
            }
        }
        if (this.f5676d == 3) {
            o.d dVar9 = this.f5674b;
            int i9 = dVar9.s;
            ArrayList arrayList2 = gVar.f5658k;
            ArrayList arrayList3 = gVar.f5659l;
            if (i9 != 2) {
                if (i9 == 3) {
                    if (dVar9.f5455t == 3) {
                        fVar2.f5648a = this;
                        fVar.f5648a = this;
                        n nVar = dVar9.f5428e;
                        nVar.f5680h.f5648a = this;
                        nVar.f5681i.f5648a = this;
                        gVar.f5648a = this;
                        if (dVar9.y()) {
                            arrayList3.add(this.f5674b.f5428e.f5677e);
                            this.f5674b.f5428e.f5677e.f5658k.add(gVar);
                            n nVar2 = this.f5674b.f5428e;
                            nVar2.f5677e.f5648a = this;
                            arrayList3.add(nVar2.f5680h);
                            arrayList3.add(this.f5674b.f5428e.f5681i);
                            this.f5674b.f5428e.f5680h.f5658k.add(gVar);
                            arrayList = this.f5674b.f5428e.f5681i.f5658k;
                        } else if (this.f5674b.x()) {
                            this.f5674b.f5428e.f5677e.f5659l.add(gVar);
                            arrayList2.add(this.f5674b.f5428e.f5677e);
                        } else {
                            arrayList = this.f5674b.f5428e.f5677e.f5659l;
                        }
                    } else {
                        g gVar2 = dVar9.f5428e.f5677e;
                        arrayList3.add(gVar2);
                        gVar2.f5658k.add(gVar);
                        this.f5674b.f5428e.f5680h.f5658k.add(gVar);
                        this.f5674b.f5428e.f5681i.f5658k.add(gVar);
                        gVar.f5649b = true;
                        arrayList2.add(fVar2);
                        arrayList2.add(fVar);
                        fVar2.f5659l.add(gVar);
                        arrayList = fVar.f5659l;
                    }
                    arrayList.add(gVar);
                }
            } else {
                o.d dVar10 = dVar9.W;
                if (dVar10 != null) {
                    g gVar3 = dVar10.f5428e.f5677e;
                    arrayList3.add(gVar3);
                    gVar3.f5658k.add(gVar);
                    gVar.f5649b = true;
                    arrayList2.add(fVar2);
                    arrayList2.add(fVar);
                }
            }
        }
        o.d dVar11 = this.f5674b;
        o.c[] cVarArr2 = dVar11.S;
        o.c cVar5 = cVarArr2[0];
        o.c cVar6 = cVar5.f5407f;
        if (cVar6 != null && cVarArr2[1].f5407f != null) {
            if (dVar11.x()) {
                fVar2.f5653f = this.f5674b.S[0].e();
                cVar = this.f5674b.S[1];
                fVar.f5653f = -cVar.e();
                return;
            }
            f h10 = p.h(this.f5674b.S[0]);
            f h11 = p.h(this.f5674b.S[1]);
            if (h10 != null) {
                h10.b(this);
            }
            if (h11 != null) {
                h11.b(this);
            }
            this.f5682j = 4;
            return;
        }
        if (cVar6 != null) {
            f h12 = p.h(cVar5);
            if (h12 != null) {
                p.b(fVar2, h12, this.f5674b.S[0].e());
            } else {
                return;
            }
        } else {
            o.c cVar7 = cVarArr2[1];
            if (cVar7.f5407f != null) {
                f h13 = p.h(cVar7);
                if (h13 != null) {
                    p.b(fVar, h13, -this.f5674b.S[1].e());
                    c(fVar2, fVar, -1, gVar);
                    return;
                }
                return;
            } else if (!(dVar11 instanceof o.h) && (dVar3 = dVar11.W) != null) {
                p.b(fVar2, dVar3.f5426d.f5680h, dVar11.r());
            } else {
                return;
            }
        }
        c(fVar, fVar2, 1, gVar);
    }

    @Override // p.p
    public final void e() {
        f fVar = this.f5680h;
        if (fVar.f5657j) {
            this.f5674b.f5423b0 = fVar.f5654g;
        }
    }

    @Override // p.p
    public final void f() {
        this.f5675c = null;
        this.f5680h.c();
        this.f5681i.c();
        this.f5677e.c();
        this.f5679g = false;
    }

    @Override // p.p
    public final boolean k() {
        return this.f5676d != 3 || this.f5674b.s == 0;
    }

    public final void n() {
        this.f5679g = false;
        f fVar = this.f5680h;
        fVar.c();
        fVar.f5657j = false;
        f fVar2 = this.f5681i;
        fVar2.c();
        fVar2.f5657j = false;
        this.f5677e.f5657j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f5674b.f5441k0;
    }
}
