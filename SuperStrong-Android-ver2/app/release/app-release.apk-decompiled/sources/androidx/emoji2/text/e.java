package androidx.emoji2.text;

import androidx.emoji2.text.f;
/* loaded from: classes.dex */
public final class e extends f.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.a f1315a;

    public e(f.a aVar) {
        this.f1315a = aVar;
    }

    @Override // androidx.emoji2.text.f.h
    public final void a(Throwable th) {
        this.f1315a.f1328a.d(th);
    }

    @Override // androidx.emoji2.text.f.h
    public final void b(n nVar) {
        f.a aVar = this.f1315a;
        aVar.f1327c = nVar;
        aVar.f1326b = new j(aVar.f1327c, new f.i(), aVar.f1328a.f1325h);
        aVar.f1328a.e();
    }
}
