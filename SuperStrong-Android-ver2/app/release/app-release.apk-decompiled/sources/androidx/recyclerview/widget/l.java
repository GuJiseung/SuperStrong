package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.g0;
import f0.r0;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class l extends RecyclerView.k implements RecyclerView.p {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a  reason: collision with root package name */
    public final int f2101a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2102b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f2103c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f2104d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2105e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2106f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f2107g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f2108h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2109i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2110j;

    /* renamed from: k  reason: collision with root package name */
    public int f2111k;

    /* renamed from: l  reason: collision with root package name */
    public int f2112l;

    /* renamed from: m  reason: collision with root package name */
    public float f2113m;

    /* renamed from: n  reason: collision with root package name */
    public int f2114n;

    /* renamed from: o  reason: collision with root package name */
    public int f2115o;

    /* renamed from: p  reason: collision with root package name */
    public float f2116p;
    public RecyclerView s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f2124z;

    /* renamed from: q  reason: collision with root package name */
    public int f2117q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f2118r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2119t = false;
    public boolean u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f2120v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f2121w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f2122x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f2123y = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            int i6 = lVar.A;
            ValueAnimator valueAnimator = lVar.f2124z;
            if (i6 != 1) {
                if (i6 != 2) {
                    return;
                }
            } else {
                valueAnimator.cancel();
            }
            lVar.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(RecyclerView recyclerView, int i6, int i7) {
            boolean z5;
            boolean z6;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            l lVar = l.this;
            int computeVerticalScrollRange = lVar.s.computeVerticalScrollRange();
            int i8 = lVar.f2118r;
            int i9 = computeVerticalScrollRange - i8;
            int i10 = lVar.f2101a;
            if (i9 > 0 && i8 >= i10) {
                z5 = true;
            } else {
                z5 = false;
            }
            lVar.f2119t = z5;
            int computeHorizontalScrollRange = lVar.s.computeHorizontalScrollRange();
            int i11 = lVar.f2117q;
            if (computeHorizontalScrollRange - i11 > 0 && i11 >= i10) {
                z6 = true;
            } else {
                z6 = false;
            }
            lVar.u = z6;
            boolean z7 = lVar.f2119t;
            if (!z7 && !z6) {
                if (lVar.f2120v != 0) {
                    lVar.i(0);
                    return;
                }
                return;
            }
            if (z7) {
                float f6 = i8;
                lVar.f2112l = (int) ((((f6 / 2.0f) + computeVerticalScrollOffset) * f6) / computeVerticalScrollRange);
                lVar.f2111k = Math.min(i8, (i8 * i8) / computeVerticalScrollRange);
            }
            if (lVar.u) {
                float f7 = computeHorizontalScrollOffset;
                float f8 = i11;
                lVar.f2115o = (int) ((((f8 / 2.0f) + f7) * f8) / computeHorizontalScrollRange);
                lVar.f2114n = Math.min(i11, (i11 * i11) / computeHorizontalScrollRange);
            }
            int i12 = lVar.f2120v;
            if (i12 == 0 || i12 == 1) {
                lVar.i(1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2127a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f2127a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f2127a) {
                this.f2127a = false;
                return;
            }
            l lVar = l.this;
            if (((Float) lVar.f2124z.getAnimatedValue()).floatValue() == 0.0f) {
                lVar.A = 0;
                lVar.i(0);
                return;
            }
            lVar.A = 2;
            lVar.s.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l lVar = l.this;
            lVar.f2103c.setAlpha(floatValue);
            lVar.f2104d.setAlpha(floatValue);
            lVar.s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i6, int i7, int i8) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2124z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f2103c = stateListDrawable;
        this.f2104d = drawable;
        this.f2107g = stateListDrawable2;
        this.f2108h = drawable2;
        this.f2105e = Math.max(i6, stateListDrawable.getIntrinsicWidth());
        this.f2106f = Math.max(i6, drawable.getIntrinsicWidth());
        this.f2109i = Math.max(i6, stateListDrawable2.getIntrinsicWidth());
        this.f2110j = Math.max(i6, drawable2.getIntrinsicWidth());
        this.f2101a = i7;
        this.f2102b = i8;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.l lVar = recyclerView2.f1853m;
            if (lVar != null) {
                lVar.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList<RecyclerView.k> arrayList = recyclerView2.f1855n;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.f1857o.remove(this);
            if (recyclerView3.f1859p == this) {
                recyclerView3.f1859p = null;
            }
            ArrayList arrayList2 = this.s.f1842g0;
            if (arrayList2 != null) {
                arrayList2.remove(bVar);
            }
            this.s.removeCallbacks(aVar);
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.s.f1857o.add(this);
            this.s.h(bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r9 >= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
        if (r5 >= 0) goto L47;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.a(android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean b(MotionEvent motionEvent) {
        int i6 = this.f2120v;
        if (i6 == 1) {
            boolean g2 = g(motionEvent.getX(), motionEvent.getY());
            boolean f6 = f(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (g2 || f6)) {
                if (f6) {
                    this.f2121w = 1;
                    this.f2116p = (int) motionEvent.getX();
                } else if (g2) {
                    this.f2121w = 2;
                    this.f2113m = (int) motionEvent.getY();
                }
                i(2);
                return true;
            }
        } else if (i6 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void c() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void e(Canvas canvas) {
        int i6;
        if (this.f2117q == this.s.getWidth() && this.f2118r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.f2119t) {
                    int i7 = this.f2117q;
                    int i8 = this.f2105e;
                    int i9 = i7 - i8;
                    int i10 = this.f2112l;
                    int i11 = this.f2111k;
                    int i12 = i10 - (i11 / 2);
                    StateListDrawable stateListDrawable = this.f2103c;
                    stateListDrawable.setBounds(0, 0, i8, i11);
                    int i13 = this.f2118r;
                    int i14 = this.f2106f;
                    Drawable drawable = this.f2104d;
                    drawable.setBounds(0, 0, i14, i13);
                    RecyclerView recyclerView = this.s;
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    boolean z5 = true;
                    if (g0.e.d(recyclerView) != 1) {
                        z5 = false;
                    }
                    if (z5) {
                        drawable.draw(canvas);
                        canvas.translate(i8, i12);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        i6 = -i8;
                    } else {
                        canvas.translate(i9, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i12);
                        stateListDrawable.draw(canvas);
                        i6 = -i9;
                    }
                    canvas.translate(i6, -i12);
                }
                if (this.u) {
                    int i15 = this.f2118r;
                    int i16 = this.f2109i;
                    int i17 = i15 - i16;
                    int i18 = this.f2115o;
                    int i19 = this.f2114n;
                    int i20 = i18 - (i19 / 2);
                    StateListDrawable stateListDrawable2 = this.f2107g;
                    stateListDrawable2.setBounds(0, 0, i19, i16);
                    int i21 = this.f2117q;
                    int i22 = this.f2110j;
                    Drawable drawable2 = this.f2108h;
                    drawable2.setBounds(0, 0, i21, i22);
                    canvas.translate(0.0f, i17);
                    drawable2.draw(canvas);
                    canvas.translate(i20, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i20, -i17);
                    return;
                }
                return;
            }
            return;
        }
        this.f2117q = this.s.getWidth();
        this.f2118r = this.s.getHeight();
        i(0);
    }

    public final boolean f(float f6, float f7) {
        if (f7 >= this.f2118r - this.f2109i) {
            int i6 = this.f2115o;
            int i7 = this.f2114n;
            if (f6 >= i6 - (i7 / 2) && f6 <= (i7 / 2) + i6) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(float f6, float f7) {
        boolean z5;
        RecyclerView recyclerView = this.s;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.e.d(recyclerView) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = this.f2105e;
        if (z5) {
            if (f6 > i6 / 2) {
                return false;
            }
        } else if (f6 < this.f2117q - i6) {
            return false;
        }
        int i7 = this.f2112l;
        int i8 = this.f2111k / 2;
        if (f7 < i7 - i8 || f7 > i8 + i7) {
            return false;
        }
        return true;
    }

    public final void h(int i6) {
        RecyclerView recyclerView = this.s;
        a aVar = this.B;
        recyclerView.removeCallbacks(aVar);
        this.s.postDelayed(aVar, i6);
    }

    public final void i(int i6) {
        int i7;
        StateListDrawable stateListDrawable = this.f2103c;
        if (i6 == 2 && this.f2120v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(this.B);
        }
        if (i6 == 0) {
            this.s.invalidate();
        } else {
            j();
        }
        if (this.f2120v == 2 && i6 != 2) {
            stateListDrawable.setState(D);
            i7 = 1200;
        } else {
            i7 = i6 == 1 ? 1500 : 1500;
            this.f2120v = i6;
        }
        h(i7);
        this.f2120v = i6;
    }

    public final void j() {
        int i6 = this.A;
        ValueAnimator valueAnimator = this.f2124z;
        if (i6 != 0) {
            if (i6 != 3) {
                return;
            }
            valueAnimator.cancel();
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
