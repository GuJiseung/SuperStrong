package m3;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f5307a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.material.textfield.a f5308b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f5309c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f5310d;

    public p(com.google.android.material.textfield.a aVar) {
        this.f5307a = aVar.f3447b;
        this.f5308b = aVar;
        this.f5309c = aVar.getContext();
        this.f5310d = aVar.f3453h;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public g0.d h() {
        return null;
    }

    public boolean i(int i6) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof o;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(g0.f fVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z5) {
    }

    public final void q() {
        this.f5308b.e(false);
    }

    public void r() {
    }

    public void s() {
    }
}
