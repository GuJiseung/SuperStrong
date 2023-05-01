package androidx.fragment.app;

import androidx.fragment.app.v0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class t0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0.a f1646b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v0 f1647c;

    public t0(v0 v0Var, v0.a aVar) {
        this.f1647c = v0Var;
        this.f1646b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<v0.b> arrayList = this.f1647c.f1653b;
        v0.a aVar = this.f1646b;
        if (arrayList.contains(aVar)) {
            x0.a(aVar.f1658a, aVar.f1660c.F);
        }
    }
}
