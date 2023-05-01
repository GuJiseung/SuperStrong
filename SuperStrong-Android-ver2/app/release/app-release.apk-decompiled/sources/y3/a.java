package y3;
/* loaded from: classes.dex */
public final class a {
    @r3.b("code")

    /* renamed from: a  reason: collision with root package name */
    public final String f6756a;

    public a(String str) {
        this.f6756a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && l4.f.a(this.f6756a, ((a) obj).f6756a);
    }

    public final int hashCode() {
        return this.f6756a.hashCode();
    }

    public final String toString() {
        return "AuthCode(code=" + this.f6756a + ')';
    }
}
