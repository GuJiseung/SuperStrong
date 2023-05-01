package e2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class g<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f3823a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public final long f3824b;

    /* renamed from: c  reason: collision with root package name */
    public long f3825c;

    /* loaded from: classes.dex */
    public static final class a<Y> {

        /* renamed from: a  reason: collision with root package name */
        public final Y f3826a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3827b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i6, Object obj) {
            this.f3826a = obj;
            this.f3827b = i6;
        }
    }

    public g(long j5) {
        this.f3824b = j5;
    }

    public final synchronized Y a(T t5) {
        a aVar;
        aVar = (a) this.f3823a.get(t5);
        return aVar != null ? aVar.f3826a : null;
    }

    public int b(Y y5) {
        return 1;
    }

    public void c(T t5, Y y5) {
    }

    public final synchronized Y d(T t5, Y y5) {
        a aVar;
        int b6 = b(y5);
        long j5 = b6;
        Y y6 = null;
        if (j5 >= this.f3824b) {
            c(t5, y5);
            return null;
        }
        if (y5 != null) {
            this.f3825c += j5;
        }
        LinkedHashMap linkedHashMap = this.f3823a;
        if (y5 == null) {
            aVar = null;
        } else {
            aVar = new a(b6, y5);
        }
        a aVar2 = (a) linkedHashMap.put(t5, aVar);
        if (aVar2 != null) {
            this.f3825c -= aVar2.f3827b;
            if (!aVar2.f3826a.equals(y5)) {
                c(t5, aVar2.f3826a);
            }
        }
        e(this.f3824b);
        if (aVar2 != null) {
            y6 = aVar2.f3826a;
        }
        return y6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j5) {
        while (this.f3825c > j5) {
            Iterator it = this.f3823a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f3825c -= aVar.f3827b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.f3826a);
        }
    }
}
