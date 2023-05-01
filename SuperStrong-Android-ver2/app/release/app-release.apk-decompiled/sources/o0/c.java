package o0;

import a1.f0;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f5502a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f5503b;

    /* renamed from: c  reason: collision with root package name */
    public int f5504c;

    /* renamed from: d  reason: collision with root package name */
    public int f5505d;

    public c() {
        if (f0.f27e == null) {
            f0.f27e = new f0();
        }
    }

    public final int a(int i6) {
        if (i6 < this.f5505d) {
            return this.f5503b.getShort(this.f5504c + i6);
        }
        return 0;
    }
}
