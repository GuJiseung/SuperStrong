package androidx.fragment.app;

import android.content.Intent;
/* loaded from: classes.dex */
public final /* synthetic */ class q implements e0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1612a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1613b;

    public /* synthetic */ q(int i6, Object obj) {
        this.f1612a = i6;
        this.f1613b = obj;
    }

    @Override // e0.a
    public final void accept(Object obj) {
        int i6 = this.f1612a;
        Object obj2 = this.f1613b;
        switch (i6) {
            case 0:
                Intent intent = (Intent) obj;
                ((r) obj2).f1619r.a();
                return;
            default:
                a0 a0Var = (a0) obj2;
                Integer num = (Integer) obj;
                if (a0Var.L() && num.intValue() == 80) {
                    a0Var.m(false);
                    return;
                }
                return;
        }
    }
}
