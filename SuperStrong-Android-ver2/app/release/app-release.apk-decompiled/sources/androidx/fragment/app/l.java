package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.m;
import androidx.fragment.app.v0;
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m.c f1530b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v0.b f1531c;

    public l(m.c cVar, v0.b bVar) {
        this.f1530b = cVar;
        this.f1531c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1530b.a();
        if (a0.J(2)) {
            Log.v("FragmentManager", "Transition for operation " + this.f1531c + "has completed");
        }
    }
}
