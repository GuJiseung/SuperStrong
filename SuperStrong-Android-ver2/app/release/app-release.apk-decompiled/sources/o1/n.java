package o1;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final i1.f f5547a;

        /* renamed from: b  reason: collision with root package name */
        public final List<i1.f> f5548b;

        /* renamed from: c  reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f5549c;

        public a() {
            throw null;
        }

        public a(i1.f fVar, com.bumptech.glide.load.data.d<Data> dVar) {
            List<i1.f> emptyList = Collections.emptyList();
            androidx.activity.k.h(fVar);
            this.f5547a = fVar;
            androidx.activity.k.h(emptyList);
            this.f5548b = emptyList;
            androidx.activity.k.h(dVar);
            this.f5549c = dVar;
        }
    }

    a<Data> a(Model model, int i6, int i7, i1.h hVar);

    boolean b(Model model);
}
