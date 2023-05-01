package f5;

import java.nio.channels.WritableByteChannel;
/* loaded from: classes.dex */
public interface f extends x, WritableByteChannel {
    f A(long j5);

    e a();

    f d(long j5);

    @Override // f5.x, java.io.Flushable
    void flush();

    f g(h hVar);

    f write(byte[] bArr);

    f write(byte[] bArr, int i6, int i7);

    f writeByte(int i6);

    f writeInt(int i6);

    f writeShort(int i6);

    f z(String str);
}
