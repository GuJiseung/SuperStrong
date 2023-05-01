package r1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class t implements i1.j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f5948a = new d();

    @Override // i1.j
    public final k1.w<Bitmap> a(InputStream inputStream, int i6, int i7, i1.h hVar) {
        ImageDecoder.Source createSource;
        InputStream inputStream2 = inputStream;
        AtomicReference<byte[]> atomicReference = e2.a.f3807a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference2 = e2.a.f3807a;
        byte[] andSet = atomicReference2.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream2.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                atomicReference2.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                createSource = ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0));
                return this.f5948a.a(createSource, i6, i7, hVar);
            }
        }
    }

    @Override // i1.j
    public final /* bridge */ /* synthetic */ boolean b(InputStream inputStream, i1.h hVar) {
        return true;
    }
}
