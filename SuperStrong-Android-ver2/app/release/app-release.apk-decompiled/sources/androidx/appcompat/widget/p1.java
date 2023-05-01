package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.superstrong.android.R;
import f0.g0;
import f0.m0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class p1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l  reason: collision with root package name */
    public static p1 f877l;

    /* renamed from: m  reason: collision with root package name */
    public static p1 f878m;

    /* renamed from: b  reason: collision with root package name */
    public final View f879b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f880c;

    /* renamed from: d  reason: collision with root package name */
    public final int f881d;

    /* renamed from: e  reason: collision with root package name */
    public final l1 f882e = new l1(1, this);

    /* renamed from: f  reason: collision with root package name */
    public final androidx.activity.b f883f = new androidx.activity.b(3, this);

    /* renamed from: g  reason: collision with root package name */
    public int f884g;

    /* renamed from: h  reason: collision with root package name */
    public int f885h;

    /* renamed from: i  reason: collision with root package name */
    public q1 f886i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f887j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f888k;

    public p1(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f879b = view;
        this.f880c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = f0.m0.f3905a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = m0.b.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f881d = scaledTouchSlop;
        this.f888k = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p1 p1Var) {
        p1 p1Var2 = f877l;
        if (p1Var2 != null) {
            p1Var2.f879b.removeCallbacks(p1Var2.f882e);
        }
        f877l = p1Var;
        if (p1Var != null) {
            p1Var.f879b.postDelayed(p1Var.f882e, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z5;
        p1 p1Var = f878m;
        View view = this.f879b;
        if (p1Var == this) {
            f878m = null;
            q1 q1Var = this.f886i;
            if (q1Var != null) {
                View view2 = q1Var.f909b;
                if (view2.getParent() != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    ((WindowManager) q1Var.f908a.getSystemService("window")).removeView(view2);
                }
                this.f886i = null;
                this.f888k = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f877l == this) {
            b(null);
        }
        view.removeCallbacks(this.f883f);
    }

    public final void c(boolean z5) {
        boolean z6;
        int height;
        int i6;
        int i7;
        String str;
        int i8;
        String str2;
        int i9;
        long longPressTimeout;
        long j5;
        long j6;
        boolean z7;
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        View view = this.f879b;
        if (!g0.g.b(view)) {
            return;
        }
        b(null);
        p1 p1Var = f878m;
        if (p1Var != null) {
            p1Var.a();
        }
        f878m = this;
        this.f887j = z5;
        q1 q1Var = new q1(view.getContext());
        this.f886i = q1Var;
        int i10 = this.f884g;
        int i11 = this.f885h;
        boolean z8 = this.f887j;
        View view2 = q1Var.f909b;
        if (view2.getParent() != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        Context context = q1Var.f908a;
        if (z6) {
            if (view2.getParent() != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
        }
        q1Var.f910c.setText(this.f880c);
        WindowManager.LayoutParams layoutParams = q1Var.f911d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i11 + dimensionPixelOffset2;
            i6 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i6 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z8) {
            i7 = R.dimen.tooltip_y_offset_touch;
        } else {
            i7 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i7);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            str2 = "window";
        } else {
            Rect rect = q1Var.f912e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i8 = 0;
            } else {
                Resources resources2 = context.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i9 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i9 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i8 = 0;
                rect.set(0, i9, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = q1Var.f914g;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = q1Var.f913f;
            view.getLocationOnScreen(iArr2);
            int i12 = iArr2[i8] - iArr[i8];
            iArr2[i8] = i12;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i12 + i10) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, i8);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i13 = iArr2[1];
            int i14 = ((i6 + i13) - dimensionPixelOffset3) - measuredHeight;
            int i15 = i13 + height + dimensionPixelOffset3;
            if (!z8 ? measuredHeight + i15 <= rect.height() : i14 < 0) {
                layoutParams.y = i15;
            } else {
                layoutParams.y = i14;
            }
            str2 = str;
        }
        ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.f887j) {
            j6 = 2500;
        } else {
            if ((g0.d.g(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j5 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j5 = 15000;
            }
            j6 = j5 - longPressTimeout;
        }
        androidx.activity.b bVar = this.f883f;
        view.removeCallbacks(bVar);
        view.postDelayed(bVar, j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.widget.q1 r5 = r4.f886i
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.f887j
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.f879b
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.f888k = r3
            r4.a()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            androidx.appcompat.widget.q1 r5 = r4.f886i
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.f888k
            if (r1 != 0) goto L69
            int r1 = r4.f884g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.f881d
            if (r1 > r2) goto L69
            int r1 = r4.f885h
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = r0
            goto L6f
        L69:
            r4.f884g = r5
            r4.f885h = r6
            r4.f888k = r0
        L6f:
            if (r3 == 0) goto L74
            b(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f884g = view.getWidth() / 2;
        this.f885h = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
