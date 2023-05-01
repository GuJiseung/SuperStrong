package androidx.fragment.app;

import android.content.res.Configuration;
/* loaded from: classes.dex */
public final /* synthetic */ class z implements e0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1678b;

    public /* synthetic */ z(int i6, Object obj) {
        this.f1677a = i6;
        this.f1678b = obj;
    }

    @Override // e0.a
    public final void accept(Object obj) {
        int i6 = this.f1677a;
        Object obj2 = this.f1678b;
        switch (i6) {
            case 0:
                a0 a0Var = (a0) obj2;
                Configuration configuration = (Configuration) obj;
                if (a0Var.L()) {
                    a0Var.i(false, configuration);
                    return;
                }
                return;
            case 1:
                a0 a0Var2 = (a0) obj2;
                v.n nVar = (v.n) obj;
                if (a0Var2.L()) {
                    a0Var2.s(nVar.f6266a, false);
                    return;
                }
                return;
            default:
                Configuration configuration2 = (Configuration) obj;
                ((r) obj2).f1619r.a();
                return;
        }
    }
}
