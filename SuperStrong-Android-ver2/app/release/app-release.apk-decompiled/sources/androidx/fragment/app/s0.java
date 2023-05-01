package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
/* loaded from: classes.dex */
public final class s0 extends Writer {

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f1640c = new StringBuilder(128);

    /* renamed from: b  reason: collision with root package name */
    public final String f1639b = "FragmentManager";

    public final void c() {
        StringBuilder sb = this.f1640c;
        if (sb.length() > 0) {
            Log.d(this.f1639b, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        c();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i6, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            char c6 = cArr[i6 + i8];
            if (c6 == '\n') {
                c();
            } else {
                this.f1640c.append(c6);
            }
        }
    }
}
