package s3;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Type, q3.k<?>> f6004a;

    /* renamed from: b  reason: collision with root package name */
    public final v3.b f6005b = v3.b.f6320a;

    /* loaded from: classes.dex */
    public class a implements n<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q3.k f6006b;

        public a(q3.k kVar, Type type) {
            this.f6006b = kVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // s3.n
        public final T e() {
            return this.f6006b.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements n<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q3.k f6007b;

        public b(q3.k kVar, Type type) {
            this.f6007b = kVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // s3.n
        public final T e() {
            return this.f6007b.a();
        }
    }

    public c(Map<Type, q3.k<?>> map) {
        this.f6004a = map;
    }

    public final <T> n<T> a(w3.a<T> aVar) {
        d dVar;
        Type type = aVar.f6587b;
        Map<Type, q3.k<?>> map = this.f6004a;
        q3.k<?> kVar = map.get(type);
        if (kVar != null) {
            return new a(kVar, type);
        }
        Class<? super T> cls = aVar.f6586a;
        q3.k<?> kVar2 = map.get(cls);
        if (kVar2 != null) {
            return new b(kVar2, type);
        }
        n<T> nVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f6005b.a(declaredConstructor);
            }
            dVar = new d(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                nVar = new kotlinx.coroutines.internal.f();
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                nVar = new e(type);
            } else if (Set.class.isAssignableFrom(cls)) {
                nVar = new f();
            } else if (Queue.class.isAssignableFrom(cls)) {
                nVar = new g();
            } else {
                nVar = new h();
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                nVar = new i();
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                nVar = new androidx.activity.k();
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                nVar = new c0.n();
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    type2.getClass();
                    Type a6 = s3.a.a(type2);
                    Class<?> e6 = s3.a.e(a6);
                    a6.hashCode();
                    if (!String.class.isAssignableFrom(e6)) {
                        nVar = new c.a();
                    }
                }
                nVar = new c.b();
            }
        }
        if (nVar != null) {
            return nVar;
        }
        return new s3.b(cls, type);
    }

    public final String toString() {
        return this.f6004a.toString();
    }
}
