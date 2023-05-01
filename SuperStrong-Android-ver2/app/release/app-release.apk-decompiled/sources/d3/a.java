package d3;

import android.graphics.Typeface;
/* loaded from: classes.dex */
public final class a extends androidx.activity.result.c {

    /* renamed from: c  reason: collision with root package name */
    public final Typeface f3775c;

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0034a f3776d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3777e;

    /* renamed from: d3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0034a {
    }

    public a(z2.b bVar, Typeface typeface) {
        this.f3775c = typeface;
        this.f3776d = bVar;
    }

    @Override // androidx.activity.result.c
    public final void w(int i6) {
        if (!this.f3777e) {
            z2.c cVar = ((z2.b) this.f3776d).f6933a;
            if (cVar.j(this.f3775c)) {
                cVar.h(false);
            }
        }
    }

    @Override // androidx.activity.result.c
    public final void x(Typeface typeface, boolean z5) {
        if (!this.f3777e) {
            z2.c cVar = ((z2.b) this.f3776d).f6933a;
            if (cVar.j(typeface)) {
                cVar.h(false);
            }
        }
    }
}
