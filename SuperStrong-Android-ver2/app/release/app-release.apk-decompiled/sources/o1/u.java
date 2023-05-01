package o1;

import com.bumptech.glide.load.data.d;
import o1.n;
/* loaded from: classes.dex */
public final class u<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final u<?> f5579a = new u<>();

    /* loaded from: classes.dex */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f5580a = new a<>();

        @Override // o1.o
        public final n<Model, Model> a(r rVar) {
            return u.f5579a;
        }
    }

    /* loaded from: classes.dex */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: b  reason: collision with root package name */
        public final Model f5581b;

        public b(Model model) {
            this.f5581b = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Model> a() {
            return (Class<Model>) this.f5581b.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final i1.a e() {
            return i1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void f(com.bumptech.glide.i iVar, d.a<? super Model> aVar) {
            aVar.d((Model) this.f5581b);
        }
    }

    @Override // o1.n
    public final n.a<Model> a(Model model, int i6, int i7, i1.h hVar) {
        return new n.a<>(new d2.d(model), new b(model));
    }

    @Override // o1.n
    public final boolean b(Model model) {
        return true;
    }
}
