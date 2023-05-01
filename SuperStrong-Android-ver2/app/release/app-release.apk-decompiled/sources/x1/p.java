package x1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: b  reason: collision with root package name */
    public final Set<b2.g<?>> f6691b = Collections.newSetFromMap(new WeakHashMap());

    @Override // x1.i
    public final void a() {
        Iterator it = e2.j.d(this.f6691b).iterator();
        while (it.hasNext()) {
            ((b2.g) it.next()).a();
        }
    }

    @Override // x1.i
    public final void b() {
        Iterator it = e2.j.d(this.f6691b).iterator();
        while (it.hasNext()) {
            ((b2.g) it.next()).b();
        }
    }

    @Override // x1.i
    public final void k() {
        Iterator it = e2.j.d(this.f6691b).iterator();
        while (it.hasNext()) {
            ((b2.g) it.next()).k();
        }
    }
}
