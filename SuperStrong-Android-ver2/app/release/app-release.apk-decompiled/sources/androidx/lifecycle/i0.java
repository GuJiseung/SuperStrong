package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import u0.a;
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final k0 f1742a;

    /* renamed from: b  reason: collision with root package name */
    public final b f1743b;

    /* renamed from: c  reason: collision with root package name */
    public final u0.a f1744c;

    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public static a f1745c;

        /* renamed from: b  reason: collision with root package name */
        public final Application f1746b;

        public a(Application application) {
            this.f1746b = application;
        }

        @Override // androidx.lifecycle.i0.c, androidx.lifecycle.i0.b
        public final <T extends f0> T a(Class<T> cls) {
            Application application = this.f1746b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.i0.b
        public final f0 b(Class cls, u0.d dVar) {
            if (this.f1746b != null) {
                return a(cls);
            }
            Application application = (Application) dVar.f6231a.get(h0.f1741a);
            if (application != null) {
                return c(cls, application);
            }
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final <T extends f0> T c(Class<T> cls, Application application) {
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    l4.f.e(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e6);
                } catch (InstantiationException e7) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e7);
                } catch (NoSuchMethodException e8) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e8);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e9);
                }
            }
            return (T) super.a(cls);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        default <T extends f0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default f0 b(Class cls, u0.d dVar) {
            return a(cls);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static c f1747a;

        @Override // androidx.lifecycle.i0.b
        public <T extends f0> T a(Class<T> cls) {
            try {
                T newInstance = cls.newInstance();
                l4.f.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public void c(f0 f0Var) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, b bVar) {
        this(k0Var, bVar, a.C0093a.f6232b);
        l4.f.f(k0Var, "store");
        l4.f.f(bVar, "factory");
    }

    public i0(k0 k0Var, b bVar, u0.a aVar) {
        l4.f.f(k0Var, "store");
        l4.f.f(bVar, "factory");
        l4.f.f(aVar, "defaultCreationExtras");
        this.f1742a = k0Var;
        this.f1743b = bVar;
        this.f1744c = aVar;
    }

    public final <T extends f0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final f0 b(Class cls, String str) {
        f0 a6;
        d dVar;
        l4.f.f(str, "key");
        k0 k0Var = this.f1742a;
        f0 f0Var = k0Var.f1757a.get(str);
        boolean isInstance = cls.isInstance(f0Var);
        b bVar = this.f1743b;
        if (isInstance) {
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                l4.f.e(f0Var, "viewModel");
                dVar.c(f0Var);
            }
            if (f0Var != null) {
                return f0Var;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        u0.d dVar2 = new u0.d(this.f1744c);
        dVar2.f6231a.put(j0.f1756a, str);
        try {
            a6 = bVar.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            a6 = bVar.a(cls);
        }
        f0 put = k0Var.f1757a.put(str, a6);
        if (put != null) {
            put.b();
        }
        return a6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i0(androidx.lifecycle.l0 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "owner"
            l4.f.f(r5, r0)
            androidx.lifecycle.k0 r0 = r5.t()
            java.lang.String r1 = "owner.viewModelStore"
            l4.f.e(r0, r1)
            boolean r1 = r5 instanceof androidx.lifecycle.h
            if (r1 == 0) goto L1f
            r2 = r5
            androidx.lifecycle.h r2 = (androidx.lifecycle.h) r2
            androidx.lifecycle.i0$b r2 = r2.j()
            java.lang.String r3 = "owner.defaultViewModelProviderFactory"
            l4.f.e(r2, r3)
            goto L2f
        L1f:
            androidx.lifecycle.i0$c r2 = androidx.lifecycle.i0.c.f1747a
            if (r2 != 0) goto L2a
            androidx.lifecycle.i0$c r2 = new androidx.lifecycle.i0$c
            r2.<init>()
            androidx.lifecycle.i0.c.f1747a = r2
        L2a:
            androidx.lifecycle.i0$c r2 = androidx.lifecycle.i0.c.f1747a
            l4.f.c(r2)
        L2f:
            if (r1 == 0) goto L3d
            androidx.lifecycle.h r5 = (androidx.lifecycle.h) r5
            u0.a r5 = r5.k()
            java.lang.String r1 = "{\n        owner.defaultV…ModelCreationExtras\n    }"
            l4.f.e(r5, r1)
            goto L3f
        L3d:
            u0.a$a r5 = u0.a.C0093a.f6232b
        L3f:
            r4.<init>(r0, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.i0.<init>(androidx.lifecycle.l0):void");
    }
}
