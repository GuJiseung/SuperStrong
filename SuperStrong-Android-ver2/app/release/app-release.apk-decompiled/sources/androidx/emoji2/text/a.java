package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f1312a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f1312a);
        thread.setPriority(10);
        return thread;
    }
}
