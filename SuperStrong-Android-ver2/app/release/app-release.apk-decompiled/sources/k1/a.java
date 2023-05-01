package k1;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: k1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0056a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable f4739b;

        public RunnableC0056a(Runnable runnable) {
            this.f4739b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.f4739b.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC0056a(runnable), "glide-active-resources");
    }
}
