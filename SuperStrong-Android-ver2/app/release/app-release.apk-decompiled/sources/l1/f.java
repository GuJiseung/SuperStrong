package l1;
/* loaded from: classes.dex */
public final class f implements a<byte[]> {
    @Override // l1.a
    public final String a() {
        return "ByteArrayPool";
    }

    @Override // l1.a
    public final int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // l1.a
    public final int c() {
        return 1;
    }

    @Override // l1.a
    public final byte[] newArray(int i6) {
        return new byte[i6];
    }
}
