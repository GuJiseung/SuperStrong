package androidx.emoji2.text;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<o0.a> f1340d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f1341a;

    /* renamed from: b  reason: collision with root package name */
    public final n f1342b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1343c = 0;

    public i(n nVar, int i6) {
        this.f1342b = nVar;
        this.f1341a = i6;
    }

    public final int a(int i6) {
        o0.a c6 = c();
        int a6 = c6.a(16);
        if (a6 != 0) {
            ByteBuffer byteBuffer = c6.f5503b;
            int i7 = a6 + c6.f5502a;
            return byteBuffer.getInt((i6 * 4) + byteBuffer.getInt(i7) + i7 + 4);
        }
        return 0;
    }

    public final int b() {
        o0.a c6 = c();
        int a6 = c6.a(16);
        if (a6 != 0) {
            int i6 = a6 + c6.f5502a;
            return c6.f5503b.getInt(c6.f5503b.getInt(i6) + i6);
        }
        return 0;
    }

    public final o0.a c() {
        short s;
        ThreadLocal<o0.a> threadLocal = f1340d;
        o0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new o0.a();
            threadLocal.set(aVar);
        }
        o0.b bVar = this.f1342b.f1366a;
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i6 = a6 + bVar.f5502a;
            int i7 = (this.f1341a * 4) + bVar.f5503b.getInt(i6) + i6 + 4;
            int i8 = bVar.f5503b.getInt(i7) + i7;
            ByteBuffer byteBuffer = bVar.f5503b;
            aVar.f5503b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f5502a = i8;
                int i9 = i8 - byteBuffer.getInt(i8);
                aVar.f5504c = i9;
                s = aVar.f5503b.getShort(i9);
            } else {
                s = 0;
                aVar.f5502a = 0;
                aVar.f5504c = 0;
            }
            aVar.f5505d = s;
        }
        return aVar;
    }

    public final String toString() {
        int i6;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        o0.a c6 = c();
        int a6 = c6.a(4);
        if (a6 != 0) {
            i6 = c6.f5503b.getInt(a6 + c6.f5502a);
        } else {
            i6 = 0;
        }
        sb.append(Integer.toHexString(i6));
        sb.append(", codepoints:");
        int b6 = b();
        for (int i7 = 0; i7 < b6; i7++) {
            sb.append(Integer.toHexString(a(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
