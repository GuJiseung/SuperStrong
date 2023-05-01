package w3;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super T> f6586a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f6587b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6588c;

    public a() {
        Type genericSuperclass = a.class.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a6 = s3.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f6587b = a6;
            this.f6586a = (Class<? super T>) s3.a.e(a6);
            this.f6588c = a6.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (s3.a.c(this.f6587b, ((a) obj).f6587b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6588c;
    }

    public final String toString() {
        return s3.a.h(this.f6587b);
    }

    public a(Type type) {
        type.getClass();
        Type a6 = s3.a.a(type);
        this.f6587b = a6;
        this.f6586a = (Class<? super T>) s3.a.e(a6);
        this.f6588c = a6.hashCode();
    }
}
