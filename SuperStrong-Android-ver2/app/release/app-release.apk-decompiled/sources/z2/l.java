package z2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class l extends a1.i {

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f6997a;

        public a(TextView textView) {
            this.f6997a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.f6997a;
            textView.setScaleX(floatValue);
            textView.setScaleY(floatValue);
        }
    }

    @Override // a1.i
    public final void d(a1.q qVar) {
        View view = qVar.f98b;
        if (view instanceof TextView) {
            qVar.f97a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // a1.i
    public final void g(a1.q qVar) {
        View view = qVar.f98b;
        if (view instanceof TextView) {
            qVar.f97a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // a1.i
    public final Animator l(ViewGroup viewGroup, a1.q qVar, a1.q qVar2) {
        if (qVar == null || qVar2 == null || !(qVar.f98b instanceof TextView)) {
            return null;
        }
        View view = qVar2.f98b;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            HashMap hashMap = qVar.f97a;
            HashMap hashMap2 = qVar2.f97a;
            float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
            float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
            if (floatValue == floatValue2) {
                return null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
            ofFloat.addUpdateListener(new a(textView));
            return ofFloat;
        }
        return null;
    }
}
