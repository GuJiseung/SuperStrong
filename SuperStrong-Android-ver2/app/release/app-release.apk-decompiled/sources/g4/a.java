package g4;

import a1.f0;
import c4.h;
import g4.f;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class a implements e4.d<Object>, d, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final e4.d<Object> f4160b;

    public a(e4.d<Object> dVar) {
        this.f4160b = dVar;
    }

    @Override // g4.d
    public final d a() {
        e4.d<Object> dVar = this.f4160b;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e4.d
    public final void d(Object obj) {
        e4.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            e4.d dVar2 = aVar.f4160b;
            l4.f.c(dVar2);
            try {
                obj = aVar.i(obj);
                if (obj == f4.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = f0.e(th);
            }
            aVar.j();
            if (!(dVar2 instanceof a)) {
                dVar2.d(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public e4.d<h> g(Object obj, e4.d<?> dVar) {
        l4.f.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final StackTraceElement h() {
        int i6;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i7;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v2 = eVar.v();
        if (v2 <= 1) {
            int i8 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                i6 = i7 - 1;
            } catch (Exception unused) {
                i6 = -1;
            }
            if (i6 >= 0) {
                i8 = eVar.l()[i6];
            }
            f.a aVar = f.f4165b;
            f.a aVar2 = f.f4164a;
            if (aVar == null) {
                try {
                    f.a aVar3 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    f.f4165b = aVar3;
                    aVar = aVar3;
                } catch (Exception unused2) {
                    f.f4165b = aVar2;
                    aVar = aVar2;
                }
            }
            if (aVar != aVar2) {
                Method method = aVar.f4166a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = aVar.f4167b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = aVar.f4168c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i8);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v2 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object i(Object obj);

    public void j() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object h6 = h();
        if (h6 == null) {
            h6 = getClass().getName();
        }
        sb.append(h6);
        return sb.toString();
    }
}
