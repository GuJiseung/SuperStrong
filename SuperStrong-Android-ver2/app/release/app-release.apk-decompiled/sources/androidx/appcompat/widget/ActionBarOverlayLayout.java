package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.superstrong.android.R;
import d.g;
import f0.g0;
import f0.x0;
import java.util.WeakHashMap;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements n0, f0.u, f0.v {
    public static final int[] C = {R.attr.actionBarSize, 16842841};
    public final c A;
    public final f0.w B;

    /* renamed from: b  reason: collision with root package name */
    public int f531b;

    /* renamed from: c  reason: collision with root package name */
    public int f532c;

    /* renamed from: d  reason: collision with root package name */
    public ContentFrameLayout f533d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f534e;

    /* renamed from: f  reason: collision with root package name */
    public o0 f535f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f536g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f537h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f538i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f539j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f540k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f541l;

    /* renamed from: m  reason: collision with root package name */
    public int f542m;

    /* renamed from: n  reason: collision with root package name */
    public int f543n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f544o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f545p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f546q;

    /* renamed from: r  reason: collision with root package name */
    public f0.x0 f547r;
    public f0.x0 s;

    /* renamed from: t  reason: collision with root package name */
    public f0.x0 f548t;
    public f0.x0 u;

    /* renamed from: v  reason: collision with root package name */
    public d f549v;

    /* renamed from: w  reason: collision with root package name */
    public OverScroller f550w;

    /* renamed from: x  reason: collision with root package name */
    public ViewPropertyAnimator f551x;

    /* renamed from: y  reason: collision with root package name */
    public final a f552y;

    /* renamed from: z  reason: collision with root package name */
    public final b f553z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f551x = null;
            actionBarOverlayLayout.f541l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f551x = null;
            actionBarOverlayLayout.f541l = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.f551x = actionBarOverlayLayout.f534e.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f552y);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.f551x = actionBarOverlayLayout.f534e.animate().translationY(-actionBarOverlayLayout.f534e.getHeight()).setListener(actionBarOverlayLayout.f552y);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f532c = 0;
        this.f544o = new Rect();
        this.f545p = new Rect();
        this.f546q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        f0.x0 x0Var = f0.x0.f3920b;
        this.f547r = x0Var;
        this.s = x0Var;
        this.f548t = x0Var;
        this.u = x0Var;
        this.f552y = new a();
        this.f553z = new b();
        this.A = new c();
        r(context);
        this.B = new f0.w();
    }

    public static boolean p(FrameLayout frameLayout, Rect rect, boolean z5) {
        boolean z6;
        e eVar = (e) frameLayout.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i7 = rect.left;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i7;
            z6 = true;
        } else {
            z6 = false;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i9 = rect.top;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i9;
            z6 = true;
        }
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i11 = rect.right;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i11;
            z6 = true;
        }
        if (z5) {
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i13 = rect.bottom;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i13;
                return true;
            }
        }
        return z6;
    }

    @Override // androidx.appcompat.widget.n0
    public final boolean a() {
        s();
        return this.f535f.a();
    }

    @Override // f0.u
    public final void b(View view, View view2, int i6, int i7) {
        if (i7 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    @Override // androidx.appcompat.widget.n0
    public final void c() {
        s();
        this.f535f.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.n0
    public final boolean d() {
        s();
        return this.f535f.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i6;
        super.draw(canvas);
        if (this.f536g == null || this.f537h) {
            return;
        }
        if (this.f534e.getVisibility() == 0) {
            i6 = (int) (this.f534e.getTranslationY() + this.f534e.getBottom() + 0.5f);
        } else {
            i6 = 0;
        }
        this.f536g.setBounds(0, i6, getWidth(), this.f536g.getIntrinsicHeight() + i6);
        this.f536g.draw(canvas);
    }

    @Override // androidx.appcompat.widget.n0
    public final boolean e() {
        s();
        return this.f535f.e();
    }

    @Override // androidx.appcompat.widget.n0
    public final boolean f() {
        s();
        return this.f535f.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.n0
    public final void g(androidx.appcompat.view.menu.f fVar, g.b bVar) {
        s();
        this.f535f.g(fVar, bVar);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f534e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        f0.w wVar = this.B;
        return wVar.f3919b | wVar.f3918a;
    }

    public CharSequence getTitle() {
        s();
        return this.f535f.getTitle();
    }

    @Override // androidx.appcompat.widget.n0
    public final boolean h() {
        s();
        return this.f535f.h();
    }

    @Override // f0.u
    public final void i(View view, int i6) {
        if (i6 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // f0.u
    public final void j(View view, int i6, int i7, int[] iArr, int i8) {
        if (i8 == 0) {
            onNestedPreScroll(view, i6, i7, iArr);
        }
    }

    @Override // androidx.appcompat.widget.n0
    public final void k(int i6) {
        s();
        if (i6 == 2) {
            this.f535f.s();
        } else if (i6 == 5) {
            this.f535f.t();
        } else if (i6 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.n0
    public final void l() {
        s();
        this.f535f.i();
    }

    @Override // f0.v
    public final void m(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        n(view, i6, i7, i8, i9, i10);
    }

    @Override // f0.u
    public final void n(View view, int i6, int i7, int i8, int i9, int i10) {
        if (i10 == 0) {
            onNestedScroll(view, i6, i7, i8, i9);
        }
    }

    @Override // f0.u
    public final boolean o(View view, View view2, int i6, int i7) {
        return i7 == 0 && onStartNestedScroll(view, view2, i6);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        f0.x0 g2 = f0.x0.g(windowInsets, this);
        boolean p5 = p(this.f534e, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        Rect rect = this.f544o;
        g0.i.b(this, g2, rect);
        int i6 = rect.left;
        int i7 = rect.top;
        int i8 = rect.right;
        int i9 = rect.bottom;
        x0.k kVar = g2.f3921a;
        f0.x0 l5 = kVar.l(i6, i7, i8, i9);
        this.f547r = l5;
        boolean z5 = true;
        if (!this.s.equals(l5)) {
            this.s = this.f547r;
            p5 = true;
        }
        Rect rect2 = this.f545p;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z5 = p5;
        }
        if (z5) {
            requestLayout();
        }
        return kVar.a().f3921a.c().f3921a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        g0.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        boolean z5;
        int measuredHeight;
        x0.e bVar;
        f0.x0 b6;
        s();
        measureChildWithMargins(this.f534e, i6, 0, i7, 0);
        e eVar = (e) this.f534e.getLayoutParams();
        int max = Math.max(0, this.f534e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f534e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f534e.getMeasuredState());
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        if ((g0.d.g(this) & 256) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            measuredHeight = this.f531b;
            if (this.f539j && this.f534e.getTabContainer() != null) {
                measuredHeight += this.f531b;
            }
        } else {
            measuredHeight = this.f534e.getVisibility() != 8 ? this.f534e.getMeasuredHeight() : 0;
        }
        Rect rect = this.f544o;
        Rect rect2 = this.f546q;
        rect2.set(rect);
        f0.x0 x0Var = this.f547r;
        this.f548t = x0Var;
        if (!this.f538i && !z5) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            b6 = x0Var.f3921a.l(0, measuredHeight, 0, 0);
        } else {
            y.b a6 = y.b.a(x0Var.b(), this.f548t.d() + measuredHeight, this.f548t.c(), this.f548t.a() + 0);
            f0.x0 x0Var2 = this.f548t;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                bVar = new x0.d(x0Var2);
            } else if (i8 >= 29) {
                bVar = new x0.c(x0Var2);
            } else {
                bVar = new x0.b(x0Var2);
            }
            bVar.d(a6);
            b6 = bVar.b();
        }
        this.f548t = b6;
        p(this.f533d, rect2, true);
        if (!this.u.equals(this.f548t)) {
            f0.x0 x0Var3 = this.f548t;
            this.u = x0Var3;
            ContentFrameLayout contentFrameLayout = this.f533d;
            WindowInsets f6 = x0Var3.f();
            if (f6 != null) {
                WindowInsets a7 = g0.h.a(contentFrameLayout, f6);
                if (!a7.equals(f6)) {
                    f0.x0.g(a7, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f533d, i6, 0, i7, 0);
        e eVar2 = (e) this.f533d.getLayoutParams();
        int max3 = Math.max(max, this.f533d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f533d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f533d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i6, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i7, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        boolean z6 = false;
        if (!this.f540k || !z5) {
            return false;
        }
        this.f550w.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f550w.getFinalY() > this.f534e.getHeight()) {
            z6 = true;
        }
        if (z6) {
            q();
            this.A.run();
        } else {
            q();
            this.f553z.run();
        }
        this.f541l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        int i10 = this.f542m + i7;
        this.f542m = i10;
        setActionBarHideOffset(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        d.w wVar;
        g.g gVar;
        this.B.f3918a = i6;
        this.f542m = getActionBarHideOffset();
        q();
        d dVar = this.f549v;
        if (dVar != null && (gVar = (wVar = (d.w) dVar).f3710t) != null) {
            gVar.a();
            wVar.f3710t = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        if ((i6 & 2) == 0 || this.f534e.getVisibility() != 0) {
            return false;
        }
        return this.f540k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f540k && !this.f541l) {
            if (this.f542m <= this.f534e.getHeight()) {
                q();
                postDelayed(this.f553z, 600L);
                return;
            }
            q();
            postDelayed(this.A, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i6) {
        boolean z5;
        boolean z6;
        super.onWindowSystemUiVisibilityChanged(i6);
        s();
        int i7 = this.f543n ^ i6;
        this.f543n = i6;
        if ((i6 & 4) == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((i6 & 256) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        d dVar = this.f549v;
        if (dVar != null) {
            ((d.w) dVar).f3707p = !z6;
            if (!z5 && z6) {
                d.w wVar = (d.w) dVar;
                if (!wVar.f3708q) {
                    wVar.f3708q = true;
                    wVar.g(true);
                }
            } else {
                d.w wVar2 = (d.w) dVar;
                if (wVar2.f3708q) {
                    wVar2.f3708q = false;
                    wVar2.g(true);
                }
            }
        }
        if ((i7 & 256) != 0 && this.f549v != null) {
            WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
            g0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        this.f532c = i6;
        d dVar = this.f549v;
        if (dVar != null) {
            ((d.w) dVar).f3706o = i6;
        }
    }

    public final void q() {
        removeCallbacks(this.f553z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.f551x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f531b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f536g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f537h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f550w = new OverScroller(context);
    }

    public final void s() {
        o0 wrapper;
        if (this.f533d == null) {
            this.f533d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f534e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof o0) {
                wrapper = (o0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f535f = wrapper;
        }
    }

    public void setActionBarHideOffset(int i6) {
        q();
        this.f534e.setTranslationY(-Math.max(0, Math.min(i6, this.f534e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f549v = dVar;
        if (getWindowToken() != null) {
            ((d.w) this.f549v).f3706o = this.f532c;
            int i6 = this.f543n;
            if (i6 != 0) {
                onWindowSystemUiVisibilityChanged(i6);
                WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
                g0.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z5) {
        this.f539j = z5;
    }

    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.f540k) {
            this.f540k = z5;
            if (z5) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i6) {
        s();
        this.f535f.setIcon(i6);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f535f.setIcon(drawable);
    }

    public void setLogo(int i6) {
        s();
        this.f535f.p(i6);
    }

    public void setOverlayMode(boolean z5) {
        this.f538i = z5;
        this.f537h = z5 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i6) {
    }

    @Override // androidx.appcompat.widget.n0
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f535f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.n0
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f535f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
