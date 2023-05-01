package l1;

import java.util.ArrayDeque;
import l1.l;
/* loaded from: classes.dex */
public abstract class c<T extends l> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f5074a;

    public c() {
        char[] cArr = e2.j.f3832a;
        this.f5074a = new ArrayDeque(20);
    }

    public abstract T a();

    public final T b() {
        T t5 = (T) this.f5074a.poll();
        return t5 == null ? a() : t5;
    }

    public final void c(T t5) {
        ArrayDeque arrayDeque = this.f5074a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(t5);
        }
    }
}
