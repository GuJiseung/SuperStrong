package t3;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class a<E> extends x<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final C0091a f6134c = new C0091a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f6135a;

    /* renamed from: b  reason: collision with root package name */
    public final n f6136b;

    /* renamed from: t3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0091a implements y {
        @Override // q3.y
        public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
            Type componentType;
            Type type = aVar.f6587b;
            boolean z5 = type instanceof GenericArrayType;
            if (!z5 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            if (z5) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = ((Class) type).getComponentType();
            }
            return new a(jVar, jVar.c(new w3.a<>(componentType)), s3.a.e(componentType));
        }
    }

    public a(q3.j jVar, x<E> xVar, Class<E> cls) {
        this.f6136b = new n(jVar, xVar, cls);
        this.f6135a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q3.x
    public final Object a(x3.a aVar) {
        if (aVar.M() == 9) {
            aVar.I();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.q()) {
            arrayList.add(this.f6136b.a(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f6135a, size);
        for (int i6 = 0; i6 < size; i6++) {
            Array.set(newInstance, i6, arrayList.get(i6));
        }
        return newInstance;
    }

    @Override // q3.x
    public final void b(x3.c cVar, Object obj) {
        if (obj == null) {
            cVar.q();
            return;
        }
        cVar.f();
        int length = Array.getLength(obj);
        for (int i6 = 0; i6 < length; i6++) {
            this.f6136b.b(cVar, Array.get(obj, i6));
        }
        cVar.k();
    }
}
