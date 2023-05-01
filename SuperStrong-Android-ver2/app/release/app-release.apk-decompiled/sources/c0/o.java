package c0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class o implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f2732a = "fonts-androidx";

    /* renamed from: b  reason: collision with root package name */
    public final int f2733b = 10;

    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        public final int f2734b;

        public a(Runnable runnable, String str, int i6) {
            super(runnable, str);
            this.f2734b = i6;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f2734b);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f2732a, this.f2733b);
    }
}
