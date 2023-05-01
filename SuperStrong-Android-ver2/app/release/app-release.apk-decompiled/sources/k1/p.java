package k1;

import java.security.MessageDigest;
import java.util.Map;
/* loaded from: classes.dex */
public final class p implements i1.f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f4883b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4884c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4885d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f4886e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f4887f;

    /* renamed from: g  reason: collision with root package name */
    public final i1.f f4888g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, i1.l<?>> f4889h;

    /* renamed from: i  reason: collision with root package name */
    public final i1.h f4890i;

    /* renamed from: j  reason: collision with root package name */
    public int f4891j;

    public p(Object obj, i1.f fVar, int i6, int i7, e2.b bVar, Class cls, Class cls2, i1.h hVar) {
        androidx.activity.k.h(obj);
        this.f4883b = obj;
        if (fVar == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f4888g = fVar;
        this.f4884c = i6;
        this.f4885d = i7;
        androidx.activity.k.h(bVar);
        this.f4889h = bVar;
        if (cls == null) {
            throw new NullPointerException("Resource class must not be null");
        }
        this.f4886e = cls;
        if (cls2 == null) {
            throw new NullPointerException("Transcode class must not be null");
        }
        this.f4887f = cls2;
        androidx.activity.k.h(hVar);
        this.f4890i = hVar;
    }

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f4883b.equals(pVar.f4883b) && this.f4888g.equals(pVar.f4888g) && this.f4885d == pVar.f4885d && this.f4884c == pVar.f4884c && this.f4889h.equals(pVar.f4889h) && this.f4886e.equals(pVar.f4886e) && this.f4887f.equals(pVar.f4887f) && this.f4890i.equals(pVar.f4890i);
        }
        return false;
    }

    @Override // i1.f
    public final int hashCode() {
        if (this.f4891j == 0) {
            int hashCode = this.f4883b.hashCode();
            this.f4891j = hashCode;
            int hashCode2 = ((((this.f4888g.hashCode() + (hashCode * 31)) * 31) + this.f4884c) * 31) + this.f4885d;
            this.f4891j = hashCode2;
            int hashCode3 = this.f4889h.hashCode() + (hashCode2 * 31);
            this.f4891j = hashCode3;
            int hashCode4 = this.f4886e.hashCode() + (hashCode3 * 31);
            this.f4891j = hashCode4;
            int hashCode5 = this.f4887f.hashCode() + (hashCode4 * 31);
            this.f4891j = hashCode5;
            this.f4891j = this.f4890i.hashCode() + (hashCode5 * 31);
        }
        return this.f4891j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f4883b + ", width=" + this.f4884c + ", height=" + this.f4885d + ", resourceClass=" + this.f4886e + ", transcodeClass=" + this.f4887f + ", signature=" + this.f4888g + ", hashCode=" + this.f4891j + ", transformations=" + this.f4889h + ", options=" + this.f4890i + '}';
    }
}
