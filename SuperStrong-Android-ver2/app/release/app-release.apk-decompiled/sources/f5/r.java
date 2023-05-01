package f5;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class r extends AbstractList<h> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f4002d = 0;

    /* renamed from: b  reason: collision with root package name */
    public final h[] f4003b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f4004c;

    public r(h[] hVarArr, int[] iArr) {
        this.f4003b = hVarArr;
        this.f4004c = iArr;
    }

    public static void a(long j5, e eVar, int i6, ArrayList arrayList, int i7, int i8, ArrayList arrayList2) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar2;
        if (i7 >= i8) {
            throw new AssertionError();
        }
        for (int i14 = i7; i14 < i8; i14++) {
            if (((h) arrayList.get(i14)).j() < i6) {
                throw new AssertionError();
            }
        }
        h hVar = (h) arrayList.get(i7);
        h hVar2 = (h) arrayList.get(i8 - 1);
        if (i6 == hVar.j()) {
            int intValue = ((Integer) arrayList2.get(i7)).intValue();
            int i15 = i7 + 1;
            i10 = i15;
            i9 = intValue;
            hVar = (h) arrayList.get(i15);
        } else {
            i9 = -1;
            i10 = i7;
        }
        long j6 = 4;
        if (hVar.e(i6) != hVar2.e(i6)) {
            int i16 = 1;
            for (int i17 = i10 + 1; i17 < i8; i17++) {
                if (((h) arrayList.get(i17 - 1)).e(i6) != ((h) arrayList.get(i17)).e(i6)) {
                    i16++;
                }
            }
            long j7 = j5 + ((int) (eVar.f3977c / 4)) + 2 + (i16 * 2);
            eVar.J(i16);
            eVar.J(i9);
            for (int i18 = i10; i18 < i8; i18++) {
                byte e6 = ((h) arrayList.get(i18)).e(i6);
                if (i18 == i10 || e6 != ((h) arrayList.get(i18 - 1)).e(i6)) {
                    eVar.J(e6 & 255);
                }
            }
            e eVar3 = new e();
            int i19 = i10;
            while (i19 < i8) {
                byte e7 = ((h) arrayList.get(i19)).e(i6);
                int i20 = i19 + 1;
                int i21 = i20;
                while (true) {
                    if (i21 >= i8) {
                        i12 = i8;
                        break;
                    } else if (e7 != ((h) arrayList.get(i21)).e(i6)) {
                        i12 = i21;
                        break;
                    } else {
                        i21++;
                    }
                }
                if (i20 == i12 && i6 + 1 == ((h) arrayList.get(i19)).j()) {
                    eVar.J(((Integer) arrayList2.get(i19)).intValue());
                    i13 = i12;
                    eVar2 = eVar3;
                } else {
                    eVar.J((int) ((((int) (eVar3.f3977c / j6)) + j7) * (-1)));
                    i13 = i12;
                    eVar2 = eVar3;
                    a(j7, eVar3, i6 + 1, arrayList, i19, i12, arrayList2);
                }
                eVar3 = eVar2;
                i19 = i13;
                j6 = 4;
            }
            e eVar4 = eVar3;
            eVar.u(eVar4, eVar4.f3977c);
            return;
        }
        int min = Math.min(hVar.j(), hVar2.j());
        int i22 = 0;
        for (int i23 = i6; i23 < min && hVar.e(i23) == hVar2.e(i23); i23++) {
            i22++;
        }
        long j8 = 1 + j5 + ((int) (eVar.f3977c / 4)) + 2 + i22;
        eVar.J(-i22);
        eVar.J(i9);
        int i24 = i6;
        while (true) {
            i11 = i6 + i22;
            if (i24 >= i11) {
                break;
            }
            eVar.J(hVar.e(i24) & 255);
            i24++;
        }
        if (i10 + 1 == i8) {
            if (i11 != ((h) arrayList.get(i10)).j()) {
                throw new AssertionError();
            }
            eVar.J(((Integer) arrayList2.get(i10)).intValue());
            return;
        }
        e eVar5 = new e();
        eVar.J((int) ((((int) (eVar5.f3977c / 4)) + j8) * (-1)));
        a(j8, eVar5, i11, arrayList, i10, i8, arrayList2);
        eVar.u(eVar5, eVar5.f3977c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return this.f4003b[i6];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4003b.length;
    }
}
