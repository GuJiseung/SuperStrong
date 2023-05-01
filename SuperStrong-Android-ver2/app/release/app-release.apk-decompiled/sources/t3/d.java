package t3;

import q3.t;
import q3.w;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class d implements y {

    /* renamed from: b  reason: collision with root package name */
    public final s3.c f6142b;

    public d(s3.c cVar) {
        this.f6142b = cVar;
    }

    public static x b(s3.c cVar, q3.j jVar, w3.a aVar, r3.a aVar2) {
        t tVar;
        x mVar;
        Object e6 = cVar.a(new w3.a(aVar2.value())).e();
        if (e6 instanceof x) {
            mVar = (x) e6;
        } else if (e6 instanceof y) {
            mVar = ((y) e6).a(jVar, aVar);
        } else {
            boolean z5 = e6 instanceof t;
            if (!z5 && !(e6 instanceof q3.m)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + e6.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            q3.m mVar2 = null;
            if (z5) {
                tVar = (t) e6;
            } else {
                tVar = null;
            }
            if (e6 instanceof q3.m) {
                mVar2 = (q3.m) e6;
            }
            mVar = new m(tVar, mVar2, jVar, aVar);
        }
        if (mVar != null && aVar2.nullSafe()) {
            return new w(mVar);
        }
        return mVar;
    }

    @Override // q3.y
    public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
        r3.a aVar2 = (r3.a) aVar.f6586a.getAnnotation(r3.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f6142b, jVar, aVar, aVar2);
    }
}
