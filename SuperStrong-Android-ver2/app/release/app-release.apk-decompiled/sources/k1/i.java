package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.j;
import o1.n;
import w1.c;
import z1.c;
/* loaded from: classes.dex */
public final class i<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4771a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4772b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public com.bumptech.glide.g f4773c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4774d;

    /* renamed from: e  reason: collision with root package name */
    public int f4775e;

    /* renamed from: f  reason: collision with root package name */
    public int f4776f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f4777g;

    /* renamed from: h  reason: collision with root package name */
    public j.d f4778h;

    /* renamed from: i  reason: collision with root package name */
    public i1.h f4779i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, i1.l<?>> f4780j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f4781k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4782l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4783m;

    /* renamed from: n  reason: collision with root package name */
    public i1.f f4784n;

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.i f4785o;

    /* renamed from: p  reason: collision with root package name */
    public l f4786p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4787q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4788r;

    public final ArrayList a() {
        boolean z5 = this.f4783m;
        ArrayList arrayList = this.f4772b;
        if (!z5) {
            this.f4783m = true;
            arrayList.clear();
            ArrayList b6 = b();
            int size = b6.size();
            for (int i6 = 0; i6 < size; i6++) {
                n.a aVar = (n.a) b6.get(i6);
                if (!arrayList.contains(aVar.f5547a)) {
                    arrayList.add(aVar.f5547a);
                }
                int i7 = 0;
                while (true) {
                    List<i1.f> list = aVar.f5548b;
                    if (i7 < list.size()) {
                        if (!arrayList.contains(list.get(i7))) {
                            arrayList.add(list.get(i7));
                        }
                        i7++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z5 = this.f4782l;
        ArrayList arrayList = this.f4771a;
        if (!z5) {
            this.f4782l = true;
            arrayList.clear();
            List e6 = this.f4773c.f2801b.e(this.f4774d);
            int size = e6.size();
            for (int i6 = 0; i6 < size; i6++) {
                n.a a6 = ((o1.n) e6.get(i6)).a(this.f4774d, this.f4775e, this.f4776f, this.f4779i);
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data> u<Data, ?, Transcode> c(Class<Data> cls) {
        u<Data, ?, Transcode> uVar;
        u<Data, ?, Transcode> uVar2;
        Object obj;
        ArrayList arrayList;
        boolean z5;
        w1.b bVar;
        w1.b bVar2;
        boolean z6;
        com.bumptech.glide.j jVar = this.f4773c.f2801b;
        Class<?> cls2 = this.f4777g;
        Class cls3 = (Class<Transcode>) this.f4781k;
        z1.b bVar3 = jVar.f2825i;
        e2.i andSet = bVar3.f6923b.getAndSet(null);
        if (andSet == null) {
            andSet = new e2.i();
        }
        andSet.f3829a = cls;
        andSet.f3830b = cls2;
        andSet.f3831c = cls3;
        synchronized (bVar3.f6922a) {
            uVar = (u<Data, ?, Transcode>) bVar3.f6922a.getOrDefault(andSet, null);
        }
        bVar3.f6923b.set(andSet);
        jVar.f2825i.getClass();
        if (z1.b.f6921c.equals(uVar)) {
            return null;
        }
        if (uVar == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = jVar.f2819c.b(cls, cls2).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                Iterator it2 = jVar.f2822f.a(cls4, cls3).iterator();
                while (it2.hasNext()) {
                    Class cls5 = (Class) it2.next();
                    z1.c cVar = jVar.f2819c;
                    synchronized (cVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = cVar.f6924a.iterator();
                        while (it3.hasNext()) {
                            List<c.a> list = (List) cVar.f6925b.get((String) it3.next());
                            if (list != null) {
                                for (c.a aVar : list) {
                                    if (aVar.f6926a.isAssignableFrom(cls) && cls4.isAssignableFrom(aVar.f6927b)) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        arrayList.add(aVar.f6928c);
                                    }
                                }
                            }
                        }
                    }
                    w1.c cVar2 = jVar.f2822f;
                    synchronized (cVar2) {
                        if (cls5.isAssignableFrom(cls4)) {
                            bVar = c4.f.f2762c;
                        } else {
                            Iterator it4 = cVar2.f6576a.iterator();
                            while (it4.hasNext()) {
                                c.a aVar2 = (c.a) it4.next();
                                if (aVar2.f6577a.isAssignableFrom(cls4) && cls5.isAssignableFrom(aVar2.f6578b)) {
                                    z5 = true;
                                    continue;
                                } else {
                                    z5 = false;
                                    continue;
                                }
                                if (z5) {
                                    bVar = aVar2.f6579c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                        bVar2 = bVar;
                    }
                    arrayList2.add(new k(cls, cls4, cls5, arrayList, bVar2, jVar.f2826j));
                }
            }
            if (arrayList2.isEmpty()) {
                uVar2 = null;
            } else {
                uVar2 = new u<>(cls, cls2, cls3, arrayList2, jVar.f2826j);
            }
            z1.b bVar4 = jVar.f2825i;
            synchronized (bVar4.f6922a) {
                l.h hVar = bVar4.f6922a;
                e2.i iVar = new e2.i(cls, cls2, cls3);
                if (uVar2 != null) {
                    obj = uVar2;
                } else {
                    obj = z1.b.f6921c;
                }
                hVar.put(iVar, obj);
            }
            return uVar2;
        }
        return uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        r1 = (i1.d<X>) r3.f6920b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <X> i1.d<X> d(X r6) {
        /*
            r5 = this;
            com.bumptech.glide.g r0 = r5.f4773c
            com.bumptech.glide.j r0 = r0.f2801b
            z1.a r0 = r0.f2818b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f6918a     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L38
        L11:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L38
            z1.a$a r3 = (z1.a.C0103a) r3     // Catch: java.lang.Throwable -> L38
            java.lang.Class<T> r4 = r3.f6919a     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L11
            i1.d<T> r1 = r3.f6920b     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            goto L2b
        L29:
            monitor-exit(r0)
            r1 = 0
        L2b:
            if (r1 == 0) goto L2e
            return r1
        L2e:
            com.bumptech.glide.j$e r0 = new com.bumptech.glide.j$e
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L38:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.i.d(java.lang.Object):i1.d");
    }

    public final <Z> i1.l<Z> e(Class<Z> cls) {
        i1.l<Z> lVar = (i1.l<Z>) this.f4780j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, i1.l<?>>> it = this.f4780j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, i1.l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    lVar = (i1.l<Z>) next.getValue();
                    break;
                }
            }
        }
        if (lVar == null) {
            if (this.f4780j.isEmpty() && this.f4787q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return q1.c.f5806b;
        }
        return lVar;
    }
}
