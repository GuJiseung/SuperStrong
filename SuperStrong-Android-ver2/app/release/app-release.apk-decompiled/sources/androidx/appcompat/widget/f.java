package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public class f extends Button {

    /* renamed from: b  reason: collision with root package name */
    public final e f772b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f773c;

    /* renamed from: d  reason: collision with root package name */
    public l f774d;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        g1.a(context);
        e1.a(this, getContext());
        e eVar = new e(this);
        this.f772b = eVar;
        eVar.d(attributeSet, i6);
        c0 c0Var = new c0(this);
        this.f773c = c0Var;
        c0Var.f(attributeSet, i6);
        c0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i6);
    }

    private l getEmojiTextViewHelper() {
        if (this.f774d == null) {
            this.f774d = new l(this);
        }
        return this.f774d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f772b;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f773c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (s1.f935b) {
            return super.getAutoSizeMaxTextSize();
        }
        c0 c0Var = this.f773c;
        if (c0Var != null) {
            return Math.round(c0Var.f726i.f825e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (s1.f935b) {
            return super.getAutoSizeMinTextSize();
        }
        c0 c0Var = this.f773c;
        if (c0Var != null) {
            return Math.round(c0Var.f726i.f824d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (s1.f935b) {
            return super.getAutoSizeStepGranularity();
        }
        c0 c0Var = this.f773c;
        if (c0Var != null) {
            return Math.round(c0Var.f726i.f823c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (s1.f935b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        c0 c0Var = this.f773c;
        if (c0Var != null) {
            return c0Var.f726i.f826f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (s1.f935b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        c0 c0Var = this.f773c;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f726i.f821a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j0.k.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f772b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f772b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f773c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f773c.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        c0 c0Var = this.f773c;
        if (c0Var != null && !s1.f935b) {
            c0Var.f726i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        boolean z5;
        super.onTextChanged(charSequence, i6, i7, i8);
        boolean z6 = false;
        c0 c0Var = this.f773c;
        if (c0Var != null && !s1.f935b) {
            k0 k0Var = c0Var.f726i;
            if (k0Var.i() && k0Var.f821a != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                z6 = true;
            }
        }
        if (z6) {
            c0Var.f726i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i7, int i8, int i9) {
        if (s1.f935b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
            return;
        }
        c0 c0Var = this.f773c;
        if (c0Var != null) {
            c0Var.i(i6, i7, i8, i9);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (s1.f935b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
            return;
        }
        c0 c0Var = this.f773c;
        if (c0Var != null) {
            c0Var.j(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (s1.f935b) {
            super.setAutoSizeTextTypeWithDefaults(i6);
            return;
        }
        c0 c0Var = this.f773c;
        if (c0Var != null) {
            c0Var.k(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f772b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f772b;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j0.k.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().c(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f835b.f5697a.a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z5) {
        c0 c0Var = this.f773c;
        if (c0Var != null) {
            c0Var.f718a.setAllCaps(z5);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f772b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f772b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f773c;
        c0Var.l(colorStateList);
        c0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f773c;
        c0Var.m(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        c0 c0Var = this.f773c;
        if (c0Var != null) {
            c0Var.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f6) {
        boolean z5;
        boolean z6 = s1.f935b;
        if (z6) {
            super.setTextSize(i6, f6);
            return;
        }
        c0 c0Var = this.f773c;
        if (c0Var != null && !z6) {
            k0 k0Var = c0Var.f726i;
            if (k0Var.i() && k0Var.f821a != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                k0Var.f(i6, f6);
            }
        }
    }
}
