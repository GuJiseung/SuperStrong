package androidx.activity;

import a1.f0;
import a1.r;
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.superstrong.android.R;
import e2.a;
import f0.g0;
import f0.r0;
import h3.f;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import s3.n;
import s4.h0;
import s4.h1;
import s4.w;
/* loaded from: classes.dex */
public class k implements i1.d, w1.b, x1.g, n {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f280b = {16842948};

    /* renamed from: c  reason: collision with root package name */
    public static final r f281c = new r(4, "REMOVED_TASK");

    /* renamed from: d  reason: collision with root package name */
    public static final r f282d = new r(4, "CLOSED_EMPTY");

    public /* synthetic */ k() {
    }

    public static final void f(Throwable th, Throwable th2) {
        l4.f.f(th, "<this>");
        l4.f.f(th2, "exception");
        if (th != th2) {
            h4.b.f4552a.a(th, th2);
        }
    }

    public static void g(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static int i(Context context, String str) {
        boolean z5;
        int c6;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d6 = v.f.d(str);
        if (d6 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && e0.b.a(packageName2, packageName)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c7 = v.g.c(context);
                    c6 = v.g.a(c7, d6, Binder.getCallingUid(), packageName);
                    if (c6 == 0) {
                        c6 = v.g.a(c7, d6, myUid, v.g.b(context));
                    }
                } else {
                    c6 = v.f.c((AppOpsManager) v.f.a(context, AppOpsManager.class), d6, packageName);
                }
            } else {
                c6 = v.f.c((AppOpsManager) v.f.a(context, AppOpsManager.class), d6, packageName);
            }
            if (c6 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static f0 j(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                return new h3.h();
            }
            return new h3.d();
        }
        return new h3.h();
    }

    public static final w k(androidx.lifecycle.f0 f0Var) {
        Object obj;
        HashMap hashMap = f0Var.f1733a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = f0Var.f1733a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        w wVar = (w) obj;
        if (wVar != null) {
            return wVar;
        }
        h1 h1Var = new h1(null);
        kotlinx.coroutines.scheduling.c cVar = h0.f6067a;
        return (w) f0Var.c(new androidx.lifecycle.c(h1Var.plus(kotlinx.coroutines.internal.k.f4969a.H())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static boolean l(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final void m(View view, i iVar) {
        l4.f.f(view, "<this>");
        l4.f.f(iVar, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, iVar);
    }

    public static void n(View view, float f6) {
        Drawable background = view.getBackground();
        if (background instanceof h3.f) {
            ((h3.f) background).j(f6);
        }
    }

    public static void o(View view) {
        Drawable background = view.getBackground();
        if (background instanceof h3.f) {
            p(view, (h3.f) background);
        }
    }

    public static void p(View view, h3.f fVar) {
        boolean z5;
        w2.a aVar = fVar.f4446b.f4468b;
        if (aVar != null && aVar.f6581a) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            float f6 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                f6 += g0.i.i((View) parent);
            }
            f.b bVar = fVar.f4446b;
            if (bVar.f4479m != f6) {
                bVar.f4479m = f6;
                fVar.n();
            }
        }
    }

    @Override // w1.b
    public k1.w a(k1.w wVar, i1.h hVar) {
        a.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((v1.c) wVar.get()).f6281b.f6291a.f6293a.g().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = e2.a.f3807a;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            bVar = new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.f3810a == 0) {
            if (bVar.f3811b == bVar.f3812c.length) {
                bArr = asReadOnlyBuffer.array();
                return new s1.b(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
        asReadOnlyBuffer2.position(0);
        asReadOnlyBuffer2.get(bArr2);
        bArr = bArr2;
        return new s1.b(bArr);
    }

    @Override // i1.d
    public boolean b(Object obj, File file, i1.h hVar) {
        try {
            e2.a.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e6) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e6);
            }
            return false;
        }
    }

    @Override // x1.g
    public void c() {
    }

    @Override // s3.n
    public Object e() {
        return new ConcurrentHashMap();
    }

    public /* synthetic */ k(int i6) {
    }
}
