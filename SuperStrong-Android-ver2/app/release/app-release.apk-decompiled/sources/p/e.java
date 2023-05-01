package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p.b;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final o.e f5640a;

    /* renamed from: d  reason: collision with root package name */
    public final o.e f5643d;

    /* renamed from: f  reason: collision with root package name */
    public b.InterfaceC0073b f5645f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a f5646g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<m> f5647h;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5641b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5642c = true;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<p> f5644e = new ArrayList<>();

    public e(o.e eVar) {
        new ArrayList();
        this.f5645f = null;
        this.f5646g = new b.a();
        this.f5647h = new ArrayList<>();
        this.f5640a = eVar;
        this.f5643d = eVar;
    }

    public final void a(f fVar, int i6, int i7, ArrayList arrayList, m mVar) {
        p pVar = fVar.f5651d;
        if (pVar.f5675c == null) {
            o.e eVar = this.f5640a;
            if (pVar != eVar.f5426d && pVar != eVar.f5428e) {
                if (mVar == null) {
                    mVar = new m(pVar);
                    arrayList.add(mVar);
                }
                pVar.f5675c = mVar;
                mVar.f5664b.add(pVar);
                f fVar2 = pVar.f5680h;
                Iterator it = fVar2.f5658k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i6, 0, arrayList, mVar);
                    }
                }
                f fVar3 = pVar.f5681i;
                Iterator it2 = fVar3.f5658k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i6, 1, arrayList, mVar);
                    }
                }
                if (i6 == 1 && (pVar instanceof n)) {
                    Iterator it3 = ((n) pVar).f5665k.f5658k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i6, 2, arrayList, mVar);
                        }
                    }
                }
                Iterator it4 = fVar2.f5659l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i6, 0, arrayList, mVar);
                }
                Iterator it5 = fVar3.f5659l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i6, 1, arrayList, mVar);
                }
                if (i6 == 1 && (pVar instanceof n)) {
                    Iterator it6 = ((n) pVar).f5665k.f5659l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i6, 2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        if (r2.f5455t == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(o.e r17) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.b(o.e):void");
    }

    public final void c() {
        p jVar;
        ArrayList<p> arrayList = this.f5644e;
        arrayList.clear();
        o.e eVar = this.f5643d;
        eVar.f5426d.f();
        eVar.f5428e.f();
        arrayList.add(eVar.f5426d);
        arrayList.add(eVar.f5428e);
        Iterator<o.d> it = eVar.f5501s0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            o.d next = it.next();
            if (next instanceof o.g) {
                jVar = new j(next);
            } else {
                if (next.x()) {
                    if (next.f5422b == null) {
                        next.f5422b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f5422b);
                } else {
                    arrayList.add(next.f5426d);
                }
                if (next.y()) {
                    if (next.f5424c == null) {
                        next.f5424c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f5424c);
                } else {
                    arrayList.add(next.f5428e);
                }
                if (next instanceof o.i) {
                    jVar = new k(next);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f5674b != eVar) {
                next2.d();
            }
        }
        ArrayList<m> arrayList2 = this.f5647h;
        arrayList2.clear();
        o.e eVar2 = this.f5640a;
        e(eVar2.f5426d, 0, arrayList2);
        e(eVar2.f5428e, 1, arrayList2);
        this.f5641b = false;
    }

    public final int d(o.e eVar, int i6) {
        int i7;
        long j5;
        long j6;
        ArrayList<m> arrayList;
        p pVar;
        p pVar2;
        long j7;
        long j8;
        long j9;
        float f6;
        long j10;
        o.e eVar2 = eVar;
        ArrayList<m> arrayList2 = this.f5647h;
        int size = arrayList2.size();
        int i8 = 0;
        long j11 = 0;
        while (i8 < size) {
            p pVar3 = arrayList2.get(i8).f5663a;
            if (!(pVar3 instanceof c) ? !(i6 != 0 ? (pVar3 instanceof n) : (pVar3 instanceof l)) : ((c) pVar3).f5678f != i6) {
                i7 = size;
                j5 = j11;
                j6 = 0;
                arrayList = arrayList2;
            } else {
                if (i6 == 0) {
                    pVar = eVar2.f5426d;
                } else {
                    pVar = eVar2.f5428e;
                }
                f fVar = pVar.f5680h;
                if (i6 == 0) {
                    pVar2 = eVar2.f5426d;
                } else {
                    pVar2 = eVar2.f5428e;
                }
                f fVar2 = pVar2.f5681i;
                boolean contains = pVar3.f5680h.f5659l.contains(fVar);
                f fVar3 = pVar3.f5681i;
                boolean contains2 = fVar3.f5659l.contains(fVar2);
                long j12 = pVar3.j();
                f fVar4 = pVar3.f5680h;
                if (contains && contains2) {
                    long b6 = m.b(fVar4, 0L);
                    ArrayList<m> arrayList3 = arrayList2;
                    i7 = size;
                    long a6 = m.a(fVar3, 0L);
                    long j13 = b6 - j12;
                    int i9 = fVar3.f5653f;
                    j7 = j11;
                    arrayList = arrayList3;
                    if (j13 >= (-i9)) {
                        j13 += i9;
                    }
                    long j14 = fVar4.f5653f;
                    long j15 = ((-a6) - j12) - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    o.d dVar = pVar3.f5674b;
                    if (i6 == 0) {
                        f6 = dVar.f5433g0;
                    } else if (i6 == 1) {
                        f6 = dVar.f5435h0;
                    } else {
                        dVar.getClass();
                        f6 = -1.0f;
                    }
                    if (f6 > 0.0f) {
                        j10 = (((float) j13) / (1.0f - f6)) + (((float) j15) / f6);
                    } else {
                        j10 = 0;
                    }
                    float f7 = (float) j10;
                    j6 = (fVar4.f5653f + ((((f7 * f6) + 0.5f) + j12) + (((1.0f - f6) * f7) + 0.5f))) - fVar3.f5653f;
                } else {
                    i7 = size;
                    j7 = j11;
                    arrayList = arrayList2;
                    if (contains) {
                        j9 = m.b(fVar4, fVar4.f5653f);
                        j8 = fVar4.f5653f + j12;
                    } else if (contains2) {
                        j8 = (-fVar3.f5653f) + j12;
                        j9 = -m.a(fVar3, fVar3.f5653f);
                    } else {
                        j6 = (pVar3.j() + fVar4.f5653f) - fVar3.f5653f;
                    }
                    j6 = Math.max(j9, j8);
                }
                j5 = j7;
            }
            i8++;
            arrayList2 = arrayList;
            size = i7;
            j11 = Math.max(j5, j6);
            eVar2 = eVar;
        }
        return (int) j11;
    }

    public final void e(p pVar, int i6, ArrayList<m> arrayList) {
        f fVar;
        f fVar2;
        f fVar3;
        Iterator it = pVar.f5680h.f5658k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = pVar.f5681i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                fVar3 = (f) dVar;
            } else if (dVar instanceof p) {
                fVar3 = ((p) dVar).f5680h;
            }
            a(fVar3, i6, 0, arrayList, null);
        }
        Iterator it2 = fVar.f5658k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                fVar2 = (f) dVar2;
            } else if (dVar2 instanceof p) {
                fVar2 = ((p) dVar2).f5681i;
            }
            a(fVar2, i6, 1, arrayList, null);
        }
        if (i6 == 1) {
            Iterator it3 = ((n) pVar).f5665k.f5658k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i6, 2, arrayList, null);
                }
            }
        }
    }

    public final void f(o.d dVar, int i6, int i7, int i8, int i9) {
        boolean z5;
        b.a aVar = this.f5646g;
        aVar.f5628a = i6;
        aVar.f5629b = i8;
        aVar.f5630c = i7;
        aVar.f5631d = i9;
        ((ConstraintLayout.b) this.f5645f).b(dVar, aVar);
        dVar.N(aVar.f5632e);
        dVar.K(aVar.f5633f);
        dVar.F = aVar.f5635h;
        int i10 = aVar.f5634g;
        dVar.f5427d0 = i10;
        if (i10 > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        dVar.F = z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r10 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r8 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        r2.f5660m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
        r2.d(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r13 = this;
            o.e r0 = r13.f5640a
            java.util.ArrayList<o.d> r0 = r0.f5501s0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            o.d r1 = (o.d) r1
            boolean r2 = r1.f5420a
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.V
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.s
            int r4 = r1.f5455t
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L31
        L30:
            r2 = r9
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = r9
        L38:
            p.l r4 = r1.f5426d
            p.g r4 = r4.f5677e
            boolean r5 = r4.f5657j
            p.n r6 = r1.f5428e
            p.g r6 = r6.f5677e
            boolean r7 = r6.f5657j
            r12 = 1
            if (r5 == 0) goto L55
            if (r7 == 0) goto L55
            int r5 = r4.f5654g
            int r7 = r6.f5654g
            r6 = 1
            r2 = r13
            r3 = r1
            r4 = r6
            r2.f(r3, r4, r5, r6, r7)
            goto L8e
        L55:
            if (r5 == 0) goto L6f
            if (r3 == 0) goto L6f
            int r5 = r4.f5654g
            int r7 = r6.f5654g
            r4 = 1
            r6 = 2
            r2 = r13
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            p.n r2 = r1.f5428e
            p.g r2 = r2.f5677e
            int r3 = r1.l()
            if (r10 != r11) goto L8b
            goto L88
        L6f:
            if (r7 == 0) goto L90
            if (r2 == 0) goto L90
            int r5 = r4.f5654g
            int r7 = r6.f5654g
            r4 = 2
            r2 = r13
            r3 = r1
            r6 = r12
            r2.f(r3, r4, r5, r6, r7)
            p.l r2 = r1.f5426d
            p.g r2 = r2.f5677e
            int r3 = r1.q()
            if (r8 != r11) goto L8b
        L88:
            r2.f5660m = r3
            goto L90
        L8b:
            r2.d(r3)
        L8e:
            r1.f5420a = r9
        L90:
            boolean r2 = r1.f5420a
            if (r2 == 0) goto L8
            p.n r2 = r1.f5428e
            p.a r2 = r2.f5666l
            if (r2 == 0) goto L8
            int r1 = r1.f5427d0
            r2.d(r1)
            goto L8
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.g():void");
    }
}
