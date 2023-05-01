package o4;
/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0);
    }

    public c(int i6, int i7) {
        super(i6, i7, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f5610b == cVar.f5610b) {
                    if (this.f5611c == cVar.f5611c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f5610b * 31) + this.f5611c;
    }

    public final boolean isEmpty() {
        return this.f5610b > this.f5611c;
    }

    public final String toString() {
        return this.f5610b + ".." + this.f5611c;
    }
}
