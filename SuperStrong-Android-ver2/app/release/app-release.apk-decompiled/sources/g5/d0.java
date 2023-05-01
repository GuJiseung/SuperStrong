package g5;

import g5.c;
import g5.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import v4.d;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b  reason: collision with root package name */
    public final d.a f4219b;

    /* renamed from: c  reason: collision with root package name */
    public final v4.q f4220c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f.a> f4221d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f4222e;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f4218a = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4223f = false;

    public d0(d.a aVar, v4.q qVar, List list, List list2) {
        this.f4219b = aVar;
        this.f4220c = qVar;
        this.f4221d = list;
        this.f4222e = list2;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<c.a> list = this.f4222e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i6 = indexOf; i6 < size; i6++) {
            c<?, ?> a6 = list.get(i6).a(type, annotationArr);
            if (a6 != null) {
                return a6;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final e0<?> b(Method method) {
        e0<?> e0Var;
        e0<?> e0Var2 = (e0) this.f4218a.get(method);
        if (e0Var2 != null) {
            return e0Var2;
        }
        synchronized (this.f4218a) {
            e0Var = (e0) this.f4218a.get(method);
            if (e0Var == null) {
                e0Var = e0.b(this, method);
                this.f4218a.put(method, e0Var);
            }
        }
        return e0Var;
    }

    public final <T> f<T, v4.a0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<f.a> list = this.f4221d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i6 = indexOf; i6 < size; i6++) {
            f<T, v4.a0> a6 = list.get(i6).a(type);
            if (a6 != null) {
                return a6;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> f<v4.d0, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<f.a> list = this.f4221d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i6 = indexOf; i6 < size; i6++) {
            f<v4.d0, T> fVar = (f<v4.d0, T>) list.get(i6).b(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<f.a> list = this.f4221d;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            list.get(i6).getClass();
        }
    }
}
