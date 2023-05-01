package g0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4112a;

    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final g f4113a;

        public a(g gVar) {
            this.f4113a = gVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i6) {
            f a6 = this.f4113a.a(i6);
            if (a6 == null) {
                return null;
            }
            return a6.f4095a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i6) {
            this.f4113a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i6, int i7, Bundle bundle) {
            return this.f4113a.c(i6, i7, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(g gVar) {
            super(gVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i6) {
            f b6 = this.f4113a.b(i6);
            if (b6 == null) {
                return null;
            }
            return b6.f4095a;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(g gVar) {
            super(gVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i6, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f4113a.getClass();
        }
    }

    public g() {
        this.f4112a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public g(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f4112a = accessibilityNodeProvider;
    }

    public f a(int i6) {
        return null;
    }

    public f b(int i6) {
        return null;
    }

    public boolean c(int i6, int i7, Bundle bundle) {
        return false;
    }
}
