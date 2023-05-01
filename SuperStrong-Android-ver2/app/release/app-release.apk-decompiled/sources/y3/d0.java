package y3;
/* loaded from: classes.dex */
public final class d0 {
    @r3.b("id")

    /* renamed from: a  reason: collision with root package name */
    public final String f6768a;
    @r3.b("pw")

    /* renamed from: b  reason: collision with root package name */
    public final String f6769b;

    public d0(String str, String str2) {
        this.f6768a = str;
        this.f6769b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return l4.f.a(this.f6768a, d0Var.f6768a) && l4.f.a(this.f6769b, d0Var.f6769b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6769b.hashCode() + (this.f6768a.hashCode() * 31);
    }

    public final String toString() {
        return "User(id=" + this.f6768a + ", pw=" + this.f6769b + ')';
    }
}
