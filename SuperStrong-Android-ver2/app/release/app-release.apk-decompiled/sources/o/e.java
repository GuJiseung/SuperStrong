package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p.b;
import p.p;
/* loaded from: classes.dex */
public final class e extends k {
    public int A0;

    /* renamed from: v0  reason: collision with root package name */
    public int f5463v0;

    /* renamed from: z0  reason: collision with root package name */
    public int f5466z0;

    /* renamed from: t0  reason: collision with root package name */
    public final p.b f5461t0 = new p.b(this);

    /* renamed from: u0  reason: collision with root package name */
    public final p.e f5462u0 = new p.e(this);
    public b.InterfaceC0073b w0 = null;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f5464x0 = false;

    /* renamed from: y0  reason: collision with root package name */
    public final m.d f5465y0 = new m.d();
    public int B0 = 0;
    public int C0 = 0;
    public b[] D0 = new b[4];
    public b[] E0 = new b[4];
    public int F0 = 257;
    public boolean G0 = false;
    public boolean H0 = false;
    public WeakReference<c> I0 = null;
    public WeakReference<c> J0 = null;
    public WeakReference<c> K0 = null;
    public WeakReference<c> L0 = null;
    public final HashSet<d> M0 = new HashSet<>();
    public final b.a N0 = new b.a();

