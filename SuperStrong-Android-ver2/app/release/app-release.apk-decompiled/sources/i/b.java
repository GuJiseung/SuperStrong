package i;

import android.os.Looper;
import androidx.activity.result.c;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: c  reason: collision with root package name */
    public final Object f4560c = new Object();

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f4561a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f4561a.getAndIncrement())));
            return thread;
        }
    }

    public b() {
        Executors.newFixedThreadPool(4, new a());
    }

    public final boolean A() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
