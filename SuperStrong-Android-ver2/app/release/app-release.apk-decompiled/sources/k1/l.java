package k1;
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4825a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f4826b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f4827c;

    /* loaded from: classes.dex */
    public class a extends l {
        @Override // k1.l
        public final boolean a() {
            return true;
        }

        @Override // k1.l
        public final boolean b() {
            return true;
        }

        @Override // k1.l
        public final boolean c(i1.a aVar) {
            return aVar == i1.a.REMOTE;
        }

        @Override // k1.l
        public final boolean d(boolean z5, i1.a aVar, i1.c cVar) {
            return (aVar == i1.a.RESOURCE_DISK_CACHE || aVar == i1.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends l {
        @Override // k1.l
        public final boolean a() {
            return false;
        }

        @Override // k1.l
        public final boolean b() {
            return false;
        }

        @Override // k1.l
        public final boolean c(i1.a aVar) {
            return false;
        }

        @Override // k1.l
        public final boolean d(boolean z5, i1.a aVar, i1.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c extends l {
        @Override // k1.l
        public final boolean a() {
            return true;
        }

        @Override // k1.l
        public final boolean b() {
            return false;
        }

        @Override // k1.l
        public final boolean c(i1.a aVar) {
            return (aVar == i1.a.DATA_DISK_CACHE || aVar == i1.a.MEMORY_CACHE) ? false : true;
        }

        @Override // k1.l
        public final boolean d(boolean z5, i1.a aVar, i1.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class d extends l {
        @Override // k1.l
        public final boolean a() {
            return false;
        }

        @Override // k1.l
        public final boolean b() {
            return true;
        }

        @Override // k1.l
        public final boolean c(i1.a aVar) {
            return false;
        }

        @Override // k1.l
        public final boolean d(boolean z5, i1.a aVar, i1.c cVar) {
            return (aVar == i1.a.RESOURCE_DISK_CACHE || aVar == i1.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public class e extends l {
        @Override // k1.l
        public final boolean a() {
            return true;
        }

        @Override // k1.l
        public final boolean b() {
            return true;
        }

        @Override // k1.l
        public final boolean c(i1.a aVar) {
            return aVar == i1.a.REMOTE;
        }

        @Override // k1.l
        public final boolean d(boolean z5, i1.a aVar, i1.c cVar) {
            return ((z5 && aVar == i1.a.DATA_DISK_CACHE) || aVar == i1.a.LOCAL) && cVar == i1.c.TRANSFORMED;
        }
    }

    static {
        new a();
        f4825a = new b();
        f4826b = new c();
        new d();
        f4827c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(i1.a aVar);

    public abstract boolean d(boolean z5, i1.a aVar, i1.c cVar);
}
