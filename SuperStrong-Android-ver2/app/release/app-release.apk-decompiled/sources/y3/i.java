package y3;
/* loaded from: classes.dex */
public final class i {
    @r3.b("e2e_req")

    /* renamed from: a  reason: collision with root package name */
    public final String f6786a;
    @r3.b("token")

    /* renamed from: b  reason: collision with root package name */
    public final String f6787b;

    public i(String str, String str2) {
        l4.f.f(str2, "token");
        this.f6786a = str;
        this.f6787b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return l4.f.a(this.f6786a, iVar.f6786a) && l4.f.a(this.f6787b, iVar.f6787b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6787b.hashCode() + (this.f6786a.hashCode() * 31);
    }

    public final String toString() {
        return "E2eReq2(result=" + this.f6786a + ", token=" + this.f6787b + ')';
    }
}
