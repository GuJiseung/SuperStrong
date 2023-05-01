package o1;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o1.n;
/* loaded from: classes.dex */
public final class e<Data> implements n<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f5519a;

    /* loaded from: classes.dex */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f5520a;

        public a(d<Data> dVar) {
            this.f5520a = dVar;
        }

        @Override // o1.o
        public final n<File, Data> a(r rVar) {
            return new e(this.f5520a);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* loaded from: classes.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // o1.e.d
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // o1.e.d
            public final ParcelFileDescriptor b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // o1.e.d
            public final void c(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b  reason: collision with root package name */
        public final File f5521b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f5522c;

        /* renamed from: d  reason: collision with root package name */
        public Data f5523d;

        public c(File file, d<Data> dVar) {
            this.f5521b = file;
            this.f5522c = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f5522c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            Data data = this.f5523d;
            if (data != null) {
                try {
                    this.f5522c.c(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final i1.a e() {
            return i1.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public final void f(com.bumptech.glide.i iVar, d.a<? super Data> aVar) {
            try {
                Data b6 = this.f5522c.b(this.f5521b);
                this.f5523d = b6;
                aVar.d(b6);
            } catch (FileNotFoundException e6) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e6);
                }
                aVar.c(e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    /* renamed from: o1.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0071e extends a<InputStream> {

        /* renamed from: o1.e$e$a */
        /* loaded from: classes.dex */
        public class a implements d<InputStream> {
            @Override // o1.e.d
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // o1.e.d
            public final InputStream b(File file) {
                return new FileInputStream(file);
            }

            @Override // o1.e.d
            public final void c(InputStream inputStream) {
                inputStream.close();
            }
        }

        public C0071e() {
            super(new a());
        }
    }

    public e(d<Data> dVar) {
        this.f5519a = dVar;
    }

    @Override // o1.n
    public final n.a a(File file, int i6, int i7, i1.h hVar) {
        File file2 = file;
        return new n.a(new d2.d(file2), new c(file2, this.f5519a));
    }

    @Override // o1.n
    public final /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }
}
