package u2;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public final Dialog f6238b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6239c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6240d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6241e;

    public a(Dialog dialog, Rect rect) {
        this.f6238b = dialog;
        this.f6239c = rect.left;
        this.f6240d = rect.top;
        this.f6241e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f6239c;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f6240d;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i6 = this.f6241e;
            obtain.setLocation((-i6) - 1, (-i6) - 1);
        }
        view.performClick();
        return this.f6238b.onTouchEvent(obtain);
    }
}
