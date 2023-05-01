package w1;

import android.graphics.Bitmap;
import i1.h;
import java.io.ByteArrayOutputStream;
import k1.w;
/* loaded from: classes.dex */
public final class a implements b<Bitmap, byte[]> {

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap.CompressFormat f6574b = Bitmap.CompressFormat.JPEG;

    /* renamed from: c  reason: collision with root package name */
    public final int f6575c = 100;

    @Override // w1.b
    public final w<byte[]> a(w<Bitmap> wVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.f6574b, this.f6575c, byteArrayOutputStream);
        wVar.e();
        return new s1.b(byteArrayOutputStream.toByteArray());
    }
}
