package d;

import android.window.OnBackInvokedCallback;
/* loaded from: classes.dex */
public final /* synthetic */ class l implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3648b;

    public /* synthetic */ l(int i6, Object obj) {
        this.f3647a = i6;
        this.f3648b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f3647a) {
            case 0:
                ((g) this.f3648b).O();
                return;
            default:
                ((Runnable) this.f3648b).run();
                return;
        }
    }
}
