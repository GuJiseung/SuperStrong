package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p.o;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public int f5403b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5404c;

    /* renamed from: d  reason: collision with root package name */
    public final d f5405d;

    /* renamed from: e  reason: collision with root package name */
    public final a f5406e;

    /* renamed from: f  reason: collision with root package name */
    public c f5407f;

    /* renamed from: i  reason: collision with root package name */
    public m.h f5410i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<c> f5402a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f5408g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f5409h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.f5405d = dVar;
        this.f5406e = aVar;
    }

    public final void a(c cVar, int i6) {
        b(cVar, i6, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i6, int i7, boolean z5) {
        if (cVar == null) {
            j();
            return true;
        } else if (z5 || i(cVar)) {
            this.f5407f = cVar;
            if (cVar.f5402a == null) {
                cVar.f5402a = new HashSet<>();
            }
            HashSet<c> hashSet = this.f5407f.f5402a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f5408g = i6;
            this.f5409h = i7;
            return true;
        } else {
            return false;
        }
    }

    public final void c(int i6, o oVar, ArrayList arrayList) {
        HashSet<c> hashSet = this.f5402a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                p.i.a(it.next().f5405d, i6, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f5404c) {
            return this.f5403b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f5405d.f5439j0 == 8) {
            return 0;
        }
        int i6 = this.f5409h;
        if (i6 != Integer.MIN_VALUE && (cVar = this.f5407f) != null && cVar.f5405d.f5439j0 == 8) {
            return i6;
        }
        return this.f5408g;
    }

    public final c f() {
        a aVar = this.f5406e;
        int ordinal = aVar.ordinal();
        d dVar = this.f5405d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.M;
            case 2:
                return dVar.N;
            case 3:
                return dVar.K;
            case 4:
                return dVar.L;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final boolean g() {
        HashSet<c> hashSet = this.f5402a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f5407f != null;
    }

    public final boolean i(c cVar) {
        boolean z5;
        boolean z6;
        boolean z7 = false;
        if (cVar == null) {
            return false;
        }
        a aVar = a.BASELINE;
        a aVar2 = this.f5406e;
        d dVar = cVar.f5405d;
        a aVar3 = cVar.f5406e;
        if (aVar3 == aVar2) {
            if (aVar2 == aVar && (!dVar.F || !this.f5405d.F)) {
                return false;
            }
            return true;
        }
        int ordinal = aVar2.ordinal();
        a aVar4 = a.CENTER_Y;
        a aVar5 = a.RIGHT;
        a aVar6 = a.CENTER_X;
        a aVar7 = a.LEFT;
        switch (ordinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                if (aVar3 != aVar7 && aVar3 != aVar5) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (dVar instanceof g) {
                    if (z5 || aVar3 == aVar6) {
                        z7 = true;
                    }
                    return z7;
                }
                return z5;
            case 2:
            case 4:
                if (aVar3 != a.TOP && aVar3 != a.BOTTOM) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (dVar instanceof g) {
                    if (z6 || aVar3 == aVar4) {
                        z7 = true;
                    }
                    return z7;
                }
                return z6;
            case 5:
                if (aVar3 == aVar7 || aVar3 == aVar5) {
                    return false;
                }
                return true;
            case 6:
                if (aVar3 == aVar || aVar3 == aVar6 || aVar3 == aVar4) {
                    return false;
                }
                return true;
            default:
                throw new AssertionError(aVar2.name());
        }
    }

    public final void j() {
        HashSet<c> hashSet;
        c cVar = this.f5407f;
        if (cVar != null && (hashSet = cVar.f5402a) != null) {
            hashSet.remove(this);
            if (this.f5407f.f5402a.size() == 0) {
                this.f5407f.f5402a = null;
            }
        }
        this.f5402a = null;
        this.f5407f = null;
        this.f5408g = 0;
        this.f5409h = Integer.MIN_VALUE;
        this.f5404c = false;
        this.f5403b = 0;
    }

    public final void k() {
        m.h hVar = this.f5410i;
        if (hVar == null) {
            this.f5410i = new m.h(1);
        } else {
            hVar.c();
        }
    }

    public final void l(int i6) {
        this.f5403b = i6;
        this.f5404c = true;
    }

    public final String toString() {
        return this.f5405d.f5441k0 + ":" + this.f5406e.toString();
    }
}
