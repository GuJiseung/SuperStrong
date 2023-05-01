package i1;

import i1.g;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: b  reason: collision with root package name */
    public final e2.b f4591b = new e2.b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        int i6 = 0;
        while (true) {
            e2.b bVar = this.f4591b;
            if (i6 < bVar.f5067d) {
                g gVar = (g) bVar.h(i6);
                V l5 = this.f4591b.l(i6);
                g.b<T> bVar2 = gVar.f4588b;
                if (gVar.f4590d == null) {
                    gVar.f4590d = gVar.f4589c.getBytes(f.f4585a);
                }
                bVar2.a(gVar.f4590d, l5, messageDigest);
                i6++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(g<T> gVar) {
        e2.b bVar = this.f4591b;
        if (bVar.containsKey(gVar)) {
            return (T) bVar.getOrDefault(gVar, null);
        }
        return gVar.f4587a;
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f4591b.equals(((h) obj).f4591b);
        }
        return false;
    }

    @Override // i1.f
    public final int hashCode() {
        return this.f4591b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f4591b + '}';
    }
}
