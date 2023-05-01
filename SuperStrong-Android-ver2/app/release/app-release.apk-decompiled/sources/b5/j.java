package b5;

import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class j extends w4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2567c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f2568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, Object[] objArr, int i6, ArrayList arrayList, boolean z5) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f2568d = gVar;
        this.f2567c = i6;
    }

    @Override // w4.b
    public final void a() {
        this.f2568d.f2535k.getClass();
        try {
            this.f2568d.f2544v.n(this.f2567c, 6);
            synchronized (this.f2568d) {
                this.f2568d.f2546x.remove(Integer.valueOf(this.f2567c));
            }
        } catch (IOException unused) {
        }
    }
}
