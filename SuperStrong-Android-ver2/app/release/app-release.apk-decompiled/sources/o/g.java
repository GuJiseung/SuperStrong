package o;

import java.util.ArrayList;
import o.c;
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: s0  reason: collision with root package name */
    public float f5489s0 = -1.0f;

    /* renamed from: t0  reason: collision with root package name */
    public int f5490t0 = -1;

    /* renamed from: u0  reason: collision with root package name */
    public int f5491u0 = -1;

    /* renamed from: v0  reason: collision with root package name */
    public c f5492v0 = this.L;
    public int w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f5493x0;

    public g() {
        this.T.clear();
        this.T.add(this.f5492v0);
        int length = this.S.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.S[i6] = this.f5492v0;
        }
    }

    @Override // o.d
    public final boolean A() {
        return this.f5493x0;
    }

    @Override // o.d
    public final boolean B() {
        return this.f5493x0;
    }

    @Override // o.d
    public final void P(m.d dVar, boolean z5) {
        if (this.W == null) {
            return;
        }
        c cVar = this.f5492v0;
        dVar.getClass();
        int o5 = m.d.o(cVar);
        if (this.w0 == 1) {
            this.f5423b0 = o5;
            this.f5425c0 = 0;
            K(this.W.l());
            N(0);
            return;
        }
        this.f5423b0 = 0;
        this.f5425c0 = o5;
        N(this.W.q());
        K(0);
    }

    public final void Q(int i6) {
        if (this.w0 == i6) {
            return;
        }
        this.w0 = i6;
        ArrayList<c> arrayList = this.T;
        arrayList.clear();
        this.f5492v0 = this.w0 == 1 ? this.K : this.L;
        arrayList.add(this.f5492v0);
        c[] cVarArr = this.S;
        int length = cVarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            cVarArr[i7] = this.f5492v0;
        }
    }

    @Override // o.d
    public final void c(m.d dVar, boolean z5) {
        boolean z6;
        e eVar = (e) this.W;
        if (eVar == null) {
            return;
        }
        Object j5 = eVar.j(c.a.LEFT);
        Object j6 = eVar.j(c.a.RIGHT);
        d dVar2 = this.W;
        boolean z7 = true;
        if (dVar2 != null && dVar2.V[0] == 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.w0 == 0) {
            j5 = eVar.j(c.a.TOP);
            j6 = eVar.j(c.a.BOTTOM);
            d dVar3 = this.W;
            if (dVar3 == null || dVar3.V[1] != 2) {
                z7 = false;
            }
            z6 = z7;
        }
        if (this.f5493x0) {
            c cVar = this.f5492v0;
            if (cVar.f5404c) {
                m.h l5 = dVar.l(cVar);
                dVar.d(l5, this.f5492v0.d());
                if (this.f5490t0 != -1) {
                    if (z6) {
                        dVar.f(dVar.l(j6), l5, 0, 5);
                    }
                } else if (this.f5491u0 != -1 && z6) {
                    m.h l6 = dVar.l(j6);
                    dVar.f(l5, dVar.l(j5), 0, 5);
                    dVar.f(l6, l5, 0, 5);
                }
                this.f5493x0 = false;
                return;
            }
        }
        if (this.f5490t0 != -1) {
            m.h l7 = dVar.l(this.f5492v0);
            dVar.e(l7, dVar.l(j5), this.f5490t0, 8);
            if (z6) {
                dVar.f(dVar.l(j6), l7, 0, 5);
            }
        } else if (this.f5491u0 != -1) {
            m.h l8 = dVar.l(this.f5492v0);
            m.h l9 = dVar.l(j6);
            dVar.e(l8, l9, -this.f5491u0, 8);
            if (z6) {
                dVar.f(l8, dVar.l(j5), 0, 5);
                dVar.f(l9, l8, 0, 5);
            }
        } else if (this.f5489s0 != -1.0f) {
            m.h l10 = dVar.l(this.f5492v0);
            m.h l11 = dVar.l(j6);
            float f6 = this.f5489s0;
            m.b m5 = dVar.m();
            m5.f5157d.f(l10, -1.0f);
            m5.f5157d.f(l11, f6);
            dVar.c(m5);
        }
    }

    @Override // o.d
    public final boolean d() {
        return true;
    }

    @Override // o.d
    public final c j(c.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.w0 == 0) {
                return this.f5492v0;
            }
            return null;
        }
        if (this.w0 == 1) {
            return this.f5492v0;
        }
        return null;
    }
}
