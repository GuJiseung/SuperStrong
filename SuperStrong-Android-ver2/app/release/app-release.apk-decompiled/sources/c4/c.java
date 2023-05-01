package c4;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class c<A, B> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final A f2755b;

    /* renamed from: c  reason: collision with root package name */
    public final B f2756c;

    public c(A a6, B b6) {
        this.f2755b = a6;
        this.f2756c = b6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return l4.f.a(this.f2755b, cVar.f2755b) && l4.f.a(this.f2756c, cVar.f2756c);
        }
        return false;
    }

    public final int hashCode() {
        A a6 = this.f2755b;
        int hashCode = (a6 == null ? 0 : a6.hashCode()) * 31;
        B b6 = this.f2756c;
        return hashCode + (b6 != null ? b6.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2755b + ", " + this.f2756c + ')';
    }
}
