package d3;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
/* loaded from: classes.dex */
public final class g {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i6;
        int i7;
        int weight;
        int i8;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i6 = configuration.fontWeightAdjustment;
            if (i6 != Integer.MAX_VALUE) {
                i7 = configuration.fontWeightAdjustment;
                if (i7 == 0 || typeface == null) {
                    return null;
                }
                weight = typeface.getWeight();
                i8 = configuration.fontWeightAdjustment;
                create = Typeface.create(typeface, c.a.j(i8 + weight, 1, 1000), typeface.isItalic());
                return create;
            }
            return null;
        }
        return null;
    }
}
