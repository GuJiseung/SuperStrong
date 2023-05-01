package b3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.o1;
import com.superstrong.android.R;
import f0.b0;
import f0.g0;
import f0.r0;
import g0.f;
import java.util.WeakHashMap;
import w.a;
import z.a;
/* loaded from: classes.dex */
public abstract class a extends FrameLayout implements k.a {
    public static final int[] F = {16842912};
    public static final c G = new c();
    public static final d H = new d();
    public int A;
    public int B;
    public boolean C;
    public int D;
    public j2.a E;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2365b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f2366c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f2367d;

    /* renamed from: e  reason: collision with root package name */
    public int f2368e;

    /* renamed from: f  reason: collision with root package name */
    public int f2369f;

    /* renamed from: g  reason: collision with root package name */
    public float f2370g;

    /* renamed from: h  reason: collision with root package name */
    public float f2371h;

    /* renamed from: i  reason: collision with root package name */
    public float f2372i;

    /* renamed from: j  reason: collision with root package name */
    public int f2373j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2374k;

    /* renamed from: l  reason: collision with root package name */
    public final FrameLayout f2375l;

    /* renamed from: m  reason: collision with root package name */
    public final View f2376m;

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f2377n;

    /* renamed from: o  reason: collision with root package name */
    public final ViewGroup f2378o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f2379p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f2380q;

    /* renamed from: r  reason: collision with root package name */
    public int f2381r;
    public h s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f2382t;
    public Drawable u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f2383v;

    /* renamed from: w  reason: collision with root package name */
    public ValueAnimator f2384w;

    /* renamed from: x  reason: collision with root package name */
    public c f2385x;

    /* renamed from: y  reason: collision with root package name */
    public float f2386y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2387z;

