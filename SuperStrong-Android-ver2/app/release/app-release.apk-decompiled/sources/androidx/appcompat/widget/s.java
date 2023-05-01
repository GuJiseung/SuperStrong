package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public class s extends RadioButton implements j0.m {

    /* renamed from: b  reason: collision with root package name */
    public final i f919b;

    /* renamed from: c  reason: collision with root package name */
    public final e f920c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f921d;

    /* renamed from: e  reason: collision with root package name */
    public l f922e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        g1.a(context);
        e1.a(this, getContext());
        i iVar = new i(this);
        this.f919b = iVar;
        iVar.b(attributeSet, R.attr.radioButtonStyle);
        e eVar = new e(this);
        this.f920c = eVar;
        eVar.d(attributeSet, R.attr.radioButtonStyle);
        c0 c0Var = new c0(this);
        this.f921d = c0Var;
        c0Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private l getEmojiTextViewHelper() {
        if (this.f922e == null) {
            this.f922e = new l(this);
        }
        return this.f922e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f920c;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f921d;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f919b;
        if (iVar != null) {
            iVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f920c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f920c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // j0.m
    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f919b;
        if (iVar != null) {
            return iVar.f791b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f919b;
        if (iVar != null) {
            return iVar.f792c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f921d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f921d.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f920c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f920c;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(e.a.a(getContext(), i6));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f919b;
        if (iVar != null) {
            if (iVar.f795f) {
                iVar.f795f = false;
                return;
            }
            iVar.f795f = true;
            iVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f921d;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f921d;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().c(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f835b.f5697a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f920c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f920c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // j0.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f919b;
        if (iVar != null) {
            iVar.f791b = colorStateList;
            iVar.f793d = true;
            iVar.a();
        }
    }

    @Override // j0.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f919b;
        if (iVar != null) {
            iVar.f792c = mode;
            iVar.f794e = true;
            iVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f921d;
        c0Var.l(colorStateList);
        c0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f921d;
        c0Var.m(mode);
        c0Var.b();
    }
}
