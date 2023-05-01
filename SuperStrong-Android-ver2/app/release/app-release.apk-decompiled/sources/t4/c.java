package t4;

import a1.f0;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import c4.d;
/* loaded from: classes.dex */
public final class c {
    private static volatile Choreographer choreographer;

    static {
        Object e6;
        try {
            e6 = new a(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            e6 = f0.e(th);
        }
        if (e6 instanceof d.a) {
            e6 = null;
        }
        b bVar = (b) e6;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (invoke != null) {
            return (Handler) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}
