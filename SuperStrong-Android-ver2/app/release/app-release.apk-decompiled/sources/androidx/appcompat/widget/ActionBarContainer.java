package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.superstrong.android.R;
import f0.g0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f510b;

    /* renamed from: c  reason: collision with root package name */
    public c1 f511c;

    /* renamed from: d  reason: collision with root package name */
    public View f512d;

    /* renamed from: e  reason: collision with root package name */
    public View f513e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f514f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f515g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f516h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f517i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f518j;

    /* renamed from: k  reason: collision with root package name */
    public final int f519k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        g0.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2652b);
        boolean z5 = false;
        this.f514f = obtainStyledAttributes.getDrawable(0);
        this.f515g = obtainStyledAttributes.getDrawable(2);
        this.f519k = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f517i = true;
            this.f516h = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f517i ? !(this.f514f != null || this.f515g != null) : this.f516h == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f514f;
        if (drawable != null && drawable.isStateful()) {
            this.f514f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f515g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f515g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f516h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f516h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f511c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f514f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f515g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f516h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f512d = findViewById(R.id.action_bar);
        this.f513e = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f510b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z5, i6, i7, i8, i9);
        c1 c1Var = this.f511c;
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = (c1Var == null || c1Var.getVisibility() == 8) ? false : true;
        if (c1Var != null && c1Var.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i10 = ((FrameLayout.LayoutParams) c1Var.getLayoutParams()).bottomMargin;
            c1Var.layout(i6, (measuredHeight - c1Var.getMeasuredHeight()) - i10, i8, measuredHeight - i10);
        }
        if (this.f517i) {
            Drawable drawable3 = this.f516h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z6 = z7;
        } else {
            if (this.f514f != null) {
                if (this.f512d.getVisibility() == 0) {
                    drawable2 = this.f514f;
                    left = this.f512d.getLeft();
                    top = this.f512d.getTop();
                    right = this.f512d.getRight();
                    view = this.f512d;
                } else {
                    View view2 = this.f513e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f514f.setBounds(0, 0, 0, 0);
                        z7 = true;
                    } else {
                        drawable2 = this.f514f;
                        left = this.f513e.getLeft();
                        top = this.f513e.getTop();
                        right = this.f513e.getRight();
                        view = this.f513e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z7 = true;
            }
            this.f518j = z8;
            if (z8 && (drawable = this.f515g) != null) {
                drawable.setBounds(c1Var.getLeft(), c1Var.getTop(), c1Var.getRight(), c1Var.getBottom());
            }
            z6 = z7;
        }
        if (z6) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.f512d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L1c
            int r0 = r6.f519k
            if (r0 < 0) goto L1c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L1c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.f512d
            if (r7 != 0) goto L24
            return
        L24:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            androidx.appcompat.widget.c1 r0 = r6.f511c
            if (r0 == 0) goto L89
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L89
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L89
            android.view.View r0 = r6.f512d
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L4d
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L4d
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L4b
            goto L4d
        L4b:
            r0 = r4
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 != 0) goto L53
            android.view.View r0 = r6.f512d
            goto L69
        L53:
            android.view.View r0 = r6.f513e
            if (r0 == 0) goto L65
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L65
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L64
            goto L65
        L64:
            r3 = r4
        L65:
            if (r3 != 0) goto L6d
            android.view.View r0 = r6.f513e
        L69:
            int r4 = a(r0)
        L6d:
            if (r7 != r1) goto L74
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L77
        L74:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L77:
            int r8 = r6.getMeasuredWidth()
            androidx.appcompat.widget.c1 r0 = r6.f511c
            int r0 = a(r0)
            int r0 = r0 + r4
            int r7 = java.lang.Math.min(r0, r7)
            r6.setMeasuredDimension(r8, r7)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f514f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f514f);
        }
        this.f514f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f512d;
            if (view != null) {
                this.f514f.setBounds(view.getLeft(), this.f512d.getTop(), this.f512d.getRight(), this.f512d.getBottom());
            }
        }
        boolean z5 = true;
        if (!this.f517i ? this.f514f != null || this.f515g != null : this.f516h != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f516h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f516h);
        }
        this.f516h = drawable;
        boolean z5 = this.f517i;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z5 && (drawable2 = this.f516h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z5 ? !(this.f514f != null || this.f515g != null) : this.f516h == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z5;
        Drawable drawable2;
        Drawable drawable3 = this.f515g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f515g);
        }
        this.f515g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f518j && (drawable2 = this.f515g) != null) {
                drawable2.setBounds(this.f511c.getLeft(), this.f511c.getTop(), this.f511c.getRight(), this.f511c.getBottom());
            }
        }
        if (!this.f517i ? !(this.f514f != null || this.f515g != null) : this.f516h == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(c1 c1Var) {
        c1 c1Var2 = this.f511c;
        if (c1Var2 != null) {
            removeView(c1Var2);
        }
        this.f511c = c1Var;
        if (c1Var != null) {
            addView(c1Var);
            ViewGroup.LayoutParams layoutParams = c1Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c1Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z5) {
        this.f510b = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z5 = i6 == 0;
        Drawable drawable = this.f514f;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f515g;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f516h;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i6) {
        if (i6 != 0) {
            return super.startActionModeForChild(view, callback, i6);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f514f;
        boolean z5 = this.f517i;
        return (drawable == drawable2 && !z5) || (drawable == this.f515g && this.f518j) || ((drawable == this.f516h && z5) || super.verifyDrawable(drawable));
    }
}
