package s4;
/* loaded from: classes.dex */
public final class k0 implements q0 {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6073b;

    public k0(boolean z5) {
        this.f6073b = z5;
    }

    @Override // s4.q0
    public final boolean c() {
        return this.f6073b;
    }

    @Override // s4.q0
    public final b1 e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f6073b ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
