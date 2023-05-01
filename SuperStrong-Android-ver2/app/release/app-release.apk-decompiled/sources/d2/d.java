package d2;

import androidx.activity.k;
import i1.f;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f3774b;

    public d(Object obj) {
        k.h(obj);
        this.f3774b = obj;
    }

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f3774b.toString().getBytes(f.f4585a));
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3774b.equals(((d) obj).f3774b);
        }
        return false;
    }

    @Override // i1.f
    public final int hashCode() {
        return this.f3774b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f3774b + '}';
    }
}
