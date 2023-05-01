package c0;

import android.os.Handler;
import c0.k;
import y.e;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final n f2696a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2697b;

    public c(e.a aVar, Handler handler) {
        this.f2696a = aVar;
        this.f2697b = handler;
    }

    public final void a(k.a aVar) {
        boolean z5;
        int i6 = aVar.f2720b;
        if (i6 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Handler handler = this.f2697b;
        n nVar = this.f2696a;
        if (z5) {
            handler.post(new a(nVar, aVar.f2719a));
        } else {
            handler.post(new b(nVar, i6));
        }
    }
}
