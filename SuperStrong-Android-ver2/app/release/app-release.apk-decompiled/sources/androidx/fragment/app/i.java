package androidx.fragment.app;

import androidx.fragment.app.v0;
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0.b f1496b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v0.b f1497c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f1498d;

    public i(v0.b bVar, v0.b bVar2, boolean z5, l.b bVar3) {
        this.f1496b = bVar;
        this.f1497c = bVar2;
        this.f1498d = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f1496b.f1660c;
        o oVar2 = this.f1497c.f1660c;
        l0 l0Var = j0.f1526a;
        if (this.f1498d) {
            oVar2.getClass();
        } else {
            oVar.getClass();
        }
    }
}
