package v3;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import q3.o;
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static Class f6321d;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6322b;

    /* renamed from: c  reason: collision with root package name */
    public final Field f6323c;

    public c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f6321d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f6322b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f6323c = field;
    }

    @Override // v3.b
    public final void a(AccessibleObject accessibleObject) {
        Field field;
        boolean z5 = false;
        Object obj = this.f6322b;
        if (obj != null && (field = this.f6323c) != null) {
            try {
                f6321d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(obj, accessibleObject, Long.valueOf(((Long) f6321d.getMethod("objectFieldOffset", Field.class).invoke(obj, field)).longValue()), Boolean.TRUE);
                z5 = true;
            } catch (Exception unused) {
            }
        }
        if (!z5) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e6) {
                throw new o("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e6);
            }
        }
    }
}
