package q4;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class a<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<b<T>> f5852a;

    public a(d dVar) {
        this.f5852a = new AtomicReference<>(dVar);
    }

    @Override // q4.b
    public final Iterator<T> iterator() {
        b<T> andSet = this.f5852a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
