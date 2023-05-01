package b2;

import android.graphics.drawable.Drawable;
import e2.j;
/* loaded from: classes.dex */
public abstract class c<T> implements g<T> {

    /* renamed from: b  reason: collision with root package name */
    public final int f2354b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2355c;

    /* renamed from: d  reason: collision with root package name */
    public a2.c f2356d;

    public c() {
        if (!j.g(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f2354b = Integer.MIN_VALUE;
        this.f2355c = Integer.MIN_VALUE;
    }

    @Override // x1.i
    public final void a() {
    }

    @Override // x1.i
    public final void b() {
    }

    @Override // b2.g
    public final void c(a2.c cVar) {
        this.f2356d = cVar;
    }

    @Override // b2.g
    public final void d(Drawable drawable) {
    }

    @Override // b2.g
    public final void e(f fVar) {
        fVar.b(this.f2354b, this.f2355c);
    }

    @Override // b2.g
    public final void f(Drawable drawable) {
    }

    @Override // b2.g
    public final a2.c g() {
        return this.f2356d;
    }

    @Override // b2.g
    public final void i(f fVar) {
    }

    @Override // x1.i
    public final void k() {
    }
}
