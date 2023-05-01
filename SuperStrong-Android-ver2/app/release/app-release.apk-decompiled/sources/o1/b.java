package o1;

import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o1.n;
/* loaded from: classes.dex */
public final class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0070b<Data> f5510a;

    /* loaded from: classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: o1.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0069a implements InterfaceC0070b<ByteBuffer> {
            @Override // o1.b.InterfaceC0070b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // o1.b.InterfaceC0070b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // o1.o
        public final n<byte[], ByteBuffer> a(r rVar) {
            return new b(new C0069a());
        }
    }

    /* renamed from: o1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0070b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* loaded from: classes.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f5511b;

        /* renamed from: c  reason: collision with root package name */
        public final InterfaceC0070b<Data> f5512c;

        public c(byte[] bArr, InterfaceC0070b<Data> interfaceC0070b) {
            this.f5511b = bArr;
            this.f5512c = interfaceC0070b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f5512c.a();
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
        public final void f(com.bumptech.glide.i iVar, d.a<? super Data> aVar) {
            aVar.d((Data) this.f5512c.b(this.f5511b));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* loaded from: classes.dex */
        public class a implements InterfaceC0070b<InputStream> {
            @Override // o1.b.InterfaceC0070b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // o1.b.InterfaceC0070b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // o1.o
        public final n<byte[], InputStream> a(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0070b<Data> interfaceC0070b) {
        this.f5510a = interfaceC0070b;
    }

    @Override // o1.n
    public final n.a a(byte[] bArr, int i6, int i7, i1.h hVar) {
        byte[] bArr2 = bArr;
        return new n.a(new d2.d(bArr2), new c(bArr2, this.f5510a));
    }

    @Override // o1.n
    public final /* bridge */ /* synthetic */ boolean b(byte[] bArr) {
        return true;
    }
}
