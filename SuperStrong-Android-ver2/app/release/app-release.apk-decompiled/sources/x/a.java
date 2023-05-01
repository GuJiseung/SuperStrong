package x;

import android.graphics.Color;
import c0.n;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f6604a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6605b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6606c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6607d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6608e;

    /* renamed from: f  reason: collision with root package name */
    public final float f6609f;

    public a(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f6604a = f6;
        this.f6605b = f7;
        this.f6606c = f8;
        this.f6607d = f9;
        this.f6608e = f10;
        this.f6609f = f11;
    }

    public static a a(int i6) {
        float f6;
        float pow;
        l lVar = l.f6642k;
        float h6 = n.h(Color.red(i6));
        float h7 = n.h(Color.green(i6));
        float h8 = n.h(Color.blue(i6));
        float[][] fArr = n.f2731e;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[2] * h8) + (fArr2[1] * h7) + (fArr2[0] * h6);
        float[] fArr3 = fArr[1];
        float f8 = (fArr3[2] * h8) + (fArr3[1] * h7) + (fArr3[0] * h6);
        float[] fArr4 = fArr[2];
        float f9 = (h8 * fArr4[2]) + (h7 * fArr4[1]) + (h6 * fArr4[0]);
        float[][] fArr5 = n.f2728b;
        float[] fArr6 = fArr5[0];
        float f10 = (fArr6[2] * f9) + (fArr6[1] * f8) + (fArr6[0] * f7);
        float[] fArr7 = fArr5[1];
        float f11 = fArr7[1] * f8;
        float f12 = fArr7[2] * f9;
        float[] fArr8 = fArr5[2];
        float f13 = f7 * fArr8[0];
        float f14 = f9 * fArr8[2];
        float[] fArr9 = lVar.f6649g;
        float f15 = fArr9[0] * f10;
        float f16 = fArr9[1] * (f12 + f11 + (fArr7[0] * f7));
        float f17 = fArr9[2] * (f14 + (f8 * fArr8[1]) + f13);
        float abs = Math.abs(f15);
        float f18 = lVar.f6650h;
        float pow2 = (float) Math.pow((abs * f18) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f16) * f18) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f17) * f18) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d6 = signum3;
        float f19 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d6)) / 11.0f;
        float f20 = ((float) ((signum + signum2) - (d6 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = ((21.0f * signum3) + ((signum * 20.0f) + f21)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = atan2;
        float f25 = (3.1415927f * f24) / 180.0f;
        float f26 = f23 * lVar.f6644b;
        float f27 = lVar.f6643a;
        double d7 = f26 / f27;
        float f28 = lVar.f6652j;
        float f29 = lVar.f6646d;
        float pow5 = ((float) Math.pow(d7, f28 * f29)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f30 = f27 + 4.0f;
        if (f24 < 20.14d) {
            f6 = 360.0f + f24;
        } else {
            f6 = f24;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f6648f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f6 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f6647e) * lVar.f6645c) * ((float) Math.sqrt((f20 * f20) + (f19 * f19)))) / (f22 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f29) / f30);
        float f31 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((lVar.f6651i * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d8 = f25;
        return new a(f24, pow6, pow5, f31, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    public static a b(float f6, float f7, float f8) {
        l lVar;
        double d6;
        float f9 = l.f6642k.f6646d;
        Math.sqrt(f6 / 100.0d);
        Math.sqrt(((f7 / ((float) Math.sqrt(d6))) * lVar.f6646d) / (lVar.f6643a + 4.0f));
        float f10 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float log = ((float) Math.log((lVar.f6651i * f7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f8) / 180.0f;
        return new a(f8, f7, f6, f10, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public final int c(l lVar) {
        float f6;
        float[] fArr;
        float f7 = this.f6605b;
        int i6 = (f7 > 0.0d ? 1 : (f7 == 0.0d ? 0 : -1));
        float f8 = this.f6606c;
        if (i6 != 0) {
            double d6 = f8;
            if (d6 != 0.0d) {
                f6 = f7 / ((float) Math.sqrt(d6 / 100.0d));
                float pow = (float) Math.pow(f6 / Math.pow(1.64d - Math.pow(0.29d, lVar.f6648f), 0.73d), 1.1111111111111112d);
                double d7 = (this.f6604a * 3.1415927f) / 180.0f;
                float pow2 = lVar.f6643a * ((float) Math.pow(f8 / 100.0d, (1.0d / lVar.f6646d) / lVar.f6652j));
                float cos = ((float) (Math.cos(2.0d + d7) + 3.8d)) * 0.25f * 3846.1538f * lVar.f6647e * lVar.f6645c;
                float f9 = pow2 / lVar.f6644b;
                float sin = (float) Math.sin(d7);
                float cos2 = (float) Math.cos(d7);
                float f10 = (((0.305f + f9) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f11 = cos2 * f10;
                float f12 = f10 * sin;
                float f13 = f9 * 460.0f;
                float f14 = ((288.0f * f12) + ((451.0f * f11) + f13)) / 1403.0f;
                float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
                float f16 = ((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14)));
                float signum = Math.signum(f14);
                float f17 = 100.0f / lVar.f6650h;
                float pow3 = signum * f17 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f15) * f17 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
                float[] fArr2 = lVar.f6649g;
                float f18 = pow3 / fArr2[0];
                float f19 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(f16) * f17) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = n.f2729c;
                float[] fArr4 = fArr3[0];
                float f20 = (fArr4[2] * signum3) + (fArr4[1] * f19) + (fArr4[0] * f18);
                float[] fArr5 = fArr3[1];
                float f21 = fArr5[1] * f19;
                float f22 = fArr5[2] * signum3;
                float f23 = f18 * fArr3[2][0];
                return y.a.a(f20, f22 + f21 + (fArr5[0] * f18), (signum3 * fArr[2]) + (f19 * fArr[1]) + f23);
            }
        }
        f6 = 0.0f;
        float pow4 = (float) Math.pow(f6 / Math.pow(1.64d - Math.pow(0.29d, lVar.f6648f), 0.73d), 1.1111111111111112d);
        double d72 = (this.f6604a * 3.1415927f) / 180.0f;
        float pow22 = lVar.f6643a * ((float) Math.pow(f8 / 100.0d, (1.0d / lVar.f6646d) / lVar.f6652j));
        float cos3 = ((float) (Math.cos(2.0d + d72) + 3.8d)) * 0.25f * 3846.1538f * lVar.f6647e * lVar.f6645c;
        float f92 = pow22 / lVar.f6644b;
        float sin2 = (float) Math.sin(d72);
        float cos22 = (float) Math.cos(d72);
        float f102 = (((0.305f + f92) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f112 = cos22 * f102;
        float f122 = f102 * sin2;
        float f132 = f92 * 460.0f;
        float f142 = ((288.0f * f122) + ((451.0f * f112) + f132)) / 1403.0f;
        float f152 = ((f132 - (891.0f * f112)) - (261.0f * f122)) / 1403.0f;
        float f162 = ((f132 - (f112 * 220.0f)) - (f122 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f142) * 27.13d) / (400.0d - Math.abs(f142)));
        float signum4 = Math.signum(f142);
        float f172 = 100.0f / lVar.f6650h;
        float pow32 = signum4 * f172 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f152) * f172 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f152) * 27.13d) / (400.0d - Math.abs(f152))), 2.380952380952381d));
        float[] fArr22 = lVar.f6649g;
        float f182 = pow32 / fArr22[0];
        float f192 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(f162) * f172) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f162) * 27.13d) / (400.0d - Math.abs(f162))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = n.f2729c;
        float[] fArr42 = fArr32[0];
        float f202 = (fArr42[2] * signum32) + (fArr42[1] * f192) + (fArr42[0] * f182);
        float[] fArr52 = fArr32[1];
        float f212 = fArr52[1] * f192;
        float f222 = fArr52[2] * signum32;
        float f232 = f182 * fArr32[2][0];
        return y.a.a(f202, f222 + f212 + (fArr52[0] * f182), (signum32 * fArr[2]) + (f192 * fArr[1]) + f232);
    }
}
