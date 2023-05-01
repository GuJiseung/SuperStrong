package v4;

import java.io.Closeable;
import javax.annotation.Nullable;
import v4.p;
/* loaded from: classes.dex */
public final class b0 implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    public final x f6336b;

    /* renamed from: c  reason: collision with root package name */
    public final v f6337c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6338d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6339e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final o f6340f;

    /* renamed from: g  reason: collision with root package name */
    public final p f6341g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final d0 f6342h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final b0 f6343i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final b0 f6344j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final b0 f6345k;

    /* renamed from: l  reason: collision with root package name */
    public final long f6346l;

    /* renamed from: m  reason: collision with root package name */
    public final long f6347m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final y4.c f6348n;

    /* loaded from: classes.dex */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public x f6349a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public v f6350b;

        /* renamed from: c  reason: collision with root package name */
        public int f6351c;

        /* renamed from: d  reason: collision with root package name */
        public String f6352d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public o f6353e;

        /* renamed from: f  reason: collision with root package name */
        public p.a f6354f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public d0 f6355g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public b0 f6356h;
        @Nullable

        /* renamed from: i  reason: collision with root package name */
        public b0 f6357i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public b0 f6358j;

        /* renamed from: k  reason: collision with root package name */
        public long f6359k;

        /* renamed from: l  reason: collision with root package name */
        public long f6360l;
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        public y4.c f6361m;

        public a() {
            this.f6351c = -1;
            this.f6354f = new p.a();
        }

        public a(b0 b0Var) {
            this.f6351c = -1;
            this.f6349a = b0Var.f6336b;
            this.f6350b = b0Var.f6337c;
            this.f6351c = b0Var.f6338d;
            this.f6352d = b0Var.f6339e;
            this.f6353e = b0Var.f6340f;
            this.f6354f = b0Var.f6341g.e();
            this.f6355g = b0Var.f6342h;
            this.f6356h = b0Var.f6343i;
            this.f6357i = b0Var.f6344j;
            this.f6358j = b0Var.f6345k;
            this.f6359k = b0Var.f6346l;
            this.f6360l = b0Var.f6347m;
            this.f6361m = b0Var.f6348n;
        }

        public static void b(String str, b0 b0Var) {
            if (b0Var.f6342h != null) {
                throw new IllegalArgumentException(str.concat(".body != null"));
            }
            if (b0Var.f6343i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            if (b0Var.f6344j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            }
            if (b0Var.f6345k != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null"));
            }
        }

        public final b0 a() {
            if (this.f6349a != null) {
                if (this.f6350b != null) {
                    if (this.f6351c >= 0) {
                        if (this.f6352d != null) {
                            return new b0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f6351c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public b0(a aVar) {
        this.f6336b = aVar.f6349a;
        this.f6337c = aVar.f6350b;
        this.f6338d = aVar.f6351c;
        this.f6339e = aVar.f6352d;
        this.f6340f = aVar.f6353e;
        p.a aVar2 = aVar.f6354f;
        aVar2.getClass();
        this.f6341g = new p(aVar2);
        this.f6342h = aVar.f6355g;
        this.f6343i = aVar.f6356h;
        this.f6344j = aVar.f6357i;
        this.f6345k = aVar.f6358j;
        this.f6346l = aVar.f6359k;
        this.f6347m = aVar.f6360l;
        this.f6348n = aVar.f6361m;
    }

    @Nullable
    public final String c(String str) {
        String c6 = this.f6341g.c(str);
        if (c6 != null) {
            return c6;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d0 d0Var = this.f6342h;
        if (d0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        d0Var.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f6337c + ", code=" + this.f6338d + ", message=" + this.f6339e + ", url=" + this.f6336b.f6556a + '}';
    }
}
