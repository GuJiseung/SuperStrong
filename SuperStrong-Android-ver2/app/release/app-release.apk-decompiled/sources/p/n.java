package p;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public final f f5665k;

    /* renamed from: l  reason: collision with root package name */
    public a f5666l;

    public n(o.d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.f5665k = fVar;
        this.f5666l = null;
        this.f5680h.f5652e = 6;
        this.f5681i.f5652e = 7;
        fVar.f5652e = 8;
        this.f5678f = 1;
    }

    @Override // p.p, p.d
    public final void a(d dVar) {
        g gVar;
        float f6;
        int i6;
        g gVar2;
        if (m.g.a(this.f5682j) != 3) {
            g gVar3 = this.f5677e;
            if (gVar3.f5650c && !gVar3.f5657j && this.f5676d == 3) {
                o.d dVar2 = this.f5674b;
                int i7 = dVar2.f5455t;
                if (i7 != 2) {
                    if (i7 == 3) {
                        if (dVar2.f5426d.f5677e.f5657j) {
                            int i8 = dVar2.f5421a0;
                            if (i8 != -1) {
                                if (i8 != 0) {
                                    if (i8 != 1) {
                                        i6 = 0;
                                    }
                                } else {
                                    f6 = gVar2.f5654g * dVar2.Z;
                                    i6 = (int) (f6 + 0.5f);
                                }
                            }
                            f6 = gVar2.f5654g / dVar2.Z;
                            i6 = (int) (f6 + 0.5f);
                        }
                    }
                } else {
                    o.d dVar3 = dVar2.W;
                    if (dVar3 != null) {
                        if (dVar3.f5428e.f5677e.f5657j) {
                            f6 = gVar.f5654g * dVar2.A;
                            i6 = (int) (f6 + 0.5f);
                        }
                    }
                }
                gVar3.d(i6);
            }
            f fVar = this.f5680h;
            if (fVar.f5650c) {
                f fVar2 = this.f5681i;
                if (fVar2.f5650c) {
                    if (fVar.f5657j && fVar2.f5657j && gVar3.f5657j) {
                        return;
                    }
                    boolean z5 = gVar3.f5657j;
                    ArrayList arrayList = fVar.f5659l;
                    ArrayList arrayList2 = fVar2.f5659l;
                    if (!z5 && this.f5676d == 3) {
                        o.d dVar4 = this.f5674b;
                        if (dVar4.s == 0 && !dVar4.y()) {
                            int i9 = ((f) arrayList.get(0)).f5654g + fVar.f5653f;
                            int i10 = ((f) arrayList2.get(0)).f5654g + fVar2.f5653f;
                            fVar.d(i9);
                            fVar2.d(i10);
                            gVar3.d(i10 - i9);
                            return;
                        }
                    }
                    if (!gVar3.f5657j && this.f5676d == 3 && this.f5673a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        int i11 = (((f) arrayList2.get(0)).f5654g + fVar2.f5653f) - (((f) arrayList.get(0)).f5654g + fVar.f5653f);
                        int i12 = gVar3.f5660m;
                        if (i11 < i12) {
                            gVar3.d(i11);
                        } else {
                            gVar3.d(i12);
                        }
                    }
                    if (gVar3.f5657j && arrayList.size() > 0 && arrayList2.size() > 0) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i13 = fVar3.f5654g;
                        int i14 = fVar.f5653f + i13;
                        int i15 = fVar4.f5654g;
                        int i16 = fVar2.f5653f + i15;
                        float f7 = this.f5674b.f5435h0;
                        if (fVar3 == fVar4) {
                            f7 = 0.5f;
                        } else {
                            i13 = i14;
                            i15 = i16;
                        }
                        fVar.d((int) ((((i15 - i13) - gVar3.f5654g) * f7) + i13 + 0.5f));
                        fVar2.d(fVar.f5654g + gVar3.f5654g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        o.d dVar5 = this.f5674b;
        l(dVar5.L, dVar5.N, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x025b, code lost:
        if (r15.f5674b.F != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0292, code lost:
        if (r0.f5676d == 3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b8, code lost:
        if (r15.f5674b.F != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ba, code lost:
        c(r7, r3, 1, r15.f5666l);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0309, code lost:
        if (r0.f5676d == 3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030b, code lost:
        r0.f5677e.f5658k.add(r2);
        r10.add(r15.f5674b.f5426d.f5677e);
        r2.f5648a = r15;
     */
    @Override // p.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n.d():void");
    }

    @Override // p.p
    public final void e() {
        f fVar = this.f5680h;
        if (fVar.f5657j) {
            this.f5674b.f5425c0 = fVar.f5654g;
        }
    }

    @Override // p.p
    public final void f() {
        this.f5675c = null;
        this.f5680h.c();
        this.f5681i.c();
        this.f5665k.c();
        this.f5677e.c();
        this.f5679g = false;
    }

    @Override // p.p
    public final boolean k() {
        return this.f5676d != 3 || this.f5674b.f5455t == 0;
    }

    public final void m() {
        this.f5679g = false;
        f fVar = this.f5680h;
        fVar.c();
        fVar.f5657j = false;
        f fVar2 = this.f5681i;
        fVar2.c();
        fVar2.f5657j = false;
        f fVar3 = this.f5665k;
        fVar3.c();
        fVar3.f5657j = false;
        this.f5677e.f5657j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f5674b.f5441k0;
    }
}
