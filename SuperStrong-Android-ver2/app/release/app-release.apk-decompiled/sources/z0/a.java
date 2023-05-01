package z0;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f6916a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f6917b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        boolean isEnabled;
        try {
            if (f6917b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f6917b == null) {
                f6916a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f6917b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f6917b.invoke(null, Long.valueOf(f6916a))).booleanValue();
        } catch (Exception e6) {
            if (e6 instanceof InvocationTargetException) {
                Throwable cause = e6.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e6);
            return false;
        }
    }
}
