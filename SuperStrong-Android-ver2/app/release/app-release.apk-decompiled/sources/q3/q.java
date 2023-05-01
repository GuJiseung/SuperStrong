package q3;
/* loaded from: classes.dex */
public final class q extends n {

    /* renamed from: b  reason: collision with root package name */
    public final s3.m<String, n> f5846b = new s3.m<>();

    public final n c(String str) {
        return this.f5846b.get(str);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof q) && ((q) obj).f5846b.equals(this.f5846b));
    }

    public final int hashCode() {
        return this.f5846b.hashCode();
    }
}
