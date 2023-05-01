package r1;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import q0.a;
/* loaded from: classes.dex */
public final class p implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(InputStream inputStream, l1.b bVar) {
        q0.a aVar = new q0.a(inputStream);
        a.c e6 = aVar.e("Orientation");
        int i6 = 1;
        if (e6 != null) {
            try {
                i6 = e6.f(aVar.f5774f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i6 == 0) {
            return -1;
        }
        return i6;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
