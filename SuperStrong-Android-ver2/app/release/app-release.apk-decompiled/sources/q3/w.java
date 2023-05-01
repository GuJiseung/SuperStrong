package q3;
/* loaded from: classes.dex */
public final class w extends x<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f5851a;

    public w(x xVar) {
        this.f5851a = xVar;
    }

    @Override // q3.x
    public final Object a(x3.a aVar) {
        if (aVar.M() == 9) {
            aVar.I();
            return null;
        }
        return this.f5851a.a(aVar);
    }

    @Override // q3.x
    public final void b(x3.c cVar, Object obj) {
        if (obj == null) {
            cVar.q();
        } else {
            this.f5851a.b(cVar, obj);
        }
    }
}
