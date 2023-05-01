package r1;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import i1.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class c0<T> implements i1.j<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final i1.g<Long> f5887d = new i1.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final i1.g<Integer> f5888e = new i1.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f5889f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f5890a;

    /* renamed from: b  reason: collision with root package name */
    public final l1.d f5891b;

    /* renamed from: c  reason: collision with root package name */
    public final e f5892c = f5889f;

    /* loaded from: classes.dex */
    public class a implements g.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5893a = ByteBuffer.allocate(8);

        @Override // i1.g.b
        public final void a(byte[] bArr, Long l5, MessageDigest messageDigest) {
            Long l6 = l5;
            messageDigest.update(bArr);
            synchronized (this.f5893a) {
                this.f5893a.position(0);
                messageDigest.update(this.f5893a.putLong(l6.longValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements g.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5894a = ByteBuffer.allocate(4);

        @Override // i1.g.b
        public final void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 != null) {
                messageDigest.update(bArr);
                synchronized (this.f5894a) {
                    this.f5894a.position(0);
                    messageDigest.update(this.f5894a.putInt(num2.intValue()).array());
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        @Override // r1.c0.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {
        @Override // r1.c0.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new d0(byteBuffer));
        }
    }

    /* loaded from: classes.dex */
    public static class e {
    }

    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t5);
    }

    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // r1.c0.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public c0(l1.d dVar, f<T> fVar) {
        this.f5891b = dVar;
        this.f5890a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, r1.l r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L60
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L60
            if (r14 == r0) goto L60
            r1.l$f r0 = r1.l.f5912d
            if (r15 == r0) goto L60
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L51
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L51
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L51
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L51
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L51
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L51
            r3 = 90
            if (r2 == r3) goto L36
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L39
        L36:
            r8 = r1
            r1 = r0
            r0 = r8
        L39:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L51
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L51
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L51
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L51
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L51
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r1.b0.a(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L51
            goto L61
        L51:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L60
            java.lang.String r14 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r15, r14, r13)
        L60:
            r13 = 0
        L61:
            if (r13 != 0) goto L67
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L67:
            if (r13 == 0) goto L6a
            return r13
        L6a:
            r1.c0$h r9 = new r1.c0$h
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.c0.c(android.media.MediaMetadataRetriever, long, int, int, int, r1.l):android.graphics.Bitmap");
    }

    @Override // i1.j
    public final k1.w<Bitmap> a(T t5, int i6, int i7, i1.h hVar) {
        long longValue = ((Long) hVar.c(f5887d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) hVar.c(f5888e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) hVar.c(l.f5914f);
        if (lVar == null) {
            lVar = l.f5913e;
        }
        l lVar2 = lVar;
        this.f5892c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f5890a.a(mediaMetadataRetriever, t5);
            Bitmap c6 = c(mediaMetadataRetriever, longValue, num.intValue(), i6, i7, lVar2);
            mediaMetadataRetriever.release();
            return r1.e.b(c6, this.f5891b);
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    @Override // i1.j
    public final boolean b(T t5, i1.h hVar) {
        return true;
    }
}
