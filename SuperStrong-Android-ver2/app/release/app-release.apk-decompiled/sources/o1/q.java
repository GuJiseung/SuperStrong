package o1;

import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o1.n;
/* loaded from: classes.dex */
public final class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n<Model, Data>> f5554a;

    /* renamed from: b  reason: collision with root package name */
    public final e0.d<List<Throwable>> f5555b;

    /* loaded from: classes.dex */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: b  reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f5556b;

        /* renamed from: c  reason: collision with root package name */
        public final e0.d<List<Throwable>> f5557c;

        /* renamed from: d  reason: collision with root package name */
        public int f5558d;

        /* renamed from: e  reason: collision with root package name */
        public com.bumptech.glide.i f5559e;

        /* renamed from: f  reason: collision with root package name */
        public d.a<? super Data> f5560f;

        /* renamed from: g  reason: collision with root package name */
        public List<Throwable> f5561g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5562h;

        public a(ArrayList arrayList, e0.d dVar) {
            this.f5557c = dVar;
            if (!arrayList.isEmpty()) {
                this.f5556b = arrayList;
                this.f5558d = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f5556b.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            List<Throwable> list = this.f5561g;
            if (list != null) {
                this.f5557c.a(list);
            }
            this.f5561g = null;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f5556b) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void c(Exception exc) {
            List<Throwable> list = this.f5561g;
            androidx.activity.k.h(list);
            list.add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f5562h = true;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f5556b) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void d(Data data) {
            if (data != null) {
                this.f5560f.d(data);
            } else {
                g();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final i1.a e() {
            return this.f5556b.get(0).e();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void f(com.bumptech.glide.i iVar, d.a<? super Data> aVar) {
            this.f5559e = iVar;
            this.f5560f = aVar;
            this.f5561g = this.f5557c.b();
            this.f5556b.get(this.f5558d).f(iVar, this);
            if (this.f5562h) {
                cancel();
            }
        }

        public final void g() {
            if (this.f5562h) {
                return;
            }
            if (this.f5558d < this.f5556b.size() - 1) {
                this.f5558d++;
                f(this.f5559e, this.f5560f);
                return;
            }
            androidx.activity.k.h(this.f5561g);
            this.f5560f.c(new k1.r("Fetch failed", new ArrayList(this.f5561g)));
        }
    }

    public q(ArrayList arrayList, e0.d dVar) {
        this.f5554a = arrayList;
        this.f5555b = dVar;
    }

    @Override // o1.n
    public final n.a<Data> a(Model model, int i6, int i7, i1.h hVar) {
        n.a<Data> a6;
        List<n<Model, Data>> list = this.f5554a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        i1.f fVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            n<Model, Data> nVar = list.get(i8);
            if (nVar.b(model) && (a6 = nVar.a(model, i6, i7, hVar)) != null) {
                arrayList.add(a6.f5549c);
                fVar = a6.f5547a;
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a<>(fVar, new a(arrayList, this.f5555b));
    }

    @Override // o1.n
    public final boolean b(Model model) {
        for (n<Model, Data> nVar : this.f5554a) {
            if (nVar.b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f5554a.toArray()) + '}';
    }
}
