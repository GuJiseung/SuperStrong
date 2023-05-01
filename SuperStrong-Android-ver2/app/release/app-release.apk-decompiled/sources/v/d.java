package v;

import android.util.Log;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6248b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6249c;

    public d(Object obj, Object obj2) {
        this.f6248b = obj;
        this.f6249c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = e.f6253d;
            Object obj = this.f6249c;
            Object obj2 = this.f6248b;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                e.f6254e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e6) {
            if (e6.getClass() == RuntimeException.class && e6.getMessage() != null && e6.getMessage().startsWith("Unable to stop")) {
                throw e6;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
