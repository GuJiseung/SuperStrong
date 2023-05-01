package androidx.activity;

import androidx.fragment.app.a0;
/* loaded from: classes.dex */
public final /* synthetic */ class g implements e0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f277a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f278b;

    public /* synthetic */ g(int i6, Object obj) {
        this.f277a = i6;
        this.f278b = obj;
    }

    @Override // e0.a
    public final void accept(Object obj) {
        int i6 = this.f277a;
        Object obj2 = this.f278b;
        switch (i6) {
            case 0:
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) obj2;
                Boolean bool = (Boolean) obj;
                onBackPressedDispatcher.getClass();
                if (b0.a.a()) {
                    onBackPressedDispatcher.c();
                    return;
                }
                return;
            default:
                a0 a0Var = (a0) obj2;
                v.i iVar = (v.i) obj;
                if (a0Var.L()) {
                    a0Var.n(iVar.f6264a, false);
                    return;
                }
                return;
        }
    }
}
