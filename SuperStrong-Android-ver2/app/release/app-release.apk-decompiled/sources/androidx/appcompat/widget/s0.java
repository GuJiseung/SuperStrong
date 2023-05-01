package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* loaded from: classes.dex */
public abstract class s0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final float f923b;

    /* renamed from: c  reason: collision with root package name */
    public final int f924c;

    /* renamed from: d  reason: collision with root package name */
    public final int f925d;

    /* renamed from: e  reason: collision with root package name */
    public final View f926e;

    /* renamed from: f  reason: collision with root package name */
    public a f927f;

    /* renamed from: g  reason: collision with root package name */
    public b f928g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f929h;

    /* renamed from: i  reason: collision with root package name */
    public int f930i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f931j = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = s0.this.f926e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            s0 s0Var = s0.this;
            s0Var.a();
            View view = s0Var.f926e;
            if (view.isEnabled() && !view.isLongClickable() && s0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                s0Var.f929h = true;
            }
        }
    }

    public s0(View view) {
        this.f926e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f923b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f924c = tapTimeout;
        this.f925d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f928g;
        View view = this.f926e;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f927f;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract h.f b();

    public abstract boolean c();

    public boolean d() {
        h.f b6 = b();
        if (b6 == null || !b6.b()) {
            return true;
        }
        b6.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r4 != 3) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f929h = false;
        this.f930i = -1;
        a aVar = this.f927f;
        if (aVar != null) {
            this.f926e.removeCallbacks(aVar);
        }
    }
}
