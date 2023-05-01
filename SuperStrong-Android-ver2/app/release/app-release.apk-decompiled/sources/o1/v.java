package o1;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o1.n;
/* loaded from: classes.dex */
public final class v<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f5582b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f5583a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f5584a;

        public a(ContentResolver contentResolver) {
            this.f5584a = contentResolver;
        }

        @Override // o1.o
        public final n<Uri, AssetFileDescriptor> a(r rVar) {
            return new v(this);
        }

        @Override // o1.v.c
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f5584a, uri, 0);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f5585a;

        public b(ContentResolver contentResolver) {
            this.f5585a = contentResolver;
        }

        @Override // o1.o
        public final n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new v(this);
        }

        @Override // o1.v.c
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f5585a, uri, 1);
        }
    }

    /* loaded from: classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> b(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f5586a;

        public d(ContentResolver contentResolver) {
            this.f5586a = contentResolver;
        }

        @Override // o1.o
        public final n<Uri, InputStream> a(r rVar) {
            return new v(this);
        }

        @Override // o1.v.c
        public final com.bumptech.glide.load.data.d<InputStream> b(Uri uri) {
            return new com.bumptech.glide.load.data.m(this.f5586a, uri);
        }
    }

    public v(c<Data> cVar) {
        this.f5583a = cVar;
    }

    @Override // o1.n
    public final n.a a(Uri uri, int i6, int i7, i1.h hVar) {
        Uri uri2 = uri;
        return new n.a(new d2.d(uri2), this.f5583a.b(uri2));
    }

    @Override // o1.n
    public final boolean b(Uri uri) {
        return f5582b.contains(uri.getScheme());
    }
}
