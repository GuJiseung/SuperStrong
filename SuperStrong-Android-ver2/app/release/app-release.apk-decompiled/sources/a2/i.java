package a2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import c2.a;
import e2.e;
import f2.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k1.m;
import k1.r;
import k1.w;
import o1.k;
/* loaded from: classes.dex */
public final class i<R> implements c, b2.f, h {
    public static final boolean D = Log.isLoggable("Request", 2);
    public int A;
    public boolean B;
    public final RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    public final String f135a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f136b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f137c;

    /* renamed from: d  reason: collision with root package name */
    public final f<R> f138d;

    /* renamed from: e  reason: collision with root package name */
    public final e f139e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f140f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bumptech.glide.g f141g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f142h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f143i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f144j;

    /* renamed from: k  reason: collision with root package name */
    public final int f145k;

    /* renamed from: l  reason: collision with root package name */
    public final int f146l;

    /* renamed from: m  reason: collision with root package name */
    public final com.bumptech.glide.i f147m;

    /* renamed from: n  reason: collision with root package name */
    public final b2.g<R> f148n;

    /* renamed from: o  reason: collision with root package name */
    public final List<f<R>> f149o;

    /* renamed from: p  reason: collision with root package name */
    public final c2.b<? super R> f150p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f151q;

    /* renamed from: r  reason: collision with root package name */
    public w<R> f152r;
    public m.d s;

    /* renamed from: t  reason: collision with root package name */
    public long f153t;
    public volatile m u;

    /* renamed from: v  reason: collision with root package name */
    public int f154v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f155w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f156x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f157y;

    /* renamed from: z  reason: collision with root package name */
    public int f158z;

