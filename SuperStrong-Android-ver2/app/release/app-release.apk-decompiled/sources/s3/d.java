package s3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class d implements n<Object> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Constructor f6008b;

    public d(Constructor constructor) {
        this.f6008b = constructor;
    }

    @Override // s3.n
    public final Object e() {
        Constructor constructor = this.f6008b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e8.getTargetException());
        }
    }
}
