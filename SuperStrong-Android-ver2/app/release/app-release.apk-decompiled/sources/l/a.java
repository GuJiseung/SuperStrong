package l;

import java.util.Map;
/* loaded from: classes.dex */
public final class a extends g<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f5023d;

    public a(b bVar) {
        this.f5023d = bVar;
    }

    @Override // l.g
    public final void a() {
        this.f5023d.clear();
    }

    @Override // l.g
    public final Object b(int i6, int i7) {
        return this.f5023d.f5066c[(i6 << 1) + i7];
    }

    @Override // l.g
    public final Map<Object, Object> c() {
        return this.f5023d;
    }

    @Override // l.g
    public final int d() {
        return this.f5023d.f5067d;
    }

    @Override // l.g
    public final int e(Object obj) {
        return this.f5023d.e(obj);
    }

    @Override // l.g
    public final int f(Object obj) {
        return this.f5023d.g(obj);
    }

    @Override // l.g
    public final void g(Object obj, Object obj2) {
        this.f5023d.put(obj, obj2);
    }

    @Override // l.g
    public final void h(int i6) {
        this.f5023d.j(i6);
    }

    @Override // l.g
    public final Object i(int i6, Object obj) {
        return this.f5023d.k(i6, obj);
    }
}
