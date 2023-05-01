package h2;

import android.animation.TypeEvaluator;
/* loaded from: classes.dex */
public final class b implements TypeEvaluator<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4427a = new b();

    @Override // android.animation.TypeEvaluator
    public final Integer evaluate(float f6, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f7 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = ((((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3) * f6) + pow3;
        return Integer.valueOf((Math.round(((float) Math.pow(((pow4 - pow) * f6) + pow, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((((((intValue2 >> 24) & 255) / 255.0f) - f7) * f6) + f7) * 255.0f) << 24) | (Math.round(((float) Math.pow(((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f6) + pow2, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f));
    }
}
