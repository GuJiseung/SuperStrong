package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import x1.b;
import x1.n;
import x1.p;
/* loaded from: classes.dex */
public final class l implements ComponentCallbacks2, x1.i {

    /* renamed from: l  reason: collision with root package name */
    public static final a2.g f2829l;

    /* renamed from: b  reason: collision with root package name */
    public final com.bumptech.glide.b f2830b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2831c;

    /* renamed from: d  reason: collision with root package name */
    public final x1.h f2832d;

    /* renamed from: e  reason: collision with root package name */
    public final n f2833e;

    /* renamed from: f  reason: collision with root package name */
    public final x1.m f2834f;

    /* renamed from: g  reason: collision with root package name */
    public final p f2835g;

    /* renamed from: h  reason: collision with root package name */
    public final a f2836h;

    /* renamed from: i  reason: collision with root package name */
    public final x1.b f2837i;

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArrayList<a2.f<Object>> f2838j;

    /* renamed from: k  reason: collision with root package name */
    public a2.g f2839k;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            lVar.f2832d.a(lVar);
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final n f2841a;

        public b(n nVar) {
            this.f2841a = nVar;
        }
    }

    static {
        a2.g c6 = new a2.g().c(Bitmap.class);
        c6.u = true;
        f2829l = c6;
        new a2.g().c(v1.c.class).u = true;
        a2.g gVar = (a2.g) ((a2.g) new a2.g().d(k1.l.f4826b).h()).m();
    }

    public l(com.bumptech.glide.b bVar, x1.h hVar, x1.m mVar, Context context) {
        int checkPermission;
        boolean z5;
        x1.b jVar;
        a2.g gVar;
        String str;
        n nVar = new n();
        x1.c cVar = bVar.f2797h;
        this.f2835g = new p();
        a aVar = new a();
        this.f2836h = aVar;
        this.f2830b = bVar;
        this.f2832d = hVar;
        this.f2834f = mVar;
        this.f2833e = nVar;
        this.f2831c = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(nVar);
        ((x1.e) cVar).getClass();
        Object obj = w.a.f6573a;
        if (!b0.a.a() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) {
            if (new v.k(applicationContext).f6265a.areNotificationsEnabled()) {
                checkPermission = 0;
            } else {
                checkPermission = -1;
            }
        } else {
            checkPermission = applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid());
        }
        if (checkPermission == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z5) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z5) {
            jVar = new x1.d(applicationContext, bVar2);
        } else {
            jVar = new x1.j();
        }
        this.f2837i = jVar;
        char[] cArr = e2.j.f3832a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            e2.j.e().post(aVar);
        } else {
            hVar.a(this);
        }
        hVar.a(jVar);
        this.f2838j = new CopyOnWriteArrayList<>(bVar.f2793d.f2804e);
        g gVar2 = bVar.f2793d;
        synchronized (gVar2) {
            if (gVar2.f2809j == null) {
                ((c) gVar2.f2803d).getClass();
                a2.g gVar3 = new a2.g();
                gVar3.u = true;
                gVar2.f2809j = gVar3;
            }
            gVar = gVar2.f2809j;
        }
        synchronized (this) {
            a2.g clone = gVar.clone();
            if (clone.u && !clone.f125w) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            clone.f125w = true;
            clone.u = true;
            this.f2839k = clone;
        }
        synchronized (bVar.f2798i) {
            if (!bVar.f2798i.contains(this)) {
                bVar.f2798i.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    @Override // x1.i
    public final synchronized void a() {
        m();
        this.f2835g.a();
    }

    @Override // x1.i
    public final synchronized void b() {
        this.f2835g.b();
        Iterator it = e2.j.d(this.f2835g.f6691b).iterator();
        while (it.hasNext()) {
            l((b2.g) it.next());
        }
        this.f2835g.f6691b.clear();
        n nVar = this.f2833e;
        Iterator it2 = e2.j.d(nVar.f6686a).iterator();
        while (it2.hasNext()) {
            nVar.a((a2.c) it2.next());
        }
        nVar.f6687b.clear();
        this.f2832d.b(this);
        this.f2832d.b(this.f2837i);
        e2.j.e().removeCallbacks(this.f2836h);
        this.f2830b.c(this);
    }

    @Override // x1.i
    public final synchronized void k() {
        n();
        this.f2835g.k();
    }

    public final void l(b2.g<?> gVar) {
        boolean z5;
        if (gVar == null) {
            return;
        }
        boolean o5 = o(gVar);
        a2.c g2 = gVar.g();
        if (!o5) {
            com.bumptech.glide.b bVar = this.f2830b;
            synchronized (bVar.f2798i) {
                Iterator it = bVar.f2798i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((l) it.next()).o(gVar)) {
                            z5 = true;
                            break;
                        }
                    } else {
                        z5 = false;
                        break;
                    }
                }
            }
            if (!z5 && g2 != null) {
                gVar.c(null);
                g2.clear();
            }
        }
    }

    public final synchronized void m() {
        n nVar = this.f2833e;
        nVar.f6688c = true;
        Iterator it = e2.j.d(nVar.f6686a).iterator();
        while (it.hasNext()) {
            a2.c cVar = (a2.c) it.next();
            if (cVar.isRunning()) {
                cVar.e();
                nVar.f6687b.add(cVar);
            }
        }
    }

    public final synchronized void n() {
        n nVar = this.f2833e;
        nVar.f6688c = false;
        Iterator it = e2.j.d(nVar.f6686a).iterator();
        while (it.hasNext()) {
            a2.c cVar = (a2.c) it.next();
            if (!cVar.i() && !cVar.isRunning()) {
                cVar.f();
            }
        }
        nVar.f6687b.clear();
    }

    public final synchronized boolean o(b2.g<?> gVar) {
        a2.c g2 = gVar.g();
        if (g2 == null) {
            return true;
        }
        if (this.f2833e.a(g2)) {
            this.f2835g.f6691b.remove(gVar);
            gVar.c(null);
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2833e + ", treeNode=" + this.f2834f + "}";
    }
}
