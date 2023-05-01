package k1;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import k1.h;
import k1.m;
import o1.n;
/* loaded from: classes.dex */
public final class b0 implements h, h.a {

    /* renamed from: b  reason: collision with root package name */
    public final i<?> f4743b;

    /* renamed from: c  reason: collision with root package name */
    public final h.a f4744c;

    /* renamed from: d  reason: collision with root package name */
    public int f4745d;

    /* renamed from: e  reason: collision with root package name */
    public e f4746e;

    /* renamed from: f  reason: collision with root package name */
    public Object f4747f;

    /* renamed from: g  reason: collision with root package name */
    public volatile n.a<?> f4748g;

    /* renamed from: h  reason: collision with root package name */
    public f f4749h;

    public b0(i<?> iVar, h.a aVar) {
        this.f4743b = iVar;
        this.f4744c = aVar;
    }

    @Override // k1.h.a
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // k1.h
    public final boolean b() {
        boolean z5;
        boolean z6;
        Object obj = this.f4747f;
        if (obj != null) {
            this.f4747f = null;
            int i6 = e2.f.f3822b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                i1.d<X> d6 = this.f4743b.d(obj);
                g gVar = new g(d6, obj, this.f4743b.f4779i);
                i1.f fVar = this.f4748g.f5547a;
                i<?> iVar = this.f4743b;
                this.f4749h = new f(fVar, iVar.f4784n);
                ((m.c) iVar.f4778h).a().b(this.f4749h, gVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f4749h + ", data: " + obj + ", encoder: " + d6 + ", duration: " + e2.f.a(elapsedRealtimeNanos));
                }
                this.f4748g.f5549c.b();
                this.f4746e = new e(Collections.singletonList(this.f4748g.f5547a), this.f4743b, this);
            } catch (Throwable th) {
                this.f4748g.f5549c.b();
                throw th;
            }
        }
        e eVar = this.f4746e;
        if (eVar != null && eVar.b()) {
            return true;
        }
        this.f4746e = null;
        this.f4748g = null;
        boolean z7 = false;
        while (!z7) {
            if (this.f4745d < this.f4743b.b().size()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                break;
            }
            ArrayList b6 = this.f4743b.b();
            int i7 = this.f4745d;
            this.f4745d = i7 + 1;
            this.f4748g = (n.a) b6.get(i7);
            if (this.f4748g != null) {
                if (!this.f4743b.f4786p.c(this.f4748g.f5549c.e())) {
                    if (this.f4743b.c(this.f4748g.f5549c.a()) != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                    }
                }
                this.f4748g.f5549c.f(this.f4743b.f4785o, new a0(this, this.f4748g));
                z7 = true;
            }
        }
        return z7;
    }

    @Override // k1.h.a
    public final void c(i1.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, i1.a aVar, i1.f fVar2) {
        this.f4744c.c(fVar, obj, dVar, this.f4748g.f5549c.e(), fVar);
    }

    @Override // k1.h
    public final void cancel() {
        n.a<?> aVar = this.f4748g;
        if (aVar != null) {
            aVar.f5549c.cancel();
        }
    }

    @Override // k1.h.a
    public final void d(i1.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, i1.a aVar) {
        this.f4744c.d(fVar, exc, dVar, this.f4748g.f5549c.e());
    }
}
