package q3;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class l extends n implements Iterable<n> {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5844b = new ArrayList();

    @Override // q3.n
    public final double a() {
        ArrayList arrayList = this.f5844b;
        if (arrayList.size() == 1) {
            return ((n) arrayList.get(0)).a();
        }
        throw new IllegalStateException();
    }

    @Override // q3.n
    public final String b() {
        ArrayList arrayList = this.f5844b;
        if (arrayList.size() == 1) {
            return ((n) arrayList.get(0)).b();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).f5844b.equals(this.f5844b));
    }

    public final int hashCode() {
        return this.f5844b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<n> iterator() {
        return this.f5844b.iterator();
    }
}
