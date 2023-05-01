package v;

import android.app.Application;
import v.e;
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Application f6246b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.a f6247c;

    public c(Application application, e.a aVar) {
        this.f6246b = application;
        this.f6247c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6246b.unregisterActivityLifecycleCallbacks(this.f6247c);
    }
}
