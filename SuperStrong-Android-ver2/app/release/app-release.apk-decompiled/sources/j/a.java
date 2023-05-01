package j;

import j.b;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f4627f = new HashMap<>();

    @Override // j.b
    public final b.c<K, V> a(K k5) {
        return this.f4627f.get(k5);
    }

    @Override // j.b
    public final V b(K k5) {
        V v2 = (V) super.b(k5);
        this.f4627f.remove(k5);
        return v2;
    }

    public final V c(K k5, V v2) {
        b.c<K, V> a6 = a(k5);
        if (a6 != null) {
            return a6.f4633c;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f4627f;
        b.c<K, V> cVar = new b.c<>(k5, v2);
        this.f4631e++;
        b.c<K, V> cVar2 = this.f4629c;
        if (cVar2 == null) {
            this.f4628b = cVar;
        } else {
            cVar2.f4634d = cVar;
            cVar.f4635e = cVar2;
        }
        this.f4629c = cVar;
        hashMap.put(k5, cVar);
        return null;
    }
}
