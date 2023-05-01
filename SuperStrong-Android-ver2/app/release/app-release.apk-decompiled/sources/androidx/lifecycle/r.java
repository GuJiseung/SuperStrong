package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f1769a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f1770b = new HashMap();

    public static g a(Constructor<? extends g> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z5;
        boolean z6;
        List list;
        boolean z7;
        String str;
        HashMap hashMap = f1769a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i6 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r42 != null) {
                    str = r42.getName();
                } else {
                    str = "";
                }
                if (!str.isEmpty()) {
                    canonicalName = canonicalName.substring(str.length() + 1);
                }
                String b6 = b(canonicalName);
                if (!str.isEmpty()) {
                    b6 = str + "." + b6;
                }
                constructor = Class.forName(b6).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
            HashMap hashMap2 = f1770b;
            if (constructor != null) {
                list = Collections.singletonList(constructor);
            } else {
                b bVar = b.f1712c;
                HashMap hashMap3 = bVar.f1714b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z5 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 < length) {
                                if (((u) declaredMethods[i7].getAnnotation(u.class)) != null) {
                                    bVar.a(cls, declaredMethods);
                                    z5 = true;
                                    break;
                                }
                                i7++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z5 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e7) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
                    }
                }
                if (!z5) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && n.class.isAssignableFrom(superclass)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        if (c(superclass) != 1) {
                            arrayList = new ArrayList((Collection) hashMap2.get(superclass));
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length2) {
                            Class<?> cls2 = interfaces[i8];
                            if (cls2 != null && n.class.isAssignableFrom(cls2)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) hashMap2.get(cls2));
                            }
                            i8++;
                        } else if (arrayList != null) {
                            list = arrayList;
                        }
                    }
                }
            }
            hashMap2.put(cls, list);
            i6 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i6));
        return i6;
    }
}
