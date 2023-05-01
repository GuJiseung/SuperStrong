package b5;

import b5.u;
import java.io.IOException;
/* loaded from: classes.dex */
public final class k extends w4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2569c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f5.e f2570d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f2571e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f2572f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, Object[] objArr, int i6, f5.e eVar, int i7, boolean z5) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f2572f = gVar;
        this.f2569c = i6;
        this.f2570d = eVar;
        this.f2571e = i7;
    }

    @Override // w4.b
    public final void a() {
        try {
            u.a aVar = this.f2572f.f2535k;
            f5.e eVar = this.f2570d;
            int i6 = this.f2571e;
            aVar.getClass();
            eVar.skip(i6);
            this.f2572f.f2544v.n(this.f2569c, 6);
            synchronized (this.f2572f) {
                this.f2572f.f2546x.remove(Integer.valueOf(this.f2569c));
            }
        } catch (IOException unused) {
        }
    }
}
