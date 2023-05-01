package u0;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import l4.f;
/* loaded from: classes.dex */
public final class b implements i0.b {

    /* renamed from: a  reason: collision with root package name */
    public final e<?>[] f6233a;

    public b(e<?>... eVarArr) {
        f.f(eVarArr, "initializers");
        this.f6233a = eVarArr;
    }

    @Override // androidx.lifecycle.i0.b
    public final f0 b(Class cls, d dVar) {
        e<?>[] eVarArr;
        f0 f0Var = null;
        for (e<?> eVar : this.f6233a) {
            if (f.a(eVar.f6235a, cls)) {
                Object f6 = eVar.f6236b.f(dVar);
                if (f6 instanceof f0) {
                    f0Var = (f0) f6;
                } else {
                    f0Var = null;
                }
            }
        }
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
