package k1;

import f2.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k1.j;
/* loaded from: classes.dex */
public final class u<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final e0.d<List<Throwable>> f4909a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends k<Data, ResourceType, Transcode>> f4910b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4911c;

    public u(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.f4909a = cVar;
        if (!list.isEmpty()) {
            this.f4910b = list;
            this.f4911c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final w a(int i6, int i7, i1.h hVar, com.bumptech.glide.load.data.e eVar, j.b bVar) {
        e0.d<List<Throwable>> dVar = this.f4909a;
        List<Throwable> b6 = dVar.b();
        androidx.activity.k.h(b6);
        List<Throwable> list = b6;
        try {
            List<? extends k<Data, ResourceType, Transcode>> list2 = this.f4910b;
            int size = list2.size();
            w wVar = null;
            for (int i8 = 0; i8 < size; i8++) {
                try {
                    wVar = list2.get(i8).a(i6, i7, hVar, eVar, bVar);
                } catch (r e6) {
                    list.add(e6);
                }
                if (wVar != null) {
                    break;
                }
            }
            if (wVar != null) {
                return wVar;
            }
            throw new r(this.f4911c, new ArrayList(list));
        } finally {
            dVar.a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f4910b.toArray()) + '}';
    }
}
