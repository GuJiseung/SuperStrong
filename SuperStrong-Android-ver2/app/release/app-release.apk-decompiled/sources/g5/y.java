package g5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* loaded from: classes.dex */
public class y {

    /* renamed from: c  reason: collision with root package name */
    public static final y f4326c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4327a = true;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f4328b;

    /* loaded from: classes.dex */
    public static final class a extends y {

        /* renamed from: g5.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ExecutorC0044a implements Executor {

            /* renamed from: b  reason: collision with root package name */
            public final Handler f4329b = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f4329b.post(runnable);
            }
        }

        @Override // g5.y
        public final Executor a() {
            return new ExecutorC0044a();
        }

        @Override // g5.y
        @Nullable
        public final Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        y yVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            yVar = new a();
        } else {
            yVar = new y();
        }
        f4326c = yVar;
    }

    public y() {
        Constructor<MethodHandles.Lookup> constructor;
        try {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            try {
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        } catch (NoClassDefFoundError | NoSuchMethodException unused2) {
            constructor = null;
        }
        this.f4328b = constructor;
    }

    @Nullable
    public Executor a() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor<MethodHandles.Lookup> constructor = this.f4328b;
        unreflectSpecial = (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }
}
