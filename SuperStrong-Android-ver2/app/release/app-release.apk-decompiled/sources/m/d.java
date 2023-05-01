package m;

import java.util.Arrays;
import m.b;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f5163p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f5164q = 1000;

    /* renamed from: c  reason: collision with root package name */
    public final f f5167c;

    /* renamed from: f  reason: collision with root package name */
    public b[] f5170f;

    /* renamed from: l  reason: collision with root package name */
    public final c f5176l;

    /* renamed from: o  reason: collision with root package name */
    public b f5179o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5165a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f5166b = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f5168d = 32;

    /* renamed from: e  reason: collision with root package name */
    public int f5169e = 32;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5171g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f5172h = new boolean[32];

    /* renamed from: i  reason: collision with root package name */
    public int f5173i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f5174j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f5175k = 32;

    /* renamed from: m  reason: collision with root package name */
    public h[] f5177m = new h[f5164q];

    /* renamed from: n  reason: collision with root package name */
    public int f5178n = 0;

    /* loaded from: classes.dex */
    public interface a {
        h a(boolean[] zArr);
    }

    public d() {
        this.f5170f = null;
        this.f5170f = new b[32];
        t();
        c cVar = new c(0);
        this.f5176l = cVar;
        this.f5167c = new f(cVar);
        this.f5179o = new b(cVar);
    }

    public static int o(o.c cVar) {
        h hVar = cVar.f5410i;
        if (hVar != null) {
            return (int) (hVar.f5193f + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final h a(int i6) {
        e eVar = (e) this.f5176l.f5161c;
        int i7 = eVar.f5181b;
        h hVar = null;
        if (i7 > 0) {
            int i8 = i7 - 1;
            ?? r32 = eVar.f5180a;
            ?? r42 = r32[i8];
            r32[i8] = 0;
            eVar.f5181b = i8;
            hVar = r42;
        }
        h hVar2 = hVar;
        if (hVar2 == null) {
            hVar2 = new h(i6);
        } else {
            hVar2.c();
        }
        hVar2.f5197j = i6;
        int i9 = this.f5178n;
        int i10 = f5164q;
        if (i9 >= i10) {
            int i11 = i10 * 2;
            f5164q = i11;
            this.f5177m = (h[]) Arrays.copyOf(this.f5177m, i11);
        }
        h[] hVarArr = this.f5177m;
        int i12 = this.f5178n;
        this.f5178n = i12 + 1;
        hVarArr[i12] = hVar2;
        return hVar2;
    }

    public final void b(h hVar, h hVar2, int i6, float f6, h hVar3, h hVar4, int i7, int i8) {
        int i9;
        float f7;
        b m5 = m();
        if (hVar2 == hVar3) {
            m5.f5157d.f(hVar, 1.0f);
            m5.f5157d.f(hVar4, 1.0f);
            m5.f5157d.f(hVar2, -2.0f);
        } else {
            if (f6 == 0.5f) {
                m5.f5157d.f(hVar, 1.0f);
                m5.f5157d.f(hVar2, -1.0f);
                m5.f5157d.f(hVar3, -1.0f);
                m5.f5157d.f(hVar4, 1.0f);
                if (i6 > 0 || i7 > 0) {
                    i9 = (-i6) + i7;
                    f7 = i9;
                }
            } else if (f6 <= 0.0f) {
                m5.f5157d.f(hVar, -1.0f);
                m5.f5157d.f(hVar2, 1.0f);
                f7 = i6;
            } else if (f6 >= 1.0f) {
                m5.f5157d.f(hVar4, -1.0f);
                m5.f5157d.f(hVar3, 1.0f);
                i9 = -i7;
                f7 = i9;
            } else {
                float f8 = 1.0f - f6;
                m5.f5157d.f(hVar, f8 * 1.0f);
                m5.f5157d.f(hVar2, f8 * (-1.0f));
                m5.f5157d.f(hVar3, (-1.0f) * f6);
                m5.f5157d.f(hVar4, 1.0f * f6);
                if (i6 > 0 || i7 > 0) {
                    m5.f5155b = (i7 * f6) + ((-i6) * f8);
                }
            }
            m5.f5155b = f7;
        }
        if (i8 != 8) {
            m5.b(this, i8);
        }
        c(m5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
        if (r4.f5200m <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
        if (r4.f5200m <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e0, code lost:
        if (r4.f5200m <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e9, code lost:
        if (r4.f5200m <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ec, code lost:
        r14 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(m.b r17) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.d.c(m.b):void");
    }

    public final void d(h hVar, int i6) {
        b m5;
        b.a aVar;
        float f6;
        int i7 = hVar.f5191d;
        if (i7 == -1) {
            hVar.d(this, i6);
            for (int i8 = 0; i8 < this.f5166b + 1; i8++) {
                h hVar2 = ((h[]) this.f5176l.f5162d)[i8];
            }
            return;
        }
        if (i7 != -1) {
            b bVar = this.f5170f[i7];
            if (!bVar.f5158e) {
                if (bVar.f5157d.e() == 0) {
                    bVar.f5158e = true;
                } else {
                    m5 = m();
                    if (i6 < 0) {
                        m5.f5155b = i6 * (-1);
                        aVar = m5.f5157d;
                        f6 = 1.0f;
                    } else {
                        m5.f5155b = i6;
                        aVar = m5.f5157d;
                        f6 = -1.0f;
                    }
                    aVar.f(hVar, f6);
                }
            }
            bVar.f5155b = i6;
            return;
        }
        m5 = m();
        m5.f5154a = hVar;
        float f7 = i6;
        hVar.f5193f = f7;
        m5.f5155b = f7;
        m5.f5158e = true;
        c(m5);
    }

    public final void e(h hVar, h hVar2, int i6, int i7) {
        if (i7 == 8 && hVar2.f5194g && hVar.f5191d == -1) {
            hVar.d(this, hVar2.f5193f + i6);
            return;
        }
        b m5 = m();
        boolean z5 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z5 = true;
            }
            m5.f5155b = i6;
        }
        if (!z5) {
            m5.f5157d.f(hVar, -1.0f);
            m5.f5157d.f(hVar2, 1.0f);
        } else {
            m5.f5157d.f(hVar, 1.0f);
            m5.f5157d.f(hVar2, -1.0f);
        }
        if (i7 != 8) {
            m5.b(this, i7);
        }
        c(m5);
    }

    public final void f(h hVar, h hVar2, int i6, int i7) {
        b m5 = m();
        h n5 = n();
        n5.f5192e = 0;
        m5.c(hVar, hVar2, n5, i6);
        if (i7 != 8) {
            m5.f5157d.f(k(i7), (int) (m5.f5157d.d(n5) * (-1.0f)));
        }
        c(m5);
    }

    public final void g(h hVar, h hVar2, int i6, int i7) {
        b m5 = m();
        h n5 = n();
        n5.f5192e = 0;
        m5.d(hVar, hVar2, n5, i6);
        if (i7 != 8) {
            m5.f5157d.f(k(i7), (int) (m5.f5157d.d(n5) * (-1.0f)));
        }
        c(m5);
    }

    public final void h(h hVar, h hVar2, h hVar3, h hVar4, float f6) {
        b m5 = m();
        m5.f5157d.f(hVar, -1.0f);
        m5.f5157d.f(hVar2, 1.0f);
        m5.f5157d.f(hVar3, f6);
        m5.f5157d.f(hVar4, -f6);
        c(m5);
    }

    public final void i(b bVar) {
        int i6;
        if (bVar.f5158e) {
            bVar.f5154a.d(this, bVar.f5155b);
        } else {
            b[] bVarArr = this.f5170f;
            int i7 = this.f5174j;
            bVarArr[i7] = bVar;
            h hVar = bVar.f5154a;
            hVar.f5191d = i7;
            this.f5174j = i7 + 1;
            hVar.e(this, bVar);
        }
        if (this.f5165a) {
            int i8 = 0;
            while (i8 < this.f5174j) {
                if (this.f5170f[i8] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f5170f[i8];
                if (bVar2 != null && bVar2.f5158e) {
                    bVar2.f5154a.d(this, bVar2.f5155b);
                    e eVar = (e) this.f5176l.f5160b;
                    int i9 = eVar.f5181b;
                    Object[] objArr = eVar.f5180a;
                    if (i9 < objArr.length) {
                        objArr[i9] = bVar2;
                        eVar.f5181b = i9 + 1;
                    }
                    this.f5170f[i8] = null;
                    int i10 = i8 + 1;
                    int i11 = i10;
                    while (true) {
                        i6 = this.f5174j;
                        if (i10 >= i6) {
                            break;
                        }
                        b[] bVarArr2 = this.f5170f;
                        int i12 = i10 - 1;
                        b bVar3 = bVarArr2[i10];
                        bVarArr2[i12] = bVar3;
                        h hVar2 = bVar3.f5154a;
                        if (hVar2.f5191d == i10) {
                            hVar2.f5191d = i12;
                        }
                        i11 = i10;
                        i10++;
                    }
                    if (i11 < i6) {
                        this.f5170f[i11] = null;
                    }
                    this.f5174j = i6 - 1;
                    i8--;
                }
                i8++;
            }
            this.f5165a = false;
        }
    }

    public final void j() {
        for (int i6 = 0; i6 < this.f5174j; i6++) {
            b bVar = this.f5170f[i6];
            bVar.f5154a.f5193f = bVar.f5155b;
        }
    }

    public final h k(int i6) {
        if (this.f5173i + 1 >= this.f5169e) {
            p();
        }
        h a6 = a(4);
        int i7 = this.f5166b + 1;
        this.f5166b = i7;
        this.f5173i++;
        a6.f5190c = i7;
        a6.f5192e = i6;
        ((h[]) this.f5176l.f5162d)[i7] = a6;
        f fVar = this.f5167c;
        fVar.f5185i.f5186a = a6;
        float[] fArr = a6.f5196i;
        Arrays.fill(fArr, 0.0f);
        fArr[a6.f5192e] = 1.0f;
        fVar.j(a6);
        return a6;
    }

    public final h l(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f5173i + 1 >= this.f5169e) {
            p();
        }
        if (obj instanceof o.c) {
            o.c cVar = (o.c) obj;
            hVar = cVar.f5410i;
            if (hVar == null) {
                cVar.k();
                hVar = cVar.f5410i;
            }
            int i6 = hVar.f5190c;
            c cVar2 = this.f5176l;
            if (i6 == -1 || i6 > this.f5166b || ((h[]) cVar2.f5162d)[i6] == null) {
                if (i6 != -1) {
                    hVar.c();
                }
                int i7 = this.f5166b + 1;
                this.f5166b = i7;
                this.f5173i++;
                hVar.f5190c = i7;
                hVar.f5197j = 1;
                ((h[]) cVar2.f5162d)[i7] = hVar;
            }
        }
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final b m() {
        b bVar;
        c cVar = this.f5176l;
        e eVar = (e) cVar.f5160b;
        int i6 = eVar.f5181b;
        if (i6 > 0) {
            int i7 = i6 - 1;
            ?? r42 = eVar.f5180a;
            ?? r5 = r42[i7];
            r42[i7] = 0;
            eVar.f5181b = i7;
            bVar = r5;
        } else {
            bVar = null;
        }
        b bVar2 = bVar;
        if (bVar2 == null) {
            return new b(cVar);
        }
        bVar2.f5154a = null;
        bVar2.f5157d.clear();
        bVar2.f5155b = 0.0f;
        bVar2.f5158e = false;
        return bVar2;
    }

    public final h n() {
        if (this.f5173i + 1 >= this.f5169e) {
            p();
        }
        h a6 = a(3);
        int i6 = this.f5166b + 1;
        this.f5166b = i6;
        this.f5173i++;
        a6.f5190c = i6;
        ((h[]) this.f5176l.f5162d)[i6] = a6;
        return a6;
    }

    public final void p() {
        int i6 = this.f5168d * 2;
        this.f5168d = i6;
        this.f5170f = (b[]) Arrays.copyOf(this.f5170f, i6);
        c cVar = this.f5176l;
        cVar.f5162d = (h[]) Arrays.copyOf((h[]) cVar.f5162d, this.f5168d);
        int i7 = this.f5168d;
        this.f5172h = new boolean[i7];
        this.f5169e = i7;
        this.f5175k = i7;
    }

    public final void q() {
        f fVar = this.f5167c;
        if (fVar.e()) {
            j();
            return;
        }
        if (this.f5171g) {
            boolean z5 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= this.f5174j) {
                    z5 = true;
                    break;
                } else if (!this.f5170f[i6].f5158e) {
                    break;
                } else {
                    i6++;
                }
            }
            if (z5) {
                j();
                return;
            }
        }
        r(fVar);
    }

    public final void r(f fVar) {
        float f6;
        int i6;
        boolean z5;
        int i7 = 0;
        while (true) {
            f6 = 0.0f;
            i6 = 1;
            if (i7 < this.f5174j) {
                b bVar = this.f5170f[i7];
                if (bVar.f5154a.f5197j != 1 && bVar.f5155b < 0.0f) {
                    z5 = true;
                    break;
                }
                i7++;
            } else {
                z5 = false;
                break;
            }
        }
        if (z5) {
            boolean z6 = false;
            int i8 = 0;
            while (!z6) {
                i8 += i6;
                float f7 = Float.MAX_VALUE;
                int i9 = -1;
                int i10 = -1;
                int i11 = 0;
                int i12 = 0;
                while (i11 < this.f5174j) {
                    b bVar2 = this.f5170f[i11];
                    if (bVar2.f5154a.f5197j != i6 && !bVar2.f5158e && bVar2.f5155b < f6) {
                        int e6 = bVar2.f5157d.e();
                        int i13 = 0;
                        while (i13 < e6) {
                            h g2 = bVar2.f5157d.g(i13);
                            float d6 = bVar2.f5157d.d(g2);
                            if (d6 > f6) {
                                for (int i14 = 0; i14 < 9; i14++) {
                                    float f8 = g2.f5195h[i14] / d6;
                                    if ((f8 < f7 && i14 == i12) || i14 > i12) {
                                        i10 = g2.f5190c;
                                        i12 = i14;
                                        f7 = f8;
                                        i9 = i11;
                                    }
                                }
                            }
                            i13++;
                            f6 = 0.0f;
                        }
                    }
                    i11++;
                    f6 = 0.0f;
                    i6 = 1;
                }
                if (i9 != -1) {
                    b bVar3 = this.f5170f[i9];
                    bVar3.f5154a.f5191d = -1;
                    bVar3.g(((h[]) this.f5176l.f5162d)[i10]);
                    h hVar = bVar3.f5154a;
                    hVar.f5191d = i9;
                    hVar.e(this, bVar3);
                } else {
                    z6 = true;
                }
                if (i8 > this.f5173i / 2) {
                    z6 = true;
                }
                f6 = 0.0f;
                i6 = 1;
            }
        }
        s(fVar);
        j();
    }

    public final void s(b bVar) {
        for (int i6 = 0; i6 < this.f5173i; i6++) {
            this.f5172h[i6] = false;
        }
        boolean z5 = false;
        int i7 = 0;
        while (!z5) {
            i7++;
            if (i7 >= this.f5173i * 2) {
                return;
            }
            h hVar = bVar.f5154a;
            if (hVar != null) {
                this.f5172h[hVar.f5190c] = true;
            }
            h a6 = bVar.a(this.f5172h);
            if (a6 != null) {
                boolean[] zArr = this.f5172h;
                int i8 = a6.f5190c;
                if (zArr[i8]) {
                    return;
                }
                zArr[i8] = true;
            }
            if (a6 != null) {
                float f6 = Float.MAX_VALUE;
                int i9 = -1;
                for (int i10 = 0; i10 < this.f5174j; i10++) {
                    b bVar2 = this.f5170f[i10];
                    if (bVar2.f5154a.f5197j != 1 && !bVar2.f5158e && bVar2.f5157d.c(a6)) {
                        float d6 = bVar2.f5157d.d(a6);
                        if (d6 < 0.0f) {
                            float f7 = (-bVar2.f5155b) / d6;
                            if (f7 < f6) {
                                i9 = i10;
                                f6 = f7;
                            }
                        }
                    }
                }
                if (i9 > -1) {
                    b bVar3 = this.f5170f[i9];
                    bVar3.f5154a.f5191d = -1;
                    bVar3.g(a6);
                    h hVar2 = bVar3.f5154a;
                    hVar2.f5191d = i9;
                    hVar2.e(this, bVar3);
                }
            } else {
                z5 = true;
            }
        }
    }

    public final void t() {
        for (int i6 = 0; i6 < this.f5174j; i6++) {
            b[] bVarArr = this.f5170f;
            b bVar = bVarArr[i6];
            if (bVar != null) {
                e eVar = (e) this.f5176l.f5160b;
                int i7 = eVar.f5181b;
                Object[] objArr = eVar.f5180a;
                if (i7 < objArr.length) {
                    objArr[i7] = bVar;
                    eVar.f5181b = i7 + 1;
                }
            }
            bVarArr[i6] = null;
        }
    }

    public final void u() {
        c cVar;
        int i6 = 0;
        while (true) {
            cVar = this.f5176l;
            h[] hVarArr = (h[]) cVar.f5162d;
            if (i6 >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i6];
            if (hVar != null) {
                hVar.c();
            }
            i6++;
        }
        e eVar = (e) cVar.f5161c;
        h[] hVarArr2 = this.f5177m;
        int i7 = this.f5178n;
        eVar.getClass();
        if (i7 > hVarArr2.length) {
            i7 = hVarArr2.length;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            h hVar2 = hVarArr2[i8];
            int i9 = eVar.f5181b;
            Object[] objArr = eVar.f5180a;
            if (i9 < objArr.length) {
                objArr[i9] = hVar2;
                eVar.f5181b = i9 + 1;
            }
        }
        this.f5178n = 0;
        Arrays.fill((h[]) cVar.f5162d, (Object) null);
        this.f5166b = 0;
        f fVar = this.f5167c;
        fVar.f5184h = 0;
        fVar.f5155b = 0.0f;
        this.f5173i = 1;
        for (int i10 = 0; i10 < this.f5174j; i10++) {
            b bVar = this.f5170f[i10];
        }
        t();
        this.f5174j = 0;
        this.f5179o = new b(cVar);
    }
}
