package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, f0> f1757a = new HashMap<>();

    public final void a() {
        for (f0 f0Var : this.f1757a.values()) {
            f0Var.f1735c = true;
            HashMap hashMap = f0Var.f1733a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object obj : f0Var.f1733a.values()) {
                        f0.a(obj);
                    }
                }
            }
            LinkedHashSet linkedHashSet = f0Var.f1734b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : f0Var.f1734b) {
                        f0.a(closeable);
                    }
                }
            }
            f0Var.b();
        }
        this.f1757a.clear();
    }
}
