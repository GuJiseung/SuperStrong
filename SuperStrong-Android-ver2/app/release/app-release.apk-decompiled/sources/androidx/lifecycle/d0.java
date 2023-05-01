package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.z;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class d0 extends i0.d implements i0.b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f1726a;

    /* renamed from: b  reason: collision with root package name */
    public final i0.a f1727b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f1728c;

    /* renamed from: d  reason: collision with root package name */
    public final j f1729d;

    /* renamed from: e  reason: collision with root package name */
    public final x0.b f1730e;

    @SuppressLint({"LambdaLast"})
    public d0(Application application, x0.d dVar, Bundle bundle) {
        i0.a aVar;
        l4.f.f(dVar, "owner");
        this.f1730e = dVar.b();
        this.f1729d = dVar.v();
        this.f1728c = bundle;
        this.f1726a = application;
        if (application != null) {
            if (i0.a.f1745c == null) {
                i0.a.f1745c = new i0.a(application);
            }
            aVar = i0.a.f1745c;
            l4.f.c(aVar);
        } else {
            aVar = new i0.a(null);
        }
        this.f1727b = aVar;
    }

    @Override // androidx.lifecycle.i0.b
    public final <T extends f0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.i0.b
    public final f0 b(Class cls, u0.d dVar) {
        List<Class<?>> list;
        j0 j0Var = j0.f1756a;
        LinkedHashMap linkedHashMap = dVar.f6231a;
        String str = (String) linkedHashMap.get(j0Var);
        if (str != null) {
            if (linkedHashMap.get(a0.f1708a) != null && linkedHashMap.get(a0.f1709b) != null) {
                Application application = (Application) linkedHashMap.get(h0.f1741a);
                boolean isAssignableFrom = a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    list = e0.f1731a;
                } else {
                    list = e0.f1732b;
                }
                Constructor a6 = e0.a(cls, list);
                if (a6 == null) {
                    return this.f1727b.b(cls, dVar);
                }
                if (isAssignableFrom && application != null) {
                    return e0.b(cls, a6, application, a0.a(dVar));
                }
                return e0.b(cls, a6, a0.a(dVar));
            } else if (this.f1729d != null) {
                return d(cls, str);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.i0.d
    public final void c(f0 f0Var) {
        Object obj;
        boolean z5;
        j jVar = this.f1729d;
        if (jVar != null) {
            x0.b bVar = this.f1730e;
            HashMap hashMap = f0Var.f1733a;
            if (hashMap == null) {
                obj = null;
            } else {
                synchronized (hashMap) {
                    obj = f0Var.f1733a.get("androidx.lifecycle.savedstate.vm.tag");
                }
            }
            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
            if (savedStateHandleController != null && !(z5 = savedStateHandleController.f1705c)) {
                if (!z5) {
                    savedStateHandleController.f1705c = true;
                    jVar.a(savedStateHandleController);
                    bVar.c(savedStateHandleController.f1704b, savedStateHandleController.f1706d.f1790e);
                    i.a(jVar, bVar);
                    return;
                }
                throw new IllegalStateException("Already attached to lifecycleOwner");
            }
        }
    }

    public final f0 d(Class cls, String str) {
        List<Class<?>> list;
        f0 b6;
        j jVar = this.f1729d;
        if (jVar != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            Application application = this.f1726a;
            if (isAssignableFrom && application != null) {
                list = e0.f1731a;
            } else {
                list = e0.f1732b;
            }
            Constructor a6 = e0.a(cls, list);
            if (a6 == null) {
                if (application != null) {
                    return this.f1727b.a(cls);
                }
                if (i0.c.f1747a == null) {
                    i0.c.f1747a = new i0.c();
                }
                i0.c cVar = i0.c.f1747a;
                l4.f.c(cVar);
                return cVar.a(cls);
            }
            x0.b bVar = this.f1730e;
            Bundle a7 = bVar.a(str);
            Class<? extends Object>[] clsArr = z.f1785f;
            z a8 = z.a.a(a7, this.f1728c);
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, a8);
            if (!savedStateHandleController.f1705c) {
                savedStateHandleController.f1705c = true;
                jVar.a(savedStateHandleController);
                bVar.c(str, a8.f1790e);
                i.a(jVar, bVar);
                if (isAssignableFrom && application != null) {
                    b6 = e0.b(cls, a6, application, a8);
                } else {
                    b6 = e0.b(cls, a6, a8);
                }
                b6.c(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                return b6;
            }
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
