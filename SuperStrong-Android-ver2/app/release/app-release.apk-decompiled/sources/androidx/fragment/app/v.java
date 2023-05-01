package androidx.fragment.app;

import androidx.fragment.app.o;
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final l.h<ClassLoader, l.h<String, Class<?>>> f1651a = new l.h<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        l.h<ClassLoader, l.h<String, Class<?>>> hVar = f1651a;
        l.h<String, Class<?>> orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new l.h<>();
            hVar.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 == null) {
            Class<?> cls = Class.forName(str, false, classLoader);
            orDefault.put(str, cls);
            return cls;
        }
        return orDefault2;
    }

    public static Class<? extends o> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e6) {
            throw new o.d(b5.b.b("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e6);
        } catch (ClassNotFoundException e7) {
            throw new o.d(b5.b.b("Unable to instantiate fragment ", str, ": make sure class name exists"), e7);
        }
    }

    public o a(String str) {
        throw null;
    }
}
