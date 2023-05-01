package o;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: c1  reason: collision with root package name */
    public d[] f5469c1;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 2;
    public int U0 = 2;
    public int V0 = 0;
    public int W0 = -1;
    public int X0 = 0;
    public final ArrayList<a> Y0 = new ArrayList<>();
    public d[] Z0 = null;

    /* renamed from: a1  reason: collision with root package name */
    public d[] f5467a1 = null;

    /* renamed from: b1  reason: collision with root package name */
    public int[] f5468b1 = null;

    /* renamed from: d1  reason: collision with root package name */
    public int f5470d1 = 0;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f5471a;

        /* renamed from: d  reason: collision with root package name */
        public c f5474d;

        /* renamed from: e  reason: collision with root package name */
        public c f5475e;

        /* renamed from: f  reason: collision with root package name */
        public c f5476f;

        /* renamed from: g  reason: collision with root package name */
        public c f5477g;

        /* renamed from: h  reason: collision with root package name */
        public int f5478h;

        /* renamed from: i  reason: collision with root package name */
        public int f5479i;

        /* renamed from: j  reason: collision with root package name */
        public int f5480j;

        /* renamed from: k  reason: collision with root package name */
        public int f5481k;

        /* renamed from: q  reason: collision with root package name */
        public int f5487q;

        /* renamed from: b  reason: collision with root package name */
        public d f5472b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f5473c = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f5482l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f5483m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f5484n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f5485o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f5486p = 0;

        public a(int i6, c cVar, c cVar2, c cVar3, c cVar4, int i7) {
            this.f5478h = 0;
            this.f5479i = 0;
            this.f5480j = 0;
            this.f5481k = 0;
            this.f5487q = 0;
            this.f5471a = i6;
            this.f5474d = cVar;
            this.f5475e = cVar2;
            this.f5476f = cVar3;
            this.f5477g = cVar4;
            this.f5478h = f.this.f5499y0;
            this.f5479i = f.this.f5496u0;
            this.f5480j = f.this.f5500z0;
            this.f5481k = f.this.f5497v0;
            this.f5487q = i7;
        }

        public final void a(d dVar) {
            int i6 = this.f5471a;
            int i7 = 0;
            f fVar = f.this;
            if (i6 == 0) {
                int U = fVar.U(this.f5487q, dVar);
                if (dVar.V[0] == 3) {
                    this.f5486p++;
                    U = 0;
                }
                int i8 = fVar.R0;
                if (dVar.f5439j0 != 8) {
                    i7 = i8;
                }
                this.f5482l = U + i7 + this.f5482l;
                int T = fVar.T(this.f5487q, dVar);
                if (this.f5472b == null || this.f5473c < T) {
                    this.f5472b = dVar;
                    this.f5473c = T;
                    this.f5483m = T;
                }
            } else {
                int U2 = fVar.U(this.f5487q, dVar);
                int T2 = fVar.T(this.f5487q, dVar);
                if (dVar.V[1] == 3) {
                    this.f5486p++;
                    T2 = 0;
                }
                int i9 = fVar.S0;
                if (dVar.f5439j0 != 8) {
                    i7 = i9;
                }
                this.f5483m = T2 + i7 + this.f5483m;
                if (this.f5472b == null || this.f5473c < U2) {
                    this.f5472b = dVar;
                    this.f5473c = U2;
                    this.f5482l = U2;
                }
            }
            this.f5485o++;
        }

        public final void b(int i6, boolean z5, boolean z6) {
            f fVar;
            boolean z7;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            d dVar;
            int i12;
            int i13;
            char c6;
            int i14;
            int i15;
            float f6;
            float f7;
            int i16;
            float f8;
            float f9;
            int i17;
            int i18;
            int i19;
            int i20 = this.f5485o;
            int i21 = 0;
            while (true) {
                fVar = f.this;
                if (i21 >= i20 || (i19 = this.f5484n + i21) >= fVar.f5470d1) {
                    break;
                }
                d dVar2 = fVar.f5469c1[i19];
                if (dVar2 != null) {
                    dVar2.D();
                }
                i21++;
            }
            if (i20 != 0 && this.f5472b != null) {
                if (z6 && i6 == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                int i22 = -1;
                int i23 = -1;
                for (int i24 = 0; i24 < i20; i24++) {
                    if (z5) {
                        i18 = (i20 - 1) - i24;
                    } else {
                        i18 = i24;
                    }
                    int i25 = this.f5484n + i18;
                    if (i25 >= fVar.f5470d1) {
                        break;
                    }
                    d dVar3 = fVar.f5469c1[i25];
                    if (dVar3 != null && dVar3.f5439j0 == 0) {
                        if (i22 == -1) {
                            i22 = i24;
                        }
                        i23 = i24;
                    }
                }
                if (this.f5471a == 0) {
                    d dVar4 = this.f5472b;
                    dVar4.f5445m0 = fVar.G0;
                    int i26 = this.f5479i;
                    if (i6 > 0) {
                        i26 += fVar.S0;
                    }
                    c cVar = this.f5475e;
                    c cVar2 = dVar4.L;
                    cVar2.a(cVar, i26);
                    c cVar3 = dVar4.N;
                    if (z6) {
                        cVar3.a(this.f5477g, this.f5481k);
                    }
                    if (i6 > 0) {
                        this.f5475e.f5405d.N.a(cVar2, 0);
                    }
                    if (fVar.U0 == 3 && !dVar4.F) {
                        for (int i27 = 0; i27 < i20; i27++) {
                            if (z5) {
                                i17 = (i20 - 1) - i27;
                            } else {
                                i17 = i27;
                            }
                            int i28 = this.f5484n + i17;
                            if (i28 >= fVar.f5470d1) {
                                break;
                            }
                            dVar = fVar.f5469c1[i28];
                            if (dVar.F) {
                                break;
                            }
                        }
                    }
                    dVar = dVar4;
                    int i29 = 0;
                    d dVar5 = null;
                    while (i29 < i20) {
                        if (z5) {
                            i12 = (i20 - 1) - i29;
                        } else {
                            i12 = i29;
                        }
                        int i30 = this.f5484n + i12;
                        if (i30 < fVar.f5470d1) {
                            d dVar6 = fVar.f5469c1[i30];
                            if (dVar6 == null) {
                                i13 = i20;
                                c6 = 3;
                            } else {
                                c cVar4 = dVar6.K;
                                if (i29 == 0) {
                                    dVar6.g(cVar4, this.f5474d, this.f5478h);
                                }
                                if (i12 == 0) {
                                    int i31 = fVar.F0;
                                    if (z5) {
                                        i15 = i31;
                                        f6 = 1.0f - fVar.L0;
                                    } else {
                                        i15 = i31;
                                        f6 = fVar.L0;
                                    }
                                    if (this.f5484n == 0) {
                                        int i32 = fVar.H0;
                                        f7 = f6;
                                        if (i32 != -1) {
                                            if (z5) {
                                                f9 = 1.0f - fVar.N0;
                                            } else {
                                                f9 = fVar.N0;
                                            }
                                            f8 = f9;
                                            i16 = i32;
                                            dVar6.f5443l0 = i16;
                                            dVar6.f5433g0 = f8;
                                        }
                                    } else {
                                        f7 = f6;
                                    }
                                    if (z6 && (i16 = fVar.J0) != -1) {
                                        if (z5) {
                                            f8 = 1.0f - fVar.P0;
                                        } else {
                                            f8 = fVar.P0;
                                        }
                                    } else {
                                        i16 = i15;
                                        f8 = f7;
                                    }
                                    dVar6.f5443l0 = i16;
                                    dVar6.f5433g0 = f8;
                                }
                                if (i29 == i20 - 1) {
                                    i13 = i20;
                                    dVar6.g(dVar6.M, this.f5476f, this.f5480j);
                                } else {
                                    i13 = i20;
                                }
                                if (dVar5 != null) {
                                    int i33 = fVar.R0;
                                    c cVar5 = dVar5.M;
                                    cVar4.a(cVar5, i33);
                                    if (i29 == i22) {
                                        int i34 = this.f5478h;
                                        if (cVar4.h()) {
                                            cVar4.f5409h = i34;
                                        }
                                    }
                                    cVar5.a(cVar4, 0);
                                    if (i29 == i23 + 1) {
                                        int i35 = this.f5480j;
                                        if (cVar5.h()) {
                                            cVar5.f5409h = i35;
                                        }
                                    }
                                }
                                if (dVar6 != dVar4) {
                                    int i36 = fVar.U0;
                                    c6 = 3;
                                    if (i36 == 3 && dVar.F && dVar6 != dVar && dVar6.F) {
                                        dVar6.O.a(dVar.O, 0);
                                    } else {
                                        c cVar6 = dVar6.L;
                                        if (i36 != 0) {
                                            c cVar7 = dVar6.N;
                                            if (i36 != 1) {
                                                if (z7) {
                                                    cVar6.a(this.f5475e, this.f5479i);
                                                    cVar7.a(this.f5477g, this.f5481k);
                                                } else {
                                                    i14 = 0;
                                                    cVar6.a(cVar2, 0);
                                                }
                                            } else {
                                                i14 = 0;
                                            }
                                            cVar7.a(cVar3, i14);
                                        } else {
                                            cVar6.a(cVar2, 0);
                                        }
                                    }
                                } else {
                                    c6 = 3;
                                }
                                dVar5 = dVar6;
                            }
                            i29++;
                            i20 = i13;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                d dVar7 = this.f5472b;
                dVar7.f5443l0 = fVar.F0;
                int i37 = this.f5478h;
                if (i6 > 0) {
                    i37 += fVar.R0;
                }
                c cVar8 = dVar7.M;
                c cVar9 = dVar7.K;
                if (z5) {
                    cVar8.a(this.f5476f, i37);
                    if (z6) {
                        cVar9.a(this.f5474d, this.f5480j);
                    }
                    if (i6 > 0) {
                        this.f5476f.f5405d.K.a(cVar8, 0);
                    }
                } else {
                    cVar9.a(this.f5474d, i37);
                    if (z6) {
                        cVar8.a(this.f5476f, this.f5480j);
                    }
                    if (i6 > 0) {
                        this.f5474d.f5405d.M.a(cVar9, 0);
                    }
                }
                int i38 = 0;
                d dVar8 = null;
                while (i38 < i20) {
                    int i39 = this.f5484n + i38;
                    if (i39 < fVar.f5470d1) {
                        d dVar9 = fVar.f5469c1[i39];
                        if (dVar9 == null) {
                            dVar9 = dVar8;
                        } else {
                            c cVar10 = dVar9.L;
                            if (i38 == 0) {
                                dVar9.g(cVar10, this.f5475e, this.f5479i);
                                int i40 = fVar.G0;
                                float f10 = fVar.M0;
                                if (this.f5484n == 0) {
                                    i11 = fVar.I0;
                                    i9 = i40;
                                    i10 = -1;
                                    if (i11 != -1) {
                                        f10 = fVar.O0;
                                        dVar9.f5445m0 = i11;
                                        dVar9.f5435h0 = f10;
                                    }
                                } else {
                                    i9 = i40;
                                    i10 = -1;
                                }
                                if (z6 && (i11 = fVar.K0) != i10) {
                                    f10 = fVar.Q0;
                                } else {
                                    i11 = i9;
                                }
                                dVar9.f5445m0 = i11;
                                dVar9.f5435h0 = f10;
                            }
                            if (i38 == i20 - 1) {
                                dVar9.g(dVar9.N, this.f5477g, this.f5481k);
                            }
                            if (dVar8 != null) {
                                int i41 = fVar.S0;
                                c cVar11 = dVar8.N;
                                cVar10.a(cVar11, i41);
                                if (i38 == i22) {
                                    int i42 = this.f5479i;
                                    if (cVar10.h()) {
                                        cVar10.f5409h = i42;
                                    }
                                }
                                cVar11.a(cVar10, 0);
                                if (i38 == i23 + 1) {
                                    int i43 = this.f5481k;
                                    if (cVar11.h()) {
                                        cVar11.f5409h = i43;
                                    }
                                }
                            }
                            if (dVar9 != dVar7) {
                                c cVar12 = dVar9.M;
                                c cVar13 = dVar9.K;
                                if (z5) {
                                    int i44 = fVar.T0;
                                    if (i44 != 0) {
                                        if (i44 != 1) {
                                            if (i44 == 2) {
                                                i8 = 0;
                                                cVar13.a(cVar9, 0);
                                            }
                                        } else {
                                            cVar13.a(cVar9, 0);
                                            i38++;
                                            dVar8 = dVar9;
                                        }
                                    } else {
                                        i8 = 0;
                                    }
                                    cVar12.a(cVar8, i8);
                                    i38++;
                                    dVar8 = dVar9;
                                } else {
                                    int i45 = fVar.T0;
                                    if (i45 != 0) {
                                        if (i45 != 1) {
                                            if (i45 == 2) {
                                                if (z7) {
                                                    cVar13.a(this.f5474d, this.f5478h);
                                                    cVar12.a(this.f5476f, this.f5480j);
                                                } else {
                                                    i7 = 0;
                                                    cVar13.a(cVar9, 0);
                                                }
                                            }
                                        } else {
                                            i7 = 0;
                                        }
                                        cVar12.a(cVar8, i7);
                                    } else {
                                        cVar13.a(cVar9, 0);
                                    }
                                    i38++;
                                    dVar8 = dVar9;
                                }
                            }
                        }
                        i38++;
                        dVar8 = dVar9;
                    } else {
                        return;
                    }
                }
            }
        }

        public final int c() {
            if (this.f5471a == 1) {
                return this.f5483m - f.this.S0;
            }
            return this.f5483m;
        }

        public final int d() {
            if (this.f5471a == 0) {
                return this.f5482l - f.this.R0;
            }
            return this.f5482l;
        }

        public final void e(int i6) {
            f fVar;
            int i7;
            int i8;
            int i9;
            int i10;
            int q5;
            int i11 = this.f5486p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f5485o;
            int i13 = i6 / i11;
            int i14 = 0;
            while (true) {
                fVar = f.this;
                if (i14 >= i12 || (i7 = this.f5484n + i14) >= fVar.f5470d1) {
                    break;
                }
                d dVar = fVar.f5469c1[i7];
                if (this.f5471a == 0) {
                    if (dVar != null) {
                        int[] iArr = dVar.V;
                        if (iArr[0] == 3 && dVar.s == 0) {
                            int i15 = iArr[1];
                            i9 = dVar.l();
                            i10 = i15;
                            i8 = 1;
                            q5 = i13;
                            fVar.S(dVar, i8, q5, i10, i9);
                        }
                    }
                    i14++;
                } else {
                    if (dVar != null) {
                        int[] iArr2 = dVar.V;
                        if (iArr2[1] == 3 && dVar.f5455t == 0) {
                            i8 = iArr2[0];
                            i9 = i13;
                            i10 = 1;
                            q5 = dVar.q();
                            fVar.S(dVar, i8, q5, i10, i9);
                        }
                    }
                    i14++;
                }
            }
            this.f5482l = 0;
            this.f5483m = 0;
            this.f5472b = null;
            this.f5473c = 0;
            int i16 = this.f5485o;
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = this.f5484n + i17;
                if (i18 < fVar.f5470d1) {
                    d dVar2 = fVar.f5469c1[i18];
                    if (this.f5471a == 0) {
                        int q6 = dVar2.q();
                        int i19 = fVar.R0;
                        if (dVar2.f5439j0 == 8) {
                            i19 = 0;
                        }
                        this.f5482l = q6 + i19 + this.f5482l;
                        int T = fVar.T(this.f5487q, dVar2);
                        if (this.f5472b == null || this.f5473c < T) {
                            this.f5472b = dVar2;
                            this.f5473c = T;
                            this.f5483m = T;
                        }
                    } else {
                        int U = fVar.U(this.f5487q, dVar2);
                        int T2 = fVar.T(this.f5487q, dVar2);
                        int i20 = fVar.S0;
                        if (dVar2.f5439j0 == 8) {
                            i20 = 0;
                        }
                        this.f5483m = T2 + i20 + this.f5483m;
                        if (this.f5472b == null || this.f5473c < U) {
                            this.f5472b = dVar2;
                            this.f5473c = U;
                            this.f5482l = U;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void f(int i6, c cVar, c cVar2, c cVar3, c cVar4, int i7, int i8, int i9, int i10, int i11) {
            this.f5471a = i6;
            this.f5474d = cVar;
            this.f5475e = cVar2;
            this.f5476f = cVar3;
            this.f5477g = cVar4;
            this.f5478h = i7;
            this.f5479i = i8;
            this.f5480j = i9;
            this.f5481k = i10;
            this.f5487q = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a4, code lost:
        if (r37.G0 == (-1)) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00af, code lost:
        if (r37.G0 == (-1)) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
        r37.G0 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x083c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x0501 -> B:293:0x0510). Please submit an issue!!! */
    @Override // o.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 2113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.R(int, int, int, int):void");
    }

    public final int T(int i6, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.V;
        if (iArr[1] == 3) {
            int i7 = dVar.f5455t;
            if (i7 == 0) {
                return 0;
            }
            if (i7 == 2) {
                int i8 = (int) (dVar.A * i6);
                if (i8 != dVar.l()) {
                    dVar.f5432g = true;
                    S(dVar, iArr[0], dVar.q(), 1, i8);
                }
                return i8;
            } else if (i7 == 1) {
                return dVar.l();
            } else {
                if (i7 == 3) {
                    return (int) ((dVar.q() * dVar.Z) + 0.5f);
                }
            }
        }
        return dVar.l();
    }

    public final int U(int i6, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.V;
        if (iArr[0] == 3) {
            int i7 = dVar.s;
            if (i7 == 0) {
                return 0;
            }
            if (i7 == 2) {
                int i8 = (int) (dVar.f5458x * i6);
                if (i8 != dVar.q()) {
                    dVar.f5432g = true;
                    S(dVar, 1, i8, iArr[1], dVar.l());
                }
                return i8;
            } else if (i7 == 1) {
                return dVar.q();
            } else {
                if (i7 == 3) {
                    return (int) ((dVar.l() * dVar.Z) + 0.5f);
                }
            }
        }
        return dVar.q();
    }

    @Override // o.d
    public final void c(m.d dVar, boolean z5) {
        boolean z6;
        boolean z7;
        d dVar2;
        float f6;
        int i6;
        boolean z8;
        super.c(dVar, z5);
        d dVar3 = this.W;
        if (dVar3 != null && ((e) dVar3).f5464x0) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i7 = this.V0;
        ArrayList<a> arrayList = this.Y0;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        int size = arrayList.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            a aVar = arrayList.get(i8);
                            if (i8 == size - 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            aVar.b(i8, z6, z8);
                        }
                    }
                } else if (this.f5468b1 != null && this.f5467a1 != null && this.Z0 != null) {
                    for (int i9 = 0; i9 < this.f5470d1; i9++) {
                        this.f5469c1[i9].D();
                    }
                    int[] iArr = this.f5468b1;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    float f7 = this.L0;
                    d dVar4 = null;
                    int i12 = 0;
                    while (i12 < i10) {
                        if (z6) {
                            i6 = (i10 - i12) - 1;
                            f6 = 1.0f - this.L0;
                        } else {
                            f6 = f7;
                            i6 = i12;
                        }
                        d dVar5 = this.f5467a1[i6];
                        if (dVar5 != null && dVar5.f5439j0 != 8) {
                            c cVar = dVar5.K;
                            if (i12 == 0) {
                                dVar5.g(cVar, this.K, this.f5499y0);
                                dVar5.f5443l0 = this.F0;
                                dVar5.f5433g0 = f6;
                            }
                            if (i12 == i10 - 1) {
                                dVar5.g(dVar5.M, this.M, this.f5500z0);
                            }
                            if (i12 > 0 && dVar4 != null) {
                                int i13 = this.R0;
                                c cVar2 = dVar4.M;
                                dVar5.g(cVar, cVar2, i13);
                                dVar4.g(cVar2, cVar, 0);
                            }
                            dVar4 = dVar5;
                        }
                        i12++;
                        f7 = f6;
                    }
                    for (int i14 = 0; i14 < i11; i14++) {
                        d dVar6 = this.Z0[i14];
                        if (dVar6 != null && dVar6.f5439j0 != 8) {
                            c cVar3 = dVar6.L;
                            if (i14 == 0) {
                                dVar6.g(cVar3, this.L, this.f5496u0);
                                dVar6.f5445m0 = this.G0;
                                dVar6.f5435h0 = this.M0;
                            }
                            if (i14 == i11 - 1) {
                                dVar6.g(dVar6.N, this.N, this.f5497v0);
                            }
                            if (i14 > 0 && dVar4 != null) {
                                int i15 = this.S0;
                                c cVar4 = dVar4.N;
                                dVar6.g(cVar3, cVar4, i15);
                                dVar4.g(cVar4, cVar3, 0);
                            }
                            dVar4 = dVar6;
                        }
                    }
                    for (int i16 = 0; i16 < i10; i16++) {
                        for (int i17 = 0; i17 < i11; i17++) {
                            int i18 = (i17 * i10) + i16;
                            if (this.X0 == 1) {
                                i18 = (i16 * i11) + i17;
                            }
                            d[] dVarArr = this.f5469c1;
                            if (i18 < dVarArr.length && (dVar2 = dVarArr[i18]) != null && dVar2.f5439j0 != 8) {
                                d dVar7 = this.f5467a1[i16];
                                d dVar8 = this.Z0[i17];
                                if (dVar2 != dVar7) {
                                    dVar2.g(dVar2.K, dVar7.K, 0);
                                    dVar2.g(dVar2.M, dVar7.M, 0);
                                }
                                if (dVar2 != dVar8) {
                                    dVar2.g(dVar2.L, dVar8.L, 0);
                                    dVar2.g(dVar2.N, dVar8.N, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    a aVar2 = arrayList.get(i19);
                    if (i19 == size2 - 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    aVar2.b(i19, z6, z7);
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z6, true);
        }
        this.A0 = false;
    }
}
