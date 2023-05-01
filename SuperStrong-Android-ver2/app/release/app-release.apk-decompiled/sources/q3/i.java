package q3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes.dex */
public final class i extends x<AtomicLongArray> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f5832a;

    public i(x xVar) {
        this.f5832a = xVar;
    }

    @Override // q3.x
    public final AtomicLongArray a(x3.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.q()) {
            arrayList.add(Long.valueOf(((Number) this.f5832a.a(aVar)).longValue()));
        }
        aVar.k();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            atomicLongArray.set(i6, ((Long) arrayList.get(i6)).longValue());
        }
        return atomicLongArray;
    }

    @Override // q3.x
    public final void b(x3.c cVar, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        cVar.f();
        int length = atomicLongArray2.length();
        for (int i6 = 0; i6 < length; i6++) {
            this.f5832a.b(cVar, Long.valueOf(atomicLongArray2.get(i6)));
        }
        cVar.k();
    }
}
