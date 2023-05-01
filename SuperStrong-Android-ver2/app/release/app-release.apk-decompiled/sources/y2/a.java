package y2;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
/* loaded from: classes.dex */
public final class a implements TypeEvaluator<Float> {

    /* renamed from: a  reason: collision with root package name */
    public final FloatEvaluator f6754a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f6, Float f7, Float f8) {
        float floatValue = this.f6754a.evaluate(f6, (Number) f7, (Number) f8).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
