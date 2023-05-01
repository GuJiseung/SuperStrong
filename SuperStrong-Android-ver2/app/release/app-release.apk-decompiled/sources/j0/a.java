package j0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    public static final int f4641r = ViewConfiguration.getTapTimeout();

    /* renamed from: b  reason: collision with root package name */
    public final C0050a f4642b;

    /* renamed from: c  reason: collision with root package name */
    public final AccelerateInterpolator f4643c;

    /* renamed from: d  reason: collision with root package name */
    public final View f4644d;

    /* renamed from: e  reason: collision with root package name */
    public b f4645e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f4646f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f4647g;

    /* renamed from: h  reason: collision with root package name */
    public int f4648h;

    /* renamed from: i  reason: collision with root package name */
    public int f4649i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f4650j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f4651k;

    /* renamed from: l  reason: collision with root package name */
    public final float[] f4652l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4653m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4654n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4655o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4656p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4657q;

    /* renamed from: j0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0050a {

        /* renamed from: a  reason: collision with root package name */
        public int f4658a;

        /* renamed from: b  reason: collision with root package name */
        public int f4659b;

        /* renamed from: c  reason: collision with root package name */
        public float f4660c;

        /* renamed from: d  reason: collision with root package name */
        public float f4661d;

        /* renamed from: h  reason: collision with root package name */
        public float f4665h;

        /* renamed from: i  reason: collision with root package name */
        public int f4666i;

        /* renamed from: e  reason: collision with root package name */
        public long f4662e = Long.MIN_VALUE;

        /* renamed from: g  reason: collision with root package name */
        public long f4664g = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f4663f = 0;

        public final float a(long j5) {
            long j6 = this.f4662e;
            if (j5 < j6) {
                return 0.0f;
            }
            long j7 = this.f4664g;
            if (j7 < 0 || j5 < j7) {
                return a.b(((float) (j5 - j6)) / this.f4658a, 0.0f, 1.0f) * 0.5f;
            }
            float f6 = this.f4665h;
            return (a.b(((float) (j5 - j7)) / this.f4666i, 0.0f, 1.0f) * f6) + (1.0f - f6);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z5;
            a aVar = a.this;
            if (!aVar.f4656p) {
                return;
            }
            boolean z6 = aVar.f4654n;
            C0050a c0050a = aVar.f4642b;
            if (z6) {
                aVar.f4654n = false;
                c0050a.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c0050a.f4662e = currentAnimationTimeMillis;
                c0050a.f4664g = -1L;
                c0050a.f4663f = currentAnimationTimeMillis;
                c0050a.f4665h = 0.5f;
            }
            if (c0050a.f4664g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0050a.f4664g + c0050a.f4666i) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 && aVar.e()) {
                boolean z7 = aVar.f4655o;
                View view = aVar.f4644d;
                if (z7) {
                    aVar.f4655o = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0050a.f4663f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a6 = c0050a.a(currentAnimationTimeMillis2);
                    c0050a.f4663f = currentAnimationTimeMillis2;
                    h.b(((g) aVar).s, (int) (((float) (currentAnimationTimeMillis2 - c0050a.f4663f)) * ((a6 * 4.0f) + ((-4.0f) * a6 * a6)) * c0050a.f4661d));
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    g0.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            aVar.f4656p = false;
        }
    }

    public a(View view) {
        C0050a c0050a = new C0050a();
        this.f4642b = c0050a;
        this.f4643c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f4646f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4647g = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f4650j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f4651k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4652l = fArr5;
        this.f4644d = view;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f7 = ((int) ((1575.0f * f6) + 0.5f)) / 1000.0f;
        fArr5[0] = f7;
        fArr5[1] = f7;
        float f8 = ((int) ((f6 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f8;
        fArr4[1] = f8;
        this.f4648h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f4649i = f4641r;
        c0050a.f4658a = 500;
        c0050a.f4659b = 500;
    }

    public static float b(float f6, float f7, float f8) {
        return f6 > f8 ? f8 : f6 < f7 ? f7 : f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f4646f
            r0 = r0[r4]
            float[] r1 = r3.f4647g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f4643c
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f4650j
            r0 = r0[r4]
            float[] r1 = r3.f4651k
            r1 = r1[r4]
            float[] r2 = r3.f4652l
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.a(int, float, float, float):float");
    }

    public final float c(float f6, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        int i6 = this.f4648h;
        if (i6 == 0 || i6 == 1) {
            if (f6 < f7) {
                if (f6 >= 0.0f) {
                    return 1.0f - (f6 / f7);
                }
                if (this.f4656p && i6 == 1) {
                    return 1.0f;
                }
            }
        } else if (i6 == 2 && f6 < 0.0f) {
            return f6 / (-f7);
        }
        return 0.0f;
    }

    public final void d() {
        int i6 = 0;
        if (this.f4654n) {
            this.f4656p = false;
            return;
        }
        C0050a c0050a = this.f4642b;
        c0050a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i7 = (int) (currentAnimationTimeMillis - c0050a.f4662e);
        int i8 = c0050a.f4659b;
        if (i7 > i8) {
            i6 = i8;
        } else if (i7 >= 0) {
            i6 = i7;
        }
        c0050a.f4666i = i6;
        c0050a.f4665h = c0050a.a(currentAnimationTimeMillis);
        c0050a.f4664g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r9 = this;
            j0.a$a r0 = r9.f4642b
            float r1 = r0.f4661d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f4660c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 0
            if (r1 == 0) goto L55
            r3 = r9
            j0.g r3 = (j0.g) r3
            android.widget.ListView r3 = r3.s
            int r4 = r3.getCount()
            r5 = 1
            if (r4 != 0) goto L23
        L21:
            r1 = r2
            goto L51
        L23:
            int r6 = r3.getChildCount()
            int r7 = r3.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r4) goto L50
            int r6 = r6 - r5
            android.view.View r1 = r3.getChildAt(r6)
            int r1 = r1.getBottom()
            int r3 = r3.getHeight()
            if (r1 > r3) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r3.getChildAt(r2)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r5
        L51:
            if (r1 != 0) goto L54
            goto L55
        L54:
            r2 = r5
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f4657q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.f4655o = r2
            r7.f4653m = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f4644d
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            j0.a$a r9 = r7.f4642b
            r9.f4660c = r0
            r9.f4661d = r8
            boolean r8 = r7.f4656p
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            j0.a$b r8 = r7.f4645e
            if (r8 != 0) goto L5f
            j0.a$b r8 = new j0.a$b
            r8.<init>()
            r7.f4645e = r8
        L5f:
            r7.f4656p = r2
            r7.f4654n = r2
            boolean r8 = r7.f4653m
            if (r8 != 0) goto L74
            int r8 = r7.f4649i
            if (r8 <= 0) goto L74
            j0.a$b r9 = r7.f4645e
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, f0.r0> r8 = f0.g0.f3878a
            f0.g0.d.n(r4, r9, r5)
            goto L79
        L74:
            j0.a$b r8 = r7.f4645e
            r8.run()
        L79:
            r7.f4653m = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
