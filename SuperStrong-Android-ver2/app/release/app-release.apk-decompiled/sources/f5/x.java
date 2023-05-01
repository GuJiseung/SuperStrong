package f5;

import java.io.Closeable;
import java.io.Flushable;
/* loaded from: classes.dex */
public interface x extends Closeable, Flushable {
    z b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void u(e eVar, long j5);
}
