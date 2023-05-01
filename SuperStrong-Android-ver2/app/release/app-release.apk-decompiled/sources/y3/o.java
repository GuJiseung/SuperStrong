package y3;
/* loaded from: classes.dex */
public final class o {
    @r3.b("id")

    /* renamed from: a  reason: collision with root package name */
    public final String f6806a;

    public o(String str) {
        l4.f.f(str, "id");
        this.f6806a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && l4.f.a(this.f6806a, ((o) obj).f6806a);
    }

    public final int hashCode() {
        return this.f6806a.hashCode();
    }

    public final String toString() {
        return "Id(id=" + this.f6806a + ')';
    }
}
