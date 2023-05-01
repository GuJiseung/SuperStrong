package p;
/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f5673a;

    /* renamed from: b  reason: collision with root package name */
    public o.d f5674b;

    /* renamed from: c  reason: collision with root package name */
    public m f5675c;

    /* renamed from: d  reason: collision with root package name */
    public int f5676d;

    /* renamed from: e  reason: collision with root package name */
    public final g f5677e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f5678f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5679g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f5680h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public final f f5681i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f5682j = 1;

    public p(o.d dVar) {
        this.f5674b = dVar;
    }

    public static void b(f fVar, f fVar2, int i6) {
        fVar.f5659l.add(fVar2);
        fVar.f5653f = i6;
        fVar2.f5658k.add(fVar);
    }

    public static f h(o.c cVar) {
        p pVar;
        p pVar2;
        o.c cVar2 = cVar.f5407f;
        if (cVar2 == null) {
            return null;
        }
        int ordinal = cVar2.f5406e.ordinal();
        o.d dVar = cVar2.f5405d;
        if (ordinal == 1) {
            pVar = dVar.f5426d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                pVar2 = dVar.f5426d;
            } else if (ordinal != 4) {
                if (ordinal != 5) {
                    return null;
                }
                return dVar.f5428e.f5665k;
            } else {
                pVar2 = dVar.f5428e;
            }
            return pVar2.f5681i;
        } else {
            pVar = dVar.f5428e;
        }
        return pVar.f5680h;
    }

    public static f i(o.c cVar, int i6) {
        o.c cVar2 = cVar.f5407f;
        if (cVar2 == null) {
            return null;
        }
        o.d dVar = cVar2.f5405d;
        p pVar = i6 == 0 ? dVar.f5426d : dVar.f5428e;
        int ordinal = cVar2.f5406e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return pVar.f5680h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return pVar.f5681i;
        }
        return null;
    }

    @Override // p.d
    public void a(d dVar) {
    }

    public final void c(f fVar, f fVar2, int i6, g gVar) {
        fVar.f5659l.add(fVar2);
        fVar.f5659l.add(this.f5677e);
        fVar.f5655h = i6;
        fVar.f5656i = gVar;
        fVar2.f5658k.add(fVar);
        gVar.f5658k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i6, int i7) {
        int max;
        if (i7 == 0) {
            o.d dVar = this.f5674b;
            int i8 = dVar.f5457w;
            max = Math.max(dVar.f5456v, i6);
            if (i8 > 0) {
                max = Math.min(i8, i6);
            }
            if (max == i6) {
                return i6;
            }
        } else {
            o.d dVar2 = this.f5674b;
            int i9 = dVar2.f5460z;
            max = Math.max(dVar2.f5459y, i6);
            if (i9 > 0) {
                max = Math.min(i9, i6);
            }
            if (max == i6) {
                return i6;
            }
        }
        return max;
    }

    public long j() {
        g gVar = this.f5677e;
        if (gVar.f5657j) {
            return gVar.f5654g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r9.f5673a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(o.c r12, o.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p.l(o.c, o.c, int):void");
    }
}
