package m1;

import androidx.activity.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5240a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C0065b f5241b = new C0065b();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ReentrantLock f5242a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f5243b;
    }

    /* renamed from: m1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0065b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f5244a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f5240a.get(str);
            k.h(obj);
            aVar = (a) obj;
            int i6 = aVar.f5243b;
            if (i6 >= 1) {
                int i7 = i6 - 1;
                aVar.f5243b = i7;
                if (i7 == 0) {
                    a aVar2 = (a) this.f5240a.remove(str);
                    if (aVar2.equals(aVar)) {
                        C0065b c0065b = this.f5241b;
                        synchronized (c0065b.f5244a) {
                            if (c0065b.f5244a.size() < 10) {
                                c0065b.f5244a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f5243b);
            }
        }
        aVar.f5242a.unlock();
    }
}
