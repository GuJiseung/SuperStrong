package androidx.fragment.app;

import androidx.fragment.app.v0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f1447b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v0.b f1448c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m f1449d;

    public d(m mVar, ArrayList arrayList, v0.b bVar) {
        this.f1449d = mVar;
        this.f1447b = arrayList;
        this.f1448c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f1447b;
        v0.b bVar = this.f1448c;
        if (list.contains(bVar)) {
            list.remove(bVar);
            this.f1449d.getClass();
            x0.a(bVar.f1658a, bVar.f1660c.F);
        }
    }
}
