package h0;

import android.graphics.Path;
import android.view.animation.PathInterpolator;
/* loaded from: classes.dex */
public final class a {
    public static PathInterpolator a(float f6, float f7) {
        return new PathInterpolator(f6, f7);
    }

    public static PathInterpolator b(float f6, float f7, float f8, float f9) {
        return new PathInterpolator(f6, f7, f8, f9);
    }

    public static PathInterpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
