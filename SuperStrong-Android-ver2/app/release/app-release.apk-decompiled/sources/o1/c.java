package o1;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o1.n;
/* loaded from: classes.dex */
public final class c implements n<File, ByteBuffer> {

    /* loaded from: classes.dex */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: b  reason: collision with root package name */
        public final File f5513b;

        public a(File file) {
            this.f5513b = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public final void f(com.bumptech.glide.i iVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(e2.a.a(this.f5513b));
            } catch (IOException e6) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e6);
                }
                aVar.c(e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<File, ByteBuffer> {
        @Override // o1.o
        public final n<File, ByteBuffer> a(r rVar) {
            return new c();
        }
    }

    @Override // o1.n
    public final n.a<ByteBuffer> a(File file, int i6, int i7, i1.h hVar) {
        File file2 = file;
        return new n.a<>(new d2.d(file2), new a(file2));
    }

    @Override // o1.n
    public final /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }
}
