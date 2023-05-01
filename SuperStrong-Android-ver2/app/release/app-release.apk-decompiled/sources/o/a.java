package o;

import o.c;
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: u0  reason: collision with root package name */
    public int f5382u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f5383v0 = true;
    public int w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f5384x0 = false;

    @Override // o.d
    public final boolean A() {
        return this.f5384x0;
    }

    @Override // o.d
    public final boolean B() {
        return this.f5384x0;
    }

    public final boolean R() {
        int i6;
        c j5;
        c j6;
        c j7;
        int i7;
        int i8;
        boolean z5 = true;
        int i9 = 0;
        while (true) {
            i6 = this.f5495t0;
            if (i9 >= i6) {
                break;
            }
            d dVar = this.f5494s0[i9];
            if ((this.f5383v0 || dVar.d()) && ((((i7 = this.f5382u0) == 0 || i7 == 1) && !dVar.A()) || (((i8 = this.f5382u0) == 2 || i8 == 3) && !dVar.B()))) {
                z5 = false;
            }
            i9++;
        }
        if (!z5 || i6 <= 0) {
            return false;
        }
        int i10 = 0;
        boolean z6 = false;
        for (int i11 = 0; i11 < this.f5495t0; i11++) {
            d dVar2 = this.f5494s0[i11];
            if (this.f5383v0 || dVar2.d()) {
                c.a aVar = c.a.BOTTOM;
                c.a aVar2 = c.a.TOP;
                c.a aVar3 = c.a.RIGHT;
                c.a aVar4 = c.a.LEFT;
                if (!z6) {
                    int i12 = this.f5382u0;
                    if (i12 == 0) {
                        j7 = dVar2.j(aVar4);
                    } else if (i12 == 1) {
                        j7 = dVar2.j(aVar3);
                    } else if (i12 == 2) {
                        j7 = dVar2.j(aVar2);
                    } else {
                        if (i12 == 3) {
                            j7 = dVar2.j(aVar);
                        }
                        z6 = true;
                    }
                    i10 = j7.d();
                    z6 = true;
                }
                int i13 = this.f5382u0;
                if (i13 == 0) {
                    j6 = dVar2.j(aVar4);
                } else {
                    if (i13 == 1) {
                        j5 = dVar2.j(aVar3);
                    } else if (i13 == 2) {
                        j6 = dVar2.j(aVar2);
                    } else if (i13 == 3) {
                        j5 = dVar2.j(aVar);
                    }
                    i10 = Math.max(i10, j5.d());
                }
                i10 = Math.min(i10, j6.d());
            }
        }
        int i14 = i10 + this.w0;
        int i15 = this.f5382u0;
        if (i15 == 0 || i15 == 1) {
            I(i14, i14);
        } else {
            J(i14, i14);
        }
        this.f5384x0 = true;
        return true;
    }

    public final int S() {
        int i6 = this.f5382u0;
        if (i6 == 0 || i6 == 1) {
            return 0;
        }
        return (i6 == 2 || i6 == 3) ? 1 : -1;
    }

    @Override // o.d
    public final void c(m.d dVar, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i6;
        m.h hVar;
        c cVar;
        int i7;
        int i8;
        int i9;
        m.h hVar2;
        int i10;
        c[] cVarArr = this.S;
        c cVar2 = this.K;
        cVarArr[0] = cVar2;
        int i11 = 2;
        c cVar3 = this.L;
        cVarArr[2] = cVar3;
        c cVar4 = this.M;
        cVarArr[1] = cVar4;
        c cVar5 = this.N;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f5410i = dVar.l(cVar6);
        }
        int i12 = this.f5382u0;
        if (i12 >= 0 && i12 < 4) {
            c cVar7 = cVarArr[i12];
            if (!this.f5384x0) {
                R();
            }
            if (this.f5384x0) {
                this.f5384x0 = false;
                int i13 = this.f5382u0;
                if (i13 != 0 && i13 != 1) {
                    if (i13 == 2 || i13 == 3) {
                        dVar.d(cVar3.f5410i, this.f5425c0);
                        hVar2 = cVar5.f5410i;
                        i10 = this.f5425c0;
                    } else {
                        return;
                    }
                } else {
                    dVar.d(cVar2.f5410i, this.f5423b0);
                    hVar2 = cVar4.f5410i;
                    i10 = this.f5423b0;
                }
                dVar.d(hVar2, i10);
                return;
            }
            for (int i14 = 0; i14 < this.f5495t0; i14++) {
                d dVar2 = this.f5494s0[i14];
                if ((this.f5383v0 || dVar2.d()) && ((((i9 = this.f5382u0) == 0 || i9 == 1) && dVar2.V[0] == 3 && dVar2.K.f5407f != null && dVar2.M.f5407f != null) || ((i9 == 2 || i9 == 3) && dVar2.V[1] == 3 && dVar2.L.f5407f != null && dVar2.N.f5407f != null))) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
            if (!cVar2.g() && !cVar4.g()) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (!cVar3.g() && !cVar5.g()) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!z6 && (((i8 = this.f5382u0) == 0 && z7) || ((i8 == 2 && z8) || ((i8 == 1 && z7) || (i8 == 3 && z8))))) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                i6 = 4;
            } else {
                i6 = 5;
            }
            int i15 = 0;
            while (i15 < this.f5495t0) {
                d dVar3 = this.f5494s0[i15];
                if (this.f5383v0 || dVar3.d()) {
                    m.h l5 = dVar.l(dVar3.S[this.f5382u0]);
                    int i16 = this.f5382u0;
                    c cVar8 = dVar3.S[i16];
                    cVar8.f5410i = l5;
                    c cVar9 = cVar8.f5407f;
                    if (cVar9 != null && cVar9.f5405d == this) {
                        i7 = cVar8.f5408g + 0;
                    } else {
                        i7 = 0;
                    }
                    if (i16 != 0 && i16 != i11) {
                        m.b m5 = dVar.m();
                        m.h n5 = dVar.n();
                        n5.f5192e = 0;
                        m5.c(cVar7.f5410i, l5, n5, this.w0 + i7);
                        dVar.c(m5);
                    } else {
                        m.b m6 = dVar.m();
                        m.h n6 = dVar.n();
                        n6.f5192e = 0;
                        m6.d(cVar7.f5410i, l5, n6, this.w0 - i7);
                        dVar.c(m6);
                    }
                    dVar.e(cVar7.f5410i, l5, this.w0 + i7, i6);
                }
                i15++;
                i11 = 2;
            }
            int i17 = this.f5382u0;
            if (i17 == 0) {
                dVar.e(cVar4.f5410i, cVar2.f5410i, 0, 8);
                dVar.e(cVar2.f5410i, this.W.M.f5410i, 0, 4);
                hVar = cVar2.f5410i;
                cVar = this.W.K;
            } else if (i17 == 1) {
                dVar.e(cVar2.f5410i, cVar4.f5410i, 0, 8);
                dVar.e(cVar2.f5410i, this.W.K.f5410i, 0, 4);
                hVar = cVar2.f5410i;
                cVar = this.W.M;
            } else if (i17 == 2) {
                dVar.e(cVar5.f5410i, cVar3.f5410i, 0, 8);
                dVar.e(cVar3.f5410i, this.W.N.f5410i, 0, 4);
                hVar = cVar3.f5410i;
                cVar = this.W.L;
            } else if (i17 == 3) {
                dVar.e(cVar3.f5410i, cVar5.f5410i, 0, 8);
                dVar.e(cVar3.f5410i, this.W.L.f5410i, 0, 4);
                hVar = cVar3.f5410i;
                cVar = this.W.N;
            } else {
                return;
            }
            dVar.e(hVar, cVar.f5410i, 0, 0);
        }
    }

    @Override // o.d
    public final boolean d() {
        return true;
    }

    @Override // o.d
    public final String toString() {
        String str = "[Barrier] " + this.f5441k0 + " {";
        for (int i6 = 0; i6 < this.f5495t0; i6++) {
            d dVar = this.f5494s0[i6];
            if (i6 > 0) {
                str = str + ", ";
            }
            str = str + dVar.f5441k0;
        }
        return str + "}";
    }
}
