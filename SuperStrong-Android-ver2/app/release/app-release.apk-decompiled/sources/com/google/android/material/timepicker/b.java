package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.superstrong.android.R;
import g0.f;
/* loaded from: classes.dex */
public final class b extends f0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3498d;

    public b(ClockFaceView clockFaceView) {
        this.f3498d = clockFaceView;
    }

    @Override // f0.a
    public final void d(View view, g0.f fVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3856a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.f3498d.f3480y.get(intValue - 1));
        }
        fVar.g(f.c.a(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        fVar.b(f.a.f4098e);
    }

    @Override // f0.a
    public final boolean g(View view, int i6, Bundle bundle) {
        if (i6 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f3498d;
            view.getHitRect(clockFaceView.f3477v);
            float centerX = clockFaceView.f3477v.centerX();
            float centerY = clockFaceView.f3477v.centerY();
            clockFaceView.u.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.u.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i6, bundle);
    }
}
