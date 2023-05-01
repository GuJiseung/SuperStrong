package s1;

import androidx.activity.k;
import k1.w;
/* loaded from: classes.dex */
public final class b implements w<byte[]> {

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5985b;

    public b(byte[] bArr) {
        k.h(bArr);
        this.f5985b = bArr;
    }

    @Override // k1.w
    public final int c() {
        return this.f5985b.length;
    }

    @Override // k1.w
    public final Class<byte[]> d() {
        return byte[].class;
    }

    @Override // k1.w
    public final void e() {
    }

    @Override // k1.w
    public final byte[] get() {
        return this.f5985b;
    }
}
