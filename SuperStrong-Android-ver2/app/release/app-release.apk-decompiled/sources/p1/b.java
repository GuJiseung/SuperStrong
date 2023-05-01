package p1;

import android.content.Context;
import android.net.Uri;
import androidx.activity.k;
import i1.h;
import j1.a;
import java.io.InputStream;
import o1.n;
import o1.o;
import o1.r;
/* loaded from: classes.dex */
public final class b implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5711a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f5712a;

        public a(Context context) {
            this.f5712a = context;
        }

        @Override // o1.o
        public final n<Uri, InputStream> a(r rVar) {
            return new b(this.f5712a);
        }
    }

    public b(Context context) {
        this.f5711a = context.getApplicationContext();
    }

    @Override // o1.n
    public final n.a<InputStream> a(Uri uri, int i6, int i7, h hVar) {
        boolean z5;
        Uri uri2 = uri;
        if (i6 != Integer.MIN_VALUE && i7 != Integer.MIN_VALUE && i6 <= 512 && i7 <= 384) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            d2.d dVar = new d2.d(uri2);
            Context context = this.f5711a;
            return new n.a<>(dVar, j1.a.c(context, uri2, new a.C0051a(context.getContentResolver())));
        }
        return null;
    }

    @Override // o1.n
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        if (k.l(uri2) && !uri2.getPathSegments().contains("video")) {
            return true;
        }
        return false;
    }
}
