package androidx.lifecycle;

import androidx.lifecycle.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f1712c = new b();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1713a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1714b = new HashMap();

    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f1715a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<C0012b, j.b> f1716b;

        public a(HashMap hashMap) {
            this.f1716b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                j.b bVar = (j.b) entry.getValue();
                List list = (List) this.f1715a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1715a.put(bVar, list);
                }
                list.add((C0012b) entry.getKey());
            }
        }

        public static void a(List<C0012b> list, o oVar, j.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0012b c0012b = list.get(size);
                    c0012b.getClass();
                    try {
                        int i6 = c0012b.f1717a;
                        Method method = c0012b.f1718b;
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    method.invoke(obj, oVar, bVar);
                                }
                            } else {
                                method.invoke(obj, oVar);
                            }
                        } else {
                            method.invoke(obj, new Object[0]);
                        }
                    } catch (IllegalAccessException e6) {
                        throw new RuntimeException(e6);
                    } catch (InvocationTargetException e7) {
                        throw new RuntimeException("Failed to call observer method", e7.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0012b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1717a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f1718b;

        public C0012b(int i6, Method method) {
            this.f1717a = i6;
            this.f1718b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0012b) {
                C0012b c0012b = (C0012b) obj;
                return this.f1717a == c0012b.f1717a && this.f1718b.getName().equals(c0012b.f1718b.getName());
            }
            return false;
        }

        public final int hashCode() {
            return this.f1718b.getName().hashCode() + (this.f1717a * 31);
        }
    }

    public static void c(HashMap hashMap, C0012b c0012b, j.b bVar, Class cls) {
        j.b bVar2 = (j.b) hashMap.get(c0012b);
        if (bVar2 == null || bVar == bVar2) {
            if (bVar2 == null) {
                hashMap.put(c0012b, bVar);
                return;
            }
            return;
        }
        Method method = c0012b.f1718b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar2 + ", new value " + bVar);
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i6;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f1716b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0012b, j.b> entry : b(cls2).f1716b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            u uVar = (u) method.getAnnotation(u.class);
            if (uVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (parameterTypes[0].isAssignableFrom(o.class)) {
                        i6 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i6 = 0;
                }
                j.b value = uVar.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(j.b.class)) {
                        if (value == j.b.ON_ANY) {
                            i6 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new C0012b(i6, method), value, cls);
                    z5 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f1713a.put(cls, aVar);
        this.f1714b.put(cls, Boolean.valueOf(z5));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.f1713a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }
}