    public i(Context context, com.bumptech.glide.g gVar, Object obj, Object obj2, Class cls, a aVar, int i6, int i7, com.bumptech.glide.i iVar, b2.g gVar2, ArrayList arrayList, e eVar, m mVar, a.C0020a c0020a) {
        e.a aVar2 = e2.e.f3819a;
        this.f135a = D ? String.valueOf(hashCode()) : null;
        this.f136b = new d.a();
        this.f137c = obj;
        this.f140f = context;
        this.f141g = gVar;
        this.f142h = obj2;
        this.f143i = cls;
        this.f144j = aVar;
        this.f145k = i6;
        this.f146l = i7;
        this.f147m = iVar;
        this.f148n = gVar2;
        this.f138d = null;
        this.f149o = arrayList;
        this.f139e = eVar;
        this.u = mVar;
        this.f150p = c0020a;
        this.f151q = aVar2;
        this.f154v = 1;
        if (this.C == null && gVar.f2807h.f2810a.containsKey(com.bumptech.glide.e.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // a2.c
    public final boolean a() {
        boolean z5;
        synchronized (this.f137c) {
            z5 = this.f154v == 4;
        }
        return z5;
    }

    @Override // b2.f
    public final void b(int i6, int i7) {
        Object obj;
        int round;
        int i8 = i6;
        this.f136b.a();
        Object obj2 = this.f137c;
        synchronized (obj2) {
            try {
                boolean z5 = D;
                if (z5) {
                    l("Got onSizeReady in " + e2.f.a(this.f153t));
                }
                if (this.f154v == 3) {
                    this.f154v = 2;
                    float f6 = this.f144j.f107c;
                    if (i8 != Integer.MIN_VALUE) {
                        i8 = Math.round(i8 * f6);
                    }
                    this.f158z = i8;
                    if (i7 == Integer.MIN_VALUE) {
                        round = i7;
                    } else {
                        round = Math.round(f6 * i7);
                    }
                    this.A = round;
                    if (z5) {
                        l("finished setup for calling load in " + e2.f.a(this.f153t));
                    }
                    m mVar = this.u;
                    com.bumptech.glide.g gVar = this.f141g;
                    Object obj3 = this.f142h;
                    a<?> aVar = this.f144j;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.s = mVar.b(gVar, obj3, aVar.f117m, this.f158z, this.A, aVar.f123t, this.f143i, this.f147m, aVar.f108d, aVar.s, aVar.f118n, aVar.f128z, aVar.f122r, aVar.f114j, aVar.f126x, aVar.A, aVar.f127y, this, this.f151q);
                                if (this.f154v != 2) {
                                    this.s = null;
                                }
                                if (z5) {
                                    l("finished onSizeReady in " + e2.f.a(this.f153t));
                                }
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    @Override // a2.c
    public final boolean c() {
        boolean z5;
        synchronized (this.f137c) {
            z5 = this.f154v == 6;
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002f A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:10:0x0013, B:12:0x001b, B:14:0x001f, B:16:0x0023, B:22:0x002f, B:23:0x0038, B:24:0x003a, B:28:0x0046, B:29:0x004d), top: B:33:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // a2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f137c
            monitor-enter(r0)
            boolean r1 = r5.B     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L46
            f2.d$a r1 = r5.f136b     // Catch: java.lang.Throwable -> L4e
            r1.a()     // Catch: java.lang.Throwable -> L4e
            int r1 = r5.f154v     // Catch: java.lang.Throwable -> L4e
            r2 = 6
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            return
        L13:
            r5.g()     // Catch: java.lang.Throwable -> L4e
            k1.w<R> r1 = r5.f152r     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            if (r1 == 0) goto L1e
            r5.f152r = r3     // Catch: java.lang.Throwable -> L4e
            goto L1f
        L1e:
            r1 = r3
        L1f:
            a2.e r3 = r5.f139e     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2c
            boolean r3 = r3.h(r5)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r3 = 0
            goto L2d
        L2c:
            r3 = 1
        L2d:
            if (r3 == 0) goto L38
            b2.g<R> r3 = r5.f148n     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.Drawable r4 = r5.h()     // Catch: java.lang.Throwable -> L4e
            r3.h(r4)     // Catch: java.lang.Throwable -> L4e
        L38:
            r5.f154v = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L45
            k1.m r0 = r5.u
            r0.getClass()
            k1.m.e(r1)
        L45:
            return
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.i.clear():void");
    }

    @Override // a2.c
    public final boolean d(c cVar) {
        int i6;
        int i7;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        com.bumptech.glide.i iVar;
        int i8;
        int i9;
        int i10;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        com.bumptech.glide.i iVar2;
        int i11;
        boolean equals;
        if (!(cVar instanceof i)) {
            return false;
        }
        synchronized (this.f137c) {
            i6 = this.f145k;
            i7 = this.f146l;
            obj = this.f142h;
            cls = this.f143i;
            aVar = this.f144j;
            iVar = this.f147m;
            List<f<R>> list = this.f149o;
            if (list != null) {
                i8 = list.size();
            } else {
                i8 = 0;
            }
        }
        i iVar3 = (i) cVar;
        synchronized (iVar3.f137c) {
            i9 = iVar3.f145k;
            i10 = iVar3.f146l;
            obj2 = iVar3.f142h;
            cls2 = iVar3.f143i;
            aVar2 = iVar3.f144j;
            iVar2 = iVar3.f147m;
            List<f<R>> list2 = iVar3.f149o;
            if (list2 != null) {
                i11 = list2.size();
            } else {
                i11 = 0;
            }
        }
        if (i6 == i9 && i7 == i10) {
            char[] cArr = e2.j.f3832a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else if (obj instanceof k) {
                equals = ((k) obj).a();
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2) && aVar.equals(aVar2) && iVar == iVar2 && i8 == i11) {
                return true;
            }
        }
        return false;
    }

    @Override // a2.c
    public final void e() {
        synchronized (this.f137c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // a2.c
    public final void f() {
        int i6;
        synchronized (this.f137c) {
            try {
                if (!this.B) {
                    this.f136b.a();
                    int i7 = e2.f.f3822b;
                    this.f153t = SystemClock.elapsedRealtimeNanos();
                    int i8 = 3;
                    if (this.f142h == null) {
                        if (e2.j.g(this.f145k, this.f146l)) {
                            this.f158z = this.f145k;
                            this.A = this.f146l;
                        }
                        if (this.f157y == null) {
                            a<?> aVar = this.f144j;
                            Drawable drawable = aVar.f120p;
                            this.f157y = drawable;
                            if (drawable == null && (i6 = aVar.f121q) > 0) {
                                this.f157y = k(i6);
                            }
                        }
                        if (this.f157y == null) {
                            i8 = 5;
                        }
                        m(new r("Received null model"), i8);
                        return;
                    }
                    int i9 = this.f154v;
                    if (i9 != 2) {
                        boolean z5 = false;
                        if (i9 == 4) {
                            n(this.f152r, i1.a.MEMORY_CACHE, false);
                            return;
                        }
                        this.f154v = 3;
                        if (e2.j.g(this.f145k, this.f146l)) {
                            b(this.f145k, this.f146l);
                        } else {
                            this.f148n.e(this);
                        }
                        int i10 = this.f154v;
                        if (i10 == 2 || i10 == 3) {
                            e eVar = this.f139e;
                            if ((eVar == null || eVar.g(this)) ? true : true) {
                                this.f148n.f(h());
                            }
                        }
                        if (D) {
                            l("finished run method in " + e2.f.a(this.f153t));
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        if (!this.B) {
            this.f136b.a();
            this.f148n.i(this);
            m.d dVar = this.s;
            if (dVar != null) {
                synchronized (m.this) {
                    dVar.f4850a.h(dVar.f4851b);
                }
                this.s = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable h() {
        int i6;
        if (this.f156x == null) {
            a<?> aVar = this.f144j;
            Drawable drawable = aVar.f112h;
            this.f156x = drawable;
            if (drawable == null && (i6 = aVar.f113i) > 0) {
                this.f156x = k(i6);
            }
        }
        return this.f156x;
    }

    @Override // a2.c
    public final boolean i() {
        boolean z5;
        synchronized (this.f137c) {
            z5 = this.f154v == 4;
        }
        return z5;
    }

    @Override // a2.c
    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f137c) {
            int i6 = this.f154v;
            z5 = i6 == 2 || i6 == 3;
        }
        return z5;
    }

    public final boolean j() {
        e eVar = this.f139e;
        return eVar == null || !eVar.getRoot().a();
    }

    public final Drawable k(int i6) {
        Resources.Theme theme = this.f144j.f124v;
        if (theme == null) {
            theme = this.f140f.getTheme();
        }
        com.bumptech.glide.g gVar = this.f141g;
        return t1.a.a(gVar, gVar, i6, theme);
    }

    public final void l(String str) {
        Log.v("Request", str + " this: " + this.f135a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: all -> 0x008e, TryCatch #2 {, blocks: (B:4:0x000a, B:6:0x0013, B:8:0x0042, B:9:0x0045, B:58:0x00d4, B:60:0x00da, B:61:0x00dd, B:11:0x004f, B:13:0x0053, B:14:0x0058, B:16:0x005e, B:18:0x006e, B:20:0x0072, B:24:0x007e, B:26:0x0081, B:28:0x0085, B:36:0x0093, B:38:0x0097, B:40:0x009b, B:42:0x00a3, B:44:0x00a7, B:45:0x00ad, B:47:0x00b1, B:49:0x00b5, B:51:0x00bd, B:53:0x00c1, B:54:0x00c7, B:56:0x00cb, B:57:0x00cf), top: B:68:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da A[Catch: all -> 0x00e2, TryCatch #2 {, blocks: (B:4:0x000a, B:6:0x0013, B:8:0x0042, B:9:0x0045, B:58:0x00d4, B:60:0x00da, B:61:0x00dd, B:11:0x004f, B:13:0x0053, B:14:0x0058, B:16:0x005e, B:18:0x006e, B:20:0x0072, B:24:0x007e, B:26:0x0081, B:28:0x0085, B:36:0x0093, B:38:0x0097, B:40:0x009b, B:42:0x00a3, B:44:0x00a7, B:45:0x00ad, B:47:0x00b1, B:49:0x00b5, B:51:0x00bd, B:53:0x00c1, B:54:0x00c7, B:56:0x00cb, B:57:0x00cf), top: B:68:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(k1.r r6, int r7) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.i.m(k1.r, int):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b5 -> B:61:0x00b8). Please submit an issue!!! */
    public final void n(w<?> wVar, i1.a aVar, boolean z5) {
        i<R> iVar;
        i<R> iVar2;
        Throwable th;
        Object obj;
        String str;
        boolean z6;
        this.f136b.a();
        w<?> wVar2 = null;
        try {
            synchronized (this.f137c) {
                try {
                    this.s = null;
                    if (wVar == null) {
                        m(new r("Expected to receive a Resource<R> with an object of " + this.f143i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = wVar.get();
                    try {
                        if (obj2 != null && this.f143i.isAssignableFrom(obj2.getClass())) {
                            e eVar = this.f139e;
                            if (eVar != null && !eVar.b(this)) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z6) {
                                this.f152r = null;
                                this.f154v = 4;
                                this.u.getClass();
                                m.e(wVar);
                            }
                            o(wVar, obj2, aVar);
                            return;
                        }
                        this.f152r = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f143i);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(wVar);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        m(new r(sb.toString()), 5);
                        this.u.getClass();
                        m.e(wVar);
                    } catch (Throwable th2) {
                        th = th2;
                        wVar2 = wVar;
                        iVar = this;
                        try {
                            try {
                            } catch (Throwable th3) {
                                iVar2 = iVar;
                                th = th3;
                                i<R> iVar3 = iVar2;
                                th = th;
                                iVar = iVar3;
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                            if (wVar2 != null) {
                                iVar.u.getClass();
                                m.e(wVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    iVar2 = this;
                    i<R> iVar32 = iVar2;
                    th = th;
                    iVar = iVar32;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            iVar = this;
        }
    }

    public final void o(w wVar, Object obj, i1.a aVar) {
        boolean z5;
        j();
        this.f154v = 4;
        this.f152r = wVar;
        if (this.f141g.f2808i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f142h + " with size [" + this.f158z + "x" + this.A + "] in " + e2.f.a(this.f153t) + " ms");
        }
        boolean z6 = true;
        this.B = true;
        try {
            List<f<R>> list = this.f149o;
            if (list != null) {
                z5 = false;
                for (f<R> fVar : list) {
                    z5 |= fVar.a();
                }
            } else {
                z5 = false;
            }
            f<R> fVar2 = this.f138d;
            if (fVar2 == null || !fVar2.a()) {
                z6 = false;
            }
            if (!(z6 | z5)) {
                this.f150p.getClass();
                this.f148n.j(obj);
            }
            this.B = false;
            e eVar = this.f139e;
            if (eVar != null) {
                eVar.k(this);
            }
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }
}
