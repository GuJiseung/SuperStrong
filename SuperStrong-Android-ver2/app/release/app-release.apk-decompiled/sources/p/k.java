package p;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class k extends p {
    public k(o.d dVar) {
        super(dVar);
    }

    @Override // p.p, p.d
    public final void a(d dVar) {
        o.a aVar = (o.a) this.f5674b;
        int i6 = aVar.f5382u0;
        f fVar = this.f5680h;
        Iterator it = fVar.f5659l.iterator();
        int i7 = 0;
        int i8 = -1;
        while (it.hasNext()) {
            int i9 = ((f) it.next()).f5654g;
            if (i8 == -1 || i9 < i8) {
                i8 = i9;
            }
            if (i7 < i9) {
                i7 = i9;
            }
        }
        if (i6 != 0 && i6 != 2) {
            fVar.d(i7 + aVar.w0);
        } else {
            fVar.d(i8 + aVar.w0);
        }
    }

    @Override // p.p
    public final void d() {
        p pVar;
        o.d dVar = this.f5674b;
        if (dVar instanceof o.a) {
            f fVar = this.f5680h;
            fVar.f5649b = true;
            o.a aVar = (o.a) dVar;
            int i6 = aVar.f5382u0;
            boolean z5 = aVar.f5383v0;
            ArrayList arrayList = fVar.f5659l;
            int i7 = 0;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            fVar.f5652e = 7;
                            while (i7 < aVar.f5495t0) {
                                o.d dVar2 = aVar.f5494s0[i7];
                                if (z5 || dVar2.f5439j0 != 8) {
                                    f fVar2 = dVar2.f5428e.f5681i;
                                    fVar2.f5658k.add(fVar);
                                    arrayList.add(fVar2);
                                }
                                i7++;
                            }
                        } else {
                            return;
                        }
                    } else {
                        fVar.f5652e = 6;
                        while (i7 < aVar.f5495t0) {
                            o.d dVar3 = aVar.f5494s0[i7];
                            if (z5 || dVar3.f5439j0 != 8) {
                                f fVar3 = dVar3.f5428e.f5680h;
                                fVar3.f5658k.add(fVar);
                                arrayList.add(fVar3);
                            }
                            i7++;
                        }
                    }
                    m(this.f5674b.f5428e.f5680h);
                    pVar = this.f5674b.f5428e;
                    m(pVar.f5681i);
                }
                fVar.f5652e = 5;
                while (i7 < aVar.f5495t0) {
                    o.d dVar4 = aVar.f5494s0[i7];
                    if (z5 || dVar4.f5439j0 != 8) {
                        f fVar4 = dVar4.f5426d.f5681i;
                        fVar4.f5658k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i7++;
                }
            } else {
                fVar.f5652e = 4;
                while (i7 < aVar.f5495t0) {
                    o.d dVar5 = aVar.f5494s0[i7];
                    if (z5 || dVar5.f5439j0 != 8) {
                        f fVar5 = dVar5.f5426d.f5680h;
                        fVar5.f5658k.add(fVar);
                        arrayList.add(fVar5);
                    }
                    i7++;
                }
            }
            m(this.f5674b.f5426d.f5680h);
            pVar = this.f5674b.f5426d;
            m(pVar.f5681i);
        }
    }

    @Override // p.p
    public final void e() {
        o.d dVar = this.f5674b;
        if (dVar instanceof o.a) {
            int i6 = ((o.a) dVar).f5382u0;
            f fVar = this.f5680h;
            if (i6 != 0 && i6 != 1) {
                dVar.f5425c0 = fVar.f5654g;
            } else {
                dVar.f5423b0 = fVar.f5654g;
            }
        }
    }

    @Override // p.p
    public final void f() {
        this.f5675c = null;
        this.f5680h.c();
    }

    @Override // p.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f5680h;
        fVar2.f5658k.add(fVar);
        fVar.f5659l.add(fVar2);
    }
}
