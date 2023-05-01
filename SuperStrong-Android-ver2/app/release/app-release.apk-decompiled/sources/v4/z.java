package v4;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class z extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6570b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ byte[] f6571c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f6569a = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6572d = 0;

    public z(int i6, byte[] bArr) {
        this.f6570b = i6;
        this.f6571c = bArr;
    }

    @Override // v4.a0
    public final long a() {
        return this.f6570b;
    }

    @Override // v4.a0
    @Nullable
    public final s b() {
        return this.f6569a;
    }

    @Override // v4.a0
    public final void c(f5.f fVar) {
        fVar.write(this.f6571c, this.f6572d, this.f6570b);
    }
}
