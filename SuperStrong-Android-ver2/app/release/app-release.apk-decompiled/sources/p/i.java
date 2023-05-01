package p;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class i {
    public static o a(o.d dVar, int i6, ArrayList<o> arrayList, o oVar) {
        int i7;
        boolean z5;
        o.c cVar;
        int i8;
        if (i6 == 0) {
            i7 = dVar.f5453q0;
        } else {
            i7 = dVar.r0;
        }
        int i9 = 0;
        if (i7 != -1 && (oVar == null || i7 != oVar.f5669b)) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i10);
                if (oVar2.f5669b == i7) {
                    if (oVar != null) {
                        oVar.c(i6, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i10++;
                }
            }
        } else if (i7 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof o.i) {
                o.i iVar = (o.i) dVar;
                int i11 = 0;
                while (true) {
                    if (i11 < iVar.f5495t0) {
                        o.d dVar2 = iVar.f5494s0[i11];
                        if ((i6 == 0 && (i8 = dVar2.f5453q0) != -1) || (i6 == 1 && (i8 = dVar2.r0) != -1)) {
                            break;
                        }
                        i11++;
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                if (i8 != -1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i12);
                        if (oVar3.f5669b == i8) {
                            oVar = oVar3;
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i6);
            }
            arrayList.add(oVar);
        }
        ArrayList<o.d> arrayList2 = oVar.f5668a;
        if (arrayList2.contains(dVar)) {
            z5 = false;
        } else {
            arrayList2.add(dVar);
            z5 = true;
        }
        if (z5) {
            if (dVar instanceof o.g) {
                o.g gVar = (o.g) dVar;
                o.c cVar2 = gVar.f5492v0;
                if (gVar.w0 == 0) {
                    i9 = 1;
                }
                cVar2.c(i9, oVar, arrayList);
            }
            int i13 = oVar.f5669b;
            if (i6 == 0) {
                dVar.f5453q0 = i13;
                dVar.K.c(i6, oVar, arrayList);
                cVar = dVar.M;
            } else {
                dVar.r0 = i13;
                dVar.L.c(i6, oVar, arrayList);
                dVar.O.c(i6, oVar, arrayList);
                cVar = dVar.N;
            }
            cVar.c(i6, oVar, arrayList);
            dVar.R.c(i6, oVar, arrayList);
        }
        return oVar;
    }

    public static boolean b(int i6, int i7, int i8, int i9) {
        return (i8 == 1 || i8 == 2 || (i8 == 4 && i6 != 2)) || (i9 == 1 || i9 == 2 || (i9 == 4 && i7 != 2));
    }
}
