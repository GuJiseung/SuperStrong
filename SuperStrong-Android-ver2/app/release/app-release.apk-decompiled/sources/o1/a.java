package o1;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import o1.n;
/* loaded from: classes.dex */
public final class a<Data> implements n<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f5506a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0068a<Data> f5507b;

    /* renamed from: o1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0068a<Data> {
        com.bumptech.glide.load.data.d<Data> b(AssetManager assetManager, String str);
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0068a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f5508a;

        public b(AssetManager assetManager) {
            this.f5508a = assetManager;
        }

        @Override // o1.o
        public final n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new a(this.f5508a, this);
        }

        @Override // o1.a.InterfaceC0068a
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0068a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f5509a;

        public c(AssetManager assetManager) {
            this.f5509a = assetManager;
        }

        @Override // o1.o
        public final n<Uri, InputStream> a(r rVar) {
            return new a(this.f5509a, this);
        }

        @Override // o1.a.InterfaceC0068a
        public final com.bumptech.glide.load.data.d<InputStream> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.l(assetManager, str);
        }
    }

    public a(AssetManager assetManager, InterfaceC0068a<Data> interfaceC0068a) {
        this.f5506a = assetManager;
        this.f5507b = interfaceC0068a;
    }

    @Override // o1.n
    public final n.a a(Uri uri, int i6, int i7, i1.h hVar) {
        Uri uri2 = uri;
        return new n.a(new d2.d(uri2), this.f5507b.b(this.f5506a, uri2.toString().substring(22)));
    }

    @Override // o1.n
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        if (!"file".equals(uri2.getScheme()) || uri2.getPathSegments().isEmpty() || !"android_asset".equals(uri2.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
