package v1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import e2.j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final h1.a f6293a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6294b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f6295c;

    /* renamed from: d  reason: collision with root package name */
    public final l f6296d;

    /* renamed from: e  reason: collision with root package name */
    public final l1.d f6297e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6298f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6299g;

    /* renamed from: h  reason: collision with root package name */
    public k<Bitmap> f6300h;

    /* renamed from: i  reason: collision with root package name */
    public a f6301i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6302j;

    /* renamed from: k  reason: collision with root package name */
    public a f6303k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f6304l;

    /* renamed from: m  reason: collision with root package name */
    public i1.l<Bitmap> f6305m;

    /* renamed from: n  reason: collision with root package name */
    public a f6306n;

    /* renamed from: o  reason: collision with root package name */
    public int f6307o;

    /* renamed from: p  reason: collision with root package name */
    public int f6308p;

    /* renamed from: q  reason: collision with root package name */
    public int f6309q;

    /* loaded from: classes.dex */
    public static class a extends b2.c<Bitmap> {

        /* renamed from: e  reason: collision with root package name */
        public final Handler f6310e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6311f;

        /* renamed from: g  reason: collision with root package name */
        public final long f6312g;

        /* renamed from: h  reason: collision with root package name */
        public Bitmap f6313h;

        public a(Handler handler, int i6, long j5) {
            this.f6310e = handler;
            this.f6311f = i6;
            this.f6312g = j5;
        }

        @Override // b2.g
        public final void h(Drawable drawable) {
            this.f6313h = null;
        }

        @Override // b2.g
        public final void j(Object obj) {
            this.f6313h = (Bitmap) obj;
            Handler handler = this.f6310e;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f6312g);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i6 = message.what;
            f fVar = f.this;
            if (i6 == 1) {
                fVar.b((a) message.obj);
                return true;
            } else if (i6 == 2) {
                fVar.f6296d.l((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public f(com.bumptech.glide.b bVar, h1.e eVar, int i6, int i7, q1.c cVar, Bitmap bitmap) {
        l1.d dVar = bVar.f2791b;
        com.bumptech.glide.g gVar = bVar.f2793d;
        Context baseContext = gVar.getBaseContext();
        if (baseContext != null) {
            l b6 = com.bumptech.glide.b.b(baseContext).f2796g.b(baseContext);
            Context baseContext2 = gVar.getBaseContext();
            if (baseContext2 != null) {
                l b7 = com.bumptech.glide.b.b(baseContext2).f2796g.b(baseContext2);
                b7.getClass();
                k<Bitmap> t5 = new k(b7.f2830b, b7, Bitmap.class, b7.f2831c).t(l.f2829l).t(((a2.g) ((a2.g) new a2.g().d(k1.l.f4825a).r()).m()).g(i6, i7));
                this.f6295c = new ArrayList();
                this.f6296d = b6;
                Handler handler = new Handler(Looper.getMainLooper(), new c());
                this.f6297e = dVar;
                this.f6294b = handler;
                this.f6300h = t5;
                this.f6293a = eVar;
                c(cVar, bitmap);
                return;
            }
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public final void a() {
        if (this.f6298f && !this.f6299g) {
            a aVar = this.f6306n;
            if (aVar != null) {
                this.f6306n = null;
                b(aVar);
                return;
            }
            this.f6299g = true;
            h1.a aVar2 = this.f6293a;
            long uptimeMillis = SystemClock.uptimeMillis() + aVar2.e();
            aVar2.c();
            this.f6303k = new a(this.f6294b, aVar2.a(), uptimeMillis);
            k<Bitmap> x5 = this.f6300h.t(new a2.g().l(new d2.d(Double.valueOf(Math.random())))).x(aVar2);
            x5.w(this.f6303k, x5);
        }
    }

    public final void b(a aVar) {
        this.f6299g = false;
        boolean z5 = this.f6302j;
        Handler handler = this.f6294b;
        if (z5) {
            handler.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f6298f) {
            this.f6306n = aVar;
        } else {
            if (aVar.f6313h != null) {
                Bitmap bitmap = this.f6304l;
                if (bitmap != null) {
                    this.f6297e.e(bitmap);
                    this.f6304l = null;
                }
                a aVar2 = this.f6301i;
                this.f6301i = aVar;
                ArrayList arrayList = this.f6295c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) arrayList.get(size)).a();
                }
                if (aVar2 != null) {
                    handler.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public final void c(i1.l<Bitmap> lVar, Bitmap bitmap) {
        androidx.activity.k.h(lVar);
        this.f6305m = lVar;
        androidx.activity.k.h(bitmap);
        this.f6304l = bitmap;
        this.f6300h = this.f6300h.t(new a2.g().p(lVar, true));
        this.f6307o = j.c(bitmap);
        this.f6308p = bitmap.getWidth();
        this.f6309q = bitmap.getHeight();
    }
}
