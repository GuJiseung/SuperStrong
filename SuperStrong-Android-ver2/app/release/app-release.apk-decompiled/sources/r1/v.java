package r1;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import r1.s;
/* loaded from: classes.dex */
public final class v implements i1.j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f5951a;

    public v(m mVar) {
        this.f5951a = mVar;
    }

    @Override // i1.j
    public final k1.w<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i6, int i7, i1.h hVar) {
        m mVar = this.f5951a;
        return mVar.a(new s.b(parcelFileDescriptor, mVar.f5925d, mVar.f5924c), i6, i7, hVar, m.f5920j);
    }

    @Override // i1.j
    public final boolean b(ParcelFileDescriptor parcelFileDescriptor, i1.h hVar) {
        this.f5951a.getClass();
        return true;
    }
}
