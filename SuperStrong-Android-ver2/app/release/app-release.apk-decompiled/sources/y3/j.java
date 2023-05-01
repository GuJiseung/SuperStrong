package y3;
/* loaded from: classes.dex */
public final class j {
    @r3.b("e2e_req")

    /* renamed from: a  reason: collision with root package name */
    public final String f6791a;

    public j(String str) {
        this.f6791a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && l4.f.a(this.f6791a, ((j) obj).f6791a);
    }

    public final int hashCode() {
        return this.f6791a.hashCode();
    }

    public final String toString() {
        return "E2eReq(result=" + this.f6791a + ')';
    }
}
