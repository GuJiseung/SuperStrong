package h3;

import a1.f0;
/* loaded from: classes.dex */
public final class d extends f0 {

    /* renamed from: f  reason: collision with root package name */
    public final float f4444f;

    public d() {
        super(0);
        this.f4444f = -1.0f;
    }

    @Override // a1.f0
    public final void f(float f6, float f7, l lVar) {
        lVar.e(f7 * f6, 180.0f, 90.0f);
        double d6 = f7;
        double d7 = f6;
        lVar.d((float) (Math.sin(Math.toRadians(90.0f)) * d6 * d7), (float) (Math.sin(Math.toRadians(0.0f)) * d6 * d7));
    }
}
