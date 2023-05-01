package y3;
/* loaded from: classes.dex */
public abstract class x<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f6832a;

    /* loaded from: classes.dex */
    public static final class a<T> extends x<T> {
        public a() {
            super(null, 1);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends x<T> {
        public b(T t5) {
            super(t5, 2);
        }
    }

    public x() {
        throw null;
    }

    public x(Object obj, int i6) {
        this.f6832a = (T) ((i6 & 1) != 0 ? (T) null : obj);
    }
}
