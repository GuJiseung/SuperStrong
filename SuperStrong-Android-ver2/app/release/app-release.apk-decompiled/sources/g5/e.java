package g5;

import g5.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f4224a = new e();

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    public static final class a<R> implements g5.c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f4225a;

        @IgnoreJRERequirement
        /* renamed from: g5.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0042a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<R> f4226a;

            public C0042a(b bVar) {
                this.f4226a = bVar;
            }

            @Override // g5.d
            public final void a(g5.b<R> bVar, Throwable th) {
                this.f4226a.completeExceptionally(th);
            }

            @Override // g5.d
            public final void b(g5.b<R> bVar, b0<R> b0Var) {
                boolean a6 = b0Var.a();
                CompletableFuture<R> completableFuture = this.f4226a;
                if (a6) {
                    completableFuture.complete(b0Var.f4212b);
                } else {
                    completableFuture.completeExceptionally(new j(b0Var));
                }
            }
        }

        public a(Type type) {
            this.f4225a = type;
        }

        @Override // g5.c
        public final Type a() {
            return this.f4225a;
        }

        @Override // g5.c
        public final Object b(t tVar) {
            b bVar = new b(tVar);
            tVar.k(new C0042a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: b  reason: collision with root package name */
        public final g5.b<?> f4227b;

        public b(t tVar) {
            this.f4227b = tVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z5) {
            if (z5) {
                this.f4227b.cancel();
            }
            return super.cancel(z5);
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    public static final class c<R> implements g5.c<R, CompletableFuture<b0<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f4228a;

        @IgnoreJRERequirement
        /* loaded from: classes.dex */
        public class a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<b0<R>> f4229a;

            public a(b bVar) {
                this.f4229a = bVar;
            }

            @Override // g5.d
            public final void a(g5.b<R> bVar, Throwable th) {
                this.f4229a.completeExceptionally(th);
            }

            @Override // g5.d
            public final void b(g5.b<R> bVar, b0<R> b0Var) {
                this.f4229a.complete(b0Var);
            }
        }

        public c(Type type) {
            this.f4228a = type;
        }

        @Override // g5.c
        public final Type a() {
            return this.f4228a;
        }

        @Override // g5.c
        public final Object b(t tVar) {
            b bVar = new b(tVar);
            tVar.k(new a(bVar));
            return bVar;
        }
    }

    @Override // g5.c.a
    @Nullable
    public final g5.c a(Type type, Annotation[] annotationArr) {
        if (h0.e(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d6 = h0.d(0, (ParameterizedType) type);
            if (h0.e(d6) != b0.class) {
                return new a(d6);
            }
            if (d6 instanceof ParameterizedType) {
                return new c(h0.d(0, (ParameterizedType) d6));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
