package r1;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class d0 extends MediaDataSource {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f5896b;

    public d0(ByteBuffer byteBuffer) {
        this.f5896b = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f5896b.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j5, byte[] bArr, int i6, int i7) {
        ByteBuffer byteBuffer = this.f5896b;
        if (j5 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j5);
        int min = Math.min(i7, byteBuffer.remaining());
        byteBuffer.get(bArr, i6, min);
        return min;
    }
}
