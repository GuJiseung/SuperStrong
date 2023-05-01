package r1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
/* loaded from: classes.dex */
public final class x implements i1.j<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final t1.d f5958a;

    /* renamed from: b  reason: collision with root package name */
    public final l1.d f5959b;

    public x(t1.d dVar, l1.d dVar2) {
        this.f5958a = dVar;
        this.f5959b = dVar2;
    }

    @Override // i1.j
    public final k1.w<Bitmap> a(Uri uri, int i6, int i7, i1.h hVar) {
        k1.w c6 = this.f5958a.c(uri);
        if (c6 == null) {
            return null;
        }
        return n.a(this.f5959b, (Drawable) ((t1.b) c6).get(), i6, i7);
    }

    @Override // i1.j
    public final boolean b(Uri uri, i1.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
