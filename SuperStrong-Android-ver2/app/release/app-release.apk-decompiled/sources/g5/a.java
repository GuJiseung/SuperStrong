package g5;

import g5.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4170a = true;

    /* renamed from: g5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0041a implements g5.f<v4.d0, v4.d0> {

        /* renamed from: b  reason: collision with root package name */
        public static final C0041a f4171b = new C0041a();

        @Override // g5.f
        public final v4.d0 a(v4.d0 d0Var) {
            v4.d0 d0Var2 = d0Var;
            try {
                f5.e eVar = new f5.e();
                d0Var2.h().v(eVar);
                return new v4.c0(d0Var2.f(), d0Var2.c(), eVar);
            } finally {
                d0Var2.close();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g5.f<v4.a0, v4.a0> {

        /* renamed from: b  reason: collision with root package name */
        public static final b f4172b = new b();

        @Override // g5.f
        public final v4.a0 a(v4.a0 a0Var) {
            return a0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements g5.f<v4.d0, v4.d0> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f4173b = new c();

        @Override // g5.f
        public final v4.d0 a(v4.d0 d0Var) {
            return d0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements g5.f<Object, String> {

        /* renamed from: b  reason: collision with root package name */
        public static final d f4174b = new d();

        @Override // g5.f
        public final String a(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements g5.f<v4.d0, c4.h> {

        /* renamed from: b  reason: collision with root package name */
        public static final e f4175b = new e();

        @Override // g5.f
        public final c4.h a(v4.d0 d0Var) {
            d0Var.close();
            return c4.h.f2763a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements g5.f<v4.d0, Void> {

        /* renamed from: b  reason: collision with root package name */
        public static final f f4176b = new f();

        @Override // g5.f
        public final Void a(v4.d0 d0Var) {
            d0Var.close();
            return null;
        }
    }

    @Override // g5.f.a
    @Nullable
    public final g5.f a(Type type) {
        if (v4.a0.class.isAssignableFrom(h0.e(type))) {
            return b.f4172b;
        }
        return null;
    }

    @Override // g5.f.a
    @Nullable
    public final g5.f<v4.d0, ?> b(Type type, Annotation[] annotationArr, d0 d0Var) {
        if (type == v4.d0.class) {
            return h0.h(annotationArr, i5.w.class) ? c.f4173b : C0041a.f4171b;
        } else if (type == Void.class) {
            return f.f4176b;
        } else {
            if (this.f4170a && type == c4.h.class) {
                try {
                    return e.f4175b;
                } catch (NoClassDefFoundError unused) {
                    this.f4170a = false;
                    return null;
                }
            }
            return null;
        }
    }
}
