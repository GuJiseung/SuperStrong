package y3;
/* loaded from: classes.dex */
public final class n {
    @r3.b("member_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f6796a;
    @r3.b("amount")

    /* renamed from: b  reason: collision with root package name */
    public final double f6797b;
    @r3.b("coin_name")

    /* renamed from: c  reason: collision with root package name */
    public final String f6798c;
    @r3.b("quote")

    /* renamed from: d  reason: collision with root package name */
    public final double f6799d;
    @r3.b("gas")

    /* renamed from: e  reason: collision with root package name */
    public final double f6800e;
    @r3.b("history_id")

    /* renamed from: f  reason: collision with root package name */
    public final int f6801f;
    @r3.b("interaction_id")

    /* renamed from: g  reason: collision with root package name */
    public final String f6802g;
    @r3.b("status")

    /* renamed from: h  reason: collision with root package name */
    public final String f6803h;
    @r3.b("date")

    /* renamed from: i  reason: collision with root package name */
    public final String f6804i;
    @r3.b("interaction_address")

    /* renamed from: j  reason: collision with root package name */
    public final String f6805j;

    public n() {
        this(0);
    }

    public n(int i6) {
        this.f6796a = "aaaaa";
        this.f6797b = -1.0d;
        this.f6798c = "none";
        this.f6799d = -1.0d;
        this.f6800e = -1.0d;
        this.f6801f = 3;
        this.f6802g = "SSS";
        this.f6803h = "NONE";
        this.f6804i = "NONE";
        this.f6805j = "NONE";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return l4.f.a(this.f6796a, nVar.f6796a) && Double.compare(this.f6797b, nVar.f6797b) == 0 && l4.f.a(this.f6798c, nVar.f6798c) && Double.compare(this.f6799d, nVar.f6799d) == 0 && Double.compare(this.f6800e, nVar.f6800e) == 0 && this.f6801f == nVar.f6801f && l4.f.a(this.f6802g, nVar.f6802g) && l4.f.a(this.f6803h, nVar.f6803h) && l4.f.a(this.f6804i, nVar.f6804i) && l4.f.a(this.f6805j, nVar.f6805j);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.f6797b);
        int hashCode2 = this.f6798c.hashCode();
        int hashCode3 = Double.hashCode(this.f6799d);
        int hashCode4 = Double.hashCode(this.f6800e);
        int hashCode5 = Integer.hashCode(this.f6801f);
        int hashCode6 = this.f6802g.hashCode();
        int hashCode7 = this.f6803h.hashCode();
        int hashCode8 = this.f6804i.hashCode();
        return this.f6805j.hashCode() + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f6796a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "History(id=" + this.f6796a + ", amount=" + this.f6797b + ", coin=" + this.f6798c + ", quote=" + this.f6799d + ", gas=" + this.f6800e + ", hid=" + this.f6801f + ", interID=" + this.f6802g + ", status=" + this.f6803h + ", date=" + this.f6804i + ", address=" + this.f6805j + ')';
    }
}
