package r1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* loaded from: classes.dex */
public final class u implements k1.w<BitmapDrawable>, k1.s {

    /* renamed from: b  reason: collision with root package name */
    public final Resources f5949b;

    /* renamed from: c  reason: collision with root package name */
    public final k1.w<Bitmap> f5950c;

    public u(Resources resources, k1.w<Bitmap> wVar) {
        androidx.activity.k.h(resources);
        this.f5949b = resources;
        androidx.activity.k.h(wVar);
        this.f5950c = wVar;
    }

    @Override // k1.s
    public final void a() {
        k1.w<Bitmap> wVar = this.f5950c;
        if (wVar instanceof k1.s) {
            ((k1.s) wVar).a();
        }
    }

    @Override // k1.w
    public final int c() {
        return this.f5950c.c();
    }

    @Override // k1.w
    public final Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // k1.w
    public final void e() {
        this.f5950c.e();
    }

    @Override // k1.w
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f5949b, this.f5950c.get());
    }
}
