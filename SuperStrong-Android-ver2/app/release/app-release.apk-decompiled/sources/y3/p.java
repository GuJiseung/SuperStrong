package y3;
/* loaded from: classes.dex */
public final class p {
    @r3.b("pass")

    /* renamed from: a  reason: collision with root package name */
    public final String f6807a;

    public p(String str) {
        l4.f.f(str, "pass");
        this.f6807a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && l4.f.a(this.f6807a, ((p) obj).f6807a);
    }

    public final int hashCode() {
        return this.f6807a.hashCode();
    }

    public final String toString() {
        return "Password(pass=" + this.f6807a + ')';
    }
}
