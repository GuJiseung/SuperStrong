package o1;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import o1.n;
/* loaded from: classes.dex */
public final class d<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f5514a;

    /* loaded from: classes.dex */
    public interface a<Data> {
    }

    /* loaded from: classes.dex */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b  reason: collision with root package name */
        public final String f5515b;

        /* renamed from: c  reason: collision with root package name */
        public final a<Data> f5516c;

        /* renamed from: d  reason: collision with root package name */
        public ByteArrayInputStream f5517d;

        public b(String str, a<Data> aVar) {
            this.f5515b = str;
            this.f5516c = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            this.f5516c.getClass();
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            try {
                a<Data> aVar = this.f5516c;
                ByteArrayInputStream byteArrayInputStream = this.f5517d;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final i1.a e() {
            return i1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void f(com.bumptech.glide.i iVar, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a6 = ((c.a) this.f5516c).a(this.f5515b);
                this.f5517d = a6;
                aVar.d(a6);
            } catch (IllegalArgumentException e6) {
                aVar.c(e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a f5518a = new a();

        /* loaded from: classes.dex */
        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // o1.o
        public final n<Model, InputStream> a(r rVar) {
            return new d(this.f5518a);
        }
    }

    public d(c.a aVar) {
        this.f5514a = aVar;
    }

    @Override // o1.n
    public final n.a<Data> a(Model model, int i6, int i7, i1.h hVar) {
        return new n.a<>(new d2.d(model), new b(model.toString(), this.f5514a));
    }

    @Override // o1.n
    public final boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
