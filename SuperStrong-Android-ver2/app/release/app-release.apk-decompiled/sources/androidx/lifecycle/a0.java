package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import u0.a;
import x0.b;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f1708a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f1709b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a f1710c = new a();

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class c {
    }

    /* loaded from: classes.dex */
    public static final class d extends l4.g implements k4.l<u0.a, c0> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f1711c = new d();

        public d() {
            super(1);
        }

        @Override // k4.l
        public final c0 f(u0.a aVar) {
            l4.f.f(aVar, "$this$initializer");
            return new c0();
        }
    }

    public static final z a(u0.d dVar) {
        b0 b0Var;
        Bundle bundle;
        b bVar = f1708a;
        LinkedHashMap linkedHashMap = dVar.f6231a;
        x0.d dVar2 = (x0.d) linkedHashMap.get(bVar);
        if (dVar2 != null) {
            l0 l0Var = (l0) linkedHashMap.get(f1709b);
            if (l0Var != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(f1710c);
                String str = (String) linkedHashMap.get(j0.f1756a);
                if (str != null) {
                    b.InterfaceC0100b b6 = dVar2.b().b();
                    if (b6 instanceof b0) {
                        b0Var = (b0) b6;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var != null) {
                        c0 c6 = c(l0Var);
                        z zVar = (z) c6.f1725d.get(str);
                        if (zVar == null) {
                            Class<? extends Object>[] clsArr = z.f1785f;
                            boolean z5 = true;
                            if (!b0Var.f1720b) {
                                b0Var.f1721c = b0Var.f1719a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                                b0Var.f1720b = true;
                                b0Var.b();
                            }
                            Bundle bundle3 = b0Var.f1721c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = b0Var.f1721c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = b0Var.f1721c;
                            if ((bundle5 == null || !bundle5.isEmpty()) ? false : false) {
                                b0Var.f1721c = null;
                            }
                            z a6 = z.a.a(bundle, bundle2);
                            c6.f1725d.put(str, a6);
                            return a6;
                        }
                        return zVar;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends x0.d & l0> void b(T t5) {
        boolean z5;
        l4.f.f(t5, "<this>");
        j.c cVar = t5.v().f1760b;
        l4.f.e(cVar, "lifecycle.currentState");
        if (cVar != j.c.INITIALIZED && cVar != j.c.CREATED) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            if (t5.b().b() == null) {
                b0 b0Var = new b0(t5.b(), t5);
                t5.b().c("androidx.lifecycle.internal.SavedStateHandlesProvider", b0Var);
                t5.v().a(new SavedStateHandleAttacher(b0Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final c0 c(l0 l0Var) {
        u0.a aVar;
        l4.f.f(l0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        Class<?> a6 = l4.l.a(c0.class).a();
        l4.f.d(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new u0.e(a6));
        Object[] array = arrayList.toArray(new u0.e[0]);
        if (array != null) {
            u0.e[] eVarArr = (u0.e[]) array;
            u0.b bVar = new u0.b((u0.e[]) Arrays.copyOf(eVarArr, eVarArr.length));
            k0 t5 = l0Var.t();
            l4.f.e(t5, "owner.viewModelStore");
            if (l0Var instanceof h) {
                aVar = ((h) l0Var).k();
                l4.f.e(aVar, "{\n        owner.defaultV…ModelCreationExtras\n    }");
            } else {
                aVar = a.C0093a.f6232b;
            }
            return (c0) new i0(t5, bVar, aVar).b(c0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
