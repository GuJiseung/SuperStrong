package e2;
/* loaded from: classes.dex */
public final class b<K, V> extends l.b<K, V> {

    /* renamed from: j  reason: collision with root package name */
    public int f3813j;

    @Override // l.h, java.util.Map
    public final void clear() {
        this.f3813j = 0;
        super.clear();
    }

    @Override // l.h, java.util.Map
    public final int hashCode() {
        if (this.f3813j == 0) {
            this.f3813j = super.hashCode();
        }
        return this.f3813j;
    }

    @Override // l.h
    public final void i(l.b bVar) {
        this.f3813j = 0;
        super.i(bVar);
    }

    @Override // l.h
    public final V j(int i6) {
        this.f3813j = 0;
        return (V) super.j(i6);
    }

    @Override // l.h
    public final V k(int i6, V v2) {
        this.f3813j = 0;
        return (V) super.k(i6, v2);
    }

    @Override // l.h, java.util.Map
    public final V put(K k5, V v2) {
        this.f3813j = 0;
        return (V) super.put(k5, v2);
    }
}
