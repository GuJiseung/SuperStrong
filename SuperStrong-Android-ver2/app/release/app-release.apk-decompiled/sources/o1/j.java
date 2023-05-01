package o1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import o1.n;
/* loaded from: classes.dex */
public final class j implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5537a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f5538a;

        public a(Context context) {
            this.f5538a = context;
        }

        @Override // o1.o
        public final n<Uri, File> a(r rVar) {
            return new j(this.f5538a);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: d  reason: collision with root package name */
        public static final String[] f5539d = {"_data"};

        /* renamed from: b  reason: collision with root package name */
        public final Context f5540b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f5541c;

        public b(Context context, Uri uri) {
            this.f5540b = context;
            this.f5541c = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final i1.a e() {
            return i1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void f(com.bumptech.glide.i iVar, d.a<? super File> aVar) {
            Cursor query = this.f5540b.getContentResolver().query(this.f5541c, f5539d, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.d(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f5541c));
        }
    }

    public j(Context context) {
        this.f5537a = context;
    }

    @Override // o1.n
    public final n.a<File> a(Uri uri, int i6, int i7, i1.h hVar) {
        Uri uri2 = uri;
        return new n.a<>(new d2.d(uri2), new b(this.f5537a, uri2));
    }

    @Override // o1.n
    public final boolean b(Uri uri) {
        return androidx.activity.k.l(uri);
    }
}
