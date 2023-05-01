package k1;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k1.h;
import k1.m;
import o1.n;
/* loaded from: classes.dex */
public final class x implements h, d.a<Object> {

    /* renamed from: b  reason: collision with root package name */
    public final h.a f4917b;

    /* renamed from: c  reason: collision with root package name */
    public final i<?> f4918c;

    /* renamed from: d  reason: collision with root package name */
    public int f4919d;

    /* renamed from: e  reason: collision with root package name */
    public int f4920e = -1;

    /* renamed from: f  reason: collision with root package name */
    public i1.f f4921f;

    /* renamed from: g  reason: collision with root package name */
    public List<o1.n<File, ?>> f4922g;

    /* renamed from: h  reason: collision with root package name */
    public int f4923h;

    /* renamed from: i  reason: collision with root package name */
    public volatile n.a<?> f4924i;

    /* renamed from: j  reason: collision with root package name */
    public File f4925j;

    /* renamed from: k  reason: collision with root package name */
    public y f4926k;

    public x(i<?> iVar, h.a aVar) {
        this.f4918c = iVar;
        this.f4917b = aVar;
    }

    @Override // k1.h
    public final boolean b() {
        List list;
        boolean z5;
        boolean z6;
        boolean z7;
        ArrayList d6;
        ArrayList a6 = this.f4918c.a();
        if (a6.isEmpty()) {
            return false;
        }
        i<?> iVar = this.f4918c;
        com.bumptech.glide.j jVar = iVar.f4773c.f2801b;
        Class<?> cls = iVar.f4774d.getClass();
        Class<?> cls2 = iVar.f4777g;
        Class<?> cls3 = iVar.f4781k;
        t tVar = jVar.f2824h;
        e2.i iVar2 = (e2.i) ((AtomicReference) tVar.f4907a).getAndSet(null);
        if (iVar2 == null) {
            iVar2 = new e2.i(cls, cls2, cls3);
        } else {
            iVar2.f3829a = cls;
            iVar2.f3830b = cls2;
            iVar2.f3831c = cls3;
        }
        synchronized (((l.b) tVar.f4908b)) {
            list = (List) ((l.b) tVar.f4908b).getOrDefault(iVar2, null);
        }
        ((AtomicReference) tVar.f4907a).set(iVar2);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            o1.p pVar = jVar.f2817a;
            synchronized (pVar) {
                d6 = pVar.f5550a.d(cls);
            }
            Iterator it = d6.iterator();
            while (it.hasNext()) {
                Iterator it2 = jVar.f2819c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!jVar.f2822f.a(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            t tVar2 = jVar.f2824h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((l.b) tVar2.f4908b)) {
                ((l.b) tVar2.f4908b).put(new e2.i(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            if (File.class.equals(this.f4918c.f4781k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f4918c.f4774d.getClass() + " to " + this.f4918c.f4781k);
        }
        while (true) {
            List<o1.n<File, ?>> list2 = this.f4922g;
            if (list2 != null) {
                if (this.f4923h < list2.size()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    this.f4924i = null;
                    boolean z8 = false;
                    while (!z8) {
                        if (this.f4923h < this.f4922g.size()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z6) {
                            break;
                        }
                        List<o1.n<File, ?>> list3 = this.f4922g;
                        int i6 = this.f4923h;
                        this.f4923h = i6 + 1;
                        File file = this.f4925j;
                        i<?> iVar3 = this.f4918c;
                        this.f4924i = list3.get(i6).a(file, iVar3.f4775e, iVar3.f4776f, iVar3.f4779i);
                        if (this.f4924i != null) {
                            if (this.f4918c.c(this.f4924i.f5549c.a()) != null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                this.f4924i.f5549c.f(this.f4918c.f4785o, this);
                                z8 = true;
                            }
                        }
                    }
                    return z8;
                }
            }
            int i7 = this.f4920e + 1;
            this.f4920e = i7;
            if (i7 >= arrayList.size()) {
                int i8 = this.f4919d + 1;
                this.f4919d = i8;
                if (i8 >= a6.size()) {
                    return false;
                }
                this.f4920e = 0;
            }
            i1.f fVar = (i1.f) a6.get(this.f4919d);
            Class cls5 = (Class) arrayList.get(this.f4920e);
            i1.l<Z> e6 = this.f4918c.e(cls5);
            i<?> iVar4 = this.f4918c;
            this.f4926k = new y(iVar4.f4773c.f2800a, fVar, iVar4.f4784n, iVar4.f4775e, iVar4.f4776f, e6, cls5, iVar4.f4779i);
            File a7 = ((m.c) iVar4.f4778h).a().a(this.f4926k);
            this.f4925j = a7;
            if (a7 != null) {
                this.f4921f = fVar;
                this.f4922g = this.f4918c.f4773c.f2801b.e(a7);
                this.f4923h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        this.f4917b.d(this.f4926k, exc, this.f4924i.f5549c, i1.a.RESOURCE_DISK_CACHE);
    }

    @Override // k1.h
    public final void cancel() {
        n.a<?> aVar = this.f4924i;
        if (aVar != null) {
            aVar.f5549c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void d(Object obj) {
        this.f4917b.c(this.f4921f, obj, this.f4924i.f5549c, i1.a.RESOURCE_DISK_CACHE, this.f4926k);
    }
}
