package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.o1;
import com.superstrong.android.R;
import d1.b;
import f0.b0;
import f0.g0;
import f0.m;
import f0.r0;
import g0.f;
import j0.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import z.a;
import z2.n;
import z2.q;
@b.InterfaceC0033b
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final e0.f V = new e0.f(16);
    public int A;
    public final int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public com.google.android.material.tabs.a J;
    public final TimeInterpolator K;
    public c L;
    public final ArrayList<c> M;
    public i N;
    public ValueAnimator O;
    public d1.b P;
    public g Q;
    public b R;
    public boolean S;
    public int T;
    public final e0.e U;

    /* renamed from: b  reason: collision with root package name */
    public int f3323b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<f> f3324c;

    /* renamed from: d  reason: collision with root package name */
    public f f3325d;

    /* renamed from: e  reason: collision with root package name */
    public final e f3326e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3327f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3328g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3329h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3330i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3331j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3332k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3333l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f3334m;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f3335n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f3336o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f3337p;

    /* renamed from: q  reason: collision with root package name */
    public int f3338q;

    /* renamed from: r  reason: collision with root package name */
    public final PorterDuff.Mode f3339r;
    public final float s;

    /* renamed from: t  reason: collision with root package name */
    public final float f3340t;
    public final int u;

    /* renamed from: v  reason: collision with root package name */
    public int f3341v;

    /* renamed from: w  reason: collision with root package name */
    public final int f3342w;

    /* renamed from: x  reason: collision with root package name */
    public final int f3343x;

    /* renamed from: y  reason: collision with root package name */
    public final int f3344y;

    /* renamed from: z  reason: collision with root package name */
    public final int f3345z;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.e {
        public b() {
        }

        @Override // d1.b.e
        public final void a(d1.b bVar) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.P == bVar) {
                tabLayout.i();
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c<T extends f> {
        void a();

        void b();

        void c(T t5);
    }

    /* loaded from: classes.dex */
    public interface d extends c<f> {
    }

    /* loaded from: classes.dex */
    public class e extends LinearLayout {

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int f3348d = 0;

        /* renamed from: b  reason: collision with root package name */
        public ValueAnimator f3349b;

        public e(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i6) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.T != 0) {
                return;
            }
            View childAt = getChildAt(i6);
            com.google.android.material.tabs.a aVar = tabLayout.J;
            Drawable drawable = tabLayout.f3337p;
            aVar.getClass();
            RectF a6 = com.google.android.material.tabs.a.a(tabLayout, childAt);
            drawable.setBounds((int) a6.left, drawable.getBounds().top, (int) a6.right, drawable.getBounds().bottom);
            tabLayout.f3323b = i6;
        }

        public final void b(int i6) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.f3337p.getBounds();
            tabLayout.f3337p.setBounds(bounds.left, 0, bounds.right, i6);
            requestLayout();
        }

        public final void c(View view, View view2, float f6) {
            boolean z5;
            if (view != null && view.getWidth() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.J.b(tabLayout, view, view2, f6, tabLayout.f3337p);
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                Drawable drawable = tabLayout2.f3337p;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.f3337p.getBounds().bottom);
            }
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.k(this);
        }

        public final void d(int i6, int i7, boolean z5) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f3323b == i6) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i6);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f3323b = i6;
            com.google.android.material.tabs.b bVar = new com.google.android.material.tabs.b(this, childAt, childAt2);
            if (z5) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f3349b = valueAnimator;
                valueAnimator.setInterpolator(tabLayout.K);
                valueAnimator.setDuration(i7);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(bVar);
                valueAnimator.start();
                return;
            }
            this.f3349b.removeAllUpdateListeners();
            this.f3349b.addUpdateListener(bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void draw(android.graphics.Canvas r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r0.f3337p
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.height()
                if (r1 >= 0) goto L14
                android.graphics.drawable.Drawable r1 = r0.f3337p
                int r1 = r1.getIntrinsicHeight()
            L14:
                int r2 = r0.C
                if (r2 == 0) goto L33
                r3 = 1
                r4 = 2
                if (r2 == r3) goto L24
                r3 = 0
                if (r2 == r4) goto L3d
                r1 = 3
                if (r2 == r1) goto L39
                r1 = r3
                goto L3d
            L24:
                int r2 = r6.getHeight()
                int r2 = r2 - r1
                int r3 = r2 / 2
                int r2 = r6.getHeight()
                int r2 = r2 + r1
                int r1 = r2 / 2
                goto L3d
            L33:
                int r2 = r6.getHeight()
                int r3 = r2 - r1
            L39:
                int r1 = r6.getHeight()
            L3d:
                android.graphics.drawable.Drawable r2 = r0.f3337p
                android.graphics.Rect r2 = r2.getBounds()
                int r2 = r2.width()
                if (r2 <= 0) goto L5d
                android.graphics.drawable.Drawable r2 = r0.f3337p
                android.graphics.Rect r2 = r2.getBounds()
                android.graphics.drawable.Drawable r4 = r0.f3337p
                int r5 = r2.left
                int r2 = r2.right
                r4.setBounds(r5, r3, r2, r1)
                android.graphics.drawable.Drawable r0 = r0.f3337p
                r0.draw(r7)
            L5d:
                super.draw(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e.draw(android.graphics.Canvas):void");
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
            super.onLayout(z5, i6, i7, i8, i9);
            ValueAnimator valueAnimator = this.f3349b;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f3323b == -1) {
                tabLayout.f3323b = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.f3323b);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i6, int i7) {
            super.onMeasure(i6, i7);
            if (View.MeasureSpec.getMode(i6) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z5 = true;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                int childCount = getChildCount();
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() == 0) {
                        i8 = Math.max(i8, childAt.getMeasuredWidth());
                    }
                }
                if (i8 <= 0) {
                    return;
                }
                if (i8 * childCount <= getMeasuredWidth() - (((int) q.b(getContext(), 16)) * 2)) {
                    boolean z6 = false;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i10).getLayoutParams();
                        if (layoutParams.width != i8 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i8;
                            layoutParams.weight = 0.0f;
                            z6 = true;
                        }
                    }
                    z5 = z6;
                } else {
                    tabLayout.A = 0;
                    tabLayout.m(false);
                }
                if (z5) {
                    super.onMeasure(i6, i7);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i6) {
            super.onRtlPropertiesChanged(i6);
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f3351a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f3352b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f3353c;

        /* renamed from: e  reason: collision with root package name */
        public View f3355e;

        /* renamed from: g  reason: collision with root package name */
        public TabLayout f3357g;

        /* renamed from: h  reason: collision with root package name */
        public h f3358h;

        /* renamed from: d  reason: collision with root package name */
        public int f3354d = -1;

        /* renamed from: f  reason: collision with root package name */
        public final int f3356f = 1;

        /* renamed from: i  reason: collision with root package name */
        public int f3359i = -1;
    }

    /* loaded from: classes.dex */
    public static class g implements b.f {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f3360a;

        /* renamed from: b  reason: collision with root package name */
        public int f3361b;

        public g(TabLayout tabLayout) {
            this.f3360a = new WeakReference<>(tabLayout);
        }

        @Override // d1.b.f
        public final void a(int i6) {
            this.f3361b = i6;
            TabLayout tabLayout = this.f3360a.get();
            if (tabLayout != null) {
                tabLayout.T = this.f3361b;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class h extends LinearLayout {

        /* renamed from: m  reason: collision with root package name */
        public static final /* synthetic */ int f3362m = 0;

        /* renamed from: b  reason: collision with root package name */
        public f f3363b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f3364c;

        /* renamed from: d  reason: collision with root package name */
        public ImageView f3365d;

        /* renamed from: e  reason: collision with root package name */
        public View f3366e;

        /* renamed from: f  reason: collision with root package name */
        public j2.a f3367f;

        /* renamed from: g  reason: collision with root package name */
        public View f3368g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f3369h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f3370i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f3371j;

        /* renamed from: k  reason: collision with root package name */
        public int f3372k;

        public h(Context context) {
            super(context);
            this.f3372k = 2;
            f(context);
            int i6 = TabLayout.this.f3327f;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.e.k(this, i6, TabLayout.this.f3328g, TabLayout.this.f3329h, TabLayout.this.f3330i);
            setGravity(17);
            setOrientation(!TabLayout.this.E ? 1 : 0);
            setClickable(true);
            g0.k.d(this, b0.a.b(getContext(), 1002));
        }

        private j2.a getBadge() {
            return this.f3367f;
        }

        private j2.a getOrCreateBadge() {
            if (this.f3367f == null) {
                this.f3367f = new j2.a(getContext(), null);
            }
            c();
            j2.a aVar = this.f3367f;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a(View view) {
            boolean z5;
            if (this.f3367f != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                j2.a aVar = this.f3367f;
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.g(view, null);
                if (aVar.d() != null) {
                    aVar.d().setForeground(aVar);
                } else {
                    view.getOverlay().add(aVar);
                }
                this.f3366e = view;
            }
        }

        public final void b() {
            boolean z5;
            if (this.f3367f != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                return;
            }
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f3366e;
            if (view != null) {
                j2.a aVar = this.f3367f;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f3366e = null;
            }
        }

        public final void c() {
            boolean z5;
            f fVar;
            View view;
            f fVar2;
            if (this.f3367f != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                return;
            }
            if (this.f3368g == null) {
                View view2 = this.f3365d;
                if (view2 != null && (fVar2 = this.f3363b) != null && fVar2.f3351a != null) {
                    if (this.f3366e != view2) {
                        b();
                        view = this.f3365d;
                        a(view);
                        return;
                    }
                    d(view2);
                    return;
                }
                view2 = this.f3364c;
                if (view2 != null && (fVar = this.f3363b) != null && fVar.f3356f == 1) {
                    if (this.f3366e != view2) {
                        b();
                        view = this.f3364c;
                        a(view);
                        return;
                    }
                    d(view2);
                    return;
                }
            }
            b();
        }

        public final void d(View view) {
            boolean z5;
            j2.a aVar = this.f3367f;
            if (aVar != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && view == this.f3366e) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.g(view, null);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f3371j;
            boolean z5 = false;
            if (drawable != null && drawable.isStateful()) {
                z5 = false | this.f3371j.setState(drawableState);
            }
            if (z5) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            boolean z5;
            g();
            f fVar = this.f3363b;
            boolean z6 = false;
            if (fVar != null) {
                TabLayout tabLayout = fVar.f3357g;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    if (selectedTabPosition != -1 && selectedTabPosition == fVar.f3354d) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        z6 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        public final void f(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i6 = tabLayout.u;
            GradientDrawable gradientDrawable = null;
            if (i6 != 0) {
                Drawable a6 = e.a.a(context, i6);
                this.f3371j = a6;
                if (a6 != null && a6.isStateful()) {
                    this.f3371j.setState(getDrawableState());
                }
            } else {
                this.f3371j = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (tabLayout.f3336o != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a7 = e3.a.a(tabLayout.f3336o);
                boolean z5 = tabLayout.I;
                if (z5) {
                    gradientDrawable2 = null;
                }
                if (!z5) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(a7, gradientDrawable2, gradientDrawable);
            }
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.q(this, gradientDrawable2);
            tabLayout.invalidate();
        }

        public final void g() {
            View view;
            TextView textView;
            int i6;
            ViewParent parent;
            f fVar = this.f3363b;
            ImageView imageView = null;
            if (fVar != null) {
                view = fVar.f3355e;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f3368g;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f3368g);
                    }
                    addView(view);
                }
                this.f3368g = view;
                TextView textView2 = this.f3364c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                ImageView imageView2 = this.f3365d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f3365d.setImageDrawable(null);
                }
                TextView textView3 = (TextView) view.findViewById(16908308);
                this.f3369h = textView3;
                if (textView3 != null) {
                    this.f3372k = k.a.b(textView3);
                }
                imageView = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.f3368g;
                if (view3 != null) {
                    removeView(view3);
                    this.f3368g = null;
                }
                this.f3369h = null;
            }
            this.f3370i = imageView;
            if (this.f3368g == null) {
                if (this.f3365d == null) {
                    ImageView imageView3 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f3365d = imageView3;
                    addView(imageView3, 0);
                }
                if (this.f3364c == null) {
                    TextView textView4 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f3364c = textView4;
                    addView(textView4);
                    this.f3372k = k.a.b(this.f3364c);
                }
                TextView textView5 = this.f3364c;
                TabLayout tabLayout = TabLayout.this;
                textView5.setTextAppearance(tabLayout.f3331j);
                if (isSelected() && (i6 = tabLayout.f3333l) != -1) {
                    textView = this.f3364c;
                } else {
                    textView = this.f3364c;
                    i6 = tabLayout.f3332k;
                }
                textView.setTextAppearance(i6);
                ColorStateList colorStateList = tabLayout.f3334m;
                if (colorStateList != null) {
                    this.f3364c.setTextColor(colorStateList);
                }
                h(this.f3364c, this.f3365d, true);
                c();
                ImageView imageView4 = this.f3365d;
                if (imageView4 != null) {
                    imageView4.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, imageView4));
                }
                TextView textView6 = this.f3364c;
                if (textView6 != null) {
                    textView6.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, textView6));
                }
            } else {
                TextView textView7 = this.f3369h;
                if (textView7 != null || imageView != null) {
                    h(textView7, imageView, false);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f3353c)) {
                setContentDescription(fVar.f3353c);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f3364c, this.f3365d, this.f3368g};
            int i6 = 0;
            int i7 = 0;
            boolean z5 = false;
            for (int i8 = 0; i8 < 3; i8++) {
                View view = viewArr[i8];
                if (view != null && view.getVisibility() == 0) {
                    i7 = z5 ? Math.min(i7, view.getTop()) : view.getTop();
                    i6 = z5 ? Math.max(i6, view.getBottom()) : view.getBottom();
                    z5 = true;
                }
            }
            return i6 - i7;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f3364c, this.f3365d, this.f3368g};
            int i6 = 0;
            int i7 = 0;
            boolean z5 = false;
            for (int i8 = 0; i8 < 3; i8++) {
                View view = viewArr[i8];
                if (view != null && view.getVisibility() == 0) {
                    i7 = z5 ? Math.min(i7, view.getLeft()) : view.getLeft();
                    i6 = z5 ? Math.max(i6, view.getRight()) : view.getRight();
                    z5 = true;
                }
            }
            return i6 - i7;
        }

        public f getTab() {
            return this.f3363b;
        }

        public final void h(TextView textView, ImageView imageView, boolean z5) {
            Drawable drawable;
            CharSequence charSequence;
            int i6;
            CharSequence charSequence2;
            int i7;
            Drawable drawable2;
            f fVar = this.f3363b;
            CharSequence charSequence3 = null;
            if (fVar != null && (drawable2 = fVar.f3351a) != null) {
                drawable = drawable2.mutate();
            } else {
                drawable = null;
            }
            TabLayout tabLayout = TabLayout.this;
            if (drawable != null) {
                a.b.h(drawable, tabLayout.f3335n);
                PorterDuff.Mode mode = tabLayout.f3339r;
                if (mode != null) {
                    a.b.i(drawable, mode);
                }
            }
            f fVar2 = this.f3363b;
            if (fVar2 != null) {
                charSequence = fVar2.f3352b;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z6 = true;
            boolean z7 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!z7 || this.f3363b.f3356f != 1) {
                    z6 = false;
                }
                if (z7) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z6) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                textView.setVisibility(i7);
                if (z7) {
                    setVisibility(0);
                }
            } else {
                z6 = false;
            }
            if (z5 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z6 && imageView.getVisibility() == 0) {
                    i6 = (int) q.b(getContext(), 8);
                } else {
                    i6 = 0;
                }
                if (tabLayout.E) {
                    if (i6 != m.b(marginLayoutParams)) {
                        m.g(marginLayoutParams, i6);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i6 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i6;
                    m.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.f3363b;
            if (fVar3 != null) {
                charSequence3 = fVar3.f3353c;
            }
            if (!z7) {
                charSequence = charSequence3;
            }
            o1.a(this, charSequence);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            j2.a aVar = this.f3367f;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f3367f.c()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.c.a(0, 1, this.f3363b.f3354d, 1, isSelected()).f4111a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f4098e.f4106a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L28;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r3 = r2.getTabMaxWidth()
                if (r3 <= 0) goto L1c
                if (r1 == 0) goto L14
                if (r0 <= r3) goto L1c
            L14:
                int r8 = r2.f3341v
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L1c:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f3364c
                if (r0 == 0) goto L9d
                float r0 = r2.s
                int r1 = r7.f3372k
                android.widget.ImageView r3 = r7.f3365d
                r4 = 1
                if (r3 == 0) goto L34
                int r3 = r3.getVisibility()
                if (r3 != 0) goto L34
                r1 = r4
                goto L40
            L34:
                android.widget.TextView r3 = r7.f3364c
                if (r3 == 0) goto L40
                int r3 = r3.getLineCount()
                if (r3 <= r4) goto L40
                float r0 = r2.f3340t
            L40:
                android.widget.TextView r3 = r7.f3364c
                float r3 = r3.getTextSize()
                android.widget.TextView r5 = r7.f3364c
                int r5 = r5.getLineCount()
                android.widget.TextView r6 = r7.f3364c
                int r6 = j0.k.a.b(r6)
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 != 0) goto L5a
                if (r6 < 0) goto L9d
                if (r1 == r6) goto L9d
            L5a:
                int r2 = r2.D
                r6 = 0
                if (r2 != r4) goto L8e
                if (r3 <= 0) goto L8e
                if (r5 != r4) goto L8e
                android.widget.TextView r2 = r7.f3364c
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L8d
                float r3 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r3
                int r3 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r3 = r3 - r5
                int r5 = r7.getPaddingRight()
                int r3 = r3 - r5
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 <= 0) goto L8e
            L8d:
                r4 = r6
            L8e:
                if (r4 == 0) goto L9d
                android.widget.TextView r2 = r7.f3364c
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f3364c
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L9d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f3363b != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                f fVar = this.f3363b;
                TabLayout tabLayout = fVar.f3357g;
                if (tabLayout != null) {
                    tabLayout.j(fVar, true);
                    return true;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z5) {
            if (isSelected() != z5) {
            }
            super.setSelected(z5);
            TextView textView = this.f3364c;
            if (textView != null) {
                textView.setSelected(z5);
            }
            ImageView imageView = this.f3365d;
            if (imageView != null) {
                imageView.setSelected(z5);
            }
            View view = this.f3368g;
            if (view != null) {
                view.setSelected(z5);
            }
        }

        public void setTab(f fVar) {
            if (fVar != this.f3363b) {
                this.f3363b = fVar;
                e();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i implements d {

        /* renamed from: a  reason: collision with root package name */
        public final d1.b f3374a;

        public i(d1.b bVar) {
            this.f3374a = bVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c(f fVar) {
            this.f3374a.setCurrentItem(fVar.f3354d);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, R.attr.tabStyle, 2131952421), attributeSet, R.attr.tabStyle);
        int i6;
        this.f3323b = -1;
        this.f3324c = new ArrayList<>();
        this.f3333l = -1;
        this.f3338q = 0;
        this.f3341v = Integer.MAX_VALUE;
        this.G = -1;
        this.M = new ArrayList<>();
        this.U = new e0.e(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context2);
        this.f3326e = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d6 = n.d(context2, attributeSet, c.b.f2661f0, R.attr.tabStyle, 2131952421, 24);
        if (getBackground() instanceof ColorDrawable) {
            h3.f fVar = new h3.f();
            fVar.k(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            fVar.i(context2);
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            fVar.j(g0.i.i(this));
            g0.d.q(this, fVar);
        }
        setSelectedTabIndicator(d3.c.c(context2, d6, 5));
        setSelectedTabIndicatorColor(d6.getColor(8, 0));
        eVar.b(d6.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d6.getInt(10, 0));
        setTabIndicatorAnimationMode(d6.getInt(7, 0));
        setTabIndicatorFullWidth(d6.getBoolean(9, true));
        int dimensionPixelSize = d6.getDimensionPixelSize(16, 0);
        this.f3330i = dimensionPixelSize;
        this.f3329h = dimensionPixelSize;
        this.f3328g = dimensionPixelSize;
        this.f3327f = dimensionPixelSize;
        this.f3327f = d6.getDimensionPixelSize(19, dimensionPixelSize);
        this.f3328g = d6.getDimensionPixelSize(20, dimensionPixelSize);
        this.f3329h = d6.getDimensionPixelSize(18, dimensionPixelSize);
        this.f3330i = d6.getDimensionPixelSize(17, dimensionPixelSize);
        if (d3.b.b(context2, R.attr.isMaterial3Theme, false)) {
            i6 = R.attr.textAppearanceTitleSmall;
        } else {
            i6 = R.attr.textAppearanceButton;
        }
        this.f3331j = i6;
        int resourceId = d6.getResourceId(24, 2131952067);
        this.f3332k = resourceId;
        int[] iArr = c.b.f2689x;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.s = dimensionPixelSize2;
            this.f3334m = d3.c.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d6.hasValue(22)) {
                this.f3333l = d6.getResourceId(22, resourceId);
            }
            int i7 = this.f3333l;
            if (i7 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i7, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList a6 = d3.c.a(context2, obtainStyledAttributes, 3);
                    if (a6 != null) {
                        this.f3334m = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{a6.getColorForState(new int[]{16842913}, a6.getDefaultColor()), this.f3334m.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (d6.hasValue(25)) {
                this.f3334m = d3.c.a(context2, d6, 25);
            }
            if (d6.hasValue(23)) {
                this.f3334m = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d6.getColor(23, 0), this.f3334m.getDefaultColor()});
            }
            this.f3335n = d3.c.a(context2, d6, 3);
            this.f3339r = q.d(d6.getInt(4, -1), null);
            this.f3336o = d3.c.a(context2, d6, 21);
            this.B = d6.getInt(6, 300);
            this.K = a3.a.d(context2, R.attr.motionEasingEmphasizedInterpolator, h2.a.f4423b);
            this.f3342w = d6.getDimensionPixelSize(14, -1);
            this.f3343x = d6.getDimensionPixelSize(13, -1);
            this.u = d6.getResourceId(0, 0);
            this.f3345z = d6.getDimensionPixelSize(1, 0);
            this.D = d6.getInt(15, 1);
            this.A = d6.getInt(2, 0);
            this.E = d6.getBoolean(12, false);
            this.I = d6.getBoolean(26, false);
            d6.recycle();
            Resources resources = getResources();
            this.f3340t = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f3344y = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList<f> arrayList = this.f3324c;
        int size = arrayList.size();
        boolean z5 = false;
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                f fVar = arrayList.get(i6);
                if (fVar != null && fVar.f3351a != null && !TextUtils.isEmpty(fVar.f3352b)) {
                    z5 = true;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        if (z5 && !this.E) {
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i6 = this.f3342w;
        if (i6 != -1) {
            return i6;
        }
        int i7 = this.D;
        if (i7 == 0 || i7 == 2) {
            return this.f3344y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f3326e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i6) {
        e eVar = this.f3326e;
        int childCount = eVar.getChildCount();
        if (i6 < childCount) {
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = eVar.getChildAt(i7);
                if ((i7 != i6 || childAt.isSelected()) && (i7 == i6 || !childAt.isSelected())) {
                    childAt.setSelected(i7 == i6);
                    childAt.setActivated(i7 == i6);
                } else {
                    childAt.setSelected(i7 == i6);
                    childAt.setActivated(i7 == i6);
                    if (childAt instanceof h) {
                        ((h) childAt).g();
                    }
                }
                i7++;
            }
        }
    }

    public final void a(f fVar, boolean z5) {
        float f6;
        ArrayList<f> arrayList = this.f3324c;
        int size = arrayList.size();
        if (fVar.f3357g == this) {
            fVar.f3354d = size;
            arrayList.add(size, fVar);
            int size2 = arrayList.size();
            int i6 = -1;
            for (int i7 = size + 1; i7 < size2; i7++) {
                if (arrayList.get(i7).f3354d == this.f3323b) {
                    i6 = i7;
                }
                arrayList.get(i7).f3354d = i7;
            }
            this.f3323b = i6;
            h hVar = fVar.f3358h;
            hVar.setSelected(false);
            hVar.setActivated(false);
            int i8 = fVar.f3354d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.D == 1 && this.A == 0) {
                layoutParams.width = 0;
                f6 = 1.0f;
            } else {
                layoutParams.width = -2;
                f6 = 0.0f;
            }
            layoutParams.weight = f6;
            this.f3326e.addView(hVar, i8, layoutParams);
            if (z5) {
                TabLayout tabLayout = fVar.f3357g;
                if (tabLayout != null) {
                    tabLayout.j(fVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i6) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public final void b(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            f h6 = h();
            CharSequence charSequence = tabItem.f3320b;
            if (charSequence != null) {
                if (TextUtils.isEmpty(h6.f3353c) && !TextUtils.isEmpty(charSequence)) {
                    h6.f3358h.setContentDescription(charSequence);
                }
                h6.f3352b = charSequence;
                h hVar = h6.f3358h;
                if (hVar != null) {
                    hVar.e();
                }
            }
            Drawable drawable = tabItem.f3321c;
            if (drawable != null) {
                h6.f3351a = drawable;
                TabLayout tabLayout = h6.f3357g;
                if (tabLayout.A == 1 || tabLayout.D == 2) {
                    tabLayout.m(true);
                }
                h hVar2 = h6.f3358h;
                if (hVar2 != null) {
                    hVar2.e();
                }
            }
            int i6 = tabItem.f3322d;
            if (i6 != 0) {
                h6.f3355e = LayoutInflater.from(h6.f3358h.getContext()).inflate(i6, (ViewGroup) h6.f3358h, false);
                h hVar3 = h6.f3358h;
                if (hVar3 != null) {
                    hVar3.e();
                }
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                h6.f3353c = tabItem.getContentDescription();
                h hVar4 = h6.f3358h;
                if (hVar4 != null) {
                    hVar4.e();
                }
            }
            a(h6, this.f3324c.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void c(int i6) {
        boolean z5;
        if (i6 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            if (g0.g.c(this)) {
                e eVar = this.f3326e;
                int childCount = eVar.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 < childCount) {
                        if (eVar.getChildAt(i7).getWidth() <= 0) {
                            z5 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z5 = false;
                        break;
                    }
                }
                if (!z5) {
                    int scrollX = getScrollX();
                    int e6 = e(i6, 0.0f);
                    if (scrollX != e6) {
                        f();
                        this.O.setIntValues(scrollX, e6);
                        this.O.start();
                    }
                    ValueAnimator valueAnimator = eVar.f3349b;
                    if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f3323b != i6) {
                        eVar.f3349b.cancel();
                    }
                    eVar.d(i6, this.B, true);
                    return;
                }
            }
        }
        k(i6, 0.0f, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r0 != 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r5 = this;
            int r0 = r5.D
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r5.f3345z
            int r3 = r5.f3327f
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap<android.view.View, f0.r0> r3 = f0.g0.f3878a
            com.google.android.material.tabs.TabLayout$e r3 = r5.f3326e
            f0.g0.e.k(r3, r0, r2, r2, r2)
            int r0 = r5.D
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 == r4) goto L27
            if (r0 == r1) goto L27
            goto L4c
        L27:
            int r0 = r5.A
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            r3.setGravity(r4)
            goto L4c
        L34:
            int r0 = r5.A
            if (r0 == 0) goto L41
            if (r0 == r4) goto L3d
            if (r0 == r1) goto L46
            goto L4c
        L3d:
            r3.setGravity(r4)
            goto L4c
        L41:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L46:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L4c:
            r5.m(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(int i6, float f6) {
        e eVar;
        View childAt;
        View view;
        int i7 = this.D;
        int i8 = 0;
        if ((i7 != 0 && i7 != 2) || (childAt = (eVar = this.f3326e).getChildAt(i6)) == null) {
            return 0;
        }
        int i9 = i6 + 1;
        if (i9 < eVar.getChildCount()) {
            view = eVar.getChildAt(i9);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i8 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i10 = (int) ((width + i8) * 0.5f * f6);
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.e.d(this) == 0) {
            return left + i10;
        }
        return left - i10;
    }

    public final void f() {
        if (this.O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O = valueAnimator;
            valueAnimator.setInterpolator(this.K);
            this.O.setDuration(this.B);
            this.O.addUpdateListener(new a());
        }
    }

    public final f g(int i6) {
        if (i6 < 0 || i6 >= getTabCount()) {
            return null;
        }
        return this.f3324c.get(i6);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        f fVar = this.f3325d;
        if (fVar != null) {
            return fVar.f3354d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f3324c.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    public ColorStateList getTabIconTint() {
        return this.f3335n;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    public int getTabMaxWidth() {
        return this.f3341v;
    }

    public int getTabMode() {
        return this.D;
    }

    public ColorStateList getTabRippleColor() {
        return this.f3336o;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f3337p;
    }

    public ColorStateList getTabTextColors() {
        return this.f3334m;
    }

    public final f h() {
        h hVar;
        CharSequence charSequence;
        f fVar = (f) V.b();
        if (fVar == null) {
            fVar = new f();
        }
        fVar.f3357g = this;
        e0.e eVar = this.U;
        if (eVar != null) {
            hVar = (h) eVar.b();
        } else {
            hVar = null;
        }
        if (hVar == null) {
            hVar = new h(getContext());
        }
        hVar.setTab(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f3353c)) {
            charSequence = fVar.f3352b;
        } else {
            charSequence = fVar.f3353c;
        }
        hVar.setContentDescription(charSequence);
        fVar.f3358h = hVar;
        int i6 = fVar.f3359i;
        if (i6 != -1) {
            hVar.setId(i6);
        }
        return fVar;
    }

    public final void i() {
        e eVar = this.f3326e;
        for (int childCount = eVar.getChildCount() - 1; childCount >= 0; childCount--) {
            h hVar = (h) eVar.getChildAt(childCount);
            eVar.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.U.a(hVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.f3324c.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.f3357g = null;
            next.f3358h = null;
            next.f3351a = null;
            next.f3359i = -1;
            next.f3352b = null;
            next.f3353c = null;
            next.f3354d = -1;
            next.f3355e = null;
            V.a(next);
        }
        this.f3325d = null;
    }

    public final void j(f fVar, boolean z5) {
        int i6;
        f fVar2 = this.f3325d;
        ArrayList<c> arrayList = this.M;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a();
                }
                c(fVar.f3354d);
                return;
            }
            return;
        }
        if (fVar != null) {
            i6 = fVar.f3354d;
        } else {
            i6 = -1;
        }
        if (z5) {
            if ((fVar2 == null || fVar2.f3354d == -1) && i6 != -1) {
                k(i6, 0.0f, true, true);
            } else {
                c(i6);
            }
            if (i6 != -1) {
                setSelectedTabView(i6);
            }
        }
        this.f3325d = fVar;
        if (fVar2 != null && fVar2.f3357g != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).b();
            }
        }
        if (fVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).c(fVar);
            }
        }
    }

    public final void k(int i6, float f6, boolean z5, boolean z6) {
        int e6;
        float f7 = i6 + f6;
        int round = Math.round(f7);
        if (round >= 0) {
            e eVar = this.f3326e;
            if (round < eVar.getChildCount()) {
                if (z6) {
                    eVar.getClass();
                    TabLayout.this.f3323b = Math.round(f7);
                    ValueAnimator valueAnimator = eVar.f3349b;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        eVar.f3349b.cancel();
                    }
                    eVar.c(eVar.getChildAt(i6), eVar.getChildAt(i6 + 1), f6);
                }
                ValueAnimator valueAnimator2 = this.O;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.O.cancel();
                }
                if (i6 < 0) {
                    e6 = 0;
                } else {
                    e6 = e(i6, f6);
                }
                scrollTo(e6, 0);
                if (z5) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void l(d1.b bVar, boolean z5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        d1.b bVar2 = this.P;
        if (bVar2 != null) {
            g gVar = this.Q;
            if (gVar != null && (arrayList2 = bVar2.f3764r) != null) {
                arrayList2.remove(gVar);
            }
            b bVar3 = this.R;
            if (bVar3 != null && (arrayList = this.P.f3765t) != null) {
                arrayList.remove(bVar3);
            }
        }
        i iVar = this.N;
        ArrayList<c> arrayList3 = this.M;
        if (iVar != null) {
            arrayList3.remove(iVar);
            this.N = null;
        }
        if (bVar != null) {
            this.P = bVar;
            if (this.Q == null) {
                this.Q = new g(this);
            }
            g gVar2 = this.Q;
            gVar2.f3361b = 0;
            if (bVar.f3764r == null) {
                bVar.f3764r = new ArrayList();
            }
            bVar.f3764r.add(gVar2);
            i iVar2 = new i(bVar);
            this.N = iVar2;
            if (!arrayList3.contains(iVar2)) {
                arrayList3.add(iVar2);
            }
            bVar.getAdapter();
            if (this.R == null) {
                this.R = new b();
            }
            b bVar4 = this.R;
            bVar4.getClass();
            if (bVar.f3765t == null) {
                bVar.f3765t = new ArrayList();
            }
            bVar.f3765t.add(bVar4);
            k(bVar.getCurrentItem(), 0.0f, true, true);
        } else {
            this.P = null;
            i();
        }
        this.S = z5;
    }

    public final void m(boolean z5) {
        float f6;
        int i6 = 0;
        while (true) {
            e eVar = this.f3326e;
            if (i6 < eVar.getChildCount()) {
                View childAt = eVar.getChildAt(i6);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.D == 1 && this.A == 0) {
                    layoutParams.width = 0;
                    f6 = 1.0f;
                } else {
                    layoutParams.width = -2;
                    f6 = 0.0f;
                }
                layoutParams.weight = f6;
                if (z5) {
                    childAt.requestLayout();
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.activity.k.o(this);
        if (this.P == null) {
            ViewParent parent = getParent();
            if (parent instanceof d1.b) {
                l((d1.b) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.S) {
            setupWithViewPager(null);
            this.S = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h hVar;
        Drawable drawable;
        int i6 = 0;
        while (true) {
            e eVar = this.f3326e;
            if (i6 < eVar.getChildCount()) {
                View childAt = eVar.getChildAt(i6);
                if ((childAt instanceof h) && (drawable = (hVar = (h) childAt).f3371j) != null) {
                    drawable.setBounds(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
                    hVar.f3371j.draw(canvas);
                }
                i6++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(1, getTabCount(), 1).f4110a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        if (getTabMode() != 0 && getTabMode() != 2) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = z2.q.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f3343x
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = z2.q.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f3341v = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.D
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        if (motionEvent.getActionMasked() == 8) {
            if (getTabMode() != 0 && getTabMode() != 2) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        androidx.activity.k.n(this, f6);
    }

    public void setInlineLabel(boolean z5) {
        if (this.E != z5) {
            this.E = z5;
            int i6 = 0;
            while (true) {
                e eVar = this.f3326e;
                if (i6 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i6);
                    if (childAt instanceof h) {
                        h hVar = (h) childAt;
                        hVar.setOrientation(!TabLayout.this.E ? 1 : 0);
                        TextView textView = hVar.f3369h;
                        if (textView == null && hVar.f3370i == null) {
                            hVar.h(hVar.f3364c, hVar.f3365d, true);
                        } else {
                            hVar.h(textView, hVar.f3370i, false);
                        }
                    }
                    i6++;
                } else {
                    d();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i6) {
        setInlineLabel(getResources().getBoolean(i6));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.L;
        ArrayList<c> arrayList = this.M;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.L = cVar;
        if (cVar != null && !arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i6) {
        setSelectedTabIndicator(i6 != 0 ? e.a.a(getContext(), i6) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        boolean z5;
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f3337p = mutate;
        int i6 = this.f3338q;
        if (i6 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            a.b.g(mutate, i6);
        } else {
            a.b.h(mutate, null);
        }
        int i7 = this.G;
        if (i7 == -1) {
            i7 = this.f3337p.getIntrinsicHeight();
        }
        this.f3326e.b(i7);
    }

    public void setSelectedTabIndicatorColor(int i6) {
        boolean z5;
        this.f3338q = i6;
        Drawable drawable = this.f3337p;
        if (i6 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            a.b.g(drawable, i6);
        } else {
            a.b.h(drawable, null);
        }
        m(false);
    }

    public void setSelectedTabIndicatorGravity(int i6) {
        if (this.C != i6) {
            this.C = i6;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.k(this.f3326e);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i6) {
        this.G = i6;
        this.f3326e.b(i6);
    }

    public void setTabGravity(int i6) {
        if (this.A != i6) {
            this.A = i6;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f3335n != colorStateList) {
            this.f3335n = colorStateList;
            ArrayList<f> arrayList = this.f3324c;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                h hVar = arrayList.get(i6).f3358h;
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i6) {
        setTabIconTint(w.a.a(getContext(), i6));
    }

    public void setTabIndicatorAnimationMode(int i6) {
        com.google.android.material.tabs.a aVar;
        this.H = i6;
        if (i6 == 0) {
            aVar = new com.google.android.material.tabs.a();
        } else if (i6 == 1) {
            aVar = new l3.a();
        } else if (i6 != 2) {
            throw new IllegalArgumentException(i6 + " is not a valid TabIndicatorAnimationMode");
        } else {
            aVar = new l3.b();
        }
        this.J = aVar;
    }

    public void setTabIndicatorFullWidth(boolean z5) {
        this.F = z5;
        int i6 = e.f3348d;
        e eVar = this.f3326e;
        eVar.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.k(eVar);
    }

    public void setTabMode(int i6) {
        if (i6 != this.D) {
            this.D = i6;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f3336o != colorStateList) {
            this.f3336o = colorStateList;
            int i6 = 0;
            while (true) {
                e eVar = this.f3326e;
                if (i6 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i6);
                    if (childAt instanceof h) {
                        Context context = getContext();
                        int i7 = h.f3362m;
                        ((h) childAt).f(context);
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i6) {
        setTabRippleColor(w.a.a(getContext(), i6));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f3334m != colorStateList) {
            this.f3334m = colorStateList;
            ArrayList<f> arrayList = this.f3324c;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                h hVar = arrayList.get(i6).f3358h;
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(d1.a aVar) {
        i();
    }

    public void setUnboundedRipple(boolean z5) {
        if (this.I != z5) {
            this.I = z5;
            int i6 = 0;
            while (true) {
                e eVar = this.f3326e;
                if (i6 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i6);
                    if (childAt instanceof h) {
                        Context context = getContext();
                        int i7 = h.f3362m;
                        ((h) childAt).f(context);
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i6) {
        setUnboundedRipple(getResources().getBoolean(i6));
    }

    public void setupWithViewPager(d1.b bVar) {
        l(bVar, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
