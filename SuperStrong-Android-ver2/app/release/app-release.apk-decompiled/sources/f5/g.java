package f5;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
/* loaded from: classes.dex */
public interface g extends y, ReadableByteChannel {
    long C();

    InputStream D();

    @Deprecated
    e a();

    h e(long j5);

    int i(r rVar);

    String l();

    boolean m();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j5);

    String t(long j5);

    long v(e eVar);

    void y(long j5);
}
