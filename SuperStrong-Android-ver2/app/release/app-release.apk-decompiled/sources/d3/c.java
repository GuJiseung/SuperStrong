package d3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.j1;
/* loaded from: classes.dex */
public final class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        ColorStateList a6;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0 && (a6 = w.a.a(context, resourceId)) != null) {
            return a6;
        }
        return typedArray.getColorStateList(i6);
    }

    public static ColorStateList b(Context context, j1 j1Var, int i6) {
        int i7;
        ColorStateList a6;
        if (j1Var.l(i6) && (i7 = j1Var.i(i6, 0)) != 0 && (a6 = w.a.a(context, i7)) != null) {
            return a6;
        }
        return j1Var.b(i6);
    }

    public static Drawable c(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        Drawable a6;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (a6 = e.a.a(context, resourceId)) == null) ? typedArray.getDrawable(i6) : a6;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
