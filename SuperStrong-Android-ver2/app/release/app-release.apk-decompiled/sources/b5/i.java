package b5;

import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class i extends w4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2565c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f2566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, Object[] objArr, int i6, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f2566d = gVar;
        this.f2565c = i6;
    }

    @Override // w4.b
    public final void a() {
        this.f2566d.f2535k.getClass();
        try {
            this.f2566d.f2544v.n(this.f2565c, 6);
            synchronized (this.f2566d) {
                this.f2566d.f2546x.remove(Integer.valueOf(this.f2565c));
            }
        } catch (IOException unused) {
        }
    }
}
