package g5;

import g5.c;
import g5.i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class i extends c.a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4243a;

    /* loaded from: classes.dex */
    public static final class a<T> implements b<T> {

        /* renamed from: b  reason: collision with root package name */
        public final Executor f4244b;

        /* renamed from: c  reason: collision with root package name */
        public final b<T> f4245c;

        /* renamed from: g5.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0043a implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f4246a;

            public C0043a(d dVar) {
                this.f4246a = dVar;
            }

            @Override // g5.d
            public final void a(b<T> bVar, Throwable th) {
                a.this.f4244b.execute(new androidx.emoji2.text.g(1, this, this.f4246a, th));
            }

            @Override // g5.d
            public final void b(b<T> bVar, final b0<T> b0Var) {
                Executor executor = a.this.f4244b;
                final d dVar = this.f4246a;
                executor.execute(new Runnable() { // from class: g5.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.a aVar = i.a.this;
                        boolean o5 = aVar.f4245c.o();
                        d dVar2 = dVar;
                        if (o5) {
                            dVar2.a(aVar, new IOException("Canceled"));
                        } else {
                            dVar2.b(aVar, b0Var);
                        }
                    }
                });
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.f4244b = executor;
            this.f4245c = bVar;
        }

        @Override // g5.b
        public final void cancel() {
            this.f4245c.cancel();
        }

        @Override // g5.b
        /* renamed from: clone */
        public final b<T> m1clone() {
            return new a(this.f4244b, this.f4245c.clone());
        }

        @Override // g5.b
        public final void k(d<T> dVar) {
            this.f4245c.k(new C0043a(dVar));
        }

        @Override // g5.b
        public final v4.x n() {
            return this.f4245c.n();
        }

        @Override // g5.b
        public final boolean o() {
            return this.f4245c.o();
        }
    }

    public i(@Nullable Executor executor) {
        this.f4243a = executor;
    }

    @Override // g5.c.a
    @Nullable
    public final c a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (h0.e(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d6 = h0.d(0, (ParameterizedType) type);
            if (!h0.h(annotationArr, f0.class)) {
                executor = this.f4243a;
            }
            return new g(d6, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
