package g5;

import g5.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import v4.b0;
import v4.d;
import v4.n;
import v4.p;
import v4.q;
import v4.t;
import v4.w;
import v4.x;
/* loaded from: classes.dex */
public final class t<T> implements g5.b<T> {

    /* renamed from: b  reason: collision with root package name */
    public final a0 f4267b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f4268c;

    /* renamed from: d  reason: collision with root package name */
    public final d.a f4269d;

    /* renamed from: e  reason: collision with root package name */
    public final f<v4.d0, T> f4270e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f4271f;
    @GuardedBy("this")
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public v4.d f4272g;
    @GuardedBy("this")
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public Throwable f4273h;
    @GuardedBy("this")

    /* renamed from: i  reason: collision with root package name */
    public boolean f4274i;

    /* loaded from: classes.dex */
    public class a implements v4.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4275a;

        public a(d dVar) {
            this.f4275a = dVar;
        }

        public final void a(Throwable th) {
            try {
                this.f4275a.a(t.this, th);
            } catch (Throwable th2) {
                h0.m(th2);
                th2.printStackTrace();
            }
        }

        public final void b(v4.b0 b0Var) {
            t tVar = t.this;
            try {
                try {
                    this.f4275a.b(tVar, tVar.c(b0Var));
                } catch (Throwable th) {
                    h0.m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                h0.m(th2);
                a(th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends v4.d0 {

        /* renamed from: c  reason: collision with root package name */
        public final v4.d0 f4277c;

        /* renamed from: d  reason: collision with root package name */
        public final f5.t f4278d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public IOException f4279e;

        /* loaded from: classes.dex */
        public class a extends f5.j {
            public a(f5.g gVar) {
                super(gVar);
            }

            @Override // f5.y
            public final long B(f5.e eVar, long j5) {
                try {
                    return this.f3985b.B(eVar, 8192L);
                } catch (IOException e6) {
                    b.this.f4279e = e6;
                    throw e6;
                }
            }
        }

        public b(v4.d0 d0Var) {
            this.f4277c = d0Var;
            a aVar = new a(d0Var.h());
            Logger logger = f5.q.f4001a;
            this.f4278d = new f5.t(aVar);
        }

        @Override // v4.d0
        public final long c() {
            return this.f4277c.c();
        }

        @Override // v4.d0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f4277c.close();
        }

        @Override // v4.d0
        public final v4.s f() {
            return this.f4277c.f();
        }

        @Override // v4.d0
        public final f5.g h() {
            return this.f4278d;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends v4.d0 {
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public final v4.s f4281c;

        /* renamed from: d  reason: collision with root package name */
        public final long f4282d;

        public c(@Nullable v4.s sVar, long j5) {
            this.f4281c = sVar;
            this.f4282d = j5;
        }

        @Override // v4.d0
        public final long c() {
            return this.f4282d;
        }

        @Override // v4.d0
        public final v4.s f() {
            return this.f4281c;
        }

        @Override // v4.d0
        public final f5.g h() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public t(a0 a0Var, Object[] objArr, d.a aVar, f<v4.d0, T> fVar) {
        this.f4267b = a0Var;
        this.f4268c = objArr;
        this.f4269d = aVar;
        this.f4270e = fVar;
    }

    public final v4.d a() {
        q.a aVar;
        v4.q qVar;
        a0 a0Var = this.f4267b;
        a0Var.getClass();
        Object[] objArr = this.f4268c;
        int length = objArr.length;
        x<?>[] xVarArr = a0Var.f4186j;
        if (length == xVarArr.length) {
            z zVar = new z(a0Var.f4179c, a0Var.f4178b, a0Var.f4180d, a0Var.f4181e, a0Var.f4182f, a0Var.f4183g, a0Var.f4184h, a0Var.f4185i);
            if (a0Var.f4187k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i6 = 0; i6 < length; i6++) {
                arrayList.add(objArr[i6]);
                xVarArr[i6].a(zVar, objArr[i6]);
            }
            q.a aVar2 = zVar.f4335d;
            if (aVar2 != null) {
                qVar = aVar2.a();
            } else {
                String str = zVar.f4334c;
                v4.q qVar2 = zVar.f4333b;
                qVar2.getClass();
                try {
                    aVar = new q.a();
                    aVar.b(qVar2, str);
                } catch (IllegalArgumentException unused) {
                    aVar = null;
                }
                if (aVar != null) {
                    qVar = aVar.a();
                } else {
                    qVar = null;
                }
                if (qVar == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + qVar2 + ", Relative: " + zVar.f4334c);
                }
            }
            z.a aVar3 = zVar.f4342k;
            if (aVar3 == null) {
                n.a aVar4 = zVar.f4341j;
                if (aVar4 != null) {
                    aVar3 = new v4.n(aVar4.f6452a, aVar4.f6453b);
                } else {
                    t.a aVar5 = zVar.f4340i;
                    if (aVar5 != null) {
                        ArrayList arrayList2 = aVar5.f6494c;
                        if (!arrayList2.isEmpty()) {
                            aVar3 = new v4.t(aVar5.f6492a, aVar5.f6493b, arrayList2);
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        }
                    } else if (zVar.f4339h) {
                        byte[] bArr = new byte[0];
                        long j5 = 0;
                        byte[] bArr2 = w4.e.f6593a;
                        if ((j5 | j5) >= 0 && j5 <= j5 && j5 - j5 >= j5) {
                            aVar3 = new v4.z(0, bArr);
                        } else {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                    }
                }
            }
            v4.s sVar = zVar.f4338g;
            p.a aVar6 = zVar.f4337f;
            if (sVar != null) {
                if (aVar3 != null) {
                    aVar3 = new z.a(aVar3, sVar);
                } else {
                    aVar6.getClass();
                    v4.p.a("Content-Type");
                    String str2 = sVar.f6480a;
                    v4.p.b(str2, "Content-Type");
                    aVar6.a("Content-Type", str2);
                }
            }
            x.a aVar7 = zVar.f4336e;
            aVar7.f6562a = qVar;
            aVar6.getClass();
            ArrayList arrayList3 = aVar6.f6459a;
            p.a aVar8 = new p.a();
            Collections.addAll(aVar8.f6459a, (String[]) arrayList3.toArray(new String[arrayList3.size()]));
            aVar7.f6564c = aVar8;
            aVar7.b(zVar.f4332a, aVar3);
            aVar7.d(l.class, new l(a0Var.f4177a, arrayList));
            v4.w a6 = this.f4269d.a(aVar7.a());
            if (a6 != null) {
                return a6;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + xVarArr.length + ")");
    }

    @GuardedBy("this")
    public final v4.d b() {
        v4.d dVar = this.f4272g;
        if (dVar != null) {
            return dVar;
        }
        Throwable th = this.f4273h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            v4.d a6 = a();
            this.f4272g = a6;
            return a6;
        } catch (IOException | Error | RuntimeException e6) {
            h0.m(e6);
            this.f4273h = e6;
            throw e6;
        }
    }

    public final b0<T> c(v4.b0 b0Var) {
        b0.a aVar = new b0.a(b0Var);
        v4.d0 d0Var = b0Var.f6342h;
        aVar.f6355g = new c(d0Var.f(), d0Var.c());
        v4.b0 a6 = aVar.a();
        boolean z5 = true;
        int i6 = a6.f6338d;
        if (i6 >= 200 && i6 < 300) {
            if (i6 != 204 && i6 != 205) {
                b bVar = new b(d0Var);
                try {
                    T a7 = this.f4270e.a(bVar);
                    if (i6 < 200 || i6 >= 300) {
                        z5 = false;
                    }
                    if (z5) {
                        return new b0<>(a6, a7, null);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e6) {
                    IOException iOException = bVar.f4279e;
                    if (iOException == null) {
                        throw e6;
                    }
                    throw iOException;
                }
            }
            if (i6 < 200 || i6 >= 300) {
                z5 = false;
            }
            if (z5) {
                return new b0<>(a6, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            f5.e eVar = new f5.e();
            d0Var.h().v(eVar);
            v4.c0 c0Var = new v4.c0(d0Var.f(), d0Var.c(), eVar);
            if (i6 < 200 || i6 >= 300) {
                z5 = false;
            }
            if (!z5) {
                return new b0<>(a6, null, c0Var);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            d0Var.close();
        }
    }

    @Override // g5.b
    public final void cancel() {
        v4.d dVar;
        this.f4271f = true;
        synchronized (this) {
            dVar = this.f4272g;
        }
        if (dVar != null) {
            ((v4.w) dVar).f6549c.a();
        }
    }

    @Override // g5.b
    public final g5.b clone() {
        return new t(this.f4267b, this.f4268c, this.f4269d, this.f4270e);
    }

    @Override // g5.b
    public final void k(d<T> dVar) {
        v4.d dVar2;
        Throwable th;
        w.a a6;
        synchronized (this) {
            if (!this.f4274i) {
                this.f4274i = true;
                dVar2 = this.f4272g;
                th = this.f4273h;
                if (dVar2 == null && th == null) {
                    v4.d a7 = a();
                    this.f4272g = a7;
                    dVar2 = a7;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.a(this, th);
            return;
        }
        if (this.f4271f) {
            ((v4.w) dVar2).f6549c.a();
        }
        a aVar = new a(dVar);
        v4.w wVar = (v4.w) dVar2;
        synchronized (wVar) {
            if (!wVar.f6552f) {
                wVar.f6552f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        y4.i iVar = wVar.f6549c;
        iVar.getClass();
        iVar.f6904f = c5.f.f2787a.k();
        iVar.f6902d.getClass();
        v4.k kVar = wVar.f6548b.f6499b;
        w.a aVar2 = new w.a(aVar);
        synchronized (kVar) {
            try {
                kVar.f6444d.add(aVar2);
                if (!wVar.f6551e && (a6 = kVar.a(wVar.f6550d.f6556a.f6464d)) != null) {
                    aVar2.f6554d = a6.f6554d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        kVar.c();
    }

    @Override // g5.b
    public final synchronized v4.x n() {
        try {
        } catch (IOException e6) {
            throw new RuntimeException("Unable to create request.", e6);
        }
        return ((v4.w) b()).f6550d;
    }

    @Override // g5.b
    public final boolean o() {
        boolean z5;
        boolean z6 = true;
        if (this.f4271f) {
            return true;
        }
        synchronized (this) {
            v4.d dVar = this.f4272g;
            if (dVar != null) {
                y4.i iVar = ((v4.w) dVar).f6549c;
                synchronized (iVar.f6900b) {
                    z5 = iVar.f6911m;
                }
                if (z5) {
                }
            }
            z6 = false;
        }
        return z6;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final Object m2clone() {
        return new t(this.f4267b, this.f4268c, this.f4269d, this.f4270e);
    }
}
