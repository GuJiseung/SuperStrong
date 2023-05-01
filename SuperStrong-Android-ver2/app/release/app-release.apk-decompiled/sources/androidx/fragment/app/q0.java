package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.j;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public final class q0 implements androidx.lifecycle.h, x0.d, androidx.lifecycle.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final o f1614b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.k0 f1615c;

    /* renamed from: d  reason: collision with root package name */
    public i0.b f1616d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.lifecycle.p f1617e = null;

    /* renamed from: f  reason: collision with root package name */
    public x0.c f1618f = null;

    public q0(o oVar, androidx.lifecycle.k0 k0Var) {
        this.f1614b = oVar;
        this.f1615c = k0Var;
    }

    @Override // x0.d
    public final x0.b b() {
        e();
        return this.f1618f.f6661b;
    }

    public final void c(j.b bVar) {
        this.f1617e.f(bVar);
    }

    public final void e() {
        if (this.f1617e == null) {
            this.f1617e = new androidx.lifecycle.p(this);
            x0.c cVar = new x0.c(this);
            this.f1618f = cVar;
            cVar.a();
        }
    }

    @Override // androidx.lifecycle.h
    public final i0.b j() {
        Application application;
        o oVar = this.f1614b;
        i0.b j5 = oVar.j();
        if (!j5.equals(oVar.Q)) {
            this.f1616d = j5;
            return j5;
        }
        if (this.f1616d == null) {
            Context applicationContext = oVar.L().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f1616d = new androidx.lifecycle.d0(application, oVar, oVar.f1572g);
        }
        return this.f1616d;
    }

    @Override // androidx.lifecycle.h
    public final u0.a k() {
        Application application;
        o oVar = this.f1614b;
        Context applicationContext = oVar.L().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        u0.d dVar = new u0.d();
        LinkedHashMap linkedHashMap = dVar.f6231a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.h0.f1741a, application);
        }
        linkedHashMap.put(androidx.lifecycle.a0.f1708a, oVar);
        linkedHashMap.put(androidx.lifecycle.a0.f1709b, this);
        Bundle bundle = oVar.f1572g;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.a0.f1710c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.l0
    public final androidx.lifecycle.k0 t() {
        e();
        return this.f1615c;
    }

    @Override // androidx.lifecycle.o
    public final androidx.lifecycle.p v() {
        e();
        return this.f1617e;
    }
}
