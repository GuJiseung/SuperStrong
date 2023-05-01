package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public class m extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public final e f838b;

    /* renamed from: c  reason: collision with root package name */
    public final n f839c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f840d;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        g1.a(context);
        this.f840d = false;
        e1.a(this, getContext());
        e eVar = new e(this);
        this.f838b = eVar;
        eVar.d(attributeSet, i6);
        n nVar = new n(this);
        this.f839c = nVar;
        nVar.b(attributeSet, i6);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f838b;
        if (eVar != null) {
            eVar.a();
        }
        n nVar = this.f839c;
        if (nVar != null) {
            nVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f838b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f838b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        h1 h1Var;
        n nVar = this.f839c;
        if (nVar == null || (h1Var = nVar.f847b) == null) {
            return null;
        }
        return h1Var.f786a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        h1 h1Var;
        n nVar = this.f839c;
        if (nVar == null || (h1Var = nVar.f847b) == null) {
            return null;
        }
        return h1Var.f787b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.f839c.f846a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f838b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f838b;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f839c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        n nVar = this.f839c;
        if (nVar != null && drawable != null && !this.f840d) {
            nVar.f848c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (nVar != null) {
            nVar.a();
            if (!this.f840d) {
                ImageView imageView = nVar.f846a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(nVar.f848c);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i6) {
        super.setImageLevel(i6);
        this.f840d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        Drawable drawable;
        n nVar = this.f839c;
        ImageView imageView = nVar.f846a;
        if (i6 != 0) {
            drawable = e.a.a(imageView.getContext(), i6);
            if (drawable != null) {
                p0.a(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        nVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f839c;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f838b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f838b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f839c;
        if (nVar != null) {
            if (nVar.f847b == null) {
                nVar.f847b = new h1();
            }
            h1 h1Var = nVar.f847b;
            h1Var.f786a = colorStateList;
            h1Var.f789d = true;
            nVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f839c;
        if (nVar != null) {
            if (nVar.f847b == null) {
                nVar.f847b = new h1();
            }
            h1 h1Var = nVar.f847b;
            h1Var.f787b = mode;
            h1Var.f788c = true;
            nVar.a();
        }
    }
}
