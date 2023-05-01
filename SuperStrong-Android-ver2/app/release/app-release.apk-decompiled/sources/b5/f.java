package b5;

import java.io.IOException;
/* loaded from: classes.dex */
public final class f extends w4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2522c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2523d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f2524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Object[] objArr, int i6, int i7) {
        super("OkHttp %s stream %d", objArr);
        this.f2524e = gVar;
        this.f2522c = i6;
        this.f2523d = i7;
    }

    @Override // w4.b
    public final void a() {
        g gVar = this.f2524e;
        try {
            gVar.f2544v.n(this.f2522c, this.f2523d);
        } catch (IOException e6) {
            gVar.c(2, 2, e6);
        }
    }
}
