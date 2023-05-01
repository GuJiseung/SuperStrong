package y;

import android.graphics.Color;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<double[]> f6721a = new ThreadLocal<>();

    public static int a(double d6, double d7, double d8) {
        double d9;
        double d10;
        double d11;
        int min;
        int min2;
        double d12 = (((-0.4986d) * d8) + (((-1.5372d) * d7) + (3.2406d * d6))) / 100.0d;
        double d13 = ((0.0415d * d8) + ((1.8758d * d7) + ((-0.9689d) * d6))) / 100.0d;
        double d14 = ((1.057d * d8) + (((-0.204d) * d7) + (0.0557d * d6))) / 100.0d;
        if (d12 > 0.0031308d) {
            d9 = (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d9 = d12 * 12.92d;
        }
        if (d13 > 0.0031308d) {
            d10 = (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d10 = d13 * 12.92d;
        }
        if (d14 > 0.0031308d) {
            d11 = (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d11 = d14 * 12.92d;
        }
        int round = (int) Math.round(d9 * 255.0d);
        int i6 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d10 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d11 * 255.0d);
        if (round3 >= 0) {
            i6 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i6);
    }

    public static int b(int i6, int i7) {
        int i8;
        int i9;
        int alpha = Color.alpha(i7);
        int alpha2 = Color.alpha(i6);
        int i10 = 255 - alpha2;
        int i11 = 255 - (((255 - alpha) * i10) / 255);
        int red = Color.red(i6);
        int red2 = Color.red(i7);
        int i12 = 0;
        if (i11 == 0) {
            i8 = 0;
        } else {
            i8 = (((red2 * alpha) * i10) + ((red * 255) * alpha2)) / (i11 * 255);
        }
        int green = Color.green(i6);
        int green2 = Color.green(i7);
        if (i11 == 0) {
            i9 = 0;
        } else {
            i9 = (((green2 * alpha) * i10) + ((green * 255) * alpha2)) / (i11 * 255);
        }
        int blue = Color.blue(i6);
        int blue2 = Color.blue(i7);
        if (i11 != 0) {
            i12 = (((blue2 * alpha) * i10) + ((blue * 255) * alpha2)) / (i11 * 255);
        }
        return Color.argb(i11, i8, i9, i12);
    }

    public static int c(int i6, int i7) {
        if (i7 < 0 || i7 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i6 & 16777215) | (i7 << 24);
    }
}
