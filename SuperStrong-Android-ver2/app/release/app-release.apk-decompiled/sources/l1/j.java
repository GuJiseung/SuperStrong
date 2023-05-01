package l1;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f5090j = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final k f5091a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f5092b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5093c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5094d;

    /* renamed from: e  reason: collision with root package name */
    public long f5095e;

    /* renamed from: f  reason: collision with root package name */
    public int f5096f;

    /* renamed from: g  reason: collision with root package name */
    public int f5097g;

    /* renamed from: h  reason: collision with root package name */
    public int f5098h;

    /* renamed from: i  reason: collision with root package name */
    public int f5099i;

    /* loaded from: classes.dex */
    public static final class a {
    }

    public j(long j5) {
        Bitmap.Config config;
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i6 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i6 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f5094d = j5;
        this.f5091a = mVar;
        this.f5092b = unmodifiableSet;
        this.f5093c = new a();
    }

    @Override // l1.d
    @SuppressLint({"InlinedApi"})
    public final void a(int i6) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i6);
        }
        if (i6 >= 40 || i6 >= 20) {
            b();
        } else if (i6 >= 20 || i6 == 15) {
            h(this.f5094d / 2);
        }
    }

    @Override // l1.d
    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    @Override // l1.d
    public final Bitmap c(int i6, int i7, Bitmap.Config config) {
        Bitmap g2 = g(i6, i7, config);
        if (g2 == null) {
            if (config == null) {
                config = f5090j;
            }
            return Bitmap.createBitmap(i6, i7, config);
        }
        return g2;
    }

    @Override // l1.d
    public final Bitmap d(int i6, int i7, Bitmap.Config config) {
        Bitmap g2 = g(i6, i7, config);
        if (g2 != null) {
            g2.eraseColor(0);
            return g2;
        }
        if (config == null) {
            config = f5090j;
        }
        return Bitmap.createBitmap(i6, i7, config);
    }

    @Override // l1.d
    public final synchronized void e(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((m) this.f5091a).getClass();
                        if (e2.j.c(bitmap) <= this.f5094d && this.f5092b.contains(bitmap.getConfig())) {
                            ((m) this.f5091a).getClass();
                            int c6 = e2.j.c(bitmap);
                            ((m) this.f5091a).f(bitmap);
                            this.f5093c.getClass();
                            this.f5098h++;
                            this.f5095e += c6;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + ((m) this.f5091a).e(bitmap));
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                f();
                            }
                            h(this.f5094d);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((m) this.f5091a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f5092b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f() {
        Log.v("LruBitmapPool", "Hits=" + this.f5096f + ", misses=" + this.f5097g + ", puts=" + this.f5098h + ", evictions=" + this.f5099i + ", currentSize=" + this.f5095e + ", maxSize=" + this.f5094d + "\nStrategy=" + this.f5091a);
    }

    public final synchronized Bitmap g(int i6, int i7, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap b6;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            k kVar = this.f5091a;
            if (config != null) {
                config3 = config;
            } else {
                config3 = f5090j;
            }
            b6 = ((m) kVar).b(i6, i7, config3);
            if (b6 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    ((m) this.f5091a).getClass();
                    sb.append(m.c(e2.j.b(i6, i7, config), config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f5097g++;
            } else {
                this.f5096f++;
                long j5 = this.f5095e;
                ((m) this.f5091a).getClass();
                this.f5095e = j5 - e2.j.c(b6);
                this.f5093c.getClass();
                b6.setHasAlpha(true);
                b6.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                ((m) this.f5091a).getClass();
                sb2.append(m.c(e2.j.b(i6, i7, config), config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b6;
    }

    public final synchronized void h(long j5) {
        while (this.f5095e > j5) {
            m mVar = (m) this.f5091a;
            Bitmap c6 = mVar.f5106b.c();
            if (c6 != null) {
                mVar.a(Integer.valueOf(e2.j.c(c6)), c6);
            }
            if (c6 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    f();
                }
                this.f5095e = 0L;
                return;
            }
            this.f5093c.getClass();
            long j6 = this.f5095e;
            ((m) this.f5091a).getClass();
            this.f5095e = j6 - e2.j.c(c6);
            this.f5099i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((m) this.f5091a).e(c6));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
            c6.recycle();
        }
    }
}
