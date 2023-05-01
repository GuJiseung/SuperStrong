package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
/* loaded from: classes.dex */
public final class m1 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final h.a f844b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n1 f845c;

    public m1(n1 n1Var) {
        this.f845c = n1Var;
        this.f844b = new h.a(n1Var.f849a.getContext(), n1Var.f857i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n1 n1Var = this.f845c;
        Window.Callback callback = n1Var.f860l;
        if (callback == null || !n1Var.f861m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f844b);
    }
}
