package m;

import java.util.Arrays;
import m.b;
/* loaded from: classes.dex */
public final class a implements b.a {

    /* renamed from: b  reason: collision with root package name */
    public final b f5145b;

    /* renamed from: c  reason: collision with root package name */
    public final c f5146c;

    /* renamed from: a  reason: collision with root package name */
    public int f5144a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f5147d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f5148e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f5149f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f5150g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f5151h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f5152i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5153j = false;

    public a(b bVar, c cVar) {
        this.f5145b = bVar;
        this.f5146c = cVar;
    }

    @Override // m.b.a
    public final float a(int i6) {
        int i7 = this.f5151h;
        for (int i8 = 0; i7 != -1 && i8 < this.f5144a; i8++) {
            if (i8 == i6) {
                return this.f5150g[i7];
            }
            i7 = this.f5149f[i7];
        }
        return 0.0f;
    }

    @Override // m.b.a
    public final void b(h hVar, float f6, boolean z5) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i6 = this.f5151h;
            b bVar = this.f5145b;
            if (i6 == -1) {
                this.f5151h = 0;
                this.f5150g[0] = f6;
                this.f5148e[0] = hVar.f5190c;
                this.f5149f[0] = -1;
                hVar.f5200m++;
                hVar.a(bVar);
                this.f5144a++;
                if (this.f5153j) {
                    return;
                }
                int i7 = this.f5152i + 1;
                this.f5152i = i7;
                int[] iArr = this.f5148e;
                if (i7 >= iArr.length) {
                    this.f5153j = true;
                    this.f5152i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i8 = -1;
            for (int i9 = 0; i6 != -1 && i9 < this.f5144a; i9++) {
                int i10 = this.f5148e[i6];
                int i11 = hVar.f5190c;
                if (i10 == i11) {
                    float[] fArr = this.f5150g;
                    float f7 = fArr[i6] + f6;
                    if (f7 > -0.001f && f7 < 0.001f) {
                        f7 = 0.0f;
                    }
                    fArr[i6] = f7;
                    if (f7 == 0.0f) {
                        if (i6 == this.f5151h) {
                            this.f5151h = this.f5149f[i6];
                        } else {
                            int[] iArr2 = this.f5149f;
                            iArr2[i8] = iArr2[i6];
                        }
                        if (z5) {
                            hVar.b(bVar);
                        }
                        if (this.f5153j) {
                            this.f5152i = i6;
                        }
                        hVar.f5200m--;
                        this.f5144a--;
                        return;
                    }
                    return;
                }
                if (i10 < i11) {
                    i8 = i6;
                }
                i6 = this.f5149f[i6];
            }
            int i12 = this.f5152i;
            int i13 = i12 + 1;
            if (this.f5153j) {
                int[] iArr3 = this.f5148e;
                if (iArr3[i12] != -1) {
                    i12 = iArr3.length;
                }
            } else {
                i12 = i13;
            }
            int[] iArr4 = this.f5148e;
            if (i12 >= iArr4.length && this.f5144a < iArr4.length) {
                int i14 = 0;
                while (true) {
                    int[] iArr5 = this.f5148e;
                    if (i14 >= iArr5.length) {
                        break;
                    } else if (iArr5[i14] == -1) {
                        i12 = i14;
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            int[] iArr6 = this.f5148e;
            if (i12 >= iArr6.length) {
                i12 = iArr6.length;
                int i15 = this.f5147d * 2;
                this.f5147d = i15;
                this.f5153j = false;
                this.f5152i = i12 - 1;
                this.f5150g = Arrays.copyOf(this.f5150g, i15);
                this.f5148e = Arrays.copyOf(this.f5148e, this.f5147d);
                this.f5149f = Arrays.copyOf(this.f5149f, this.f5147d);
            }
            this.f5148e[i12] = hVar.f5190c;
            this.f5150g[i12] = f6;
            int[] iArr7 = this.f5149f;
            if (i8 != -1) {
                iArr7[i12] = iArr7[i8];
                iArr7[i8] = i12;
            } else {
                iArr7[i12] = this.f5151h;
                this.f5151h = i12;
            }
            hVar.f5200m++;
            hVar.a(bVar);
            this.f5144a++;
            if (!this.f5153j) {
                this.f5152i++;
            }
            int i16 = this.f5152i;
            int[] iArr8 = this.f5148e;
            if (i16 >= iArr8.length) {
                this.f5153j = true;
                this.f5152i = iArr8.length - 1;
            }
        }
    }

    @Override // m.b.a
    public final boolean c(h hVar) {
        int i6 = this.f5151h;
        if (i6 == -1) {
            return false;
        }
        for (int i7 = 0; i6 != -1 && i7 < this.f5144a; i7++) {
            if (this.f5148e[i6] == hVar.f5190c) {
                return true;
            }
            i6 = this.f5149f[i6];
        }
        return false;
    }

    @Override // m.b.a
    public final void clear() {
        int i6 = this.f5151h;
        for (int i7 = 0; i6 != -1 && i7 < this.f5144a; i7++) {
            h hVar = ((h[]) this.f5146c.f5162d)[this.f5148e[i6]];
            if (hVar != null) {
                hVar.b(this.f5145b);
            }
            i6 = this.f5149f[i6];
        }
        this.f5151h = -1;
        this.f5152i = -1;
        this.f5153j = false;
        this.f5144a = 0;
    }

    @Override // m.b.a
    public final float d(h hVar) {
        int i6 = this.f5151h;
        for (int i7 = 0; i6 != -1 && i7 < this.f5144a; i7++) {
            if (this.f5148e[i6] == hVar.f5190c) {
                return this.f5150g[i6];
            }
            i6 = this.f5149f[i6];
        }
        return 0.0f;
    }

    @Override // m.b.a
    public final int e() {
        return this.f5144a;
    }

    @Override // m.b.a
    public final void f(h hVar, float f6) {
        if (f6 == 0.0f) {
            j(hVar, true);
            return;
        }
        int i6 = this.f5151h;
        b bVar = this.f5145b;
        if (i6 == -1) {
            this.f5151h = 0;
            this.f5150g[0] = f6;
            this.f5148e[0] = hVar.f5190c;
            this.f5149f[0] = -1;
            hVar.f5200m++;
            hVar.a(bVar);
            this.f5144a++;
            if (this.f5153j) {
                return;
            }
            int i7 = this.f5152i + 1;
            this.f5152i = i7;
            int[] iArr = this.f5148e;
            if (i7 >= iArr.length) {
                this.f5153j = true;
                this.f5152i = iArr.length - 1;
                return;
            }
            return;
        }
        int i8 = -1;
        for (int i9 = 0; i6 != -1 && i9 < this.f5144a; i9++) {
            int i10 = this.f5148e[i6];
            int i11 = hVar.f5190c;
            if (i10 == i11) {
                this.f5150g[i6] = f6;
                return;
            }
            if (i10 < i11) {
                i8 = i6;
            }
            i6 = this.f5149f[i6];
        }
        int i12 = this.f5152i;
        int i13 = i12 + 1;
        if (this.f5153j) {
            int[] iArr2 = this.f5148e;
            if (iArr2[i12] != -1) {
                i12 = iArr2.length;
            }
        } else {
            i12 = i13;
        }
        int[] iArr3 = this.f5148e;
        if (i12 >= iArr3.length && this.f5144a < iArr3.length) {
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.f5148e;
                if (i14 >= iArr4.length) {
                    break;
                } else if (iArr4[i14] == -1) {
                    i12 = i14;
                    break;
                } else {
                    i14++;
                }
            }
        }
        int[] iArr5 = this.f5148e;
        if (i12 >= iArr5.length) {
            i12 = iArr5.length;
            int i15 = this.f5147d * 2;
            this.f5147d = i15;
            this.f5153j = false;
            this.f5152i = i12 - 1;
            this.f5150g = Arrays.copyOf(this.f5150g, i15);
            this.f5148e = Arrays.copyOf(this.f5148e, this.f5147d);
            this.f5149f = Arrays.copyOf(this.f5149f, this.f5147d);
        }
        this.f5148e[i12] = hVar.f5190c;
        this.f5150g[i12] = f6;
        int[] iArr6 = this.f5149f;
        if (i8 != -1) {
            iArr6[i12] = iArr6[i8];
            iArr6[i8] = i12;
        } else {
            iArr6[i12] = this.f5151h;
            this.f5151h = i12;
        }
        hVar.f5200m++;
        hVar.a(bVar);
        int i16 = this.f5144a + 1;
        this.f5144a = i16;
        if (!this.f5153j) {
            this.f5152i++;
        }
        int[] iArr7 = this.f5148e;
        if (i16 >= iArr7.length) {
            this.f5153j = true;
        }
        if (this.f5152i >= iArr7.length) {
            this.f5153j = true;
            this.f5152i = iArr7.length - 1;
        }
    }

    @Override // m.b.a
    public final h g(int i6) {
        int i7 = this.f5151h;
        for (int i8 = 0; i7 != -1 && i8 < this.f5144a; i8++) {
            if (i8 == i6) {
                return ((h[]) this.f5146c.f5162d)[this.f5148e[i7]];
            }
            i7 = this.f5149f[i7];
        }
        return null;
    }

    @Override // m.b.a
    public final void h(float f6) {
        int i6 = this.f5151h;
        for (int i7 = 0; i6 != -1 && i7 < this.f5144a; i7++) {
            float[] fArr = this.f5150g;
            fArr[i6] = fArr[i6] / f6;
            i6 = this.f5149f[i6];
        }
    }

    @Override // m.b.a
    public final float i(b bVar, boolean z5) {
        float d6 = d(bVar.f5154a);
        j(bVar.f5154a, z5);
        b.a aVar = bVar.f5157d;
        int e6 = aVar.e();
        for (int i6 = 0; i6 < e6; i6++) {
            h g2 = aVar.g(i6);
            b(g2, aVar.d(g2) * d6, z5);
        }
        return d6;
    }

    @Override // m.b.a
    public final float j(h hVar, boolean z5) {
        int i6 = this.f5151h;
        if (i6 == -1) {
            return 0.0f;
        }
        int i7 = 0;
        int i8 = -1;
        while (i6 != -1 && i7 < this.f5144a) {
            if (this.f5148e[i6] == hVar.f5190c) {
                if (i6 == this.f5151h) {
                    this.f5151h = this.f5149f[i6];
                } else {
                    int[] iArr = this.f5149f;
                    iArr[i8] = iArr[i6];
                }
                if (z5) {
                    hVar.b(this.f5145b);
                }
                hVar.f5200m--;
                this.f5144a--;
                this.f5148e[i6] = -1;
                if (this.f5153j) {
                    this.f5152i = i6;
                }
                return this.f5150g[i6];
            }
            i7++;
            i8 = i6;
            i6 = this.f5149f[i6];
        }
        return 0.0f;
    }

    @Override // m.b.a
    public final void k() {
        int i6 = this.f5151h;
        for (int i7 = 0; i6 != -1 && i7 < this.f5144a; i7++) {
            float[] fArr = this.f5150g;
            fArr[i6] = fArr[i6] * (-1.0f);
            i6 = this.f5149f[i6];
        }
    }

    public final String toString() {
        int i6 = this.f5151h;
        String str = "";
        for (int i7 = 0; i6 != -1 && i7 < this.f5144a; i7++) {
            str = ((str + " -> ") + this.f5150g[i6] + " : ") + ((h[]) this.f5146c.f5162d)[this.f5148e[i6]];
            i6 = this.f5149f[i6];
        }
        return str;
    }
}
