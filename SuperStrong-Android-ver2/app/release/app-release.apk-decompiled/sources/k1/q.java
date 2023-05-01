package k1;
/* loaded from: classes.dex */
public final class q<Z> implements w<Z> {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4892b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4893c;

    /* renamed from: d  reason: collision with root package name */
    public final w<Z> f4894d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4895e;

    /* renamed from: f  reason: collision with root package name */
    public final i1.f f4896f;

    /* renamed from: g  reason: collision with root package name */
    public int f4897g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4898h;

    /* loaded from: classes.dex */
    public interface a {
        void a(i1.f fVar, q<?> qVar);
    }

    public q(w<Z> wVar, boolean z5, boolean z6, i1.f fVar, a aVar) {
        androidx.activity.k.h(wVar);
        this.f4894d = wVar;
        this.f4892b = z5;
        this.f4893c = z6;
        this.f4896f = fVar;
        androidx.activity.k.h(aVar);
        this.f4895e = aVar;
    }

    public final synchronized void a() {
        if (this.f4898h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4897g++;
    }

    public final void b() {
        boolean z5;
        synchronized (this) {
            int i6 = this.f4897g;
            if (i6 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z5 = true;
            int i7 = i6 - 1;
            this.f4897g = i7;
            if (i7 != 0) {
                z5 = false;
            }
        }
        if (z5) {
            this.f4895e.a(this.f4896f, this);
        }
    }

    @Override // k1.w
    public final int c() {
        return this.f4894d.c();
    }

    @Override // k1.w
    public final Class<Z> d() {
        return this.f4894d.d();
    }

    @Override // k1.w
    public final synchronized void e() {
        if (this.f4897g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4898h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4898h = true;
        if (this.f4893c) {
            this.f4894d.e();
        }
    }

    @Override // k1.w
    public final Z get() {
        return this.f4894d.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4892b + ", listener=" + this.f4895e + ", key=" + this.f4896f + ", acquired=" + this.f4897g + ", isRecycled=" + this.f4898h + ", resource=" + this.f4894d + '}';
    }
}
