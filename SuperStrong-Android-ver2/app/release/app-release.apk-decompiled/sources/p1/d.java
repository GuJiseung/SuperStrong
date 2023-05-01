package p1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.activity.k;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.d;
import i1.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o1.n;
import o1.o;
import o1.r;
/* loaded from: classes.dex */
public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5715a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f5716b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f5717c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f5718d;

    /* loaded from: classes.dex */
    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f5719a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f5720b;

        public a(Context context, Class<DataT> cls) {
            this.f5719a = context;
            this.f5720b = cls;
        }

        @Override // o1.o
        public final n<Uri, DataT> a(r rVar) {
            Class<DataT> cls = this.f5720b;
            return new d(this.f5719a, rVar.b(File.class, cls), rVar.b(Uri.class, cls), cls);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: p1.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0076d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: l  reason: collision with root package name */
        public static final String[] f5721l = {"_data"};

        /* renamed from: b  reason: collision with root package name */
        public final Context f5722b;

        /* renamed from: c  reason: collision with root package name */
        public final n<File, DataT> f5723c;

        /* renamed from: d  reason: collision with root package name */
        public final n<Uri, DataT> f5724d;

        /* renamed from: e  reason: collision with root package name */
        public final Uri f5725e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5726f;

        /* renamed from: g  reason: collision with root package name */
        public final int f5727g;

        /* renamed from: h  reason: collision with root package name */
        public final h f5728h;

        /* renamed from: i  reason: collision with root package name */
        public final Class<DataT> f5729i;

        /* renamed from: j  reason: collision with root package name */
        public volatile boolean f5730j;

        /* renamed from: k  reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f5731k;

        public C0076d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i6, int i7, h hVar, Class<DataT> cls) {
            this.f5722b = context.getApplicationContext();
            this.f5723c = nVar;
            this.f5724d = nVar2;
            this.f5725e = uri;
            this.f5726f = i6;
            this.f5727g = i7;
            this.f5728h = hVar;
            this.f5729i = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<DataT> a() {
            return this.f5729i;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f5731k;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final com.bumptech.glide.load.data.d<DataT> c() {
            boolean isExternalStorageLegacy;
            boolean z5;
            n.a<DataT> a6;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            h hVar = this.f5728h;
            int i6 = this.f5727g;
            int i7 = this.f5726f;
            Context context = this.f5722b;
            if (isExternalStorageLegacy) {
                Uri uri = this.f5725e;
                try {
                    Cursor query = context.getContentResolver().query(uri, f5721l, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    a6 = this.f5723c.a(file, i7, i6, hVar);
                                } else {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Uri uri2 = this.f5725e;
                if (z5) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                a6 = this.f5724d.a(uri2, i7, i6, hVar);
            }
            if (a6 == null) {
                return null;
            }
            return a6.f5549c;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f5730j = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f5731k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final i1.a e() {
            return i1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void f(i iVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c6 = c();
                if (c6 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f5725e));
                    return;
                }
                this.f5731k = c6;
                if (this.f5730j) {
                    cancel();
                } else {
                    c6.f(iVar, aVar);
                }
            } catch (FileNotFoundException e6) {
                aVar.c(e6);
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f5715a = context.getApplicationContext();
        this.f5716b = nVar;
        this.f5717c = nVar2;
        this.f5718d = cls;
    }

    @Override // o1.n
    public final n.a a(Uri uri, int i6, int i7, h hVar) {
        Uri uri2 = uri;
        return new n.a(new d2.d(uri2), new C0076d(this.f5715a, this.f5716b, this.f5717c, uri2, i6, i7, hVar, this.f5718d));
    }

    @Override // o1.n
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        if (Build.VERSION.SDK_INT >= 29 && k.l(uri2)) {
            return true;
        }
        return false;
    }
}
