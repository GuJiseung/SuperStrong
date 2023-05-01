package w1;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6576a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f6577a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f6578b;

        /* renamed from: c  reason: collision with root package name */
        public final b<Z, R> f6579c;

        public a(Class<Z> cls, Class<R> cls2, b<Z, R> bVar) {
            this.f6577a = cls;
            this.f6578b = cls2;
            this.f6579c = bVar;
        }
    }

    public final synchronized ArrayList a(Class cls, Class cls2) {
        boolean z5;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f6576a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f6577a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f6578b)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
