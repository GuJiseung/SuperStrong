package y3;
/* loaded from: classes.dex */
public final class r {
    @r3.b("id")

    /* renamed from: a  reason: collision with root package name */
    public final String f6813a;
    @r3.b("token")

    /* renamed from: b  reason: collision with root package name */
    public final String f6814b = "";
    @r3.b("pub_address")

    /* renamed from: c  reason: collision with root package name */
    public final String f6815c;
    @r3.b("gas")

    /* renamed from: d  reason: collision with root package name */
    public final double f6816d;
    @r3.b("coin_name")

    /* renamed from: e  reason: collision with root package name */
    public final String f6817e;
    @r3.b("amount")

    /* renamed from: f  reason: collision with root package name */
    public final double f6818f;

    public r(String str, String str2, double d6, String str3, double d7) {
        this.f6813a = str;
        this.f6815c = str2;
        this.f6816d = d6;
        this.f6817e = str3;
        this.f6818f = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return l4.f.a(this.f6813a, rVar.f6813a) && l4.f.a(this.f6814b, rVar.f6814b) && l4.f.a(this.f6815c, rVar.f6815c) && Double.compare(this.f6816d, rVar.f6816d) == 0 && l4.f.a(this.f6817e, rVar.f6817e) && Double.compare(this.f6818f, rVar.f6818f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6814b.hashCode();
        int hashCode2 = this.f6815c.hashCode();
        int hashCode3 = Double.hashCode(this.f6816d);
        int hashCode4 = this.f6817e.hashCode();
        return Double.hashCode(this.f6818f) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f6813a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PayInfo2(id=" + this.f6813a + ", token=" + this.f6814b + ", pub_address=" + this.f6815c + ", gas=" + this.f6816d + ", coin_name=" + this.f6817e + ", amount=" + this.f6818f + ')';
    }
}
