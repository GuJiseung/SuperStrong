package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import h3.i;
import h3.m;
import j0.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import z.a;
import z2.n;
import z2.q;
/* loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, m {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f3001r = {16842911};
    public static final int[] s = {16842912};

    /* renamed from: e  reason: collision with root package name */
    public final o2.a f3002e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet<a> f3003f;

    /* renamed from: g  reason: collision with root package name */
    public b f3004g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f3005h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f3006i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f3007j;

    /* renamed from: k  reason: collision with root package name */
    public int f3008k;

    /* renamed from: l  reason: collision with root package name */
    public int f3009l;

    /* renamed from: m  reason: collision with root package name */
    public int f3010m;

    /* renamed from: n  reason: collision with root package name */
    public int f3011n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3012o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3013p;

    /* renamed from: q  reason: collision with root package name */
    public int f3014q;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends l0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public boolean f3015d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new c[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f3015d = parcel.readInt() == 1;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeInt(this.f3015d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, R.attr.materialButtonStyle, 2131952604), attributeSet, R.attr.materialButtonStyle);
        this.f3003f = new LinkedHashSet<>();
        this.f3012o = false;
        this.f3013p = false;
        Context context2 = getContext();
        TypedArray d6 = n.d(context2, attributeSet, c.b.N, R.attr.materialButtonStyle, 2131952604, new int[0]);
        this.f3011n = d6.getDimensionPixelSize(12, 0);
        this.f3005h = q.d(d6.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f3006i = d3.c.a(getContext(), d6, 14);
        this.f3007j = d3.c.c(getContext(), d6, 10);
        this.f3014q = d6.getInteger(11, 1);
        this.f3008k = d6.getDimensionPixelSize(13, 0);
        o2.a aVar = new o2.a(this, new i(i.b(context2, attributeSet, R.attr.materialButtonStyle, 2131952604)));
        this.f3002e = aVar;
        aVar.f5591c = d6.getDimensionPixelOffset(1, 0);
        aVar.f5592d = d6.getDimensionPixelOffset(2, 0);
        aVar.f5593e = d6.getDimensionPixelOffset(3, 0);
        aVar.f5594f = d6.getDimensionPixelOffset(4, 0);
        if (d6.hasValue(8)) {
            int dimensionPixelSize = d6.getDimensionPixelSize(8, -1);
            aVar.f5595g = dimensionPixelSize;
            aVar.c(aVar.f5590b.e(dimensionPixelSize));
            aVar.f5604p = true;
        }
        aVar.f5596h = d6.getDimensionPixelSize(20, 0);
        aVar.f5597i = q.d(d6.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f5598j = d3.c.a(getContext(), d6, 6);
        aVar.f5599k = d3.c.a(getContext(), d6, 19);
        aVar.f5600l = d3.c.a(getContext(), d6, 16);
        aVar.f5605q = d6.getBoolean(5, false);
        aVar.f5607t = d6.getDimensionPixelSize(9, 0);
        aVar.f5606r = d6.getBoolean(21, true);
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        int f6 = g0.e.f(this);
        int paddingTop = getPaddingTop();
        int e6 = g0.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d6.hasValue(0)) {
            aVar.f5603o = true;
            setSupportBackgroundTintList(aVar.f5598j);
            setSupportBackgroundTintMode(aVar.f5597i);
        } else {
            aVar.e();
        }
        g0.e.k(this, f6 + aVar.f5591c, paddingTop + aVar.f5593e, e6 + aVar.f5592d, paddingBottom + aVar.f5594f);
        d6.recycle();
        setCompoundDrawablePadding(this.f3011n);
        c(this.f3007j != null);
    }

    private String getA11yClassName() {
        boolean z5;
        Class cls;
        o2.a aVar = this.f3002e;
        if (aVar != null && aVar.f5605q) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f6 = 0.0f;
        for (int i6 = 0; i6 < lineCount; i6++) {
            f6 = Math.max(f6, getLayout().getLineWidth(i6));
        }
        return (int) Math.ceil(f6);
    }

    public final boolean a() {
        o2.a aVar = this.f3002e;
        if (aVar != null && !aVar.f5603o) {
            return true;
        }
        return false;
    }

    public final void b() {
        boolean z5;
        boolean z6;
        int i6 = this.f3014q;
        boolean z7 = false;
        if (i6 != 1 && i6 != 2) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            k.b.e(this, this.f3007j, null, null, null);
            return;
        }
        if (i6 != 3 && i6 != 4) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            k.b.e(this, null, null, this.f3007j, null);
            return;
        }
        if (i6 == 16 || i6 == 32) {
            z7 = true;
        }
        if (z7) {
            k.b.e(this, null, this.f3007j, null, null);
        }
    }

    public final void c(boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        Drawable drawable = this.f3007j;
        boolean z9 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f3007j = mutate;
            a.b.h(mutate, this.f3006i);
            PorterDuff.Mode mode = this.f3005h;
            if (mode != null) {
                a.b.i(this.f3007j, mode);
            }
            int i6 = this.f3008k;
            if (i6 == 0) {
                i6 = this.f3007j.getIntrinsicWidth();
            }
            int i7 = this.f3008k;
            if (i7 == 0) {
                i7 = this.f3007j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3007j;
            int i8 = this.f3009l;
            int i9 = this.f3010m;
            drawable2.setBounds(i8, i9, i6 + i8, i7 + i9);
            this.f3007j.setVisible(true, z5);
        }
        if (z5) {
            b();
            return;
        }
        Drawable[] a6 = k.b.a(this);
        Drawable drawable3 = a6[0];
        Drawable drawable4 = a6[1];
        Drawable drawable5 = a6[2];
        int i10 = this.f3014q;
        if (i10 != 1 && i10 != 2) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!z6 || drawable3 == this.f3007j) {
            if (i10 != 3 && i10 != 4) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (!z7 || drawable5 == this.f3007j) {
                if (i10 != 16 && i10 != 32) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (!z8 || drawable4 == this.f3007j) {
                    z9 = false;
                }
            }
        }
        if (z9) {
            b();
        }
    }

    public final void d(int i6, int i7) {
        boolean z5;
        boolean z6;
        boolean z7;
        if (this.f3007j != null && getLayout() != null) {
            int i8 = this.f3014q;
            boolean z8 = true;
            if (i8 != 1 && i8 != 2) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                if (i8 != 3 && i8 != 4) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (!z7) {
                    if (i8 != 16 && i8 != 32) {
                        z8 = false;
                    }
                    if (z8) {
                        this.f3009l = 0;
                        if (i8 == 16) {
                            this.f3010m = 0;
                            c(false);
                        }
                        int i9 = this.f3008k;
                        if (i9 == 0) {
                            i9 = this.f3007j.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i7 - getTextHeight()) - getPaddingTop()) - i9) - this.f3011n) - getPaddingBottom()) / 2);
                        if (this.f3010m != max) {
                            this.f3010m = max;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f3010m = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i10 = this.f3014q;
            if (i10 != 1 && i10 != 3 && ((i10 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i10 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i11 = this.f3008k;
                if (i11 == 0) {
                    i11 = this.f3007j.getIntrinsicWidth();
                }
                int textLayoutWidth = i6 - getTextLayoutWidth();
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                int e6 = (((textLayoutWidth - g0.e.e(this)) - i11) - this.f3011n) - g0.e.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e6 /= 2;
                }
                if (g0.e.d(this) == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (this.f3014q != 4) {
                    z8 = false;
                }
                if (z6 != z8) {
                    e6 = -e6;
                }
                if (this.f3009l != e6) {
                    this.f3009l = e6;
                    c(false);
                    return;
                }
                return;
            }
            this.f3009l = 0;
            c(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f3002e.f5595g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3007j;
    }

    public int getIconGravity() {
        return this.f3014q;
    }

    public int getIconPadding() {
        return this.f3011n;
    }

    public int getIconSize() {
        return this.f3008k;
    }

    public ColorStateList getIconTint() {
        return this.f3006i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3005h;
    }

    public int getInsetBottom() {
        return this.f3002e.f5594f;
    }

    public int getInsetTop() {
        return this.f3002e.f5593e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f3002e.f5600l;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        if (a()) {
            return this.f3002e.f5590b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f3002e.f5599k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f3002e.f5596h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f3002e.f5598j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f3002e.f5597i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3012o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            androidx.activity.k.p(this, this.f3002e.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        boolean z5;
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        o2.a aVar = this.f3002e;
        if (aVar != null && aVar.f5605q) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            View.mergeDrawableStates(onCreateDrawableState, f3001r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z5;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        o2.a aVar = this.f3002e;
        if (aVar != null && aVar.f5605q) {
            z5 = true;
        } else {
            z5 = false;
        }
        accessibilityNodeInfo.setCheckable(z5);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f5073b);
        setChecked(cVar.f3015d);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f3015d = this.f3012o;
        return cVar;
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f3002e.f5606r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f3007j != null) {
            if (this.f3007j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        if (a()) {
            o2.a aVar = this.f3002e;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i6);
                return;
            }
            return;
        }
        super.setBackgroundColor(i6);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                o2.a aVar = this.f3002e;
                aVar.f5603o = true;
                ColorStateList colorStateList = aVar.f5598j;
                MaterialButton materialButton = aVar.f5589a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(aVar.f5597i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i6) {
        setBackgroundDrawable(i6 != 0 ? e.a.a(getContext(), i6) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z5) {
        if (a()) {
            this.f3002e.f5605q = z5;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        boolean z6;
        o2.a aVar = this.f3002e;
        if (aVar != null && aVar.f5605q) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 && isEnabled() && this.f3012o != z5) {
            this.f3012o = z5;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z7 = this.f3012o;
                if (!materialButtonToggleGroup.f3022g) {
                    materialButtonToggleGroup.b(getId(), z7);
                }
            }
            if (this.f3013p) {
                return;
            }
            this.f3013p = true;
            Iterator<a> it = this.f3003f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f3013p = false;
        }
    }

    public void setCornerRadius(int i6) {
        if (a()) {
            o2.a aVar = this.f3002e;
            if (!aVar.f5604p || aVar.f5595g != i6) {
                aVar.f5595g = i6;
                aVar.f5604p = true;
                aVar.c(aVar.f5590b.e(i6));
            }
        }
    }

    public void setCornerRadiusResource(int i6) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (a()) {
            this.f3002e.b(false).j(f6);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3007j != drawable) {
            this.f3007j = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i6) {
        if (this.f3014q != i6) {
            this.f3014q = i6;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i6) {
        if (this.f3011n != i6) {
            this.f3011n = i6;
            setCompoundDrawablePadding(i6);
        }
    }

    public void setIconResource(int i6) {
        setIcon(i6 != 0 ? e.a.a(getContext(), i6) : null);
    }

    public void setIconSize(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f3008k != i6) {
            this.f3008k = i6;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3006i != colorStateList) {
            this.f3006i = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3005h != mode) {
            this.f3005h = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i6) {
        setIconTint(w.a.a(getContext(), i6));
    }

    public void setInsetBottom(int i6) {
        o2.a aVar = this.f3002e;
        aVar.d(aVar.f5593e, i6);
    }

    public void setInsetTop(int i6) {
        o2.a aVar = this.f3002e;
        aVar.d(i6, aVar.f5594f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f3004g = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        b bVar = this.f3004g;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z5);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            o2.a aVar = this.f3002e;
            if (aVar.f5600l != colorStateList) {
                aVar.f5600l = colorStateList;
                MaterialButton materialButton = aVar.f5589a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(e3.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i6) {
        if (a()) {
            setRippleColor(w.a.a(getContext(), i6));
        }
    }

    @Override // h3.m
    public void setShapeAppearanceModel(i iVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f3002e.c(iVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z5) {
        if (a()) {
            o2.a aVar = this.f3002e;
            aVar.f5602n = z5;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            o2.a aVar = this.f3002e;
            if (aVar.f5599k != colorStateList) {
                aVar.f5599k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i6) {
        if (a()) {
            setStrokeColor(w.a.a(getContext(), i6));
        }
    }

    public void setStrokeWidth(int i6) {
        if (a()) {
            o2.a aVar = this.f3002e;
            if (aVar.f5596h != i6) {
                aVar.f5596h = i6;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i6) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            o2.a aVar = this.f3002e;
            if (aVar.f5598j != colorStateList) {
                aVar.f5598j = colorStateList;
                if (aVar.b(false) != null) {
                    a.b.h(aVar.b(false), aVar.f5598j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            o2.a aVar = this.f3002e;
            if (aVar.f5597i != mode) {
                aVar.f5597i = mode;
                if (aVar.b(false) != null && aVar.f5597i != null) {
                    a.b.i(aVar.b(false), aVar.f5597i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i6) {
        super.setTextAlignment(i6);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z5) {
        this.f3002e.f5606r = z5;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3012o);
    }
}
