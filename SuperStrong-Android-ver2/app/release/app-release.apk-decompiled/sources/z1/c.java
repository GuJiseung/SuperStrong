package z1;

import i1.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6924a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6925b = new HashMap();

    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f6926a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f6927b;

        /* renamed from: c  reason: collision with root package name */
        public final j<T, R> f6928c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f6926a = cls;
            this.f6927b = cls2;
            this.f6928c = jVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f6924a.contains(str)) {
            this.f6924a.add(str);
        }
        list = (List) this.f6925b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f6925b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z5;
        arrayList = new ArrayList();
        Iterator it = this.f6924a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f6925b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.f6926a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f6927b)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5 && !arrayList.contains(aVar.f6927b)) {
                        arrayList.add(aVar.f6927b);
                    }
                }
            }
        }
        return arrayList;
    }
}
