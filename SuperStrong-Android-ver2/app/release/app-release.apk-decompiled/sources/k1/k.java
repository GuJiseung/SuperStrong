package k1;

import android.util.Log;
import com.bumptech.glide.j;
import f2.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k1.j;
import o1.n;
/* loaded from: classes.dex */
public final class k<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f4820a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends i1.j<DataType, ResourceType>> f4821b;

    /* renamed from: c  reason: collision with root package name */
    public final w1.b<ResourceType, Transcode> f4822c;

    /* renamed from: d  reason: collision with root package name */
    public final e0.d<List<Throwable>> f4823d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4824e;

    public k(Class cls, Class cls2, Class cls3, List list, w1.b bVar, a.c cVar) {
        this.f4820a = cls;
        this.f4821b = list;
        this.f4822c = bVar;
        this.f4823d = cVar;
        this.f4824e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w a(int i6, int i7, i1.h hVar, com.bumptech.glide.load.data.e eVar, j.b bVar) {
        w wVar;
        i1.l lVar;
        boolean z5;
        i1.c cVar;
        boolean z6;
        i1.f fVar;
        e0.d<List<Throwable>> dVar = this.f4823d;
        List<Throwable> b6 = dVar.b();
        androidx.activity.k.h(b6);
        List<Throwable> list = b6;
        try {
            w<ResourceType> b7 = b(eVar, i6, i7, hVar, list);
            dVar.a(list);
            j jVar = j.this;
            jVar.getClass();
            Class<?> cls = b7.get().getClass();
            i1.a aVar = i1.a.RESOURCE_DISK_CACHE;
            i1.a aVar2 = bVar.f4812a;
            i<R> iVar = jVar.f4789b;
            i1.k kVar = null;
            if (aVar2 != aVar) {
                i1.l e6 = iVar.e(cls);
                wVar = e6.a(jVar.f4796i, b7, jVar.f4800m, jVar.f4801n);
                lVar = e6;
            } else {
                wVar = b7;
                lVar = null;
            }
            if (!b7.equals(wVar)) {
                b7.e();
            }
            if (iVar.f4773c.f2801b.f2820d.a(wVar.d()) != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                com.bumptech.glide.j jVar2 = iVar.f4773c.f2801b;
                jVar2.getClass();
                i1.k a6 = jVar2.f2820d.a(wVar.d());
                if (a6 != null) {
                    cVar = a6.d(jVar.f4803p);
                    kVar = a6;
                } else {
                    throw new j.d(wVar.d());
                }
            } else {
                cVar = i1.c.NONE;
            }
            i1.f fVar2 = jVar.f4810y;
            ArrayList b8 = iVar.b();
            int size = b8.size();
            int i8 = 0;
            while (true) {
                if (i8 < size) {
                    if (((n.a) b8.get(i8)).f5547a.equals(fVar2)) {
                        z6 = true;
                        break;
                    }
                    i8++;
                } else {
                    z6 = false;
                    break;
                }
            }
            if (jVar.f4802o.d(!z6, aVar2, cVar)) {
                if (kVar != null) {
                    int ordinal = cVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            fVar = new y(iVar.f4773c.f2800a, jVar.f4810y, jVar.f4797j, jVar.f4800m, jVar.f4801n, lVar, cls, jVar.f4803p);
                        } else {
                            throw new IllegalArgumentException("Unknown strategy: " + cVar);
                        }
                    } else {
                        fVar = new f(jVar.f4810y, jVar.f4797j);
                    }
                    v<Z> vVar = (v) v.f4912f.b();
                    androidx.activity.k.h(vVar);
                    vVar.f4916e = false;
                    vVar.f4915d = true;
                    vVar.f4914c = wVar;
                    j.c<?> cVar2 = jVar.f4794g;
                    cVar2.f4814a = fVar;
                    cVar2.f4815b = kVar;
                    cVar2.f4816c = vVar;
                    wVar = vVar;
                } else {
                    throw new j.d(wVar.get().getClass());
                }
            }
            return this.f4822c.a(wVar, hVar);
        } catch (Throwable th) {
            dVar.a(list);
            throw th;
        }
    }

    public final w<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i6, int i7, i1.h hVar, List<Throwable> list) {
        List<? extends i1.j<DataType, ResourceType>> list2 = this.f4821b;
        int size = list2.size();
        w<ResourceType> wVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            i1.j<DataType, ResourceType> jVar = list2.get(i8);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    wVar = jVar.a(eVar.a(), i6, i7, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e6) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e6);
                }
                list.add(e6);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new r(this.f4824e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f4820a + ", decoders=" + this.f4821b + ", transcoder=" + this.f4822c + '}';
    }
}
