package g4;

import e4.e;
import e4.f;
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: c  reason: collision with root package name */
    public final e4.f f4162c;

    /* renamed from: d  reason: collision with root package name */
    public transient e4.d<Object> f4163d;

    public c(e4.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.b() : null);
    }

    public c(e4.d<Object> dVar, e4.f fVar) {
        super(dVar);
        this.f4162c = fVar;
    }

    @Override // e4.d
    public final e4.f b() {
        e4.f fVar = this.f4162c;
        l4.f.c(fVar);
        return fVar;
    }

    @Override // g4.a
    public final void j() {
        e4.d<?> dVar = this.f4163d;
        if (dVar != null && dVar != this) {
            e4.f fVar = this.f4162c;
            l4.f.c(fVar);
            int i6 = e4.e.f3847a;
            f.b bVar = fVar.get(e.a.f3848b);
            l4.f.c(bVar);
            ((e4.e) bVar).E(dVar);
        }
        this.f4163d = b.f4161b;
    }
}
