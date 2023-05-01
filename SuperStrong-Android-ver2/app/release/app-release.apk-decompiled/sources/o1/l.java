package o1;

import java.util.ArrayDeque;
import o1.m;
/* loaded from: classes.dex */
public final class l extends e2.g<m.a<Object>, Object> {
    public l() {
        super(500L);
    }

    @Override // e2.g
    public final void c(m.a<Object> aVar, Object obj) {
        m.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = m.a.f5543d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
