package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
/* loaded from: classes.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f3503b;

    public f(GestureDetector gestureDetector) {
        this.f3503b = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f3503b.onTouchEvent(motionEvent);
        }
        return false;
    }
}
