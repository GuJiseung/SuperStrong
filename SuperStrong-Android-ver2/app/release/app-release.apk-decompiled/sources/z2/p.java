package z2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f7001b;

    public p(EditText editText) {
        this.f7001b = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f7001b;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
