package s3;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public final class b implements n<Object> {

    /* renamed from: b  reason: collision with root package name */
    public final androidx.activity.result.c f6001b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f6002c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Type f6003d;

    public b(Class cls, Type type) {
        androidx.activity.result.c sVar;
        this.f6002c = cls;
        this.f6003d = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            sVar = new p(declaredField.get(null), cls2.getMethod("allocateInstance", Class.class));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    sVar = new q(intValue, declaredMethod2);
                } catch (Exception unused2) {
                    sVar = new s();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                sVar = new r(declaredMethod3);
            }
        }
        this.f6001b = sVar;
    }

    @Override // s3.n
    public final Object e() {
        try {
            return this.f6001b.p(this.f6002c);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + this.f6003d + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e6);
        }
    }
}
