package m1;

import android.util.Log;
import g1.a;
import java.io.File;
import java.io.IOException;
import m1.b;
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: c  reason: collision with root package name */
    public final File f5248c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5249d;

    /* renamed from: f  reason: collision with root package name */
    public g1.a f5251f;

    /* renamed from: e  reason: collision with root package name */
    public final b f5250e = new b();

    /* renamed from: b  reason: collision with root package name */
    public final j f5247b = new j();

    @Deprecated
    public d(File file, long j5) {
        this.f5248c = file;
        this.f5249d = j5;
    }

    @Override // m1.a
    public final File a(i1.f fVar) {
        g1.a aVar;
        String a6 = this.f5247b.a(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a6 + " for for Key: " + fVar);
        }
        try {
            synchronized (this) {
                if (this.f5251f == null) {
                    this.f5251f = g1.a.p(this.f5248c, this.f5249d);
                }
                aVar = this.f5251f;
            }
            a.e n5 = aVar.n(a6);
            if (n5 != null) {
                return n5.f4140a[0];
            }
        } catch (IOException e6) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e6);
            }
        }
        return null;
    }

    @Override // m1.a
    public final void b(i1.f fVar, k1.g gVar) {
        b.a aVar;
        g1.a aVar2;
        boolean z5;
        String a6 = this.f5247b.a(fVar);
        b bVar = this.f5250e;
        synchronized (bVar) {
            aVar = (b.a) bVar.f5240a.get(a6);
            if (aVar == null) {
                b.C0065b c0065b = bVar.f5241b;
                synchronized (c0065b.f5244a) {
                    aVar = (b.a) c0065b.f5244a.poll();
                }
                if (aVar == null) {
                    aVar = new b.a();
                }
                bVar.f5240a.put(a6, aVar);
            }
            aVar.f5243b++;
        }
        aVar.f5242a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a6 + " for for Key: " + fVar);
            }
            try {
                synchronized (this) {
                    if (this.f5251f == null) {
                        this.f5251f = g1.a.p(this.f5248c, this.f5249d);
                    }
                    aVar2 = this.f5251f;
                }
                if (aVar2.n(a6) == null) {
                    a.c j5 = aVar2.j(a6);
                    if (j5 != null) {
                        try {
                            if (gVar.f4768a.b(gVar.f4769b, j5.b(), gVar.f4770c)) {
                                g1.a.c(g1.a.this, j5, true);
                                j5.f4131c = true;
                            }
                            if (!z5) {
                                try {
                                    j5.a();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!j5.f4131c) {
                                try {
                                    j5.a();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(a6));
                    }
                }
            } catch (IOException e6) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e6);
                }
            }
        } finally {
            this.f5250e.a(a6);
        }
    }
}
