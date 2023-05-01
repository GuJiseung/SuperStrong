package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.appcompat.widget.k1;
import androidx.emoji2.text.f;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class l extends f.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1356d = new a();

    /* loaded from: classes.dex */
    public static class a {
    }

    /* loaded from: classes.dex */
    public static class b implements f.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1357a;

        /* renamed from: b  reason: collision with root package name */
        public final c0.f f1358b;

        /* renamed from: c  reason: collision with root package name */
        public final a f1359c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f1360d;

        /* renamed from: e  reason: collision with root package name */
        public Handler f1361e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f1362f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f1363g;

        /* renamed from: h  reason: collision with root package name */
        public f.h f1364h;

        public b(Context context, c0.f fVar) {
            a aVar = l.f1356d;
            this.f1360d = new Object();
            if (context != null) {
                this.f1357a = context.getApplicationContext();
                this.f1358b = fVar;
                this.f1359c = aVar;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        @Override // androidx.emoji2.text.f.g
        public final void a(f.h hVar) {
            synchronized (this.f1360d) {
                this.f1364h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f1360d) {
                this.f1364h = null;
                Handler handler = this.f1361e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1361e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1363g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1362f = null;
                this.f1363g = null;
            }
        }

        public final void c() {
            synchronized (this.f1360d) {
                if (this.f1364h == null) {
                    return;
                }
                if (this.f1362f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1363g = threadPoolExecutor;
                    this.f1362f = threadPoolExecutor;
                }
                this.f1362f.execute(new k1(2, this));
            }
        }

        public final c0.m d() {
            try {
                a aVar = this.f1359c;
                Context context = this.f1357a;
                c0.f fVar = this.f1358b;
                aVar.getClass();
                c0.l a6 = c0.e.a(context, fVar);
                int i6 = a6.f2721a;
                if (i6 == 0) {
                    c0.m[] mVarArr = a6.f2722b;
                    if (mVarArr != null && mVarArr.length != 0) {
                        return mVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + i6 + ")");
            } catch (PackageManager.NameNotFoundException e6) {
                throw new RuntimeException("provider not found", e6);
            }
        }
    }

    public l(Context context, c0.f fVar) {
        super(new b(context, fVar));
    }
}
