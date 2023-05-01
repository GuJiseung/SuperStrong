package y3;
/* loaded from: classes.dex */
public final class q {
    @r3.b("to_address")

    /* renamed from: a  reason: collision with root package name */
    public final String f6808a;
    @r3.b("send_amount")

    /* renamed from: b  reason: collision with root package name */
    public final double f6809b;
    @r3.b("coin_name")

    /* renamed from: c  reason: collision with root package name */
    public final String f6810c;
    @r3.b("token")

    /* renamed from: d  reason: collision with root package name */
    public final String f6811d = "";
    @r3.b("id")

    /* renamed from: e  reason: collision with root package name */
    public final String f6812e;

    public q(String str, double d6, String str2, String str3) {
        this.f6808a = str;
        this.f6809b = d6;
        this.f6810c = str2;
        this.f6812e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return l4.f.a(this.f6808a, qVar.f6808a) && Double.compare(this.f6809b, qVar.f6809b) == 0 && l4.f.a(this.f6810c, qVar.f6810c) && l4.f.a(this.f6811d, qVar.f6811d) && l4.f.a(this.f6812e, qVar.f6812e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.f6809b);
        int hashCode2 = this.f6810c.hashCode();
        int hashCode3 = this.f6811d.hashCode();
        return this.f6812e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f6808a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PayInfo1(to_address=" + this.f6808a + ", send_amount=" + this.f6809b + ", coin_name=" + this.f6810c + ", token=" + this.f6811d + ", id=" + this.f6812e + ')';
    }
}
