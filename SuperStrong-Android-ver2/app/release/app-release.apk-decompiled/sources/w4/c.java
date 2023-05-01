package w4;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6591a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6592b;

    public /* synthetic */ c(String str, boolean z5) {
        this.f6591a = str;
        this.f6592b = z5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f6591a);
        thread.setDaemon(this.f6592b);
        return thread;
    }
}
