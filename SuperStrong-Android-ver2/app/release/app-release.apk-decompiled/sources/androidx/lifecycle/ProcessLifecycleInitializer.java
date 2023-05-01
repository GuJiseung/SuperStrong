package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements y0.b<o> {
    @Override // y0.b
    public final List<Class<? extends y0.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // y0.b
    public final o b(Context context) {
        if (y0.a.c(context).f6752b.contains(ProcessLifecycleInitializer.class)) {
            if (!l.f1758a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new l.a());
            }
            v vVar = v.f1771j;
            vVar.getClass();
            vVar.f1776f = new Handler();
            vVar.f1777g.f(j.b.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new w(vVar));
            return vVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
