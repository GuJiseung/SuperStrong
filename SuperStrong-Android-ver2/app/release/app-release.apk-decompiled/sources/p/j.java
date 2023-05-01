package p;
/* loaded from: classes.dex */
public final class j extends p {
    public j(o.d dVar) {
        super(dVar);
        dVar.f5426d.f();
        dVar.f5428e.f();
        this.f5678f = ((o.g) dVar).w0;
    }

    @Override // p.p, p.d
    public final void a(d dVar) {
        f fVar = this.f5680h;
        if (!fVar.f5650c || fVar.f5657j) {
            return;
        }
        fVar.d((int) ((((f) fVar.f5659l.get(0)).f5654g * ((o.g) this.f5674b).f5489s0) + 0.5f));
    }

    @Override // p.p
    public final void d() {
        p pVar;
        o.d dVar = this.f5674b;
        o.g gVar = (o.g) dVar;
        int i6 = gVar.f5490t0;
        int i7 = gVar.f5491u0;
        int i8 = gVar.w0;
        f fVar = this.f5680h;
        if (i8 == 1) {
            if (i6 != -1) {
                fVar.f5659l.add(dVar.W.f5426d.f5680h);
                this.f5674b.W.f5426d.f5680h.f5658k.add(fVar);
                fVar.f5653f = i6;
            } else if (i7 != -1) {
                fVar.f5659l.add(dVar.W.f5426d.f5681i);
                this.f5674b.W.f5426d.f5681i.f5658k.add(fVar);
                fVar.f5653f = -i7;
            } else {
                fVar.f5649b = true;
                fVar.f5659l.add(dVar.W.f5426d.f5681i);
                this.f5674b.W.f5426d.f5681i.f5658k.add(fVar);
            }
            m(this.f5674b.f5426d.f5680h);
            pVar = this.f5674b.f5426d;
        } else {
            if (i6 != -1) {
                fVar.f5659l.add(dVar.W.f5428e.f5680h);
                this.f5674b.W.f5428e.f5680h.f5658k.add(fVar);
                fVar.f5653f = i6;
            } else if (i7 != -1) {
                fVar.f5659l.add(dVar.W.f5428e.f5681i);
                this.f5674b.W.f5428e.f5681i.f5658k.add(fVar);
                fVar.f5653f = -i7;
            } else {
                fVar.f5649b = true;
                fVar.f5659l.add(dVar.W.f5428e.f5681i);
                this.f5674b.W.f5428e.f5681i.f5658k.add(fVar);
            }
            m(this.f5674b.f5428e.f5680h);
            pVar = this.f5674b.f5428e;
        }
        m(pVar.f5681i);
    }

    @Override // p.p
    public final void e() {
        o.d dVar = this.f5674b;
        int i6 = ((o.g) dVar).w0;
        f fVar = this.f5680h;
        if (i6 == 1) {
            dVar.f5423b0 = fVar.f5654g;
        } else {
            dVar.f5425c0 = fVar.f5654g;
        }
    }

    @Override // p.p
    public final void f() {
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
