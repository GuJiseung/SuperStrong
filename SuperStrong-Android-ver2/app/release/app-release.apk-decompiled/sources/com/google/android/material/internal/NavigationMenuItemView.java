package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.o1;
import androidx.appcompat.widget.t0;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import j0.k;
import java.util.WeakHashMap;
import x.f;
import z.a;
import z2.f;
/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements k.a {
    public static final int[] G = {16842912};
    public FrameLayout A;
    public h B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final a F;

    /* renamed from: w  reason: collision with root package name */
    public int f3266w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3267x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3268y;

    /* renamed from: z  reason: collision with root package name */
    public final CheckedTextView f3269z;

    /* loaded from: classes.dex */
    public class a extends f0.a {
        public a() {
        }

        @Override // f0.a
        public final void d(View view, g0.f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f3856a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f3268y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f3269z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        g0.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        int i6;
        t0.a aVar;
        int i7;
        StateListDrawable stateListDrawable;
        this.B = hVar;
        int i8 = hVar.f451a;
        if (i8 > 0) {
            setId(i8);
        }
        if (hVar.isVisible()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        setVisibility(i6);
        boolean z5 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.q(this, stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f455e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f467q);
        o1.a(this, hVar.f468r);
        h hVar2 = this.B;
        if (hVar2.f455e != null || hVar2.getIcon() != null || this.B.getActionView() == null) {
            z5 = false;
        }
        CheckedTextView checkedTextView = this.f3269z;
        if (z5) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                aVar = (t0.a) frameLayout.getLayoutParams();
                i7 = -1;
            } else {
                return;
            }
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.A;
            if (frameLayout2 != null) {
                aVar = (t0.a) frameLayout2.getLayoutParams();
                i7 = -2;
            } else {
                return;
            }
        }
        ((LinearLayout.LayoutParams) aVar).width = i7;
        this.A.setLayoutParams(aVar);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        h hVar = this.B;
        if (hVar != null && hVar.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
        if (this.f3268y != z5) {
            this.f3268y = z5;
            this.F.h(this.f3269z, 2048);
        }
    }

    public void setChecked(boolean z5) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f3269z;
        checkedTextView.setChecked(z5);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z5 ? 1 : 0);
    }

    public void setHorizontalPadding(int i6) {
        setPadding(i6, getPaddingTop(), i6, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.b.h(drawable, this.C);
            }
            int i6 = this.f3266w;
            drawable.setBounds(0, 0, i6, i6);
        } else if (this.f3267x) {
            if (this.E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = x.f.f6627a;
                Drawable a6 = f.a.a(resources, R.drawable.navigation_empty_icon, theme);
                this.E = a6;
                if (a6 != null) {
                    int i7 = this.f3266w;
                    a6.setBounds(0, 0, i7, i7);
                }
            }
            drawable = this.E;
        }
        k.b.e(this.f3269z, drawable, null, null, null);
    }

    public void setIconPadding(int i6) {
        this.f3269z.setCompoundDrawablePadding(i6);
    }

    public void setIconSize(int i6) {
        this.f3266w = i6;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        h hVar = this.B;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i6) {
        this.f3269z.setMaxLines(i6);
    }

    public void setNeedsEmptyIcon(boolean z5) {
        this.f3267x = z5;
    }

    public void setTextAppearance(int i6) {
        this.f3269z.setTextAppearance(i6);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3269z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3269z.setText(charSequence);
    }
}
