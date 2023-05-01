package o1;

import com.bumptech.glide.j;
import f2.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o1.n;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f5563e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final a f5564f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5565a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5566b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f5567c;

    /* renamed from: d  reason: collision with root package name */
    public final e0.d<List<Throwable>> f5568d;

    /* loaded from: classes.dex */
    public static class a implements n<Object, Object> {
        @Override // o1.n
        public final n.a<Object> a(Object obj, int i6, int i7, i1.h hVar) {
            return null;
        }

        @Override // o1.n
        public final boolean b(Object obj) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f5569a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f5570b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f5571c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f5569a = cls;
            this.f5570b = cls2;
            this.f5571c = oVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public r(a.c cVar) {
        c cVar2 = f5563e;
        this.f5565a = new ArrayList();
        this.f5567c = new HashSet();
        this.f5568d = cVar;
        this.f5566b = cVar2;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f5565a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f5567c.contains(bVar) && bVar.f5569a.isAssignableFrom(cls)) {
                    this.f5567c.add(bVar);
                    n a6 = bVar.f5571c.a(this);
                    androidx.activity.k.h(a6);
                    arrayList.add(a6);
                    this.f5567c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f5567c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f5565a.iterator();
            boolean z5 = false;
            while (true) {
                boolean z6 = true;
                if (!it.hasNext()) {
                    break;
                }
                b<?, ?> bVar = (b) it.next();
                if (this.f5567c.contains(bVar)) {
                    z5 = true;
                } else {
                    if (!bVar.f5569a.isAssignableFrom(cls) || !bVar.f5570b.isAssignableFrom(cls2)) {
                        z6 = false;
                    }
                    if (z6) {
                        this.f5567c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f5567c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f5566b;
                e0.d<List<Throwable>> dVar = this.f5568d;
                cVar.getClass();
                return new q(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z5) {
                return f5564f;
            } else {
                throw new j.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f5567c.clear();
            throw th;
        }
    }

    public final <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        n<Model, Data> nVar = (n<Model, Data>) bVar.f5571c.a(this);
        androidx.activity.k.h(nVar);
        return nVar;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f5565a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f5570b) && bVar.f5569a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f5570b);
            }
        }
        return arrayList;
    }
}
