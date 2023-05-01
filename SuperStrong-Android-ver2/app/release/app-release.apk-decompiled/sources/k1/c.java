package k1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k1.q;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4750a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4751b;

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f4752c;

    /* renamed from: d  reason: collision with root package name */
    public q.a f4753d;

    /* loaded from: classes.dex */
    public static final class a extends WeakReference<q<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final i1.f f4754a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4755b;

        /* renamed from: c  reason: collision with root package name */
        public w<?> f4756c;

        public a(i1.f fVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z5) {
            super(qVar, referenceQueue);
            w<?> wVar;
            androidx.activity.k.h(fVar);
            this.f4754a = fVar;
            if (qVar.f4892b && z5) {
                wVar = qVar.f4894d;
                androidx.activity.k.h(wVar);
            } else {
                wVar = null;
            }
            this.f4756c = wVar;
            this.f4755b = qVar.f4892b;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new k1.a());
        this.f4751b = new HashMap();
        this.f4752c = new ReferenceQueue<>();
        this.f4750a = false;
        newSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(i1.f fVar, q<?> qVar) {
        a aVar = (a) this.f4751b.put(fVar, new a(fVar, qVar, this.f4752c, this.f4750a));
        if (aVar != null) {
            aVar.f4756c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        w<?> wVar;
        synchronized (this) {
            this.f4751b.remove(aVar.f4754a);
            if (aVar.f4755b && (wVar = aVar.f4756c) != null) {
                this.f4753d.a(aVar.f4754a, new q<>(wVar, true, false, aVar.f4754a, this.f4753d));
            }
        }
    }
}
