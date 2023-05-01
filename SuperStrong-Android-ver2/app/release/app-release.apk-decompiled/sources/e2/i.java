package e2;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f3829a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f3830b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f3831c;

    public i() {
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f3829a = cls;
        this.f3830b = cls2;
        this.f3831c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3829a.equals(iVar.f3829a) && this.f3830b.equals(iVar.f3830b) && j.a(this.f3831c, iVar.f3831c);
    }

    public final int hashCode() {
        int hashCode = (this.f3830b.hashCode() + (this.f3829a.hashCode() * 31)) * 31;
        Class<?> cls = this.f3831c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f3829a + ", second=" + this.f3830b + '}';
    }
}