    /* renamed from: b3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC0018a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f2388a;

        public View$OnLayoutChangeListenerC0018a(m2.a aVar) {
            this.f2388a = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
            boolean z5;
            a aVar = this.f2388a;
            if (aVar.f2377n.getVisibility() == 0) {
                j2.a aVar2 = aVar.E;
                if (aVar2 != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    Rect rect = new Rect();
                    ImageView imageView = aVar.f2377n;
                    imageView.getDrawingRect(rect);
                    aVar2.setBounds(rect);
                    aVar2.g(imageView, null);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f2389b;

        public b(int i6) {
            this.f2389b = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.g(this.f2389b);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public float a(float f6, float f7) {
            return 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // b3.a.c
        public final float a(float f6, float f7) {
            LinearInterpolator linearInterpolator = h2.a.f4422a;
            return (f6 * 0.6f) + 0.4f;
        }
    }

    public a(Context context) {
        super(context);
        this.f2365b = false;
        this.f2381r = -1;
        this.f2385x = G;
        this.f2386y = 0.0f;
        this.f2387z = false;
        this.A = 0;
        this.B = 0;
        this.C = false;
        this.D = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f2375l = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.f2376m = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.f2377n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.f2378o = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.f2379p = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.f2380q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f2368e = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f2369f = viewGroup.getPaddingBottom();
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.s(textView, 2);
        g0.d.s(textView2, 2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.f2370g = textSize - textSize2;
        this.f2371h = (textSize2 * 1.0f) / textSize;
        this.f2372i = (textSize * 1.0f) / textSize2;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0018a((m2.a) this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = r1
            goto L4c
        Lc:
            int[] r2 = c.b.f2663g0
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.a.d(android.widget.TextView, int):void");
    }

    public static void e(float f6, float f7, int i6, TextView textView) {
        textView.setScaleX(f6);
        textView.setScaleY(f7);
        textView.setVisibility(i6);
    }

    public static void f(View view, int i6, int i7) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i6;
        layoutParams.bottomMargin = i6;
        layoutParams.gravity = i7;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f2375l;
        return frameLayout != null ? frameLayout : this.f2377n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i6 = 0;
        for (int i7 = 0; i7 < indexOfChild; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i6++;
            }
        }
        return i6;
    }

    private int getSuggestedIconHeight() {
        j2.a aVar = this.E;
        int minimumHeight = aVar != null ? aVar.getMinimumHeight() / 2 : 0;
        return this.f2377n.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        j2.a aVar = this.E;
        if (aVar == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = aVar.getMinimumWidth() - this.E.f4689f.f4699b.f4715n.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int max = Math.max(minimumWidth, layoutParams.leftMargin);
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f2377n.getMeasuredWidth() + max;
    }

    public static void h(ViewGroup viewGroup, int i6) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i6);
    }

    public final void a() {
        Drawable drawable = this.f2367d;
        ColorStateList colorStateList = this.f2366c;
        FrameLayout frameLayout = this.f2375l;
        RippleDrawable rippleDrawable = null;
        boolean z5 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f2387z && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(e3.a.c(this.f2366c), null, activeIndicatorDrawable);
                z5 = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(e3.a.a(this.f2366c), null, null);
            }
        }
        if (frameLayout != null) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.q(frameLayout, rippleDrawable);
        }
        WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
        g0.d.q(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z5);
        }
    }

    public final void b(float f6, float f7) {
        float f8;
        float f9;
        View view = this.f2376m;
        if (view != null) {
            c cVar = this.f2385x;
            cVar.getClass();
            LinearInterpolator linearInterpolator = h2.a.f4422a;
            view.setScaleX((0.6f * f6) + 0.4f);
            view.setScaleY(cVar.a(f6, f7));
            int i6 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i6 == 0) {
                f8 = 0.8f;
            } else {
                f8 = 0.0f;
            }
            if (i6 == 0) {
                f9 = 1.0f;
            } else {
                f9 = 0.2f;
            }
            view.setAlpha(h2.a.a(0.0f, 1.0f, f8, f9, f6));
        }
        this.f2386y = f6;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        CharSequence charSequence;
        int i6;
        this.s = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.f455e);
        setId(hVar.f451a);
        if (!TextUtils.isEmpty(hVar.f467q)) {
            setContentDescription(hVar.f467q);
        }
        if (!TextUtils.isEmpty(hVar.f468r)) {
            charSequence = hVar.f468r;
        } else {
            charSequence = hVar.f455e;
        }
        o1.a(this, charSequence);
        if (hVar.isVisible()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        setVisibility(i6);
        this.f2365b = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f2375l;
        if (frameLayout != null && this.f2387z) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void g(int i6) {
        boolean z5;
        int i7;
        View view = this.f2376m;
        if (view == null) {
            return;
        }
        int min = Math.min(this.A, i6 - (this.D * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (this.C && this.f2373j == 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            i7 = min;
        } else {
            i7 = this.B;
        }
        layoutParams.height = i7;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f2376m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public j2.a getBadge() {
        return this.E;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.s;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f2381r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f2378o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f2378o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        h hVar = this.s;
        if (hVar != null && hVar.isCheckable() && this.s.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j2.a aVar = this.E;
        if (aVar != null && aVar.isVisible()) {
            h hVar = this.s;
            CharSequence charSequence = hVar.f455e;
            if (!TextUtils.isEmpty(hVar.f467q)) {
                charSequence = this.s.f467q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.E.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.c.a(0, 1, getItemVisiblePosition(), 1, isSelected()).f4111a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f4098e.f4106a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        post(new b(i6));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f2376m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        a();
    }

    public void setActiveIndicatorEnabled(boolean z5) {
        this.f2387z = z5;
        a();
        View view = this.f2376m;
        if (view != null) {
            view.setVisibility(z5 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i6) {
        this.B = i6;
        g(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i6) {
        this.D = i6;
        g(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z5) {
        this.C = z5;
    }

    public void setActiveIndicatorWidth(int i6) {
        this.A = i6;
        g(getWidth());
    }

    public void setBadge(j2.a aVar) {
        boolean z5;
        boolean z6;
        j2.a aVar2 = this.E;
        if (aVar2 == aVar) {
            return;
        }
        boolean z7 = true;
        if (aVar2 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        ImageView imageView = this.f2377n;
        if (z5 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.E != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                setClipChildren(true);
                setClipToPadding(true);
                j2.a aVar3 = this.E;
                if (aVar3 != null) {
                    if (aVar3.d() != null) {
                        aVar3.d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.E = null;
            }
        }
        this.E = aVar;
        if (imageView != null) {
            if (aVar == null) {
                z7 = false;
            }
            if (z7) {
                setClipChildren(false);
                setClipToPadding(false);
                j2.a aVar4 = this.E;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                aVar4.setBounds(rect);
                aVar4.g(imageView, null);
                if (aVar4.d() != null) {
                    aVar4.d().setForeground(aVar4);
                } else {
                    imageView.getOverlay().add(aVar4);
                }
            }
        }
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
        if (r13 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
        if (r13 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
        if (r13 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
        f(r2, r3, 49);
        h(r10, r12.f2369f);
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
        f(r2, r3, 17);
        h(r10, 0);
        r0.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
        r1.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
        if (r13 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fb, code lost:
        f(getIconOrContainer(), (int) (r12.f2368e + r12.f2370g), 49);
        e(1.0f, 1.0f, 0, r0);
        r0 = r12.f2371h;
        e(r0, r0, 4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0112, code lost:
        f(getIconOrContainer(), r12.f2368e, 49);
        r2 = r12.f2372i;
        e(r2, r2, 4, r0);
        e(1.0f, 1.0f, 0, r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.a.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        b0 b0Var;
        super.setEnabled(z5);
        this.f2379p.setEnabled(z5);
        this.f2380q.setEnabled(z5);
        this.f2377n.setEnabled(z5);
        if (z5) {
            b0Var = new b0(b0.a.b(getContext(), 1002));
        } else {
            b0Var = null;
        }
        g0.n(this, b0Var);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.u) {
            return;
        }
        this.u = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f2383v = drawable;
            ColorStateList colorStateList = this.f2382t;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }
        this.f2377n.setImageDrawable(drawable);
    }

    public void setIconSize(int i6) {
        ImageView imageView = this.f2377n;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i6;
        layoutParams.height = i6;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f2382t = colorStateList;
        if (this.s != null && (drawable = this.f2383v) != null) {
            a.b.h(drawable, colorStateList);
            this.f2383v.invalidateSelf();
        }
    }

    public void setItemBackground(int i6) {
        Drawable b6;
        if (i6 == 0) {
            b6 = null;
        } else {
            Context context = getContext();
            Object obj = w.a.f6573a;
            b6 = a.b.b(context, i6);
        }
        setItemBackground(b6);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f2367d = drawable;
        a();
    }

    public void setItemPaddingBottom(int i6) {
        if (this.f2369f != i6) {
            this.f2369f = i6;
            h hVar = this.s;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i6) {
        if (this.f2368e != i6) {
            this.f2368e = i6;
            h hVar = this.s;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i6) {
        this.f2381r = i6;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f2366c = colorStateList;
        a();
    }

    public void setLabelVisibilityMode(int i6) {
        boolean z5;
        c cVar;
        if (this.f2373j != i6) {
            this.f2373j = i6;
            if (this.C && i6 == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                cVar = H;
            } else {
                cVar = G;
            }
            this.f2385x = cVar;
            g(getWidth());
            h hVar = this.s;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z5) {
        if (this.f2374k != z5) {
            this.f2374k = z5;
            h hVar = this.s;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i6) {
        TextView textView = this.f2380q;
        d(textView, i6);
        float textSize = this.f2379p.getTextSize();
        float textSize2 = textView.getTextSize();
        this.f2370g = textSize - textSize2;
        this.f2371h = (textSize2 * 1.0f) / textSize;
        this.f2372i = (textSize * 1.0f) / textSize2;
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i6) {
        TextView textView = this.f2379p;
        d(textView, i6);
        float textSize = textView.getTextSize();
        float textSize2 = this.f2380q.getTextSize();
        this.f2370g = textSize - textSize2;
        this.f2371h = (textSize2 * 1.0f) / textSize;
        this.f2372i = (textSize * 1.0f) / textSize2;
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f2379p.setTextColor(colorStateList);
            this.f2380q.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f2379p.setText(charSequence);
        this.f2380q.setText(charSequence);
        h hVar = this.s;
        if (hVar == null || TextUtils.isEmpty(hVar.f467q)) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.s;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.f468r)) {
            charSequence = this.s.f468r;
        }
        o1.a(this, charSequence);
    }
}
