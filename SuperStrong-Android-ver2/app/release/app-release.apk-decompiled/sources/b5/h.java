package b5;

import java.io.IOException;
/* loaded from: classes.dex */
public final class h extends w4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f2564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, Object... objArr) {
        super("OkHttp %s ping", objArr);
        this.f2564c = gVar;
    }

    @Override // w4.b
    public final void a() {
        g gVar = this.f2564c;
        gVar.getClass();
        try {
            gVar.f2544v.k(2, 0, false);
        } catch (IOException e6) {
            gVar.c(2, 2, e6);
        }
    }
}
