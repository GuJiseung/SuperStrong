package p;

import java.util.Iterator;
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f5660m;

    public g(p pVar) {
        super(pVar);
        this.f5652e = pVar instanceof l ? 2 : 3;
    }

    @Override // p.f
    public final void d(int i6) {
        if (this.f5657j) {
            return;
        }
        this.f5657j = true;
        this.f5654g = i6;
        Iterator it = this.f5658k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
