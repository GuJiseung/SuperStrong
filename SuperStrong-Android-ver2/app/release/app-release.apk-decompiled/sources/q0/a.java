package q0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.activity.j;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* loaded from: classes.dex */
public final class a {
    public static final byte[] A;
    public static final byte[] B;
    public static final String[] C;
    public static final int[] D;
    public static final byte[] E;
    public static final d F;
    public static final d[][] G;
    public static final d[] H;
    public static final HashMap<Integer, d>[] I;
    public static final HashMap<String, d>[] J;
    public static final HashSet<String> K;
    public static final HashMap<Integer, Integer> L;
    public static final Charset M;
    public static final byte[] N;
    public static final byte[] O;

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f5757m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f5758n;

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f5759o;

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f5760p;

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f5761q;

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f5762r;
    public static final byte[] s;

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f5763t;
    public static final byte[] u;

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f5764v;

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f5765w;

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f5766x;

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f5767y;

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f5768z;

    /* renamed from: a  reason: collision with root package name */
    public final FileDescriptor f5769a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager.AssetInputStream f5770b;

    /* renamed from: c  reason: collision with root package name */
    public int f5771c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, c>[] f5772d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f5773e;

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f5774f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5775g;

    /* renamed from: h  reason: collision with root package name */
    public int f5776h;

    /* renamed from: i  reason: collision with root package name */
    public int f5777i;

    /* renamed from: j  reason: collision with root package name */
    public int f5778j;

    /* renamed from: k  reason: collision with root package name */
    public int f5779k;

    /* renamed from: l  reason: collision with root package name */
    public int f5780l;

    /* renamed from: q0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0079a extends MediaDataSource {

        /* renamed from: b  reason: collision with root package name */
        public long f5781b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f5782c;

