package m0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import f0.g0;
import f0.r0;
import java.util.Arrays;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: v  reason: collision with root package name */
    public static final a f5219v = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f5220a;

    /* renamed from: b  reason: collision with root package name */
    public int f5221b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f5223d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f5224e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f5225f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f5226g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f5227h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f5228i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f5229j;

    /* renamed from: k  reason: collision with root package name */
    public int f5230k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f5231l;

    /* renamed from: m  reason: collision with root package name */
    public final float f5232m;

    /* renamed from: n  reason: collision with root package name */
    public final float f5233n;

    /* renamed from: o  reason: collision with root package name */
    public final int f5234o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f5235p;

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0063c f5236q;

    /* renamed from: r  reason: collision with root package name */
    public View f5237r;
    public boolean s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f5238t;

    /* renamed from: c  reason: collision with root package name */
    public int f5222c = -1;
    public final b u = new b();

    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.p(0);
        }
    }

    /* renamed from: m0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0063c {
        public abstract int a(View view, int i6);

        public abstract int b(View view, int i6);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(View view, int i6) {
        }

        public abstract void f(int i6);

        public abstract void g(View view, int i6, int i7);

        public abstract void h(View view, float f6, float f7);

        public abstract boolean i(View view, int i6);
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0063c abstractC0063c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0063c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f5238t = viewGroup;
        this.f5236q = abstractC0063c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5234o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f5221b = viewConfiguration.getScaledTouchSlop();
        this.f5232m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5233n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5235p = new OverScroller(context, f5219v);
    }

    public final void a() {
        this.f5222c = -1;
        float[] fArr = this.f5223d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f5224e, 0.0f);
            Arrays.fill(this.f5225f, 0.0f);
            Arrays.fill(this.f5226g, 0.0f);
            Arrays.fill(this.f5227h, 0);
            Arrays.fill(this.f5228i, 0);
            Arrays.fill(this.f5229j, 0);
            this.f5230k = 0;
        }
        VelocityTracker velocityTracker = this.f5231l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5231l = null;
        }
    }

    public final void b(View view, int i6) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f5238t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f5237r = view;
        this.f5222c = i6;
        this.f5236q.e(view, i6);
        p(1);
    }

    public final boolean c(float f6, float f7, int i6, int i7) {
        float abs = Math.abs(f6);
        float abs2 = Math.abs(f7);
        if ((this.f5227h[i6] & i7) != i7 || (0 & i7) == 0 || (this.f5229j[i6] & i7) == i7 || (this.f5228i[i6] & i7) == i7) {
            return false;
        }
        int i8 = this.f5221b;
        if (abs > i8 || abs2 > i8) {
            if (abs < abs2 * 0.5f) {
                this.f5236q.getClass();
            }
            return (this.f5228i[i6] & i7) == 0 && abs > ((float) this.f5221b);
        }
        return false;
    }

    public final boolean d(View view, float f6, float f7) {
        if (view == null) {
            return false;
        }
        AbstractC0063c abstractC0063c = this.f5236q;
        boolean z5 = abstractC0063c.c(view) > 0;
        boolean z6 = abstractC0063c.d() > 0;
        if (!z5 || !z6) {
            return z5 ? Math.abs(f6) > ((float) this.f5221b) : z6 && Math.abs(f7) > ((float) this.f5221b);
        }
        float f8 = f7 * f7;
        int i6 = this.f5221b;
        return f8 + (f6 * f6) > ((float) (i6 * i6));
    }

    public final void e(int i6) {
        float[] fArr = this.f5223d;
        if (fArr != null) {
            int i7 = this.f5230k;
            boolean z5 = true;
            int i8 = 1 << i6;
            if ((i8 & i7) == 0) {
                z5 = false;
            }
            if (z5) {
                fArr[i6] = 0.0f;
                this.f5224e[i6] = 0.0f;
                this.f5225f[i6] = 0.0f;
                this.f5226g[i6] = 0.0f;
                this.f5227h[i6] = 0;
                this.f5228i[i6] = 0;
                this.f5229j[i6] = 0;
                this.f5230k = (~i8) & i7;
            }
        }
    }

    public final int f(int i6, int i7, int i8) {
        int width;
        int abs;
        if (i6 == 0) {
            return 0;
        }
        float width2 = this.f5238t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i6) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i7);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i6) / i8) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean g() {
        if (this.f5220a == 2) {
            OverScroller overScroller = this.f5235p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f5237r.getLeft();
            int top = currY - this.f5237r.getTop();
            if (left != 0) {
                View view = this.f5237r;
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f5237r;
                WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f5236q.g(this.f5237r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f5238t.post(this.u);
            }
        }
        if (this.f5220a != 2) {
            return false;
        }
        return true;
    }

    public final View h(int i6, int i7) {
        ViewGroup viewGroup = this.f5238t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f5236q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && i7 >= childAt.getTop() && i7 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f5237r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f5237r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f5235p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f5237r
            float r0 = r10.f5233n
            int r0 = (int) r0
            float r6 = r10.f5232m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3c
            goto L43
        L3c:
            if (r7 <= r6) goto L44
            if (r14 <= 0) goto L42
            r14 = r6
            goto L44
        L42:
            int r11 = -r6
        L43:
            r14 = r11
        L44:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5d
            float r11 = (float) r6
            float r6 = (float) r8
            goto L5f
        L5d:
            float r11 = (float) r11
            float r6 = (float) r9
        L5f:
            float r11 = r11 / r6
            if (r14 == 0) goto L65
            float r0 = (float) r7
            float r6 = (float) r8
            goto L67
        L65:
            float r0 = (float) r0
            float r6 = (float) r9
        L67:
            float r0 = r0 / r6
            m0.c$c r6 = r10.f5236q
            int r12 = r6.c(r12)
            int r12 = r10.f(r4, r13, r12)
            int r13 = r6.d()
            int r13 = r10.f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.c.i(int, int, int, int):boolean");
    }

    public final boolean j(int i6) {
        boolean z5;
        if ((this.f5230k & (1 << i6)) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i6 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f5231l == null) {
            this.f5231l = VelocityTracker.obtain();
        }
        this.f5231l.addMovement(motionEvent);
        int i7 = 0;
        AbstractC0063c abstractC0063c = this.f5236q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f5220a == 1 && pointerId == this.f5222c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i7 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i7);
                                            if (pointerId2 != this.f5222c) {
                                                View h6 = h((int) motionEvent.getX(i7), (int) motionEvent.getY(i7));
                                                View view = this.f5237r;
                                                if (h6 == view && s(view, pointerId2)) {
                                                    i6 = this.f5222c;
                                                    break;
                                                }
                                            }
                                            i7++;
                                        } else {
                                            i6 = -1;
                                            break;
                                        }
                                    }
                                    if (i6 == -1) {
                                        l();
                                    }
                                }
                                e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x5 = motionEvent.getX(actionIndex);
                        float y5 = motionEvent.getY(actionIndex);
                        n(x5, y5, pointerId3);
                        if (this.f5220a == 0) {
                            s(h((int) x5, (int) y5), pointerId3);
                            if ((this.f5227h[pointerId3] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i8 = (int) x5;
                            int i9 = (int) y5;
                            View view2 = this.f5237r;
                            if (view2 != null && i8 >= view2.getLeft() && i8 < view2.getRight() && i9 >= view2.getTop() && i9 < view2.getBottom()) {
                                i7 = 1;
                            }
                            if (i7 != 0) {
                                s(this.f5237r, pointerId3);
                                return;
                            }
                            return;
                        }
                    } else if (this.f5220a == 1) {
                        this.s = true;
                        abstractC0063c.h(this.f5237r, 0.0f, 0.0f);
                        this.s = false;
                        if (this.f5220a == 1) {
                            p(0);
                        }
                    }
                } else {
                    if (this.f5220a == 1) {
                        if (j(this.f5222c)) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f5222c);
                            float x6 = motionEvent.getX(findPointerIndex);
                            float y6 = motionEvent.getY(findPointerIndex);
                            float[] fArr = this.f5225f;
                            int i10 = this.f5222c;
                            int i11 = (int) (x6 - fArr[i10]);
                            int i12 = (int) (y6 - this.f5226g[i10]);
                            int left = this.f5237r.getLeft() + i11;
                            int top = this.f5237r.getTop() + i12;
                            int left2 = this.f5237r.getLeft();
                            int top2 = this.f5237r.getTop();
                            if (i11 != 0) {
                                left = abstractC0063c.a(this.f5237r, left);
                                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                                this.f5237r.offsetLeftAndRight(left - left2);
                            }
                            if (i12 != 0) {
                                top = abstractC0063c.b(this.f5237r, top);
                                WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                                this.f5237r.offsetTopAndBottom(top - top2);
                            }
                            if (i11 != 0 || i12 != 0) {
                                abstractC0063c.g(this.f5237r, left, top);
                            }
                        } else {
                            return;
                        }
                    } else {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (i7 < pointerCount2) {
                            int pointerId4 = motionEvent.getPointerId(i7);
                            if (j(pointerId4)) {
                                float x7 = motionEvent.getX(i7);
                                float y7 = motionEvent.getY(i7);
                                float f6 = x7 - this.f5223d[pointerId4];
                                float f7 = y7 - this.f5224e[pointerId4];
                                m(f6, f7, pointerId4);
                                if (this.f5220a != 1) {
                                    View h7 = h((int) x7, (int) y7);
                                    if (d(h7, f6, f7) && s(h7, pointerId4)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i7++;
                        }
                    }
                    o(motionEvent);
                    return;
                }
            } else if (this.f5220a == 1) {
                l();
            }
            a();
            return;
        }
        float x8 = motionEvent.getX();
        float y8 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h8 = h((int) x8, (int) y8);
        n(x8, y8, pointerId5);
        s(h8, pointerId5);
        if ((this.f5227h[pointerId5] & 0) == 0) {
            return;
        }
        abstractC0063c.getClass();
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f5231l;
        float f6 = this.f5232m;
        velocityTracker.computeCurrentVelocity(1000, f6);
        float xVelocity = this.f5231l.getXVelocity(this.f5222c);
        float abs = Math.abs(xVelocity);
        float f7 = this.f5233n;
        float f8 = 0.0f;
        if (abs < f7) {
            xVelocity = 0.0f;
        } else if (abs > f6) {
            if (xVelocity > 0.0f) {
                xVelocity = f6;
            } else {
                xVelocity = -f6;
            }
        }
        float yVelocity = this.f5231l.getYVelocity(this.f5222c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f7) {
            if (abs2 > f6) {
                if (yVelocity <= 0.0f) {
                    f6 = -f6;
                }
                f8 = f6;
            } else {
                f8 = yVelocity;
            }
        }
        this.s = true;
        this.f5236q.h(this.f5237r, xVelocity, f8);
        this.s = false;
        if (this.f5220a == 1) {
            p(0);
        }
    }

    public final void m(float f6, float f7, int i6) {
        boolean c6 = c(f6, f7, i6, 1);
        if (c(f7, f6, i6, 4)) {
            c6 |= true;
        }
        if (c(f6, f7, i6, 2)) {
            c6 |= true;
        }
        if (c(f7, f6, i6, 8)) {
            c6 |= true;
        }
        if (c6) {
            int[] iArr = this.f5228i;
            iArr[i6] = iArr[i6] | c6;
            this.f5236q.getClass();
        }
    }

    public final void n(float f6, float f7, int i6) {
        float[] fArr = this.f5223d;
        int i7 = 0;
        if (fArr == null || fArr.length <= i6) {
            int i8 = i6 + 1;
            float[] fArr2 = new float[i8];
            float[] fArr3 = new float[i8];
            float[] fArr4 = new float[i8];
            float[] fArr5 = new float[i8];
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5224e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5225f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5226g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5227h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5228i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5229j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5223d = fArr2;
            this.f5224e = fArr3;
            this.f5225f = fArr4;
            this.f5226g = fArr5;
            this.f5227h = iArr;
            this.f5228i = iArr2;
            this.f5229j = iArr3;
        }
        float[] fArr9 = this.f5223d;
        this.f5225f[i6] = f6;
        fArr9[i6] = f6;
        float[] fArr10 = this.f5224e;
        this.f5226g[i6] = f7;
        fArr10[i6] = f7;
        int[] iArr7 = this.f5227h;
        int i9 = (int) f6;
        int i10 = (int) f7;
        ViewGroup viewGroup = this.f5238t;
        int left = viewGroup.getLeft();
        int i11 = this.f5234o;
        if (i9 < left + i11) {
            i7 = 1;
        }
        if (i10 < viewGroup.getTop() + i11) {
            i7 |= 4;
        }
        if (i9 > viewGroup.getRight() - i11) {
            i7 |= 2;
        }
        if (i10 > viewGroup.getBottom() - i11) {
            i7 |= 8;
        }
        iArr7[i6] = i7;
        this.f5230k |= 1 << i6;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount; i6++) {
            int pointerId = motionEvent.getPointerId(i6);
            if (j(pointerId)) {
                float x5 = motionEvent.getX(i6);
                float y5 = motionEvent.getY(i6);
                this.f5225f[pointerId] = x5;
                this.f5226g[pointerId] = y5;
            }
        }
    }

    public final void p(int i6) {
        this.f5238t.removeCallbacks(this.u);
        if (this.f5220a != i6) {
            this.f5220a = i6;
            this.f5236q.f(i6);
            if (this.f5220a == 0) {
                this.f5237r = null;
            }
        }
    }

    public final boolean q(int i6, int i7) {
        if (this.s) {
            return i(i6, i7, (int) this.f5231l.getXVelocity(this.f5222c), (int) this.f5231l.getYVelocity(this.f5222c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        if ((r18.f5227h[r2] & 0) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
        if (r13 != r12) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011c, code lost:
        if ((r18.f5227h[r1] & 0) != 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.c.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i6) {
        if (view == this.f5237r && this.f5222c == i6) {
            return true;
        }
        if (view == null || !this.f5236q.i(view, i6)) {
            return false;
        }
        this.f5222c = i6;
        b(view, i6);
        return true;
    }
}
