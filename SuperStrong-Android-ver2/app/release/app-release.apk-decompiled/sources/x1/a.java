package x1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Set<i> f6663a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f6664b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6665c;

    @Override // x1.h
    public final void a(i iVar) {
        this.f6663a.add(iVar);
        if (this.f6665c) {
            iVar.b();
        } else if (this.f6664b) {
            iVar.k();
        } else {
            iVar.a();
        }
    }

    @Override // x1.h
    public final void b(i iVar) {
        this.f6663a.remove(iVar);
    }

    public final void c() {
        this.f6665c = true;
        Iterator it = e2.j.d(this.f6663a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).b();
        }
    }

    public final void d() {
        this.f6664b = true;
        Iterator it = e2.j.d(this.f6663a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).k();
        }
    }

    public final void e() {
        this.f6664b = false;
        Iterator it = e2.j.d(this.f6663a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }
}
