package c4;

import androidx.lifecycle.b0;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class e<T> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public k4.a<? extends T> f2758b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Object f2759c = f.f2761b;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2760d = this;

    public e(b0.a aVar) {
        this.f2758b = aVar;
    }

    public final T a() {
        T t5;
        T t6 = (T) this.f2759c;
        f fVar = f.f2761b;
        if (t6 != fVar) {
            return t6;
        }
        synchronized (this.f2760d) {
            t5 = (T) this.f2759c;
            if (t5 == fVar) {
                k4.a<? extends T> aVar = this.f2758b;
                l4.f.c(aVar);
                t5 = aVar.a();
                this.f2759c = t5;
                this.f2758b = null;
            }
        }
        return t5;
    }

    public final String toString() {
        boolean z5;
        if (this.f2759c != f.f2761b) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
