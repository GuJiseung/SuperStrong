package g0;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
import m3.o;
/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final d f4093a;

    public e(d dVar) {
        this.f4093a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f4093a.equals(((e) obj).f4093a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4093a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        boolean z6;
        o oVar = (o) ((m3.j) this.f4093a).f5288b;
        AutoCompleteTextView autoCompleteTextView = oVar.f5296h;
        if (autoCompleteTextView != null) {
            int i6 = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                if (z5) {
                    i6 = 2;
                }
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.d.s(oVar.f5310d, i6);
            }
        }
    }
}
