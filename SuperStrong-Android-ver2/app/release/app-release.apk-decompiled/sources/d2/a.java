package d2;

import e2.j;
import i1.f;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: b  reason: collision with root package name */
    public final int f3770b;

    /* renamed from: c  reason: collision with root package name */
    public final f f3771c;

    public a(int i6, f fVar) {
        this.f3770b = i6;
        this.f3771c = fVar;
    }

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        this.f3771c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3770b).array());
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f3770b == aVar.f3770b && this.f3771c.equals(aVar.f3771c);
        }
        return false;
    }

    @Override // i1.f
    public final int hashCode() {
        return j.f(this.f3770b, this.f3771c);
    }
}
