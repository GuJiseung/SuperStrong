package k1;

import f2.a;
import f2.d;
/* loaded from: classes.dex */
public final class v<Z> implements w<Z>, a.d {

    /* renamed from: f  reason: collision with root package name */
    public static final a.c f4912f = f2.a.a(20, new a());

    /* renamed from: b  reason: collision with root package name */
    public final d.a f4913b = new d.a();

    /* renamed from: c  reason: collision with root package name */
    public w<Z> f4914c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4915d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4916e;

    /* loaded from: classes.dex */
    public class a implements a.b<v<?>> {
        @Override // f2.a.b
        public final v<?> a() {
            return new v<>();
        }
    }

    public final synchronized void a() {
        this.f4913b.a();
        if (!this.f4915d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f4915d = false;
        if (this.f4916e) {
            e();
        }
    }

    @Override // f2.a.d
    public final d.a b() {
        return this.f4913b;
    }

    @Override // k1.w
    public final int c() {
        return this.f4914c.c();
    }

    @Override // k1.w
    public final Class<Z> d() {
        return this.f4914c.d();
    }

    @Override // k1.w
    public final synchronized void e() {
        this.f4913b.a();
        this.f4916e = true;
        if (!this.f4915d) {
            this.f4914c.e();
            this.f4914c = null;
            f4912f.a(this);
        }
    }

    @Override // k1.w
    public final Z get() {
        return this.f4914c.get();
    }
}
