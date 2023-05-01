package r1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* loaded from: classes.dex */
public final class a<DataType> implements i1.j<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final i1.j<DataType, Bitmap> f5879a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f5880b;

    public a(Resources resources, i1.j<DataType, Bitmap> jVar) {
        this.f5880b = resources;
        this.f5879a = jVar;
    }

    @Override // i1.j
    public final k1.w<BitmapDrawable> a(DataType datatype, int i6, int i7, i1.h hVar) {
        k1.w<Bitmap> a6 = this.f5879a.a(datatype, i6, i7, hVar);
        if (a6 == null) {
            return null;
        }
        return new u(this.f5880b, a6);
    }

    @Override // i1.j
    public final boolean b(DataType datatype, i1.h hVar) {
        return this.f5879a.b(datatype, hVar);
    }
}
