package e2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<byte[]> f3807a = new AtomicReference<>();

    /* renamed from: e2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0035a extends InputStream {

        /* renamed from: b  reason: collision with root package name */
        public final ByteBuffer f3808b;

        /* renamed from: c  reason: collision with root package name */
        public int f3809c = -1;

        public C0035a(ByteBuffer byteBuffer) {
            this.f3808b = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f3808b.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i6) {
            this.f3809c = this.f3808b.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f3808b;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i6, int i7) {
            ByteBuffer byteBuffer = this.f3808b;
            if (byteBuffer.hasRemaining()) {
                int min = Math.min(i7, available());
                byteBuffer.get(bArr, i6, min);
                return min;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            int i6 = this.f3809c;
            if (i6 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f3808b.position(i6);
        }

        @Override // java.io.InputStream
        public final long skip(long j5) {
            ByteBuffer byteBuffer = this.f3808b;
            if (byteBuffer.hasRemaining()) {
                long min = Math.min(j5, available());
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
            }
            return -1L;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f3810a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3811b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f3812c;

        public b(byte[] bArr, int i6, int i7) {
            this.f3812c = bArr;
            this.f3810a = i6;
            this.f3811b = i7;
        }
    }

    public static MappedByteBuffer a(File file) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        fileChannel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return load;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    fileChannel2 = fileChannel;
                    th = th3;
                    if (fileChannel2 != null) {
                        try {
                            fileChannel2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileChannel = null;
            }
        } catch (Throwable th5) {
            th = th5;
            randomAccessFile = null;
        }
    }

    public static void b(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }
}
