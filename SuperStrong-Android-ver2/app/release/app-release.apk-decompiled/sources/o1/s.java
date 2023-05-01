package o1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import o1.n;
/* loaded from: classes.dex */
public final class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f5572a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f5573b;

    /* loaded from: classes.dex */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f5574a;

        public a(Resources resources) {
            this.f5574a = resources;
        }

        @Override // o1.o
        public final n<Integer, AssetFileDescriptor> a(r rVar) {
            return new s(this.f5574a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f5575a;

        public b(Resources resources) {
            this.f5575a = resources;
        }

        @Override // o1.o
        public final n<Integer, ParcelFileDescriptor> a(r rVar) {
            return new s(this.f5575a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f5576a;

        public c(Resources resources) {
            this.f5576a = resources;
        }

        @Override // o1.o
        public final n<Integer, InputStream> a(r rVar) {
            return new s(this.f5576a, rVar.b(Uri.class, InputStream.class));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f5577a;

        public d(Resources resources) {
            this.f5577a = resources;
        }

        @Override // o1.o
        public final n<Integer, Uri> a(r rVar) {
            return new s(this.f5577a, u.f5579a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f5573b = resources;
        this.f5572a = nVar;
    }

    @Override // o1.n
    public final n.a a(Integer num, int i6, int i7, i1.h hVar) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f5573b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e6) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e6);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f5572a.a(uri, i6, i7, hVar);
    }

    @Override // o1.n
    public final /* bridge */ /* synthetic */ boolean b(Integer num) {
        return true;
    }
}
