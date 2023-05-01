package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class h<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4960a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new i(8, false);

    public final boolean a(E e6) {
        while (true) {
            i iVar = (i) this._cur;
            int a6 = iVar.a(e6);
            if (a6 == 0) {
                return true;
            }
            if (a6 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4960a;
                i<E> e7 = iVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, e7) && atomicReferenceFieldUpdater.get(this) == iVar) {
                }
            } else if (a6 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            i iVar = (i) this._cur;
            if (iVar.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4960a;
            i<E> e6 = iVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, e6) && atomicReferenceFieldUpdater.get(this) == iVar) {
            }
        }
    }

    public final int c() {
        return ((i) this._cur).c();
    }

    public final E d() {
        while (true) {
            i iVar = (i) this._cur;
            E e6 = (E) iVar.f();
            if (e6 != i.f4963g) {
                return e6;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4960a;
            i<E> e7 = iVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, e7) && atomicReferenceFieldUpdater.get(this) == iVar) {
            }
        }
    }
}
