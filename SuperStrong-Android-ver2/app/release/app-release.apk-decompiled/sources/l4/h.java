package l4;
/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f5139a;

    public h(Class cls) {
        f.f(cls, "jClass");
        this.f5139a = cls;
    }

    @Override // l4.c
    public final Class<?> a() {
        return this.f5139a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (f.a(this.f5139a, ((h) obj).f5139a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5139a.hashCode();
    }

    public final String toString() {
        return this.f5139a.toString() + " (Kotlin reflection is not available)";
    }
}
