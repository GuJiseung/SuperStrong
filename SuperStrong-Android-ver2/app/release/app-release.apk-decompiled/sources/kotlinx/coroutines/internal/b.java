package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class b<T> extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4943a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = c.b.f2671k0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.l
    public final Object a(Object obj) {
        boolean z5;
        Object obj2 = this._consensus;
        a1.r rVar = c.b.f2671k0;
        if (obj2 == rVar) {
            a1.r c6 = c(obj);
            obj2 = this._consensus;
            if (obj2 == rVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4943a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, c6)) {
                        z5 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != rVar) {
                        z5 = false;
                        break;
                    }
                }
                if (z5) {
                    obj2 = c6;
                } else {
                    obj2 = this._consensus;
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t5, Object obj);

    public abstract a1.r c(Object obj);
}
