package p;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final p f5663a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<p> f5664b = new ArrayList<>();

    public m(p pVar) {
        this.f5663a = null;
        this.f5663a = pVar;
    }

    public static long a(f fVar, long j5) {
        p pVar = fVar.f5651d;
        if (pVar instanceof k) {
            return j5;
        }
        ArrayList arrayList = fVar.f5658k;
        int size = arrayList.size();
        long j6 = j5;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) arrayList.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f5651d != pVar) {
                    j6 = Math.min(j6, a(fVar2, fVar2.f5653f + j5));
                }
            }
        }
        if (fVar == pVar.f5681i) {
            long j7 = pVar.j();
            f fVar3 = pVar.f5680h;
            long j8 = j5 - j7;
            return Math.min(Math.min(j6, a(fVar3, j8)), j8 - fVar3.f5653f);
        }
        return j6;
    }

    public static long b(f fVar, long j5) {
        p pVar = fVar.f5651d;
        if (pVar instanceof k) {
            return j5;
        }
        ArrayList arrayList = fVar.f5658k;
        int size = arrayList.size();
        long j6 = j5;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) arrayList.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f5651d != pVar) {
                    j6 = Math.max(j6, b(fVar2, fVar2.f5653f + j5));
                }
            }
        }
        if (fVar == pVar.f5680h) {
            long j7 = pVar.j();
            f fVar3 = pVar.f5681i;
            long j8 = j5 + j7;
            return Math.max(Math.max(j6, b(fVar3, j8)), j8 - fVar3.f5653f);
        }
        return j6;
    }
}
