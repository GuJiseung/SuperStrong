package r1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public interface s {

    /* loaded from: classes.dex */
    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        public final com.bumptech.glide.load.data.j f5942a;

        /* renamed from: b  reason: collision with root package name */
        public final l1.b f5943b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f5944c;

        public a(l1.b bVar, InputStream inputStream, List list) {
            androidx.activity.k.h(bVar);
            this.f5943b = bVar;
            androidx.activity.k.h(list);
            this.f5944c = list;
            this.f5942a = new com.bumptech.glide.load.data.j(inputStream, bVar);
        }

        @Override // r1.s
        public final Bitmap a(BitmapFactory.Options options) {
            w wVar = this.f5942a.f2866a;
            wVar.reset();
            return BitmapFactory.decodeStream(wVar, null, options);
        }

        @Override // r1.s
        public final void b() {
            w wVar = this.f5942a.f2866a;
            synchronized (wVar) {
                wVar.f5954d = wVar.f5952b.length;
            }
        }

        @Override // r1.s
        public final int c() {
            w wVar = this.f5942a.f2866a;
            wVar.reset();
            return com.bumptech.glide.load.a.a(this.f5943b, wVar, this.f5944c);
        }

        @Override // r1.s
        public final ImageHeaderParser.ImageType d() {
            w wVar = this.f5942a.f2866a;
            wVar.reset();
            return com.bumptech.glide.load.a.b(this.f5943b, wVar, this.f5944c);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        public final l1.b f5945a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f5946b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f5947c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, l1.b bVar) {
            androidx.activity.k.h(bVar);
            this.f5945a = bVar;
            androidx.activity.k.h(list);
            this.f5946b = list;
            this.f5947c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // r1.s
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f5947c.a().getFileDescriptor(), null, options);
        }

        @Override // r1.s
        public final void b() {
        }

        @Override // r1.s
        public final int c() {
            w wVar;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f5947c;
            l1.b bVar = this.f5945a;
            List<ImageHeaderParser> list = this.f5946b;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ImageHeaderParser imageHeaderParser = list.get(i6);
                try {
                    wVar = new w(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                    try {
                        int b6 = imageHeaderParser.b(wVar, bVar);
                        try {
                            wVar.close();
                        } catch (IOException unused) {
                        }
                        parcelFileDescriptorRewinder.a();
                        if (b6 != -1) {
                            return b6;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (wVar != null) {
                            try {
                                wVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        parcelFileDescriptorRewinder.a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    wVar = null;
                }
            }
            return -1;
        }

        @Override // r1.s
        public final ImageHeaderParser.ImageType d() {
            w wVar;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f5947c;
            l1.b bVar = this.f5945a;
            List<ImageHeaderParser> list = this.f5946b;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ImageHeaderParser imageHeaderParser = list.get(i6);
                try {
                    wVar = new w(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                    try {
                        ImageHeaderParser.ImageType c6 = imageHeaderParser.c(wVar);
                        try {
                            wVar.close();
                        } catch (IOException unused) {
                        }
                        parcelFileDescriptorRewinder.a();
                        if (c6 != ImageHeaderParser.ImageType.UNKNOWN) {
                            return c6;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (wVar != null) {
                            try {
                                wVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        parcelFileDescriptorRewinder.a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    wVar = null;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
