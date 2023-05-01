package x;

import c0.n;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: k  reason: collision with root package name */
    public static final l f6642k;

    /* renamed from: a  reason: collision with root package name */
    public final float f6643a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6644b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6645c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6646d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6647e;

    /* renamed from: f  reason: collision with root package name */
    public final float f6648f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f6649g;

    /* renamed from: h  reason: collision with root package name */
    public final float f6650h;

    /* renamed from: i  reason: collision with root package name */
    public final float f6651i;

    /* renamed from: j  reason: collision with root package name */
    public final float f6652j;

    static {
        float f6;
        float f7;
        float[] fArr = n.f2730d;
        float j5 = (float) ((n.j() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = n.f2728b;
        float f8 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f9 = fArr[1];
        float f10 = fArr3[1] * f9;
        float f11 = fArr[2];
        float f12 = (fArr3[2] * f11) + f10 + (fArr3[0] * f8);
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[2] * f11) + (fArr4[1] * f9) + (fArr4[0] * f8);
        float[] fArr5 = fArr2[2];
        float f14 = (f11 * fArr5[2]) + (f9 * fArr5[1]) + (f8 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f6 = 0.100000046f;
            f7 = 0.59f;
        } else {
            f6 = 0.12999998f;
            f7 = 0.525f;
        }
        float f15 = f6 + f7;
        float exp = (1.0f - (((float) Math.exp(((-j5) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d6 = exp;
        if (d6 > 1.0d) {
            exp = 1.0f;
        } else if (d6 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp};
        float f16 = 1.0f / ((5.0f * j5) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float cbrt = (0.1f * f18 * f18 * ((float) Math.cbrt(j5 * 5.0d))) + (f17 * j5);
        float j6 = n.j() / fArr[1];
        double d7 = j6;
        float sqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d7, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f14) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f13) / 100.0d, 0.42d), pow2};
        float f19 = fArr7[0];
        float f20 = fArr7[1];
        f6642k = new l(j6, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f19 * 400.0f) / (f19 + 27.13f)) * 2.0f) + ((f20 * 400.0f) / (f20 + 27.13f))) * pow, pow, pow, f15, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public l(float f6, float f7, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f6648f = f6;
        this.f6643a = f7;
        this.f6644b = f8;
        this.f6645c = f9;
        this.f6646d = f10;
        this.f6647e = f11;
        this.f6649g = fArr;
        this.f6650h = f12;
        this.f6651i = f13;
        this.f6652j = f14;
    }
}
