package r1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class k implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5904a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5905b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5906a;

        public a(ByteBuffer byteBuffer) {
            this.f5906a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // r1.k.c
        public final short a() {
            ByteBuffer byteBuffer = this.f5906a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new c.a();
        }

        @Override // r1.k.c
        public final int b() {
            return (a() << 8) | a();
        }

        @Override // r1.k.c
        public final long skip(long j5) {
            ByteBuffer byteBuffer = this.f5906a;
            int min = (int) Math.min(byteBuffer.remaining(), j5);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5907a;

        public b(byte[] bArr, int i6) {
            this.f5907a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i6);
        }

        public final short a(int i6) {
            boolean z5;
            ByteBuffer byteBuffer = this.f5907a;
            if (byteBuffer.remaining() - i6 >= 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return byteBuffer.getShort(i6);
            }
            return (short) -1;
        }
    }

    /* loaded from: classes.dex */
    public interface c {

        /* loaded from: classes.dex */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        short a();

        int b();

        long skip(long j5);
    }

    /* loaded from: classes.dex */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f5908a;

        public d(InputStream inputStream) {
            this.f5908a = inputStream;
        }

        @Override // r1.k.c
        public final short a() {
            int read = this.f5908a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // r1.k.c
        public final int b() {
            return (a() << 8) | a();
        }

        public final int c(byte[] bArr, int i6) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i6 && (i8 = this.f5908a.read(bArr, i7, i6 - i7)) != -1) {
                i7 += i8;
            }
            if (i7 == 0 && i8 == -1) {
                throw new c.a();
            }
            return i7;
        }

        @Override // r1.k.c
        public final long skip(long j5) {
            if (j5 < 0) {
                return 0L;
            }
            long j6 = j5;
            while (j6 > 0) {
                InputStream inputStream = this.f5908a;
                long skip = inputStream.skip(j6);
                if (skip > 0) {
                    j6 -= skip;
                } else if (inputStream.read() == -1) {
                    break;
                } else {
                    j6--;
                }
            }
            return j5 - j6;
        }
    }

    public static ImageHeaderParser.ImageType d(c cVar) {
        try {
            int b6 = cVar.b();
            if (b6 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int a6 = (b6 << 8) | cVar.a();
            if (a6 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int a7 = (a6 << 8) | cVar.a();
            if (a7 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.a() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (a7 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                cVar.skip(4L);
                if (((cVar.b() << 16) | cVar.b()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int b7 = (cVar.b() << 16) | cVar.b();
                if ((b7 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i6 = b7 & 255;
                if (i6 == 88) {
                    cVar.skip(4L);
                    return (cVar.a() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i6 == 76) {
                    cVar.skip(4L);
                    return (cVar.a() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int e(d dVar) {
        short a6;
        short a7;
        int b6;
        long j5;
        long skip;
        do {
            if (dVar.a() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) a6));
                }
                return -1;
            }
            a7 = dVar.a();
            if (a7 == 218) {
                return -1;
            }
            if (a7 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            b6 = dVar.b() - 2;
            if (a7 == 225) {
                return b6;
            }
            j5 = b6;
            skip = dVar.skip(j5);
        } while (skip == j5);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) a7) + ", wanted to skip: " + b6 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public static int f(d dVar, byte[] bArr, int i6) {
        boolean z5;
        ByteOrder byteOrder;
        boolean z6;
        int i7;
        StringBuilder sb;
        String sb2;
        int i8;
        int c6 = dVar.c(bArr, i6);
        if (c6 != i6) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i6 + ", actually read: " + c6);
            }
            return -1;
        }
        short s = 1;
        byte[] bArr2 = f5904a;
        if (bArr != null && i6 > bArr2.length) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            int i9 = 0;
            while (true) {
                if (i9 >= bArr2.length) {
                    break;
                } else if (bArr[i9] != bArr2[i9]) {
                    z5 = false;
                    break;
                } else {
                    i9++;
                }
            }
        }
        if (z5) {
            b bVar = new b(bArr, i6);
            short a6 = bVar.a(6);
            if (a6 != 18761) {
                if (a6 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a6));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = bVar.f5907a;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                i7 = byteBuffer.getInt(10);
            } else {
                i7 = -1;
            }
            int i10 = i7 + 6;
            short a7 = bVar.a(i10);
            int i11 = 0;
            while (i11 < a7) {
                int i12 = (i11 * 12) + i10 + 2;
                short a8 = bVar.a(i12);
                if (a8 == 274) {
                    short a9 = bVar.a(i12 + 2);
                    if (a9 >= s && a9 <= 12) {
                        int i13 = i12 + 4;
                        if (byteBuffer.remaining() - i13 < 4) {
                            s = 0;
                        }
                        if (s != 0) {
                            i8 = byteBuffer.getInt(i13);
                        } else {
                            i8 = -1;
                        }
                        if (i8 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb2 = "Negative tiff component count";
                                Log.d("DfltImageHeaderParser", sb2);
                            }
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i11 + " tagType=" + ((int) a8) + " formatCode=" + ((int) a9) + " componentCount=" + i8);
                            }
                            int i14 = i8 + f5905b[a9];
                            if (i14 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb = new StringBuilder("Got byte count > 4, not orientation, continuing, formatCode=");
                                    sb.append((int) a9);
                                }
                            } else {
                                int i15 = i12 + 8;
                                if (i15 >= 0 && i15 <= byteBuffer.remaining()) {
                                    if (i14 >= 0 && i14 + i15 <= byteBuffer.remaining()) {
                                        return bVar.a(i15);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        sb = new StringBuilder("Illegal number of bytes for TI tag data tagType=");
                                        sb.append((int) a8);
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb = new StringBuilder("Illegal tagValueOffset=");
                                    sb.append(i15);
                                    sb.append(" tagType=");
                                    sb.append((int) a8);
                                }
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb = new StringBuilder("Got invalid format code = ");
                        sb.append((int) a9);
                    }
                    sb2 = sb.toString();
                    Log.d("DfltImageHeaderParser", sb2);
                }
                i11++;
                s = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        androidx.activity.k.h(byteBuffer);
        return d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(InputStream inputStream, l1.b bVar) {
        boolean z5;
        String str;
        androidx.activity.k.h(inputStream);
        d dVar = new d(inputStream);
        androidx.activity.k.h(bVar);
        try {
            int b6 = dVar.b();
            if ((b6 & 65496) != 65496 && b6 != 19789 && b6 != 18761) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                str = "Parser doesn't handle magic number: " + b6;
            } else {
                int e6 = e(dVar);
                if (e6 == -1) {
                    if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                        return -1;
                    }
                    str = "Failed to parse exif segment length, or exif segment not found";
                } else {
                    byte[] bArr = (byte[]) bVar.c(e6, byte[].class);
                    int f6 = f(dVar, bArr, e6);
                    bVar.put(bArr);
                    return f6;
                }
            }
            Log.d("DfltImageHeaderParser", str);
            return -1;
        } catch (c.a unused) {
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        androidx.activity.k.h(inputStream);
        return d(new d(inputStream));
    }
}
