package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3497b;

    public a(ClockFaceView clockFaceView) {
        this.f3497b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f3497b;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.u.f3485e) - clockFaceView.C;
        if (height != clockFaceView.s) {
            clockFaceView.s = height;
            clockFaceView.k();
            int i6 = clockFaceView.s;
            ClockHandView clockHandView = clockFaceView.u;
            clockHandView.f3493m = i6;
            clockHandView.invalidate();
        }
        return true;
    }
}
