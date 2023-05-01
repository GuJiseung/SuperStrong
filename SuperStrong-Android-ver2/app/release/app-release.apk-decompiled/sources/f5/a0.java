package f5;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f3965a = Charset.forName("UTF-8");

    public static void a(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7)));
        }
    }
}
