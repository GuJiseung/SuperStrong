package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import e4.a;
import e4.f;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import s4.u;
@Keep
/* loaded from: classes.dex */
public final class AndroidExceptionPreHandler extends a implements u {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(u.a.f6107b);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z5 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z5 = true;
                }
            }
            if (z5) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // s4.u
    public void handleException(f fVar, Throwable th) {
        int i6 = Build.VERSION.SDK_INT;
        if (26 <= i6 && i6 < 28) {
            Method preHandler = preHandler();
            Object invoke = preHandler == null ? null : preHandler.invoke(null, new Object[0]);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler == null) {
                return;
            }
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
