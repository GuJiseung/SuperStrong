package d;

import android.view.View;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class k extends c.a {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ g f3646n;

    public k(g gVar) {
        this.f3646n = gVar;
    }

    @Override // f0.s0
    public final void a() {
        g gVar = this.f3646n;
        gVar.f3604w.setAlpha(1.0f);
        gVar.f3607z.d(null);
        gVar.f3607z = null;
    }

    @Override // c.a, f0.s0
    public final void c() {
        g gVar = this.f3646n;
        gVar.f3604w.setVisibility(0);
        if (gVar.f3604w.getParent() instanceof View) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.h.c((View) gVar.f3604w.getParent());
        }
    }
}
