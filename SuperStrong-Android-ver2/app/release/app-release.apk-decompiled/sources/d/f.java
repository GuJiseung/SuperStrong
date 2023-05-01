package d;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import d.p;
import d.r;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: b  reason: collision with root package name */
    public static final r.a f3572b = new r.a(new r.b());

    /* renamed from: c  reason: collision with root package name */
    public static final int f3573c = -100;

    /* renamed from: d  reason: collision with root package name */
    public static b0.e f3574d = null;

    /* renamed from: e  reason: collision with root package name */
    public static b0.e f3575e = null;

    /* renamed from: f  reason: collision with root package name */
    public static Boolean f3576f = null;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f3577g = false;

    /* renamed from: h  reason: collision with root package name */
    public static final l.d<WeakReference<f>> f3578h = new l.d<>();

    /* renamed from: i  reason: collision with root package name */
    public static final Object f3579i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Object f3580j = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static boolean k(Context context) {
        if (f3576f == null) {
            try {
                int i6 = p.f3664b;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, p.class), p.a.a() | 128).metaData;
                if (bundle != null) {
                    f3576f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f3576f = Boolean.FALSE;
            }
        }
        return f3576f.booleanValue();
    }

    public static void r(f fVar) {
        synchronized (f3579i) {
            Iterator<WeakReference<f>> it = f3578h.iterator();
            while (it.hasNext()) {
                f fVar2 = it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i6);

    public Context f() {
        return null;
    }

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract void i();

    public abstract void j();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract boolean s(int i6);

    public abstract void t(int i6);

    public abstract void u(View view);

    public abstract void v(View view, ViewGroup.LayoutParams layoutParams);

    public void w(int i6) {
    }

    public abstract void x(CharSequence charSequence);
}
