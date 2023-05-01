package o;

import java.util.ArrayList;
import p.o;
/* loaded from: classes.dex */
public class i extends d implements h {

    /* renamed from: s0  reason: collision with root package name */
    public d[] f5494s0 = new d[4];

    /* renamed from: t0  reason: collision with root package name */
    public int f5495t0 = 0;

    public final void Q(int i6, o oVar, ArrayList arrayList) {
        for (int i7 = 0; i7 < this.f5495t0; i7++) {
            d dVar = this.f5494s0[i7];
            ArrayList<d> arrayList2 = oVar.f5668a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i8 = 0; i8 < this.f5495t0; i8++) {
            p.i.a(this.f5494s0[i8], i6, arrayList, oVar);
        }
    }

    @Override // o.h
    public void a() {
    }
}
