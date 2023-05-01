package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import l.g;
/* loaded from: classes.dex */
public class b<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public a f5024i;

    public b() {
    }

    public b(b bVar) {
        if (bVar != null) {
            i(bVar);
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f5024i == null) {
            this.f5024i = new a(this);
        }
        a aVar = this.f5024i;
        if (aVar.f5046a == null) {
            aVar.f5046a = new g.b();
        }
        return aVar.f5046a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.f5024i == null) {
            this.f5024i = new a(this);
        }
        a aVar = this.f5024i;
        if (aVar.f5047b == null) {
            aVar.f5047b = new g.c();
        }
        return aVar.f5047b;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f5067d);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.f5024i == null) {
            this.f5024i = new a(this);
        }
        a aVar = this.f5024i;
        if (aVar.f5048c == null) {
            aVar.f5048c = new g.e();
        }
        return aVar.f5048c;
    }
}
