package r1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class h implements i1.j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f5901a = new d();

    @Override // i1.j
    public final k1.w<Bitmap> a(ByteBuffer byteBuffer, int i6, int i7, i1.h hVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f5901a.a(createSource, i6, i7, hVar);
    }

    @Override // i1.j
    public final /* bridge */ /* synthetic */ boolean b(ByteBuffer byteBuffer, i1.h hVar) {
        return true;
    }
}
