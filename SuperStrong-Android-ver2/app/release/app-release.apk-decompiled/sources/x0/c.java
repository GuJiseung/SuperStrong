package x0;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.savedstate.Recreator;
import j.b;
import java.util.Map;
import l4.f;
import x0.b;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f6660a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6661b = new b();

    /* renamed from: c  reason: collision with root package name */
    public boolean f6662c;

    public c(d dVar) {
        this.f6660a = dVar;
    }

    public final void a() {
        boolean z5;
        d dVar = this.f6660a;
        p v2 = dVar.v();
        f.e(v2, "owner.lifecycle");
        if (v2.f1760b == j.c.INITIALIZED) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            v2.a(new Recreator(dVar));
            final b bVar = this.f6661b;
            bVar.getClass();
            if (!bVar.f6655b) {
                v2.a(new m() { // from class: x0.a
                    @Override // androidx.lifecycle.m
                    public final void f(o oVar, j.b bVar2) {
                        boolean z6;
                        b bVar3 = b.this;
                        f.f(bVar3, "this$0");
                        if (bVar2 == j.b.ON_START) {
                            z6 = true;
                        } else if (bVar2 != j.b.ON_STOP) {
                            return;
                        } else {
                            z6 = false;
                        }
                        bVar3.f6659f = z6;
                    }
                });
                bVar.f6655b = true;
                this.f6662c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f6662c) {
            a();
        }
        p v2 = this.f6660a.v();
        f.e(v2, "owner.lifecycle");
        if (!v2.f1760b.a(j.c.STARTED)) {
            b bVar = this.f6661b;
            if (bVar.f6655b) {
                if (!bVar.f6657d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    bVar.f6656c = bundle2;
                    bVar.f6657d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + v2.f1760b).toString());
    }

    public final void c(Bundle bundle) {
        f.f(bundle, "outBundle");
        b bVar = this.f6661b;
        bVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bVar.f6656c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        j.b<String, b.InterfaceC0100b> bVar2 = bVar.f6654a;
        bVar2.getClass();
        b.d dVar = new b.d();
        bVar2.f4630d.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((b.InterfaceC0100b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
