package h2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final l.h<String, h> f4434a = new l.h<>();

    /* renamed from: b  reason: collision with root package name */
    public final l.h<String, PropertyValuesHolder[]> f4435b = new l.h<>();

    public static g a(Context context, int i6) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i6);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return b(arrayList);
            }
            return null;
        } catch (Exception e6) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i6), e6);
            return null;
        }
    }

    public static g b(ArrayList arrayList) {
        g gVar = new g();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Animator animator = (Animator) arrayList.get(i6);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f4435b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = a.f4424c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = a.f4425d;
                    }
                } else {
                    interpolator = a.f4423b;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f4439d = objectAnimator.getRepeatCount();
                hVar.f4440e = objectAnimator.getRepeatMode();
                gVar.f4434a.put(propertyName, hVar);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public final h c(String str) {
        boolean z5;
        l.h<String, h> hVar = this.f4434a;
        if (hVar.getOrDefault(str, null) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return hVar.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f4434a.equals(((g) obj).f4434a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4434a.hashCode();
    }

    public final String toString() {
        return "\n" + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4434a + "}\n";
    }
}
