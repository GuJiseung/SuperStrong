package h2;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f4422a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final t0.b f4423b = new t0.b();

    /* renamed from: c  reason: collision with root package name */
    public static final t0.a f4424c = new t0.a();

    /* renamed from: d  reason: collision with root package name */
    public static final t0.c f4425d = new t0.c();

    /* renamed from: e  reason: collision with root package name */
    public static final DecelerateInterpolator f4426e = new DecelerateInterpolator();

    public static float a(float f6, float f7, float f8, float f9, float f10) {
        if (f10 <= f8) {
            return f6;
        }
        if (f10 >= f9) {
            return f7;
        }
        return ((f7 - f6) * ((f10 - f8) / (f9 - f8))) + f6;
    }

    public static int b(float f6, int i6, int i7) {
        return Math.round(f6 * (i7 - i6)) + i6;
    }
}
