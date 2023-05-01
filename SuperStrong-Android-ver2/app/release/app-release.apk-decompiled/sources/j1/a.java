package j1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class a implements d<InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public final Uri f4674b;

    /* renamed from: c  reason: collision with root package name */
    public final c f4675c;

    /* renamed from: d  reason: collision with root package name */
    public InputStream f4676d;

    /* renamed from: j1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0051a implements j1.b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f4677b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f4678a;

        public C0051a(ContentResolver contentResolver) {
            this.f4678a = contentResolver;
        }

        @Override // j1.b
        public final Cursor a(Uri uri) {
            return this.f4678a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f4677b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements j1.b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f4679b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f4680a;

        public b(ContentResolver contentResolver) {
            this.f4680a = contentResolver;
        }

        @Override // j1.b
        public final Cursor a(Uri uri) {
            return this.f4680a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f4679b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f4674b = uri;
        this.f4675c = cVar;
    }

    public static a c(Context context, Uri uri, j1.b bVar) {
        return new a(uri, new c(com.bumptech.glide.b.b(context).f2794e.d(), bVar, com.bumptech.glide.b.b(context).f2795f, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f4676d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0025: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:10:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream d() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.a.d():java.io.InputStream");
    }

    @Override // com.bumptech.glide.load.data.d
    public final i1.a e() {
        return i1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(i iVar, d.a<? super InputStream> aVar) {
        try {
            InputStream d6 = d();
            this.f4676d = d6;
            aVar.d(d6);
        } catch (FileNotFoundException e6) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e6);
            }
            aVar.c(e6);
        }
    }
}
