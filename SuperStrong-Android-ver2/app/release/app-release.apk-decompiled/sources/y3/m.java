package y3;
/* loaded from: classes.dex */
public final class m {
    @r3.b("e2e_req")

    /* renamed from: a  reason: collision with root package name */
    public final String f6794a;
    @r3.b("token")

    /* renamed from: b  reason: collision with root package name */
    public final String f6795b;

    public m(String str, String str2) {
        this.f6794a = str;
        this.f6795b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return l4.f.a(this.f6794a, mVar.f6794a) && l4.f.a(this.f6795b, mVar.f6795b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6795b.hashCode() + (this.f6794a.hashCode() * 31);
    }

    public final String toString() {
        return "EncryptedPayment(e2e_req=" + this.f6794a + ", token=" + this.f6795b + ')';
    }
}
