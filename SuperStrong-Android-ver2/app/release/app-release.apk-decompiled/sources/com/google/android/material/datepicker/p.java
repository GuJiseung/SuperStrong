package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes.dex */
public final class p extends f0.a {
    @Override // f0.a
    public final void d(View view, g0.f fVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3856a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(null);
    }
}
