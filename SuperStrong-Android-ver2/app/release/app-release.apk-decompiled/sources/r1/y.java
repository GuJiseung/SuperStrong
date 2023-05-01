package r1;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import r1.m;
import r1.s;
/* loaded from: classes.dex */
public final class y implements i1.j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f5960a;

    /* renamed from: b  reason: collision with root package name */
    public final l1.b f5961b;

    /* loaded from: classes.dex */
    public static class a implements m.b {

        /* renamed from: a  reason: collision with root package name */
        public final w f5962a;

        /* renamed from: b  reason: collision with root package name */
        public final e2.d f5963b;

        public a(w wVar, e2.d dVar) {
            this.f5962a = wVar;
            this.f5963b = dVar;
        }

        @Override // r1.m.b
        public final void a(Bitmap bitmap, l1.d dVar) {
            IOException iOException = this.f5963b.f3818c;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.e(bitmap);
                }
                throw iOException;
            }
        }

        @Override // r1.m.b
        public final void b() {
            w wVar = this.f5962a;
            synchronized (wVar) {
                wVar.f5954d = wVar.f5952b.length;
            }
        }
    }

    public y(m mVar, l1.b bVar) {
        this.f5960a = mVar;
        this.f5961b = bVar;
    }

    @Override // i1.j
    public final k1.w<Bitmap> a(InputStream inputStream, int i6, int i7, i1.h hVar) {
        w wVar;
        boolean z5;
        e2.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof w) {
            z5 = false;
            wVar = (w) inputStream2;
        } else {
            wVar = new w(inputStream2, this.f5961b);
            z5 = true;
        }
        ArrayDeque arrayDeque = e2.d.f3816d;
        synchronized (arrayDeque) {
            dVar = (e2.d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new e2.d();
        }
        e2.d dVar2 = dVar;
        dVar2.f3817b = wVar;
        e2.h hVar2 = new e2.h(dVar2);
        a aVar = new a(wVar, dVar2);
        try {
            m mVar = this.f5960a;
            e a6 = mVar.a(new s.a(mVar.f5924c, hVar2, mVar.f5925d), i6, i7, hVar, aVar);
            dVar2.f3818c = null;
            dVar2.f3817b = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            if (z5) {
                wVar.f();
            }
            return a6;
        } catch (Throwable th) {
            dVar2.f3818c = null;
            dVar2.f3817b = null;
            ArrayDeque arrayDeque2 = e2.d.f3816d;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (z5) {
                    wVar.f();
                }
                throw th;
            }
        }
    }

    @Override // i1.j
    public final boolean b(InputStream inputStream, i1.h hVar) {
        this.f5960a.getClass();
        return true;
    }
}
