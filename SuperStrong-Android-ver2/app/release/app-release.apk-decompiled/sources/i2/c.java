package i2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class c<V extends View> extends e<V> {

    /* renamed from: c  reason: collision with root package name */
    public a f4601c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f4602d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4603e;

    /* renamed from: f  reason: collision with root package name */
    public int f4604f;

    /* renamed from: g  reason: collision with root package name */
    public int f4605g;

    /* renamed from: h  reason: collision with root package name */
    public int f4606h;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f4607i;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final CoordinatorLayout f4608b;

        /* renamed from: c  reason: collision with root package name */
        public final V f4609c;

        public a(CoordinatorLayout coordinatorLayout, V v2) {
            this.f4608b = coordinatorLayout;
            this.f4609c = v2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar;
            OverScroller overScroller;
            V v2 = this.f4609c;
            if (v2 != null && (overScroller = (cVar = c.this).f4602d) != null) {
                boolean computeScrollOffset = overScroller.computeScrollOffset();
                CoordinatorLayout coordinatorLayout = this.f4608b;
                if (computeScrollOffset) {
                    cVar.A(coordinatorLayout, v2, cVar.f4602d.getCurrY());
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    g0.d.m(v2, this);
                    return;
                }
                cVar.y(v2, coordinatorLayout);
            }
        }
    }

    public c() {
        this.f4604f = -1;
        this.f4606h = -1;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4604f = -1;
        this.f4606h = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(CoordinatorLayout coordinatorLayout, View view, int i6) {
        z(coordinatorLayout, view, i6, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z5;
        int findPointerIndex;
        if (this.f4606h < 0) {
            this.f4606h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f4603e) {
            int i6 = this.f4604f;
            if (i6 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i6)) == -1) {
                return false;
            }
            int y5 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y5 - this.f4605g) > this.f4606h) {
                this.f4605g = y5;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f4604f = -1;
            int x5 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (u(v2) && coordinatorLayout.l(v2, x5, y6)) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f4603e = z5;
            if (z5) {
                this.f4605g = y6;
                this.f4604f = motionEvent.getPointerId(0);
                if (this.f4607i == null) {
                    this.f4607i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f4602d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f4602d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f4607i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean u(V v2) {
        return false;
    }

    public int v(V v2) {
        return -v2.getHeight();
    }

    public int w(V v2) {
        return v2.getHeight();
    }

    public int x() {
        return s();
    }

    public void y(View view, CoordinatorLayout coordinatorLayout) {
    }

    public int z(CoordinatorLayout coordinatorLayout, V v2, int i6, int i7, int i8) {
        int j5;
        int s = s();
        if (i7 != 0 && s >= i7 && s <= i8 && s != (j5 = c.a.j(i6, i7, i8))) {
            f fVar = this.f4615a;
            if (fVar != null) {
                if (fVar.f4620d != j5) {
                    fVar.f4620d = j5;
                    fVar.a();
                }
            } else {
                this.f4616b = j5;
            }
            return s - j5;
        }
        return 0;
    }
}
