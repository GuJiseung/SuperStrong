package o1;

import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final l f5542a = new l();

    /* loaded from: classes.dex */
    public static final class a<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayDeque f5543d;

        /* renamed from: a  reason: collision with root package name */
        public int f5544a;

        /* renamed from: b  reason: collision with root package name */
        public int f5545b;

        /* renamed from: c  reason: collision with root package name */
        public A f5546c;

        static {
            char[] cArr = e2.j.f3832a;
            f5543d = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f5543d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f5546c = obj;
            aVar.f5545b = 0;
            aVar.f5544a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f5545b == aVar.f5545b && this.f5544a == aVar.f5544a && this.f5546c.equals(aVar.f5546c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5546c.hashCode() + (((this.f5544a * 31) + this.f5545b) * 31);
        }
    }
}
