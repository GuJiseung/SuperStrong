package y3;
/* loaded from: classes.dex */
public final class l {
    @r3.b("e2e_req")

    /* renamed from: a  reason: collision with root package name */
    public final String f6793a;

    public l(String str) {
        this.f6793a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && l4.f.a(this.f6793a, ((l) obj).f6793a);
    }

    public final int hashCode() {
        return this.f6793a.hashCode();
    }

    public final String toString() {
        return "EncryptedData(e2e_req=" + this.f6793a + ')';
    }
}
