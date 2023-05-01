package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f1731a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f1732b;

    static {
        List<Class<?>> asList = Arrays.asList(Application.class, z.class);
        l4.f.e(asList, "asList(this)");
        f1731a = asList;
        List<Class<?>> singletonList = Collections.singletonList(z.class);
        l4.f.e(singletonList, "singletonList(element)");
        f1732b = singletonList;
    }

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        List list2;
        l4.f.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        l4.f.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            l4.f.e(parameterTypes, "constructor.parameterTypes");
            int length = parameterTypes.length;
            if (length != 0) {
                if (length != 1) {
                    list2 = new ArrayList(new d4.a(parameterTypes));
                } else {
                    list2 = Collections.singletonList(parameterTypes[0]);
                    l4.f.e(list2, "singletonList(element)");
                }
            } else {
                list2 = d4.d.f3801b;
            }
            if (l4.f.a(list, list2)) {
                return constructor2;
            }
            if (list.size() == list2.size() && list2.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends f0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Failed to access " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e8.getCause());
        }
    }
}
