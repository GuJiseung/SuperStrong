package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import x0.b;
/* loaded from: classes.dex */
public final class b0 implements b.InterfaceC0100b {

    /* renamed from: a  reason: collision with root package name */
    public final x0.b f1719a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1720b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f1721c;

    /* renamed from: d  reason: collision with root package name */
    public final c4.e f1722d;

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements k4.a<c0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ l0 f1723c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0 l0Var) {
            super(0);
            this.f1723c = l0Var;
        }

        @Override // k4.a
        public final c0 a() {
            return a0.c(this.f1723c);
        }
    }

    public b0(x0.b bVar, l0 l0Var) {
        l4.f.f(bVar, "savedStateRegistry");
        l4.f.f(l0Var, "viewModelStoreOwner");
        this.f1719a = bVar;
        this.f1722d = new c4.e(new a(l0Var));
    }

    @Override // x0.b.InterfaceC0100b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1721c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : b().f1725d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a6 = ((z) entry.getValue()).f1790e.a();
            if (!l4.f.a(a6, Bundle.EMPTY)) {
                bundle.putBundle(str, a6);
            }
        }
        this.f1720b = false;
        return bundle;
    }

    public final c0 b() {
        return (c0) this.f1722d.a();
    }
}
