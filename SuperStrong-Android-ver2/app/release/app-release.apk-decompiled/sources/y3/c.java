package y3;
/* loaded from: classes.dex */
public final class c {
    @r3.b("res")

    /* renamed from: a  reason: collision with root package name */
    public final int f6761a;
    @r3.b("eth")

    /* renamed from: b  reason: collision with root package name */
    public final double f6762b;
    @r3.b("doge")

    /* renamed from: c  reason: collision with root package name */
    public final double f6763c;
    @r3.b("btc")

    /* renamed from: d  reason: collision with root package name */
    public final double f6764d;

    public c(int i6, double d6, double d7, double d8) {
        this.f6761a = i6;
        this.f6762b = d6;
        this.f6763c = d7;
        this.f6764d = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f6761a == cVar.f6761a && Double.compare(this.f6762b, cVar.f6762b) == 0 && Double.compare(this.f6763c, cVar.f6763c) == 0 && Double.compare(this.f6764d, cVar.f6764d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.f6762b);
        int hashCode2 = Double.hashCode(this.f6763c);
        return Double.hashCode(this.f6764d) + ((hashCode2 + ((hashCode + (Integer.hashCode(this.f6761a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Balance(valid=" + this.f6761a + ", eth=" + this.f6762b + ", doge=" + this.f6763c + ", btc=" + this.f6764d + ')';
    }
}
