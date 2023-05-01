package b5;

import java.io.IOException;
/* loaded from: classes.dex */
public final class v extends IOException {

    /* renamed from: b  reason: collision with root package name */
    public final int f2638b;

    public v(int i6) {
        super("stream was reset: ".concat(b.e(i6)));
        this.f2638b = i6;
    }
}
