package h3;

import a1.f0;
/* loaded from: classes.dex */
public final class h extends f0 {

    /* renamed from: f  reason: collision with root package name */
    public final float f4487f;

    public h() {
        super(0);
        this.f4487f = -1.0f;
    }

    @Override // a1.f0
    public final void f(float f6, float f7, l lVar) {
        lVar.e(f7 * f6, 180.0f, 90.0f);
        float f8 = f7 * 2.0f * f6;
        lVar.a(0.0f, 0.0f, f8, f8, 180.0f, 90.0f);
    }
}
