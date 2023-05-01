package androidx.fragment.app;

import androidx.fragment.app.v0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class u0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0.a f1649b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v0 f1650c;

    public u0(v0 v0Var, v0.a aVar) {
        this.f1650c = v0Var;
        this.f1649b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v0 v0Var = this.f1650c;
        ArrayList<v0.b> arrayList = v0Var.f1653b;
        v0.a aVar = this.f1649b;
        arrayList.remove(aVar);
        v0Var.f1654c.remove(aVar);
    }
}
