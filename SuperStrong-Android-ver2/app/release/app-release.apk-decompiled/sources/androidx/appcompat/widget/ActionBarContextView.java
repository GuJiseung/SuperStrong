package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import com.superstrong.android.R;
import f0.g0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f520j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f521k;

    /* renamed from: l  reason: collision with root package name */
    public View f522l;

    /* renamed from: m  reason: collision with root package name */
    public View f523m;

    /* renamed from: n  reason: collision with root package name */
    public View f524n;

    /* renamed from: o  reason: collision with root package name */
    public LinearLayout f525o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f526p;

    /* renamed from: q  reason: collision with root package name */
    public TextView f527q;

    /* renamed from: r  reason: collision with root package name */
    public final int f528r;
    public final int s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f529t;
    public final int u;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g.a f530b;

        public a(g.a aVar) {
            this.f530b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f530b.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2658e, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = e.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        g0.d.q(this, drawable);
        this.f528r = obtainStyledAttributes.getResourceId(5, 0);
        this.s = obtainStyledAttributes.getResourceId(4, 0);
        this.f677f = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.u = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(g.a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f522l
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.u
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f522l = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r6.f522l
        L1e:
            r6.addView(r0)
        L21:
            android.view.View r0 = r6.f522l
            r2 = 2131296325(0x7f090045, float:1.8210563E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.f523m = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r7)
            r0.setOnClickListener(r2)
            androidx.appcompat.view.menu.f r7 = r7.e()
            androidx.appcompat.widget.c r0 = r6.f676e
            if (r0 == 0) goto L4e
            r0.d()
            androidx.appcompat.widget.c$a r0 = r0.f704v
            if (r0 == 0) goto L4e
            boolean r2 = r0.b()
            if (r2 == 0) goto L4e
            h.d r0 = r0.f485j
            r0.dismiss()
        L4e:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f676e = r0
            r2 = 1
            r0.f698n = r2
            r0.f699o = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            androidx.appcompat.widget.c r3 = r6.f676e
            android.content.Context r4 = r6.f674c
            r7.b(r3, r4)
            androidx.appcompat.widget.c r7 = r6.f676e
            androidx.appcompat.view.menu.k r3 = r7.f377i
            if (r3 != 0) goto L86
            android.view.LayoutInflater r4 = r7.f373e
            int r5 = r7.f375g
            android.view.View r1 = r4.inflate(r5, r6, r1)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.k) r1
            r7.f377i = r1
            androidx.appcompat.view.menu.f r4 = r7.f372d
            r1.b(r4)
            r7.i(r2)
        L86:
            androidx.appcompat.view.menu.k r1 = r7.f377i
            if (r3 == r1) goto L90
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L90:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f675d = r1
            java.util.WeakHashMap<android.view.View, f0.r0> r7 = f0.g0.f3878a
            r7 = 0
            f0.g0.d.q(r1, r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f675d
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.f(g.a):void");
    }

    public final void g() {
        if (this.f525o == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f525o = linearLayout;
            this.f526p = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f527q = (TextView) this.f525o.findViewById(R.id.action_bar_subtitle);
            int i6 = this.f528r;
            if (i6 != 0) {
                this.f526p.setTextAppearance(getContext(), i6);
            }
            int i7 = this.s;
            if (i7 != 0) {
                this.f527q.setTextAppearance(getContext(), i7);
            }
        }
        this.f526p.setText(this.f520j);
        this.f527q.setText(this.f521k);
        boolean z5 = !TextUtils.isEmpty(this.f520j);
        boolean z6 = !TextUtils.isEmpty(this.f521k);
        int i8 = 0;
        this.f527q.setVisibility(z6 ? 0 : 8);
        LinearLayout linearLayout2 = this.f525o;
        if (!z5 && !z6) {
            i8 = 8;
        }
        linearLayout2.setVisibility(i8);
        if (this.f525o.getParent() == null) {
            addView(this.f525o);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f521k;
    }

    public CharSequence getTitle() {
        return this.f520j;
    }

    public final void h() {
        removeAllViews();
        this.f524n = null;
        this.f675d = null;
        this.f676e = null;
        View view = this.f523m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f676e;
        if (cVar != null) {
            cVar.d();
            c.a aVar = this.f676e.f704v;
            if (aVar != null && aVar.b()) {
                aVar.f485j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        boolean a6 = s1.a(this);
        int paddingRight = a6 ? (i8 - i6) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
        View view = this.f522l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f522l.getLayoutParams();
            int i10 = a6 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i11 = a6 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i12 = a6 ? paddingRight - i10 : paddingRight + i10;
            int d6 = androidx.appcompat.widget.a.d(i12, paddingTop, paddingTop2, this.f522l, a6) + i12;
            paddingRight = a6 ? d6 - i11 : d6 + i11;
        }
        LinearLayout linearLayout = this.f525o;
        if (linearLayout != null && this.f524n == null && linearLayout.getVisibility() != 8) {
            paddingRight += androidx.appcompat.widget.a.d(paddingRight, paddingTop, paddingTop2, this.f525o, a6);
        }
        View view2 = this.f524n;
        if (view2 != null) {
            androidx.appcompat.widget.a.d(paddingRight, paddingTop, paddingTop2, view2, a6);
        }
        int paddingLeft = a6 ? getPaddingLeft() : (i8 - i6) - getPaddingRight();
        ActionMenuView actionMenuView = this.f675d;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a6);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        if (View.MeasureSpec.getMode(i6) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i7) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i6);
        int i8 = this.f677f;
        if (i8 <= 0) {
            i8 = View.MeasureSpec.getSize(i7);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i9 = i8 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        View view = this.f522l;
        if (view != null) {
            int c6 = androidx.appcompat.widget.a.c(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f522l.getLayoutParams();
            paddingLeft = c6 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f675d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = androidx.appcompat.widget.a.c(this.f675d, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f525o;
        if (linearLayout != null && this.f524n == null) {
            if (this.f529t) {
                this.f525o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f525o.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.f525o.setVisibility(z5 ? 0 : 8);
            } else {
                paddingLeft = androidx.appcompat.widget.a.c(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f524n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i10 >= 0) {
                paddingLeft = Math.min(i10, paddingLeft);
            }
            int i12 = layoutParams.height;
            int i13 = i12 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i12 >= 0) {
                i9 = Math.min(i12, i9);
            }
            this.f524n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i9, i13));
        }
        if (this.f677f <= 0) {
            int childCount = getChildCount();
            i8 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i8) {
                    i8 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i6) {
        this.f677f = i6;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f524n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f524n = view;
        if (view != null && (linearLayout = this.f525o) != null) {
            removeView(linearLayout);
            this.f525o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f521k = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f520j = charSequence;
        g();
        f0.g0.m(this, charSequence);
    }

    public void setTitleOptional(boolean z5) {
        if (z5 != this.f529t) {
            requestLayout();
        }
        this.f529t = z5;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i6) {
        super.setVisibility(i6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
