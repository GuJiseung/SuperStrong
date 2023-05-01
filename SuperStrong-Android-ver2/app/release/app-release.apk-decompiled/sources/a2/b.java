package a2;
/* loaded from: classes.dex */
public final class b implements e, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f129a;

    /* renamed from: b  reason: collision with root package name */
    public final e f130b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f131c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f132d;

    /* renamed from: e  reason: collision with root package name */
    public int f133e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f134f = 3;

    public b(Object obj, e eVar) {
        this.f129a = obj;
        this.f130b = eVar;
    }

    @Override // a2.e, a2.c
    public final boolean a() {
        boolean z5;
        synchronized (this.f129a) {
            z5 = this.f131c.a() || this.f132d.a();
        }
        return z5;
    }

    @Override // a2.e
    public final boolean b(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f129a) {
            e eVar = this.f130b;
            z5 = false;
            if (eVar != null && !eVar.b(this)) {
                z6 = false;
                if (z6 && l(cVar)) {
                    z5 = true;
                }
            }
            z6 = true;
            if (z6) {
                z5 = true;
            }
        }
        return z5;
    }

    @Override // a2.c
    public final boolean c() {
        boolean z5;
        synchronized (this.f129a) {
            z5 = this.f133e == 3 && this.f134f == 3;
        }
        return z5;
    }

    @Override // a2.c
    public final void clear() {
        synchronized (this.f129a) {
            this.f133e = 3;
            this.f131c.clear();
            if (this.f134f != 3) {
                this.f134f = 3;
                this.f132d.clear();
            }
        }
    }

    @Override // a2.c
    public final boolean d(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            return this.f131c.d(bVar.f131c) && this.f132d.d(bVar.f132d);
        }
        return false;
    }

    @Override // a2.c
    public final void e() {
        synchronized (this.f129a) {
            if (this.f133e == 1) {
                this.f133e = 2;
                this.f131c.e();
            }
            if (this.f134f == 1) {
                this.f134f = 2;
                this.f132d.e();
            }
        }
    }

    @Override // a2.c
    public final void f() {
        synchronized (this.f129a) {
            if (this.f133e != 1) {
                this.f133e = 1;
                this.f131c.f();
            }
        }
    }

    @Override // a2.e
    public final boolean g(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f129a) {
            e eVar = this.f130b;
            z5 = false;
            if (eVar != null && !eVar.g(this)) {
                z6 = false;
                if (z6 && l(cVar)) {
                    z5 = true;
                }
            }
            z6 = true;
            if (z6) {
                z5 = true;
            }
        }
        return z5;
    }

    @Override // a2.e
    public final e getRoot() {
        e root;
        synchronized (this.f129a) {
            e eVar = this.f130b;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    @Override // a2.e
    public final boolean h(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f129a) {
            e eVar = this.f130b;
            z5 = false;
            if (eVar != null && !eVar.h(this)) {
                z6 = false;
                if (z6 && l(cVar)) {
                    z5 = true;
                }
            }
            z6 = true;
            if (z6) {
                z5 = true;
            }
        }
        return z5;
    }

    @Override // a2.c
    public final boolean i() {
        boolean z5;
        synchronized (this.f129a) {
            z5 = this.f133e == 4 || this.f134f == 4;
        }
        return z5;
    }

    @Override // a2.c
    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f129a) {
            z5 = true;
            if (this.f133e != 1 && this.f134f != 1) {
                z5 = false;
            }
        }
        return z5;
    }

    @Override // a2.e
    public final void j(c cVar) {
        synchronized (this.f129a) {
            if (cVar.equals(this.f132d)) {
                this.f134f = 5;
                e eVar = this.f130b;
                if (eVar != null) {
                    eVar.j(this);
                }
                return;
            }
            this.f133e = 5;
            if (this.f134f != 1) {
                this.f134f = 1;
                this.f132d.f();
            }
        }
    }

    @Override // a2.e
    public final void k(c cVar) {
        synchronized (this.f129a) {
            if (cVar.equals(this.f131c)) {
                this.f133e = 4;
            } else if (cVar.equals(this.f132d)) {
                this.f134f = 4;
            }
            e eVar = this.f130b;
            if (eVar != null) {
                eVar.k(this);
            }
        }
    }

    public final boolean l(c cVar) {
        return cVar.equals(this.f131c) || (this.f133e == 5 && cVar.equals(this.f132d));
    }
}
