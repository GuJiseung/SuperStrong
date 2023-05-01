package o;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class k extends d {

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList<d> f5501s0 = new ArrayList<>();

    @Override // o.d
    public void C() {
        this.f5501s0.clear();
        super.C();
    }

    @Override // o.d
    public final void F(m.c cVar) {
        super.F(cVar);
        int size = this.f5501s0.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f5501s0.get(i6).F(cVar);
        }
    }

    public void Q() {
        ArrayList<d> arrayList = this.f5501s0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = this.f5501s0.get(i6);
            if (dVar instanceof k) {
                ((k) dVar).Q();
            }
        }
    }
}
