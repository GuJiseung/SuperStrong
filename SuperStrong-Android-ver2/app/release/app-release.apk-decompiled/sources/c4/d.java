package c4;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class d<T> implements Serializable {

    /* loaded from: classes.dex */
    public static final class a implements Serializable {

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f2757b;

        public a(Throwable th) {
            l4.f.f(th, "exception");
            this.f2757b = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (l4.f.a(this.f2757b, ((a) obj).f2757b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f2757b.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f2757b + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f2757b;
        }
        return null;
    }
}
