package y3;
/* loaded from: classes.dex */
public final class a0 {
    @r3.b("id")

    /* renamed from: a  reason: collision with root package name */
    public final String f6757a;
    @r3.b("pw")

    /* renamed from: b  reason: collision with root package name */
    public final String f6758b;
    @r3.b("email")

    /* renamed from: c  reason: collision with root package name */
    public final String f6759c;
    @r3.b("phone_num")

    /* renamed from: d  reason: collision with root package name */
    public final String f6760d;

    public a0(String str, String str2, String str3, String str4) {
        this.f6757a = str;
        this.f6758b = str2;
        this.f6759c = str3;
        this.f6760d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return l4.f.a(this.f6757a, a0Var.f6757a) && l4.f.a(this.f6758b, a0Var.f6758b) && l4.f.a(this.f6759c, a0Var.f6759c) && l4.f.a(this.f6760d, a0Var.f6760d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6758b.hashCode();
        int hashCode2 = this.f6759c.hashCode();
        return this.f6760d.hashCode() + ((hashCode2 + ((hashCode + (this.f6757a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SignUpRequestBody(id=" + this.f6757a + ", pw=" + this.f6758b + ", email=" + this.f6759c + ", phone_num=" + this.f6760d + ')';
    }
}
