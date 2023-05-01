package z1;

import i1.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6929a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f6930a;

        /* renamed from: b  reason: collision with root package name */
        public final k<T> f6931b;

        public a(Class<T> cls, k<T> kVar) {
            this.f6930a = cls;
            this.f6931b = kVar;
        }
    }

    public final synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.f6929a.size();
        for (int i6 = 0; i6 < size; i6++) {
            a aVar = (a) this.f6929a.get(i6);
            if (aVar.f6930a.isAssignableFrom(cls)) {
                return (k<Z>) aVar.f6931b;
            }
        }
        return null;
    }
}
