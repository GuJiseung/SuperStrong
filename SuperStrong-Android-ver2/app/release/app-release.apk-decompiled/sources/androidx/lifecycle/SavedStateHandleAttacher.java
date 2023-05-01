package androidx.lifecycle;

import androidx.lifecycle.j;
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements m {

    /* renamed from: b  reason: collision with root package name */
    public final b0 f1703b;

    public SavedStateHandleAttacher(b0 b0Var) {
        this.f1703b = b0Var;
    }

    @Override // androidx.lifecycle.m
    public final void f(o oVar, j.b bVar) {
        boolean z5;
        if (bVar == j.b.ON_CREATE) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            oVar.v().c(this);
            b0 b0Var = this.f1703b;
            if (!b0Var.f1720b) {
                b0Var.f1721c = b0Var.f1719a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                b0Var.f1720b = true;
                b0Var.b();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