    public static void U(d dVar, b.InterfaceC0073b interfaceC0073b, b.a aVar) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i6;
        int i7;
        int i8;
        if (interfaceC0073b == null) {
            return;
        }
        if (dVar.f5439j0 != 8 && !(dVar instanceof g) && !(dVar instanceof a)) {
            int[] iArr = dVar.V;
            aVar.f5628a = iArr[0];
            boolean z9 = true;
            aVar.f5629b = iArr[1];
            aVar.f5630c = dVar.q();
            aVar.f5631d = dVar.l();
            aVar.f5636i = false;
            aVar.f5637j = 0;
            if (aVar.f5628a == 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (aVar.f5629b == 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z5 && dVar.Z > 0.0f) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z6 && dVar.Z > 0.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z5 && dVar.t(0) && dVar.s == 0 && !z7) {
                aVar.f5628a = 2;
                if (z6 && dVar.f5455t == 0) {
                    aVar.f5628a = 1;
                }
                z5 = false;
            }
            if (z6 && dVar.t(1) && dVar.f5455t == 0 && !z8) {
                aVar.f5629b = 2;
                if (z5 && dVar.s == 0) {
                    aVar.f5629b = 1;
                }
                z6 = false;
            }
            if (dVar.A()) {
                aVar.f5628a = 1;
                z5 = false;
            }
            if (dVar.B()) {
                aVar.f5629b = 1;
                z6 = false;
            }
            int[] iArr2 = dVar.u;
            if (z7) {
                if (iArr2[0] == 4) {
                    aVar.f5628a = 1;
                } else if (!z6) {
                    if (aVar.f5629b == 1) {
                        i8 = aVar.f5631d;
                    } else {
                        aVar.f5628a = 2;
                        ((ConstraintLayout.b) interfaceC0073b).b(dVar, aVar);
                        i8 = aVar.f5633f;
                    }
                    aVar.f5628a = 1;
                    aVar.f5630c = (int) (dVar.Z * i8);
                }
            }
            if (z8) {
                if (iArr2[1] == 4) {
                    aVar.f5629b = 1;
                } else if (!z5) {
                    if (aVar.f5628a == 1) {
                        i6 = aVar.f5630c;
                    } else {
                        aVar.f5629b = 2;
                        ((ConstraintLayout.b) interfaceC0073b).b(dVar, aVar);
                        i6 = aVar.f5632e;
                    }
                    aVar.f5629b = 1;
                    if (dVar.f5421a0 == -1) {
                        i7 = (int) (i6 / dVar.Z);
                    } else {
                        i7 = (int) (dVar.Z * i6);
                    }
                    aVar.f5631d = i7;
                }
            }
            ((ConstraintLayout.b) interfaceC0073b).b(dVar, aVar);
            dVar.N(aVar.f5632e);
            dVar.K(aVar.f5633f);
            dVar.F = aVar.f5635h;
            int i9 = aVar.f5634g;
            dVar.f5427d0 = i9;
            if (i9 <= 0) {
                z9 = false;
            }
            dVar.F = z9;
            aVar.f5637j = 0;
            return;
        }
        aVar.f5632e = 0;
        aVar.f5633f = 0;
    }

    @Override // o.k, o.d
    public final void C() {
        this.f5465y0.u();
        this.f5466z0 = 0;
        this.A0 = 0;
        super.C();
    }

    @Override // o.d
    public final void O(boolean z5, boolean z6) {
        super.O(z5, z6);
        int size = this.f5501s0.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f5501s0.get(i6).O(z5, z6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:355:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0601 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x067e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x080b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0817 A[LOOP:14: B:505:0x0815->B:506:0x0817, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x08e3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // o.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q() {
        /*
            Method dump skipped, instructions count: 2299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.Q():void");
    }

    public final void R(int i6, d dVar) {
        if (i6 == 0) {
            int i7 = this.B0 + 1;
            b[] bVarArr = this.E0;
            if (i7 >= bVarArr.length) {
                this.E0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.E0;
            int i8 = this.B0;
            bVarArr2[i8] = new b(dVar, 0, this.f5464x0);
            this.B0 = i8 + 1;
        } else if (i6 == 1) {
            int i9 = this.C0 + 1;
            b[] bVarArr3 = this.D0;
            if (i9 >= bVarArr3.length) {
                this.D0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.D0;
            int i10 = this.C0;
            bVarArr4[i10] = new b(dVar, 1, this.f5464x0);
            this.C0 = i10 + 1;
        }
    }

    public final void S(m.d dVar) {
        boolean z5;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean V = V(64);
        c(dVar, V);
        int size = this.f5501s0.size();
        boolean z9 = false;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar2 = this.f5501s0.get(i7);
            boolean[] zArr = dVar2.U;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z9 = true;
            }
        }
        if (z9) {
            for (int i8 = 0; i8 < size; i8++) {
                d dVar3 = this.f5501s0.get(i8);
                if (dVar3 instanceof a) {
                    a aVar = (a) dVar3;
                    for (int i9 = 0; i9 < aVar.f5495t0; i9++) {
                        d dVar4 = aVar.f5494s0[i9];
                        if (aVar.f5383v0 || dVar4.d()) {
                            int i10 = aVar.f5382u0;
                            if (i10 != 0 && i10 != 1) {
                                if (i10 == 2 || i10 == 3) {
                                    dVar4.U[1] = true;
                                }
                            } else {
                                dVar4.U[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<d> hashSet = this.M0;
        hashSet.clear();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar5 = this.f5501s0.get(i11);
            dVar5.getClass();
            if (!(dVar5 instanceof j) && !(dVar5 instanceof g)) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (z8) {
                if (dVar5 instanceof j) {
                    hashSet.add(dVar5);
                } else {
                    dVar5.c(dVar, V);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<d> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j jVar = (j) it.next();
                int i12 = 0;
                while (true) {
                    if (i12 < jVar.f5495t0) {
                        if (hashSet.contains(jVar.f5494s0[i12])) {
                            z7 = true;
                            continue;
                            break;
                        }
                        i12++;
                    } else {
                        z7 = false;
                        continue;
                        break;
                    }
                }
                if (z7) {
                    jVar.c(dVar, V);
                    hashSet.remove(jVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<d> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().c(dVar, V);
                }
                hashSet.clear();
            }
        }
        if (m.d.f5163p) {
            HashSet<d> hashSet2 = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                d dVar6 = this.f5501s0.get(i13);
                dVar6.getClass();
                if (!(dVar6 instanceof j) && !(dVar6 instanceof g)) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (!z6) {
                    hashSet2.add(dVar6);
                }
            }
            if (this.V[0] == 2) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            b(this, dVar, hashSet2, i6, false);
            Iterator<d> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d next = it3.next();
                r0.a(this, dVar, next);
                next.c(dVar, V);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                d dVar7 = this.f5501s0.get(i14);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.V;
                    int i15 = iArr[0];
                    int i16 = iArr[1];
                    if (i15 == 2) {
                        dVar7.L(1);
                    }
                    if (i16 == 2) {
                        dVar7.M(1);
                    }
                    dVar7.c(dVar, V);
                    if (i15 == 2) {
                        dVar7.L(i15);
                    }
                    if (i16 == 2) {
                        dVar7.M(i16);
                    }
                } else {
                    r0.a(this, dVar, dVar7);
                    if (!(dVar7 instanceof j) && !(dVar7 instanceof g)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z5) {
                        dVar7.c(dVar, V);
                    }
                }
            }
        }
        if (this.B0 > 0) {
            c.b.a(this, dVar, null, 0);
        }
        if (this.C0 > 0) {
            c.b.a(this, dVar, null, 1);
        }
    }

    public final boolean T(int i6, boolean z5) {
        boolean z6;
        p.g gVar;
        int l5;
        boolean z7 = true;
        boolean z8 = z5 & true;
        p.e eVar = this.f5462u0;
        e eVar2 = eVar.f5640a;
        int k5 = eVar2.k(0);
        int k6 = eVar2.k(1);
        int r5 = eVar2.r();
        int s = eVar2.s();
        ArrayList<p> arrayList = eVar.f5644e;
        if (z8 && (k5 == 2 || k6 == 2)) {
            Iterator<p> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f5678f == i6 && !next.k()) {
                    z8 = false;
                    break;
                }
            }
            if (i6 == 0) {
                if (z8 && k5 == 2) {
                    eVar2.L(1);
                    eVar2.N(eVar.d(eVar2, 0));
                    gVar = eVar2.f5426d.f5677e;
                    l5 = eVar2.q();
                    gVar.d(l5);
                }
            } else if (z8 && k6 == 2) {
                eVar2.M(1);
                eVar2.K(eVar.d(eVar2, 1));
                gVar = eVar2.f5428e.f5677e;
                l5 = eVar2.l();
                gVar.d(l5);
            }
        }
        int[] iArr = eVar2.V;
        if (i6 == 0) {
            int i7 = iArr[0];
            if (i7 == 1 || i7 == 4) {
                int q5 = eVar2.q() + r5;
                eVar2.f5426d.f5681i.d(q5);
                eVar2.f5426d.f5677e.d(q5 - r5);
                z6 = true;
            }
            z6 = false;
        } else {
            int i8 = iArr[1];
            if (i8 == 1 || i8 == 4) {
                int l6 = eVar2.l() + s;
                eVar2.f5428e.f5681i.d(l6);
                eVar2.f5428e.f5677e.d(l6 - s);
                z6 = true;
            }
            z6 = false;
        }
        eVar.g();
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f5678f == i6 && (next2.f5674b != eVar2 || next2.f5679g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f5678f == i6 && (z6 || next3.f5674b != eVar2)) {
                if (!next3.f5680h.f5657j || !next3.f5681i.f5657j || (!(next3 instanceof p.c) && !next3.f5677e.f5657j)) {
                    z7 = false;
                    break;
                }
            }
        }
        eVar2.L(k5);
        eVar2.M(k6);
        return z7;
    }

    public final boolean V(int i6) {
        return (this.F0 & i6) == i6;
    }

    @Override // o.d
    public final void n(StringBuilder sb) {
        sb.append(this.f5440k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.Y);
        sb.append("\n");
        Iterator<d> it = this.f5501s0.iterator();
        while (it.hasNext()) {
            it.next().n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
