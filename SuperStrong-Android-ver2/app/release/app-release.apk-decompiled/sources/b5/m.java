package b5;

import b5.g;
import java.io.IOException;
/* loaded from: classes.dex */
public final class m extends w4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f2575c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g.f f2576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g.f fVar, Object[] objArr, r rVar) {
        super("OkHttp %s stream %d", objArr);
        this.f2576d = fVar;
        this.f2575c = rVar;
    }

    @Override // w4.b
    public final void a() {
        r rVar = this.f2575c;
        g.f fVar = this.f2576d;
        try {
            g.this.f2527c.b(rVar);
        } catch (IOException e6) {
            c5.f fVar2 = c5.f.f2787a;
            fVar2.m(4, "Http2Connection.Listener failure for " + g.this.f2529e, e6);
            try {
                rVar.c(2, e6);
            } catch (IOException unused) {
            }
        }
    }
}
