package a3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import d3.b;
import y.d;
/* loaded from: classes.dex */
public final class a {
    public static float a(String[] strArr, int i6) {
        float parseFloat = Float.parseFloat(strArr[i6]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    public static boolean b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int c(Context context, int i6, int i7) {
        TypedValue a6 = b.a(context, i6);
        return (a6 == null || a6.type != 16) ? i7 : a6.data;
    }

    public static TimeInterpolator d(Context context, int i6, Interpolator interpolator) {
        boolean z5;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i6, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!b(valueOf, "cubic-bezier") && !b(valueOf, "path")) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                if (b(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        return h0.a.b(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                } else if (b(valueOf, "path")) {
                    return h0.a.c(d.d(valueOf.substring(5, valueOf.length() - 1)));
                } else {
                    throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
                }
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }
}
