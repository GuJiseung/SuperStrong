package a2;
/* loaded from: classes.dex */
public final class j implements e, c {

    /* renamed from: a  reason: collision with root package name */
    public final e f159a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f160b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f161c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f162d;

    /* renamed from: e  reason: collision with root package name */
    public int f163e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f164f = 3;

    /* renamed from: g  reason: collision with root package name */
    public boolean f165g;

    public j(Object obj, e eVar) {
        this.f160b = obj;
        this.f159a = eVar;
    }

    @Override // a2.e, a2.c
    public final boolean a() {
        boolean z5;
        synchronized (this.f160b) {
            z5 = this.f162d.a() || this.f161c.a();
        }
        return z5;
    }

    @Override // a2.e
    public final boolean b(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f160b) {
            e eVar = this.f159a;
            z5 = false;
            if (eVar != null && !eVar.b(this)) {
                z6 = false;
                if (z6 && (cVar.equals(this.f161c) || this.f163e != 4)) {
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
        synchronized (this.f160b) {
            z5 = this.f163e == 3;
        }
        return z5;
    }

    @Override // a2.c
    public final void clear() {
        synchronized (this.f160b) {
            this.f165g = false;
            this.f163e = 3;
            this.f164f = 3;
            this.f162d.clear();
            this.f161c.clear();
        }
    }

    @Override // a2.c
    public final boolean d(c cVar) {
        if (cVar instanceof j) {
            j jVar = (j) cVar;
            if (this.f161c == null) {
                if (jVar.f161c != null) {
                    return false;
                }
            } else if (!this.f161c.d(jVar.f161c)) {
                return false;
            }
            if (this.f162d == null) {
                if (jVar.f162d != null) {
                    return false;
                }
            } else if (!this.f162d.d(jVar.f162d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // a2.c
    public final void e() {
        synchronized (this.f160b) {
            if (!d.a(this.f164f)) {
                this.f164f = 2;
                this.f162d.e();
            }
            if (!d.a(this.f163e)) {
                this.f163e = 2;
                this.f161c.e();
            }
        }
    }

    @Override // a2.c
    public final void f() {
        synchronized (this.f160b) {
            this.f165g = true;
            if (this.f163e != 4 && this.f164f != 1) {
                this.f164f = 1;
                this.f162d.f();
            }
            if (this.f165g && this.f163e != 1) {
                this.f163e = 1;
                this.f161c.f();
            }
            this.f165g = false;
        }
    }

    @Override // a2.e
    public final boolean g(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f160b) {
            e eVar = this.f159a;
            z5 = false;
            if (eVar != null && !eVar.g(this)) {
                z6 = false;
                if (z6 && cVar.equals(this.f161c) && !a()) {
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
        synchronized (this.f160b) {
            e eVar = this.f159a;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    @Override // a2.e
    public final boolean h(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f160b) {
            e eVar = this.f159a;
            z5 = false;
            if (eVar != null && !eVar.h(this)) {
                z6 = false;
                if (z6 && cVar.equals(this.f161c) && this.f163e != 2) {
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
        synchronized (this.f160b) {
            z5 = this.f163e == 4;
        }
        return z5;
    }

    @Override // a2.c
    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f160b) {
            z5 = true;
            if (this.f163e != 1) {
                z5 = false;
            }
        }
        return z5;
    }

    @Override // a2.e
    public final void j(c cVar) {
        synchronized (this.f160b) {
            if (!cVar.equals(this.f161c)) {
                this.f164f = 5;
                return;
            }
            this.f163e = 5;
            e eVar = this.f159a;
            if (eVar != null) {
                eVar.j(this);
            }
        }
    }

    @Override // a2.e
    public final void k(c cVar) {
        synchronized (this.f160b) {
            if (cVar.equals(this.f162d)) {
                this.f164f = 4;
                return;
            }
            this.f163e = 4;
            e eVar = this.f159a;
            if (eVar != null) {
                eVar.k(this);
            }
            if (!d.a(this.f164f)) {
                this.f162d.clear();
            }
        }
    }
}
