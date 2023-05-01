package m3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class w extends p {

    /* renamed from: e  reason: collision with root package name */
    public final int f5352e;

    /* renamed from: f  reason: collision with root package name */
    public EditText f5353f;

    /* renamed from: g  reason: collision with root package name */
    public final c f5354g;

    public w(com.google.android.material.textfield.a aVar, int i6) {
        super(aVar);
        this.f5352e = R.drawable.design_password_eye;
        this.f5354g = new c(2, this);
        if (i6 != 0) {
            this.f5352e = i6;
        }
    }

    @Override // m3.p
    public final void b() {
        q();
    }

    @Override // m3.p
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // m3.p
    public final int d() {
        return this.f5352e;
    }

    @Override // m3.p
    public final View.OnClickListener f() {
        return this.f5354g;
    }

    @Override // m3.p
    public final boolean k() {
        return true;
    }

    @Override // m3.p
    public final boolean l() {
        EditText editText = this.f5353f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // m3.p
    public final void m(EditText editText) {
        this.f5353f = editText;
        q();
    }

    @Override // m3.p
    public final void r() {
        boolean z5;
        EditText editText = this.f5353f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            this.f5353f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // m3.p
    public final void s() {
        EditText editText = this.f5353f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
