package androidx.lifecycle;

import androidx.lifecycle.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import x0.b;
/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a implements b.a {
        @Override // x0.b.a
        public final void a(x0.d dVar) {
            Object obj;
            boolean z5;
            if (dVar instanceof l0) {
                k0 t5 = ((l0) dVar).t();
                x0.b b6 = dVar.b();
                t5.getClass();
                Iterator it = new HashSet(t5.f1757a.keySet()).iterator();
                while (it.hasNext()) {
                    f0 f0Var = t5.f1757a.get((String) it.next());
                    p v2 = dVar.v();
                    HashMap hashMap = f0Var.f1733a;
                    if (hashMap == null) {
                        obj = null;
                    } else {
                        synchronized (hashMap) {
                            obj = f0Var.f1733a.get("androidx.lifecycle.savedstate.vm.tag");
                        }
                    }
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                    if (savedStateHandleController != null && !(z5 = savedStateHandleController.f1705c)) {
                        if (!z5) {
                            savedStateHandleController.f1705c = true;
                            v2.a(savedStateHandleController);
                            b6.c(savedStateHandleController.f1704b, savedStateHandleController.f1706d.f1790e);
                            i.a(v2, b6);
                        } else {
                            throw new IllegalStateException("Already attached to lifecycleOwner");
                        }
                    }
                }
                if (!new HashSet(t5.f1757a.keySet()).isEmpty()) {
                    b6.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    public static void a(final j jVar, final x0.b bVar) {
        j.c b6 = jVar.b();
        if (b6 == j.c.INITIALIZED || b6.a(j.c.STARTED)) {
            bVar.d();
        } else {
            jVar.a(new m() { // from class: androidx.lifecycle.LegacySavedStateHandleController$1
                @Override // androidx.lifecycle.m
                public final void f(o oVar, j.b bVar2) {
                    if (bVar2 == j.b.ON_START) {
                        j.this.c(this);
                        bVar.d();
                    }
                }
            });
        }
    }
}
