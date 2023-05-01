package s4;
/* loaded from: classes.dex */
public class x0 extends z0 {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(u0 u0Var) {
        super(true);
        k kVar;
        z0 n5;
        k kVar2;
        boolean z5 = true;
        I(u0Var);
        j C = C();
        if (C instanceof k) {
            kVar = (k) C;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            n5 = null;
        } else {
            n5 = kVar.n();
        }
        if (n5 != null) {
            while (!n5.z()) {
                j C2 = n5.C();
                if (C2 instanceof k) {
                    kVar2 = (k) C2;
                } else {
                    kVar2 = null;
                }
                if (kVar2 == null) {
                    n5 = null;
                    continue;
                } else {
                    n5 = kVar2.n();
                    continue;
                }
                if (n5 == null) {
                    z5 = false;
                    break;
                }
            }
        } else {
            z5 = false;
            break;
        }
        this.f6111c = z5;
    }

    @Override // s4.z0
    public final boolean A() {
        return true;
    }

    @Override // s4.z0
    public final boolean z() {
        return this.f6111c;
    }
}
