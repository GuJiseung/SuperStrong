package r1;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;
import r1.l;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final i1.g<i1.b> f5916f = i1.g.a(i1.b.PREFER_ARGB_8888, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g  reason: collision with root package name */
    public static final i1.g<i1.i> f5917g = i1.g.a(i1.i.SRGB, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h  reason: collision with root package name */
    public static final i1.g<Boolean> f5918h;

    /* renamed from: i  reason: collision with root package name */
    public static final i1.g<Boolean> f5919i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f5920j;

    /* renamed from: k  reason: collision with root package name */
    public static final ArrayDeque f5921k;

    /* renamed from: a  reason: collision with root package name */
    public final l1.d f5922a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f5923b;

    /* renamed from: c  reason: collision with root package name */
    public final l1.b f5924c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f5925d;

    /* renamed from: e  reason: collision with root package name */
    public final r f5926e;

    /* loaded from: classes.dex */
    public class a implements b {
        @Override // r1.m.b
        public final void a(Bitmap bitmap, l1.d dVar) {
        }

        @Override // r1.m.b
        public final void b() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Bitmap bitmap, l1.d dVar);

        void b();
    }

    static {
        l.e eVar = l.f5909a;
        Boolean bool = Boolean.FALSE;
        f5918h = i1.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f5919i = i1.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f5920j = new a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = e2.j.f3832a;
        f5921k = new ArrayDeque(0);
    }

    public m(ArrayList arrayList, DisplayMetrics displayMetrics, l1.d dVar, l1.b bVar) {
        if (r.f5934j == null) {
            synchronized (r.class) {
                if (r.f5934j == null) {
                    r.f5934j = new r();
                }
            }
        }
        this.f5926e = r.f5934j;
        this.f5925d = arrayList;
        androidx.activity.k.h(displayMetrics);
        this.f5923b = displayMetrics;
        androidx.activity.k.h(dVar);
        this.f5922a = dVar;
        androidx.activity.k.h(bVar);
        this.f5924c = bVar;
    }

    public static Bitmap c(s sVar, BitmapFactory.Options options, b bVar, l1.d dVar) {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            sVar.b();
        }
        int i6 = options.outWidth;
        int i7 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = z.f5965b;
        lock.lock();
        try {
            try {
                Bitmap a6 = sVar.a(options);
                lock.unlock();
                return a6;
            } catch (IllegalArgumentException e6) {
                IOException e7 = e(e6, i6, i7, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", e7);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        dVar.e(bitmap);
                        options.inBitmap = null;
                        Bitmap c6 = c(sVar, options, bVar, dVar);
                        z.f5965b.unlock();
                        return c6;
                    } catch (IOException unused) {
                        throw e7;
                    }
                }
                throw e7;
            }
        } catch (Throwable th) {
            z.f5965b.unlock();
            throw th;
        }
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i6, int i7, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i6 + ", outHeight: " + i7 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final e a(s sVar, int i6, int i7, i1.h hVar, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z5;
        byte[] bArr = (byte[]) this.f5924c.c(65536, byte[].class);
        synchronized (m.class) {
            arrayDeque = f5921k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        i1.b bVar2 = (i1.b) hVar.c(f5916f);
        i1.i iVar = (i1.i) hVar.c(f5917g);
        l lVar = (l) hVar.c(l.f5914f);
        boolean booleanValue = ((Boolean) hVar.c(f5918h)).booleanValue();
        i1.g<Boolean> gVar = f5919i;
        if (hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue()) {
            z5 = true;
        } else {
            z5 = false;
        }
        try {
            e b6 = e.b(b(sVar, options2, lVar, bVar2, iVar, z5, i6, i7, booleanValue, bVar), this.f5922a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f5924c.put(bArr);
            return b6;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = f5921k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f5924c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(r1.s r41, android.graphics.BitmapFactory.Options r42, r1.l r43, i1.b r44, i1.i r45, boolean r46, int r47, int r48, boolean r49, r1.m.b r50) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.m.b(r1.s, android.graphics.BitmapFactory$Options, r1.l, i1.b, i1.i, boolean, int, int, boolean, r1.m$b):android.graphics.Bitmap");
    }
}
