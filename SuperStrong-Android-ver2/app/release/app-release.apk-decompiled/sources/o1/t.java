package o1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class t<Data> implements n<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f5578a;

    /* loaded from: classes.dex */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // o1.o
        public final n<String, AssetFileDescriptor> a(r rVar) {
            return new t(rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // o1.o
        public final n<String, ParcelFileDescriptor> a(r rVar) {
            return new t(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<String, InputStream> {
        @Override // o1.o
        public final n<String, InputStream> a(r rVar) {
            return new t(rVar.b(Uri.class, InputStream.class));
        }
    }

    public t(n<Uri, Data> nVar) {
        this.f5578a = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0.getScheme() == null) goto L16;
     */
    @Override // o1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o1.n.a a(java.lang.String r4, int r5, int r6, i1.h r7) {
        /*
            r3 = this;
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = r1
            goto L28
        Lb:
            r0 = 0
            char r0 = r4.charAt(r0)
            r2 = 47
            if (r0 != r2) goto L15
            goto L1f
        L15:
            android.net.Uri r0 = android.net.Uri.parse(r4)
            java.lang.String r2 = r0.getScheme()
            if (r2 != 0) goto L28
        L1f:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L28:
            if (r0 == 0) goto L37
            o1.n<android.net.Uri, Data> r4 = r3.f5578a
            boolean r2 = r4.b(r0)
            if (r2 != 0) goto L33
            goto L37
        L33:
            o1.n$a r1 = r4.a(r0, r5, r6, r7)
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.t.a(java.lang.Object, int, int, i1.h):o1.n$a");
    }

    @Override // o1.n
    public final /* bridge */ /* synthetic */ boolean b(String str) {
        return true;
    }
}
