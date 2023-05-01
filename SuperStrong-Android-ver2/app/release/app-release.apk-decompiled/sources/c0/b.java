package c0;

import x.f;
import y.e;
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f2694b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2695c;

    public b(n nVar, int i6) {
        this.f2694b = nVar;
        this.f2695c = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((e.a) this.f2694b).f6732f;
        if (eVar != null) {
            eVar.c(this.f2695c);
        }
    }
}
