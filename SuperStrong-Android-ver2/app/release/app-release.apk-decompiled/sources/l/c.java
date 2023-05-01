package l;

import java.util.Map;
/* loaded from: classes.dex */
public final class c extends g<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f5025d;

    public c(d dVar) {
        this.f5025d = dVar;
    }

    @Override // l.g
    public final void a() {
        this.f5025d.clear();
    }

    @Override // l.g
    public final Object b(int i6, int i7) {
        return this.f5025d.f5033c[i6];
    }

    @Override // l.g
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // l.g
    public final int d() {
        return this.f5025d.f5034d;
    }

    @Override // l.g
    public final int e(Object obj) {
        return this.f5025d.indexOf(obj);
    }

    @Override // l.g
    public final int f(Object obj) {
        return this.f5025d.indexOf(obj);
    }

    @Override // l.g
    public final void g(Object obj, Object obj2) {
        this.f5025d.add(obj);
    }

    @Override // l.g
    public final void h(int i6) {
        this.f5025d.e(i6);
    }

    @Override // l.g
    public final Object i(int i6, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
