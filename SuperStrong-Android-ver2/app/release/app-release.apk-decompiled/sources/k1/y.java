package k1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class y implements i1.f {

    /* renamed from: j  reason: collision with root package name */
    public static final e2.g<Class<?>, byte[]> f4927j = new e2.g<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final l1.b f4928b;

    /* renamed from: c  reason: collision with root package name */
    public final i1.f f4929c;

    /* renamed from: d  reason: collision with root package name */
    public final i1.f f4930d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4931e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4932f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f4933g;

    /* renamed from: h  reason: collision with root package name */
    public final i1.h f4934h;

    /* renamed from: i  reason: collision with root package name */
    public final i1.l<?> f4935i;

    public y(l1.b bVar, i1.f fVar, i1.f fVar2, int i6, int i7, i1.l<?> lVar, Class<?> cls, i1.h hVar) {
        this.f4928b = bVar;
        this.f4929c = fVar;
        this.f4930d = fVar2;
        this.f4931e = i6;
        this.f4932f = i7;
        this.f4935i = lVar;
        this.f4933g = cls;
        this.f4934h = hVar;
    }

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        l1.b bVar = this.f4928b;
        byte[] bArr = (byte[]) bVar.d();
        ByteBuffer.wrap(bArr).putInt(this.f4931e).putInt(this.f4932f).array();
        this.f4930d.b(messageDigest);
        this.f4929c.b(messageDigest);
        messageDigest.update(bArr);
        i1.l<?> lVar = this.f4935i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f4934h.b(messageDigest);
        e2.g<Class<?>, byte[]> gVar = f4927j;
        Class<?> cls = this.f4933g;
        byte[] a6 = gVar.a(cls);
        if (a6 == null) {
            a6 = cls.getName().getBytes(i1.f.f4585a);
            gVar.d(cls, a6);
        }
        messageDigest.update(a6);
        bVar.put(bArr);
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            return this.f4932f == yVar.f4932f && this.f4931e == yVar.f4931e && e2.j.a(this.f4935i, yVar.f4935i) && this.f4933g.equals(yVar.f4933g) && this.f4929c.equals(yVar.f4929c) && this.f4930d.equals(yVar.f4930d) && this.f4934h.equals(yVar.f4934h);
        }
        return false;
    }

    @Override // i1.f
    public final int hashCode() {
        int hashCode = ((((this.f4930d.hashCode() + (this.f4929c.hashCode() * 31)) * 31) + this.f4931e) * 31) + this.f4932f;
        i1.l<?> lVar = this.f4935i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        int hashCode2 = this.f4933g.hashCode();
        return this.f4934h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f4929c + ", signature=" + this.f4930d + ", width=" + this.f4931e + ", height=" + this.f4932f + ", decodedResourceClass=" + this.f4933g + ", transformation='" + this.f4935i + "', options=" + this.f4934h + '}';
    }
}
