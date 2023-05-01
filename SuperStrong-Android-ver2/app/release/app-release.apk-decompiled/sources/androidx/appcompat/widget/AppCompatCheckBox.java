package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements j0.m {

    /* renamed from: b  reason: collision with root package name */
    public final i f573b;

    /* renamed from: c  reason: collision with root package name */
    public final e f574c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f575d;

    /* renamed from: e  reason: collision with root package name */
    public l f576e;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        g1.a(context);
        e1.a(this, getContext());
        i iVar = new i(this);
        this.f573b = iVar;
        iVar.b(attributeSet, i6);
        e eVar = new e(this);
        this.f574c = eVar;
        eVar.d(attributeSet, i6);
        c0 c0Var = new c0(this);
        this.f575d = c0Var;
        c0Var.f(attributeSet, i6);
        getEmojiTextViewHelper().a(attributeSet, i6);
    }

    private l getEmojiTextViewHelper() {
        if (this.f576e == null) {
            this.f576e = new l(this);
        }
        return this.f576e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f574c;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f575d;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f573b;
        if (iVar != null) {
            iVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f574c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f574c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // j0.m
    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f573b;
        if (iVar != null) {
            return iVar.f791b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f573b;
        if (iVar != null) {
            return iVar.f792c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f575d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f575d.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f574c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f574c;
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
        i iVar = this.f573b;
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f575d;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f575d;
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
        e eVar = this.f574c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f574c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // j0.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f573b;
        if (iVar != null) {
            iVar.f791b = colorStateList;
            iVar.f793d = true;
            iVar.a();
        }
    }

    @Override // j0.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f573b;
        if (iVar != null) {
            iVar.f792c = mode;
            iVar.f794e = true;
            iVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f575d;
        c0Var.l(colorStateList);
        c0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f575d;
        c0Var.m(mode);
        c0Var.b();
    }
}
