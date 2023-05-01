package h4;

import l4.f;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4552a;

    static {
        a aVar;
        try {
            Object newInstance = j4.a.class.newInstance();
            f.e(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    aVar = (a) newInstance;
                } catch (ClassCastException e6) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = a.class.getClassLoader();
                    if (f.a(classLoader, classLoader2)) {
                        throw e6;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e6);
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance2 = i4.a.class.newInstance();
                f.e(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        aVar = (a) newInstance2;
                    } catch (ClassNotFoundException unused2) {
                        aVar = new a();
                    }
                } catch (ClassCastException e7) {
                    ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = a.class.getClassLoader();
                    if (f.a(classLoader3, classLoader4)) {
                        throw e7;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e7);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            f.e(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    aVar = (a) newInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    f.e(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        aVar = (a) newInstance4;
                    } catch (ClassCastException e8) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = a.class.getClassLoader();
                        if (f.a(classLoader5, classLoader6)) {
                            throw e8;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e8);
                    }
                }
            } catch (ClassCastException e9) {
                ClassLoader classLoader7 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = a.class.getClassLoader();
                if (f.a(classLoader7, classLoader8)) {
                    throw e9;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e9);
            }
        }
        f4552a = aVar;
    }
}
