package x1;

import a1.f0;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.a0;
import androidx.fragment.app.b0;
import java.util.HashMap;
import r1.r;
import s4.y;
import x1.k;
/* loaded from: classes.dex */
public final class l implements Handler.Callback {

    /* renamed from: g  reason: collision with root package name */
    public static final a f6679g = new a();

    /* renamed from: a  reason: collision with root package name */
    public volatile com.bumptech.glide.l f6680a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6681b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f6682c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f6683d;

    /* renamed from: e  reason: collision with root package name */
    public final b f6684e;

    /* renamed from: f  reason: collision with root package name */
    public final g f6685f;

    /* loaded from: classes.dex */
    public class a implements b {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public l(b bVar, com.bumptech.glide.h hVar) {
        g kVar;
        new l.b();
        new l.b();
        new Bundle();
        this.f6684e = bVar == null ? f6679g : bVar;
        this.f6683d = new Handler(Looper.getMainLooper(), this);
        if (r.f5932h && r.f5931g) {
            if (hVar.f2810a.containsKey(com.bumptech.glide.f.class)) {
                kVar = new f();
            } else {
                kVar = new androidx.activity.k(3);
            }
        } else {
            kVar = new androidx.activity.k(2);
        }
        this.f6685f = kVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.l b(Context context) {
        boolean z5;
        boolean z6;
        if (context != null) {
            char[] cArr = e2.j.f3832a;
            boolean z7 = true;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && !(context instanceof Application)) {
                if (context instanceof androidx.fragment.app.r) {
                    return c((androidx.fragment.app.r) context);
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        return b(activity.getApplicationContext());
                    }
                    if (activity instanceof androidx.fragment.app.r) {
                        return c((androidx.fragment.app.r) activity);
                    }
                    if (!activity.isDestroyed()) {
                        this.f6685f.c();
                        FragmentManager fragmentManager = activity.getFragmentManager();
                        Activity a6 = a(activity);
                        if (a6 != null && a6.isFinishing()) {
                            z7 = false;
                        }
                        k d6 = d(fragmentManager);
                        com.bumptech.glide.l lVar = d6.f6675e;
                        if (lVar == null) {
                            com.bumptech.glide.b b6 = com.bumptech.glide.b.b(activity);
                            k.a aVar = d6.f6673c;
                            ((a) this.f6684e).getClass();
                            com.bumptech.glide.l lVar2 = new com.bumptech.glide.l(b6, d6.f6672b, aVar, activity);
                            if (z7) {
                                lVar2.k();
                            }
                            d6.f6675e = lVar2;
                            return lVar2;
                        }
                        return lVar;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f6680a == null) {
                synchronized (this) {
                    if (this.f6680a == null) {
                        com.bumptech.glide.b b7 = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar = this.f6684e;
                        f0 f0Var = new f0(0);
                        y yVar = new y();
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f6680a = new com.bumptech.glide.l(b7, f0Var, yVar, applicationContext);
                    }
                }
            }
            return this.f6680a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final com.bumptech.glide.l c(androidx.fragment.app.r rVar) {
        boolean z5;
        char[] cArr = e2.j.f3832a;
        boolean z6 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return b(rVar.getApplicationContext());
        }
        if (!rVar.isDestroyed()) {
            this.f6685f.c();
            b0 z7 = rVar.z();
            Activity a6 = a(rVar);
            if (a6 == null || !a6.isFinishing()) {
                z6 = true;
            }
            o e6 = e(z7);
            com.bumptech.glide.l lVar = e6.Z;
            if (lVar == null) {
                com.bumptech.glide.b b6 = com.bumptech.glide.b.b(rVar);
                ((a) this.f6684e).getClass();
                com.bumptech.glide.l lVar2 = new com.bumptech.glide.l(b6, e6.V, e6.W, rVar);
                if (z6) {
                    lVar2.k();
                }
                e6.Z = lVar2;
                return lVar2;
            }
            return lVar;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final k d(FragmentManager fragmentManager) {
        k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null) {
            HashMap hashMap = this.f6681b;
            k kVar2 = (k) hashMap.get(fragmentManager);
            if (kVar2 == null) {
                kVar2 = new k();
                kVar2.f6677g = null;
                hashMap.put(fragmentManager, kVar2);
                fragmentManager.beginTransaction().add(kVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f6683d.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return kVar2;
        }
        return kVar;
    }

    public final o e(a0 a0Var) {
        o oVar = (o) a0Var.E("com.bumptech.glide.manager");
        if (oVar == null) {
            HashMap hashMap = this.f6682c;
            o oVar2 = (o) hashMap.get(a0Var);
            if (oVar2 == null) {
                oVar2 = new o();
                oVar2.f6689a0 = null;
                hashMap.put(a0Var, oVar2);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(a0Var);
                aVar.f(0, oVar2, "com.bumptech.glide.manager", 1);
                aVar.d(true);
                this.f6683d.obtainMessage(2, a0Var).sendToTarget();
            }
            return oVar2;
        }
        return oVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        HashMap hashMap;
        Object obj2;
        Object obj3;
        int i6 = message.what;
        boolean z5 = true;
        if (i6 == 1) {
            obj = (FragmentManager) message.obj;
            hashMap = this.f6681b;
        } else if (i6 != 2) {
            obj3 = null;
            z5 = false;
            obj2 = null;
            if (z5 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z5;
        } else {
            obj = (a0) message.obj;
            hashMap = this.f6682c;
        }
        Object remove = hashMap.remove(obj);
        obj2 = obj;
        obj3 = remove;
        if (z5) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z5;
    }
}
