package v1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import i1.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k1.w;
import v1.c;
/* loaded from: classes.dex */
public final class a implements j<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0097a f6271f = new C0097a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f6272g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f6273a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f6274b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6275c;

    /* renamed from: d  reason: collision with root package name */
    public final C0097a f6276d;

    /* renamed from: e  reason: collision with root package name */
    public final v1.b f6277e;

    /* renamed from: v1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0097a {
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f6278a;

        public b() {
            char[] cArr = e2.j.f3832a;
            this.f6278a = new ArrayDeque(0);
        }
    }

    public a(Context context, ArrayList arrayList, l1.d dVar, l1.b bVar) {
        C0097a c0097a = f6271f;
        this.f6273a = context.getApplicationContext();
        this.f6274b = arrayList;
        this.f6276d = c0097a;
        this.f6277e = new v1.b(dVar, bVar);
        this.f6275c = f6272g;
    }

    public static int d(h1.c cVar, int i6, int i7) {
        int highestOneBit;
        int min = Math.min(cVar.f4394g / i7, cVar.f4393f / i6);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i6 + "x" + i7 + "], actual dimens: [" + cVar.f4393f + "x" + cVar.f4394g + "]");
        }
        return max;
    }

    @Override // i1.j
    public final w<c> a(ByteBuffer byteBuffer, int i6, int i7, i1.h hVar) {
        h1.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f6275c;
        synchronized (bVar) {
            h1.d dVar2 = (h1.d) bVar.f6278a.poll();
            if (dVar2 == null) {
                dVar2 = new h1.d();
            }
            dVar = dVar2;
            dVar.f4400b = null;
            Arrays.fill(dVar.f4399a, (byte) 0);
            dVar.f4401c = new h1.c();
            dVar.f4402d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            dVar.f4400b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f4400b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            d c6 = c(byteBuffer2, i6, i7, dVar, hVar);
            b bVar2 = this.f6275c;
            synchronized (bVar2) {
                dVar.f4400b = null;
                dVar.f4401c = null;
                bVar2.f6278a.offer(dVar);
            }
            return c6;
        } catch (Throwable th) {
            b bVar3 = this.f6275c;
            synchronized (bVar3) {
                dVar.f4400b = null;
                dVar.f4401c = null;
                bVar3.f6278a.offer(dVar);
                throw th;
            }
        }
    }

    @Override // i1.j
    public final boolean b(ByteBuffer byteBuffer, i1.h hVar) {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) hVar.c(g.f6316b)).booleanValue()) {
            return false;
        }
        if (byteBuffer2 == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            List<ImageHeaderParser> list = this.f6274b;
            int size = list.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    ImageHeaderParser.ImageType a6 = list.get(i6).a(byteBuffer2);
                    if (a6 != ImageHeaderParser.ImageType.UNKNOWN) {
                        imageType = a6;
                        break;
                    }
                    i6++;
                } else {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
            }
        }
        if (imageType != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    public final d c(ByteBuffer byteBuffer, int i6, int i7, h1.d dVar, i1.h hVar) {
        Bitmap.Config config;
        int i8 = e2.f.f3822b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            h1.c b6 = dVar.b();
            if (b6.f4390c > 0 && b6.f4389b == 0) {
                if (hVar.c(g.f6315a) == i1.b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d6 = d(b6, i6, i7);
                C0097a c0097a = this.f6276d;
                v1.b bVar = this.f6277e;
                c0097a.getClass();
                h1.e eVar = new h1.e(bVar, b6, byteBuffer, d6);
                eVar.i(config);
                eVar.c();
                Bitmap b7 = eVar.b();
                if (b7 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + e2.f.a(elapsedRealtimeNanos));
                    }
                    return null;
                }
                return new d(new c(new c.a(new f(com.bumptech.glide.b.b(this.f6273a), eVar, i6, i7, q1.c.f5806b, b7))));
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + e2.f.a(elapsedRealtimeNanos));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + e2.f.a(elapsedRealtimeNanos));
            }
        }
    }
}
