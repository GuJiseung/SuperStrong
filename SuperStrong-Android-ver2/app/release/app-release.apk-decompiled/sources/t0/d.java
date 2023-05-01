package t0;

import android.view.animation.Interpolator;
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f6129a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6130b;

    public d(float[] fArr) {
        this.f6129a = fArr;
        this.f6130b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f6129a;
        int min = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f7 = this.f6130b;
        float f8 = fArr[min];
        return ((fArr[min + 1] - f8) * ((f6 - (min * f7)) / f7)) + f8;
    }
}
