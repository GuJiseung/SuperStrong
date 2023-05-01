package m;

import java.util.Arrays;
import java.util.Comparator;
import m.b;
/* loaded from: classes.dex */
public final class f extends m.b {

    /* renamed from: f  reason: collision with root package name */
    public h[] f5182f;

    /* renamed from: g  reason: collision with root package name */
    public h[] f5183g;

    /* renamed from: h  reason: collision with root package name */
    public int f5184h;

    /* renamed from: i  reason: collision with root package name */
    public final b f5185i;

    /* loaded from: classes.dex */
    public class a implements Comparator<h> {
        @Override // java.util.Comparator
        public final int compare(h hVar, h hVar2) {
            return hVar.f5190c - hVar2.f5190c;
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public h f5186a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f5186a != null) {
                for (int i6 = 0; i6 < 9; i6++) {
                    str = str + this.f5186a.f5196i[i6] + " ";
                }
            }
            return str + "] " + this.f5186a;
        }
    }

    public f(c cVar) {
        super(cVar);
        this.f5182f = new h[128];
        this.f5183g = new h[128];
        this.f5184h = 0;
        this.f5185i = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r9 < r8) goto L32;
     */
    @Override // m.b, m.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m.h a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.f5184h
            if (r2 >= r4) goto L57
            m.h[] r4 = r11.f5182f
            r5 = r4[r2]
            int r6 = r5.f5190c
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L54
        L13:
            m.f$b r6 = r11.f5185i
            r6.f5186a = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L36
        L1c:
            if (r7 < 0) goto L32
            m.h r4 = r6.f5186a
            float[] r4 = r4.f5196i
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2a
            goto L32
        L2a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L33
        L2f:
            int r7 = r7 + (-1)
            goto L1c
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L54
            goto L53
        L36:
            r4 = r4[r3]
        L38:
            if (r7 < 0) goto L50
            float[] r8 = r4.f5196i
            r8 = r8[r7]
            m.h r9 = r6.f5186a
            float[] r9 = r9.f5196i
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r7 = r7 + (-1)
            goto L38
        L4b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L50
            goto L51
        L50:
            r5 = r1
        L51:
            if (r5 == 0) goto L54
        L53:
            r3 = r2
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != r0) goto L5b
            r12 = 0
            return r12
        L5b:
            m.h[] r12 = r11.f5182f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.a(boolean[]):m.h");
    }

    @Override // m.b
    public final boolean e() {
        return this.f5184h == 0;
    }

    @Override // m.b
    public final void i(d dVar, m.b bVar, boolean z5) {
        boolean z6;
        h hVar = bVar.f5154a;
        if (hVar == null) {
            return;
        }
        b.a aVar = bVar.f5157d;
        int e6 = aVar.e();
        for (int i6 = 0; i6 < e6; i6++) {
            h g2 = aVar.g(i6);
            float a6 = aVar.a(i6);
            b bVar2 = this.f5185i;
            bVar2.f5186a = g2;
            boolean z7 = g2.f5189b;
            float[] fArr = hVar.f5196i;
            if (z7) {
                boolean z8 = true;
                for (int i7 = 0; i7 < 9; i7++) {
                    float[] fArr2 = bVar2.f5186a.f5196i;
                    float f6 = (fArr[i7] * a6) + fArr2[i7];
                    fArr2[i7] = f6;
                    if (Math.abs(f6) < 1.0E-4f) {
                        bVar2.f5186a.f5196i[i7] = 0.0f;
                    } else {
                        z8 = false;
                    }
                }
                if (z8) {
                    f.this.k(bVar2.f5186a);
                }
                z6 = false;
            } else {
                for (int i8 = 0; i8 < 9; i8++) {
                    float f7 = fArr[i8];
                    if (f7 != 0.0f) {
                        float f8 = f7 * a6;
                        if (Math.abs(f8) < 1.0E-4f) {
                            f8 = 0.0f;
                        }
                        bVar2.f5186a.f5196i[i8] = f8;
                    } else {
                        bVar2.f5186a.f5196i[i8] = 0.0f;
                    }
                }
                z6 = true;
            }
            if (z6) {
                j(g2);
            }
            this.f5155b = (bVar.f5155b * a6) + this.f5155b;
        }
        k(hVar);
    }

    public final void j(h hVar) {
        int i6;
        int i7 = this.f5184h + 1;
        h[] hVarArr = this.f5182f;
        if (i7 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f5182f = hVarArr2;
            this.f5183g = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f5182f;
        int i8 = this.f5184h;
        hVarArr3[i8] = hVar;
        int i9 = i8 + 1;
        this.f5184h = i9;
        if (i9 > 1 && hVarArr3[i9 - 1].f5190c > hVar.f5190c) {
            int i10 = 0;
            while (true) {
                i6 = this.f5184h;
                if (i10 >= i6) {
                    break;
                }
                this.f5183g[i10] = this.f5182f[i10];
                i10++;
            }
            Arrays.sort(this.f5183g, 0, i6, new a());
            for (int i11 = 0; i11 < this.f5184h; i11++) {
                this.f5182f[i11] = this.f5183g[i11];
            }
        }
        hVar.f5189b = true;
        hVar.a(this);
    }

    public final void k(h hVar) {
        int i6 = 0;
        while (i6 < this.f5184h) {
            if (this.f5182f[i6] == hVar) {
                while (true) {
                    int i7 = this.f5184h;
                    if (i6 >= i7 - 1) {
                        this.f5184h = i7 - 1;
                        hVar.f5189b = false;
                        return;
                    }
                    h[] hVarArr = this.f5182f;
                    int i8 = i6 + 1;
                    hVarArr[i6] = hVarArr[i8];
                    i6 = i8;
                }
            } else {
                i6++;
            }
        }
    }

    @Override // m.b
    public final String toString() {
        String str = " goal -> (" + this.f5155b + ") : ";
        for (int i6 = 0; i6 < this.f5184h; i6++) {
            h hVar = this.f5182f[i6];
            b bVar = this.f5185i;
            bVar.f5186a = hVar;
            str = str + bVar + " ";
        }
        return str;
    }
}
