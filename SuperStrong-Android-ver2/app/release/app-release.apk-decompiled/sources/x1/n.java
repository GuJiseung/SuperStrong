package x1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a2.c> f6686a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6687b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f6688c;

    public final boolean a(a2.c cVar) {
        boolean z5 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f6686a.remove(cVar);
        if (!this.f6687b.remove(cVar) && !remove) {
            z5 = false;
        }
        if (z5) {
            cVar.clear();
        }
        return z5;
    }

    public final void b() {
        Iterator it = e2.j.d(this.f6686a).iterator();
        while (it.hasNext()) {
            a2.c cVar = (a2.c) it.next();
            if (!cVar.i() && !cVar.c()) {
                cVar.clear();
                if (this.f6688c) {
                    this.f6687b.add(cVar);
                } else {
                    cVar.f();
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f6686a.size() + ", isPaused=" + this.f6688c + "}";
    }
}
