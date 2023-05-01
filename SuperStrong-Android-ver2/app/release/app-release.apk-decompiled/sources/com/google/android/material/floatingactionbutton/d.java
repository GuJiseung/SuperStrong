package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.superstrong.android.R;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public h3.i f3224a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3225b;

    /* renamed from: d  reason: collision with root package name */
    public float f3227d;

    /* renamed from: e  reason: collision with root package name */
    public float f3228e;

    /* renamed from: f  reason: collision with root package name */
    public float f3229f;

    /* renamed from: g  reason: collision with root package name */
    public Animator f3230g;

    /* renamed from: h  reason: collision with root package name */
    public h2.g f3231h;

    /* renamed from: i  reason: collision with root package name */
    public h2.g f3232i;

    /* renamed from: j  reason: collision with root package name */
    public float f3233j;

    /* renamed from: l  reason: collision with root package name */
    public int f3235l;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f3237n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f3238o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<f> f3239p;

    /* renamed from: q  reason: collision with root package name */
    public final FloatingActionButton f3240q;

    /* renamed from: r  reason: collision with root package name */
    public final g3.b f3241r;

    /* renamed from: w  reason: collision with root package name */
    public y2.b f3244w;

    /* renamed from: x  reason: collision with root package name */
    public static final t0.a f3221x = h2.a.f4424c;

    /* renamed from: y  reason: collision with root package name */
    public static final int f3222y = R.attr.motionDurationLong2;

    /* renamed from: z  reason: collision with root package name */
    public static final int f3223z = R.attr.motionEasingEmphasizedInterpolator;
    public static final int A = R.attr.motionDurationMedium1;
    public static final int B = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] C = {16842919, 16842910};
    public static final int[] D = {16843623, 16842908, 16842910};
    public static final int[] E = {16842908, 16842910};
    public static final int[] F = {16843623, 16842910};
    public static final int[] G = {16842910};
    public static final int[] H = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public boolean f3226c = true;

    /* renamed from: k  reason: collision with root package name */
    public float f3234k = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public int f3236m = 0;
    public final Rect s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public final RectF f3242t = new RectF();
    public final RectF u = new RectF();

    /* renamed from: v  reason: collision with root package name */
    public final Matrix f3243v = new Matrix();

    /* loaded from: classes.dex */
    public class a extends h2.f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f6, Matrix matrix, Matrix matrix2) {
            d.this.f3234k = f6;
            float[] fArr = this.f4431a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f4432b;
            matrix2.getValues(fArr2);
            for (int i6 = 0; i6 < 9; i6++) {
                float f7 = fArr2[i6];
                float f8 = fArr[i6];
                fArr2[i6] = ((f7 - f8) * f6) + f8;
            }
            Matrix matrix3 = this.f4433c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f3246a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f3247b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f3248c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f3249d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f3250e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f3251f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f3252g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f3253h;

        public b(float f6, float f7, float f8, float f9, float f10, float f11, float f12, Matrix matrix) {
            this.f3246a = f6;
            this.f3247b = f7;
            this.f3248c = f8;
            this.f3249d = f9;
            this.f3250e = f10;
            this.f3251f = f11;
            this.f3252g = f12;
            this.f3253h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d dVar = d.this;
            dVar.f3240q.setAlpha(h2.a.a(this.f3246a, this.f3247b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = dVar.f3240q;
            float f6 = this.f3249d;
            float f7 = this.f3248c;
            floatingActionButton.setScaleX(((f6 - f7) * floatValue) + f7);
            FloatingActionButton floatingActionButton2 = dVar.f3240q;
            float f8 = this.f3250e;
            floatingActionButton2.setScaleY(((f6 - f8) * floatValue) + f8);
            float f9 = this.f3252g;
            float f10 = this.f3251f;
            dVar.f3234k = ((f9 - f10) * floatValue) + f10;
            Matrix matrix = this.f3253h;
            dVar.a(((f9 - f10) * floatValue) + f10, matrix);
            dVar.f3240q.setImageMatrix(matrix);
        }
    }

    /* loaded from: classes.dex */
    public class c extends i {
        public c(y2.c cVar) {
            super(cVar);
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0024d extends i {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f3255c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0024d(y2.c cVar) {
            super(cVar);
            this.f3255c = cVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f3255c;
            return dVar.f3227d + dVar.f3228e;
        }
    }

    /* loaded from: classes.dex */
    public class e extends i {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f3256c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(y2.c cVar) {
            super(cVar);
            this.f3256c = cVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f3256c;
            return dVar.f3227d + dVar.f3229f;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends i {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f3257c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(y2.c cVar) {
            super(cVar);
            this.f3257c = cVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return this.f3257c.f3227d;
        }
    }

    /* loaded from: classes.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3258a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f3259b;

        public i(y2.c cVar) {
            this.f3259b = cVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f3259b.getClass();
            this.f3258a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z5 = this.f3258a;
            d dVar = this.f3259b;
            if (!z5) {
                dVar.getClass();
                a();
                this.f3258a = true;
            }
            valueAnimator.getAnimatedFraction();
            dVar.getClass();
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f3240q = floatingActionButton;
        this.f3241r = bVar;
        z2.i iVar = new z2.i();
        y2.c cVar = (y2.c) this;
        iVar.a(C, d(new e(cVar)));
        iVar.a(D, d(new C0024d(cVar)));
        iVar.a(E, d(new C0024d(cVar)));
        iVar.a(F, d(new C0024d(cVar)));
        iVar.a(G, d(new h(cVar)));
        iVar.a(H, d(new c(cVar)));
        this.f3233j = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f3221x);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f6, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f3240q.getDrawable();
        if (drawable == null || this.f3235l == 0) {
            return;
        }
        RectF rectF = this.f3242t;
        RectF rectF2 = this.u;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i6 = this.f3235l;
        rectF2.set(0.0f, 0.0f, i6, i6);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i7 = this.f3235l;
        matrix.postScale(f6, f6, i7 / 2.0f, i7 / 2.0f);
    }

    public final AnimatorSet b(h2.g gVar, float f6, float f7, float f8) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f6};
        FloatingActionButton floatingActionButton = this.f3240q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, property, fArr);
        gVar.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, f7);
        gVar.c("scale").a(ofFloat2);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 == 26) {
            ofFloat2.setEvaluator(new y2.a());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, f7);
        gVar.c("scale").a(ofFloat3);
        if (i6 == 26) {
            ofFloat3.setEvaluator(new y2.a());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f3243v;
        a(f8, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new h2.e(), new a(), new Matrix(matrix));
        gVar.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        c.a.q(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f6, float f7, float f8, int i6, int i7) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f3240q;
        ofFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f6, floatingActionButton.getScaleX(), f7, floatingActionButton.getScaleY(), this.f3234k, f8, new Matrix(this.f3243v)));
        arrayList.add(ofFloat);
        c.a.q(animatorSet, arrayList);
        animatorSet.setDuration(a3.a.c(floatingActionButton.getContext(), i6, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(a3.a.d(floatingActionButton.getContext(), i7, h2.a.f4423b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int sizeDimension = this.f3225b ? (0 - this.f3240q.getSizeDimension()) / 2 : 0;
        float e6 = this.f3226c ? e() + this.f3229f : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(e6));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(e6 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void g() {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i(int[] iArr) {
        throw null;
    }

    public void j(float f6, float f7, float f8) {
        throw null;
    }

    public final void k() {
        ArrayList<f> arrayList = this.f3239p;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void l() {
        throw null;
    }

    public void m() {
        throw null;
    }

    public final void n() {
        f(this.s);
        c.a.i(null, "Didn't initialize content background");
        throw null;
    }
}
