package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.f;
import androidx.lifecycle.ProcessLifecycleInitializer;
import b0.h;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements y0.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends f.c {
        public a(Context context) {
            super(new b(context));
            this.f1330b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements f.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1311a;

        public b(Context context) {
            this.f1311a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.g
        public final void a(f.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new g(0, this, hVar, threadPoolExecutor));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            boolean z5;
            try {
                int i6 = b0.h.f2267a;
                h.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.f1317j != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    f.a().c();
                }
                h.a.b();
            } catch (Throwable th) {
                int i7 = b0.h.f2267a;
                h.a.b();
                throw th;
            }
        }
    }

    @Override // y0.b
    public final List<Class<? extends y0.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // y0.b
    /* renamed from: c */
    public final Boolean b(Context context) {
        Object obj;
        a aVar = new a(context);
        if (f.f1317j == null) {
            synchronized (f.f1316i) {
                if (f.f1317j == null) {
                    f.f1317j = new f(aVar);
                }
            }
        }
        y0.a c6 = y0.a.c(context);
        c6.getClass();
        synchronized (y0.a.f6750e) {
            try {
                obj = c6.f6751a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c6.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final androidx.lifecycle.p v2 = ((androidx.lifecycle.o) obj).v();
        v2.a(new androidx.lifecycle.d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.f
            public final void g() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = androidx.emoji2.text.b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new c(), 500L);
                v2.c(this);
            }
        });
        return Boolean.TRUE;
    }
}
