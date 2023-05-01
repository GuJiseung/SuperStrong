package t3;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class b implements y {

    /* renamed from: b  reason: collision with root package name */
    public final s3.c f6137b;

    /* loaded from: classes.dex */
    public static final class a<E> extends x<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final n f6138a;

        /* renamed from: b  reason: collision with root package name */
        public final s3.n<? extends Collection<E>> f6139b;

        public a(q3.j jVar, Type type, x<E> xVar, s3.n<? extends Collection<E>> nVar) {
            this.f6138a = new n(jVar, xVar, type);
            this.f6139b = nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q3.x
        public final Object a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            Collection collection = (Collection) ((Collection<E>) this.f6139b.e());
            aVar.c();
            while (aVar.q()) {
                collection.add(this.f6138a.a(aVar));
            }
            aVar.k();
            return collection;
        }

        @Override // q3.x
        public final void b(x3.c cVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                cVar.q();
                return;
            }
            cVar.f();
            for (E e6 : collection) {
                this.f6138a.b(cVar, e6);
            }
            cVar.k();
        }
    }

    public b(s3.c cVar) {
        this.f6137b = cVar;
    }

    @Override // q3.y
    public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
        Type type;
        Type type2 = aVar.f6587b;
        Class<? super T> cls = aVar.f6586a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type f6 = s3.a.f(type2, cls, Collection.class);
        if (f6 instanceof WildcardType) {
            f6 = ((WildcardType) f6).getUpperBounds()[0];
        }
        if (f6 instanceof ParameterizedType) {
            type = ((ParameterizedType) f6).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new a(jVar, type, jVar.c(new w3.a<>(type)), this.f6137b.a(aVar));
    }
}
