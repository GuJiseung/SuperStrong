package s4;
/* loaded from: classes.dex */
public abstract class a1 extends t {
    public abstract a1 H();

    @Override // s4.t
    public String toString() {
        a1 a1Var;
        String str;
        kotlinx.coroutines.scheduling.c cVar = h0.f6067a;
        a1 a1Var2 = kotlinx.coroutines.internal.k.f4969a;
        if (this == a1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                a1Var = a1Var2.H();
            } catch (UnsupportedOperationException unused) {
                a1Var = null;
            }
            if (this == a1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            return getClass().getSimpleName() + '@' + y.a(this);
        }
        return str;
    }
}
