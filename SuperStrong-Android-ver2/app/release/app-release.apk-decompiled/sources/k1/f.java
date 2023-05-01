package k1;

import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class f implements i1.f {

    /* renamed from: b  reason: collision with root package name */
    public final i1.f f4766b;

    /* renamed from: c  reason: collision with root package name */
    public final i1.f f4767c;

    public f(i1.f fVar, i1.f fVar2) {
        this.f4766b = fVar;
        this.f4767c = fVar2;
    }

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        this.f4766b.b(messageDigest);
        this.f4767c.b(messageDigest);
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f4766b.equals(fVar.f4766b) && this.f4767c.equals(fVar.f4767c);
        }
        return false;
    }

    @Override // i1.f
    public final int hashCode() {
        return this.f4767c.hashCode() + (this.f4766b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f4766b + ", signature=" + this.f4767c + '}';
    }
}
