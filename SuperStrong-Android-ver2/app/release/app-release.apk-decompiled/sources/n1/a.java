package n1;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: c  reason: collision with root package name */
    public static final long f5370c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d  reason: collision with root package name */
    public static volatile int f5371d;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f5372b;

    /* renamed from: n1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC0066a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final String f5373a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5374b;

        /* renamed from: c  reason: collision with root package name */
        public int f5375c;

        /* renamed from: n1.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0067a extends Thread {
            public C0067a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC0066a.this.f5374b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        public ThreadFactoryC0066a(String str, boolean z5) {
            this.f5373a = str;
            this.f5374b = z5;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            C0067a c0067a;
            c0067a = new C0067a(runnable, "glide-" + this.f5373a + "-thread-" + this.f5375c);
            this.f5375c = this.f5375c + 1;
            return c0067a;
        }
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f5372b = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j5, TimeUnit timeUnit) {
        return this.f5372b.awaitTermination(j5, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5372b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f5372b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j5, TimeUnit timeUnit) {
        return this.f5372b.invokeAll(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f5372b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j5, TimeUnit timeUnit) {
        return (T) this.f5372b.invokeAny(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f5372b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f5372b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f5372b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f5372b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f5372b.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t5) {
        return this.f5372b.submit(runnable, t5);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f5372b.submit(callable);
    }

    public final String toString() {
        return this.f5372b.toString();
    }
}
