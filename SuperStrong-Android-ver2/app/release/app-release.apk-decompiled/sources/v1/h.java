package v1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import i1.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k1.w;
/* loaded from: classes.dex */
public final class h implements j<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f6317a;

    /* renamed from: b  reason: collision with root package name */
    public final j<ByteBuffer, c> f6318b;

    /* renamed from: c  reason: collision with root package name */
    public final l1.b f6319c;

    public h(ArrayList arrayList, a aVar, l1.b bVar) {
        this.f6317a = arrayList;
        this.f6318b = aVar;
        this.f6319c = bVar;
    }

    @Override // i1.j
    public final w<c> a(InputStream inputStream, int i6, int i7, i1.h hVar) {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e6) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e6);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f6318b.a(ByteBuffer.wrap(bArr), i6, i7, hVar);
    }

    @Override // i1.j
    public final boolean b(InputStream inputStream, i1.h hVar) {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) hVar.c(g.f6316b)).booleanValue()) {
            if (com.bumptech.glide.load.a.b(this.f6319c, inputStream2, this.f6317a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
