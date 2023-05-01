package s4;

import e4.f;
/* loaded from: classes.dex */
public final class r {

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements k4.p<e4.f, f.b, e4.f> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f6097c = new a();

        public a() {
            super(2);
        }

        @Override // k4.p
        public final e4.f e(e4.f fVar, f.b bVar) {
            e4.f fVar2 = fVar;
            f.b bVar2 = bVar;
            if (bVar2 instanceof q) {
                bVar2 = ((q) bVar2).j();
            }
            return fVar2.plus(bVar2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l4.g implements k4.p<e4.f, f.b, e4.f> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ l4.k<e4.f> f6098c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f6099d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l4.k<e4.f> kVar, boolean z5) {
            super(2);
            this.f6098c = kVar;
            this.f6099d = z5;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [T, e4.f] */
        @Override // k4.p
        public final e4.f e(e4.f fVar, f.b bVar) {
            e4.f fVar2 = fVar;
            f.b bVar2 = bVar;
            boolean z5 = bVar2 instanceof q;
            q qVar = bVar2;
            if (z5) {
                l4.k<e4.f> kVar = this.f6098c;
                if (kVar.f5141b.get(bVar2.getKey()) == null) {
                    q qVar2 = (q) bVar2;
                    qVar = qVar2;
                    if (this.f6099d) {
                        qVar = qVar2.j();
                    }
                } else {
                    kVar.f5141b = kVar.f5141b.minusKey(bVar2.getKey());
                    qVar = ((q) bVar2).x();
                }
            }
            return fVar2.plus(qVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final e4.f a(e4.f fVar, e4.f fVar2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        s sVar = s.f6101c;
        boolean booleanValue = ((Boolean) fVar.fold(bool, sVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) fVar2.fold(bool, sVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return fVar.plus(fVar2);
        }
        l4.k kVar = new l4.k();
        kVar.f5141b = fVar2;
        e4.g gVar = e4.g.f3850b;
        e4.f fVar3 = (e4.f) fVar.fold(gVar, new b(kVar, z5));
        if (booleanValue2) {
            kVar.f5141b = ((e4.f) kVar.f5141b).fold(gVar, a.f6097c);
        }
        return fVar3.plus((e4.f) kVar.f5141b);
    }

    public static final l1<?> b(e4.d<?> dVar, e4.f fVar, Object obj) {
        boolean z5;
        l1<?> l1Var = null;
        if (!(dVar instanceof g4.d)) {
            return null;
        }
        if (fVar.get(m1.f6090b) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return null;
        }
        g4.d dVar2 = (g4.d) dVar;
        while (true) {
            if (!(dVar2 instanceof f0) && (dVar2 = dVar2.a()) != null) {
                if (dVar2 instanceof l1) {
                    l1Var = (l1) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (l1Var != null) {
            l1Var.f6078e.set(new c4.c<>(fVar, obj));
        }
        return l1Var;
    }
}
