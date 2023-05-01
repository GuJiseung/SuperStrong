package r1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class o implements i1.l<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final i1.l<Bitmap> f5928b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5929c;

    public o(i1.l<Bitmap> lVar, boolean z5) {
        this.f5928b = lVar;
        this.f5929c = z5;
    }

    @Override // i1.l
    public final k1.w a(com.bumptech.glide.g gVar, k1.w wVar, int i6, int i7) {
        l1.d dVar = com.bumptech.glide.b.b(gVar).f2791b;
        Drawable drawable = (Drawable) wVar.get();
        e a6 = n.a(dVar, drawable, i6, i7);
        if (a6 == null) {
            if (!this.f5929c) {
                return wVar;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        k1.w a7 = this.f5928b.a(gVar, a6, i6, i7);
        if (a7.equals(a6)) {
            a7.e();
            return wVar;
        }
        return new u(gVar.getResources(), a7);
    }

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        this.f5928b.b(messageDigest);
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f5928b.equals(((o) obj).f5928b);
        }
        return false;
    }

    @Override // i1.f
    public final int hashCode() {
        return this.f5928b.hashCode();
    }
}
