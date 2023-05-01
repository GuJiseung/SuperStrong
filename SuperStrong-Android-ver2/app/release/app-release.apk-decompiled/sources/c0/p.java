package c0;

import android.os.Handler;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class p<T> implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final Callable<T> f2735b;

    /* renamed from: c  reason: collision with root package name */
    public final e0.a<T> f2736c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f2737d;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e0.a f2738b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f2739c;

        public a(e0.a aVar, Object obj) {
            this.f2738b = aVar;
            this.f2739c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f2738b.accept(this.f2739c);
        }
    }

    public p(Handler handler, i iVar, j jVar) {
        this.f2735b = iVar;
        this.f2736c = jVar;
        this.f2737d = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t5;
        try {
            t5 = this.f2735b.call();
        } catch (Exception unused) {
            t5 = null;
        }
        this.f2737d.post(new a(this.f2736c, t5));
    }
}
