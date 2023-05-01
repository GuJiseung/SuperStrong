package e4;

import e4.f;
import java.io.Serializable;
import k4.p;
/* loaded from: classes.dex */
public final class g implements f, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final g f3850b = new g();

    @Override // e4.f
    public final <R> R fold(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        return r5;
    }

    @Override // e4.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        l4.f.f(cVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // e4.f
    public final f minusKey(f.c<?> cVar) {
        l4.f.f(cVar, "key");
        return this;
    }

    @Override // e4.f
    public final f plus(f fVar) {
        l4.f.f(fVar, "context");
        return fVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
