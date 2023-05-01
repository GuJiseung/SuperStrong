package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import l4.f;
import x0.b;
import x0.d;
/* loaded from: classes.dex */
public final class Recreator implements m {

    /* renamed from: b  reason: collision with root package name */
    public final d f2176b;

    /* loaded from: classes.dex */
    public static final class a implements b.InterfaceC0100b {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashSet f2177a;

        public a(b bVar) {
            f.f(bVar, "registry");
            this.f2177a = new LinkedHashSet();
            bVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // x0.b.InterfaceC0100b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2177a));
            return bundle;
        }
    }

    public Recreator(d dVar) {
        f.f(dVar, "owner");
        this.f2176b = dVar;
    }

    @Override // androidx.lifecycle.m
    public final void f(o oVar, j.b bVar) {
        if (bVar == j.b.ON_CREATE) {
            oVar.v().c(this);
            d dVar = this.f2176b;
            Bundle a6 = dVar.b().a("androidx.savedstate.Restarter");
            if (a6 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a6.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.a.class);
                        f.e(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                f.e(newInstance, "{\n                constr…wInstance()\n            }");
                                ((b.a) newInstance).a(dVar);
                            } catch (Exception e6) {
                                throw new RuntimeException("Failed to instantiate " + str, e6);
                            }
                        } catch (NoSuchMethodException e7) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                        }
                    } catch (ClassNotFoundException e8) {
                        throw new RuntimeException(b5.b.b("Class ", str, " wasn't found"), e8);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
