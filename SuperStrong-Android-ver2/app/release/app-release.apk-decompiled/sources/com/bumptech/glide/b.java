package com.bumptech.glide;

import a1.f0;
import a1.r;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.j;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m1.i;
import n1.a;
import o1.a;
import o1.b;
import o1.c;
import o1.d;
import o1.e;
import o1.j;
import o1.s;
import o1.t;
import o1.u;
import o1.v;
import o1.w;
import p1.a;
import p1.b;
import p1.c;
import p1.d;
import p1.e;
import r1.a0;
import r1.c0;
import r1.p;
import r1.t;
import r1.v;
import r1.x;
import r1.y;
import s1.a;
import z1.a;
/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: j  reason: collision with root package name */
    public static volatile b f2789j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile boolean f2790k;

    /* renamed from: b  reason: collision with root package name */
    public final l1.d f2791b;

    /* renamed from: c  reason: collision with root package name */
    public final m1.h f2792c;

    /* renamed from: d  reason: collision with root package name */
    public final g f2793d;

    /* renamed from: e  reason: collision with root package name */
    public final j f2794e;

    /* renamed from: f  reason: collision with root package name */
    public final l1.b f2795f;

    /* renamed from: g  reason: collision with root package name */
    public final x1.l f2796g;

    /* renamed from: h  reason: collision with root package name */
    public final x1.c f2797h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f2798i = new ArrayList();

    /* loaded from: classes.dex */
    public interface a {
    }

    public b(Context context, k1.m mVar, m1.h hVar, l1.d dVar, l1.b bVar, x1.l lVar, x1.c cVar, int i6, c cVar2, l.b bVar2, List list, h hVar2) {
        i1.j gVar;
        i1.j yVar;
        this.f2791b = dVar;
        this.f2795f = bVar;
        this.f2792c = hVar;
        this.f2796g = lVar;
        this.f2797h = cVar;
        Resources resources = context.getResources();
        j jVar = new j();
        this.f2794e = jVar;
        r1.k kVar = new r1.k();
        u0.c cVar3 = jVar.f2823g;
        synchronized (cVar3) {
            cVar3.f6234a.add(kVar);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 27) {
            p pVar = new p();
            u0.c cVar4 = jVar.f2823g;
            synchronized (cVar4) {
                cVar4.f6234a.add(pVar);
            }
        }
        ArrayList d6 = jVar.d();
        v1.a aVar = new v1.a(context, d6, dVar, bVar);
        c0 c0Var = new c0(dVar, new c0.g());
        r1.m mVar2 = new r1.m(jVar.d(), resources.getDisplayMetrics(), dVar, bVar);
        if (!hVar2.f2810a.containsKey(d.class) || i7 < 28) {
            gVar = new r1.g(0, mVar2);
            yVar = new y(mVar2, bVar);
        } else {
            yVar = new t();
            gVar = new r1.h();
        }
        t1.d dVar2 = new t1.d(context);
        s.c cVar5 = new s.c(resources);
        s.d dVar3 = new s.d(resources);
        s.b bVar3 = new s.b(resources);
        s.a aVar2 = new s.a(resources);
        r1.c cVar6 = new r1.c(bVar);
        w1.a aVar3 = new w1.a();
        androidx.activity.k kVar2 = new androidx.activity.k(1);
        ContentResolver contentResolver = context.getContentResolver();
        androidx.activity.k kVar3 = new androidx.activity.k(0);
        z1.a aVar4 = jVar.f2818b;
        synchronized (aVar4) {
            aVar4.f6918a.add(new a.C0103a(ByteBuffer.class, kVar3));
        }
        r rVar = new r(2, bVar);
        z1.a aVar5 = jVar.f2818b;
        synchronized (aVar5) {
            aVar5.f6918a.add(new a.C0103a(InputStream.class, rVar));
        }
        jVar.a(gVar, ByteBuffer.class, Bitmap.class, "Bitmap");
        jVar.a(yVar, InputStream.class, Bitmap.class, "Bitmap");
        jVar.a(new v(mVar2), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        jVar.a(c0Var, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        jVar.a(new c0(dVar, new c0.c()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        u.a<?> aVar6 = u.a.f5580a;
        jVar.c(Bitmap.class, Bitmap.class, aVar6);
        jVar.a(new a0(), Bitmap.class, Bitmap.class, "Bitmap");
        jVar.b(Bitmap.class, cVar6);
        jVar.a(new r1.a(resources, gVar), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.a(new r1.a(resources, yVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.a(new r1.a(resources, c0Var), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.b(BitmapDrawable.class, new r1.b(dVar, cVar6));
        jVar.a(new v1.h(d6, aVar, bVar), InputStream.class, v1.c.class, "Gif");
        jVar.a(aVar, ByteBuffer.class, v1.c.class, "Gif");
        jVar.b(v1.c.class, new s4.y());
        jVar.c(h1.a.class, h1.a.class, aVar6);
        jVar.a(new r1.g(1, dVar), h1.a.class, Bitmap.class, "Bitmap");
        jVar.a(dVar2, Uri.class, Drawable.class, "legacy_append");
        jVar.a(new x(dVar2, dVar), Uri.class, Bitmap.class, "legacy_append");
        jVar.f(new a.C0087a());
        jVar.c(File.class, ByteBuffer.class, new c.b());
        jVar.c(File.class, InputStream.class, new e.C0071e());
        jVar.a(new u1.a(), File.class, File.class, "legacy_append");
        jVar.c(File.class, ParcelFileDescriptor.class, new e.b());
        jVar.c(File.class, File.class, aVar6);
        jVar.f(new j.a(bVar));
        jVar.f(new ParcelFileDescriptorRewinder.a());
        Class cls = Integer.TYPE;
        jVar.c(cls, InputStream.class, cVar5);
        jVar.c(cls, ParcelFileDescriptor.class, bVar3);
        jVar.c(Integer.class, InputStream.class, cVar5);
        jVar.c(Integer.class, ParcelFileDescriptor.class, bVar3);
        jVar.c(Integer.class, Uri.class, dVar3);
        jVar.c(cls, AssetFileDescriptor.class, aVar2);
        jVar.c(Integer.class, AssetFileDescriptor.class, aVar2);
        jVar.c(cls, Uri.class, dVar3);
        jVar.c(String.class, InputStream.class, new d.c());
        jVar.c(Uri.class, InputStream.class, new d.c());
        jVar.c(String.class, InputStream.class, new t.c());
        jVar.c(String.class, ParcelFileDescriptor.class, new t.b());
        jVar.c(String.class, AssetFileDescriptor.class, new t.a());
        jVar.c(Uri.class, InputStream.class, new a.c(context.getAssets()));
        jVar.c(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets()));
        jVar.c(Uri.class, InputStream.class, new b.a(context));
        jVar.c(Uri.class, InputStream.class, new c.a(context));
        if (i7 >= 29) {
            jVar.c(Uri.class, InputStream.class, new d.c(context));
            jVar.c(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        jVar.c(Uri.class, InputStream.class, new v.d(contentResolver));
        jVar.c(Uri.class, ParcelFileDescriptor.class, new v.b(contentResolver));
        jVar.c(Uri.class, AssetFileDescriptor.class, new v.a(contentResolver));
        jVar.c(Uri.class, InputStream.class, new w.a());
        jVar.c(URL.class, InputStream.class, new e.a());
        jVar.c(Uri.class, File.class, new j.a(context));
        jVar.c(o1.f.class, InputStream.class, new a.C0075a());
        jVar.c(byte[].class, ByteBuffer.class, new b.a());
        jVar.c(byte[].class, InputStream.class, new b.d());
        jVar.c(Uri.class, Uri.class, aVar6);
        jVar.c(Drawable.class, Drawable.class, aVar6);
        jVar.a(new t1.e(), Drawable.class, Drawable.class, "legacy_append");
        jVar.g(Bitmap.class, BitmapDrawable.class, new r(resources));
        jVar.g(Bitmap.class, byte[].class, aVar3);
        jVar.g(Drawable.class, byte[].class, new f1.c(dVar, aVar3, kVar2));
        jVar.g(v1.c.class, byte[].class, kVar2);
        c0 c0Var2 = new c0(dVar, new c0.d());
        jVar.a(c0Var2, ByteBuffer.class, Bitmap.class, "legacy_append");
        jVar.a(new r1.a(resources, c0Var2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        this.f2793d = new g(context, bVar, jVar, new f0(0), cVar2, bVar2, list, mVar, hVar2, i6);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        int i6;
        c cVar;
        l1.d eVar;
        if (!f2790k) {
            f2790k = true;
            l.b bVar = new l.b();
            h.a aVar = new h.a();
            c cVar2 = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(y1.e.a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c6 = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        y1.c cVar3 = (y1.c) it.next();
                        if (c6.contains(cVar3.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar3);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Log.d("Glide", "Discovered GlideModule from manifest: " + ((y1.c) it2.next()).getClass());
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((y1.c) it3.next()).a();
                }
                if (n1.a.f5371d == 0) {
                    n1.a.f5371d = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i7 = n1.a.f5371d;
                if (!TextUtils.isEmpty("source")) {
                    n1.a aVar2 = new n1.a(new ThreadPoolExecutor(i7, i7, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0066a("source", false)));
                    int i8 = n1.a.f5371d;
                    if (!TextUtils.isEmpty("disk-cache")) {
                        n1.a aVar3 = new n1.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0066a("disk-cache", true)));
                        if (n1.a.f5371d == 0) {
                            n1.a.f5371d = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (n1.a.f5371d >= 4) {
                            i6 = 2;
                        } else {
                            i6 = 1;
                        }
                        if (!TextUtils.isEmpty("animation")) {
                            n1.a aVar4 = new n1.a(new ThreadPoolExecutor(i6, i6, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0066a("animation", true)));
                            m1.i iVar = new m1.i(new i.a(applicationContext));
                            x1.e eVar2 = new x1.e();
                            int i9 = iVar.f5255a;
                            if (i9 > 0) {
                                cVar = cVar2;
                                eVar = new l1.j(i9);
                            } else {
                                cVar = cVar2;
                                eVar = new l1.e();
                            }
                            l1.i iVar2 = new l1.i(iVar.f5257c);
                            m1.g gVar = new m1.g(iVar.f5256b);
                            k1.m mVar = new k1.m(gVar, new m1.f(applicationContext), aVar3, aVar2, new n1.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, n1.a.f5370c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.ThreadFactoryC0066a("source-unlimited", false))), aVar4);
                            List emptyList = Collections.emptyList();
                            h hVar = new h(aVar);
                            b bVar2 = new b(applicationContext, mVar, gVar, eVar, iVar2, new x1.l(null, hVar), eVar2, 4, cVar, bVar, emptyList, hVar);
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                y1.c cVar4 = (y1.c) it4.next();
                                try {
                                    cVar4.b();
                                } catch (AbstractMethodError e6) {
                                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(cVar4.getClass().getName()), e6);
                                }
                            }
                            applicationContext.registerComponentCallbacks(bVar2);
                            f2789j = bVar2;
                            f2790k = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e7) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e7);
            }
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f2789j == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            }
            synchronized (b.class) {
                if (f2789j == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f2789j;
    }

    public final void c(l lVar) {
        synchronized (this.f2798i) {
            if (!this.f2798i.contains(lVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f2798i.remove(lVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        boolean z5;
        char[] cArr = e2.j.f3832a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            ((e2.g) this.f2792c).e(0L);
            this.f2791b.b();
            this.f2795f.b();
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        boolean z5;
        long j5;
        char[] cArr = e2.j.f3832a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            synchronized (this.f2798i) {
                Iterator it = this.f2798i.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).getClass();
                }
            }
            m1.g gVar = (m1.g) this.f2792c;
            gVar.getClass();
            if (i6 >= 40) {
                gVar.e(0L);
            } else if (i6 >= 20 || i6 == 15) {
                synchronized (gVar) {
                    j5 = gVar.f3824b;
                }
                gVar.e(j5 / 2);
            }
            this.f2791b.a(i6);
            this.f2795f.a(i6);
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
}
