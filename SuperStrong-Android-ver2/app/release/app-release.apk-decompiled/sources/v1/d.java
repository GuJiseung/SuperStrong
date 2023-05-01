package v1;

import android.graphics.Bitmap;
import com.bumptech.glide.l;
import v1.f;
/* loaded from: classes.dex */
public final class d extends t1.b<c> {
    public d(c cVar) {
        super(cVar);
    }

    @Override // t1.b, k1.s
    public final void a() {
        ((c) this.f6132b).f6281b.f6291a.f6304l.prepareToDraw();
    }

    @Override // k1.w
    public final int c() {
        f fVar = ((c) this.f6132b).f6281b.f6291a;
        return fVar.f6293a.f() + fVar.f6307o;
    }

    @Override // k1.w
    public final Class<c> d() {
        return c.class;
    }

    @Override // k1.w
    public final void e() {
        c cVar = (c) this.f6132b;
        cVar.stop();
        cVar.f6284e = true;
        f fVar = cVar.f6281b.f6291a;
        fVar.f6295c.clear();
        Bitmap bitmap = fVar.f6304l;
        if (bitmap != null) {
            fVar.f6297e.e(bitmap);
            fVar.f6304l = null;
        }
        fVar.f6298f = false;
        f.a aVar = fVar.f6301i;
        l lVar = fVar.f6296d;
        if (aVar != null) {
            lVar.l(aVar);
            fVar.f6301i = null;
        }
        f.a aVar2 = fVar.f6303k;
        if (aVar2 != null) {
            lVar.l(aVar2);
            fVar.f6303k = null;
        }
        f.a aVar3 = fVar.f6306n;
        if (aVar3 != null) {
            lVar.l(aVar3);
            fVar.f6306n = null;
        }
        fVar.f6293a.clear();
        fVar.f6302j = true;
    }
}
