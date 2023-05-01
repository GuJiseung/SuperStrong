package e3;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3836a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3837b = {16842908};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3838c = {16842913, 16842919};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3839d = {16842913};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f3840e = {16842910, 16842919};

    /* renamed from: f  reason: collision with root package name */
    public static final String f3841f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f3837b;
        return new ColorStateList(new int[][]{f3839d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f3838c), b(colorStateList, iArr), b(colorStateList, f3836a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int i6;
        if (colorStateList != null) {
            i6 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i6 = 0;
        }
        return y.a.c(i6, Math.min(Color.alpha(i6) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f3840e, 0)) != 0) {
                Log.w(f3841f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean d(int[] iArr) {
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 : iArr) {
            if (i6 == 16842910) {
                z5 = true;
            } else if (i6 == 16842908 || i6 == 16842919 || i6 == 16843623) {
                z6 = true;
            }
        }
        return z5 && z6;
    }
}
