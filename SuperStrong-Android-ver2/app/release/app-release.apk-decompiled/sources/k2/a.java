package k2;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f0.g0;
import f0.r0;
import g0.j;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4938a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4938a = swipeDismissBehavior;
    }

    @Override // g0.j
    public final boolean a(View view) {
        boolean z5;
        SwipeDismissBehavior swipeDismissBehavior = this.f4938a;
        boolean z6 = false;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.e.d(view) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = swipeDismissBehavior.f2930d;
        if ((i6 == 0 && z5) || (i6 == 1 && !z5)) {
            z6 = true;
        }
        int width = view.getWidth();
        if (z6) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }
}
