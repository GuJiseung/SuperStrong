package v4;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class y extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f6567a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f5.h f6568b;

    public y(s sVar, f5.h hVar) {
        this.f6567a = sVar;
        this.f6568b = hVar;
    }

    @Override // v4.a0
    public final long a() {
        return this.f6568b.j();
    }

    @Override // v4.a0
    @Nullable
    public final s b() {
        return this.f6567a;
    }

    @Override // v4.a0
    public final void c(f5.f fVar) {
        fVar.g(this.f6568b);
    }
}
