package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements v4.b {
    public static final void a(int i6, View view) {
        int i7;
        if (i6 == 0) {
            throw null;
        }
        int i8 = i6 - 1;
        if (i8 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (a0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i8 == 1) {
            if (a0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            i7 = 0;
        } else if (i8 == 2) {
            if (a0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            i7 = 8;
        } else if (i8 != 3) {
            return;
        } else {
            if (a0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            i7 = 4;
        }
        view.setVisibility(i7);
    }

    public static int b(int i6) {
        if (i6 != 0) {
            if (i6 == 4) {
                return 4;
            }
            if (i6 == 8) {
                return 3;
            }
            throw new IllegalArgumentException(androidx.activity.j.a("Unknown visibility ", i6));
        }
        return 2;
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static /* synthetic */ Iterator d() {
        try {
            return Arrays.asList(new AndroidDispatcherFactory()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ String e(int i6) {
        return i6 == 1 ? "REMOVED" : i6 == 2 ? "VISIBLE" : i6 == 3 ? "GONE" : i6 == 4 ? "INVISIBLE" : "null";
    }

    public static /* synthetic */ String f(int i6) {
        return i6 == 1 ? "INITIALIZE" : i6 == 2 ? "SWITCH_TO_SOURCE_SERVICE" : i6 == 3 ? "DECODE_DATA" : "null";
    }
}
