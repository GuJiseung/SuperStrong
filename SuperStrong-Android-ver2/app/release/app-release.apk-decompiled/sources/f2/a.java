package f2;

import android.util.Log;
import e0.f;
import f2.d;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0038a f3954a = new C0038a();

    /* renamed from: f2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0038a implements e<Object> {
        @Override // f2.a.e
        public final void a(Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        T a();
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements e0.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f3955a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f3956b;

        /* renamed from: c  reason: collision with root package name */
        public final e0.d<T> f3957c;

        public c(f fVar, b bVar, e eVar) {
            this.f3957c = fVar;
            this.f3955a = bVar;
            this.f3956b = eVar;
        }

        @Override // e0.d
        public final boolean a(T t5) {
            if (t5 instanceof d) {
                ((d) t5).b().f3958a = true;
            }
            this.f3956b.a(t5);
            return this.f3957c.a(t5);
        }

        @Override // e0.d
        public final T b() {
            T b6 = this.f3957c.b();
            if (b6 == null) {
                b6 = this.f3955a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b6.getClass());
                }
            }
            if (b6 instanceof d) {
                ((d) b6).b().f3958a = false;
            }
            return b6;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        d.a b();
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t5);
    }

    public static c a(int i6, b bVar) {
        return new c(new f(i6), bVar, f3954a);
    }
}
