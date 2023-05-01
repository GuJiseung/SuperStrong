package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f1365a;

        public a(ByteBuffer byteBuffer) {
            this.f1365a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long a() {
            return this.f1365a.getInt() & 4294967295L;
        }

        public final void b(int i6) {
            ByteBuffer byteBuffer = this.f1365a;
            byteBuffer.position(byteBuffer.position() + i6);
        }
    }

    public static o0.b a(MappedByteBuffer mappedByteBuffer) {
        ByteBuffer byteBuffer;
        long j5;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        a aVar = new a(duplicate);
        aVar.b(4);
        int i6 = duplicate.getShort() & 65535;
        if (i6 <= 100) {
            aVar.b(6);
            int i7 = 0;
            while (true) {
                byteBuffer = aVar.f1365a;
                if (i7 < i6) {
                    int i8 = byteBuffer.getInt();
                    aVar.b(4);
                    j5 = aVar.a();
                    aVar.b(4);
                    if (1835365473 == i8) {
                        break;
                    }
                    i7++;
                } else {
                    j5 = -1;
                    break;
                }
            }
            if (j5 != -1) {
                aVar.b((int) (j5 - duplicate.position()));
                aVar.b(12);
                long a6 = aVar.a();
                for (int i9 = 0; i9 < a6; i9++) {
                    int i10 = byteBuffer.getInt();
                    long a7 = aVar.a();
                    aVar.a();
                    if (1164798569 == i10 || 1701669481 == i10) {
                        duplicate.position((int) (a7 + j5));
                        o0.b bVar = new o0.b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        bVar.f5503b = duplicate;
                        bVar.f5502a = position;
                        int i11 = position - duplicate.getInt(position);
                        bVar.f5504c = i11;
                        bVar.f5505d = bVar.f5503b.getShort(i11);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
