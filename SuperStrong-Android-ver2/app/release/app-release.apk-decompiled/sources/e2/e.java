package e2;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3819a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f3820b = new b();

    /* loaded from: classes.dex */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            j.e().post(runnable);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