        public C0079a(b bVar) {
            this.f5782c = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j5, byte[] bArr, int i6, int i7) {
            if (i7 == 0) {
                return 0;
            }
            if (j5 < 0) {
                return -1;
            }
            try {
                long j6 = this.f5781b;
                int i8 = (j6 > j5 ? 1 : (j6 == j5 ? 0 : -1));
                b bVar = this.f5782c;
                if (i8 != 0) {
                    if (j6 >= 0 && j5 >= j6 + bVar.available()) {
                        return -1;
                    }
                    bVar.c(j5);
                    this.f5781b = j5;
                }
                if (i7 > bVar.available()) {
                    i7 = bVar.available();
                }
                int read = bVar.read(bArr, i6, i7);
                if (read >= 0) {
                    this.f5781b += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f5781b = -1L;
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: f  reason: collision with root package name */
        public static final ByteOrder f5783f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g  reason: collision with root package name */
        public static final ByteOrder f5784g = ByteOrder.BIG_ENDIAN;

        /* renamed from: b  reason: collision with root package name */
        public final DataInputStream f5785b;

        /* renamed from: c  reason: collision with root package name */
        public ByteOrder f5786c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5787d;

        /* renamed from: e  reason: collision with root package name */
        public int f5788e;

        public b(InputStream inputStream) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f5786c = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f5785b = dataInputStream;
            int available = dataInputStream.available();
            this.f5787d = available;
            this.f5788e = 0;
            dataInputStream.mark(available);
            this.f5786c = byteOrder;
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f5785b.available();
        }

        public final void c(long j5) {
            int i6 = this.f5788e;
            if (i6 > j5) {
                this.f5788e = 0;
                DataInputStream dataInputStream = this.f5785b;
                dataInputStream.reset();
                dataInputStream.mark(this.f5787d);
            } else {
                j5 -= i6;
            }
            int i7 = (int) j5;
            if (skipBytes(i7) != i7) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f5788e++;
            return this.f5785b.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i6, int i7) {
            int read = this.f5785b.read(bArr, i6, i7);
            this.f5788e += read;
            return read;
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f5788e++;
            return this.f5785b.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            int i6 = this.f5788e + 1;
            this.f5788e = i6;
            if (i6 <= this.f5787d) {
                int read = this.f5785b.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f5788e += 2;
            return this.f5785b.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            int length = this.f5788e + bArr.length;
            this.f5788e = length;
            if (length > this.f5787d) {
                throw new EOFException();
            }
            if (this.f5785b.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i6, int i7) {
            int i8 = this.f5788e + i7;
            this.f5788e = i8;
            if (i8 > this.f5787d) {
                throw new EOFException();
            }
            if (this.f5785b.read(bArr, i6, i7) != i7) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final int readInt() {
            int i6 = this.f5788e + 4;
            this.f5788e = i6;
            if (i6 <= this.f5787d) {
                DataInputStream dataInputStream = this.f5785b;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                int read3 = dataInputStream.read();
                int read4 = dataInputStream.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f5786c;
                    if (byteOrder == f5783f) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f5784g) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f5786c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            int i6 = this.f5788e + 8;
            this.f5788e = i6;
            if (i6 <= this.f5787d) {
                DataInputStream dataInputStream = this.f5785b;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                int read3 = dataInputStream.read();
                int read4 = dataInputStream.read();
                int read5 = dataInputStream.read();
                int read6 = dataInputStream.read();
                int read7 = dataInputStream.read();
                int read8 = dataInputStream.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f5786c;
                    if (byteOrder == f5783f) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f5784g) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f5786c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final short readShort() {
            int i6 = this.f5788e + 2;
            this.f5788e = i6;
            if (i6 <= this.f5787d) {
                DataInputStream dataInputStream = this.f5785b;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f5786c;
                    if (byteOrder == f5783f) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f5784g) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f5786c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f5788e += 2;
            return this.f5785b.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f5788e++;
            return this.f5785b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            int i6 = this.f5788e + 2;
            this.f5788e = i6;
            if (i6 <= this.f5787d) {
                DataInputStream dataInputStream = this.f5785b;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f5786c;
                    if (byteOrder == f5783f) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f5784g) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f5786c);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i6) {
            int min = Math.min(i6, this.f5787d - this.f5788e);
            int i7 = 0;
            while (i7 < min) {
                i7 += this.f5785b.skipBytes(min - i7);
            }
            this.f5788e += i7;
            return i7;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5789a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5790b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f5791c;

        public c(byte[] bArr, int i6, int i7) {
            this(bArr, i6, i7, 0);
        }

        public c(byte[] bArr, int i6, int i7, int i8) {
            this.f5789a = i6;
            this.f5790b = i7;
            this.f5791c = bArr;
        }

        public static c a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(a.M);
            return new c(bytes, 2, bytes.length, 0);
        }

        public static c b(long j5, ByteOrder byteOrder) {
            long[] jArr = {j5};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.D[4] * 1]);
            wrap.order(byteOrder);
            wrap.putInt((int) jArr[0]);
            return new c(wrap.array(), 4, 1);
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.D[5] * 1]);
            wrap.order(byteOrder);
            e eVar2 = eVarArr[0];
            wrap.putInt((int) eVar2.f5796a);
            wrap.putInt((int) eVar2.f5797b);
            return new c(wrap.array(), 5, 1);
        }

        public static c d(int i6, ByteOrder byteOrder) {
            int[] iArr = {i6};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.D[3] * 1]);
            wrap.order(byteOrder);
            wrap.putShort((short) iArr[0]);
            return new c(wrap.array(), 3, 1);
        }

        public final double e(ByteOrder byteOrder) {
            Serializable h6 = h(byteOrder);
            if (h6 != null) {
                if (h6 instanceof String) {
                    return Double.parseDouble((String) h6);
                }
                if (h6 instanceof long[]) {
                    long[] jArr = (long[]) h6;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h6 instanceof int[]) {
                    int[] iArr = (int[]) h6;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h6 instanceof double[]) {
                    double[] dArr = (double[]) h6;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h6 instanceof e[]) {
                    e[] eVarArr = (e[]) h6;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return eVar.f5796a / eVar.f5797b;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public final int f(ByteOrder byteOrder) {
            Serializable h6 = h(byteOrder);
            if (h6 != null) {
                if (h6 instanceof String) {
                    return Integer.parseInt((String) h6);
                }
                if (h6 instanceof long[]) {
                    long[] jArr = (long[]) h6;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h6 instanceof int[]) {
                    int[] iArr = (int[]) h6;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public final String g(ByteOrder byteOrder) {
            Serializable h6 = h(byteOrder);
            if (h6 == null) {
                return null;
            }
            if (h6 instanceof String) {
                return (String) h6;
            }
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            if (h6 instanceof long[]) {
                long[] jArr = (long[]) h6;
                while (i6 < jArr.length) {
                    sb.append(jArr[i6]);
                    i6++;
                    if (i6 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h6 instanceof int[]) {
                int[] iArr = (int[]) h6;
                while (i6 < iArr.length) {
                    sb.append(iArr[i6]);
                    i6++;
                    if (i6 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h6 instanceof double[]) {
                double[] dArr = (double[]) h6;
                while (i6 < dArr.length) {
                    sb.append(dArr[i6]);
                    i6++;
                    if (i6 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h6 instanceof e[]) {
                e[] eVarArr = (e[]) h6;
                while (i6 < eVarArr.length) {
                    sb.append(eVarArr[i6].f5796a);
                    sb.append('/');
                    sb.append(eVarArr[i6].f5797b);
                    i6++;
                    if (i6 != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:89|(3:91|(2:92|(1:101)(2:94|(2:97|98)(1:96)))|(1:100))|102|(2:104|(6:113|114|115|116|117|118)(3:106|(2:108|109)(2:111|112)|110))|122|115|116|117|118) */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x012a, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x012b, code lost:
            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0167: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:132:0x0167 */
        /* JADX WARN: Removed duplicated region for block: B:174:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v25, types: [q0.a$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [q0.a$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.io.Serializable h(java.nio.ByteOrder r15) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.a.c.h(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            return "(" + a.C[this.f5789a] + ", data length:" + this.f5791c.length + ")";
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f5792a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5793b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5794c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5795d;

        public d(int i6, int i7, String str) {
            this.f5793b = str;
            this.f5792a = i6;
            this.f5794c = i7;
            this.f5795d = -1;
        }

        public d(int i6, String str) {
            this.f5793b = str;
            this.f5792a = i6;
            this.f5794c = 3;
            this.f5795d = 4;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f5796a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5797b;

        public e(long j5, long j6) {
            if (j6 == 0) {
                this.f5796a = 0L;
                this.f5797b = 1L;
                return;
            }
            this.f5796a = j5;
            this.f5797b = j6;
        }

        public final String toString() {
            return this.f5796a + "/" + this.f5797b;
        }
    }

    static {
        d[] dVarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f5758n = new int[]{8, 8, 8};
        f5759o = new int[]{8};
        f5760p = new byte[]{-1, -40, -1};
        f5761q = new byte[]{102, 116, 121, 112};
        f5762r = new byte[]{109, 105, 102, 49};
        s = new byte[]{104, 101, 105, 99};
        f5763t = new byte[]{79, 76, 89, 77, 80, 0};
        u = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f5764v = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f5765w = new byte[]{101, 88, 73, 102};
        f5766x = new byte[]{73, 72, 68, 82};
        f5767y = new byte[]{73, 69, 78, 68};
        f5768z = new byte[]{82, 73, 70, 70};
        A = new byte[]{87, 69, 66, 80};
        B = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        C = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        D = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        E = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr2 = {new d(254, 4, "NewSubfileType"), new d(255, 4, "SubfileType"), new d(256, "ImageWidth"), new d(257, "ImageLength"), new d(258, 3, "BitsPerSample"), new d(259, 3, "Compression"), new d(262, 3, "PhotometricInterpretation"), new d(270, 2, "ImageDescription"), new d(271, 2, "Make"), new d(272, 2, "Model"), new d(273, "StripOffsets"), new d(274, 3, "Orientation"), new d(277, 3, "SamplesPerPixel"), new d(278, "RowsPerStrip"), new d(279, "StripByteCounts"), new d(282, 5, "XResolution"), new d(283, 5, "YResolution"), new d(284, 3, "PlanarConfiguration"), new d(296, 3, "ResolutionUnit"), new d(301, 3, "TransferFunction"), new d(305, 2, "Software"), new d(306, 2, "DateTime"), new d(315, 2, "Artist"), new d(318, 5, "WhitePoint"), new d(319, 5, "PrimaryChromaticities"), new d(330, 4, "SubIFDPointer"), new d(513, 4, "JPEGInterchangeFormat"), new d(514, 4, "JPEGInterchangeFormatLength"), new d(529, 5, "YCbCrCoefficients"), new d(530, 3, "YCbCrSubSampling"), new d(531, 3, "YCbCrPositioning"), new d(532, 5, "ReferenceBlackWhite"), new d(33432, 2, "Copyright"), new d(34665, 4, "ExifIFDPointer"), new d(34853, 4, "GPSInfoIFDPointer"), new d(4, 4, "SensorTopBorder"), new d(5, 4, "SensorLeftBorder"), new d(6, 4, "SensorBottomBorder"), new d(7, 4, "SensorRightBorder"), new d(23, 3, "ISO"), new d(46, 7, "JpgFromRaw"), new d(700, 1, "Xmp")};
        d[] dVarArr3 = {new d(33434, 5, "ExposureTime"), new d(33437, 5, "FNumber"), new d(34850, 3, "ExposureProgram"), new d(34852, 2, "SpectralSensitivity"), new d(34855, 3, "PhotographicSensitivity"), new d(34856, 7, "OECF"), new d(34864, 3, "SensitivityType"), new d(34865, 4, "StandardOutputSensitivity"), new d(34866, 4, "RecommendedExposureIndex"), new d(34867, 4, "ISOSpeed"), new d(34868, 4, "ISOSpeedLatitudeyyy"), new d(34869, 4, "ISOSpeedLatitudezzz"), new d(36864, 2, "ExifVersion"), new d(36867, 2, "DateTimeOriginal"), new d(36868, 2, "DateTimeDigitized"), new d(36880, 2, "OffsetTime"), new d(36881, 2, "OffsetTimeOriginal"), new d(36882, 2, "OffsetTimeDigitized"), new d(37121, 7, "ComponentsConfiguration"), new d(37122, 5, "CompressedBitsPerPixel"), new d(37377, 10, "ShutterSpeedValue"), new d(37378, 5, "ApertureValue"), new d(37379, 10, "BrightnessValue"), new d(37380, 10, "ExposureBiasValue"), new d(37381, 5, "MaxApertureValue"), new d(37382, 5, "SubjectDistance"), new d(37383, 3, "MeteringMode"), new d(37384, 3, "LightSource"), new d(37385, 3, "Flash"), new d(37386, 5, "FocalLength"), new d(37396, 3, "SubjectArea"), new d(37500, 7, "MakerNote"), new d(37510, 7, "UserComment"), new d(37520, 2, "SubSecTime"), new d(37521, 2, "SubSecTimeOriginal"), new d(37522, 2, "SubSecTimeDigitized"), new d(40960, 7, "FlashpixVersion"), new d(40961, 3, "ColorSpace"), new d(40962, "PixelXDimension"), new d(40963, "PixelYDimension"), new d(40964, 2, "RelatedSoundFile"), new d(40965, 4, "InteroperabilityIFDPointer"), new d(41483, 5, "FlashEnergy"), new d(41484, 7, "SpatialFrequencyResponse"), new d(41486, 5, "FocalPlaneXResolution"), new d(41487, 5, "FocalPlaneYResolution"), new d(41488, 3, "FocalPlaneResolutionUnit"), new d(41492, 3, "SubjectLocation"), new d(41493, 5, "ExposureIndex"), new d(41495, 3, "SensingMethod"), new d(41728, 7, "FileSource"), new d(41729, 7, "SceneType"), new d(41730, 7, "CFAPattern"), new d(41985, 3, "CustomRendered"), new d(41986, 3, "ExposureMode"), new d(41987, 3, "WhiteBalance"), new d(41988, 5, "DigitalZoomRatio"), new d(41989, 3, "FocalLengthIn35mmFilm"), new d(41990, 3, "SceneCaptureType"), new d(41991, 3, "GainControl"), new d(41992, 3, "Contrast"), new d(41993, 3, "Saturation"), new d(41994, 3, "Sharpness"), new d(41995, 7, "DeviceSettingDescription"), new d(41996, 3, "SubjectDistanceRange"), new d(42016, 2, "ImageUniqueID"), new d(42032, 2, "CameraOwnerName"), new d(42033, 2, "BodySerialNumber"), new d(42034, 5, "LensSpecification"), new d(42035, 2, "LensMake"), new d(42036, 2, "LensModel"), new d(42240, 5, "Gamma"), new d(50706, 1, "DNGVersion"), new d(50720, "DefaultCropSize")};
        d[] dVarArr4 = {new d(0, 1, "GPSVersionID"), new d(1, 2, "GPSLatitudeRef"), new d(2, 5, "GPSLatitude"), new d(3, 2, "GPSLongitudeRef"), new d(4, 5, "GPSLongitude"), new d(5, 1, "GPSAltitudeRef"), new d(6, 5, "GPSAltitude"), new d(7, 5, "GPSTimeStamp"), new d(8, 2, "GPSSatellites"), new d(9, 2, "GPSStatus"), new d(10, 2, "GPSMeasureMode"), new d(11, 5, "GPSDOP"), new d(12, 2, "GPSSpeedRef"), new d(13, 5, "GPSSpeed"), new d(14, 2, "GPSTrackRef"), new d(15, 5, "GPSTrack"), new d(16, 2, "GPSImgDirectionRef"), new d(17, 5, "GPSImgDirection"), new d(18, 2, "GPSMapDatum"), new d(19, 2, "GPSDestLatitudeRef"), new d(20, 5, "GPSDestLatitude"), new d(21, 2, "GPSDestLongitudeRef"), new d(22, 5, "GPSDestLongitude"), new d(23, 2, "GPSDestBearingRef"), new d(24, 5, "GPSDestBearing"), new d(25, 2, "GPSDestDistanceRef"), new d(26, 5, "GPSDestDistance"), new d(27, 7, "GPSProcessingMethod"), new d(28, 7, "GPSAreaInformation"), new d(29, 2, "GPSDateStamp"), new d(30, 3, "GPSDifferential"), new d(31, 5, "GPSHPositioningError")};
        d[] dVarArr5 = {new d(1, 2, "InteroperabilityIndex")};
        d[] dVarArr6 = {new d(254, 4, "NewSubfileType"), new d(255, 4, "SubfileType"), new d(256, "ThumbnailImageWidth"), new d(257, "ThumbnailImageLength"), new d(258, 3, "BitsPerSample"), new d(259, 3, "Compression"), new d(262, 3, "PhotometricInterpretation"), new d(270, 2, "ImageDescription"), new d(271, 2, "Make"), new d(272, 2, "Model"), new d(273, "StripOffsets"), new d(274, 3, "ThumbnailOrientation"), new d(277, 3, "SamplesPerPixel"), new d(278, "RowsPerStrip"), new d(279, "StripByteCounts"), new d(282, 5, "XResolution"), new d(283, 5, "YResolution"), new d(284, 3, "PlanarConfiguration"), new d(296, 3, "ResolutionUnit"), new d(301, 3, "TransferFunction"), new d(305, 2, "Software"), new d(306, 2, "DateTime"), new d(315, 2, "Artist"), new d(318, 5, "WhitePoint"), new d(319, 5, "PrimaryChromaticities"), new d(330, 4, "SubIFDPointer"), new d(513, 4, "JPEGInterchangeFormat"), new d(514, 4, "JPEGInterchangeFormatLength"), new d(529, 5, "YCbCrCoefficients"), new d(530, 3, "YCbCrSubSampling"), new d(531, 3, "YCbCrPositioning"), new d(532, 5, "ReferenceBlackWhite"), new d(33432, 2, "Copyright"), new d(34665, 4, "ExifIFDPointer"), new d(34853, 4, "GPSInfoIFDPointer"), new d(50706, 1, "DNGVersion"), new d(50720, "DefaultCropSize")};
        F = new d(273, 3, "StripOffsets");
        G = new d[][]{dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr6, dVarArr2, new d[]{new d(256, 7, "ThumbnailImage"), new d(8224, 4, "CameraSettingsIFDPointer"), new d(8256, 4, "ImageProcessingIFDPointer")}, new d[]{new d(257, 4, "PreviewImageStart"), new d(258, 4, "PreviewImageLength")}, new d[]{new d(4371, 3, "AspectFrame")}, new d[]{new d(55, 3, "ColorSpace")}};
        H = new d[]{new d(330, 4, "SubIFDPointer"), new d(34665, 4, "ExifIFDPointer"), new d(34853, 4, "GPSInfoIFDPointer"), new d(40965, 4, "InteroperabilityIFDPointer"), new d(8224, 1, "CameraSettingsIFDPointer"), new d(8256, 1, "ImageProcessingIFDPointer")};
        I = new HashMap[10];
        J = new HashMap[10];
        K = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        L = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        M = forName;
        N = "Exif\u0000\u0000".getBytes(forName);
        O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i6 = 0;
        while (true) {
            d[][] dVarArr7 = G;
            if (i6 >= dVarArr7.length) {
                HashMap<Integer, Integer> hashMap = L;
                d[] dVarArr8 = H;
                hashMap.put(Integer.valueOf(dVarArr8[0].f5792a), 5);
                hashMap.put(Integer.valueOf(dVarArr8[1].f5792a), 1);
                hashMap.put(Integer.valueOf(dVarArr8[2].f5792a), 2);
                hashMap.put(Integer.valueOf(dVarArr8[3].f5792a), 3);
                hashMap.put(Integer.valueOf(dVarArr8[4].f5792a), 7);
                hashMap.put(Integer.valueOf(dVarArr8[5].f5792a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            I[i6] = new HashMap<>();
            J[i6] = new HashMap<>();
            for (d dVar : dVarArr7[i6]) {
                I[i6].put(Integer.valueOf(dVar.f5792a), dVar);
                J[i6].put(dVar.f5793b, dVar);
            }
            i6++;
        }
    }

    public a(InputStream inputStream) {
        boolean z5;
        d[][] dVarArr = G;
        this.f5772d = new HashMap[dVarArr.length];
        this.f5773e = new HashSet(dVarArr.length);
        this.f5774f = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            boolean z6 = inputStream instanceof AssetManager.AssetInputStream;
            FileDescriptor fileDescriptor = null;
            boolean z7 = f5757m;
            if (z6) {
                this.f5770b = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        z5 = true;
                    } catch (Exception unused) {
                        if (z7) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z5 = false;
                    }
                    if (z5) {
                        this.f5770b = null;
                        fileDescriptor = fileInputStream.getFD();
                    }
                }
                this.f5770b = null;
            }
            this.f5769a = fileDescriptor;
            for (int i6 = 0; i6 < dVarArr.length; i6++) {
                try {
                    try {
                        this.f5772d[i6] = new HashMap<>();
                    } catch (Throwable th) {
                        a();
                        if (z7) {
                            r();
                        }
                        throw th;
                    }
                } catch (IOException e6) {
                    if (z7) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e6);
                    }
                    a();
                    if (!z7) {
                        return;
                    }
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f5771c = h(bufferedInputStream);
            b bVar = new b(bufferedInputStream);
            switch (this.f5771c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    l(bVar);
                    break;
                case 4:
                    g(bVar, 0, 0);
                    break;
                case 7:
                    i(bVar);
                    break;
                case 9:
                    k(bVar);
                    break;
                case 10:
                    m(bVar);
                    break;
                case 12:
                    f(bVar);
                    break;
                case 13:
                    j(bVar);
                    break;
                case 14:
                    n(bVar);
                    break;
            }
            v(bVar);
            a();
            if (!z7) {
                return;
            }
            r();
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i6 = 0; i6 < bArr.length; i6++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i6])));
        }
        return sb.toString();
    }

    public static long[] c(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            jArr[i6] = iArr[i6];
        }
        return jArr;
    }

    public static ByteOrder s(b bVar) {
        short readShort = bVar.readShort();
        boolean z5 = f5757m;
        if (readShort == 18761) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    public final void a() {
        String d6 = d("DateTimeOriginal");
        HashMap<String, c>[] hashMapArr = this.f5772d;
        if (d6 != null && d("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.a(d6));
        }
        if (d("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.b(0L, this.f5774f));
        }
        if (d("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.b(0L, this.f5774f));
        }
        if (d("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.b(0L, this.f5774f));
        }
        if (d("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.b(0L, this.f5774f));
        }
    }

    public final String d(String str) {
        String str2;
        c e6 = e(str);
        if (e6 != null) {
            if (!K.contains(str)) {
                return e6.g(this.f5774f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i6 = e6.f5789a;
                if (i6 != 5 && i6 != 10) {
                    str2 = j.a("GPS Timestamp format is not rational. format=", i6);
                } else {
                    e[] eVarArr = (e[]) e6.h(this.f5774f);
                    if (eVarArr != null && eVarArr.length == 3) {
                        e eVar = eVarArr[0];
                        e eVar2 = eVarArr[1];
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVar.f5796a) / ((float) eVar.f5797b))), Integer.valueOf((int) (((float) eVar2.f5796a) / ((float) eVar2.f5797b))), Integer.valueOf((int) (((float) eVar3.f5796a) / ((float) eVar3.f5797b))));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr);
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(e6.e(this.f5774f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f5757m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i6 = 0; i6 < G.length; i6++) {
            c cVar = this.f5772d[i6].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void f(b bVar) {
        String str;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0079a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            HashMap<String, c>[] hashMapArr = this.f5772d;
            if (str != null) {
                hashMapArr[0].put("ImageWidth", c.d(Integer.parseInt(str), this.f5774f));
            }
            if (str2 != null) {
                hashMapArr[0].put("ImageLength", c.d(Integer.parseInt(str2), this.f5774f));
            }
            if (str3 != null) {
                int parseInt = Integer.parseInt(str3);
                hashMapArr[0].put("Orientation", c.d(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f5774f));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                bVar.c(parseInt2);
                byte[] bArr = new byte[6];
                if (bVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i6 = parseInt2 + 6;
                int i7 = parseInt3 - 6;
                if (!Arrays.equals(bArr, N)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i7];
                if (bVar.read(bArr2) != i7) {
                    throw new IOException("Can't read exif");
                }
                this.f5776h = i6;
                t(bArr2, 0);
            }
            if (f5757m) {
                Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a0, code lost:
        r17.f5786c = r16.f5774f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a4, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(q0.a.b r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.g(q0.a$b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cf, code lost:
        if (r8 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.h(java.io.BufferedInputStream):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(q0.a.b r7) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.i(q0.a$b):void");
    }

    public final void j(b bVar) {
        if (f5757m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f5786c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f5764v;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i6 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i7 = i6 + 4;
                    if (i7 == 16 && !Arrays.equals(bArr2, f5766x)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f5767y)) {
                        if (Arrays.equals(bArr2, f5765w)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f5776h = i7;
                                    t(bArr3, 0);
                                    y();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i8 = readInt + 4;
                        bVar.skipBytes(i8);
                        length = i7 + i8;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void k(b bVar) {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i6 = ByteBuffer.wrap(bArr).getInt();
        int i7 = ByteBuffer.wrap(bArr2).getInt();
        g(bVar, i6, 5);
        bVar.c(i7);
        bVar.f5786c = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        boolean z5 = f5757m;
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i8 = 0; i8 < readInt; i8++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == F.f5792a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d6 = c.d(readShort, this.f5774f);
                c d7 = c.d(readShort2, this.f5774f);
                HashMap<String, c>[] hashMapArr = this.f5772d;
                hashMapArr[0].put("ImageLength", d6);
                hashMapArr[0].put("ImageWidth", d7);
                if (z5) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void l(b bVar) {
        q(bVar, bVar.available());
        u(bVar, 0);
        x(bVar, 0);
        x(bVar, 5);
        x(bVar, 4);
        y();
        if (this.f5771c == 8) {
            HashMap<String, c>[] hashMapArr = this.f5772d;
            c cVar = hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                b bVar2 = new b(cVar.f5791c);
                bVar2.f5786c = this.f5774f;
                bVar2.c(6L);
                u(bVar2, 9);
                c cVar2 = hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void m(b bVar) {
        l(bVar);
        HashMap<String, c>[] hashMapArr = this.f5772d;
        if (hashMapArr[0].get("JpgFromRaw") != null) {
            g(bVar, this.f5780l, 5);
        }
        c cVar = hashMapArr[0].get("ISO");
        c cVar2 = hashMapArr[1].get("PhotographicSensitivity");
        if (cVar == null || cVar2 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar);
    }

    public final void n(b bVar) {
        if (f5757m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f5786c = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(f5768z.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(A.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i6 = skipBytes + 4 + 4;
                    if (Arrays.equals(B, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f5776h = i6;
                            t(bArr2, 0);
                            this.f5776h = i6;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i7 = i6 + readInt2;
                    if (i7 == readInt) {
                        return;
                    }
                    if (i7 <= readInt) {
                        int skipBytes2 = bVar.skipBytes(readInt2);
                        if (skipBytes2 == readInt2) {
                            skipBytes = i6 + skipBytes2;
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void o(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f6 = cVar.f(this.f5774f);
            int f7 = cVar2.f(this.f5774f);
            if (this.f5771c == 7) {
                f6 += this.f5777i;
            }
            int min = Math.min(f7, bVar.f5787d - f6);
            if (f6 > 0 && min > 0) {
                int i6 = this.f5776h + f6;
                if (this.f5770b == null && this.f5769a == null) {
                    bVar.c(i6);
                    bVar.readFully(new byte[min]);
                }
            }
            if (f5757m) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f6 + ", length: " + min);
            }
        }
    }

    public final boolean p(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.f(this.f5774f) <= 512 && cVar2.f(this.f5774f) <= 512;
    }

    public final void q(b bVar, int i6) {
        ByteOrder s5 = s(bVar);
        this.f5774f = s5;
        bVar.f5786c = s5;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i7 = this.f5771c;
        if (i7 != 7 && i7 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8 && readInt < i6) {
            int i8 = readInt - 8;
            if (i8 > 0 && bVar.skipBytes(i8) != i8) {
                throw new IOException(j.a("Couldn't jump to first Ifd: ", i8));
            }
            return;
        }
        throw new IOException(j.a("Invalid first Ifd offset: ", readInt));
    }

    public final void r() {
        int i6 = 0;
        while (true) {
            HashMap<String, c>[] hashMapArr = this.f5772d;
            if (i6 >= hashMapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i6 + "]: " + hashMapArr[i6].size());
            for (Map.Entry<String, c> entry : hashMapArr[i6].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.g(this.f5774f) + "'");
            }
            i6++;
        }
    }

    public final void t(byte[] bArr, int i6) {
        b bVar = new b(bArr);
        q(bVar, bArr.length);
        u(bVar, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(q0.a.b r30, int r31) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.u(q0.a$b, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(q0.a.b r18) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.v(q0.a$b):void");
    }

    public final void w(int i6, int i7) {
        String str;
        HashMap<String, c>[] hashMapArr = this.f5772d;
        boolean isEmpty = hashMapArr[i6].isEmpty();
        boolean z5 = f5757m;
        if (isEmpty || hashMapArr[i7].isEmpty()) {
            if (z5) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = hashMapArr[i6].get("ImageLength");
        c cVar2 = hashMapArr[i6].get("ImageWidth");
        c cVar3 = hashMapArr[i7].get("ImageLength");
        c cVar4 = hashMapArr[i7].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (!z5) {
                return;
            }
            str = "First image does not contain valid size information";
        } else if (cVar3 != null && cVar4 != null) {
            int f6 = cVar.f(this.f5774f);
            int f7 = cVar2.f(this.f5774f);
            int f8 = cVar3.f(this.f5774f);
            int f9 = cVar4.f(this.f5774f);
            if (f6 >= f8 || f7 >= f9) {
                return;
            }
            HashMap<String, c> hashMap = hashMapArr[i6];
            hashMapArr[i6] = hashMapArr[i7];
            hashMapArr[i7] = hashMap;
            return;
        } else if (!z5) {
            return;
        } else {
            str = "Second image does not contain valid size information";
        }
        Log.d("ExifInterface", str);
    }

    public final void x(b bVar, int i6) {
        c cVar;
        StringBuilder sb;
        String arrays;
        c d6;
        c d7;
        HashMap<String, c>[] hashMapArr = this.f5772d;
        c cVar2 = hashMapArr[i6].get("DefaultCropSize");
        c cVar3 = hashMapArr[i6].get("SensorTopBorder");
        c cVar4 = hashMapArr[i6].get("SensorLeftBorder");
        c cVar5 = hashMapArr[i6].get("SensorBottomBorder");
        c cVar6 = hashMapArr[i6].get("SensorRightBorder");
        if (cVar2 != null) {
            if (cVar2.f5789a == 5) {
                e[] eVarArr = (e[]) cVar2.h(this.f5774f);
                if (eVarArr != null && eVarArr.length == 2) {
                    d6 = c.c(eVarArr[0], this.f5774f);
                    d7 = c.c(eVarArr[1], this.f5774f);
                    hashMapArr[i6].put("ImageWidth", d6);
                    hashMapArr[i6].put("ImageLength", d7);
                    return;
                }
                sb = new StringBuilder("Invalid crop size values. cropSize=");
                arrays = Arrays.toString(eVarArr);
                sb.append(arrays);
                Log.w("ExifInterface", sb.toString());
            }
            int[] iArr = (int[]) cVar2.h(this.f5774f);
            if (iArr != null && iArr.length == 2) {
                d6 = c.d(iArr[0], this.f5774f);
                d7 = c.d(iArr[1], this.f5774f);
                hashMapArr[i6].put("ImageWidth", d6);
                hashMapArr[i6].put("ImageLength", d7);
                return;
            }
            sb = new StringBuilder("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(iArr);
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        } else if (cVar3 != null && cVar4 != null && cVar5 != null && cVar6 != null) {
            int f6 = cVar3.f(this.f5774f);
            int f7 = cVar5.f(this.f5774f);
            int f8 = cVar6.f(this.f5774f);
            int f9 = cVar4.f(this.f5774f);
            if (f7 > f6 && f8 > f9) {
                c d8 = c.d(f7 - f6, this.f5774f);
                c d9 = c.d(f8 - f9, this.f5774f);
                hashMapArr[i6].put("ImageLength", d8);
                hashMapArr[i6].put("ImageWidth", d9);
            }
        } else {
            c cVar7 = hashMapArr[i6].get("ImageLength");
            c cVar8 = hashMapArr[i6].get("ImageWidth");
            if ((cVar7 == null || cVar8 == null) && (cVar = hashMapArr[i6].get("JPEGInterchangeFormat")) != null) {
                g(bVar, cVar.f(this.f5774f), i6);
            }
        }
    }

    public final void y() {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap<String, c>[] hashMapArr = this.f5772d;
        c cVar = hashMapArr[1].get("PixelXDimension");
        c cVar2 = hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (p(hashMapArr[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }
}
