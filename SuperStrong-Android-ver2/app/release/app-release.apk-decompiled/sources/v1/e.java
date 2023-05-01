package v1;

import android.graphics.Bitmap;
import androidx.activity.k;
import i1.l;
import java.security.MessageDigest;
import k1.w;
/* loaded from: classes.dex */
public final class e implements l<c> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f6292b;

    public e(l<Bitmap> lVar) {
        k.h(lVar);
        this.f6292b = lVar;
    }

    @Override // i1.l
    public final w a(com.bumptech.glide.g gVar, w wVar, int i6, int i7) {
        c cVar = (c) wVar.get();
        r1.e eVar = new r1.e(cVar.f6281b.f6291a.f6304l, com.bumptech.glide.b.b(gVar).f2791b);
        l<Bitmap> lVar = this.f6292b;
        w a6 = lVar.a(gVar, eVar, i6, i7);
        if (!eVar.equals(a6)) {
            eVar.e();
        }
        cVar.f6281b.f6291a.c(lVar, (Bitmap) a6.get());
        return wVar;
    }

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        this.f6292b.b(messageDigest);
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f6292b.equals(((e) obj).f6292b);
        }
        return false;
    }

    @Override // i1.f
    public final int hashCode() {
        return this.f6292b.hashCode();
    }
}
